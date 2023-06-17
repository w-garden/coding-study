-- 판매중인 도서들의 도서 정보(BOOK)
-- 저자 정보(AUTHOR) 
-- 각 도서의 날짜 별 판매량 정보 (BOOK_SALES)
-- httpsschool.programmers.co.krlearncourses30lessons144856language=oracle
SELECT
        B.AUTHOR_ID
    ,   C.AUTHOR_NAME
    ,   B.CATEGORY
    ,   SUM((B.PRICE  A.SALES)) TOTAL_SALES
FROM 
       (SELECT  FROM BOOK_SALES WHERE TO_CHAR(SALES_DATE,'YYYYMM')='202201') A
    ,  BOOK B
    ,  AUTHOR C
WHERE
        A.BOOK_ID=B.BOOK_ID(+)
    AND B.AUTHOR_ID=C.AUTHOR_ID
GROUP BY 
    B.AUTHOR_ID, C.AUTHOR_NAME, B.CATEGORY
ORDER BY
    B.AUTHOR_ID, B.CATEGORY DESC
 