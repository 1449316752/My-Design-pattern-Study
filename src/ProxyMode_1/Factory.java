package ProxyMode_1;

public class Factory implements CommoditySell{
    @Override
    public void commodityOut() {
        System.out.println("给出商品");
    }
}
