package o2;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Configuration.java */
/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f22666a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f22667b;

    public a(boolean z10) {
        this.f22667b = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str;
        if (this.f22667b) {
            str = "WM.task-";
        } else {
            str = "androidx.work-";
        }
        StringBuilder k10 = a0.a.k(str);
        k10.append(this.f22666a.incrementAndGet());
        return new Thread(runnable, k10.toString());
    }
}
