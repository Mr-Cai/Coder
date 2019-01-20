package com.coder.guoy.recyclerview.ui.holder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.coder.guoy.recyclerview.R;
import com.coder.guoy.recyclerview.base.MvvmBaseActivity;
import com.coder.guoy.recyclerview.databinding.ActivityRecyclerViewHolderBinding;
import com.coder.guoy.recyclerview.ui.recyclerview.SampleActivity;
import com.coder.guoy.recyclerview.ui.recyclerview.WelfareActivity;
import com.coder.guoy.recyclerview.ui.recyclerview.WelfareAnimationActivity;

/**
 * @Version:
 * @Author:
 * @CreateTime:2017年5月11日
 * @Descrpiton:
 */
public class RecyclerViewHolder extends MvvmBaseActivity<ActivityRecyclerViewHolderBinding> implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_holder);
        showContentView();
        setTitle("RecyclerView");
        bindingView.button1.setOnClickListener(this);
        bindingView.button2.setOnClickListener(this);
        bindingView.button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.toolbar_back:
                finish();
                break;
            case R.id.button1:
                startActivity(new Intent(RecyclerViewHolder.this, SampleActivity.class));
                break;
            case R.id.button2:
                startActivity(new Intent(RecyclerViewHolder.this, WelfareActivity.class));
                break;
            case R.id.button3:
                startActivity(new Intent(RecyclerViewHolder.this, WelfareAnimationActivity.class));
                break;
        }
    }
}
