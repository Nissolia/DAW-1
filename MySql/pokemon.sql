SELECT pok_id, pok_name, pok_weight, pok_height , pok_base_experience
FROM pokemon.pokemon;
-- peso/altura*altura MCI mas alto
select pok_weight, pok_height, pok_name,(pok_weight/((pok_height*pok_height)/100)) as MCI
from pokemon.pokemon
order by MCI desc limit 5;
-- tipo del pokemon del que hemos sacado
select pok_weight, pok_height, pok_name,(pok_weight/((pok_height*pok_height)/100)) as MCI, t.type_name
from pokemon p
inner join pokemon_types pt on p.pok_id = pt.pok_id
inner join types t on pt.type_id = t.type_id
order by MCI desc limit 2;
select t.type_name , count(*) as conteo
from pokemon p
join pokemon_types pt on p.pok_id = pt.pok_id
join types t on pt.type_id = t.type_id
group by t.type_name;
-- habilidad que mas se repite en los pokemon pokemon, pokemon_abilities, abilities
select abil_name, count(*) as conteo
from abilities a
inner join pokemon_abilities pa on pa.abil_id = a.abil_id
group by abil_name
order by conteo desc limit 3;
-- nombre de habilidades que se repite del tipo 'fire'
select abil_name, count(*) as conteo
from abilities a
inner join pokemon_abilities pa on pa.abil_id  = a.abil_id
inner join pokemon_types pt on pt.pok_id = pa.pok_id
inner join types t on t.type_id = pt.type_id
where t.type_name ='fire'
group by abil_name
having conteo > 10 -- se tiene que poner con el having
order by conteo desc;
-- devuelva tipo tenga media de peso > 20
select t.type_name, AVG(p.pok_weight) as mediaPeso
from types t
inner join pokemon_types pt on pt.type_id  = t.type_id
inner join pokemon p on p.pok_id = pt.pok_id
group by t.type_name
having mediaPeso >20
order by mediaPeso desc;
-- nombre pk con habilidad battle-armor de tipo steel y movimiento meteor-smash
select p.pok_name, m.move_name, a.abil_name, t.type_name
from pokemon p
inner join pokemon_types pt on pt.pok_id = p.pok_id
inner join types t on t.type_id = pt.type_id
inner join pokemon_abilities pa  on pa.pok_id = p.pok_id
inner join abilities a on a.abil_id = pa.abil_id
inner join pokemon_moves pm on pm.pok_id = p.pok_id
inner join moves m on m.move_id  = pm.move_id
where t.type_name = 'steel' and m.move_name = 'take-down'
and a.abil_name = 'magnet-pull'
order by p.pok_name desc;
-- pokemons por mas de la media
select pok_name, p.pok_weight from pokemon p
where p.pok_weight > (select avg(p.pok_weight) from pokemon p)
order by p.pok_weight asc;
-- subconsulta con algo de datos
select pok_name from pokemon p
where pok_id (select pok_id from pokemon p where pok_weight > 4000);
-- tipo y media de su poder
select t.type_name, moveAux.mediaP
from types t
inner join (select type_id, avg(move_power) as mediaP
from moves m group by type_id)
as moveAux on moveAux.type_id = t.type_id;
-- IMC PROMEDIO DE CADA TIPO
select t.type_name , AVG(pok_weight/(pok_height*pok_height)) as mediaP from types t
inner join pokemon_types pt on pt.type_id = t.type_id
inner join pokemon p on p.pok_id = pt.pok_id
group by t.type_name
order by mediaP desc
;
-- TIPOS CON IMC POR ENCIMA DE LA MEDIA
select t.type_name , AVG(pok_weight/(pok_height*pok_height)) as mediaP from types t
inner join pokemon_types pt on pt.type_id = t.type_id
inner join pokemon p on p.pok_id = pt.pok_id
group by t.type_name
having mediaP >
(select avg(pok_weight/(pok_height*pok_height)) from pokemon p);

