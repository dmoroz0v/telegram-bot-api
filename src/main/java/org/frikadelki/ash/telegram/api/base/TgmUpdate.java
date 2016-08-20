/*
 * ASH Toolset
 * Copyright 2016 ASH Dev Team
 * Created by ein on 2016/7/18
 */

package org.frikadelki.ash.telegram.api.base;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import org.frikadelki.ash.telegram.api.inlinemode.InlineQuery;
import org.frikadelki.ash.telegram.api.message.TgmMessage;


public final class TgmUpdate {
	@SerializedName("update_id")
	@Getter private long updateId = TgmEntity.INVALID_ID;

	@SerializedName("message")
	@Getter private TgmMessage newMessage = null;
	@SerializedName("edited_message")
	@Getter private TgmMessage editedMessage = null;

	@SerializedName("inline_query")
	@Getter private InlineQuery inlineQuery = null;

	/**
	 * TODO
	 * inline_query			InlineQuery			// Optional. New incoming inline query
	 * chosen_inline_result	ChosenInlineResult	// Optional. The result of an inline query that was chosen by a user and sent to their chat partner.
	 * callback_query		CallbackQuery		// Optional. New incoming callback query
	 */

	public boolean isNewMessage() {
		return (newMessage != null);
	}

	public boolean isEditedMessage() {
		return (editedMessage != null);
	}
}
