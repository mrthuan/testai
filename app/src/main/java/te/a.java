package te;

import java.util.concurrent.ThreadFactory;

/* compiled from: FlutterInjector.java */
/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public int f30001a = 0;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        StringBuilder sb2 = new StringBuilder("flutter-worker-");
        int i10 = this.f30001a;
        this.f30001a = i10 + 1;
        sb2.append(i10);
        thread.setName(sb2.toString());
        return thread;
    }
}
