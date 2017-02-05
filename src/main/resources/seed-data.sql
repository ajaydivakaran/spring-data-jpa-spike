insert into customers (first_name, last_name) values ('fname1', 'lname1');
insert into customers (first_name, last_name) values ('fname2', 'lname2');
insert into customers (first_name, last_name) values ('fname3', 'lname3');

insert into products (code, description, approved_date) values ('code1', 'product description 1', '2016-01-28');
insert into products (code, description, approved_date) values ('code2', 'product description 2', '2015-03-28');
insert into products (code, description, approved_date) values ('code3', 'product description 3', '2014-02-28');

insert into phone_numbers (phone_number) values ('12312312');
insert into phone_numbers (phone_number) values ('12312313');

insert into customer_phone_numbers (customer_id, phone_number_id) values (1, 1);
insert into customer_phone_numbers (customer_id, phone_number_id) values (2, 2);
insert into customer_phone_numbers (customer_id, phone_number_id) values (3, 2);

insert into orders (customer_id) values (2);
insert into orders (customer_id) values (3);

insert into order_items (order_id, product_id, quantity) VALUES (1, 1, 2);
insert into order_items (order_id, product_id, quantity) VALUES (1, 2, 3);
insert into order_items (order_id, product_id, quantity) VALUES (2, 3, 4);
