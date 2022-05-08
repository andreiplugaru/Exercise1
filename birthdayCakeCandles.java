import java.util.Scanner;

public class birthdayCakeCandles {
    public static void main(String[] args) {
        int n;
        int max = -1, maxCandles = 0, current;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            current = scanner.nextInt();
            if(current > max)
            {
                max = current;
                maxCandles = 1;
            }
            else if(current == max)
                maxCandles++;
        }
        System.out.println(maxCandles);

    }
}
