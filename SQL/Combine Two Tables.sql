# Write your MySQL query statement below
SELECT a.city, a.state,p.firstname, p.lastname
FROM Person p
LEFT JOIN Address a
ON a.personid = p.personid;
