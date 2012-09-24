package org.vamdc.kida.dao.auto;

import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.vamdc.kida.dao.ChannelValue;
import org.vamdc.kida.dao.K0Value;

/**
 * Class _Formula was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Formula extends CayenneDataObject {

    public static final String CREATED_AT_PROPERTY = "createdAt";
    public static final String DESCRIPTION_PROPERTY = "description";
    public static final String ID_PROPERTY = "id";
    public static final String IMAGE_PROPERTY = "image";
    public static final String MATH_PROPERTY = "math";
    public static final String NAME_PROPERTY = "name";
    public static final String UNITS_PROPERTY = "units";
    public static final String UPDATED_AT_PROPERTY = "updatedAt";
    public static final String CHANNEL_VALUES_PROPERTY = "channelValues";
    public static final String K0VALUES_PROPERTY = "k0Values";

    public static final String ID_PK_COLUMN = "id";

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

    public void setImage(String image) {
        writeProperty("image", image);
    }
    public String getImage() {
        return (String)readProperty("image");
    }

    public void setMath(String math) {
        writeProperty("math", math);
    }
    public String getMath() {
        return (String)readProperty("math");
    }

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void setUnits(String units) {
        writeProperty("units", units);
    }
    public String getUnits() {
        return (String)readProperty("units");
    }

    public void setUpdatedAt(Date updatedAt) {
        writeProperty("updatedAt", updatedAt);
    }
    public Date getUpdatedAt() {
        return (Date)readProperty("updatedAt");
    }

    public void addToChannelValues(ChannelValue obj) {
        addToManyTarget("channelValues", obj, true);
    }
    public void removeFromChannelValues(ChannelValue obj) {
        removeToManyTarget("channelValues", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<ChannelValue> getChannelValues() {
        return (List<ChannelValue>)readProperty("channelValues");
    }


    public void addToK0Values(K0Value obj) {
        addToManyTarget("k0Values", obj, true);
    }
    public void removeFromK0Values(K0Value obj) {
        removeToManyTarget("k0Values", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<K0Value> getK0Values() {
        return (List<K0Value>)readProperty("k0Values");
    }


}
