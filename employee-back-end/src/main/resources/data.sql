

--INSERT Status
insert into status(status) VALUES('Casual');
insert into status(status) VALUES('Agency');
insert into status(status) VALUES('Freelance Workers');
insert into status(status) VALUES('Contract');

--INSERT Department
insert into department(department) VALUES('UI/UX Department');
insert into department(department) VALUES('Software Department');
insert into department(department) VALUES('Embedded Department');
insert into department(department) VALUES('Financial Department');

--INSERT Contract-Type
insert into contract_type(contract_type) VALUES('Full Time');
insert into contract_type(contract_type) VALUES('Part Time');

--INSERT Birth-city
insert into birth_city(birth_city) VALUES('Cairo');
insert into birth_city(birth_city) VALUES('Alex');
insert into birth_city(birth_city) VALUES('Giza');
insert into birth_city(birth_city) VALUES('Tanta');
insert into birth_city(birth_city) VALUES('Asyut');
insert into birth_city(birth_city) VALUES('Qena');



-- INSERT Employee
 insert into employee (employee_Code, name, birth_date,birth_city_id,department_id,job_title,direct_manger,contract_type_id,status_id)
values ('48950720', 'Mostafa Ahmed', '1996-10-17',1,2,'Java Software Engineer','Ahmed El Garhy',1,2);
insert into employee (employee_Code, name, birth_date,birth_city_id,department_id,job_title,direct_manger,contract_type_id,status_id)
values ('48950721', 'Nada Alam', '1995-03-10',1,2,'Java Software Engineer','Ahmed El Garhy',1,2);

insert into employee (employee_Code, name, birth_date,birth_city_id,department_id,job_title,direct_manger,contract_type_id,status_id)
values ('48950722', 'Mahmoud Salah', '1993-05-17',1,2,'Senior Java Software Engineer','Ahmed El Garhy',1,2);

insert into employee (employee_Code, name, birth_date,birth_city_id,department_id,job_title,direct_manger,contract_type_id,status_id)
values ('48950723', 'Mohamed saeed', '1995-09-07',1,2,'Java Software Engineer','Ahmed El Garhy',1,2);

insert into employee (employee_Code, name, birth_date,birth_city_id,department_id,job_title,direct_manger,contract_type_id,status_id)
values ('48950724', 'Gamal Mohamed', '1997-11-27',3,2,'Java Software Engineer','Ahmed El Garhy',2,3);


insert into employee (employee_Code, name, birth_date,birth_city_id,department_id,job_title,direct_manger,contract_type_id,status_id)
values ('48950727', 'Ahmed Mohamed', '1996-01-05',2,1,'UI/UX Engineer','Mohamed Eslam',2,2);

insert into employee (employee_Code, name, birth_date,birth_city_id,department_id,job_title,direct_manger,contract_type_id,status_id)
values ('48950728', 'Khaled Ahmed', '1996-10-20',2,1,'UI/UX Engineer','Mohamed Eslam',2,4);

insert into employee (employee_Code, name, birth_date,birth_city_id,department_id,job_title,direct_manger,contract_type_id,status_id)
values ('48950729', 'Eslam Raaft', '1997-10-8',4,1,'UI/UX Engineer','Mohamed Eslam',2,4);

insert into employee (employee_Code, name, birth_date,birth_city_id,department_id,job_title,direct_manger,contract_type_id,status_id)
values ('48950730', 'Amany Mohamed', '1996-11-17',2,1,'UI/UX Engineer','Mohamed Eslam',1,2);

