/*
 * Copyright (c) 2022. StulSoft
 */

package com.stulsoft.pmodule.info.app;

import com.stulsoft.pmodule.info.lib.SomeService;
import com.stulsoft.pmodule.info.slib.Test22;


public class App {
    public static void main(String[] args) {
        System.out.println("==>main");
        var someService = new SomeService();
        someService.show();

        var test22 = new Test22();
        test22.show();
        System.out.printf("add(1,2) = %d%n", test22.add(1, 2));
    }
}
