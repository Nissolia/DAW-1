/*  1.	Escribe una consulta SQL para mostrar el nombre y la duración de todas las películas
* que tienen un rating en IMDb mayor a 8. */
select Title, Runtime
from imdb i
where Rating > 8
order by i.Rating desc;
/* 2.	Escribe una consulta SQL para mostrar las películas
* del año 2016. */
select Title
from imdb i
where Title like "%2016%"
order by Title desc;
/* 3.	Escribe una consulta SQL para mostrar el género
* con menos presupuesto medio.  */
select g.genre, avg(i.Budget) as mediaPresu
from genre g
inner join imdb i on i.Movie_id = g.Movie_id
group by g.genre
order by mediaPresu asc
limit 1;
/* 4.	Escribe una consulta SQL para los generos con más
* de 40 películas (No puede aparecer nulo como género). */
select genre, count(Movie_id) as conteoPeliculas
from genre g
where genre is not null
group by genre
having conteoPeliculas > 40
order by genre desc;
/* 5.	Escribe una consulta SQL para mostrar los
* géneros con más de 5 peliculas con puntuación
* por encima de la media. */
-- media general
select avg(Rating) as mediaPuntuacion
from imdb i
-- media de peliculas
select g.genre, avg(i.Rating)as mediaGenero
from genre g
inner join imdb i on g.Movie_id = i.Movie_id
group by g.genre
having mediaGenero > (
					select avg(Rating) as mediaPuntuacion
					from imdb i
					) and count(*)
order by mediaGenero desc;
/* 6.	Escribe una consulta SQL para mostrar el
* título de las películas que tienen una media mayor
* que la media de alguno de sus géneros.*/
-- media por genero
select avg(i.Rating) as mediaGenero, g.genre
from genre g
inner join imdb i on g.Movie_id = i.Movie_id
group by g.genre;
-- consulta completa
select i.Title, rg.genre
from imdb i
inner join genre g on g.Movie_id = i.Movie_id
left join (select avg(i.Rating) as mediaGenero, g.genre
			from genre g
			inner join imdb i on g.Movie_id = i.Movie_id
			group by g.genre) rg on rg.genre = g.genre
where i.Rating > rg.mediaGenero
group by i.Title
order by i.Title desc, g.genre desc;
/*  7.	Escribe una consulta SQL para mostrar cada uno de los géneros y
*  el porcentaje de películas total que son de ese género.
* (Ejemplo: Acción - 60%, Comedia – 55%) */
-- peliculas totales -- 117
select count(*) from imdb i
-- porcentaje de genero
select (count(*)*(select count(*) from imdb i )/100) as generoPorcentaje , genre
from genre g 
where genre is not null
group by genre
order by generoPorcentaje desc;
/* 8.	Se quiere crear unos premios FESACine, para ello se necesita crear una
* tabla PREMIOS que incluya nombre del premio, año del premio e
* id de la película que recibe el premio. Insertar el primer FESACito a película
*  del año (2014) para Interstellar. */
-- para saber que pelicula es la que buscamos y ver su movie id
select *
from imdb i
where Title like 'Interstellar%';
-- creación de tabla
create table premios(
n_premio varchar(255),
a_premio varchar(255),
id_Movie varchar(255)
);
-- añadir datos y alterar los datos
insert into premios values ('FESACito', 2014, 46900);
alter table premios add foreign key(id_Movie) references IMDB(Movie_id);
/* 9.	 Se quiere realizar una nominación a la película del año 2015, para ello añadiremos
* a la tabla IMDB, una columna llamada nominada, en la que el valor será “SI”,
* si la película es del año 2015 y su puntuación está por encima de la media de todas las películas
* y “NO” para el resto de las películas. */
-- media general
select avg(Rating) as mediaPuntuacion
from imdb i
-- movie id nominados
select Movie_id
from imdb i
where Title like '%2015%' and Rating > (select avg(Rating) as mediaPuntuacion
										from imdb i );
-- tabla alterada
ALTER TABLE FesaCine.imdb ADD nominada varchar(100);
-- PARA PONERLOS TODOS EN NO AL INICIO
update imdb i
set nominada = 'NO'
-- peliculas nominadas
update imdb i
set nominada = 'SI'
where Movie_id in (select Movie_id
					from imdb i
					where Title like '%2015%' and Rating > (
										select avg(Rating) as mediaPuntuacion

