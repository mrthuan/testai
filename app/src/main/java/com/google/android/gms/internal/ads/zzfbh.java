package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfbh implements zzfhp {
    public final zzfcb zza;
    public final zzfcd zzb;
    public final com.google.android.gms.ads.internal.client.zzl zzc;
    public final String zzd;
    public final Executor zze;
    public final com.google.android.gms.ads.internal.client.zzw zzf;
    public final zzfhe zzg;

    public zzfbh(zzfcb zzfcbVar, zzfcd zzfcdVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, Executor executor, com.google.android.gms.ads.internal.client.zzw zzwVar, zzfhe zzfheVar) {
        this.zza = zzfcbVar;
        this.zzb = zzfcdVar;
        this.zzc = zzlVar;
        this.zzd = str;
        this.zze = executor;
        this.zzf = zzwVar;
        this.zzg = zzfheVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfhp
    public final zzfhe zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfhp
    public final Executor zzb() {
        return this.zze;
    }
}
