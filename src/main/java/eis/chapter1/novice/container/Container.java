package eis.chapter1.novice.container;


/**
 * @author by zhangyuhang
 * @Classname Container
 * @Description 容器类
 * @date 2022/1/27 14:36
 */
public class Container {

    /**
     * 一组相连的容器
     */
    Container[] g;
    /**
     * 容器组的实际大小
     */
    int n;
    /**
     * 该容器中的水量
     */
    double x;

    public Container() {
        //注意：这是一个魔法数
        g = new Container[1000];
        //将该容器放入容器组中
        g[0] = this;
        n = 1;
        x = 0;
    }

    public double getAmount() {
        return this.x;
    }

    /**
     *
     * @param x 添加到容器中的水量
     */
    public void addWater(double x) {
        // todo 注意，addWater方法没有检查它的参数是否为负值。在这种情况下，表示并没有考虑容器组是否有足够的水量。
        double y = x / n;
        for (int i = 0; i < n; i++) {
            //使用+=运算符会更加直观
            g[i].x = g[i].x + y;
        }
    }
}
