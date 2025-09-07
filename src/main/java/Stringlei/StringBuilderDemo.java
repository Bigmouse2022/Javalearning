package Stringlei;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("你好");
        //在“你好”后面添加内容，变成“你好，dazz”
        str.append(",");
        str.append("dazz");
        System.out.println(str);
        System.out.println(str.append("!!!!"));
        System.out.println(str);

        //将字符串变成你好，DAZZ
        str.delete(3,7).insert(3,"DAZZ");
        System.out.println(str);

        str.replace(4,8,"Dazz");
        System.out.println(str);

        
    }
}
