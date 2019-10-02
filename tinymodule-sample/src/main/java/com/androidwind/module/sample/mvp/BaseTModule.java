package com.androidwind.module.sample.mvp;

import android.view.View;

import com.androidwind.module.sample.BaseModule;
import com.androidwind.module.sample.TUtil;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class BaseTModule<T extends BasePresenter> extends BaseModule {

    public T mPresenter;

    protected BaseTModule(View rootView) {
        super(rootView);
    }

    @Override
    protected void initView() {
        mPresenter = TUtil.getInstance(this, 0);
        mPresenter.initV(this);
    }

    @Override
    protected void release() {
        mPresenter.unInitV();
    }
}
