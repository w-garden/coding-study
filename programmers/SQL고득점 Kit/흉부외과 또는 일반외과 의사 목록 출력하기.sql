--https://school.programmers.co.kr/learn/courses/30/lessons/132203

SELECT
      DR_NAME	
    , DR_ID	
    , MCDP_CD	
    , TO_CHAR(HIRE_YMD,'YYYY-MM-DD') HIRE_YMD
FROM 
    DOCTOR 
WHERE
    MCDP_CD IN ('CS','GS')
ORDER BY
    HIRE_YMD DESC
  , DR_NAME
;