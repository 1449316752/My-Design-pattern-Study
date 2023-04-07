package ProxyMode_1;

public class Demo {
    public static void main(String[] args) {
        WebShop webShop = new WebShop();
        webShop.pay();//用户支付
        webShop.receive();//用户要收货
        webShop.commodityOut();//请求出货
    }
}
