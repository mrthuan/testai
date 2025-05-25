package com.bytedance.sdk.component.adexpress.CJ;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: UrlUtils.java */
/* loaded from: classes.dex */
public class Eh {

    /* compiled from: UrlUtils.java */
    /* loaded from: classes.dex */
    public enum Qhi {
        HTML("text/html"),
        CSS("text/css"),
        JS("application/x-javascript"),
        IMAGE("image/*");
        

        /* renamed from: fl  reason: collision with root package name */
        private String f8119fl;

        Qhi(String str) {
            this.f8119fl = str;
        }

        public String Qhi() {
            return this.f8119fl;
        }
    }

    public static Qhi Qhi(String str) {
        Qhi qhi = Qhi.IMAGE;
        if (!TextUtils.isEmpty(str)) {
            try {
                String path = Uri.parse(str).getPath();
                if (path != null) {
                    if (path.endsWith(".css")) {
                        qhi = Qhi.CSS;
                    } else if (path.endsWith(".js")) {
                        qhi = Qhi.JS;
                    } else if (!path.endsWith(".jpg") && !path.endsWith(".gif") && !path.endsWith(".png") && !path.endsWith(".jpeg") && !path.endsWith(".webp") && !path.endsWith(".bmp") && !path.endsWith(".ico") && path.endsWith(".html")) {
                        qhi = Qhi.HTML;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return qhi;
    }

    public static boolean cJ(String str) {
        Uri parse;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null) {
            return false;
        }
        String path = parse.getPath();
        if (TextUtils.isEmpty(path)) {
            return false;
        }
        return path.endsWith(".gif");
    }
}
