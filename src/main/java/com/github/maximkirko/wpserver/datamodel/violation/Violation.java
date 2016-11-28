package com.github.maximkirko.wpserver.datamodel.violation;

import com.github.maximkirko.wpserver.datamodel.action.Action;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by Pavel on 12.10.2016.
 */

@Entity
@Table(name = "violation", uniqueConstraints = {
        @UniqueConstraint(columnNames = "type")})
public class Violation {

    private Long id;
    private ViolationEnum type;
    private String description;
    private double fee;
    private Action action;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "type", unique = true, nullable = false, length = 256)
    public ViolationEnum getType() {
        return this.type;
    }

    public void setType(ViolationEnum type) {
        this.type = type;
    }

    @Column(name = "description", nullable = false, length = 512)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "fee", nullable = false)
    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "action_id", nullable = false)
    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "Violation{" +
                "id=" + id +
                ", type=" + type +
                ", description='" + description + '\'' +
                ", fee=" + fee +
                ", action=" + action +
                '}';
    }

    public Violation() {

    }
}