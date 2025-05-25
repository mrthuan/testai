package k0;

import android.app.Application;
import k0.f;

/* compiled from: ActivityRecreator.java */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Application f19463a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f.a f19464b;

    public d(Application application, f.a aVar) {
        this.f19463a = application;
        this.f19464b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19463a.unregisterActivityLifecycleCallbacks(this.f19464b);
    }
}
