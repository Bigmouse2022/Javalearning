package Arraylist;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CatTest {
    public static void main(String[] args) {
        Cat huahua = new Cat("花花", 12, "英国短毛猫");
        Cat fanfan = new Cat("帆帆", 3, "中华田园猫");
        //将宠物猫对象放入HashSet中
        Set<Cat> set = new HashSet<Cat>();
        set.add(huahua);
        set.add(fanfan);
        //显示宠物猫信息，需要重写Cat类中的toString
        Iterator<Cat> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //在添加一个与花花属性一样的猫,要重写equals和hashcode方法
        Cat huahua01 = new Cat("花花", 12, "英国短毛猫");
        set.add(huahua01);
        System.out.println("添加重复数据时，输出");
        it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        Cat huahua02 = new Cat("花花二代", 12, "英国短毛猫");
        set.add(huahua02);
        System.out.println("添加新数据时，输出");
        it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //在集合中查找花花的信息并输出
        if (set.contains(huahua)) {
            System.out.println("花花找到了" + "");
            System.out.println(huahua);
        } else {
            System.out.println("没找到");
        }

        //在集合中使用名字查找花花的信息
        System.out.println("在集合中使用名字查找花花的信息");
        boolean flag = false;
        Cat c=null;
        it= set.iterator();
        while (it.hasNext()) {
            c = it.next();
            if (c.getName().equals("花花")) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("花花找到了");
            System.out.println(c);
        } else {
            System.out.println("没找到");
        }

        //删除花花二代的信息并重新输出
//删除花花二代的信息并重新输出
        it = set.iterator();
        while (it.hasNext()) {
            Cat d = it.next();
            if ("花花二代".equals(d.getName())) {
                it.remove(); // 关键修改：使用迭代器的remove方法
            }
        }
        System.out.println("删除后");
        for (Cat cat : set) {
            System.out.println(cat);
        }
        //删除集合中所有宠物猫信息
        set.removeAll(set);
        if(set.isEmpty()){
            System.out.println("猫都不见了");
        }else{
            System.out.println("猫还在");
        }
    }
}
