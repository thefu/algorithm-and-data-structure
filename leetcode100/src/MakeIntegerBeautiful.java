public class MakeIntegerBeautiful {

    public static void main(String[] args) {
        long pr = makeIntegerBeautiful(16, 6);
        System.out.println(pr);
    }
    public static long makeIntegerBeautiful(long n, int target) {
        if(n <= target || sumDigits(n) < target){
            return 0;
        }
        int num = (int) n;
        int length = getNumDigit(n);
        long result = 0;
        for(int i = 1; i < length; i++){
            double count = 0;
            count = (Math.floor(num/Math.pow(10,i) + 1)) * Math.pow(10,i);
            if(sumDigits(count) < target){
                result = (long)count - n;
                break;
            }
        }
        return result;
    }
    public static int getNumDigit(long num) {
        // 设置整数最大位数组参数
        int[] digits = {9, 99, 999, 9999, 99999, 999999, 9999999,
                99999999, 999999999, Integer.MAX_VALUE};
        // 循环判断num的大小
        for (int i = 0; ; i++) {
            // 当num的值小于digits[i]时停止循环，此时i+1便是当前num的位数
            if (num <= digits[i]) {
                return i + 1;
            }
        }
    }

    public static int sumDigits(double n) {
        int sum = 0;
        while(n>0)
        {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
