package eis.chapter2.reference.container;

import eis.chapter1.novice.container.ContainerApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author by zhangyuhang
 * @Classname ContainerTests
 * @Description TODO
 * @Date 2022/1/28 17:05
 */
@SpringBootTest(classes = ContainerApplication.class)
public class ContainerTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testContainer(){
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
