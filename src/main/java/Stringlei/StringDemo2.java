package Stringlei;

public class StringDemo2 {
    public static void main(String[] args) {
        String str = "JAVA编程基础，我喜欢java编程";

        //查找字符“A”第一次出现的位置
        System.out.println(str.indexOf('A'));
        //查找字串“编程”第一次出现的位置
        System.out.println(str.indexOf("编程"));
        //查找字符“A”最后一次出现的位置
        System.out.println(str.lastIndexOf("A"));
        //查找字串“编程”最后一次出现的位置
        System.out.println(str.lastIndexOf("编程"));
        //在字符串index值为8的位置开始，查找字串“编程”第一次出现的位置
        System.out.println(str.indexOf("编程",8));
    }
}
