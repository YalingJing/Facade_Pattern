package com.facadePattern.client;

import com.facadePattern.facade.AbstractMainFrame;

public class client_teat {
    public static void main(String []args){
        AbstractMainFrame abstractMainFrame;
        abstractMainFrame = (AbstractMainFrame)XMLUtil.getBean();
        abstractMainFrame.on();
    }
}
