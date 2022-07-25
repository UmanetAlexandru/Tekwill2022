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

--EX 23.12
create table if not exists departments (
	department_id int,
	department_name varchar(20)
);
INSERT INTO departments (department_id, department_name)
VALUES(1, 'java'), (2, 'c++'), (3, 'c#'), (4, 'php');

--EX 23.13
ALTER TABLE employees ADD COLUMN department_id INT;

--EX 23.14
ALTER TABLE departments ADD CONSTRAINT department_id_key UNIQUE (department_id);
ALTER TABLE departments ALTER COLUMN department_id SET NOT null;
ALTER TABLE departments ALTER COLUMN department_name SET NOT null;
ALTER TABLE departments ALTER COLUMN department_name SET DEFAULT 'Unknown';

--EX 23.15
alter table departments drop constraint department_id_key;
alter table departments alter column department_id DROP NOT NULL;
ALTER TABLE departments ADD PRIMARY KEY (department_id);
ALTER TABLE employees ADD PRIMARY KEY (id);

--EX 23.16
CREATE TABLE addresses (
	id int4 primary key,
	street varchar(225) NOT NULL,
	city varchar(60) NOT NULL,
	zip_code varchar(20) NOT NULL,
	phone varchar(20),
	employee_id int4 NULL,
	CONSTRAINT fk_employee FOREIGN KEY (employee_id) REFERENCES employees(id)
);
