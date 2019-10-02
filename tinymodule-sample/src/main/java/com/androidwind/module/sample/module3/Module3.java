package com.androidwind.module.sample.module3;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.androidwind.module.sample.R;
import com.androidwind.module.sample.mvp.BaseTModule;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */

public class Module3 extends BaseTModule<Module3Presenter> implements Module3Contract.View {
    private TextView mTextView;

    public Module3(View rootView) {
        super(rootView);
    }

    @Override
    protected void initView() {
        super.initView();
        mTextView =(TextView) findViewById(R.id.tv_module3);
        mTextView.setText("Module3 loaded!");
    }

    @Override
    protected void release() {
        super.release();
        System.out.println("Module3 released!");
    }

    @Override
    public void toastSomething() {
        Toast.makeText(mTextView.getContext(), "here is a module with MVP", Toast.LENGTH_SHORT).show();
    }
}
