-- ANIMAL_OUTS 테이블은 동물 보호소에서 입양 보낸 동물의 정보를 담은 테이블
-- https://school.programmers.co.kr/learn/courses/30/lessons/59413
SELECT A.HOUR
     , NVL(B.COUNT,0)
FROM 
      (SELECT LEVEL-1 AS HOUR FROM DUAL CONNECT BY LEVEL <=24) A
    , (SELECT TO_NUMBER(TO_CHAR(DATETIME,'HH24')) HOUR
            , COUNT(1) COUNT
       FROM ANIMAL_OUTS
       GROUP BY TO_NUMBER(TO_CHAR(DATETIME,'HH24'))) B
WHERE A.HOUR=B.HOUR(+)
ORDER BY A.HOUR


