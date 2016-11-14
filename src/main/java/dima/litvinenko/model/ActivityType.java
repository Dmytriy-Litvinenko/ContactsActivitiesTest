package dima.litvinenko.model;

import org.springframework.stereotype.Controller;

import javax.persistence.Entity;

@Entity(name="activity_types")
public class ActivityType extends BaseModel{
    private String activityType;
}
