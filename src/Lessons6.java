import java.util.Arrays;

import static org.junit.Assert.*;

public class Lessons6 {

    public int solution62(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        return Math.max(A[A.length - 1] * A[A.length - 2] * A[A.length - 3], A[A.length - 1] * A[0] * A[1]);
    }

    @org.junit.Test
    public void test62() {
        System.out.println(solution62(new int[]{-3, 1, 2, -2, 5, 6}));
        System.out.println(solution62(new int[]{-5, 5, -5, 2}));
    }

    @org.junit.Test
    public void test63() {
        System.out.println(solution63(new int[]{10, 2, 5, 1, 8, 20}));//1
        System.out.println(solution63(new int[]{10, 50, 5, 1}));//0
    }

    public int solution63(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        for (int i = 0; i < A.length - 2; i++) {
            if (A[i] + A[i + 1] > A[i + 2])
                return 1;
        }
        return 0;
    }

    @org.junit.Test
    public void test64() {
        System.out.println(solution64(new int[]{1, 5, 2, 1, 4, 0}));//1
//        System.out.println(solution63(new int[]{10, 50, 5, 1}));//0
    }


    public int solution64(int[] A) {
        int counter = 0;
        for (int i = 0; i < A.length; i++) {

        }
        return counter;
    }
}