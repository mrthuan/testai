package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import ca.a;
import ca.b;
import com.android.billingclient.api.t;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzef;
import com.google.android.gms.measurement.internal.zzik;
import com.google.android.gms.tasks.Tasks;
import com.inmobi.commons.core.configs.CrashConfig;
import d8.o;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import z9.e;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.2 */
/* loaded from: classes2.dex */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics c;

    /* renamed from: a  reason: collision with root package name */
    public final zzef f13491a;

    /* renamed from: b  reason: collision with root package name */
    public a f13492b;

    public FirebaseAnalytics(zzef zzefVar) {
        Preconditions.j(zzefVar);
        this.f13491a = zzefVar;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (c == null) {
            synchronized (FirebaseAnalytics.class) {
                if (c == null) {
                    c = new FirebaseAnalytics(zzef.zzg(context, null, null, null, null));
                }
            }
        }
        return c;
    }

    @Keep
    public static zzik getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzef zzg = zzef.zzg(context, null, null, null, bundle);
        if (zzg == null) {
            return null;
        }
        return new b(zzg);
    }

    public final o a() {
        a aVar;
        try {
            synchronized (FirebaseAnalytics.class) {
                if (this.f13492b == null) {
                    this.f13492b = new a(TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                }
                aVar = this.f13492b;
            }
            return Tasks.c(new t(this, 1), aVar);
        } catch (RuntimeException e10) {
            this.f13491a.zzB(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return Tasks.d(e10);
        }
    }

    public final void b(Bundle bundle, String str) {
        this.f13491a.zzy(str, bundle);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj = com.google.firebase.installations.a.f13588m;
            return (String) Tasks.b(((com.google.firebase.installations.a) e.c().b(eb.e.class)).getId(), CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f13491a.zzH(activity, str, str2);
    }
}
