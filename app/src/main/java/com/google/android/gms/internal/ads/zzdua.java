package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdua implements zzdtk {
    private final long zza;
    private final zzdtp zzb;
    private final zzfec zzc;

    public zzdua(long j10, Context context, zzdtp zzdtpVar, zzcgj zzcgjVar, String str) {
        this.zza = j10;
        this.zzb = zzdtpVar;
        zzfee zzw = zzcgjVar.zzw();
        zzw.zzb(context);
        zzw.zza(str);
        this.zzc = zzw.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzdtk
    public final void zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        try {
            this.zzc.zzf(zzlVar, new zzdty(this));
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdtk
    public final void zzc() {
        try {
            this.zzc.zzk(new zzdtz(this));
            this.zzc.zzm(new ObjectWrapper(null));
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdtk
    public final void zza() {
    }
}
