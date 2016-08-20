package org.frikadelki.ash.telegram.api.inlinemode;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import org.frikadelki.ash.telegram.api.base.TgmEntity;
import org.frikadelki.ash.telegram.api.chat.TgmUser;

/**
 * Created by d.morozov on 20/08/16.
 */
public class InlineQuery
{
    @SerializedName("id")
    @Getter private long id = TgmEntity.INVALID_ID;

    @SerializedName("from")
    @Getter private TgmUser from = null;

    @SerializedName("query")
    @Getter private String query = null;

    @SerializedName("offset")
    @Getter private String offset = null;
}
