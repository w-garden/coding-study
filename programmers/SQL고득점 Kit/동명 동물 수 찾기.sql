
-- ANIMAL_INS 테이블은 동물 보호소에 들어온 동물의 정보를 담은 테이블 
-- https://school.programmers.co.kr/learn/courses/30/lessons/59041?language=oracle
SELECT NAME, COUNT(*) COUNT
FROM ANIMAL_INS
WHERE NAME IS NOT NULL
GROUP BY NAME HAVING COUNT(*) >1
ORDER BY NAME
