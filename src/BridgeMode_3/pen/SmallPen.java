package BridgeMode_3.pen;

public class SmallPen extends Pen{
    @Override
    public void bugPen() {
        System.out.println("购买的写字笔产品：小笔；"+"笔芯："+penRefill.getPenRefill()+"；赠品："+gift.getGift());
    }
}
