package com.ycf.ptplayer.DataStructure;

import android.graphics.Bitmap;

public class ListItem {
	private Bitmap Thumbnails;
	private String ItemName;
	private String Description;

	public Bitmap getThumbnails() {
		return Thumbnails;
	}

	public void setThumbnails(Bitmap thumbnails) {
		Thumbnails = thumbnails;
	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
}
