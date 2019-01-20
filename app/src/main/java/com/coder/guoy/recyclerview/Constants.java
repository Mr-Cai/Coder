package com.coder.guoy.recyclerview;

import android.os.Environment;

import java.io.File;

public class Constants {

    //================= URL =====================
    //干活集中营
    public static final String GANK_URL = "http://gank.io/api/";
    //豆瓣
    public static final String DOUBAN_URL = "Https://api.douban.com/";
    //壁纸
    public static final String BZ_URl = "http://www.win4000.com/";
    //桌面壁纸
    public static final String ZMBZ = BZ_URl + "wallpaper.html";
    //================= TYPE ====================
    //福利
    public static final String FULI = "福利";

    //================= PATH ====================

    public static final String PATH_DATA = App.getInstance().getCacheDir().getAbsolutePath() + File.separator + "data";

    public static final String PATH_CACHE = PATH_DATA + "/NetCache";

    public static final String PATH_SDCARD = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "code" + File.separator + "RecyclerView";

}
