package com.lsm.pojo;

public class zhongjie implements account{
    private fangdong name;
    public zhongjie() {

    }
    public zhongjie(fangdong name) {
        this.name = name;
    }

    public void zufang() {
        kanfang();
        qianhetong();
        name.zufang();
    }

    public void kanfang(){
        System.out.println("我带你去看房");
    }
    public void qianhetong(){
        System.out.println("走签合同他");
    }
}
