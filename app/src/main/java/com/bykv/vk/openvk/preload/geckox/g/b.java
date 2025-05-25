package com.bykv.vk.openvk.preload.geckox.g;

import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: SelectChannelVersionLock.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Lock> f7594a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static ReentrantLock f7595b = new ReentrantLock();
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private FileLock f7596d;

    private b(String str, FileLock fileLock) {
        this.c = str;
        this.f7596d = fileLock;
    }

    public static b a(String str) {
        f7595b.lock();
        try {
            FileLock a10 = FileLock.a(str);
            Map<String, Lock> map = f7594a;
            Lock lock = map.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                map.put(str, lock);
            }
            lock.lock();
            return new b(str, a10);
        } catch (Exception e10) {
            f7595b.unlock();
            throw e10;
        }
    }

    public final void a() {
        try {
            this.f7596d.a();
            this.f7596d.b();
            Lock lock = f7594a.get(this.c);
            if (lock != null) {
                lock.unlock();
            }
        } finally {
            f7595b.unlock();
        }
    }
}
