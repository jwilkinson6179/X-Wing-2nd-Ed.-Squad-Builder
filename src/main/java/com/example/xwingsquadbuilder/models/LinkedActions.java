package com.example.xwingsquadbuilder.models;

import com.example.xwingsquadbuilder.enums.Action;

import javax.persistence.*;

@Entity
@Table(name = "linked_actions")
public class LinkedActions
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    Action normalAction;
    Action difficultAction;

    public LinkedActions()
    {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Action getNormalAction() {
        return normalAction;
    }

    public void setNormalAction(Action normalAction) {
        this.normalAction = normalAction;
    }

    public Action getDifficultAction() {
        return difficultAction;
    }

    public void setDifficultAction(Action difficultAction) {
        this.difficultAction = difficultAction;
    }
}
