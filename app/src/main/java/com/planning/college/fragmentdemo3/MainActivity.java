package com.planning.college.fragmentdemo3;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.planning.college.fragment.ResultFragment;

public class MainActivity extends AppCompatActivity {

    private FragmentManager manager;
    private FragmentTransaction transaction;


    private EditText et_info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et_info = findViewById(R.id.et_content);

        manager = getFragmentManager();
        transaction = manager.beginTransaction();
        transaction.add(R.id.contentlayout,new ResultFragment());
        transaction.commit();
    }


    public void sendValue(View v) {
        String info = et_info.getText().toString().trim();//获取editText的文本信息
        ResultFragment rf= new ResultFragment();
        //创建bundle对象，将需要传递得数据
        Bundle bundle = new Bundle();
        bundle.putString("info",info);
        rf.setArguments(bundle);

        manager = getFragmentManager();
        transaction = manager.beginTransaction();
        transaction.replace(R.id.contentlayout,rf);
        transaction.commit();//必须得提交
    }
}
