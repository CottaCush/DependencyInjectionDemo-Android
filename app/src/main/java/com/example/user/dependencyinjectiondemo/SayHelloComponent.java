package com.example.user.dependencyinjectiondemo;

import dagger.Component;


@Component(modules = SayHelloPresenterModule.class)
public interface SayHelloComponent {

    void inject(SayHelloActivity sayHelloActivity);
}

