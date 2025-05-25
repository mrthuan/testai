package p9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class w implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f23825a;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        x xVar = this.f23825a;
        xVar.f23828b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        xVar.a().post(new u(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        x xVar = this.f23825a;
        xVar.f23828b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        xVar.a().post(new v(this));
    }
}
