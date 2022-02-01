package com.test.remote.testremoteja;


import com.test.TestSessionBeanRemote;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class testremote {
    
    private TestSessionBeanRemote tsbr;
    
    public void callRemote() throws NamingException {
        try {
            InitialContext ctx = new InitialContext();
            tsbr = (TestSessionBeanRemote) ctx.lookup("java:global/testremote/testremote-ejb-1.0/TestSessionBean!com.test.TestSessionBeanRemote");
            System.out.println(tsbr.remoteExecute(5, 6));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
