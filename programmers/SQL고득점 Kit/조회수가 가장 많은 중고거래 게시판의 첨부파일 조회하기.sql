-- 중고거래 게시판 정보를 담은 USED_GOODS_BOARD
-- 중고거래 게시판 첨부파일 정보를 담은 USED_GOODS_FILE
-- https://school.programmers.co.kr/learn/courses/30/lessons/164671

SELECT  
    '/home/grep/src/'||BOARD_ID||'/'||FILE_ID||FILE_NAME||FILE_EXT AS FILE_PATH
FROM USED_GOODS_FILE 
WHERE BOARD_ID=
        (SELECT BOARD_ID 
         FROM 
            (SELECT *
             FROM USED_GOODS_BOARD 
             ORDER BY VIEWS DESC)
        WHERE ROWNUM =1)
ORDER BY FILE_ID DESC