package org.vamdc.kida.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.vamdc.kida.Biblio;

/**
 * Class _BiblioBook was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _BiblioBook extends CayenneDataObject {

    public static final String BOOKTITLE_PROPERTY = "booktitle";
    public static final String CREATED_AT_PROPERTY = "createdAt";
    public static final String DOI_PROPERTY = "doi";
    public static final String EDITOR_PROPERTY = "editor";
    public static final String PAGES_PROPERTY = "pages";
    public static final String PUBLISHER_PROPERTY = "publisher";
    public static final String UPDATED_AT_PROPERTY = "updatedAt";
    public static final String TO_BIBLIO_PROPERTY = "toBiblio";

    public static final String BIBLIOGRAPHY_ID_PK_COLUMN = "bibliography_id";

    public void setBooktitle(String booktitle) {
        writeProperty("booktitle", booktitle);
    }
    public String getBooktitle() {
        return (String)readProperty("booktitle");
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

    public void setEditor(String editor) {
        writeProperty("editor", editor);
    }
    public String getEditor() {
        return (String)readProperty("editor");
    }

    public void setPages(String pages) {
        writeProperty("pages", pages);
    }
    public String getPages() {
        return (String)readProperty("pages");
    }

    public void setPublisher(String publisher) {
        writeProperty("publisher", publisher);
    }
    public String getPublisher() {
        return (String)readProperty("publisher");
    }

    public void setUpdatedAt(Date updatedAt) {
        writeProperty("updatedAt", updatedAt);
    }
    public Date getUpdatedAt() {
        return (Date)readProperty("updatedAt");
    }

    public void setToBiblio(Biblio toBiblio) {
        setToOneTarget("toBiblio", toBiblio, true);
    }

    public Biblio getToBiblio() {
        return (Biblio)readProperty("toBiblio");
    }


}
