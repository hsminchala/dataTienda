CREATE TABLE IF NOT EXISTS  product (
    id serial,
    description VARCHAR(45) NOT NULL,
    details VARCHAR(45) NULL,
    PRIMARY KEY (id)
    );

    CREATE TABLE IF NOT EXISTS  client (
          id serial,
          nombre VARCHAR(45) NOT NULL,
          cedula VARCHAR(45) NULL,
          PRIMARY KEY (id)
          );