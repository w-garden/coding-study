-- 어느 한 서점에서 판매중인 도서들의 도서 정보 BOOK
-- 저자 정보 AUTHOR
--https://school.programmers.co.kr/learn/courses/30/lessons/144854?language=oracle
SELECT
      A.BOOK_ID
    , AUTHOR_NAME
    , TO_CHAR(PUBLISHED_DATE,'YYYY-MM-DD') PUBLISHED_DATE
FROM
BOOK A, AUTHOR B
WHERE 
     A.AUTHOR_ID=B.AUTHOR_ID
 AND A.CATEGORY='경제'
ORDER BY PUBLISHED_DATE