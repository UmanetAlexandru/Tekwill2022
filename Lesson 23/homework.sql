create database library owner tekwill;

create table if not exists books (
	id serial primary key,
	title varchar(255) unique not null,
	total_pages int not null,
	isbn varchar(15) not null,
	publication_date date
);

create table if not exists authors (
	id serial4 primary key,
	first_name varchar(50) not null,
	last_name varchar(50),
	unique(first_name, last_name)
);

create table if not exists book_authors(
	book_id int,
	author_id int,
	CONSTRAINT fk_book FOREIGN KEY (book_id) REFERENCES books(id),
	CONSTRAINT fk_author FOREIGN KEY (author_id) REFERENCES authors(id),
	unique(book_id, author_id)
);

--inserting books
INSERT INTO books (title, total_pages, isbn, publication_date)
values ('Core Java Volume I--Fundamentals', 928, '978-0135166307', '2020-07-04'),
('The Clean Coder: A Code of Conduct for Professional Programmers', 242, '978-0137081073', '2011-05-04'),
('Clean Code: A Handbook of Agile Software Craftsmanship', 464, '978-0132350884', '2008-08-01'),
('Design Patterns: Elements of Reusable Object-Oriented Software', 416, '978-0201633610', '1994-10-10'),
('OCA Java SE 8 Programmer I Certification Guide', 704, '978-1617293252', '2016-09-30');
--inserting authors
INSERT INTO authors(first_name, last_name)
VALUES('Robert', 'Martin'),
('Cay', 'Horstmann'),
('Mala', 'Gupta'),
('Erich', 'Gamma'),
('Richard', 'Helm'),
('Ralph', 'Johnson'),
('John', 'Vlissides');
--creating relations between books and authors
INSERT INTO book_authors (book_id, author_id)
values
((select id from books where isbn = '978-0135166307' LIMIT 1), (select id from authors where last_name = 'Horstmann' LIMIT 1)),--Java fundamentals
((select id from books where isbn = '978-0137081073' LIMIT 1), (select id from authors where last_name = 'Martin' LIMIT 1)),--The Clean Coder
((select id from books where isbn = '978-0132350884' LIMIT 1), (select id from authors where last_name = 'Martin' LIMIT 1)),--Clean Code
((select id from books where isbn = '978-0201633610' LIMIT 1), (select id from authors where last_name = 'Gamma' LIMIT 1)),--Design Patterns
((select id from books where isbn = '978-0201633610' LIMIT 1), (select id from authors where last_name = 'Helm' LIMIT 1)),--Design Patterns
((select id from books where isbn = '978-0201633610' LIMIT 1), (select id from authors where last_name = 'Johnson' LIMIT 1)),--Design Patterns
((select id from books where isbn = '978-0201633610' LIMIT 1), (select id from authors where last_name = 'Vlissides' LIMIT 1)),--Design Patterns
((select id from books where isbn = '978-1617293252' LIMIT 1), (select id from authors where last_name = 'Gupta' LIMIT 1));--OCA

--select all the necessary information
select
	title "Title",
	total_pages "Nr of pages",
	isbn "ISBN",
	publication_date "Published on",
	string_agg(concat(first_name, ' ', last_name) , ', ') "Authors"
from books b
join book_authors ba on ba.book_id = b.id
join authors a on ba.author_id = a.id
group by title, total_pages, isbn, publication_date