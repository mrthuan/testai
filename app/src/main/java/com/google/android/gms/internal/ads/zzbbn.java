package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzbbn {
    private final int zza;
    private final String zzb;
    private final Object zzc;
    private final Object zzd;

    public zzbbn(int i10, String str, Object obj, Object obj2, zzbbm zzbbmVar) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        com.google.android.gms.ads.internal.client.zzba.f10115d.f10116a.zzd(this);
    }

    public static zzbbn zzf(int i10, String str, float f10, float f11) {
        return new zzbbk(1, str, Float.valueOf(f10), Float.valueOf(f11));
    }

    public static zzbbn zzg(int i10, String str, int i11, int i12) {
        return new zzbbi(1, str, Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static zzbbn zzh(int i10, String str, long j10, long j11) {
        return new zzbbj(1, str, Long.valueOf(j10), Long.valueOf(j11));
    }

    public static zzbbn zzi(int i10, String str, Boolean bool, Boolean bool2) {
        return new zzbbh(i10, str, bool, bool2);
    }

    public static zzbbn zzj(int i10, String str, String str2, String str3) {
        return new zzbbl(1, str, str2, str3);
    }

    public static zzbbn zzk(int i10, String str) {
        zzbbn zzj = zzj(1, "gads:sdk_core_constants:experiment_id", null, null);
        com.google.android.gms.ads.internal.client.zzba.f10115d.f10116a.zzc(zzj);
        return zzj;
    }

    public abstract Object zza(JSONObject jSONObject);

    public abstract Object zzb(Bundle bundle);

    public abstract Object zzc(SharedPreferences sharedPreferences);

    public abstract void zzd(SharedPreferences.Editor editor, Object obj);

    public final int zze() {
        return this.zza;
    }

    public final Object zzl() {
        return com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(this);
    }

    public final Object zzm() {
        if (com.google.android.gms.ads.internal.client.zzba.f10115d.c.zzf()) {
            return this.zzd;
        }
        return this.zzc;
    }

    public final String zzn() {
        return this.zzb;
    }
}
