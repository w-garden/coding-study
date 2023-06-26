-- 어느 자동차 대여 회사에서 대여중인 자동차들의 정보를 담은 CAR_RENTAL_COMPANY_CAR
-- https://school.programmers.co.kr/learn/courses/30/lessons/157343
SELECT
        CAR_ID
    ,	CAR_TYPE
    ,	DAILY_FEE
    ,	OPTIONS
FROM 
    CAR_RENTAL_COMPANY_CAR
WHERE
    OPTIONS LIKE '%네비게이션%'
ORDER BY
    CAR_ID DESC