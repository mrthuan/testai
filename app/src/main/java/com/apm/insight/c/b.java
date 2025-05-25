package com.apm.insight.c;

import com.apm.insight.i;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static AtomicBoolean f6444a = new AtomicBoolean(false);

    public static boolean a() {
        synchronized (f6444a) {
            if (f6444a.get()) {
                return false;
            }
            f6444a.set(true);
            return b();
        }
    }

    public static boolean b() {
        if (!com.apm.insight.runtime.a.h()) {
            return false;
        }
        try {
            File file = new File(i.h().getFilesDir(), "apminsight/crashCommand");
            file.mkdirs();
            new File(file, "0_" + System.currentTimeMillis()).createNewFile();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
