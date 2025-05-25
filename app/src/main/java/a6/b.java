package a6;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: InAppPurchaseActivityLifecycleTracker.kt */
/* loaded from: classes.dex */
public final class b implements ServiceConnection {
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName name, IBinder service) {
        kotlin.jvm.internal.g.e(name, "name");
        kotlin.jvm.internal.g.e(service, "service");
        com.facebook.appevents.iap.a aVar = com.facebook.appevents.iap.a.f9534a;
        Context a10 = com.facebook.d.a();
        j jVar = j.f80a;
        Object obj = null;
        if (!k6.a.b(j.class)) {
            try {
                obj = j.f80a.h(a10, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{service});
            } catch (Throwable th2) {
                k6.a.a(j.class, th2);
            }
        }
        com.facebook.appevents.iap.a.f9540h = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        kotlin.jvm.internal.g.e(name, "name");
    }
}
