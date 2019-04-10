package �滻�ո�;

/**
 * �������ʹ�ö�����ڴ��ַ
 * �ȱ���һ���ҵ�����֮��ĳ��ȣ������ո񳤶���ԭ���Ļ�������Ӷ�
 * Ȼ��Ӻ���ǰ�渴������
 * �õ���API
 * StringBuffer
 * setCharAt(index,char);
 * setLength(length);
 *
 * Ȼ����Ǳ���ʱ��������ÿ�οո�Ӷ��������ո�����������µ�����һ���ᱻ�滻���ġ�
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
