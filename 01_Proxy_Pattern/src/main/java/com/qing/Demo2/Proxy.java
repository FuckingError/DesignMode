/**
 * Created by 刘清 on 2019/12/17 19:37
 */

package com.qing.Demo2;

public class Proxy implements Rent{
    private Host host;

    public Proxy(){
    }

    public Proxy(Host host){
        this.host = host;
    }

    public void rent() {
        seeHouse();
        host.rent();
        contract();
        fare();
    }

    //看房
    public void seeHouse(){
        System.out.println("看房去喽");
    }

    //收费
    public void fare(){
        System.out.println("收费咯");
    }

    //签合同
    public void contract(){
        System.out.println("签合同咯");
    }
}
