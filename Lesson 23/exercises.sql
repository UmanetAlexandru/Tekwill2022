--EX 23.7
select * from employees where age < 45;
select * from employees where first_name = 'Lauren' or last_name = 'Beaulieu';
select * from employees where age > 60 or age < 20;

--EX 23.8
select * from employees order by age desc;
select * from employees order by first_name desc;
select * from employees order by age asc, last_name desc;

--EX 23.9
--select * from employees where id = 26;
update employees set first_name = 'Alexandru', last_name = 'cel Bun' where id = 26;
--select * from employees where first_name = 'Marv';
update employees set age = 85 where first_name = 'Marv';
--select * from employees where age > 70;
update employees set first_name = 'Abgar' where age > 70;

--EX 23.10
delete from employees where age < 20;
delete from employees where first_name = 'Alexandru';

--EX 23.11
--select * from employees where email in ('john.smith@gmail.com', 'martin.flower@webeden.co.uk', 'harry.potter@mail.md');
INSERT INTO employees (first_name, last_name, email, age)
values ('John', 'Smith', 'john.smith@gmail.com', 40),
('Martin', 'Flower', 'martin.flower@webeden.co.uk', 63),
('Harry', 'Potter', 'harry.potter@mail.md', 120);