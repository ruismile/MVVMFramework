package com.hanrx.mvvmframework;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import it.sephiroth.android.library.picasso.Picasso;


public class User extends BaseObservable {
    private String name;

    private String password;

    private String header;

    public User(String name, String password, String header) {
        this.name = name;
        this.password = password;
        this.header = header;
    }

    @BindingAdapter("bind:header")
    public static void getImage(ImageView view, String url) {
        Picasso.with(view.getContext()).load(url).into(view);
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
    }
}
