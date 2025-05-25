package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;

/* compiled from: JsBridgeUtils.java */
/* loaded from: classes.dex */
public class HzH {
    public static void Qhi(Uri uri, com.bytedance.sdk.openadsdk.core.NFd nFd) {
        if (nFd == null || !nFd.Qhi(uri)) {
            return;
        }
        try {
            nFd.cJ(uri);
        } catch (Exception e10) {
            e10.toString();
        }
    }

    public static String Qhi(WebView webView, int i10) {
        if (webView == null) {
            return "";
        }
        String userAgentString = webView.getSettings().getUserAgentString();
        if (TextUtils.isEmpty(userAgentString)) {
            return "";
        }
        return userAgentString + " open_news open_news_u_s/" + i10;
    }
}
