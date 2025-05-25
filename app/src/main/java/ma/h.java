package ma;

import java.util.concurrent.Callable;

/* compiled from: CrashlyticsBackgroundWorker.java */
/* loaded from: classes2.dex */
public final class h implements Callable<Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f21905a;

    public h(q qVar) {
        this.f21905a = qVar;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        this.f21905a.run();
        return null;
    }
}
