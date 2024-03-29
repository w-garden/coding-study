-- https://school.programmers.co.kr/learn/courses/30/lessons/164670

SELECT B.USER_ID 
     , B.NICKNAME
     , CITY || ' ' || STREET_ADDRESS1 || ' ' || STREET_ADDRESS2 AS 전체주소
     , REGEXP_REPLACE(TLNO, '(.{3})(.+)(.{4})','\1-\2-\3')  AS 전화번호
FROM
      (SELECT WRITER_ID
      FROM USED_GOODS_BOARD A
      GROUP BY WRITER_ID HAVING COUNT(WRITER_ID) >=3) A
    , USED_GOODS_USER B
WHERE A.WRITER_ID=B.USER_ID
ORDER BY B.USER_ID DESC

