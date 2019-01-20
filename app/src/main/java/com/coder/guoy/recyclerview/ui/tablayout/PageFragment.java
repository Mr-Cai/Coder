package com.coder.guoy.recyclerview.ui.tablayout;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.coder.guoy.recyclerview.R;

/**
 * @Version:
 * @Author:
 * @CreateTime:
 * @Descrpiton:
 */
public class PageFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_page, container, false);
        return view;
    }
}
