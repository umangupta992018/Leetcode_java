# Write your MySQL query statement below
SELECT P.firstName, p.lastName, s.city, s.state
from PERSON p
LEFT JOIN Address s
ON p.personId=s.personId;