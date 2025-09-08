package Set_sort_6_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatTest {
    public static void main(String[] args) {
        //按名字升序排序
        Cat huahua=new Cat("huahua",10,"中");
        Cat fanfan=new Cat("fanfan",9,"中");
        Cat maomao=new Cat("maomao",11,"中");
        List<Cat> catlist=new ArrayList<Cat>();
        catlist.add(huahua);
        catlist.add(fanfan);
        catlist.add(maomao);
        //排序前
        System.out.println("排序前");
        for(Cat cat:catlist){
            System.out.println(cat);
        }
        //按名字升序排序
        Collections.sort(catlist,new NameComparator());
        System.out.println("排序后");
        for(Cat cat:catlist){
            System.out.println(cat);
        }
        //排序前
        System.out.println("排序前");
        for(Cat cat:catlist){
            System.out.println(cat);
        }
        //按年龄排序
        Collections.sort(catlist,new AgeComparator());
        System.out.println("排序后");
        for(Cat cat:catlist){
            System.out.println(cat);
        }


    }
}
