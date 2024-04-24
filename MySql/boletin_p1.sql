/*************************************************************************/
/* 7.3.10. Para los departamentos en los que algún empleado tiene comisión,
hallar cuántos empleados con comisión hay en promedio por cada
extensión telefónica.*/
select extensionEmpleado, avg(comisionEmpleado)as mediaComision, count(idEmpleado) as empleadosTotales
from empleados
where comisionEmpleado > 0
group by extensionEmpleado
order by mediaComision desc;
-- Empleados que tienen comisión--
select idEmpleado, nombreEmpleado, comisionEmpleado
from empleados e
where comisionEmpleado >0;
-- número de empleados por extension y por departamento que tienen una comisión--
select idDepartamentoFK, count(*) as numEmpleados, e.extensionEmpleado 
from empleados e
where comisionEmpleado >0
group by idDepartamentoFK, e.extensionEmpleado;
-- numero de empleados totales--
select idDepartamentoFK, count(*) as numEmpleados, e.extensionEmpleado 
from empleados e
group by idDepartamentoFK, e.extensionEmpleado;
-- consulta final--
select departamentosExtensionT.numEmpleados, departamentosExtensionC.numEmpleados
from (select idDepartamentoFK, count(*) as numEmpleados, e.extensionEmpleado 
from empleados e
group by idDepartamentoFK, e.extensionEmpleado) departamentosExtensionT
inner join (select idDepartamentoFK, count(*) as numEmpleados, e.extensionEmpleado 
from empleados e
where comisionEmpleado >0
group by idDepartamentoFK, e.extensionEmpleado) departamentosExtensionC
on departamentosExtensionT.idDepartamentoFK = departamentosExtensionC.idDepartamentoFK
and  departamentosExtensionT.extensionEmpleado = departamentosExtensionC.extensionEmpleado
/*7.3.11. Obtener por orden creciente los números de extensiones
* telefónicas de los departamentos que tienen más de dos y que
* son compartidas por menos de 4 empleados, excluyendo las que
* no son compartidas.*/
select d.nombreDepartamento, e.extensionEmpleado, count(e.idEmpleado) as totalEmpleados
from empleados e
inner join departamentos d on d.idDepartamento = e.idDepartamentoFK
group by e.idDepartamentoFK
having totalEmpleados >= 2 and totalEmpleados <= 4
order by e.extensionEmpleado asc;
/*7.3.12. Para los departamentos cuyo salario medio supera al de la
* empresa, hallar cuántas extensiones telefónicas tienen.*/
/******************** EN CLASE ********************/
-- empresa, departamento y luego la linea
select idDepartamentoFK from empleados e
group by idDepartamentoFK
having avg(salarioEmpleado) > (select avg(e2.salarioEmpleado) from empleados e2);
-- subconsulta con consulta unida
select idDepartamentoFK, count(distinct extensionEmpleado)
from empleados e
where idDepartamentoFK in (select idDepartamentoFK from empleados e
group by idDepartamentoFK
having avg(salarioEmpleado) > (select avg(e2.salarioEmpleado)
from empleados e2))
group by idDepartamentoFK
/*********************************************************/
-- sub consulta media de salarios
select avg(e.salarioEmpleado) as mediaSalarioDepartamento
from empleados e
group by idDepartamentoFK;
-- consulta completa
select d.nombreDepartamento , count(e1.extensionEmpleado) as numeroExtensiones
from empleados e1
inner join departamentos d on d.idDepartamento = e1.idDepartamentoFK
where e1.salarioEmpleado > (select avg(e2.salarioEmpleado) as mediaSalarioDepartamento
from empleados e2
where e1.idDepartamentoFK = e2.idDepartamentoFK
group by idDepartamentoFK)
group by e1.idDepartamentoFK;
/*7.3.13. Para cada centro, hallar los presupuestos medios de los
* departamentos dirigidos en propiedad y en funciones,
* excluyendo del resultado el número del centro.*/
select d.nombreDepartamento, avg(d.presupuestosDepartamento) as mediaPresupuesto, c.nombreCentroTrabajo
from departamentos d
inner join centrostrabajo c on c.idCentroTrabajo = d.idCentroTrabajoFK
group by d.idDepartamento;
/******************** EN CLASE ********************/
select concat(avg(presupuestosDepartamento)*1000000, ' €') as mediaPresupuesto
from departamentos d
group by idCentroTrabajoFK, tipoDirectorDepartamento
order by mediaPresupuesto asc;
/* concat para unir tablas de manera literal*/
/*7.3.14. Hallar el máximo valor de la suma de los
* salarios de los departamentos.*/
select d.nombreDepartamento, max(e.salarioEmpleado) as maxSalario
from departamentos d
inner join empleados e on e.idEmpleado = d.idEmpleadoFk
group by d.idDepartamento;
/*8.31. Hallar,por orden alfabético, los nombres de los
* departamentos cuyo presupuesto medio
* por empleado supera a la media de sus salarios.*/
/************** ANOTACION: intuyo que se refiere
* el presupuesto a la cantidad de personas en el departamento*/
select avg(e.salarioEmpleado) as mediaEmpleados, d.nombreDepartamento
from empleados e
inner join departamentos d on e.idEmpleado = d.idEmpleadoFk
group by d.idDepartamento;
/*8.32. Para los empleados que trabajan en la calle de Atocha
* y comparten su extensión telefónica con otro con menos
* salario que ellos, hallar la suma de sus salarios por
*  departamento y el nombre de éste, por orden alfabético.*/
select d.nombreDepartamento, sum(e.salarioEmpleado) as sumaSalarios
from empleados e
inner join departamentos d on e.idDepartamentoFK = d.idDepartamento
inner join centrostrabajo c on c.idCentroTrabajo = d.idCentroTrabajoFK
where c.direccionCentrotrabajo like 'C/ ATOCHA%'
and e.extensionEmpleado in (select extensionEmpleado
from empleados
where salarioEmpleado < e.salarioEmpleado)
group by d.nombreDepartamento
order by d.nombreDepartamento asc;
/*8.33. Hallar, por orden alfabético, los nombres de
* los empleados que comparten su extensión
* telefónica con otro de otro centro.*/
select extensionEmpleado, nombreEmpleado
from empleados e
inner join departamentos d on e.idDepartamentoFK  = d.idDepartamento 
group by extensionEmpleado
having count(extensionEmpleado) > 1
and count(distinct idCentroTrabajoFK) > 1
order by nombreEmpleado asc;
/*8.34. Hallar cuántos empleados hay que compartan su extensión
* telefónica con otro departamento.*/
select count(idEmpleado) as mismaExtension, nombreDepartamento
from empleados e
inner join departamentos d on d.idDepartamento = e.idDepartamentoFK
group by extensionEmpleado
/*8.35. Hallar, por orden alfabético, los nombres de los
* empleados que disfrutan de una extensión telefónica no
* compartida con otros. Hallar también para cada uno de ellos su
* salario y el salario medio de su departamento, excluyéndoles a ellos.*/
/*8.36. Hallar,por orden alfabético, los nombres y salarios
* de los empleados cuyo salario supera a la media de
* salarios de los que ingresaron 2 años antes o después que él, excluyéndole.*/
