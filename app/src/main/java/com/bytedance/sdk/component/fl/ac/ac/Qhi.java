package com.bytedance.sdk.component.fl.ac.ac;

import android.graphics.BitmapFactory;

/* compiled from: FileUtil.java */
/* loaded from: classes.dex */
public class Qhi {
    public static boolean Qhi(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        if (options.outWidth <= 0) {
            return false;
        }
        return true;
    }

    public static boolean cJ(byte[] bArr) {
        if (bArr == null || bArr.length < 3 || bArr[0] != 71 || bArr[1] != 73 || bArr[2] != 70) {
            return false;
        }
        return true;
    }
}
