public class Main {
    public static void main(String[] args)
    {
        int A = 1, B = 2, C = 3;
        int result = A;
        if (B > result)
            result = B;
        if (C > result)
            result = C;
        System.out.println(result);
    }
}