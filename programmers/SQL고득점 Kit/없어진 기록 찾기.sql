-- ANIMAL_INS 테이블은 동물 보호소에 들어온 동물의 정보를 담은 테이블
-- ANIMAL_OUTS 테이블은 동물 보호소에서 입양 보낸 동물의 정보를 담은 테이블
-- https://school.programmers.co.kr/learn/courses/30/lessons/59042
SELECT ANIMAL_ID
     , NAME
FROM ANIMAL_OUTS
WHERE ANIMAL_ID NOT IN (
    SELECT  A.ANIMAL_ID
    FROM ANIMAL_INS A  
       , ANIMAL_OUTS B
    WHERE   A.ANIMAL_ID = B.ANIMAL_ID)
ORDER BY ANIMAL_ID