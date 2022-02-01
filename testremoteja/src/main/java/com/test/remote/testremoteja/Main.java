package com.test.remote.testremoteja;


import javax.naming.NamingException;

public class Main {
    public static void main(String[] args) throws NamingException {
        testremote test = new testremote();
        test.callRemote();
    }
}
