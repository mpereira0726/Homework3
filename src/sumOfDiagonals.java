public class sumOfDiagonals {
    public static void main(String[] args)
    {

        String[][] s1 = {{"2", "3", "4"},
                {"5", "6", "7"},
                {"8", "9", "10"}};

        String[][] s2 = {{"1", "2", "3"},
                {"5", "6", "7"},
                {"9", "10", "11"},
                {"13", "14", "15"}};
        String[][] s3 = {{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};
        try
        {
            sumOfDiagonals(s1);
            sumOfDiagonals(s2);
            sumOfDiagonals(s3);
        }
        catch(NumberFormatException ex)
        {
            System.out.println("Not a valid integer");
        }
        catch(IllegalArgumentException ex)
        {
            System.out.println("Array not a square");
        }
    }

    public static void sumOfDiagonals(String[][] x)
    {
        if(x.length == x[0].length)
        {
            int sum=0;
            for(int i = 0; i < x.length; i++)
            {
                sum +=Integer.parseInt(x [i][i]);
            }
            System.out.println(sum);
        }






    }
}