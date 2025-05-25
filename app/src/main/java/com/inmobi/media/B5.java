package com.inmobi.media;

import android.net.Uri;
import com.adjust.sdk.Constants;

/* loaded from: classes2.dex */
public abstract class B5 {
    public static String a(String str, String str2) {
        String str3;
        if (str != null && str.length() != 0) {
            try {
                Uri parse = Uri.parse(str);
                String scheme = parse.getScheme();
                if (scheme != null && scheme.length() != 0) {
                    if (kotlin.jvm.internal.g.a(parse.getScheme(), "inmobinativebrowser")) {
                        return "inmobinativebrowser";
                    }
                    if (kotlin.jvm.internal.g.a(parse.getScheme(), "inmobideeplink")) {
                        return "inmobideeplink";
                    }
                    if (str.length() != 0) {
                        Uri parse2 = Uri.parse(str);
                        if (!kotlin.jvm.internal.g.a("market", parse2.getScheme())) {
                            if (!kotlin.jvm.internal.g.a("play.google.com", parse2.getHost())) {
                                if (kotlin.jvm.internal.g.a("market.android.com", parse2.getHost())) {
                                }
                            }
                        }
                        return "market";
                    }
                    if (AbstractC1551a2.a(parse)) {
                        if (str2 == null) {
                            str3 = "DEFAULT";
                        } else {
                            return str2;
                        }
                    } else {
                        str3 = Constants.DEEPLINK;
                    }
                    return str3;
                }
                return "invalid";
            } catch (Exception unused) {
            }
        }
        return "invalid";
    }
}
