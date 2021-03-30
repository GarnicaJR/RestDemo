DROP TABLE IF EXISTS books;

CREATE TABLE books(id serial PRIMARY KEY, name VARCHAR(100), description VARCHAR(255));


INSERT INTO books(name, description) VALUES('Michel smith', 'some mock info 1');
INSERT INTO books(name, description) VALUES('Scott carlson', 'some mock info 2');
INSERT INTO books(name, description) VALUES('Vishnu suganya', 'some mock info 3');