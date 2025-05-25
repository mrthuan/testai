package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzfn {

    /* renamed from: a  reason: collision with root package name */
    public final zza f11745a;

    /* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
    /* loaded from: classes2.dex */
    public interface zza {
        void doStartService(Context context, Intent intent);
    }

    public zzfn(zza zzaVar) {
        Preconditions.j(zzaVar);
        this.f11745a = zzaVar;
    }

    public final void zza(Context context, Intent intent) {
        zzeu zzeuVar = zzge.n(context, null, null).f11780i;
        zzge.f(zzeuVar);
        if (intent == null) {
            zzeuVar.f11715i.a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        zzeuVar.f11720n.b(action, "Local receiver got");
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            zzeuVar.f11720n.a("Starting wakeful intent.");
            this.f11745a.doStartService(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            zzeuVar.f11715i.a("Install Referrer Broadcasts are deprecated");
        }
    }
}
