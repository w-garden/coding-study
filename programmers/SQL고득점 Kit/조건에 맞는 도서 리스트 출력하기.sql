--https://school.programmers.co.kr/learn/courses/30/lessons/144853?language=oracle
SELECT BOOK_ID 
     , TO_CHAR(PUBLISHED_DATE,'YYYY-MM-DD') PUBLISHED_DATE
FROM
     BOOK
WHERE 
     TO_CHAR(PUBLISHED_DATE,'YYYY') = '2021'
 AND CATEGORY='인문'
ORDER BY   
     PUBLISHED_DATE 
;
    