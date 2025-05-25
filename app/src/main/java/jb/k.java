package jb;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: FcmLifecycleCallbacks.java */
/* loaded from: classes2.dex */
public final class k implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final Set<Intent> f19137a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.content.Intent r5) {
        /*
            android.os.Bundle r5 = r5.getExtras()     // Catch: java.lang.RuntimeException -> Ld
            if (r5 == 0) goto Ld
            java.lang.String r0 = "gcm.n.analytics_data"
            android.os.Bundle r5 = r5.getBundle(r0)     // Catch: java.lang.RuntimeException -> Ld
            goto Le
        Ld:
            r5 = 0
        Le:
            java.lang.String r0 = "1"
            if (r5 != 0) goto L14
            r1 = 0
            goto L1e
        L14:
            java.lang.String r1 = "google.c.a.e"
            java.lang.String r1 = r5.getString(r1)
            boolean r1 = r0.equals(r1)
        L1e:
            if (r1 == 0) goto L74
            if (r5 != 0) goto L23
            goto L6f
        L23:
            java.lang.String r1 = "google.c.a.tc"
            java.lang.String r1 = r5.getString(r1)
            boolean r0 = r0.equals(r1)
            r1 = 3
            java.lang.String r2 = "FirebaseMessaging"
            if (r0 == 0) goto L6c
            z9.e r0 = z9.e.c()
            java.lang.Class<da.a> r3 = da.a.class
            java.lang.Object r0 = r0.b(r3)
            da.a r0 = (da.a) r0
            android.util.Log.isLoggable(r2, r1)
            if (r0 == 0) goto L6f
            java.lang.String r1 = "google.c.a.c_id"
            java.lang.String r1 = r5.getString(r1)
            r0.h(r1)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "source"
            java.lang.String r4 = "Firebase"
            r2.putString(r3, r4)
            java.lang.String r3 = "medium"
            java.lang.String r4 = "notification"
            r2.putString(r3, r4)
            java.lang.String r3 = "campaign"
            r2.putString(r3, r1)
            java.lang.String r1 = "_cmp"
            java.lang.String r3 = "fcm"
            r0.c(r2, r3, r1)
            goto L6f
        L6c:
            android.util.Log.isLoggable(r2, r1)
        L6f:
            java.lang.String r0 = "_no"
            jb.o.a(r5, r0)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.k.a(android.content.Intent):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @SuppressLint({"ThreadPoolCreation"})
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent != null && this.f19137a.add(intent)) {
            if (Build.VERSION.SDK_INT <= 25) {
                new Handler(Looper.getMainLooper()).post(new l.r(7, this, intent));
            } else {
                a(intent);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.f19137a.remove(activity.getIntent());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
