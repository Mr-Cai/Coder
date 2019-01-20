package com.coder.guoy.recyclerview.ui;

import android.os.Bundle;

import com.coder.guoy.recyclerview.R;
import com.coder.guoy.recyclerview.base.MvvmBaseActivity;
import com.coder.guoy.recyclerview.databinding.ActivityPlayCardViewBinding;

/**
 * @Version:
 * @Author:
 * @CreateTime:2017年5月12日
 * @Descrpiton:CardView
 */
public class PlayCardView extends MvvmBaseActivity<ActivityPlayCardViewBinding> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_card_view);
        showContentView();
        setTitle("CardView");
    }

}
