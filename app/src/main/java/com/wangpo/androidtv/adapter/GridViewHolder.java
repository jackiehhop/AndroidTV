package com.wangpo.androidtv.adapter;

import android.view.View;
import android.widget.TextView;

import com.wangpo.androidtv.R;
import com.wangpo.widgets.tv.leanback.mode.OpenPresenter;

public class GridViewHolder extends OpenPresenter.ViewHolder {
	
	public TextView tv;

	public GridViewHolder(View itemView) {
		super(itemView);
		tv = (TextView)itemView.findViewById(R.id.textView);
	}

}
