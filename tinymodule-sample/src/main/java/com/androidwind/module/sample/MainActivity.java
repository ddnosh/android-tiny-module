package com.androidwind.module.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.androidwind.module.sample.module3.Module3;

public class MainActivity extends AppCompatActivity implements IModuleCallback{

    private Module1 mModule1;
    private Module2 mModule2;
    private Module3 mModule3;// with MVP

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View search_root = findViewById(R.id.module_root);
        mModule1 = new Module1(search_root);
        mModule2 = new Module2(search_root, this);
        mModule3 = new Module3(search_root);

        BaseModule.initModulesView();
    }

    @Override
    public void onDestroy() {
        BaseModule.releaseModules();
        super.onDestroy();
    }

    public void click1(View view) {
        mModule1.hideView();
    }

    public void click2(View view) {
        mModule2.modify("123");
    }

    public void click3(View view) {
        mModule3.toastSomething();
    }

    @Override
    public void doModify(String content) {
        Toast.makeText(this, "Modify Content is: " + content, Toast.LENGTH_SHORT).show();
    }
}
