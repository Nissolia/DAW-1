/***************************************************/
/* 1. Tras unas acciones de gran importancia y en
* celebración de sus casi 55 años en la empresa,
* se ha decidido subir el sueldo 2000 euros
* mensuales a Dorotea Flor */
update empleados
set salarioEmpleado = salarioEmpleado + 2000
where nombreEmpleado = 'flor, dorotea';
/* 2. Tras un descontento entre algunos jefes
* de departamento por sus situaciones salariales,
* se decide realizar un estudio para averiguar que
* jefes de departamento tiene un sueldo menor a
* los de algún trabajador de su departamento, realice una
* consulta que devuelva su id y nombre */
select idDepartamentoFK, max(salarioEmpleado) as salarioMax
from empleados e
group by idDepartamentoFK;
select d.idDepartamento, e.nombreEmpleado, e.salarioEmpleado
from departamentos d
inner join empleados e on e.idEmpleado = d.idEmpleadoFk
inner join (select idDepartamentoFK, max(salarioEmpleado) as salarioMax
from empleados e
group by idDepartamentoFK) sub on sub.idDepartamentoFk = d.idDepartamento
-- where sub.salarioMax > e.salarioEmpleado;
select * from departamentos d
inner join empleados e on e.idEmpleado = d.idEmpleadoFk;
update empleados
set salarioEmpleado = salarioEmpleado + (salarioEmpleado +0.4)
where idEmpleado in
(select e.idEmpleado
from departamentos d
inner join empleados e on e.idEmpleado = d.idEmpleadoFk
inner join (select idDepartamentoFK, max(salarioEmpleado) as salarioMax
from empleados e
group by idDepartamentoFK) sub on sub.idDepartamentoFk = d.idDepartamento
where sub.salarioMax > e.salarioEmpleado)
-- empleados mas veteranos por centro de trabajo
select e.nombreEmpleado, min(e.fechaIngresoEmpleado) as Fecha, c.nombreCentroTrabajo
from empleados e
inner join departamentos d on d.idDepartamento = e.idDepartamentoFK
inner join centrostrabajo c on c.idCentroTrabajo = d.idCentroTrabajoFK
group by c.idCentroTrabajo;
/*
* 3. Tras este estudio se decide realizar una revisión salarial general,
* para ello añadiremos una columna a la tabla de empleados,
* que nos hable del estado salarial del mismo. Los empleados
* que estén más de 500 euros por debajo de la media
* de su departamento tendrán estado 'Revisar',
* los jefes de departamento que están por debajo del
* máximo de su departamento tendrán estado 'Urgente' y el resto 'OK'
*/
-- TABLA
ALTER TABLE oficina.empleados ADD estadoEmpleado varchar(255);
-- media de dineros de los grupos
select avg(e.salarioEmpleado) as mediaSalario, idDepartamentoFK
from empleados e
group by e.idDepartamentoFK;
-- 500 menos por el medio de ellos
select e.idEmpleado, e.idDepartamentoFK, e.salarioEmpleado, mediasD.mediaSalario
from empleados e
inner join (select avg(e.salarioEmpleado) as mediaSalario, idDepartamentoFK
from empleados e
group by e.idDepartamentoFK) mediasD on e.idDepartamentoFK = mediasD.idDepartamentoFK
where (mediasD.mediaSalario - salarioEmpleado)> 500
order by e.salarioEmpleado desc;
-- siguiente
select e.idEmpleado
from empleados e
inner join (select avg(e.salarioEmpleado) as mediaSalario, idDepartamentoFK
from empleados e
group by e.idDepartamentoFK) mediasD on e.idDepartamentoFK = mediasD.idDepartamentoFK
where (mediasD.mediaSalario - salarioEmpleado)> 500
order by e.salarioEmpleado desc;
select estadoEmpleado from empleados e  ;
select * from empleados e
order by estadoEmpleado desc;
select idDepartamentoFK  from departamentos d;
update empleados
set estadoEmpleado = 'OK';
update empleados
set estadoEmpleado ='Revisar'
where idEmpleado in (select e.idEmpleado
from empleados e
inner join (select avg(e.salarioEmpleado) as mediaSalario, idDepartamentoFK
from empleados e
group by e.idDepartamentoFK) mediasD on e.idDepartamentoFK = mediasD.idDepartamentoFK
where (mediasD.mediaSalario - salarioEmpleado)> 500
order by e.salarioEmpleado desc);
update empleados
set estadoEmpleado ='Urgente'
where idEmpleado in (select e.idEmpleado
from empleados e
inner join (select avg(e.salarioEmpleado) as mediaSalario, idDepartamentoFK
from empleados e
group by e.idDepartamentoFK) mediasD on e.idDepartamentoFK = mediasD.idDepartamentoFK
where (mediasD.mediaSalario - salarioEmpleado)> 500
order by e.salarioEmpleado desc)
and idDepartamentoFK in (select idDepartamentoFK  from departamentos d);
select *, count(estadoEmpleado) as conteoEstado from empleados e
group by estadoEmpleado
order by estadoEmpleado desc;
/*
* 8. La empresa quiere promover la conciliación familiar,
* comenzando por reestructurar los horarios de los departamentos
* con más presencia familiar. Añadir una columna situacionFamiliar
* que sea 1 sí la media de hijos del departamento
* sea mayor a 1,5. Si no se cumple la condición, será 0.
*/
-- crear tabla de situacion familiar
ALTER TABLE departamentos  ADD situacionFamiliar varchar(255);
-- media de hijos por empleado
select avg(hijosEmpleado)  as mediaHijos
from empleados e
group by idDepartamentoFK ;
select idDepartamentoFK  from empleados e
group by idDepartamentoFK
having avg(hijosEmpleado) >1.5;
--
update departamentos
set situacionFamiliar = '1'
where (select idDepartamentoFK  from empleados e
group by idDepartamentoFK
having avg(hijosEmpleado) >1.5);
/*
* 9. Para ofertar una promoción en los departamentos, cada departamento propondrá
* a un empleado del departamento que depende de este.
* Realizar una consulta que devuelva el nombre de los empleados del
* los departamentos que dependen con mayor tiempo en la empresa.
*/
-- confirmamos que no se repite ninguno
select fechaIngresoEmpleado, count(*)
from empleados e
group by fechaIngresoEmpleado, idDepartamentoFK
order by fechaIngresoEmpleado asc;
select idDepartamentoFK, min(fechaIngresoEmpleado) from empleados e
group by idDepartamentoFK;
select e.idEmpleado, e.idDepartamentoFK
from empleados e
inner join (select idDepartamentoFK, min(fechaIngresoEmpleado) as minimo from empleados e
group by idDepartamentoFK) depxFecha
on depxFecha.idDepartamentoFK = e.idDepartamentoFK
and depxFecha.minimo = e.fechaIngresoEmpleado
