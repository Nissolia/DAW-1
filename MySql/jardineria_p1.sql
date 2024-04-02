/* 1. Listar las ventas totales de los productos
que hayan facturado más de 3000 euros. Se mostrará el nombre,
unidades vendidas, total facturado y total facturado con impuestos (18 % IVA).*/
select p.nombre, sum(dp.cantidad) as cantidadTotal,
sum(dp.cantidad*p.precio_venta) as total,
sum((dp.cantidad*p.precio_venta)*1.18) as facturado
from producto p
inner join detalle_pedido dp on dp.codigo_producto = p.codigo_producto
group by p.nombre
having facturado > 3000
order by facturado desc;
/*2. Realice una consulta que muestre
el empleado con más clientes */
select e.nombre, count(*) as totalClientes
from empleado e
inner join cliente c on c.codigo_empleado_rep_ventas = e.codigo_empleado
group by e.nombre
order by totalClientes desc, e.nombre desc
limit 1;
/* 3. Realice una consulta que muestre el cliente
que más pedidos ha realizado en 2009 */
select c.nombre_cliente, count(*) as pedidos
from cliente c
inner join pedido p on p.codigo_cliente = c.codigo_cliente
where p.fecha_pedido  like '2009-%'
group by c.nombre_cliente
order by pedidos desc limit 1;
	/* EN CLASE */
select c.nombre_cliente, count(*) as masPedidos
from pedido p
inner join cliente c on c.codigo_cliente = p.codigo_cliente
where year(p.fecha_pedido) = 2009
/*where p.fecha_pedido >= '20090101' and p.fecha_pedido >= '20091231'*/
group by c.nombre_cliente
order by masPedidos desc
limit 1;
/*4. Mostrar el nombre de los clientes que no
hayan realizado pagos junto con el nombre de sus
representantes de ventas */
select c.nombre_cliente as sinPagos, e.nombre
from cliente c
left join pago p on p.codigo_cliente = c.codigo_cliente
inner join empleado e on e.codigo_empleado = c.codigo_cliente
where p.forma_pago is null
order by nombre_cliente desc;
/*5. Realice una consulta para sacar el cliente
que hizo el pedido de mayor cuantía. */
select sum(p.total) as gastado, c.nombre_cliente
from pago p, cliente c
group by c.nombre_cliente
order by gastado desc limit 1;
/* EN CLASE */
select  p.codigo_pedido, c.nombre_cliente, sum(dp.cantidad*p2.precio_venta) as cuantia
from pedido p
inner join detalle_pedido dp on dp.codigo_pedido = p.codigo_pedido
inner join producto p2 on p2.codigo_producto  = dp.codigo_producto
inner join cliente c on c.codigo_cliente = p.codigo_cliente
group by p.codigo_pedido
order by cuantia desc
limit 1;
/*6. Sacar el código de oficina y la ciudad donde hay oficinas.*/
select codigo_oficina, ciudad
from oficina o;
/*7. Sacar cuántos empleados hay en la compañía.*/
select count(*) as totalEmpleados
from empleado e;
 /*7.1. Sacar cuántos clientes tiene cada país.*/
select c.nombre_cliente, count(*) as totalClientes, o.pais
from empleado e
inner join oficina o on o.codigo_oficina = e.codigo_oficina
inner join cliente c on c.codigo_empleado_rep_ventas = e.codigo_empleado
group by e.codigo_oficina;
/*8. Sacar cuál fue el pago medio en 2005 (pista: Usar la función YEAR de mysql
o la función to_char (fecha, 'yyyy') de Oracle).*/
select *
from pago p
where year(fecha_pago) = 2005 and avg(total);
	/* EN CLASE */
-- Seleccionar la oficina que mas clientes ha atendido.
select count(*) as personasAtendidas, o.ciudad
from cliente c
inner join empleado e on c.codigo_empleado_rep_ventas = e.codigo_empleado
inner join oficina o  on o.codigo_oficina = e.codigo_oficina
group by o.ciudad
order by personasAtendidas desc
limit 1;
-- Seleccionar la oficina del empleado que ha atendido al cliente
-- que ha realizado el pedido mas caro.
select c.nombre_cliente, e.nombre as nombre_empleado, sum(dp.cantidad*p2.precio_venta) as cuantia, o.ciudad
from empleado e
inner join oficina o on o.codigo_oficina = e.codigo_oficina
inner join cliente c on e.codigo_empleado = c.codigo_empleado_rep_ventas
inner join pedido p on p.codigo_cliente = c.codigo_cliente
inner join detalle_pedido dp on dp.codigo_pedido = p.codigo_pedido
inner join producto p2 on p2.codigo_producto = dp.codigo_producto
group by c.codigo_cliente
order by cuantia desc limit 1;
		/* EN CLASE - CORREGIDO*/
select p.codigo_pedido, sum(dp.cantidad*p2.precio_venta) as gastadoCliente
from empleado e
inner join oficina o on o.codigo_oficina = e.codigo_oficina
inner join cliente c on e.codigo_empleado = c.codigo_empleado_rep_ventas
inner join pedido p on p.codigo_cliente = c.codigo_cliente
inner join detalle_pedido dp on dp.codigo_pedido = p.codigo_pedido
inner join producto p2 on p2.codigo_producto = dp.codigo_producto
group by p.codigo_pedido
order by gastadoCliente desc;
	/* SUB CONSULTA*/
select o.codigo_oficina, o.ciudad
from pedido p
inner join cliente c on c.codigo_cliente = p.codigo_cliente
inner join empleado e on e.codigo_empleado = c.codigo_empleado_rep_ventas
inner join oficina o on o.codigo_oficina = e.codigo_oficina
where p.codigo_pedido = 33;
	/* UNIDOS */
select o.codigo_oficina
from pedido p
inner join cliente c on c.codigo_cliente = p.codigo_cliente
inner join empleado e on e.codigo_empleado = c.codigo_empleado_rep_ventas
inner join oficina o on o.codigo_oficina = e.codigo_oficina
where p.codigo_pedido =
(select p.codigo_pedido
from pedido p
inner join detalle_pedido dp on dp.codigo_pedido = p.codigo_pedido
inner join producto p2 on p2.codigo_producto = dp.codigo_producto
group by p.codigo_pedido
order by sum(dp.cantidad*p2.precio_venta) desc limit 1);
-- Seleccionar los clientes que han comprado la gama de productos mas vendida.
select  gp.gama, count(*) as gamaProducto, c.nombre_cliente
from cliente c
inner join pedido p on p.codigo_cliente  = c.codigo_cliente
inner join detalle_pedido dp on dp.codigo_pedido = p.codigo_pedido
inner join producto p2 on p2.codigo_producto = dp.codigo_producto
inner join gama_producto gp on gp.gama = p2.gama
group by gp.gama
order by gamaProducto desc;
	/* EN CLASE */
select c.codigo_cliente, p2.gama from cliente c
inner join pedido p on p.codigo_cliente = c.codigo_cliente
inner join detalle_pedido dp on dp.codigo_pedido = p.codigo_pedido
inner join producto p2 on p2.codigo_producto = dp.codigo_producto
where p2.gama = (select gama
from producto p
inner join detalle_pedido dp on dp.codigo_producto = p.codigo_producto
group by gama
order by count(*) desc limit 1)
group by c.codigo_cliente limit 1;
/*9. Sacar cuántos pedidos están en cada estado ordenado descendente
por el número de pedidos.*/
select count(*), estado
from pedido p
group by estado
order by estado;
/*10.Sacar el precio del producto más caro y del más barato.*/
select precio_venta, nombre
from producto
order by precio_venta desc;
	/* SUBCONSULTAS */
/*11.Obtener el nombre del cliente con mayor limite de crédito.*/
/*12. Obtener el nombre, apellidol y cargo de los empleados que no representen a ningún cliente. */
	/* MULTITABLA */
/*13.Sacar un listado con el nombre de cada cliente y el nombre y apellido de su representante de ventas. */
/*14.Mostrar el nombre de los clientes que no hayan realizado pagos junto con el nombre de sus representantes de ventas.*/
/*15.Listar las ventas totales de los productos que hayan facturado más de 3000 euros. Se mostrará el nombre, unidades vendidas, total facturado y total facturado con impuestos (18% IVA). */
/*16.Listar la dirección de las oficinas que tengan clientes en Fuenlabrada. */

