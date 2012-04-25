package org.vamdc.kida.dao.auto;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _IsExpert was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _IsExpert extends CayenneDataObject {

    public static final String LEVEL_PROPERTY = "level";
    public static final String TYPE_CHANNEL_ID_PROPERTY = "typeChannelId";
    public static final String USER_EMAIL_PROPERTY = "userEmail";


    public void setLevel(String level) {
        writeProperty("level", level);
    }
    public String getLevel() {
        return (String)readProperty("level");
    }

    public void setTypeChannelId(Long typeChannelId) {
        writeProperty("typeChannelId", typeChannelId);
    }
    public Long getTypeChannelId() {
        return (Long)readProperty("typeChannelId");
    }

    public void setUserEmail(String userEmail) {
        writeProperty("userEmail", userEmail);
    }
    public String getUserEmail() {
        return (String)readProperty("userEmail");
    }

}