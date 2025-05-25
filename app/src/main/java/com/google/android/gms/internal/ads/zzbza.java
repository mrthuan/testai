package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbza extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzbze zza;

    public zzbza(zzbze zzbzeVar) {
        this.zza = zzbzeVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        Context context;
        VersionInfoParcel versionInfoParcel;
        Object obj;
        zzbcb zzbcbVar;
        zzbze zzbzeVar = this.zza;
        context = zzbzeVar.zze;
        versionInfoParcel = zzbzeVar.zzf;
        zzbbz zzbbzVar = new zzbbz(context, versionInfoParcel.f10345a);
        obj = this.zza.zza;
        synchronized (obj) {
            try {
                zzbcc zzbccVar = com.google.android.gms.ads.internal.zzu.B.f10562l;
                zzbcbVar = this.zza.zzh;
                zzbcc.zza(zzbcbVar, zzbbzVar);
            } catch (IllegalArgumentException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.g(5);
            }
        }
    }
}
