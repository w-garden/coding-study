-- ANIMAL_INS 테이블은 동물 보호소에 들어온 동물의 정보를 담은 테이블
-- https://school.programmers.co.kr/learn/courses/30/lessons/59046
SELECT
ANIMAL_ID, NAME, SEX_UPON_INTAKE
FROM
ANIMAL_INS
WHERE NAME IN ('Lucy', 'Ella', 'Pickle', 'Rogan', 'Sabrina', 'Mitty')
ORDER BY ANIMAL_ID