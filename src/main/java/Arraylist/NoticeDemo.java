package Arraylist;

import java.util.ArrayList;
import java.util.Date;

public class NoticeDemo {
    public static void main(String[] args) {
        //创建Notice类对象，生成三条公告
        Notice notice1 = new Notice(1, "欢迎进入Java学习", "新手小白", new Date());
        Notice notice2 = new Notice(1, "Java基础", "入门小白", new Date());
        Notice notice3 = new Notice(1, "Java进阶", "进阶小老弟", new Date());

        //添加公告
        ArrayList noticelist = new ArrayList();
        noticelist.add(notice1);
        noticelist.add(notice2);
        noticelist.add(notice3);
        //显示公告
        System.out.println("公告的内容为");
        for (int i = 0; i < noticelist.size(); i++) {
            System.out.println(i + 1 + ":" + ((Notice) (noticelist.get(i))).getTitle());
        }
        System.out.println("*****************");
        //在第一条公告后面添加一条新的公告
        Notice notice4=new Notice(4,"在线编辑","管理员",new Date());
        noticelist.add(1,notice4);
        System.out.println("公告的内容为");
        for (int i = 0; i < noticelist.size(); i++) {
            System.out.println(i + 1 + ":" + ((Notice) (noticelist.get(i))).getTitle());
        }
        System.out.println("*****************");
        //删除刚刚添加的公告
        noticelist.remove(1);
        System.out.println("公告的内容为");
        for (int i = 0; i < noticelist.size(); i++) {
            System.out.println(i + 1 + ":" + ((Notice) (noticelist.get(i))).getTitle());
        }
        System.out.println("*****************");
        //修改公告1
        notice1.setTitle("更新公告1");
        System.out.println("公告的内容为");
        for (int i = 0; i < noticelist.size(); i++) {
            System.out.println(i + 1 + ":" + ((Notice) (noticelist.get(i))).getTitle());
        }
    }
}
