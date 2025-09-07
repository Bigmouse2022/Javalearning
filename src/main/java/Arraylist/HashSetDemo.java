package Arraylist;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        //将英文单词添加到HashSet中
        Set set =new HashSet();
        set.add("blue");
        set.add("red");
        set.add("black");
        set.add("yellow");
        set.add("whgite");
        //在集合中插入一个元素
        set.add("green");
        //显示集合内容
        Iterator it=set.iterator();

        //遍历迭代器并输出元素
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

    }
}
