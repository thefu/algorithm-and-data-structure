import java.util.Scanner;

public class DataRequire {
    static int  require(int month, int day, boolean f){
        int sum=0;

        switch (month-1) {

            case 11:
                sum = sum +30;
            case 10:
                sum = sum +31;
            case 9:
                sum = sum +30;
            case 8:
                sum = sum +31;
            case 7:
                sum = sum +31;
            case 6:
                sum = sum +30;
            case 5:
                sum = sum +31;
            case 4:
                sum = sum +30;
            case 3:
                sum = sum +31;
            case 2:
            {if ( f)
                sum = sum +28;
            else
                sum = sum +29;
            }
            case 1:
                sum = sum +31;
                break;
        }
        return sum+day ;


    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int year, day, month;
        boolean f =false;
        System.out.println("请输入年月日：");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        month = sc.nextInt();
        day = sc.nextInt();


        if ( year %4 ==0 && year%100!=0 || year%400 ==0)
            f = true;


        int sum = require(month,day, f);
        System.out.println("是第"+sum+"天");

    }

}
