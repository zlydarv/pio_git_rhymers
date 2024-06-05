package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int TOTAL_NUMBERS = 12;
    public static final int EMPTY = -1;
    public static final int MAX_CAPACITY = TOTAL_NUMBERS - 1;
	
    private int[] NUMBERS = new int[TOTAL_NUMBERS];

    public int total = EMPTY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }
    public boolean callCheck() {
        return total == EMPTY;
    }
        
     public boolean isFull() {
        return total == MAX_CAPACITY;
    }
        
    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        return numbers[total];
    }
    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }

}
