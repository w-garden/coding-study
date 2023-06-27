-- ONLINE_SALE 어느 의류 쇼핑몰의 온라인 상품 판매 정보
-- https://school.programmers.co.kr/learn/courses/30/lessons/131536
SELECT
       USER_ID
     , PRODUCT_ID
FROM
    ONLINE_SALE
GROUP BY
    USER_ID, PRODUCT_ID HAVING COUNT(*) >1
ORDER BY 
  USER_ID, PRODUCT_ID DESC