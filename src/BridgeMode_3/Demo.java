package BridgeMode_3;

import BridgeMode_3.gift.ChineseWritingBook;
import BridgeMode_3.gift.Gift;
import BridgeMode_3.pen.Pen;
import BridgeMode_3.pen.SmallPen;
import BridgeMode_3.penRefill.PenRefill;
import BridgeMode_3.penRefill.RedRefill;

public class Demo {
    public static void main(String[] args) {
        //创建笔、笔芯、赠品对象
        Pen pen = new SmallPen();
        PenRefill penRefill = new RedRefill();
        Gift gift = new ChineseWritingBook();
        //设置笔对象的笔芯和赠品
        pen.setPenRefill(penRefill);
        pen.setGift(gift);
        //购买
        pen.bugPen();
    }
}
