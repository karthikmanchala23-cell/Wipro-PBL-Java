-- ============================================================
-- TM809 -> RDBMS / SQL / JDBC
-- Table creation + seed data (run in SQL*Plus / SQL Command Line)
-- ============================================================

CREATE TABLE users (
    UserID            VARCHAR2(200),
    Password          VARCHAR2(200),
    Name              VARCHAR2(200),
    IncorrectAttempts NUMBER(2),
    LockStatus        NUMBER(2),
    UserType          VARCHAR2(200)
);

INSERT INTO users VALUES ('AB1001', 'AB1001', 'Hari',    0, 0, 'Admin');
INSERT INTO users VALUES ('TA1002', 'TA1002', 'Prasath', 0, 0, 'Employee');
INSERT INTO users VALUES ('RS1003', 'RS1003', 'Ganesh',  0, 0, 'Employee');

COMMIT;

SELECT * FROM users;
