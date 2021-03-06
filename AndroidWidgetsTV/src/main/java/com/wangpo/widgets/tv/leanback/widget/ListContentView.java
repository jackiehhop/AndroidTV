package com.wangpo.widgets.tv.leanback.widget;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.wangpo.widgets.tv.R;
import com.wangpo.widgets.tv.leanback.recycle.RecyclerViewTV;


/**
 * MenuContentView 是 Leanback 一个item 标题头下面的横向RecyclerView.
 */
public class ListContentView extends LinearLayout {

    private RecyclerViewTV mRecyclerViewTV;

    public ListContentView(Context context) {
        this(context, null);
    }

    public ListContentView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ListContentView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        //
        LayoutInflater inflater = LayoutInflater.from(context);
        inflater.inflate(R.layout.lb_content_view, this);
        mRecyclerViewTV = (RecyclerViewTV) findViewById(R.id.menu_content);
        //
        setOrientation(LinearLayout.VERTICAL);
        // 先分发给Child View进行处理，如果所有的Child View都没有处理，则自己再处理
        setDescendantFocusability(ViewGroup.FOCUS_AFTER_DESCENDANTS);
        // 让放大的item可以显示出来.
        setClipChildren(false);
        setClipToPadding(false);
    }

    public void setLayoutManager(LinearLayoutManager lm) {
        mRecyclerViewTV.setLayoutManager(lm);
    }

    public RecyclerViewTV getRecyclerViewTV() {
        return this.mRecyclerViewTV;
    }

}
