import java.io.*;
import java.util.Scanner;

public class clubb {
    public class statistics {
        String stat_id;
        String stat_type;
        int stat_wins;
        int stat_loss;
        int stat_draw;
        int stat_goals;
        int stat_assist;
        int stat_attempt;
        int total_match;
        float point;

        statistics() {
            Scanner match = new Scanner(System.in);
            total_match = match.nextInt();
            float win = ((stat_wins / total_match) * 10);
            float loss = ((stat_loss / total_match) * 10);
            float draw = ((stat_draw / total_match) * 10);
            float goal = ((stat_goals / total_match) * 10);
            float assist = ((stat_assist / total_match) * 10);
            float attempt = ((stat_attempt / total_match) * 10);
            if (win > 0) {
                point = (win + goal + assist + attempt) - (loss + draw);
            } else {
                System.out.println("weight of wins cannot be less than 0");
            }
        }

        public int cal_rank() {
            Scanner p = new Scanner(System.in);
            point = p.nextFloat();

            // function for array ranking:
            int[] array1 = new int[] { 10, 22, 45, 6, 7, 25 };
            int[][] ranked = new int[array1.length][2];
            for (int i = 0; i < array1.length; i++)
                ranked[i][0] = array1[i];
            Arrays.sort(array1);

            for (int i = 0; i < array1.length; i++)
                for (int n = 0; n < array1.length; n++)
                    if (ranked[n][0] == array1[i] && ranked[n][1] == 0)
                        ranked[n][1] = array1.length - i;
        }

    }
}
