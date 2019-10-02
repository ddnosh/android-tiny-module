package com.androidwind.module.sample.module3;

import com.androidwind.module.sample.mvp.BaseContract;

public interface Module3Contract {

    interface View extends BaseContract.BaseView {
        void toastSomething();
    }

    interface Presenter extends BaseContract.BasePresenter<View> {
        void tryToPrintSomething();
    }
}
