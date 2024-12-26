package ch04;

public class IntStack {
    private int[] stk;      //스택용 배열
    private int capacity;   //스택 용량
    private int ptr;        //스택 포인터

    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {
        }
    }

    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {
        }
    }

    public IntStack(int maxLen) {
        ptr = 0;
        capacity = maxLen;
        try {
            stk = new int[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    //스택에 x를 푸시
    public int push(int x) throws OverflowIntStackException {
        if (ptr >= capacity)
            throw new OverflowIntStackException();
        return stk[ptr++] = x;
    }

    //스택에서 데이터를
    public int pop() throws EmptyIntStackException {
        if (ptr <= 0)
            throw new EmptyIntStackException();
        return stk[--ptr];
    }

    //스택에서 데이터를 피크(꼭대기에 있는 데이터를 들여다봄)
    public int peek() throws EmptyIntStackException {
        if (ptr <= 0)
            throw new EmptyIntStackException();
        return stk[ptr - 1];
    }

    //스택을 비움
    public void clear() {
        ptr = 0;
    }

    //검색 메서드
    public int indexOf(int x) {
        for (int i = ptr - 1; i >= 0; i--)
            if (stk[i] == x)
                return i;
        return -1;
    }

    //스택 용량 확인
    public int getCapacity() {
        return capacity;
    }

    //스택에 쌓여있는 데이터 개수를 반환
    public int size() {
        return ptr;
    }

    //스택이 비어있는가?
    public boolean isEmpty() {
        return ptr <= 0;
    }

    //스택이 가득 찼는가?
    public boolean isFull() {
        return ptr >= capacity;
    }

    //스택 안의 모든 데이터를 바닥 -> 꼭대기 순으로 출력
    public void dump() {
        if (ptr < 0)
            System.out.println("스택이 비어 있습니다.");
        else {
            for (int i = 0; i < ptr; i++)
                System.out.println(stk[i]+ " ");
            System.out.println();
        }
    }

}
