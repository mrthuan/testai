package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdnm implements zzbix {
    private final zzbgh zza;
    private final zzdoa zzb;
    private final zzhew zzc;

    public zzdnm(zzdjm zzdjmVar, zzdjb zzdjbVar, zzdoa zzdoaVar, zzhew zzhewVar) {
        this.zza = zzdjmVar.zzc(zzdjbVar.zzA());
        this.zzb = zzdoaVar;
        this.zzc = zzhewVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbix
    public final void zza(Object obj, Map map) {
        try {
            this.zza.zze((zzbfx) this.zzc.zzb(), (String) map.get("asset"));
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(5);
        }
    }

    public final void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zzb.zzl("/nativeAdCustomClick", this);
    }
}
