-- ANIMAL_INS 테이블은 동물 보호소에 들어온 동물의 정보를 담은 테이블
-- ANIMAL_OUTS 테이블은 동물 보호소에서 입양 보낸 동물의 정보를 담은 테이블
-- https://school.programmers.co.kr/learn/courses/30/lessons/59045#fn1
SELECT
    A.ANIMAL_ID, A.ANIMAL_TYPE, A.NAME
FROM
      ANIMAL_INS A
    , ANIMAL_OUTS B
WHERE A.ANIMAL_ID=B.ANIMAL_ID
  AND (B.SEX_UPON_OUTCOME LIKE 'Spayed%' OR 
       B.SEX_UPON_OUTCOME LIKE 'Neutered%')
  AND A.SEX_UPON_INTAKE LIKE 'Intact%'
ORDER BY
    A.ANIMAL_ID
  
  