package org.vamdc.kida.auto;

import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.vamdc.kida.ChannelValue;
import org.vamdc.kida.FcValue;
import org.vamdc.kida.K0Value;
import org.vamdc.kida.KinfValue;
import org.vamdc.kida.ThreeBodyChannelValue;

/**
 * Class _Formula was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Formula extends CayenneDataObject {

    public static final String CREATED_AT_PROPERTY = "createdAt";
    public static final String DESCRIPTION_PROPERTY = "description";
    public static final String IMAGE_PROPERTY = "image";
    public static final String MATH_PROPERTY = "math";
    public static final String NAME_PROPERTY = "name";
    public static final String UNITS_PROPERTY = "units";
    public static final String UPDATED_AT_PROPERTY = "updatedAt";
    public static final String CHANNEL_VALUE_ARRAY_PROPERTY = "channelValueArray";
    public static final String FC_VALUE_ARRAY_PROPERTY = "fcValueArray";
    public static final String K0VALUE_ARRAY_PROPERTY = "k0ValueArray";
    public static final String KINF_VALUE_ARRAY_PROPERTY = "kinfValueArray";
    public static final String THREE_BODY_CHANNEL_VALUE_ARRAY_PROPERTY = "threeBodyChannelValueArray";

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

    public void addToChannelValueArray(ChannelValue obj) {
        addToManyTarget("channelValueArray", obj, true);
    }
    public void removeFromChannelValueArray(ChannelValue obj) {
        removeToManyTarget("channelValueArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<ChannelValue> getChannelValueArray() {
        return (List<ChannelValue>)readProperty("channelValueArray");
    }


    public void addToFcValueArray(FcValue obj) {
        addToManyTarget("fcValueArray", obj, true);
    }
    public void removeFromFcValueArray(FcValue obj) {
        removeToManyTarget("fcValueArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<FcValue> getFcValueArray() {
        return (List<FcValue>)readProperty("fcValueArray");
    }


    public void addToK0ValueArray(K0Value obj) {
        addToManyTarget("k0ValueArray", obj, true);
    }
    public void removeFromK0ValueArray(K0Value obj) {
        removeToManyTarget("k0ValueArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<K0Value> getK0ValueArray() {
        return (List<K0Value>)readProperty("k0ValueArray");
    }


    public void addToKinfValueArray(KinfValue obj) {
        addToManyTarget("kinfValueArray", obj, true);
    }
    public void removeFromKinfValueArray(KinfValue obj) {
        removeToManyTarget("kinfValueArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<KinfValue> getKinfValueArray() {
        return (List<KinfValue>)readProperty("kinfValueArray");
    }


    public void addToThreeBodyChannelValueArray(ThreeBodyChannelValue obj) {
        addToManyTarget("threeBodyChannelValueArray", obj, true);
    }
    public void removeFromThreeBodyChannelValueArray(ThreeBodyChannelValue obj) {
        removeToManyTarget("threeBodyChannelValueArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<ThreeBodyChannelValue> getThreeBodyChannelValueArray() {
        return (List<ThreeBodyChannelValue>)readProperty("threeBodyChannelValueArray");
    }


}
