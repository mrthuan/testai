package v3;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* compiled from: ActiveResources.java */
/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* compiled from: ActiveResources.java */
    /* renamed from: v3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0384a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f30500a;

        public RunnableC0384a(Runnable runnable) {
            this.f30500a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(10);
            this.f30500a.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(new RunnableC0384a(runnable), "glide-active-resources");
    }
}
