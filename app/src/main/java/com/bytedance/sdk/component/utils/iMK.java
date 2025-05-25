package com.bytedance.sdk.component.utils;

import android.os.Environment;
import android.os.StatFs;

/* compiled from: MemorySize.java */
/* loaded from: classes.dex */
public class iMK {
    public static long Qhi() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (Throwable unused) {
            return 0L;
        }
    }
}
