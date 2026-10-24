# Write your MySQL query statement below
SELECT e.name, b.bonus
From Employee e
LEFT JOIN Bonus b
ON e.empid = b.empid
WHERE b.bonus < 1000
OR b.bonus is NULL;
