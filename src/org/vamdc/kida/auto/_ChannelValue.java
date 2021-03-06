package org.vamdc.kida.auto;

import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.vamdc.kida.Biblio;
import org.vamdc.kida.Channel;
import org.vamdc.kida.ChannelVariable;
import org.vamdc.kida.Formula;
import org.vamdc.kida.SfGuardUser;
import org.vamdc.kida.ValidityRange;

/**
 * Class _ChannelValue was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ChannelValue extends CayenneDataObject {

    public static final String ADD_JUSTIFICATION_PROPERTY = "addJustification";
    public static final String APPLICATION_PROPERTY = "application";
    public static final String CREATED_AT_PROPERTY = "createdAt";
    public static final String CV_FIELD_PROPERTY = "cvField";
    public static final String DATABASE_PROPERTY = "database";
    public static final String DESCRIPTION_PROPERTY = "description";
    public static final String EXPERT_AUTHORISED_PROPERTY = "expertAuthorised";
    public static final String EXPERTIZE_PROPERTY = "expertize";
    public static final String IS_TEMP_PROPERTY = "isTemp";
    public static final String IS_TRASH_PROPERTY = "isTrash";
    public static final String JUSTIFICATION_PROPERTY = "justification";
    public static final String METHOD_PROPERTY = "method";
    public static final String ORIGIN_PROPERTY = "origin";
    public static final String REF_PROPERTY = "ref";
    public static final String STATUS_PROPERTY = "status";
    public static final String TRASH_AUTHOR_PROPERTY = "trashAuthor";
    public static final String TRASH_COMMENT_PROPERTY = "trashComment";
    public static final String UPDATED_AT_PROPERTY = "updatedAt";
    public static final String CHANNEL_VARIABLE_ARRAY_PROPERTY = "channelVariableArray";
    public static final String TO_BIBLIO_PROPERTY = "toBiblio";
    public static final String TO_CHANNEL_PROPERTY = "toChannel";
    public static final String TO_FORMULA_PROPERTY = "toFormula";
    public static final String TO_SF_GUARD_USER_PROPERTY = "toSfGuardUser";
    public static final String TO_SF_GUARD_USER1_PROPERTY = "toSfGuardUser1";
    public static final String TO_VALIDITY_RANGE_PROPERTY = "toValidityRange";

    public static final String ID_PK_COLUMN = "id";

    public void setAddJustification(String addJustification) {
        writeProperty("addJustification", addJustification);
    }
    public String getAddJustification() {
        return (String)readProperty("addJustification");
    }

    public void setApplication(String application) {
        writeProperty("application", application);
    }
    public String getApplication() {
        return (String)readProperty("application");
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

    public void setExpertAuthorised(String expertAuthorised) {
        writeProperty("expertAuthorised", expertAuthorised);
    }
    public String getExpertAuthorised() {
        return (String)readProperty("expertAuthorised");
    }

    public void setExpertize(Integer expertize) {
        writeProperty("expertize", expertize);
    }
    public Integer getExpertize() {
        return (Integer)readProperty("expertize");
    }

    public void setIsTemp(Byte isTemp) {
        writeProperty("isTemp", isTemp);
    }
    public Byte getIsTemp() {
        return (Byte)readProperty("isTemp");
    }

    public void setIsTrash(Integer isTrash) {
        writeProperty("isTrash", isTrash);
    }
    public Integer getIsTrash() {
        return (Integer)readProperty("isTrash");
    }

    public void setJustification(String justification) {
        writeProperty("justification", justification);
    }
    public String getJustification() {
        return (String)readProperty("justification");
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

    public void setRef(String ref) {
        writeProperty("ref", ref);
    }
    public String getRef() {
        return (String)readProperty("ref");
    }

    public void setStatus(Integer status) {
        writeProperty("status", status);
    }
    public Integer getStatus() {
        return (Integer)readProperty("status");
    }

    public void setTrashAuthor(String trashAuthor) {
        writeProperty("trashAuthor", trashAuthor);
    }
    public String getTrashAuthor() {
        return (String)readProperty("trashAuthor");
    }

    public void setTrashComment(String trashComment) {
        writeProperty("trashComment", trashComment);
    }
    public String getTrashComment() {
        return (String)readProperty("trashComment");
    }

    public void setUpdatedAt(Date updatedAt) {
        writeProperty("updatedAt", updatedAt);
    }
    public Date getUpdatedAt() {
        return (Date)readProperty("updatedAt");
    }

    public void addToChannelVariableArray(ChannelVariable obj) {
        addToManyTarget("channelVariableArray", obj, true);
    }
    public void removeFromChannelVariableArray(ChannelVariable obj) {
        removeToManyTarget("channelVariableArray", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<ChannelVariable> getChannelVariableArray() {
        return (List<ChannelVariable>)readProperty("channelVariableArray");
    }


    public void setToBiblio(Biblio toBiblio) {
        setToOneTarget("toBiblio", toBiblio, true);
    }

    public Biblio getToBiblio() {
        return (Biblio)readProperty("toBiblio");
    }


    public void setToChannel(Channel toChannel) {
        setToOneTarget("toChannel", toChannel, true);
    }

    public Channel getToChannel() {
        return (Channel)readProperty("toChannel");
    }


    public void setToFormula(Formula toFormula) {
        setToOneTarget("toFormula", toFormula, true);
    }

    public Formula getToFormula() {
        return (Formula)readProperty("toFormula");
    }


    public void setToSfGuardUser(SfGuardUser toSfGuardUser) {
        setToOneTarget("toSfGuardUser", toSfGuardUser, true);
    }

    public SfGuardUser getToSfGuardUser() {
        return (SfGuardUser)readProperty("toSfGuardUser");
    }


    public void setToSfGuardUser1(SfGuardUser toSfGuardUser1) {
        setToOneTarget("toSfGuardUser1", toSfGuardUser1, true);
    }

    public SfGuardUser getToSfGuardUser1() {
        return (SfGuardUser)readProperty("toSfGuardUser1");
    }


    public void setToValidityRange(ValidityRange toValidityRange) {
        setToOneTarget("toValidityRange", toValidityRange, true);
    }

    public ValidityRange getToValidityRange() {
        return (ValidityRange)readProperty("toValidityRange");
    }


}
