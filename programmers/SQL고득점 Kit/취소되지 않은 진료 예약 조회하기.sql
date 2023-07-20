-- 환자 정보를 담은 PATIENT
-- DOCTOR 테이블
-- APPOINTMENT 테이블
-- https://school.programmers.co.kr/learn/courses/30/lessons/132204
SELECT
      APNT_NO
    , A.PT_NAME
    , A.PT_NO
    , C.MCDP_CD
    , B.DR_NAME
    , C.APNT_YMD 
FROM  PATIENT A
    , DOCTOR B
    , APPOINTMENT C
WHERE C.PT_NO=A.PT_NO  
  AND C.MDDR_ID=B.DR_ID
  AND TO_CHAR(C.APNT_YMD,'YYYYMMDD') ='20220413'
  AND C.MCDP_CD='CS'
  AND C.APNT_CNCL_YN='N'
ORDER BY C.APNT_YMD


