package org.vamdc.kida.dao.auto;

import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.vamdc.kida.dao.ChannelVariable;

/**
 * Class _Bibliography was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Bibliography extends CayenneDataObject {

    public static final String AUTHORS_PROPERTY = "authors";
    public static final String CATEGORY_PROPERTY = "category";
    public static final String CREATED_AT_PROPERTY = "createdAt";
    public static final String DOI_PROPERTY = "doi";
    public static final String ENTITY_TYPE_PROPERTY = "entityType";
    public static final String ID_PROPERTY = "id";
    public static final String JOURNAL_ID_PROPERTY = "journalId";
    public static final String MAIN_AUTHOR_PROPERTY = "mainAuthor";
    public static final String OTHER_JOURNAL_PROPERTY = "otherJournal";
    public static final String PAGE_PROPERTY = "page";
    public static final String TITLE_PROPERTY = "title";
    public static final String UPDATED_AT_PROPERTY = "updatedAt";
    public static final String URL_PROPERTY = "url";
    public static final String YEAR_PROPERTY = "year";
    public static final String CHANNEL_VARIABLES_PROPERTY = "channelVariables";

    public static final String ID_PK_COLUMN = "id";

    public void setAuthors(String authors) {
        writeProperty("authors", authors);
    }
    public String getAuthors() {
        return (String)readProperty("authors");
    }

    public void setCategory(String category) {
        writeProperty("category", category);
    }
    public String getCategory() {
        return (String)readProperty("category");
    }

    public void setCreatedAt(Date createdAt) {
        writeProperty("createdAt", createdAt);
    }
    public Date getCreatedAt() {
        return (Date)readProperty("createdAt");
    }

    public void setDoi(String doi) {
        writeProperty("doi", doi);
    }
    public String getDoi() {
        return (String)readProperty("doi");
    }

    public void setEntityType(String entityType) {
        writeProperty("entityType", entityType);
    }
    public String getEntityType() {
        return (String)readProperty("entityType");
    }

    public void setId(Long id) {
        writeProperty("id", id);
    }
    public Long getId() {
        return (Long)readProperty("id");
    }

    public void setJournalId(Long journalId) {
        writeProperty("journalId", journalId);
    }
    public Long getJournalId() {
        return (Long)readProperty("journalId");
    }

    public void setMainAuthor(String mainAuthor) {
        writeProperty("mainAuthor", mainAuthor);
    }
    public String getMainAuthor() {
        return (String)readProperty("mainAuthor");
    }

    public void setOtherJournal(String otherJournal) {
        writeProperty("otherJournal", otherJournal);
    }
    public String getOtherJournal() {
        return (String)readProperty("otherJournal");
    }

    public void setPage(String page) {
        writeProperty("page", page);
    }
    public String getPage() {
        return (String)readProperty("page");
    }

    public void setTitle(String title) {
        writeProperty("title", title);
    }
    public String getTitle() {
        return (String)readProperty("title");
    }

    public void setUpdatedAt(Date updatedAt) {
        writeProperty("updatedAt", updatedAt);
    }
    public Date getUpdatedAt() {
        return (Date)readProperty("updatedAt");
    }

    public void setUrl(String url) {
        writeProperty("url", url);
    }
    public String getUrl() {
        return (String)readProperty("url");
    }

    public void setYear(Long year) {
        writeProperty("year", year);
    }
    public Long getYear() {
        return (Long)readProperty("year");
    }

    public void addToChannelVariables(ChannelVariable obj) {
        addToManyTarget("channelVariables", obj, true);
    }
    public void removeFromChannelVariables(ChannelVariable obj) {
        removeToManyTarget("channelVariables", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<ChannelVariable> getChannelVariables() {
        return (List<ChannelVariable>)readProperty("channelVariables");
    }


}