package com.hanrx.mvvmframework;

import android.databinding.DataBindingUtil;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hanrx.mvvmframework.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    User user;
    Handler handler = new Handler();
    UserField userField = new UserField();
    //android.databing
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //不能用 setContentView
        //setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        user = new User("李四", "123456789", "http://pic6.huitu.com/res/20130116/84481_20130116142820494200_1.jpg");
        binding.setUser(user);
        binding.setField(userField);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                /*user.setName("张三");
                user.setPassword("654321");*/
                userField.name.set("sindy");
                userField.password.set("123456978");
            }
        }, 2000);
    }
}
