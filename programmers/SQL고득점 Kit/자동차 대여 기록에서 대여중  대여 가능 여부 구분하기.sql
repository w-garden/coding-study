-- 어느 자동차 대여 회사의 자동차 대여 기록 정보를 담은 CAR_RENTAL_COMPANY_RENTAL_HISTORY
-- https://school.programmers.co.kr/learn/courses/30/lessons/157340
SELECT CAR_ID, MAX(AVAILABILITY) FROM (
SELECT 
     A.CAR_ID
   , CASE 
        WHEN '20221016' 
            BETWEEN TO_CHAR(START_DATE,'YYYYMMDD') 
                AND TO_CHAR(END_DATE,'YYYYMMDD') 
         THEN '대여중'
        ELSE '대여 가능'
     END AVAILABILITY
FROM
    CAR_RENTAL_COMPANY_RENTAL_HISTORY A)
GROUP BY CAR_ID
ORDER BY CAR_ID DESC