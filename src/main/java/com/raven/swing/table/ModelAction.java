package com.raven.swing.table;


public class ModelAction {


    public EventAction getEvent() {
        return event;
    }

    public void setEvent(EventAction event) {
        this.event = event;
    }

    public ModelAction( EventAction event) {
        this.event = event;
    }

    public ModelAction() {
    }

    private EventAction event;
}
