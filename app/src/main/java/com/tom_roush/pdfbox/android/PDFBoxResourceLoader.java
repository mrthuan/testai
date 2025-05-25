package com.tom_roush.pdfbox.android;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class PDFBoxResourceLoader {
    private static AssetManager ASSET_MANAGER;

    public static InputStream getStream(String str) {
        return ASSET_MANAGER.open(str);
    }

    public static void init(Context context) {
        ASSET_MANAGER = context.getApplicationContext().getAssets();
    }

    public static boolean isReady() {
        if (ASSET_MANAGER != null) {
            return true;
        }
        return false;
    }
}
