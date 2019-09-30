package com.stackroute.domain;

import org.springframework.stereotype.Component;

@Component
public class Movie {

   private Actor actor;

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
}
