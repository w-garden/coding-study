/* 어느 의류 쇼핑몰에 가입한 회원 정보를 담은 USER_INFO
   온라인 상품 판매 정보를 담은 ONLINE_SALE
   년, 월, 성별 별로 상품을 구매한 회원수를 집계하는 SQL문을 작성. 성별 정보가 없는 경우 결과에서 제외
*/
--https://school.programmers.co.kr/learn/courses/30/lessons/131532
SELECT
        TO_CHAR(B.SALES_DATE,'YYYY') YEAR
      , TO_NUMBER(TO_CHAR(B.SALES_DATE,'MM')) MONTH
      , A.GENDER
      , COUNT(DISTINCT B.USER_ID) USERS
FROM USER_INFO A, ONLINE_SALE B
WHERE A.USER_ID=B.USER_ID
  AND A.GENDER IS NOT NULL
GROUP BY TO_CHAR(B.SALES_DATE,'YYYY'),TO_NUMBER(TO_CHAR(B.SALES_DATE,'MM')), A.GENDER
ORDER BY YEAR, MONTH, GENDER

