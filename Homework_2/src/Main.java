public class Main {
    public static void main(String[] args)
    {
        int result, x = 5, y = -7, M;
        result = 0;

        if (y < 0)
        {
            y = -y;
            M = -1;
        }
        else
            M = 1;

        while (y > 0) {
            if (y % 2 == 0)
            {
                x = x + x;
                y = y / 2;
            }
            else
            {
                result = result + x;
                y = y - 1;
            }
        }
        if (M < 0)
            result = -result;

        System.out.println(result);
    }
}