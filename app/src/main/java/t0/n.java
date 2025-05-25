package t0;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* compiled from: RequestExecutor.java */
/* loaded from: classes.dex */
public final class n implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final String f29900a = "fonts-androidx";

    /* renamed from: b  reason: collision with root package name */
    public final int f29901b = 10;

    /* compiled from: RequestExecutor.java */
    /* loaded from: classes.dex */
    public static class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final int f29902a;

        public a(Runnable runnable, String str, int i10) {
            super(runnable, str);
            this.f29902a = i10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(this.f29902a);
            super.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new a(runnable, this.f29900a, this.f29901b);
    }
}
