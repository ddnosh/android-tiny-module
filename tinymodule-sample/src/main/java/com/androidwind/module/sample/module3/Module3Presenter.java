package com.androidwind.module.sample.module3;

import com.androidwind.module.sample.mvp.BasePresenter;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class Module3Presenter extends BasePresenter<Module3> implements Module3Contract.Presenter {
    @Override
    public void tryToPrintSomething() {
        mView.toastSomething();
    }
}
