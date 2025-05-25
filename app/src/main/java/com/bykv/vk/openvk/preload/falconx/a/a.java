package com.bykv.vk.openvk.preload.falconx.a;

import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import java.io.InputStream;
import java.util.Map;

/* compiled from: WebResourceUtils.java */
/* loaded from: classes.dex */
public final class a {
    public static WebResourceResponse a(InputStream inputStream, Map<String, String> map) {
        if (inputStream != null) {
            try {
                String str = map.get("content-type");
                boolean z10 = false;
                String[] strArr = new String[0];
                if (TextUtils.isEmpty(str)) {
                    str = map.get("Content-Type");
                }
                if (!TextUtils.isEmpty(str) && str != null) {
                    str = str.replace(" ", "");
                    strArr = str.split(";");
                }
                String str2 = "";
                String str3 = str2;
                for (String str4 : strArr) {
                    if (!TextUtils.isEmpty(str4)) {
                        int indexOf = str4.indexOf("=");
                        if (indexOf == -1) {
                            str2 = str4;
                        } else if (str4.contains("charset")) {
                            str3 = str4.substring(indexOf + 1);
                        }
                    }
                }
                if (str != null) {
                    z10 = str.contains("font/ttf");
                }
                if (z10) {
                    return new WebResourceResponse(str2, str3, 200, "OK", map, inputStream);
                }
                WebResourceResponse webResourceResponse = new WebResourceResponse(str2, str3, inputStream);
                webResourceResponse.setResponseHeaders(map);
                return webResourceResponse;
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }
}
