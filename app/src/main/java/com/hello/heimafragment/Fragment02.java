package com.hello.heimafragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by iwan on 16/1/16.
 */
public class Fragment02 extends Fragment {


    //返回的view对象会作为fragment02的内容显示在屏幕上
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //使用布局填充器加载布局文件
        View v = inflater.inflate(R.layout.fragment02,null);
        return v;
    }
}
