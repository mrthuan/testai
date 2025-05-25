package com.bytedance.sdk.openadsdk.core;

import android.util.Base64;

/* compiled from: AESKey.java */
/* loaded from: classes.dex */
public final class Qhi {
    private static final String Qhi = ac();
    private static final String cJ = HzH.CJ().ac();

    public static String Qhi() {
        return new String(Base64.decode(Qhi, 0)).substring(2);
    }

    private static String ac() {
        char[] cArr = {203, 182, 168, 176, 207, 148, 149, 178, 205, 182, 149, 166, 134, 178, 184, 176, 206, 174, 187, 178, 150, 185, 167, 166};
        char[] cArr2 = new char[24];
        for (int i10 = 23; i10 >= 0; i10--) {
            cArr2[23 - i10] = (char) (cArr[i10] ^ 255);
        }
        return new String(cArr2);
    }

    public static String cJ() {
        return new String(Base64.decode(cJ, 0)).substring(2);
    }
}
