package com.ishiqing.modules.thread;

import android.view.View;

import com.ishiqing.R;
import com.ishiqing.base.fragment.BaseSwipeFragment;

/**
 * Thread
 * <p>
 * Created by javakam on 2018/7/9 .
 */
public class ThreadSwipeFragment extends BaseSwipeFragment {
    @Override
    protected int getLayoutResId() {
        return R.layout.fragment_thread;
    }

    @Override
    protected void initViews(View v) {
        initTopBar("Thread", true);
    }
}