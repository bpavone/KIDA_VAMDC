package org.vamdc.kida.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.vamdc.kida.Bibliography;
import org.vamdc.kida.ChannelValue;
import org.vamdc.kida.TotalRate;
import org.vamdc.kida.VariableName;

/**
 * Class _ChannelVariable was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ChannelVariable extends CayenneDataObject {

    public static final String COMMENT_PROPERTY = "comment";
    public static final String CREATED_AT_PROPERTY = "createdAt";
    public static final String EXPOSANT_PROPERTY = "exposant";
    public static final String REF_PROPERTY = "ref";
    public static final String TYPE_UNCERT_PROPERTY = "typeUncert";
    public static final String UNCERT_PROPERTY = "uncert";
    public static final String UPDATED_AT_PROPERTY = "updatedAt";
    public static final String VALUE_PROPERTY = "value";
    public static final String TO_BIBLIOGRAPHY_PROPERTY = "toBibliography";
    public static final String TO_CHANNEL_VALUE_PROPERTY = "toChannelValue";
    public static final String TO_TOTAL_RATE_PROPERTY = "toTotalRate";
    public static final String TO_VARIABLE_NAME_PROPERTY = "toVariableName";

    public static final String ID_PK_COLUMN = "id";

    public void setComment(String comment) {
        writeProperty("comment", comment);
    }
    public String getComment() {
        return (String)readProperty("comment");
    }

    public void setCreatedAt(Date createdAt) {
        writeProperty("createdAt", createdAt);
    }
    public Date getCreatedAt() {
        return (Date)readProperty("createdAt");
    }

    public void setExposant(Integer exposant) {
        writeProperty("exposant", exposant);
    }
    public Integer getExposant() {
        return (Integer)readProperty("exposant");
    }

    public void setRef(String ref) {
        writeProperty("ref", ref);
    }
    public String getRef() {
        return (String)readProperty("ref");
    }

    public void setTypeUncert(String typeUncert) {
        writeProperty("typeUncert", typeUncert);
    }
    public String getTypeUncert() {
        return (String)readProperty("typeUncert");
    }

    public void setUncert(String uncert) {
        writeProperty("uncert", uncert);
    }
    public String getUncert() {
        return (String)readProperty("uncert");
    }

    public void setUpdatedAt(Date updatedAt) {
        writeProperty("updatedAt", updatedAt);
    }
    public Date getUpdatedAt() {
        return (Date)readProperty("updatedAt");
    }

    public void setValue(Float value) {
        writeProperty("value", value);
    }
    public Float getValue() {
        return (Float)readProperty("value");
    }

    public void setToBibliography(Bibliography toBibliography) {
        setToOneTarget("toBibliography", toBibliography, true);
    }

    public Bibliography getToBibliography() {
        return (Bibliography)readProperty("toBibliography");
    }


    public void setToChannelValue(ChannelValue toChannelValue) {
        setToOneTarget("toChannelValue", toChannelValue, true);
    }

    public ChannelValue getToChannelValue() {
        return (ChannelValue)readProperty("toChannelValue");
    }


    public void setToTotalRate(TotalRate toTotalRate) {
        setToOneTarget("toTotalRate", toTotalRate, true);
    }

    public TotalRate getToTotalRate() {
        return (TotalRate)readProperty("toTotalRate");
    }


    public void setToVariableName(VariableName toVariableName) {
        setToOneTarget("toVariableName", toVariableName, true);
    }

    public VariableName getToVariableName() {
        return (VariableName)readProperty("toVariableName");
    }


}
