package org.vamdc.kida.dao.auto;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _Contact was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Contact extends CayenneDataObject {

    public static final String EMAIL_PROPERTY = "email";
    public static final String ID_PROPERTY = "id";
    public static final String MESSAGE_PROPERTY = "message";
    public static final String NAME_PROPERTY = "name";
    public static final String SUBJECT_PROPERTY = "subject";

    public static final String ID_PK_COLUMN = "id";

    public void setEmail(String email) {
        writeProperty("email", email);
    }
    public String getEmail() {
        return (String)readProperty("email");
    }

    public void setId(Integer id) {
        writeProperty("id", id);
    }
    public Integer getId() {
        return (Integer)readProperty("id");
    }

    public void setMessage(String message) {
        writeProperty("message", message);
    }
    public String getMessage() {
        return (String)readProperty("message");
    }

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void setSubject(String subject) {
        writeProperty("subject", subject);
    }
    public String getSubject() {
        return (String)readProperty("subject");
    }

}
