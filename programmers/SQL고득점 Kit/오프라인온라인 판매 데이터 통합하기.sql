-- 어느 의류 쇼핑몰의 온라인 상품 판매 정보를 담은 ONLINE_SALE
-- 오프라인 상품 판매 정보를 담은 OFFLINE_SALE
    
SELECT * 
FROM 
    (SELECT 
            TO_CHAR(SALES_DATE,'YYYY-MM-dd') SALES_DATE
        ,   PRODUCT_ID
        ,   USER_ID
        ,   SALES_AMOUNT
    FROM
        ONLINE_SALE
    UNION ALL
    SELECT 
            TO_CHAR(SALES_DATE,'YYYY-MM-dd') SALES_DATE
        ,   PRODUCT_ID
        ,   NULL AS USER_ID
        ,   SALES_AMOUNT
    FROM 
        OFFLINE_SALE)
WHERE
    SALES_DATE LIKE '2022-03-%'
ORDER BY
    SALES_DATE, PRODUCT_ID, USER_ID