-- Question 2
SELECT employee_id,
       last_name,
       job_id,
       hire_date AS STARTDATE
FROM employees;

-- Question 3
SELECT DISTINCT job_id
FROM employees;

-- Question 4
SELECT employee_id AS "Emp #",
       last_name AS "Employee",
       job_id AS "Job",
       hire_date AS "Hire Date"
FROM employees;

-- Question 5
SELECT last_name || ', ' || job_id AS "Employee and Title"
FROM employees;

--Restricting and sorting data
-- Q1
SELECT last_name, salary
FROM employees
WHERE salary > 12000;

-- Q2
SELECT last_name, department_id
FROM employees
WHERE employee_id = 176;

-- Q3
SELECT last_name, salary
FROM employees
WHERE salary NOT BETWEEN 5000 AND 12000;

-- Q4
SELECT last_name, job_id, hire_date
FROM employees
WHERE last_name IN ('Matos','Taylor')
ORDER BY hire_date ASC;

-- Q5
SELECT last_name, department_id
FROM employees
WHERE department_id IN (20,50)
ORDER BY last_name ASC;

-- Q6
SELECT last_name AS "Employee", salary AS "Monthly Salary"
FROM employees
WHERE salary BETWEEN 5000 AND 12000
AND department_id IN (20,50);

-- Q7
SELECT last_name, hire_date
FROM employees
WHERE EXTRACT(YEAR FROM hire_date) = 1994;

-- Q8
SELECT last_name, job_id
FROM employees
WHERE manager_id IS NULL;

-- Q9
SELECT last_name, salary, commission_pct
FROM employees
WHERE commission_pct IS NOT NULL
ORDER BY 2 DESC, 3 DESC;

-- Q10
SELECT last_name, salary
FROM employees
WHERE salary > &Salary_value;

-- Q11
SELECT employee_id, last_name, salary, department_id
FROM employees
WHERE manager_id = &manager_id
ORDER BY &sorted_by;

-- Q12
SELECT last_name
FROM employees
WHERE last_name LIKE '__a%';

-- Q13
SELECT last_name
FROM employees
WHERE last_name LIKE '%a%'
AND last_name LIKE '%e%';

-- Q14
SELECT last_name, job_id, salary
FROM employees
WHERE job_id IN ('SA_REP','ST_CLERK')
AND salary NOT IN (2500,3500,7000);

--DML
--Q1
CREATE TABLE MY_EMPLOYEE AS
SELECT employee_id, first_name, last_name, department_id, salary
FROM employees
WHERE 1=2;

--Q2
DESC MY_EMPLOYEE;

--Q3
INSERT INTO MY_EMPLOYEE
VALUES (201,'Michael','Hartstein',20,13000);
SELECT * FROM MY_EMPLOYEE;

--Q4
INSERT INTO MY_EMPLOYEE
VALUES (202,'Pat','Fay',20,NULL);

SELECT * FROM MY_EMPLOYEE;

--Q5
INSERT INTO MY_EMPLOYEE
(employee_id,first_name,last_name,department_id)
VALUES (203,'Susan','Mavris',40);
SELECT * FROM MY_EMPLOYEE;

--Q6
INSERT INTO MY_EMPLOYEE VALUES (205,'Shelley','Higgins',110,12000);

INSERT INTO MY_EMPLOYEE VALUES (100,'Steven','King',90,24000);

INSERT INTO MY_EMPLOYEE VALUES (101,'Neena','Kochhar',90,17000);

INSERT INTO MY_EMPLOYEE VALUES (102,'Lex','De Haan',90,17000);

INSERT INTO MY_EMPLOYEE VALUES (111,'Ismael','Sciarra',100,7700);

INSERT INTO MY_EMPLOYEE VALUES (112,'Jose Manuel','Urman',100,7800);

INSERT INTO MY_EMPLOYEE VALUES (204,'Hermann','Baer',70,10000);

SELECT * FROM MY_EMPLOYEE;

--Q7
UPDATE MY_EMPLOYEE
SET salary = salary + (salary*0.10)
WHERE department_id = 90;

SELECT * FROM MY_EMPLOYEE;

--Q8
UPDATE MY_EMPLOYEE
SET last_name='Higgins'
WHERE employee_id=202;

SELECT * FROM MY_EMPLOYEE;

--Q9
DELETE FROM MY_EMPLOYEE
WHERE LOWER(first_name) LIKE '%man%'
OR LOWER(last_name) LIKE '%man%';

SELECT * FROM MY_EMPLOYEE;

--DDL
--Q1
CREATE TABLE DEPT
(
DEPT_ID NUMBER(7) PRIMARY KEY,
DEPT_NAME VARCHAR2(20)
);

DESC DEPT;

--Q2
INSERT INTO DEPT(DEPT_ID,DEPT_NAME)
SELECT DEPARTMENT_ID,DEPARTMENT_NAME
FROM DEPARTMENTS;

INSERT INTO DEPT VALUES(10,'Accounts');

INSERT INTO DEPT VALUES(NULL,'TT');

UPDATE DEPT
SET DEPT_ID=20
WHERE DEPT_NAME='TT';

INSERT INTO DEPT VALUES('A1','Accounts');

INSERT INTO DEPT VALUES(30,'Accounts');

SELECT * FROM DEPT;

--Q3
DROP TABLE EMP CASCADE CONSTRAINTS;

CREATE TABLE DEPT
(
    DEPT_ID NUMBER(7) PRIMARY KEY,
    DEPT_NAME VARCHAR2(20)
);

INSERT INTO DEPT VALUES (10,'Accounts');
INSERT INTO DEPT VALUES (20,'TT');
INSERT INTO DEPT VALUES (30,'Accounts');

CREATE TABLE EMP
(
    ID NUMBER(7) PRIMARY KEY,
    LAST_NAME VARCHAR2(25) NOT NULL,
    FIRST_NAME VARCHAR2(25),
    DEPT_ID NUMBER(7),
    CONSTRAINT EMP_DEPT_FK
    FOREIGN KEY (DEPT_ID)
    REFERENCES DEPT(DEPT_ID)
);

DESC EMP;

INSERT INTO EMP VALUES (101,'Ram','Krishna',20);
INSERT INTO EMP VALUES (102,'Gopi',NULL,40);
INSERT INTO EMP VALUES (103,NULL,'Ram',20);
SELECT * FROM EMP;

SELECT table_name
FROM user_tables
WHERE table_name = 'DEPT';

SELECT table_name
FROM user_tables
WHERE table_name = 'EMP';

SELECT * FROM user_errors;


DROP TABLE EMP CASCADE CONSTRAINTS;

DROP TABLE DEPT CASCADE CONSTRAINTS;

CREATE TABLE DEPT
(
    DEPT_ID NUMBER(7) PRIMARY KEY,
    DEPT_NAME VARCHAR2(20)
);

INSERT INTO DEPT VALUES (10,'Accounts');
INSERT INTO DEPT VALUES (20,'TT');
INSERT INTO DEPT VALUES (30,'Accounts');

CREATE TABLE EMP
(
    ID NUMBER(7) PRIMARY KEY,
    LAST_NAME VARCHAR2(25) NOT NULL,
    FIRST_NAME VARCHAR2(25),
    DEPT_ID NUMBER(7),
    CONSTRAINT EMP_DEPT_FK
    FOREIGN KEY (DEPT_ID)
    REFERENCES DEPT(DEPT_ID)
);

DESC EMP;

INSERT INTO EMP VALUES (101,'Sam','Sundar',10);

INSERT INTO EMP VALUES (101,'Ram','Krishna',20);

INSERT INTO EMP VALUES (102,'Gopi',NULL,40);

INSERT INTO EMP VALUES (103,NULL,'Ram',20);

SELECT * FROM EMP;

SELECT table_name
FROM user_tables
ORDER BY table_name;

SELECT object_name, object_type
FROM user_objects
WHERE object_name IN ('DEPT','EMP');

CREATE TABLE EMP
(
    ID NUMBER(7) PRIMARY KEY,
    LAST_NAME VARCHAR2(25) NOT NULL,
    FIRST_NAME VARCHAR2(25),
    DEPT_ID NUMBER(7),
    CONSTRAINT EMP_FK1
    FOREIGN KEY (DEPT_ID)
    REFERENCES DEPT(DEPT_ID)
);
DESC EMP;

INSERT INTO EMP VALUES (101,'Sam','Sundar',10);

SELECT * FROM EMP;