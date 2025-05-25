package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdnf extends zzbft {
    private final String zza;
    private final zzdiw zzb;
    private final zzdjb zzc;

    public zzdnf(String str, zzdiw zzdiwVar, zzdjb zzdjbVar) {
        this.zza = str;
        this.zzb = zzdiwVar;
        this.zzc = zzdjbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final Bundle zzb() {
        return this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final com.google.android.gms.ads.internal.client.zzdq zzc() {
        return this.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final zzbew zzd() {
        return this.zzc.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final zzbfd zze() {
        return this.zzc.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final IObjectWrapper zzf() {
        return this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final IObjectWrapper zzg() {
        return new ObjectWrapper(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final String zzh() {
        return this.zzc.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final String zzi() {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final String zzj() {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final String zzk() {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final String zzl() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final List zzm() {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final void zzn() {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final void zzo(Bundle bundle) {
        this.zzb.zzG(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final void zzp(Bundle bundle) {
        this.zzb.zzL(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final boolean zzq(Bundle bundle) {
        return this.zzb.zzY(bundle);
    }
}
