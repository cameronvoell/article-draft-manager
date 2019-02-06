package com.cameronvoell.articledraftmanager.data;


import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface ArticleDraftDao {
    @Query("SELECT * from article_draft_table ORDER BY date DESC")
    LiveData<List<ArticleDraft>> getArticleDraftsByDateDesc();

    @Insert
    void insert(ArticleDraft articleDraft);

    @Query("DELETE FROM article_draft_table")
    void deleteAll();
}
