package 替换空格;

/**
 * 如果不让使用额外的内存地址
 * 先遍历一边找到扩容之后的长度，遇到空格长度在原来的基础上面加二
 * 然后从后向前面复制内容
 * 用到的API
 * StringBuffer
 * setCharAt(index,char);
 * setLength(length);
 *
 * 然后就是遍历时的条件：每次空格加二而碰到空格减三，所以新的条件一定会被替换掉的。
 */
public class Solution {
    public static String replace(StringBuffer str){
        if(str == null || str.length() == 0) return null;
        int length = str.length();
        int originalLength = length-1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                length += 2;
            }
        }
        int newLength = length-1;
        str.setLength(length);
        while(newLength > originalLength){
            if(str.charAt(originalLength) == ' '){
                str.setCharAt(newLength--,'0');
                str.setCharAt(newLength--,'2');
                str.setCharAt(newLength--,'%');
            }else{
                str.setCharAt(newLength--,str.charAt(originalLength));
            }
            originalLength--;
        }
        return str.toString();
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(" ");
        String re = replace(sb);
        System.out.println(re);
    }
}
