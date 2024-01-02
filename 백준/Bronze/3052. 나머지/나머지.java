import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] count = new int[42];
        int[] anss = new int[10];
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++) {
            String answers = sc.nextLine();
            anss[i] = Integer.parseInt(answers.trim());
            count[anss[i]%42]++;
        }
     
        
        for(int i = 0; i < count.length; i++) {
            if(count[i] != 0) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}