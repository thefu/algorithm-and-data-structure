import com.sun.xml.internal.ws.api.model.CheckedException;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
        int n = scanner.nextInt ();
        int[] heigh = new int[n];
        for(int i = 0; i < n; i++){
            heigh[i] = scanner.nextInt ();
        }
        System.out.println ( maxCount ( n,heigh ) );

    }

    private static int maxCount(int n, int[] heigh){
        int flag = 1;
        int count = 0;
        for(int i = 0; i < n-1; i++){
            if (heigh[i] > heigh[i+1]){
                flag = flag + 1;
                continue;
            }else {
                if(flag > count) {
                    count = flag;
                }
                flag = 0;
            }
        }
        return count;
    }
}
