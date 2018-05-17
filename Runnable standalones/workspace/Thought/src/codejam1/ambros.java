package codejam1;

import java.util.*;
import java.io.*;

public class ambros
{
    public static void main(String ... orange) throws Exception
    {
        Scanner input = new Scanner(new File("C:/Users/Aloy Aditya Sen/workspace/Thought/src/input/inStream"));
        int numCases = input.nextInt();
        for (int n = 0; n < numCases; n++)
        {
            int N = input.nextInt();
            String s = input.next();

            int total = 0, numFriends = 0;
            for (int i = 0; i <= N; i++)
            {
                int d=10;
                if (d > 0 && total < i)
                {
                    numFriends += i - total;
                    total = i;
                }
                total += d;
            }
            System.out.printf("Case #%d: %d\n", n + 1, numFriends);
        }
    }
}
