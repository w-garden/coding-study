-- 어느 한 서점에서 판매중인 도서들의 도서 정보 BOOK
-- 판매 정보 BOOK_SALES
-- https://school.programmers.co.kr/learn/courses/30/lessons/144855
SELECT
    CATEGORY
  , SUM(SALES) TOTAL_SALES
FROM 
    BOOK A
  , BOOK_SALES B
WHERE
     A.BOOK_ID=B.BOOK_ID
 AND TO_CHAR(SALES_DATE,'YYYYMM')='202201'
GROUP BY CATEGORY
ORDER BY CATEGOR