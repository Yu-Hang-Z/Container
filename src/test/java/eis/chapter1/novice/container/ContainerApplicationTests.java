package eis.chapter1.novice.container;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ContainerApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void containerTest(){
        Container a = new Container();
        Container b = new Container();
        Container c = new Container();
        a.addWater(8.0);
        a.connectTo(b);
        b.connectTo(c);
        System.out.println(a.x);

    }

    @Test
    void containerReferenceTest(){
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
