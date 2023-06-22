package Phonebook;

public class Contact {
    private String id;
    private String name;
    private String phone;
    private String comment;

    public Contact(String name, String phone, String comment) {
        this.name = name;
        this.phone = phone;
        this.comment = comment;
    }

    public Contact(String id, String name, String phone, String comment) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.comment = comment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}

