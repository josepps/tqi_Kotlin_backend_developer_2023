CREATE TABLE products (
  id BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
   category BIGINT,
   brand VARCHAR(255) NOT NULL,
   name VARCHAR(255) NOT NULL,
   unit_of_measurement VARCHAR(255) NOT NULL,
   measure DOUBLE PRECISION NOT NULL,
   price DOUBLE PRECISION NOT NULL,
   CONSTRAINT pk_products PRIMARY KEY (id)
);

ALTER TABLE products ADD CONSTRAINT FK_PRODUCTS_ON_CATEGORY FOREIGN KEY (category) REFERENCES categories (id);