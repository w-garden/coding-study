-- 고객의 정보를 담은 MEMBER_PROFILE
-- 식당의 리뷰 정보를 담은 REST_REVIEW
--https://school.programmers.co.kr/learn/courses/30/lessons/131124
SELECT
    A.MEMBER_NAME
  , B.REVIEW_TEXT
  , TO_CHAR(REVIEW_DATE,'YYYY-MM-DD') REVIEW_DATE
FROM 
      MEMBER_PROFILE A, REST_REVIEW B
WHERE
     A.MEMBER_ID=B.MEMBER_ID
 AND B.MEMBER_ID IN 
                (SELECT MEMBER_ID 
                 FROM   
                    (SELECT MEMBER_ID, COUNT(*) CNT
                      FROM REST_REVIEW 
                      GROUP BY MEMBER_ID)
                 WHERE CNT=(SELECT MAX(CNT) MAXCNT FROM
                    ( SELECT MEMBER_ID, COUNT(*) CNT
    FROM REST_REVIEW GROUP BY MEMBER_ID)))
ORDER BY
    REVIEW_DATE, B.REVIEW_TEXT
    