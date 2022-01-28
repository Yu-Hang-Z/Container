package eis.chapter1.novice.container;

/**
 * @author by zhangyuhang
 * @Classname Container
 * @Description 使用类
 * @date 2022/1/27 14:36
 */
public class UseCase {
    public static void main(String[] args) {
        Container a = new Container();
        Container b = new Container();
        Container c = new Container();
        Container d = new Container();
        
        a.addWater(12);
        d.addWater(8);
        a.connectTo(b);
        System.out.println(a.getAmount()+" "+b.getAmount()+" "+
                           c.getAmount()+" "+d.getAmount());
        b.connectTo(c);
        System.out.println(a.getAmount()+" "+b.getAmount()+" "+
                           c.getAmount()+" "+d.getAmount());
        b.connectTo(d);
        System.out.println(a.getAmount()+" "+b.getAmount()+" "+
                           c.getAmount()+" "+d.getAmount());
    }
}
