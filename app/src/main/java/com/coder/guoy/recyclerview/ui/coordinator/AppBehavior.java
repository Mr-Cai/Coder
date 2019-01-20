package com.coder.guoy.recyclerview.ui.coordinator;

import android.content.Context;
import com.google.android.material.appbar.AppBarLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;

/**
 * @Version:
 * @Author:
 * @CreateTime:
 * @Descrpiton:
 */
public class AppBehavior extends CoordinatorLayout.Behavior<AppBarLayout> {

    private int directionChange;

    public AppBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    //判断滑动的方向 返回垂直滑动
    @Override
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout child, View directTargetChild, View target, int nestedScrollAxes) {
        return (nestedScrollAxes & ViewCompat.SCROLL_AXIS_VERTICAL) != 0;
    }

    //根据滑动的距离显示和隐藏 child
    @Override
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout child, View target, int dx, int dy, int[] consumed) {
        if (dy > 0 && directionChange < 0 || dy < 0 && directionChange > 0) {
            directionChange = 0;
        }
        directionChange += dy;
        if (directionChange > child.getHeight() && child.getVisibility() == View.VISIBLE) {
            child.setVisibility(View.GONE);
        } else if (directionChange < 0 && child.getVisibility() == View.GONE) {
            child.setVisibility(View.VISIBLE);
        }
    }
}
