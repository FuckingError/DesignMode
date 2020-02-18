package com.qing.Demo1;

import com.qing.Demo1.GiveGift;
import com.qing.Demo1.SchoolGirl;

/**
 * 追求者...
 *
 * @author Qing
 * @version 1.0
 * @date 2020/2/18 17:31
 */
public class Pursuit implements GiveGift {
    //追求者 追求...的SchoolGirl
    private SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    public SchoolGirl getMm() {
        return mm;
    }

    public void setMm(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void GiveDolls() {
        System.out.println(mm.getName()+"送你洋娃娃");
    }

    @Override
    public void GiveFlowers() {
        System.out.println(mm.getName()+"送你花");
    }

    @Override
    public void GiveChocolate() {
        System.out.println(mm.getName()+"送你巧克力");
    }
}
