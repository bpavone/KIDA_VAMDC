package org.vamdc.kida.dao.auto;

import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.vamdc.kida.dao.K0Value;

/**
 * Class _ThreeBodyChannelValue was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ThreeBodyChannelValue extends CayenneDataObject {

    public static final String APPLICATION_PROPERTY = "application";
    public static final String AUTHOR_EMAIL_PROPERTY = "authorEmail";
    public static final String CHANNEL_ID_PROPERTY = "channelId";
    public static final String CREATED_AT_PROPERTY = "createdAt";
    public static final String DESCRIPTION_PROPERTY = "description";
    public static final String EXPERT_EMAIL_PROPERTY = "expertEmail";
    public static final String EXPERTIZE_PROPERTY = "expertize";
    public static final String FORMULA_ID_PROPERTY = "formulaId";
    public static final String ID_PROPERTY = "id";
    public static final String IS_TRASH_PROPERTY = "isTrash";
    public static final String JUSTIFICATION_PROPERTY = "justification";
    public static final String STATUS_PROPERTY = "status";
    public static final String TRASH_AUTHOR_PROPERTY = "trashAuthor";
    public static final String TRASH_COMMENT_PROPERTY = "trashComment";
    public static final String UPDATED_AT_PROPERTY = "updatedAt";
    public static final String VALIDITY_RANGE_ID_PROPERTY = "validityRangeId";
    public static final String K0VALUES_PROPERTY = "k0Values";

    public static final String ID_PK_COLUMN = "id";

    public void setApplication(String application) {
        writeProperty("application", application);
    }
    public String getApplication() {
        return (String)readProperty("application");
    }

    public void setAuthorEmail(String authorEmail) {
        writeProperty("authorEmail", authorEmail);
    }
    public String getAuthorEmail() {
        return (String)readProperty("authorEmail");
    }

    public void setChannelId(Integer channelId) {
        writeProperty("channelId", channelId);
    }
    public Integer getChannelId() {
        return (Integer)readProperty("channelId");
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

    public void setExpertEmail(String expertEmail) {
        writeProperty("expertEmail", expertEmail);
    }
    public String getExpertEmail() {
        return (String)readProperty("expertEmail");
    }

    public void setExpertize(Integer expertize) {
        writeProperty("expertize", expertize);
    }
    public Integer getExpertize() {
        return (Integer)readProperty("expertize");
    }

    public void setFormulaId(Integer formulaId) {
        writeProperty("formulaId", formulaId);
    }
    public Integer getFormulaId() {
        return (Integer)readProperty("formulaId");
    }

    public void setId(Integer id) {
        writeProperty("id", id);
    }
    public Integer getId() {
        return (Integer)readProperty("id");
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

    public void setValidityRangeId(Integer validityRangeId) {
        writeProperty("validityRangeId", validityRangeId);
    }
    public Integer getValidityRangeId() {
        return (Integer)readProperty("validityRangeId");
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
