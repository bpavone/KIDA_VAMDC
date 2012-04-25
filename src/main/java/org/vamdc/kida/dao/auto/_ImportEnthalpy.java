package org.vamdc.kida.dao.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _ImportEnthalpy was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ImportEnthalpy extends CayenneDataObject {

    public static final String BIBTEX_PROPERTY = "bibtex";
    public static final String BIBTEX_FILE_PROPERTY = "bibtexFile";
    public static final String COMMON_NAME_PROPERTY = "commonName";
    public static final String CREATED_AT_PROPERTY = "createdAt";
    public static final String DATABASE_PROPERTY = "database";
    public static final String ID_PROPERTY = "id";
    public static final String IS_PAUSE_PROPERTY = "isPause";
    public static final String METHOD_PROPERTY = "method";
    public static final String ORIGIN_PROPERTY = "origin";
    public static final String SPECIES_ID_PROPERTY = "speciesId";
    public static final String TEMPERATURE_PROPERTY = "temperature";
    public static final String UNCERT_PROPERTY = "uncert";
    public static final String UPDATED_AT_PROPERTY = "updatedAt";
    public static final String VALUE_PROPERTY = "value";

    public static final String ID_PK_COLUMN = "id";

    public void setBibtex(String bibtex) {
        writeProperty("bibtex", bibtex);
    }
    public String getBibtex() {
        return (String)readProperty("bibtex");
    }

    public void setBibtexFile(String bibtexFile) {
        writeProperty("bibtexFile", bibtexFile);
    }
    public String getBibtexFile() {
        return (String)readProperty("bibtexFile");
    }

    public void setCommonName(String commonName) {
        writeProperty("commonName", commonName);
    }
    public String getCommonName() {
        return (String)readProperty("commonName");
    }

    public void setCreatedAt(Date createdAt) {
        writeProperty("createdAt", createdAt);
    }
    public Date getCreatedAt() {
        return (Date)readProperty("createdAt");
    }

    public void setDatabase(String database) {
        writeProperty("database", database);
    }
    public String getDatabase() {
        return (String)readProperty("database");
    }

    public void setId(Integer id) {
        writeProperty("id", id);
    }
    public Integer getId() {
        return (Integer)readProperty("id");
    }

    public void setIsPause(Integer isPause) {
        writeProperty("isPause", isPause);
    }
    public Integer getIsPause() {
        return (Integer)readProperty("isPause");
    }

    public void setMethod(String method) {
        writeProperty("method", method);
    }
    public String getMethod() {
        return (String)readProperty("method");
    }

    public void setOrigin(String origin) {
        writeProperty("origin", origin);
    }
    public String getOrigin() {
        return (String)readProperty("origin");
    }

    public void setSpeciesId(Integer speciesId) {
        writeProperty("speciesId", speciesId);
    }
    public Integer getSpeciesId() {
        return (Integer)readProperty("speciesId");
    }

    public void setTemperature(Integer temperature) {
        writeProperty("temperature", temperature);
    }
    public Integer getTemperature() {
        return (Integer)readProperty("temperature");
    }

    public void setUncert(Float uncert) {
        writeProperty("uncert", uncert);
    }
    public Float getUncert() {
        return (Float)readProperty("uncert");
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

}