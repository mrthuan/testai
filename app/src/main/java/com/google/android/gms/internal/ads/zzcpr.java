package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public class zzcpr {
    private final zzcrs zza;
    private final View zzb;
    private final zzfem zzc;
    private final zzcej zzd;

    public zzcpr(View view, zzcej zzcejVar, zzcrs zzcrsVar, zzfem zzfemVar) {
        this.zzb = view;
        this.zzd = zzcejVar;
        this.zza = zzcrsVar;
        this.zzc = zzfemVar;
    }

    public static final zzdei zzf(final Context context, final VersionInfoParcel versionInfoParcel, final zzfel zzfelVar, final zzffg zzffgVar) {
        return new zzdei(new zzcye() { // from class: com.google.android.gms.internal.ads.zzcpp
            @Override // com.google.android.gms.internal.ads.zzcye
            public final void zzs() {
                com.google.android.gms.ads.internal.zzu.B.f10563m.i(context, versionInfoParcel.f10345a, zzfelVar.zzC.toString(), zzffgVar.zzf);
            }
        }, zzbzo.zzf);
    }

    public static final Set zzg(zzcrj zzcrjVar) {
        return Collections.singleton(new zzdei(zzcrjVar, zzbzo.zzf));
    }

    public static final zzdei zzh(zzcrh zzcrhVar) {
        return new zzdei(zzcrhVar, zzbzo.zze);
    }

    public final View zza() {
        return this.zzb;
    }

    public final zzcej zzb() {
        return this.zzd;
    }

    public final zzcrs zzc() {
        return this.zza;
    }

    public zzcyc zzd(Set set) {
        return new zzcyc(set);
    }

    public final zzfem zze() {
        return this.zzc;
    }
}
