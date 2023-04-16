# 주어진 문자열이 Palindrome 인지 확인하라. 대소문자 구분 X, 영문자와 숫자만을 대상
# 팰린드롬이란 ? 앞뒤가 똑같은 문장을 말한다. 앞으로 읽어도 뒤로 읽어도 똑같은 문장을
ex01 = "A man, a plan, a canal: Panama"
ex02 = "race a car"


class isPalindrome:
    def isPalindrome(self, s: str) -> bool:
        strs = []
        for char in s:
            if char.isalnum():
                strs.append(char.lower())

        while len(strs) > 1:
            if strs.pop(0) != strs.pop():
                return False
        return True


p = isPalindrome()
print(p.isPalindrome(ex01))
