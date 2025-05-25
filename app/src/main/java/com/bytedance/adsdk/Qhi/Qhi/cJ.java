package com.bytedance.adsdk.Qhi.Qhi;

/* compiled from: UnParsedException.java */
/* loaded from: classes.dex */
public class cJ extends RuntimeException {
    public cJ(String str, Throwable th2) {
        super("Unable to parse expression:".concat(String.valueOf(str)), th2);
    }
}
