package com.hello.heimafragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Fragment03 fg3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //默认显示03的内容
        //把fragment01的界面显示到帧布局中
        //创建fragment对象
        fg3 = new Fragment03();

        //获取fragment管理器
        FragmentManager fm = getFragmentManager();

        //打开事务
        FragmentTransaction ft = fm.beginTransaction();

        //把内容显示到 MainActivity 的帧布局中,arg1: 帧布局id, 帧对象
        ft.replace(R.id.fl,fg3);

        //提交
        ft.commit();

    }

    public void click1(View v){

        //把fragment01的界面显示到帧布局中
        //创建fragment对象
        Fragment01 fg1 = new Fragment01();

        //获取fragment管理器
        FragmentManager fm = getFragmentManager();

        //打开事务
        FragmentTransaction ft = fm.beginTransaction();

        //把内容显示到帧布局,arg1: 帧布局id, 帧对象
        ft.replace(R.id.fl, fg1);

        //提交
        ft.commit();

    }
    public void click2(View v){

        //把fragment01的界面显示到帧布局中
        //创建fragment对象
        Fragment02 fg2 = new Fragment02();

        //获取fragment管理器
        FragmentManager fm = getFragmentManager();

        //打开事务
        FragmentTransaction ft = fm.beginTransaction();

        //把内容显示到帧布局,arg1: 帧布局id, 帧对象
        ft.replace(R.id.fl, fg2);

        //提交
        ft.commit();

    }
    public void click3(View v){

        //把fragment01的界面显示到帧布局中
        //创建fragment对象
        fg3 = new Fragment03();

        //获取fragment管理器
        FragmentManager fm = getFragmentManager();

        //打开事务
        FragmentTransaction ft = fm.beginTransaction();

        //把内容显示到帧布局,arg1: 帧布局id, 帧对象
        ft.replace(R.id.fl, fg3);

        //提交
        ft.commit();

    }

    public void click4(View v){
        EditText et_main = (EditText) findViewById(R.id.et_main);
        String text = et_main.getText().toString();

        //数据传给fragment03
        fg3.setText(text);
    }

    public void setText(String text){
        TextView tv = (TextView) findViewById(R.id.tv_fromfrag);
        tv.setText(text);

    }
}
