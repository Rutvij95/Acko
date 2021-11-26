package com.acko.acko.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "developer")
public class Developer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "developer_id")
    private Integer developerId;

    @Column(name = "developer_name", nullable = false, length = 50)
    private String developerName;

    @Column(name = "phone_number", length = 10)
    private String phoneNumber;

    private Integer notificationAcknowledgeCount;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    public Integer getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(Integer developerId) {
        this.developerId = developerId;
    }

    public String getDeveloperName() {
        return developerName;
    }

    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getNotificationAcknowledgeCount() {
        return notificationAcknowledgeCount;
    }

    public void setNotificationAcknowledgeCount(Integer notificationAcknowledgeCount) {
        this.notificationAcknowledgeCount = notificationAcknowledgeCount;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Developer{" +
            "developerId=" + developerId +
            ", developerName='" + developerName + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            ", notificationAcknowledgeCount=" + notificationAcknowledgeCount +
            ", team=" + team +
            '}';
    }
}
