package trainTicket;

import java.util.Arrays;

public class User {
    int id;
    protected String login;
    protected String firstName;
    protected String lastName;
    protected String password;
    protected String documentType;
    protected String documentId;

    public User(int id, String login, String firstName, String lastName, String password, String documentType, String documentId) {
        this.id = id;
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.documentType = documentType;
        this.documentId = documentId;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    @Override
    public String toString() {
        return "id: " + id + "\n" +
                "login: " + login + "\n" +
                "firstname: " + firstName + "\n" +
                "lastname: " + lastName + "\n" +
                "document type: " + documentType +  "\n"  +
                "document id: " + documentId + "\n";
    }
}
