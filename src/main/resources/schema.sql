CREATE TABLE Ticket (
    id INTEGER AUTO_INCREMENT NOT NULL,
    movie VARCHAR(255) NOT NULL,
    amount SMALLINT NOT NULL,
    firstname VARCHAR(255) NOT NULL,
    lastname VARCHAR(255) NOT NULL,
    phone VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    primary key (id)
);