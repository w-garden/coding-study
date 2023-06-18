-- 아이스크림 가게의 상반기 주문 정보를 담은 FIRST_HALF
-- 아이스크림 성분에 대한 정보를 담은 ICECREAM_INFO
--https://school.programmers.co.kr/learn/courses/30/lessons/133026
SELECT
        INGREDIENT_TYPE
    ,	SUM(TOTAL_ORDER) TOTAL_ORDER
FROM
        FIRST_HALF A
    , ICECREAM_INFO B
WHERE 
    A.FLAVOR=B.FLAVOR
GROUP BY 
    INGREDIENT_TYPE
ORDER BY 
    TOTAL_ORDER