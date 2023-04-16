# 주어진 문자열이 Palindrome 인지 확인하라. 대소문자 구분 X, 영문자와 숫자만을 대상
# 팰린드롬이란 ? 앞뒤가 똑같은 문장을 말한다. 앞으로 읽어도 뒤로 읽어도 똑같은 문장을
import collections
import re
from typing import Deque

ex01 = "A man, a plan, a canal: Panama"
ex02 = "race a car"
ex03 = "how are you?"


class isPalindrome:
    # 리스트로 변환해서 풀기
    # pop(0) 은 O(n) 의 시간 복잡도
    def isPalindrome1(self, s: str) -> bool:
        strs = []
        for char in s:
            if char.isalnum():
                strs.append(char.lower())

        while len(strs) > 1:
            if strs.pop(0) != strs.pop():
                return False
        return True

    # 데크 자료형을 이용한 최적화
    # popleft 는 O(1) 의 시간 복잡도
    def isPalindrome2(self, s: str) -> bool:
        strs: Deque = collections.deque()

        for char in s:
            if char.isalnum():
                strs.append(char.lower())

        while len(strs) > 1:
            if strs.popleft() != strs.pop():
                return False

        return True

    def isPalindrome3(self, s: str) -> bool:
        s = s.lower()
        s = re.sub('[^a-z0-9]', '', s)

        return s == s[::-1]  # 슬라이싱


p = isPalindrome()
print(p.isPalindrome1(ex01))
print(p.isPalindrome2(ex01))
print(p.isPalindrome3(ex03))
