package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzfz;
import com.google.android.gms.internal.play_billing.zzga;
import com.google.android.gms.internal.play_billing.zzgd;
import com.google.android.gms.internal.play_billing.zzge;
import com.google.android.gms.internal.play_billing.zzgg;
import com.google.android.gms.internal.play_billing.zzgk;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class w {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f6287a = 0;

    static {
        int i10 = x.Q0;
    }

    public static zzga a(int i10, int i11, f fVar) {
        try {
            zzfz zzy = zzga.zzy();
            zzgg zzy2 = zzgk.zzy();
            zzy2.zzn(fVar.f6231a);
            zzy2.zzm(fVar.f6232b);
            zzy2.zzo(i10);
            zzy.zzl(zzy2);
            zzy.zzn(i11);
            return (zzga) zzy.zzf();
        } catch (Exception e10) {
            zzb.zzl("BillingLogger", "Unable to create logging payload", e10);
            return null;
        }
    }

    public static zzge b(int i10) {
        try {
            zzgd zzy = zzge.zzy();
            zzy.zzm(i10);
            return (zzge) zzy.zzf();
        } catch (Exception e10) {
            zzb.zzl("BillingLogger", "Unable to create logging payload", e10);
            return null;
        }
    }
}
