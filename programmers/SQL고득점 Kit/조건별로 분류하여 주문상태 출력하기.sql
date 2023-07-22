-- 식품공장의 주문정보를 담은 FOOD_ORDER
-- https://school.programmers.co.kr/learn/courses/30/lessons/131113
SELECT
      ORDER_ID
    , PRODUCT_ID
    , TO_CHAR(OUT_DATE,'YYYY-MM-DD') OUT_DATE
    , CASE WHEN TO_CHAR(OUT_DATE,'YYYYMMDD') <='20220501' THEN '출고완료'
           WHEN OUT_DATE IS NULL THEN '출고미정'
           ELSE '출고대기'
    END "출고여부"
FROM FOOD_ORDER
ORDER BY ORDER_ID
