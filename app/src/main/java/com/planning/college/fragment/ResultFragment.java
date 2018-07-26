package com.planning.college.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.planning.college.fragmentdemo3.R;

import org.w3c.dom.Text;

/**
 * Created by KUIKUI on 2018-05-22.
 */

public class ResultFragment extends Fragment {


    private TextView tv_show;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_result, null);


        tv_show = view.findViewById(R.id.tv_show);
        //获取Actitvity传来的数据，从bundle中获取
        Bundle bundle = getArguments();
        if(bundle!=null){
            //说明有值传来
            String info = bundle.getString("info");
            tv_show.setText(info);
        }


        return view;
    }
}
