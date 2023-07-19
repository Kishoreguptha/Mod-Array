public class ModArray {
    public static void main(String[] args) {
        int[] A = {1, 4, 3};
        int B = 2;
        int result = modArray(A, B);
        System.out.println("A % B = " + result);

        A = new int[]{4, 3, 5, 3, 5, 3, 2, 1};
        B = 47;
        result = modArray(A, B);
        System.out.println("A % B = " + result);
    }

    public static int modArray(int[] A, int B) {
        int num = 0;
        for (int i = 0; i < A.length; i++) {
            num = (num * 10 + A[i]) % B;
        }
        return num;
}
}