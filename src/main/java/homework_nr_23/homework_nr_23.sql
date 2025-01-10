CREATE TABLE Students (
    studentID INT PRIMARY KEY,
    name TEXT,
    surname TEXT,
    age INT,
    sex TEXT
);

INSERT INTO Students (studentID, name, surname, age, sex)
VALUES
    (1, 'Alice', 'Smith', 20, 'Female'),
    (2, 'Bob', 'Johnson', 22, 'Male'),
    (3, 'Charlie', 'Brown', 19, 'Male'),
    (4, 'Diana', 'Lee', 21, 'Female'),
    (5, 'Emily', 'Davis', 23, 'Female');

UPDATE Students
SET age = 24
WHERE name = 'Emily' AND surname = 'Davis';


DELETE FROM Students
WHERE name = 'Charlie' AND surname = 'Brown';

SELECT name, age
FROM Students
WHERE sex = 'Female';

SELECT name
FROM Students
WHERE surname LIKE 'C%';