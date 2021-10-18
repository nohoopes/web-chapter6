package webapp;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String heardFrom;
    private String updates;
    private String contactVia;

    public User (String a, String b, String c, String d, String e, String f)
    {
        this.firstName = a;
        this.lastName = b;
        this.email =c;
        this.heardFrom=d;
        this.updates=e;
        this.contactVia=f;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }

    public String getheardFrom() {
        return heardFrom;
    }

    public String getupdates() {
        return updates;
    }

    public String getcontactVia() {
        return contactVia;
    }



    public void setFirstName(String a) {
        this.firstName = a;
    }
    public void setLastName(String a) {
        this.lastName = a;
    }
    public void setEmail(String a) {
        this.email = a;
    }

    public void setheardFrom(String a) {
        this.heardFrom = a;
    }

    public void setupdates(String a) {
        this.updates = a;
    }

    public void setcontactVia(String a) {
        this.contactVia = a;
    }
 
}
