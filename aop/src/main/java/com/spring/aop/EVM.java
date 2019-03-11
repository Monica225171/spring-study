package com.spring.aop;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;

import java.awt.*;

public class EVM {

    public static void main(String[] args) {
        QrConfig config = new QrConfig(300, 300);
        // 设置边距，既二维码和背景之间的边距
        config.setMargin(3);
        // 设置前景色，既二维码颜色
        Color foreColor=new Color ( 58 ,95 ,205);
        // 设置背景色
        Color bgColor=new Color ( 255 ,193, 37 );
        int foreColorRGB=foreColor.getRGB ();
        int bgColorRGB=bgColor.getRGB ();
        config.setForeColor(foreColorRGB);
        config.setBackColor(bgColorRGB);
        //附带logo
        config.setImg ("d:/img.jpg");
        QrCodeUtil.generate("https://www.jianshu.com/u/1eb9e2dd4cdc", config ,FileUtil.file("d:/EVM.jpg"));
        }
}
