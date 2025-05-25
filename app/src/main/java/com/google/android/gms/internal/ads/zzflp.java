package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzflp {
    private boolean zza;

    public final void zza(Context context) {
        zzfnj.zzc(context, "Application Context cannot be null");
        if (!this.zza) {
            this.zza = true;
            zzfmt.zzb().zzd(context);
            zzfmk.zza().zzd(context);
            zzfne.zzb(context);
            zzfnf.zzd(context);
            zzfni.zza(context);
            zzfmq.zzb().zzc(context);
            zzfmj.zza().zzd(context);
        }
    }

    public final boolean zzb() {
        return this.zza;
    }
}
