select * from users;
insert into users(username, password, age)
values ('user','user',22),
       ('admin','admin',33);


select * from roles;
insert into roles (role)
values ('ROLE_USER'),
       ('ROLE_ADMIN');

select * from user_roles;
insert into user_roles(user_id,role_id)
values (1,1),
       (2,1),
       (2,2);