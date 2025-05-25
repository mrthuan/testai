package com.bytedance.sdk.component.Tgh.Qhi;

/* compiled from: AssertUtils.java */
/* loaded from: classes.dex */
public class ac {
    public static void Qhi(Object obj, String str) {
        if (obj == null) {
            Qhi(str);
        }
    }

    public static void Qhi(String str) {
        throw new IllegalArgumentException(str);
    }
}
