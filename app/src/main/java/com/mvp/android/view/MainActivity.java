package com.mvp.android.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.mvp.android.MVPApplication;
import com.mvp.android.R;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Inject
    Context context;

    @BindView(R.id.userId)
    EditText mUserId;

    @BindView(R.id.password)
    EditText mPasswordId;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }

    @Override
    protected void onResume() {
        super.onResume();

    }


    @OnClick(R.id.button)
    public void Login(View view) {
        Intent weatherIntent=new Intent(this,WeatherActivity.class);
        startActivity(weatherIntent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}
