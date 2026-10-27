package com.edubridge.dbcrud1.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="BADGE")
public class Badge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String badge_name;
    private String description;
    private int required_points;
    private String created_at;

    Badge(Long id, String badge_name, String description, int required_points, String created_at) {
        this.id = id;
        this.badge_name = badge_name;
        this.description = description;
        this.required_points = required_points;
        this.created_at = created_at;
    }

    public Long getId() {
        return id;
    }
    public String getBadge_name() {
        return badge_name;
    }
    public String getDescription() {
        return description;
    }
    public int getRequired_points() {
        return required_points;
    }
    public String getCreated_at() {
        return created_at;
    }
    public void setBadge_name(String badge_name) {
        this.badge_name = badge_name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setRequired_points(int required_points) {
        this.required_points = required_points;
    }
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
}
