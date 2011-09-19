package org.vamdc.kida.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.vamdc.kida.Specie;
import org.vamdc.kida.ThreeBodyChannel;

/**
 * Class _ThreeBodyChannelHasSpecie was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ThreeBodyChannelHasSpecie extends CayenneDataObject {

    public static final String CREATED_AT_PROPERTY = "createdAt";
    public static final String OCCURRENCE_PROPERTY = "occurrence";
    public static final String ORDRE_PROPERTY = "ordre";
    public static final String UPDATED_AT_PROPERTY = "updatedAt";
    public static final String TO_SPECIE_PROPERTY = "toSpecie";
    public static final String TO_THREE_BODY_CHANNEL_PROPERTY = "toThreeBodyChannel";

    public static final String CHANNEL_ID_PK_COLUMN = "channel_id";
    public static final String SPECIE_ID_PK_COLUMN = "specie_id";
    public static final String TYPE_PK_COLUMN = "type";

    public void setCreatedAt(Date createdAt) {
        writeProperty("createdAt", createdAt);
    }
    public Date getCreatedAt() {
        return (Date)readProperty("createdAt");
    }

    public void setOccurrence(Integer occurrence) {
        writeProperty("occurrence", occurrence);
    }
    public Integer getOccurrence() {
        return (Integer)readProperty("occurrence");
    }

    public void setOrdre(Integer ordre) {
        writeProperty("ordre", ordre);
    }
    public Integer getOrdre() {
        return (Integer)readProperty("ordre");
    }

    public void setUpdatedAt(Date updatedAt) {
        writeProperty("updatedAt", updatedAt);
    }
    public Date getUpdatedAt() {
        return (Date)readProperty("updatedAt");
    }

    public void setToSpecie(Specie toSpecie) {
        setToOneTarget("toSpecie", toSpecie, true);
    }

    public Specie getToSpecie() {
        return (Specie)readProperty("toSpecie");
    }


    public void setToThreeBodyChannel(ThreeBodyChannel toThreeBodyChannel) {
        setToOneTarget("toThreeBodyChannel", toThreeBodyChannel, true);
    }

    public ThreeBodyChannel getToThreeBodyChannel() {
        return (ThreeBodyChannel)readProperty("toThreeBodyChannel");
    }


}
