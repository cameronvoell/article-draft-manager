package com.cameronvoell.articledraftmanager.data;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "article_draft_table")
public class ArticleDraft {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "title")
    public String mTitle;
    @ColumnInfo(name = "body")
    public String mBody;
    @NonNull
    @ColumnInfo(name = "date")
    public String mDate;

    public ArticleDraft(String title, String body, String date){
        mTitle = title;
        mBody = body;
        mDate = date;
    }
}