package Stringlei;

public class StringDemo1 {
    public static void main(String[] args) {
        String str = new String("JAVA 编程 基础");
        System.out.println("字符串长度:"+str.length());

        //取出字符“程”并输出
        System.out.println(str.charAt(6));
        //求子串“编程 基础”并输出
        System.out.println(str.substring(5));
        //求子串“编程 基础”并输出
        System.out.println(str.substring(5,7));
    }
}
