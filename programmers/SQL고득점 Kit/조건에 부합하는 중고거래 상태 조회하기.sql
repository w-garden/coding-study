-- 중고거래 게시판 정보를 담은 USED_GOODS_BOARD
-- https://school.programmers.co.kr/learn/courses/30/lessons/164672
SELECT
     BOARD_ID
   , WRITER_ID
   , TITLE
   , PRICE
   , DECODE(STATUS,'DONE','거래완료','SALE','판매중','RESERVED','예약중') STATUS
FROM 
    USED_GOODS_BOARD
WHERE 
    TO_CHAR(CREATED_DATE,'YYYYMMDD') = '20221005'
ORDER BY
    BOARD_ID DESC