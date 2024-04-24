-- 1. Realiza una consulta que devuelva el id de Rafael Nadal.
select player_id
from players p
where name_first = 'Rafael' and name_last = 'Nadal'
group by player_id;
-- 2. Realiza una consulta que devuelva el jugador zurdo más alto.
select name_first, name_last, height
from players p
where hand = 'L'
order by height desc
limit 1;
-- 3. Realiza una consulta que devuelva el país con el mayor
-- número de jugadores en el top 100.
select p.name_first, p.name_last, p.ioc, count(r.player) as jugadores
from players p
inner join rankings r on p.player_id = r.player
where r.ranking < 101 and r.ranking_date = '20230102'
group by p.ioc
order by jugadores desc limit 1;
-- 4. Realiza una consulta que devuelva el país con mayor
-- número de jugadores con puntos(ranking) por debajo de la media.
select count(p.player_id) as countPlayers, p.ioc
from players p
inner join rankings r on p.player_id = r.player
where r.ranking_date = '20230102' and r.points < (
	select avg(r.points) as rankingPais
	from rankings r)
group by p.ioc
order by countPlayers desc limit 1;
-- ranking pais agrupado
select avg(r.ranking) as rankingPais
from rankings r
inner join players p on p.player_id = r.player
where r.ranking_date = '20230102'
group by p.ioc;
	/*******************************/
	/************ CLASE ************/
select avg(points) from rankings r;
-- SIGUIENTE
select p.ioc, count(*) as nJugadores
from players p
inner join rankings r on p.player_id = r.player
where r.points < (
	select avg(points) from rankings r
	) and r.ranking_date = '20230102'
group by p.ioc
order by nJugadores desc limit 1;
-- 5. Realiza una consulta que devuelva el jugador más joven con 5 partidos ganados.
select winner_id, winner_name
from matches m
group by winner_id
having  count(winner_id) = 5
order by m.winner_age asc
limit 1;
/*****************/
/*** EN CLASES ***/
select winner_id
from matches m
group by winner_id
having  count(*) = 5;
-- siguiente
select player_id, name_last
from players p
where p.player_id in (
	select winner_id
	from matches m
	group by winner_id
	having  count(*) = 5)
order by p.dob
limit 1;
-- 6. Realiza una consulta que devuelva cada jugador con su número
-- de partidos ganados y perdidos.
-- ganados
select winner_id, count(*) as countWinner
   from matches
   group by winner_id;
-- perdidos
select loser_id, count(*) as countLoser
   from matches
   group by loser_id;
/************ JUNTITO TODO ************/
select p.player_id,
      p.name_first, w.countWinner, l.countLoser
from players p
left join (
   select winner_id, count(*) as countWinner
   from matches
   group by winner_id
) w on p.player_id = w.winner_id
left join (
   select loser_id, count(*) as countLoser
   from matches
   group by loser_id
) l on p.player_id = l.loser_id
order by countWinner desc, countLoser desc
limit 10;
-- 7. Realiza una consulta que devuelva los jugadores que estén
--  por encima de la media de altura de su país.
/* CLASE */
select ioc, avg(height) as mediaAltura,
	   name_first, name_last
from players p
group by ioc;
-- siguiente
select p.name_first, p.name_last, p.height, sub.media, p.ioc
from players p
inner join (
	select p.ioc, avg(p.height) as media, p.name_first, p.name_last
	from players p
	group by p.ioc
	) sub on sub.ioc = p.ioc
where p.height > sub.media
group by p.player_id
order by p.height ;
