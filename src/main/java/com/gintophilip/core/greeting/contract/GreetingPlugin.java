package com.gintophilip.core.greeting.contract;

public interface GreetingPlugin {
    void greet(String userName);
    String getLanguage();
}
