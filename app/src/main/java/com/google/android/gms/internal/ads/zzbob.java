package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbob extends zzcge {
    private final AppMeasurementSdk zza;

    public zzbob(AppMeasurementSdk appMeasurementSdk) {
        this.zza = appMeasurementSdk;
    }

    @Override // com.google.android.gms.internal.ads.zzcgf
    public final int zzb(String str) {
        return this.zza.f11513a.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcgf
    public final long zzc() {
        return this.zza.f11513a.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcgf
    public final Bundle zzd(Bundle bundle) {
        return this.zza.f11513a.zzc(bundle, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcgf
    public final String zze() {
        return this.zza.f11513a.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcgf
    public final String zzf() {
        return this.zza.f11513a.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzcgf
    public final String zzg() {
        return this.zza.f11513a.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcgf
    public final String zzh() {
        return this.zza.f11513a.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzcgf
    public final String zzi() {
        return this.zza.f11513a.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzcgf
    public final List zzj(String str, String str2) {
        return this.zza.f11513a.zzq(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgf
    public final Map zzk(String str, String str2, boolean z10) {
        return this.zza.f11513a.zzr(str, str2, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcgf
    public final void zzl(String str) {
        this.zza.f11513a.zzv(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcgf
    public final void zzm(String str, String str2, Bundle bundle) {
        this.zza.f11513a.zzw(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcgf
    public final void zzn(String str) {
        this.zza.f11513a.zzx(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcgf
    public final void zzo(String str, String str2, Bundle bundle) {
        this.zza.f11513a.zzz(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcgf
    public final void zzp(Bundle bundle) {
        this.zza.f11513a.zzc(bundle, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcgf
    public final void zzq(Bundle bundle) {
        this.zza.f11513a.zzE(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcgf
    public final void zzr(Bundle bundle) {
        this.zza.f11513a.zzF(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcgf
    public final void zzs(IObjectWrapper iObjectWrapper, String str, String str2) {
        Activity activity;
        if (iObjectWrapper != null) {
            activity = (Activity) ObjectWrapper.L0(iObjectWrapper);
        } else {
            activity = null;
        }
        this.zza.f11513a.zzH(activity, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgf
    public final void zzt(String str, String str2, IObjectWrapper iObjectWrapper) {
        Object obj;
        if (iObjectWrapper != null) {
            obj = ObjectWrapper.L0(iObjectWrapper);
        } else {
            obj = null;
        }
        this.zza.f11513a.zzO(str, str2, obj, true);
    }
}
