package com.wbh.day38_sharesdk01;

import android.widget.ImageView;
import android.widget.TextView;

import cn.sharesdk.framework.TitleLayout;
import cn.sharesdk.framework.authorize.AuthorizeAdapter;

/**
 * Created by Administrator on 2016/10/17.
 */
public class MyCustomTitle extends AuthorizeAdapter {

    @Override
    public void onCreate() {
        super.onCreate();
        //授权页面标题栏去掉ShareSDK的Logo部分
        hideShareSDKLogo();
        //获取标题栏的布局
        TitleLayout titleLayout = getTitleLayout();
        //设置标题栏的背景颜色
        titleLayout.setBackgroundResource(R.color.colorAccent);
        //设置标题栏左边的返回图标
        ImageView left_icon = titleLayout.getBtnBack();
        left_icon.setImageResource(R.mipmap.card_icon_recovery);
        //设置标题栏的标题文字
        TextView tvTitle = titleLayout.getTvTitle();
        tvTitle.setText("新浪微博登录");
    }
}
