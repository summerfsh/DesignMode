package designmode.adapter1;

/**
 * Created by wind on 2017/5/11.
 */
public class Adapter extends Target {
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
