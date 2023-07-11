-- ANIMAL_INS 테이블은 동물 보호소에 들어온 동물의 정보를 담은 테이블
-- ANIMAL_OUTS 테이블은 동물 보호소에서 입양 보낸 동물의 정보를 담은 테이블
SELECT A.NAME, A.DATETIME 
FROM (
    SELECT
        A.*
    FROM 
          ANIMAL_INS A  
        , ANIMAL_OUTS B
    WHERE A.ANIMAL_ID=B.ANIMAL_ID(+)
      AND A.ANIMAL_ID NOT IN (SELECT ANIMAL_ID FROM ANIMAL_OUTS)
    ORDER BY A.DATETIME 
    ) A
WHERE ROWNUM <4
ORDER BY A.DATETIME