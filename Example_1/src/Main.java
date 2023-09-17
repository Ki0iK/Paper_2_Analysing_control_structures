public class Main {
    public static void main(String[] args)
    {
        int A = 5, B = 4, C = 1;
        int AB = A-B, AC = A-C, BC = B-C;

        if (AB * BC > 0)
            System.out.println(B);
        else if (AB * AC < 0)
            System.out.println(A);
        else
            System.out.println(C);
    }
}