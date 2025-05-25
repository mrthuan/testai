package v9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes2.dex */
public final class n implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f30786a;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        o oVar = this.f30786a;
        oVar.f30789b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        oVar.a().post(new l(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        o oVar = this.f30786a;
        oVar.f30789b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        oVar.a().post(new m(this));
    }
}
