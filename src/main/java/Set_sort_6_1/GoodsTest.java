package Set_sort_6_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoodsTest {
    public static void main(String[] args) {
        Goods g1=new Goods("1","11",3000);
        Goods g2=new Goods("2","22",2500);
        Goods g3=new Goods("3","33",4000);
        List<Goods> goodsList=new ArrayList<Goods>();
        goodsList.add(g1);
        goodsList.add(g2);
        goodsList.add(g3);
        //排序前
        System.out.println("排序前");
        for(Goods goods:goodsList){
            System.out.println(goods);
        }
        //按价格降序排序
        Collections.sort(goodsList);
        System.out.println("排序后");
        for(Goods goods:goodsList){
            System.out.println(goods);
        }
    }
}
