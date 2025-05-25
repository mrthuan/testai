package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzai;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzcd;
import com.google.android.gms.internal.play_billing.zzga;
import java.util.List;
import java.util.Objects;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
public final class c0 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public boolean f6207a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6208b;
    public final /* synthetic */ d0 c;

    public c0(d0 d0Var, boolean z10) {
        this.c = d0Var;
        this.f6208b = z10;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        int i10;
        if (this.f6207a) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (true != this.f6208b) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            context.registerReceiver(this, intentFilter, i10);
        } else {
            context.registerReceiver(this, intentFilter);
        }
        this.f6207a = true;
    }

    public final void b(Bundle bundle, f fVar, int i10) {
        byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
        d0 d0Var = this.c;
        if (byteArray != null) {
            try {
                ((wk.g) d0Var.c).b(zzga.zzA(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), zzcd.zza()));
                return;
            } catch (Throwable unused) {
                zzb.zzk("BillingBroadcastManager", "Failed parsing Api failure.");
                return;
            }
        }
        ((wk.g) d0Var.c).b(w.a(23, i10, fVar));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        int i10 = 1;
        d0 d0Var = this.c;
        if (extras == null) {
            zzb.zzk("BillingBroadcastManager", "Bundle is null.");
            x xVar = d0Var.c;
            f fVar = y.f6294h;
            ((wk.g) xVar).b(w.a(11, 1, fVar));
            k kVar = d0Var.f6210b;
            if (kVar != null) {
                kVar.b(fVar, null);
                return;
            }
            return;
        }
        f zze = zzb.zze(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        if (true == Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW")) {
            i10 = 2;
        }
        if (!action.equals("com.android.vending.billing.PURCHASES_UPDATED") && !action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                if (zze.f6231a != 0) {
                    b(extras, zze, i10);
                    d0Var.f6210b.b(zze, zzai.zzk());
                    return;
                }
                d0Var.getClass();
                zzb.zzk("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                x xVar2 = d0Var.c;
                f fVar2 = y.f6294h;
                ((wk.g) xVar2).b(w.a(77, i10, fVar2));
                d0Var.f6210b.b(fVar2, zzai.zzk());
                return;
            }
            return;
        }
        List<Purchase> zzi = zzb.zzi(extras);
        if (zze.f6231a == 0) {
            ((wk.g) d0Var.c).c(w.b(i10));
        } else {
            b(extras, zze, i10);
        }
        d0Var.f6210b.b(zze, zzi);
    }
}
