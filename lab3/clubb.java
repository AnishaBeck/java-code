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

        public int cal_point() {
            Scanner match = new Scanner(System.in);
            total_match = match.nextInt();
            win = ((stat_wins / total_match) * 10);
            loss = ((stat_loss / total_match) * 10);
            draw = ((stat_draw / total_match) * 10);
            goal = ((stat_goals / total_match) * 10);
            assist = ((stat_assist / total_match) * 10);
            attempt = ((stat_attempt / total_match) * 10);

            point = (win + goal + assist + attempt) - (loss + draw);
            return point;
        }

    }
}
