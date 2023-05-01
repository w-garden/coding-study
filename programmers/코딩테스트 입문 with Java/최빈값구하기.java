import java.util.*;

/**
 * school.programmers.co.kr/learn/courses/30/lessons/120812
 */
public class 최빈값구하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,3,3,4}));
        System.out.println(solution(new int[]{1,1,2,2}));
        System.out.println(solution(new int[]{1}));
        System.out.println(solution(new int[]{1,1}));
        System.out.println(solution(new int[]{2,2,2,2}));
    }
    public static int solution(int[] array) {
        int answer = 0;
        int temp=0;

        if(array.length==1){ //원소가 1개일때
            return array[0];
        }
        Arrays.sort(array);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i< array.length;i++){
            if(map.get(array[i])==null){
                map.put(array[i],1);
            }
            else{
                map.put(array[i], map.get(array[i])+1);
            }
        }

        for (Integer i : map.keySet()) { //최빈값 구하기
            if(temp<map.get(i)){
                temp=map.get(i);
                answer=i;
            }
        }
        Integer[] values = new Integer[map.size()];
        temp=0;
        for (Integer value : map.values()) { //중복값체크
            values[temp]=value;
            temp++;
        }
        Arrays.sort(values,Collections.reverseOrder());
        if(values.length==1){
            return array[0];
        }
        if(values[0]==values[1]){
            return -1;
        }
        return answer;
    }
}
