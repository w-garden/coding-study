--  상반기 주문 정보를 담은 FIRST_HALF
--  아이스크림 성분에 대한 정보를 담은 ICECREAM_INFO 
--https://school.programmers.co.kr/learn/courses/30/lessons/133025
SELECT A.FLAVOR
FROM 
    FIRST_HALF A, ICECREAM_INFO B
WHERE
    A.FLAVOR=B.FLAVOR(+)
AND A.TOTAL_ORDER>3000
AND B.INGREDIENT_TYPE='fruit_based'
ORDER BY
 A.TOTAL_ORDER DESC
 