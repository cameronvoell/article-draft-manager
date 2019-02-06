package com.cameronvoell.articledraftmanager.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.cameronvoell.articledraftmanager.R;
import com.cameronvoell.articledraftmanager.data.ArticleDraft;
import java.util.Collections;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ArticleListAdapter extends RecyclerView.Adapter<ArticleListAdapter.ArticlePreviewViewHolder> {

    private final LayoutInflater mInflater;
    private List<ArticleDraft> mArticleDrafts = Collections.emptyList();

    public class ArticlePreviewViewHolder extends RecyclerView.ViewHolder {
        private final TextView titleView;
        private final TextView bodyView;
        private final TextView dateView;
        public ArticlePreviewViewHolder(@NonNull View itemView) {
            super(itemView);
            titleView = itemView.findViewById(R.id.articleTitle);
            bodyView = itemView.findViewById(R.id.articleBody);
            dateView = itemView.findViewById(R.id.articleDate);
        }
    }

    public ArticleListAdapter(Context context) {
        mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ArticlePreviewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.recyclerview_article_preview_item, parent, false);
        return new ArticlePreviewViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ArticlePreviewViewHolder articlePreviewViewHolder, int position) {
        ArticleDraft articleDraft = mArticleDrafts.get(position);
        articlePreviewViewHolder.titleView.setText(articleDraft.mTitle);
        articlePreviewViewHolder.bodyView.setText(articleDraft.mBody);
        articlePreviewViewHolder.dateView.setText(articleDraft.mDate);
    }

    public void setArticleDrafts(List<ArticleDraft> articleDrafts) {
        mArticleDrafts = articleDrafts;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mArticleDrafts.size();
    }
}
