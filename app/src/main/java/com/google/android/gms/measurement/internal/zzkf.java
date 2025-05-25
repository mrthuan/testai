package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzkf {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11875a;

    public zzkf(Context context) {
        Preconditions.j(context);
        this.f11875a = context;
    }

    public final void a(Intent intent) {
        if (intent == null) {
            c().f11712f.a("onRebind called with null intent");
            return;
        }
        c().f11720n.b(intent.getAction(), "onRebind called. action");
    }

    public final void b(Intent intent) {
        if (intent == null) {
            c().f11712f.a("onUnbind called with null intent");
            return;
        }
        c().f11720n.b(intent.getAction(), "onUnbind called for intent. action");
    }

    public final zzeu c() {
        zzeu zzeuVar = zzge.n(this.f11875a, null, null).f11780i;
        zzge.f(zzeuVar);
        return zzeuVar;
    }
}
