package com.coder.guoy.recyclerview.ui;

import android.os.Bundle;

import com.coder.guoy.recyclerview.R;
import com.coder.guoy.recyclerview.base.MvvmBaseActivity;
import com.coder.guoy.recyclerview.databinding.ActivityPlayTouchFeedbackBinding;

/**
 * @Version:v1.0
 * @Author:Guoy
 * @CreateTime:2017年6月12日
 * @Descrpiton:TouchFeedback|触摸反馈
 */
public class PlayTouchFeedback extends MvvmBaseActivity<ActivityPlayTouchFeedbackBinding> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_touch_feedback);
        showContentView();
        setTitle("Touch Feedback|触摸反馈");
    }
}
