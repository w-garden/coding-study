-- 어느 의류 쇼핑몰에서 판매중인 상품들의 정보를 담은 PRODUCT
-- https://school.programmers.co.kr/learn/courses/30/lessons/131529
SELECT
 SUBSTR(PRODUCT_CODE,1,2) CATEGORY
 , COUNT(1)
FROM PRODUCT
GROUP BY SUBSTR(PRODUCT_CODE,1,2)
ORDER BY  SUBSTR(PRODUCT_CODE,1,2)