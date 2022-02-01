package com.test;

import javax.ejb.Remote;

@Remote
public interface TestSessionBeanRemote {
    
    public int remoteExecute(int a, int b);
}
