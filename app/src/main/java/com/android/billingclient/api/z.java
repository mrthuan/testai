package com.android.billingclient.api;

import android.content.Context;
import com.google.android.datatransport.Priority;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzhe;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6313a;

    /* renamed from: b  reason: collision with root package name */
    public final s6.e f6314b;

    public z(Context context) {
        try {
            v6.w.b(context);
            this.f6314b = v6.w.a().c(t6.a.f29949e).a("PLAY_BILLING_LIBRARY", new s6.b("proto"), new aj.b(0));
        } catch (Throwable unused) {
            this.f6313a = true;
        }
    }

    public final void a(zzhe zzheVar) {
        if (this.f6313a) {
            zzb.zzk("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            s6.e eVar = this.f6314b;
            s6.a aVar = new s6.a(zzheVar, Priority.DEFAULT);
            v6.u uVar = (v6.u) eVar;
            uVar.getClass();
            uVar.a(aVar, new t5.f(5));
        } catch (Throwable unused) {
            zzb.zzk("BillingLogger", "logging failed.");
        }
    }
}
