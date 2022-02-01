package com.test;

import javax.ejb.Stateless;

@Stateless
public class TestSessionBean implements TestSessionBeanLocal, TestSessionBeanRemote {

    @Override
    public int execute(int a, int b) {
        System.out.println(a + " + " + b);
        return a + b;
    }

    @Override
    public int remoteExecute(int a, int b) {
        return this.execute(a, b);
    }
    
}
