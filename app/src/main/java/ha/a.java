package ha;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: CustomThreadFactory.java */
/* loaded from: classes2.dex */
public final class a implements ThreadFactory {

    /* renamed from: e  reason: collision with root package name */
    public static final ThreadFactory f18114e = Executors.defaultThreadFactory();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicLong f18115a = new AtomicLong();

    /* renamed from: b  reason: collision with root package name */
    public final String f18116b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final StrictMode.ThreadPolicy f18117d;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f18116b = str;
        this.c = i10;
        this.f18117d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f18114e.newThread(new com.facebook.appevents.g(2, this, runnable));
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f18116b, Long.valueOf(this.f18115a.getAndIncrement())));
        return newThread;
    }
}
