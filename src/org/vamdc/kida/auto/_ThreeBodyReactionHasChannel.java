package org.vamdc.kida.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;
import org.vamdc.kida.ThreeBodyChannel;
import org.vamdc.kida.ThreeBodyReaction;

/**
 * Class _ThreeBodyReactionHasChannel was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ThreeBodyReactionHasChannel extends CayenneDataObject {

    public static final String CREATED_AT_PROPERTY = "createdAt";
    public static final String UPDATED_AT_PROPERTY = "updatedAt";
    public static final String TO_THREE_BODY_CHANNEL_PROPERTY = "toThreeBodyChannel";
    public static final String TO_THREE_BODY_REACTION_PROPERTY = "toThreeBodyReaction";

    public static final String CHANNEL_ID_PK_COLUMN = "channel_id";
    public static final String REACTION_ID_PK_COLUMN = "reaction_id";

    public void setCreatedAt(Date createdAt) {
        writeProperty("createdAt", createdAt);
    }
    public Date getCreatedAt() {
        return (Date)readProperty("createdAt");
    }

    public void setUpdatedAt(Date updatedAt) {
        writeProperty("updatedAt", updatedAt);
    }
    public Date getUpdatedAt() {
        return (Date)readProperty("updatedAt");
    }

    public void setToThreeBodyChannel(ThreeBodyChannel toThreeBodyChannel) {
        setToOneTarget("toThreeBodyChannel", toThreeBodyChannel, true);
    }

    public ThreeBodyChannel getToThreeBodyChannel() {
        return (ThreeBodyChannel)readProperty("toThreeBodyChannel");
    }


    public void setToThreeBodyReaction(ThreeBodyReaction toThreeBodyReaction) {
        setToOneTarget("toThreeBodyReaction", toThreeBodyReaction, true);
    }

    public ThreeBodyReaction getToThreeBodyReaction() {
        return (ThreeBodyReaction)readProperty("toThreeBodyReaction");
    }


}
