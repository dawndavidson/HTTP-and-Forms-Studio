package org.launchcode.kaboodles2.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer extends  AbstractEntity {

    @NotBlank(message = "First Name is required")
    @Size(max = 50, message = "Must be within 50 characters")
    private String firstName;

    @NotBlank(message = "Last Name is required")
    @Size(max = 50, message = "Must be within 50 characters")
    private String lastName;

    @NotBlank(message = "Email is required")
    @Size(max = 50, message = "Must be within 50 characters")
    private String email;

    @NotBlank(message = "Password is required")
    @Size(max = 50, message = "Must be within 50 characters")
    private String password;

    @OneToMany
    @JoinColumn(name = "customer_id")
    private final List<HomeServices> homeServices = new ArrayList<>();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Customer() {}


}

