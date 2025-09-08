package Set_sort_6_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_int_sort {
    public static void main(String[] args) {
        //对存储在list中的整形数据进行排序
        List<Integer> list=new ArrayList<Integer>();
        list.add(5);  list.add(9);  list.add(3);  list.add(1);
        System.out.println("排序前：");
        for(int n:list){
            System.out.print(n+" ");
        }
        System.out.println();
        Collections.sort(list);
        System.out.println("排序后：");
        for(int n:list){
            System.out.print(n+" ");
        }
        System.out.println();
        //对存放在list中的字符串进行排序
        List<String> strlist=new ArrayList<String>();
        strlist.add("orange");
        strlist.add("blue");
        strlist.add("yellow");
        strlist.add("grew");
        System.out.println("排序前：");
        for(String s:strlist){
            System.out.print(s+" ");
        }
        System.out.println();
        Collections.sort(strlist);
        System.out.println("排序后：");
        for(String s:strlist){
            System.out.print(s+" ");
        }
        System.out.println();

    }
}
