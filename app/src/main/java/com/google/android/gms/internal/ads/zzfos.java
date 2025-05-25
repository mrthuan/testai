package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.ShowFirstParty;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@ShowFirstParty
/* loaded from: classes2.dex */
public final class zzfos {
    private final Context zza;
    private final Looper zzb;

    public zzfos(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzfpg zza = zzfpi.zza();
        zza.zza(this.zza.getPackageName());
        zza.zzc(2);
        zzfpd zza2 = zzfpe.zza();
        zza2.zza(str);
        zza2.zzb(2);
        zza.zzb(zza2);
        new zzfot(this.zza, this.zzb, (zzfpi) zza.zzbr()).zza();
    }
}
