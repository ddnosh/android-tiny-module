package com.androidwind.module.sample.mvp;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public interface BaseContract {

    interface BasePresenter<T extends BaseContract.BaseView> {

    }

    interface BaseView {

    }
}
