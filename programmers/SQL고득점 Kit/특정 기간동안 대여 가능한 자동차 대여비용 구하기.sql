-- 어느 자동차 대여 회사에서 대여 중인 자동차들의 정보를 담은 CAR_RENTAL_COMPANY_CAR
-- 자동차 대여 기록 정보를 담은 CAR_RENTAL_COMPANY_RENTAL_HISTORY
-- 자동차 종류 별 대여 기간 종류 별 할인 정책 정보를 담은 CAR_RENTAL_COMPANY_DISCOUNT_PLAN
-- https://school.programmers.co.kr/learn/courses/30/lessons/157339
SELECT  A.CAR_ID 
     , A.CAR_TYPE 
     , A.DAILY_FEE*(1-C.DISCOUNT_RATE*0.01)*30 FEE
FROM CAR_RENTAL_COMPANY_CAR A
    ,(SELECT MAX(HISTORY_ID) HISTORY_ID, CAR_ID  
      FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
      WHERE CAR_ID NOT IN (SELECT CAR_ID
                           FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
                           WHERE '202211' 
                           BETWEEN TO_CHAR(START_DATE,'YYYYMMDD') AND TO_CHAR(END_DATE,'YYYYMMDD'))
      GROUP BY CAR_ID) B
    ,CAR_RENTAL_COMPANY_DISCOUNT_PLAN C
WHERE A.CAR_ID=B.CAR_ID
 AND  A.CAR_TYPE=C.CAR_TYPE
 AND  A.CAR_TYPE IN ('SUV','세단')
 AND  C.DURATION_TYPE='30일 이상'
 AND  A.DAILY_FEE*(1-C.DISCOUNT_RATE*0.01)*30 BETWEEN 500000 AND 2000000
ORDER BY FEE DESC, A.CAR_TYPE, CAR_ID DESC
