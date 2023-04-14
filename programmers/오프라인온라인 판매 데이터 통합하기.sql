SELECT * FROM (

SELECT 
      TO_CHAR(SALES_DATE, 'yyyy-mm-dd') SALES_DATE
    , PRODUCT_ID
    , USER_ID
    , SALES_AMOUNT 
FROM ONLINE_SALE 

UNION

SELECT TO_CHAR(SALES_DATE, 'yyyy-mm-dd') SALES_DATE
     , PRODUCT_ID
     , NULL USER_ID
     , SALES_AMOUNT 
FROM OFFLINE_SALE 
    )
WHERE SALES_DATE LIKE '2022-03-%'
ORDER BY SALES_DATE, PRODUCT_ID, USER_ID;