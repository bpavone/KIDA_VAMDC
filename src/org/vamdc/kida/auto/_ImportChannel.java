package org.vamdc.kida.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _ImportChannel was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ImportChannel extends CayenneDataObject {

    public static final String ALPHA_PROPERTY = "alpha";
    public static final String APPLICATION_PROPERTY = "application";
    public static final String BETA_PROPERTY = "beta";
    public static final String BIBTEX_PROPERTY = "bibtex";
    public static final String BIBTEX_FILE_PROPERTY = "bibtexFile";
    public static final String CREATED_AT_PROPERTY = "createdAt";
    public static final String CV_FIELD_PROPERTY = "cvField";
    public static final String DATABASE_PROPERTY = "database";
    public static final String DESCRIPTION_PROPERTY = "description";
    public static final String FORMULA_PROPERTY = "formula";
    public static final String G_PROPERTY = "g";
    public static final String GAMMA_PROPERTY = "gamma";
    public static final String IS_PAUSE_PROPERTY = "isPause";
    public static final String METHOD_PROPERTY = "method";
    public static final String ORIGIN_PROPERTY = "origin";
    public static final String PRODUCT1_PROPERTY = "product1";
    public static final String PRODUCT2_PROPERTY = "product2";
    public static final String PRODUCT3_PROPERTY = "product3";
    public static final String PRODUCT4_PROPERTY = "product4";
    public static final String PRODUCT5_PROPERTY = "product5";
    public static final String PRODUCT6_PROPERTY = "product6";
    public static final String REACTANT1_PROPERTY = "reactant1";
    public static final String REACTANT2_PROPERTY = "reactant2";
    public static final String TMAX_PROPERTY = "tmax";
    public static final String TMIN_PROPERTY = "tmin";
    public static final String TYPE_CHANNEL_PROPERTY = "typeChannel";
    public static final String TYPE_UNCERT_PROPERTY = "typeUncert";
    public static final String UNCERT_PROPERTY = "uncert";
    public static final String UPDATED_AT_PROPERTY = "updatedAt";

    public static final String ID_PK_COLUMN = "id";

    public void setAlpha(String alpha) {
        writeProperty("alpha", alpha);
    }
    public String getAlpha() {
        return (String)readProperty("alpha");
    }

    public void setApplication(String application) {
        writeProperty("application", application);
    }
    public String getApplication() {
        return (String)readProperty("application");
    }

    public void setBeta(String beta) {
        writeProperty("beta", beta);
    }
    public String getBeta() {
        return (String)readProperty("beta");
    }

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

    public void setCreatedAt(Date createdAt) {
        writeProperty("createdAt", createdAt);
    }
    public Date getCreatedAt() {
        return (Date)readProperty("createdAt");
    }

    public void setCvField(String cvField) {
        writeProperty("cvField", cvField);
    }
    public String getCvField() {
        return (String)readProperty("cvField");
    }

    public void setDatabase(String database) {
        writeProperty("database", database);
    }
    public String getDatabase() {
        return (String)readProperty("database");
    }

    public void setDescription(String description) {
        writeProperty("description", description);
    }
    public String getDescription() {
        return (String)readProperty("description");
    }

    public void setFormula(String formula) {
        writeProperty("formula", formula);
    }
    public String getFormula() {
        return (String)readProperty("formula");
    }

    public void setG(Float g) {
        writeProperty("g", g);
    }
    public Float getG() {
        return (Float)readProperty("g");
    }

    public void setGamma(String gamma) {
        writeProperty("gamma", gamma);
    }
    public String getGamma() {
        return (String)readProperty("gamma");
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

    public void setProduct1(String product1) {
        writeProperty("product1", product1);
    }
    public String getProduct1() {
        return (String)readProperty("product1");
    }

    public void setProduct2(String product2) {
        writeProperty("product2", product2);
    }
    public String getProduct2() {
        return (String)readProperty("product2");
    }

    public void setProduct3(String product3) {
        writeProperty("product3", product3);
    }
    public String getProduct3() {
        return (String)readProperty("product3");
    }

    public void setProduct4(String product4) {
        writeProperty("product4", product4);
    }
    public String getProduct4() {
        return (String)readProperty("product4");
    }

    public void setProduct5(String product5) {
        writeProperty("product5", product5);
    }
    public String getProduct5() {
        return (String)readProperty("product5");
    }

    public void setProduct6(String product6) {
        writeProperty("product6", product6);
    }
    public String getProduct6() {
        return (String)readProperty("product6");
    }

    public void setReactant1(String reactant1) {
        writeProperty("reactant1", reactant1);
    }
    public String getReactant1() {
        return (String)readProperty("reactant1");
    }

    public void setReactant2(String reactant2) {
        writeProperty("reactant2", reactant2);
    }
    public String getReactant2() {
        return (String)readProperty("reactant2");
    }

    public void setTmax(Integer tmax) {
        writeProperty("tmax", tmax);
    }
    public Integer getTmax() {
        return (Integer)readProperty("tmax");
    }

    public void setTmin(Integer tmin) {
        writeProperty("tmin", tmin);
    }
    public Integer getTmin() {
        return (Integer)readProperty("tmin");
    }

    public void setTypeChannel(Integer typeChannel) {
        writeProperty("typeChannel", typeChannel);
    }
    public Integer getTypeChannel() {
        return (Integer)readProperty("typeChannel");
    }

    public void setTypeUncert(String typeUncert) {
        writeProperty("typeUncert", typeUncert);
    }
    public String getTypeUncert() {
        return (String)readProperty("typeUncert");
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

}
