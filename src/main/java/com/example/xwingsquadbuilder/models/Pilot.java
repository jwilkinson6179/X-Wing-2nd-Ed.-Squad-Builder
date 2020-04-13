package com.example.xwingsquadbuilder.models;

import com.example.xwingsquadbuilder.enums.Action;
import com.example.xwingsquadbuilder.enums.Faction;
import com.example.xwingsquadbuilder.enums.Size;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "pilot")
public class Pilot
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    String shipType;
    String subtitle;
    Integer init;
    @Enumerated(EnumType.STRING)
    Faction faction;
    Boolean limited;
    Integer limit;
    String pilotAbility;
    String shipAbility;
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "normalActions", joinColumns = @JoinColumn(name = "id"))
    Set<Action> normalActions;
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "difficultActions", joinColumns = @JoinColumn(name = "id"))
    Set<Action> difficultActions;
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "forceActions", joinColumns = @JoinColumn(name = "id"))
    Set<Action> forceActions;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "linked_actions_id")
    Set<LinkedActions> linkedActions;
    Integer cost;
    Integer attack;
    Integer evade;
    Integer hull;
    Integer shield;
    Integer forceCapacity;
    @Enumerated(EnumType.STRING)
    Size size;

    public Pilot()
    {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShipType() {
        return shipType;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Integer getInit() {
        return init;
    }

    public void setInit(Integer init) {
        this.init = init;
    }

    public Faction getFaction() {
        return faction;
    }

    public void setFaction(Faction faction) {
        this.faction = faction;
    }

    public Boolean getLimited() {
        return limited;
    }

    public void setLimited(Boolean limited) {
        this.limited = limited;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getPilotAbility() {
        return pilotAbility;
    }

    public void setPilotAbility(String pilotAbility) {
        this.pilotAbility = pilotAbility;
    }

    public String getShipAbility() {
        return shipAbility;
    }

    public void setShipAbility(String shipAbility) {
        this.shipAbility = shipAbility;
    }

    public Set<Action> getNormalActions() {
        return normalActions;
    }

    public void setNormalActions(Set<Action> normalActions) {
        this.normalActions = normalActions;
    }

    public Set<Action> getDifficultActions() {
        return difficultActions;
    }

    public void setDifficultActions(Set<Action> difficultActions) {
        this.difficultActions = difficultActions;
    }

    public Set<Action> getForceActions() {
        return forceActions;
    }

    public void setForceActions(Set<Action> forceActions) {
        this.forceActions = forceActions;
    }

    public Set<LinkedActions> getLinkedActions() {
        return linkedActions;
    }

    public void setLinkedActions(Set<LinkedActions> linkedActions) {
        this.linkedActions = linkedActions;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getEvade() {
        return evade;
    }

    public void setEvade(Integer evade) {
        this.evade = evade;
    }

    public Integer getHull() {
        return hull;
    }

    public void setHull(Integer hull) {
        this.hull = hull;
    }

    public Integer getShield() {
        return shield;
    }

    public void setShield(Integer shield) {
        this.shield = shield;
    }

    public Integer getForceCapacity() {
        return forceCapacity;
    }

    public void setForceCapacity(Integer forceCapacity) {
        this.forceCapacity = forceCapacity;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
