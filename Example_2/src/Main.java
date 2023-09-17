public class Main {
    public static void main(String[] args)
    {
        int result, x = 2, y = 5;
        result = 1;

        while (y > 0)
        {
            if (y % 2 == 0)
            {
                y = y / 2;
                x = x * x;
            }
            else
            {
                y = y - 1;
                result = result * x;
            }
        }
        System.out.println(result);
    }
}