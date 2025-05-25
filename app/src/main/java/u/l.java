package u;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: CustomTabsSession.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: b  reason: collision with root package name */
    public final e.b f30108b;
    public final e.a c;

    /* renamed from: d  reason: collision with root package name */
    public final ComponentName f30109d;

    /* renamed from: a  reason: collision with root package name */
    public final Object f30107a = new Object();

    /* renamed from: e  reason: collision with root package name */
    public final PendingIntent f30110e = null;

    public l(e.b bVar, c cVar, ComponentName componentName) {
        this.f30108b = bVar;
        this.c = cVar;
        this.f30109d = componentName;
    }

    public final void a(String str) {
        Bundle bundle = new Bundle();
        PendingIntent pendingIntent = this.f30110e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
        synchronized (this.f30107a) {
            try {
                try {
                    this.f30108b.E0(this.c, str, bundle);
                } catch (RemoteException unused) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
