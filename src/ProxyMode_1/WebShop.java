package ProxyMode_1;

public class WebShop implements CommoditySell{
    private Factory factory;
    private boolean isPay = false;
    private boolean isReceive = false;
    @Override
    public void commodityOut() {//代理方法
        if (factory == null) factory = new Factory();
        if (!isPayAndReceive()) return;
        factory.commodityOut();//被代理方法
        gift();
    }
    private boolean isPayAndReceive(){//判断是否能给客户商品
        if (isPay){
            System.out.println("已付款");
        }else {
            System.out.println("未付款！不发货");
            return false;
        }
        if (isReceive){
            System.out.println("收货人要收货");
        }else {
            System.out.println("收货人不收货！不发货");
            return false;
        }
        return true;
    }
    private void gift(){    //赠送品
        System.out.println("赠送礼品和代金券");
    }
    public void pay(){  //客户付款
        this.isPay = true;
    }
    public void receive(){  //客户要收货
        this.isReceive = true;
    }
}