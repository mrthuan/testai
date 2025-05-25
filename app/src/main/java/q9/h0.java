package q9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class h0 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i0 f29111a;

    public /* synthetic */ h0(i0 i0Var) {
        this.f29111a = i0Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        i0 i0Var = this.f29111a;
        i0Var.f29116b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        i0Var.a().post(new f0(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        i0 i0Var = this.f29111a;
        i0Var.f29116b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        i0Var.a().post(new g0(this));
    }
}
