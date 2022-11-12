/*
 * Copyright (c) 2022. StulSoft
 */

package com.stulsoft.pmodule.info.app;

import com.stulsoft.pmodule.info.lib.SomeService;

public class App {
    public static void main(String[] args) {
        System.out.println("==>main");
        var someService = new SomeService();
        someService.show();
    }
}
