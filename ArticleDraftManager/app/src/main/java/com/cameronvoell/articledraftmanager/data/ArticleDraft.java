package com.cameronvoell.articledraftmanager.data;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "article_draft_table")
public class ArticleDraft {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "draftId")
    public int draftId = 0;

    @NonNull
    @ColumnInfo(name = "title")
    public String mTitle;
    @ColumnInfo(name = "body")
    public String mBody;
    @NonNull
    @ColumnInfo(name = "date")
    public long mDate;

    public ArticleDraft(String title, String body, long date){
        mTitle = title;
        mBody = body;
        mDate = date;
    }
}
