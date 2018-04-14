package com.example.sulta.butterknifedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.textView)
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        mTextView.setText("Iam a butter knife  please  use me ...");


    }


    @OnClick(R.id.main_btn) void onButtonClicked(View view){
        switch (view.getId())
        {
            case R.id.main_btn:
            {
                Toast.makeText(this, "butter knife on a button tested", Toast.LENGTH_SHORT).show();
            }
            default:
            {
                //ToDo another action
            }
        }
    }



}
