import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        for(int i = 1; i <= 45; i++) {
            if(minute <= 0) {
                minute = 60;
                hour--;
            }
            if(hour < 0) {
                hour = 23;
            }
            minute--;
        }
        System.out.println(hour + " " + minute);
    }
}
