package ma;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: ExecutorUtils.java */
/* loaded from: classes2.dex */
public final class b0 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f21880a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicLong f21881b;

    /* compiled from: ExecutorUtils.java */
    /* loaded from: classes2.dex */
    public class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f21882a;

        public a(Runnable runnable) {
            this.f21882a = runnable;
        }

        @Override // ma.c
        public final void a() {
            this.f21882a.run();
        }
    }

    public b0(String str, AtomicLong atomicLong) {
        this.f21880a = str;
        this.f21881b = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(new a(runnable));
        newThread.setName(this.f21880a + this.f21881b.getAndIncrement());
        return newThread;
    }
}
