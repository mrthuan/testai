package com.bykv.vk.openvk.preload.geckox.g;

import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: ChannelUpdateLock.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Lock> f7592a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private FileLock f7593b;
    private String c;

    private a(String str, FileLock fileLock) {
        this.c = str;
        this.f7593b = fileLock;
    }

    public static a a(String str) {
        Map<String, Lock> map = f7592a;
        synchronized (map) {
            Lock lock = map.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                map.put(str, lock);
            }
            if (lock.tryLock()) {
                try {
                    FileLock c = FileLock.c(str);
                    if (c == null) {
                        lock.unlock();
                        return null;
                    }
                    return new a(str, c);
                } catch (Exception e10) {
                    lock.lock();
                    com.bykv.vk.openvk.preload.geckox.utils.b.a(new RuntimeException(e10));
                    return null;
                }
            }
            return null;
        }
    }

    public final void a() {
        Map<String, Lock> map = f7592a;
        synchronized (map) {
            this.f7593b.a();
            this.f7593b.b();
            map.get(this.c).unlock();
        }
    }
}
