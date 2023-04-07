package BridgeMode_3.pen;

import BridgeMode_3.gift.Gift;
import BridgeMode_3.penRefill.PenRefill;

public abstract class Pen {//笔抽象类
    protected PenRefill penRefill;
    protected Gift gift;

    public void setPenRefill(PenRefill penRefill) {
        this.penRefill = penRefill;
    }

    public void setGift(Gift gift) {
        this.gift = gift;
    }

    public abstract void bugPen();
}
