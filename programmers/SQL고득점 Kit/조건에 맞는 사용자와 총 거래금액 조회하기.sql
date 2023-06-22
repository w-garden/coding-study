-- 중고 거래 게시판 정보를 담은 USED_GOODS_BOARD
-- 중고 거래 게시판 첨부파일 정보를 담은 USED_GOODS_USER
-- https://school.programmers.co.kr/learn/courses/30/lessons/164668
SELECT 
      A.WRITER_ID 
    , B.NICKNAME
    , A.TOTAL_SALES
FROM
    (SELECT
            WRITER_ID
        ,   SUM(PRICE) TOTAL_SALES
        FROM
            USED_GOODS_BOARD A
        WHERE STATUS='DONE'
        GROUP BY WRITER_ID) A
    , USED_GOODS_USER B
WHERE 
     A.WRITER_ID=B.USER_ID
 AND A.TOTAL_SALES>=700000
ORDER BY A.TOTAL_SALES
    
