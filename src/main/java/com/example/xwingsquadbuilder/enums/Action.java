package com.example.xwingsquadbuilder.enums;

public enum Action {
    BARREL_ROLL("barrel roll"),
    BOOST("boost"),
    CALCULATE("calculate"),
    CLOAK("cloak"),
    COORDINATE("coordinate"),
    EVADE("evade"),
    FOCUS("focus)"),
    JAM("jam"),
    LOCK("lock"),
    REINFORCE("reinforce"),
    RELOAD("reload"),
    ROTATE("rotate"),
    SLAM("SLAM");

    private final String actionName;

    Action(String actionName) {
        this.actionName = actionName;
    }

    @Override
    public String toString() {
        return actionName;
    }
}
