package Arraylist;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class GoodsHashMapDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Map<String,Goods> goodsMap=new HashMap<String,Goods>();
        System.out.println("请输入三条商品信息");
        int i=0;
        while(i<3){

            System.out.println("请输入第"+(i+1)+"条商品信息");
            System.out.println("请输入第"+(i+1)+"条商品编号");
            String goodsId=input.next();
            //判断商品编号是否存在
            if(goodsMap.containsKey(goodsId)){
                System.out.println("该商品编号已存在，请重新输入");
                continue;
            }
            System.out.println("请输入第"+(i+1)+"条商品名称");
            String goodsName=input.next();
            System.out.println("请输入第"+(i+1)+"条商品价格");
            double goodsPrice=0;
            try {
                goodsPrice=input.nextDouble();
            }catch (java.util.InputMismatchException e){
                System.out.println("商品价格的格式不正确，请重新输入");
                input.next();
                continue;
            }

            Goods goods=new Goods(goodsId,goodsName,goodsPrice);
            //将商品信息添加到HashMap
            goodsMap.put(goodsId,goods);
            i++;

        }
        //遍历Map，输出商品信息
        System.out.println("商品全部信息如下");
        Iterator<Goods> itGoods=goodsMap.values().iterator();
        while (itGoods.hasNext()){
            System.out.println(itGoods.next());
        }

    }
}
