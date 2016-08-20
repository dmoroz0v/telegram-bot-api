package org.frikadelki.ash.telegram.api.inlinemode;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.NonNull;

/**
 * Created by d.morozov on 20/08/16.
 */
@Builder
public class InlineQueryResultCachedSticker
{
    @SerializedName("type")
    @NonNull private String type; //String	Type of the result, must be sticker

    @SerializedName("id")
    @NonNull private String id; //String	Unique identifier for this result, 1-64 bytes

    @SerializedName("sticker_file_id")
    @NonNull private String stickerFileId; //String	A valid file identifier of the sticker
}
