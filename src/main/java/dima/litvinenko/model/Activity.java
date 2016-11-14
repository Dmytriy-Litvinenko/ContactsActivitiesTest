package dima.litvinenko.model;

import javax.persistence.Entity;
import java.util.Date;

@Entity(name = "activities")
public class Activity extends BaseModel{
    private String title;
    private String notes;
    private Date Calendar;
    private Contact contact;
}
