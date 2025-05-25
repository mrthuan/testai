package com.apm.insight.l;

import android.os.Process;
import java.io.File;

/* loaded from: classes.dex */
public final class g {
    public static int a() {
        int myPid = Process.myPid();
        try {
            return new File("/proc/" + myPid + "/fd").listFiles().length;
        } catch (Throwable unused) {
            return -1;
        }
    }
}
