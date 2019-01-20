package com.coder.guoy.recyclerview.ui;

import android.os.Bundle;
import android.view.View;

import com.coder.guoy.recyclerview.R;
import com.coder.guoy.recyclerview.base.MvvmBaseActivity;
import com.coder.guoy.recyclerview.databinding.ActivityPlayFloatingActionButtonBinding;
import com.coder.guoy.recyclerview.utils.ToastUtil;

/**
 * @Version:v1.0
 * @Author:Guoy
 * @CreateTime:2017年4月28日
 * @Descrpiton:FloatingActionButton|悬浮按钮
 */
public class PlayFloatingActionButton extends MvvmBaseActivity<ActivityPlayFloatingActionButtonBinding> implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_floating_action_button);
        showContentView();
        setTitle("FloatingActionButton");
        bindingView.fab.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fab:
                ToastUtil.show("FAB被点击");
                break;
        }
    }
}
