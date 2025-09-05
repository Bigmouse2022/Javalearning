package Wrapper;

public class wraptesttwo {
    public static void main(String[] args) {
        //基本数据类型转化为字符串
        int t1=2;
        String t2=Integer.toString(t1);
        System.out.println("int类型转换为String类型对象t2="+t2);

        //字符串转换成基本数据类型
        int t3=Integer.parseInt(t2);
        System.out.println("String类型转换为int类型对象t3="+t3);

        int t4=Integer.valueOf(t2);
        System.out.println("String类型转换为int类型对象t4="+t4);
    }
}
