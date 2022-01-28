package eis.chapter2.reference.container;

import java.util.HashSet;
import java.util.Set;

/**
 * @author by zhangyuhang
 * @Classname Container
 * @Description Reference 容器类
 * @Date 2022/1/28 16:28
 */
public class Container {
    /**
     * 连接到此容器的其他容器
     */
    private Set<Container> group;
    /**
     * 此容器的水量
     */
    private double amount;

    /**
     * 创建一个空容器
     */
    public Container() {
        group = new HashSet<Container>();
        //容器组以此容器开始
        group.add(this);
    }

    public double getAmount() {
        return amount;
    }

    public void addWater(double amount){
        double amountPerContainer = amount /group.size();
        for (Container container : group){
            container.amount += amountPerContainer;
        }
    }

    public void connectTo(Container other) {
        //如果已经连接，则不做任何处理
        if(group == other.group) {
            return;
        }
        //计算合并后每个容器的水量
        int size1 = group.size(),
                size2 = other.group.size();
        double total1 = amount * size1,
                total2 = other.getAmount() * size2,
                newAmount = (total1 + total2) / (size1 + size2);
        //合并两个组
        group.addAll(other.group);
        //更新相连容器的组
        for (Container container : other.group) {
            container.group = group;
        }
        for (Container container : group) {
            container.amount = newAmount;
        }



    }
}
