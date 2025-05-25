package com.apm.insight.l;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public final class j {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(String str, int i10) {
        com.apm.insight.h.a.a("android.os.FileUtils", "setPermissions", str, Integer.valueOf(i10), -1, -1);
    }

    public static void a(ZipFile zipFile) {
        if (zipFile == null) {
            return;
        }
        try {
            zipFile.close();
        } catch (IOException unused) {
        }
    }
}
