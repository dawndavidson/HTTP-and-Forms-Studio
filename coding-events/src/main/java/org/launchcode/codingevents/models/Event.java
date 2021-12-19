
package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Created by Chris Bay
 */
@Entity
public class Event {

    @Id
    @GeneratedValue
    private int id;

    @NotBlank(message = "Name is required.")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters." )
    private String name;

    @Size(max = 500, message = "Description too long")
    private String description;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email. Try again.")
    private String contactEmail;

    @NotBlank(message = "Location cannont be left blank.")
    private String eventLocation;

    //@True(message = "You must register")
    private boolean attendeeRegistered;

    @Positive(message = "Number of attendees must be one or more.")
    private int numberOfAttendees;



    public Event(String name, String description, String contactEmail, String eventLocation, boolean attendeeRegistered, int numberOfAttendees) {
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.eventLocation = eventLocation;
        this.attendeeRegistered = attendeeRegistered;
        this.numberOfAttendees = numberOfAttendees;

    }

    public Event(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public int getId() {
        return id;
    }



    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}