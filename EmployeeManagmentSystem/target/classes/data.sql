-- Table creation for INVENTORY_DETAILS
CREATE TABLE INVENTORY_DETAILS (
    id INT,
    name VARCHAR(255),
    quantity INT,
    price DECIMAL(10, 2)
);

-- Data insertion for INVENTORY_DETAILS
INSERT INTO INVENTORY_DETAILS (id, name, quantity, price) VALUES
    (1, 'Chips', 200, 10.00),
    (2, 'Soda', 150, 5.50),
    (3, 'Cookies', 300, 7.25),
    (18, 'Chips', 200, 10.00);

-- Table creation for EMPLOYEE
CREATE TABLE EMPLOYEE (
    emp_id INT,
    salary DECIMAL(10, 2),
    emp_name VARCHAR(255)
);

-- Data insertion for EMPLOYEE
INSERT INTO EMPLOYEE (emp_id, salary, emp_name) VALUES
    (1, 10000, 'Raman Hari'),
    (2, 12000, 'John Doe'),
    (3, 9000, 'Jane Smith');
