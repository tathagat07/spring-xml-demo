package com.stackroute.domain;

public class movie extends actor {

 actor actor = new actor();

    public com.stackroute.domain.actor getActor() {
        return actor;
    }

    public void setActor(com.stackroute.domain.actor actor) {
        this.actor = actor;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
    }
}
