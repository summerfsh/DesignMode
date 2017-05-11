package designmode;


import designmode.adapter1.Adapter;
import designmode.adapter1.Target;

/**
 * Created by wind on 2017/5/11.
 */
public class Test {
    public static void main(String[] args) {
        Target target = new Adapter();
        // 客户端只能调用这个方法，当时目前只提供了Adaptee类的specificRequest方法
        target.request();
    }
}
