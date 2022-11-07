/**
 * 实现一个函数，把字符串中每个空格替换成“%20”
 */
public class ReplaceSpace {
    public String replaceSpace(String s) {
        StringBuilder res = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c == ' '){
                res.append("%20");
            }else{
                res.append(c);
            }
        }
        return res.toString();
    }
}
