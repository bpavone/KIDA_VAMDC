package org.vamdc.kida.dao.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _DatasheetTB was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _DatasheetTB extends CayenneDataObject {

    public static final String CREATED_AT_PROPERTY = "createdAt";
    public static final String FILENAME_PROPERTY = "filename";
    public static final String ID_PROPERTY = "id";
    public static final String REACTION_ID_PROPERTY = "reactionId";
    public static final String UPDATED_AT_PROPERTY = "updatedAt";
    public static final String USER_EMAIL_PROPERTY = "userEmail";
    public static final String VERSION_PROPERTY = "version";

    public static final String ID_PK_COLUMN = "id";

    public void setCreatedAt(Date createdAt) {
        writeProperty("createdAt", createdAt);
    }
    public Date getCreatedAt() {
        return (Date)readProperty("createdAt");
    }

    public void setFilename(String filename) {
        writeProperty("filename", filename);
    }
    public String getFilename() {
        return (String)readProperty("filename");
    }

    public void setId(Integer id) {
        writeProperty("id", id);
    }
    public Integer getId() {
        return (Integer)readProperty("id");
    }

    public void setReactionId(Integer reactionId) {
        writeProperty("reactionId", reactionId);
    }
    public Integer getReactionId() {
        return (Integer)readProperty("reactionId");
    }

    public void setUpdatedAt(Date updatedAt) {
        writeProperty("updatedAt", updatedAt);
    }
    public Date getUpdatedAt() {
        return (Date)readProperty("updatedAt");
    }

    public void setUserEmail(String userEmail) {
        writeProperty("userEmail", userEmail);
    }
    public String getUserEmail() {
        return (String)readProperty("userEmail");
    }

    public void setVersion(Integer version) {
        writeProperty("version", version);
    }
    public Integer getVersion() {
        return (Integer)readProperty("version");
    }

}
