package com.test;

import javax.ejb.Local;

@Local
public interface TestSessionBeanLocal {
    
    public int execute(int a, int b);
}
