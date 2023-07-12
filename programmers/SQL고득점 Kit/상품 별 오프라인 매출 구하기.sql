-- 어느 의류 쇼핑몰에서 판매중인 상품들의 상품 정보를 담은 PRODUCT
-- 오프라인 상품 판매 정보를 담은 OFFLINE_SALE
-- https://school.programmers.co.kr/learn/courses/30/lessons/131533
SELECT   
       PRODUCT_CODE
     , SUM(SALES_AMOUNT)*PRICE SALES
FROM 
    PRODUCT A
  , OFFLINE_SALE B
WHERE A.PRODUCT_ID=B.PRODUCT_ID
 GROUP BY PRODUCT_CODE, PRICE
ORDER BY SALES DESC, PRODUCT_CODE
  
