package com.coder.guoy.recyclerview.ui.tagcloud;

import android.os.Bundle;

import com.coder.guoy.recyclerview.R;
import com.coder.guoy.recyclerview.base.MvvmBaseActivity;
import com.coder.guoy.recyclerview.databinding.ActivityTagCloudBinding;
import com.coder.guoy.recyclerview.utils.CommonUtils;

/**
 * @author 蔡凯歌
 * @version 1.1
 * @time 2019-1-20
 * @desc 模仿Soul首页3D星球
 */
public class TagCloudActivity extends MvvmBaseActivity<ActivityTagCloudBinding> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tag_cloud);
        showContentView();
        setTitle("3D球");
        bindingView.tagCloud.setBackgroundColor(CommonUtils.getColor(R.color.colorTheme));
        TagCloudAdapter adapter = new TagCloudAdapter(new String[100]);
        bindingView.tagCloud.setAdapter(adapter);
    }
}
