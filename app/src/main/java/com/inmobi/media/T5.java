package com.inmobi.media;

import com.google.ads.mediation.inmobi.InMobiNetworkKeys;

/* loaded from: classes2.dex */
public abstract class T5 {
    public static final S5 a(String logLevel) {
        kotlin.jvm.internal.g.e(logLevel, "logLevel");
        if (kotlin.text.j.G(logLevel, "DEBUG", true)) {
            return S5.f14636b;
        }
        if (kotlin.text.j.G(logLevel, "ERROR", true)) {
            return S5.c;
        }
        if (kotlin.text.j.G(logLevel, "INFO", true)) {
            return S5.f14635a;
        }
        if (kotlin.text.j.G(logLevel, InMobiNetworkKeys.STATE, true)) {
            return S5.f14637d;
        }
        return S5.c;
    }
}
