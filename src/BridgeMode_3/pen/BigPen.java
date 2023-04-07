package BridgeMode_3.pen;

public class BigPen extends Pen{
    @Override
    public void bugPen() {
        System.out.println("购买的写字笔产品：大笔；" + "笔芯：" + penRefill.getPenRefill() + "；赠品：" + gift.getGift());
    }
}
