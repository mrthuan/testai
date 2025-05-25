package com.bykv.vk.openvk.component.video.Qhi.fl;

import a6.h;
import java.io.File;
import java.io.RandomAccessFile;

/* compiled from: VideoFilesUtils.java */
/* loaded from: classes.dex */
public class cJ {
    public static long Qhi(String str, String str2) {
        File ac2 = ac(str, str2);
        if (ac2.exists()) {
            return ac2.length();
        }
        File cJ = cJ(str, str2);
        if (cJ.exists()) {
            return cJ.length();
        }
        return 0L;
    }

    public static File ac(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2);
    }

    public static File cJ(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, h.c(str2, ".temp"));
    }

    public static void Qhi(RandomAccessFile randomAccessFile, byte[] bArr, int i10, int i11, String str) {
        try {
            randomAccessFile.seek(i10);
            randomAccessFile.write(bArr, 0, i11);
        } catch (Throwable unused) {
        }
    }
}
