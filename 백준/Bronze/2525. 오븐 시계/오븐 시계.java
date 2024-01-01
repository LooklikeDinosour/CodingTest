import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        String min = sc.nextLine();
        int minute = Integer.parseInt(min.trim());
        int cookMinute = sc.nextInt();

        for (int i = 1; i <= cookMinute; i++) {
            minute++;
            if (minute > 59) {
                minute = 0;
                hour++;
            }
            if (hour > 23) {
                hour = 0;
            }
        }
        System.out.println(hour + " " + minute);
    }
}
