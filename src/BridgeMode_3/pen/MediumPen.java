package BridgeMode_3.pen;

public class MediumPen extends Pen{
    @Override
    public void bugPen() {
        System.out.println("购买的写字笔产品：中笔；"+"笔芯："+penRefill.getPenRefill()+"；赠品："+gift.getGift());
   }
}
