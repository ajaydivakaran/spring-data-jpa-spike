create table customers (
  id SERIAL PRIMARY KEY,
  first_name TEXT,
  last_name TEXT
);

create table products (
  id SERIAL PRIMARY KEY,
  code VARCHAR(10) UNIQUE,
  description TEXT,
  approved_date DATE
);

create table phone_numbers (
  id SERIAL PRIMARY KEY,
  phone_number TEXT
);

create table customer_phone_numbers (
  id SERIAL PRIMARY KEY,
  customer_id INTEGER REFERENCES customers,
  phone_number_id INTEGER REFERENCES phone_numbers
);

create table orders (
  id SERIAL PRIMARY KEY,
  customer_id INTEGER REFERENCES customers,
  order_id INTEGER REFERENCES orders,
  created_date TIMESTAMP without time zone DEFAULT now()
);

create table order_items (
  id SERIAL PRIMARY KEY,
  order_id INTEGER REFERENCES orders,
  product_id INTEGER REFERENCES products,
  quantity INTEGER
);