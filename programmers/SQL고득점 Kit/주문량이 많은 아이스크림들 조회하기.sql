-- 아이스크림 가게의 상반기 주문 정보를 담은 FIRST_HALF
-- 7월의 아이스크림 주문 정보를 담은 JULY
--https://school.programmers.co.kr/learn/courses/30/lessons/133027
SELECT FLAVOR 
FROM (
    SELECT A.TOTAL_ORDER+B.TOTAL_ORDER TOTAL_ORDER, A.FLAVOR  FROM 
        (SELECT SUM(TOTAL_ORDER) TOTAL_ORDER, FLAVOR FROM FIRST_HALF GROUP BY FLAVOR) A
      , (SELECT SUM(TOTAL_ORDER) TOTAL_ORDER, FLAVOR FROM JULY GROUP BY FLAVOR) B
    WHERE A.FLAVOR=B.FLAVOR
    ORDER BY TOTAL_ORDER DESC) A
WHERE ROWNUM <4