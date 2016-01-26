package com.hello.heimafragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by iwan on 16/1/16.
 */
public class Fragment01 extends Fragment {


    //返回的view对象会作为fragment01的内容显示在屏幕上
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //使用布局填充器加载布局文件
        View v = inflater.inflate(R.layout.fragment01,null);

        //查找edittext
        final EditText et = (EditText) v.findViewById(R.id.et_frag);

        //按钮监听
        Button bt = (Button) v.findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //从输入框获取内容
                String text = et.getText().toString();

                //把数据传递给Activity(先强转，再setText)
                ((MainActivity)getActivity()).setText(text);



            }
        });


        return v;
    }
}
