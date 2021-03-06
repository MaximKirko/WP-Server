package com.github.maximkirko.wpserver.datamodel;

import com.github.maximkirko.wpserver.datamodel.action.Action;
import com.github.maximkirko.wpserver.datamodel.violation.Violation;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by Pavel on 25.09.2016.
 */
@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "type", unique = false, nullable = false, length = 128)
    @Enumerated(EnumType.STRING)
    private TicketEnum type;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ticket", cascade = CascadeType.ALL)
    private Set<Photo> violationPhotos;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "violation_id", nullable = false, updatable = false)
    private Violation violation;

    @Column(name = "license_plate", length = 128)
    private String licensePlate;

    @Column(name = "address", length = 256)
    private String address;

    @Column(name = "location", length = 128)
    private String location;

    @Column(name = "date")
    private Date date;

    @Column(name = "comment", length = 512)
    private String comment;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "ticket_2_action", joinColumns = {
            @JoinColumn(name = "ticket_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "action_id",
                    nullable = false, updatable = false)})
    private Set<Action> actions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TicketEnum getType() {
        return type;
    }

    public void setType(TicketEnum type) {
        this.type = type;
    }

    public Set<Photo> getViolationPhotos() {
        return violationPhotos;
    }

    public void setViolationPhotos(Set<Photo> violationPhotos) {
        this.violationPhotos = violationPhotos;
    }

    public Violation getViolation() {
        return violation;
    }

    public void setViolation(Violation violation) {
        this.violation = violation;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Set<Action> getActions() {
        return actions;
    }

    public void setActions(Set<Action> actions) {
        this.actions = actions;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", violation=" + violation +
                ", licensePlate='" + licensePlate + '\'' +
                ", address='" + address + '\'' +
                ", location='" + location + '\'' +
                ", date=" + date +
                ", comment='" + comment + '\'' +
                '}';
    }

    public Ticket() {

    }

}
