package com.gaos.jannotationexapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Apple apple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMyComponent.builder().appModule(new AppModule()).build().inject(this);
        initView();

        nonNullEx();
    }

    /**
     * @NonNull 写给程序员看的
     */
    private void nonNullEx() {
        MyClass myClass = new MyClass(null);

    }

    private void initView() {

        Button btnAnnotation = (Button) findViewById(R.id.btn_annotation_main);
        btnAnnotation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Log.e("apple", "onClick: " + apple.toString());
                FruitInfoUtil.getInstance().setFruitClazz(apple.getClass()).initFields();
            }
        });
    }
}
