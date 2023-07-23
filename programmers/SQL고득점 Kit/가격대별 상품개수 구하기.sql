-- httpsschool.programmers.co.krlearncourses30lessons131530
SELECT
      TRUNC(PRICE,-4)
    , COUNT(1)   
FROM PRODUCT 
GROUP BY TRUNC(PRICE,-4)
ORDER BY TRUNC(PRICE,-4)
