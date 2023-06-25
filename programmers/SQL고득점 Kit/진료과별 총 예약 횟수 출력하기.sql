-- 종합병원의 진료 예약정보를 담은 APPOINTMENT
-- https://school.programmers.co.kr/learn/courses/30/lessons/132202
SELECT
    MCDP_CD AS "진료과코드"
  , COUNT(*) AS "5월예약건수"
FROM
    APPOINTMENT 
WHERE TO_CHAR(APNT_YMD,'YYYYMM')='202205'
GROUP BY MCDP_CD
ORDER BY COUNT(*), MCDP_CD  