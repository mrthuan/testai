package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfsc extends zzfrz {
    private static zzfsc zzc;

    private zzfsc(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzfsc zzi(Context context) {
        zzfsc zzfscVar;
        synchronized (zzfsc.class) {
            if (zzc == null) {
                zzc = new zzfsc(context);
            }
            zzfscVar = zzc;
        }
        return zzfscVar;
    }

    public final zzfry zzh(long j10, boolean z10) {
        synchronized (zzfsc.class) {
            if (!zzo()) {
                return new zzfry();
            }
            return zzb(null, null, j10, z10);
        }
    }

    public final void zzj() {
        synchronized (zzfsc.class) {
            if (zzg(false)) {
                zzf(false);
            }
        }
    }

    public final void zzk() {
        this.zzb.zze("paidv2_publisher_option");
    }

    public final void zzl() {
        this.zzb.zze("paidv2_user_option");
    }

    public final void zzm(boolean z10) {
        this.zzb.zzd("paidv2_user_option", Boolean.valueOf(z10));
    }

    public final void zzn(boolean z10) {
        this.zzb.zzd("paidv2_publisher_option", Boolean.valueOf(z10));
        if (!z10) {
            zzj();
        }
    }

    public final boolean zzo() {
        return this.zzb.zzf("paidv2_publisher_option", true);
    }

    public final boolean zzp() {
        return this.zzb.zzf("paidv2_user_option", true);
    }
}
