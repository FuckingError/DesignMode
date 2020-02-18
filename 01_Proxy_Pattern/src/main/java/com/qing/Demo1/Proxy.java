package com.qing.Demo1;

/**
 * $
 *
 * @author Qing
 * @version 1.0
 * @date 2020/2/18 17:33
 */
public class Proxy implements GiveGift {
    private Pursuit gg;

    //构造方法：new 一个 追求者...
    public Proxy(SchoolGirl girl) {
        gg = new Pursuit(girl);
    }

    public Pursuit getGg() {
        return gg;
    }

    public void setGg(Pursuit gg) {
        this.gg = gg;
    }

    @Override
    public void GiveDolls() {
        gg.GiveDolls();
    }

    @Override
    public void GiveFlowers() {
        gg.GiveFlowers();
    }

    @Override
    public void GiveChocolate() {
        gg.GiveChocolate();
    }
}
