package com.hello.heimafragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by iwan on 16/1/16.
 */
public class Fragment03 extends Fragment {


    private TextView tv;

    //返回的view对象会作为fragment03的内容显示在屏幕上
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //使用布局填充器加载布局文件
        View v = inflater.inflate(R.layout.fragment03,null);

        tv = (TextView) v.findViewById(R.id.tv);

        return v;
    }

    //给textView显示文本,数据从MainActivty中来
    public void setText(String text){
        tv.setText(text);
    }
}
