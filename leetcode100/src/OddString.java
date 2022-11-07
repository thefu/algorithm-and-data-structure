public class OddString {
    public static void main(String[] args) {
        String[] words = new String[]{"adc","abc","abc"};
        System.out.println(oddString(words));
    }
    public static String oddString(String[] words) {

        int length = words[0].length();
        int[] result = new int[length-1];
        int i;
        for(i = 0; i < words.length; i++){
            if(i == 0){
                result = cal(words[i]);
            }else if (result == cal(words[i])){
                continue;
            }else {
                if(i > 1){
                    break;
                }else{
                    if (result == cal(words[i+1])){
                        break;
                    }else{
                        i = 0;
                    }
                }
            }

        }
        return words[i];
    }

    public static int[] cal(String s) {
        char[] ch = s.toCharArray();
        int[] result = new int[s.length()-1];
        for(int i = 0; i < s.length()-1; i++){
            result[i] = (int)ch[i+1] - (int)ch[i];
        }
        return result;
    }
}
