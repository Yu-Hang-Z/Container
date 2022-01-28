package eis.chapter1.novice.container;

/**
 * @author by zhangyuhang
 * @Classname Container
 * @Description TODO
 * @Date 2022/1/27 14:36
 */
public class Container {

    Container[] g;  // 一组相连的容器
    int n;          //容器组的实际大小
    double x;       // 该容器中的水量

    public Container() {
        g = new Container[1000];  //注意：这是一个魔法数
        g[0] = this;              //将该容器放入容器组中
        n = 1;
        x = 0;
    }
}
