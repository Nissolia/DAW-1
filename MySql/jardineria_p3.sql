SELECT nombre,email  FROM empleado e
where email not like '%jardineria%' and  email not like '%gardening%';
-- empleado que de nombre del jefe
select *
from empleado e
left join empleado e2 on e.codigo_empleado = e2.codigo_empleado
where e.codigo_empleado = ${nombre}
