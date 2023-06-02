--https://school.programmers.co.kr/learn/courses/30/lessons/131118
-- 식당의 정보 REST_INFO 
-- 식당의 리뷰 정보 REST_REVIEW 
SELECT
      A.REST_ID	
    , A.REST_NAME	
    , A.FOOD_TYPE	
    , A.FAVORITES	
    , A.ADDRESS
    , ROUND(B.SCORE,2) SCORE 
FROM
      REST_INFO A
    , (SELECT REST_ID, AVG(REVIEW_SCORE) SCORE                     
       FROM REST_REVIEW GROUP BY REST_ID) B          
WHERE
    A.REST_ID=B.REST_ID
AND A.ADDRESS LIKE '서울%'
ORDER BY
    SCORE DESC
  , A.FAVORITES	DESC
;