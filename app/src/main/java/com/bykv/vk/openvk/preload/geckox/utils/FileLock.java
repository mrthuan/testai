package com.bykv.vk.openvk.preload.geckox.utils;

import android.os.Process;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class FileLock {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Integer> f7658a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final int f7659b;
    private final String c;

    static {
        System.loadLibrary("file_lock_pg");
    }

    private FileLock(String str, int i10) {
        this.c = str;
        this.f7659b = i10;
    }

    public static FileLock a(String str) {
        try {
            int d10 = d(str);
            nLockFile(d10);
            return new FileLock(str, d10);
        } catch (Exception e10) {
            StringBuilder g10 = b.a.g("lock failed, file:", str, ", pid:");
            g10.append(Process.myPid());
            g10.append(" caused by:");
            g10.append(e10.getMessage());
            throw new RuntimeException(g10.toString());
        }
    }

    public static FileLock b(String str) {
        try {
            int d10 = d(str);
            if (nTryLock(d10)) {
                return new FileLock(str, d10);
            }
            return null;
        } catch (Exception e10) {
            StringBuilder g10 = b.a.g("try lock failed, file:", str, " caused by:");
            g10.append(e10.getMessage());
            throw new RuntimeException(g10.toString());
        }
    }

    public static FileLock c(String str) {
        try {
            int d10 = d(str);
            if (!nTryLock(d10)) {
                new FileLock(str, d10).b();
                return null;
            }
            return new FileLock(str, d10);
        } catch (Exception e10) {
            StringBuilder g10 = b.a.g("try lock failed, file:", str, " caused by:");
            g10.append(e10.getMessage());
            throw new RuntimeException(g10.toString());
        }
    }

    private static int d(String str) {
        Integer num;
        Map<String, Integer> map = f7658a;
        synchronized (map) {
            num = map.get(str);
            if (num == null) {
                new File(str).getParentFile().mkdirs();
                num = Integer.valueOf(nGetFD(str));
                map.put(str, num);
            }
        }
        return num.intValue();
    }

    private static native int nGetFD(String str);

    private static native void nLockFile(int i10);

    private static native void nLockFileSegment(int i10, int i11);

    private static native void nRelease(int i10);

    private static native boolean nTryLock(int i10);

    private static native void nUnlockFile(int i10);

    public static FileLock a(String str, int i10) {
        try {
            int d10 = d(str);
            nLockFileSegment(d10, i10);
            return new FileLock(str, d10);
        } catch (Exception e10) {
            StringBuilder g10 = b.a.g("lock segment failed, file:", str, " caused by:");
            g10.append(e10.getMessage());
            throw new RuntimeException(g10.toString());
        }
    }

    public final void b() {
        Integer remove;
        Map<String, Integer> map = f7658a;
        synchronized (map) {
            remove = map.remove(this.c);
        }
        try {
            nRelease(remove.intValue());
        } catch (Exception e10) {
            throw new RuntimeException("release lock failed, file:" + this.c + " caused by:" + e10.getMessage());
        }
    }

    public final void a() {
        try {
            nUnlockFile(this.f7659b);
        } catch (Exception unused) {
            throw new RuntimeException("release lock failed，path:" + this.c);
        }
    }
}
