package Arraylist;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> animal = new HashMap<String, String>();
        System.out.println("请输入三组单词对应的注释，并存放到HashMap");
        Scanner console = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            System.out.println("请输入key值(单词)");
            String key = console.next();
            System.out.println("输入value值(注释)");
            String value = console.next();
            animal.put(key, value);
            i++;
        }
        //打印输出value的值
        System.out.println("*****************");
        System.out.println("打印value值(注释)");
        Iterator<String> it = animal.values().iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }
        System.out.println("*****************");
        //打印输出key和value的值
        //通过entrySet方法
        Set<Map.Entry<String, String>> entrySet = animal.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {


            System.out.print(entry.getKey() + "-");
            System.out.print(entry.getValue()+"\n");
        }

        System.out.println("****通过单词找到注释并输出*************");
        //通过单词找到注释并输出
        //使用keySet方法
        System.out.println("****输入想要查找的单词*************");
        String strSearch=console.next();
        //1.取得keySet
        Set<String> keySet=animal.keySet();
        //2.遍历keySet
        for(String key:keySet){
            if(strSearch.equals(key)){
                System.out.println("找到了"+"键值对为："+key+ animal.get(key));
                break;
            }
        }
    }
}
