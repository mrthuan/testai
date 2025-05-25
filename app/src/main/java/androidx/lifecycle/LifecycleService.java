package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.Lifecycle;

/* compiled from: LifecycleService.kt */
/* loaded from: classes.dex */
public class LifecycleService extends Service implements p {

    /* renamed from: a  reason: collision with root package name */
    public final i0 f3986a = new i0(this);

    @Override // androidx.lifecycle.p
    public final Lifecycle getLifecycle() {
        return this.f3986a.f4052a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        kotlin.jvm.internal.g.e(intent, "intent");
        this.f3986a.a(Lifecycle.Event.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f3986a.a(Lifecycle.Event.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        Lifecycle.Event event = Lifecycle.Event.ON_STOP;
        i0 i0Var = this.f3986a;
        i0Var.a(event);
        i0Var.a(Lifecycle.Event.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i10) {
        this.f3986a.a(Lifecycle.Event.ON_START);
        super.onStart(intent, i10);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
