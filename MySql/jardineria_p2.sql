SELECT linea_direccion2, count(*) -- codigo_cliente, nombre_cliente, nombre_contacto, apellido_contacto, telefono, fax, linea_direccion1, linea_direccion2, ciudad, region, pais, codigo_postal, codigo_empleado_rep_ventas, limite_credito
FROM jardineria.cliente
where ciudad = 'Madrid' and linea_direccion2 is not null
group by linea_direccion2
having count(*) = 2
order by COUNT(*) desc
limit 1; -- and telefono like '9%';
-- Seleccionar la oficina que mas clientes ha atendido.
select e.codigo_oficina , count(*) as nClientes from cliente c
inner join empleado e on c.codigo_empleado_rep_ventas = e.codigo_empleado group by e.codigo_oficina
order by nClientes desc
limit 1;
-- Seleccionar los clientes que han comprado
-- la gama de productos mas vendida.
select p.gama from producto p
inner join detalle_pedido dp
on dp.codigo_producto = p.codigo_producto
group by p.gama
order by sum(dp.cantidad) desc
limit 1;
select DISTINCT (c.codigo_cliente) from cliente c
inner join pedido p on p.codigo_cliente = c.codigo_cliente
inner join detalle_pedido dp on dp.codigo_pedido = p.codigo_pedido
inner join producto p2 on p2.codigo_producto = dp.codigo_producto
where p2.gama = 'Ornamentales';
select DISTINCT (c.codigo_cliente) from cliente c
inner join pedido p on p.codigo_cliente = c.codigo_cliente
inner join detalle_pedido dp on dp.codigo_pedido = p.codigo_pedido
inner join producto p2 on p2.codigo_producto = dp.codigo_producto
where p2.gama = (select p.gama from producto p inner join detalle_pedido dp
on dp.codigo_producto = p.codigo_producto
group by p.gama
order by sum(dp.cantidad) desc
limit 1);
-- oficina que ha atendido al cliente con el pedido mas caro
select sum(dp.precio_unidad*dp.cantidad) as total, c.nombre_cliente , o.ciudad
from oficina o
inner join empleado e on e.codigo_oficina = o.codigo_oficina
inner join cliente c on e.codigo_empleado = c.codigo_empleado_rep_ventas
inner join pedido p on c.codigo_cliente = p.codigo_cliente
inner join detalle_pedido dp on p.codigo_pedido = dp.codigo_pedido
group by p.codigo_pedido
order by total desc limit 1;
	/* EN CLASE */
select sum(cantidad*precio_unidad) as total, codigo_pedido
from detalle_pedido dp
group by codigo_pedido
order by total desc limit 1;
	/* SIGUIENTE PARTE */
select o.ciudad, c.nombre_cliente
from oficina o
inner join empleado e on e.codigo_oficina = o.codigo_oficina
inner join cliente c on e.codigo_empleado = c.codigo_empleado_rep_ventas
inner join pedido p on c.codigo_cliente = p.codigo_cliente
where p.codigo_pedido = 33;
