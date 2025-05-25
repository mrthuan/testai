package x3;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: DiskCacheWriteLocker.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f31592a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final C0405b f31593b = new C0405b();

    /* compiled from: DiskCacheWriteLocker.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final ReentrantLock f31594a = new ReentrantLock();

        /* renamed from: b  reason: collision with root package name */
        public int f31595b;
    }

    /* compiled from: DiskCacheWriteLocker.java */
    /* renamed from: x3.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0405b {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayDeque f31596a = new ArrayDeque();

        public final a a() {
            a aVar;
            synchronized (this.f31596a) {
                aVar = (a) this.f31596a.poll();
            }
            if (aVar == null) {
                return new a();
            }
            return aVar;
        }

        public final void b(a aVar) {
            synchronized (this.f31596a) {
                if (this.f31596a.size() < 10) {
                    this.f31596a.offer(aVar);
                }
            }
        }
    }

    public final void a(String str) {
        a aVar;
        synchronized (this) {
            Object obj = this.f31592a.get(str);
            com.google.android.play.core.assetpacks.c.l(obj);
            aVar = (a) obj;
            int i10 = aVar.f31595b;
            if (i10 >= 1) {
                int i11 = i10 - 1;
                aVar.f31595b = i11;
                if (i11 == 0) {
                    a aVar2 = (a) this.f31592a.remove(str);
                    if (aVar2.equals(aVar)) {
                        this.f31593b.b(aVar2);
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f31595b);
            }
        }
        aVar.f31594a.unlock();
    }
}
