package com.example.user.dependencyinjectiondemo;

import javax.inject.Inject;

public class SayHelloPresenter implements SayHelloContract.Presenter {

    private Person person;
    private SayHelloContract.View view;

    @Inject
    public SayHelloPresenter(Person person, SayHelloContract.View view) {
        this.person = person;
        this.view = view;
    }

    @Override
    public void loadMessage() {
        if (person.getFirstName() == null && person.getLastName() == null) {
            view.showMessage("");
            view.showError("No person name found.");
            return;
        }

        String message = "Hi " + person.getName() + "!";
        view.showMessage(message);
    }

    @Override
    public void saveName(String firstName, String lastName) {
        if(firstName.length() != 0 || lastName.length() != 0) {
            person.setFirstName(firstName);
            person.setLastName(lastName);
        }
        else {
            person.setFirstName(null);
            person.setLastName(null);
        }
    }
}
