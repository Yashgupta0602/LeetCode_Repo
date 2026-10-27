# Write your MySQL query statement below
Select p.email
FROM Person p 
Group By p.email
HAVING count(*) > 1;
