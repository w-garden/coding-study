-- https://school.programmers.co.kr/learn/courses/30/lessons/59414
SELECT
       ANIMAL_ID
     , NAME
     , TO_CHAR(DATETIME,'YYYY-MM-DD') 날짜
FROM ANIMAL_INS
ORDER BY ANIMAL_ID
