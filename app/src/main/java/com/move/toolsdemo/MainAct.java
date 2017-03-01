package com.move.toolsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.move.tools.android.L;
import com.move.tools.android.T;

public class MainAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);

        T.showShort(this,"提示");
        L.s("tag","提示");

    }
}
