package org.vamdc.kida.auto;

import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.vamdc.kida.Channel;

/**
 * Class _TypeChannel was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _TypeChannel extends CayenneDataObject {

    public static final String ABBREV_PROPERTY = "abbrev";
    public static final String CREATED_AT_PROPERTY = "createdAt";
    public static final String DESCRIPTION_PROPERTY = "description";
    public static final String ID_PROPERTY = "id";
    public static final String NAME_PROPERTY = "name";
    public static final String OLD_VALUE_PROPERTY = "oldValue";
    public static final String UPDATED_AT_PROPERTY = "updatedAt";
    public static final String CHANNEL_ARRAY_PROPERTY = "channelArray";

    public static final String ID_PK_COLUMN = "id";

    public void setAbbrev(String abbrev) {
        writeProperty("abbrev", abbrev);
    }
    public String getAbbrev() {
        return (String)readProperty("abbrev");
    }

    public void setCreatedAt(Date createdAt) {
        writeProperty("createdAt", createdAt);
    }
    public Date getCreatedAt() {
        return (Date)readProperty("createdAt");
    }

    public void setDescription(String description) {
        writeProperty("description", description);
    }
    public String getDescription() {
        return (String)readProperty("description");
    }

    public void setId(Integer id) {
        writeProperty("id", id);
    }
    public Integer getId() {
        return (Integer)readProperty("id");
    }

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void setOldValue(Integer oldValue) {
        writeProperty("oldValue", oldValue);
    }
    public Integer getOldValue() {
        return (Integer)readProperty("oldValue");
    }

    public void setUpdatedAt(Date updatedAt) {
        writeProperty("updatedAt", updatedAt);
    }
    public Date getUpdatedAt() {
        return (Date)readProperty("updatedAt");
    }

    public void addToChannelArray(Channel obj) {
        addToManyTarget("channelArray", obj, true);
    }
    public void removeFromChannelArray(Channel obj) {
        removeToManyTarget("channelArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Channel> getChannelArray() {
        return (List<Channel>)readProperty("channelArray");
    }


}
