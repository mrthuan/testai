package y1;

import a6.h;
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: CopyLock.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final HashMap f31971e = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final File f31972a;

    /* renamed from: b  reason: collision with root package name */
    public final Lock f31973b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public FileChannel f31974d;

    public a(File file, String str, boolean z10) {
        Lock lock;
        File file2 = new File(file, h.c(str, ".lck"));
        this.f31972a = file2;
        String absolutePath = file2.getAbsolutePath();
        HashMap hashMap = f31971e;
        synchronized (hashMap) {
            lock = (Lock) hashMap.get(absolutePath);
            if (lock == null) {
                lock = new ReentrantLock();
                hashMap.put(absolutePath, lock);
            }
        }
        this.f31973b = lock;
        this.c = z10;
    }

    public final void a() {
        FileChannel fileChannel = this.f31974d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f31973b.unlock();
    }
}
