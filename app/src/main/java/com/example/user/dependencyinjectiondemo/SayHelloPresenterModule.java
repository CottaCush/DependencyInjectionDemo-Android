package com.example.user.dependencyinjectiondemo;

import dagger.Module;
import dagger.Provides;

/**
 * Created by timi on 23/04/2018.
 */

@Module
public class SayHelloPresenterModule {
    private final SayHelloContract.View view;

    private final Person person;

    public SayHelloPresenterModule(SayHelloContract.View view, Person person) {
        this.view = view;
        this.person = person;
    }

    @Provides
    SayHelloContract.View provideSayHelloContractView() {
        return view;
    }

    @Provides
    Person providePerson() {
        return person;
    }
}
