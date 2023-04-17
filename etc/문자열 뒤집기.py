#문자열을 뒤집는 함수를 작성하라. 입력 값은 문자 배열이며 리턴 없이 리스트 내부를 직접 조작하라
from typing import List

s= ["h","e","l","l","o"]
b= ["H","a","n","n","a","h"]
c= "abcdefghijklmnopqrstuwxyz"
#투 포인터를 이용한 스왑


class reverseString:
    def reverseString(self, s:List[str]) ->None:
        left, right = 0, len(s)-1
        while left < right:
            s[left],s[right] = s[right],s[left]
            left+=1
            right-=1
        print(s)
    def reverseString2(self, s:List[str])-> None:
        s.reverse()
r=reverseString()
r.reverseString(list(c))
r.reverseString2(list(c))