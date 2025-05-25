package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdzz {
    public y9.a zza;
    private final zzczm zzb;
    private final zzdzh zzc;
    private final zzfjl zzd;
    private final zzffg zze;
    private final VersionInfoParcel zzf;
    private final zzfki zzg;
    private final zzfkf zzh;
    private final Context zzi;
    private final zzgcu zzj;

    public zzdzz(zzczm zzczmVar, zzdzh zzdzhVar, zzfjl zzfjlVar, zzffg zzffgVar, VersionInfoParcel versionInfoParcel, zzfki zzfkiVar, zzfkf zzfkfVar, Context context, zzgcu zzgcuVar) {
        this.zzb = zzczmVar;
        this.zzc = zzdzhVar;
        this.zzd = zzfjlVar;
        this.zze = zzffgVar;
        this.zzf = versionInfoParcel;
        this.zzg = zzfkiVar;
        this.zzh = zzfkfVar;
        this.zzi = context;
        this.zzj = zzgcuVar;
    }

    public final zzbug zza(zzbvb zzbvbVar, zzebk zzebkVar) {
        zzebkVar.zzc.put("Content-Type", zzebkVar.zze);
        zzebkVar.zzc.put("User-Agent", com.google.android.gms.ads.internal.zzu.B.c.v(this.zzi, zzbvbVar.zzb.f10345a));
        Bundle bundle = new Bundle();
        for (Map.Entry entry : zzebkVar.zzc.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return new zzbug(zzebkVar.zza, zzebkVar.zzb, bundle, zzebkVar.zzd, zzebkVar.zzf, zzbvbVar.zzd, zzbvbVar.zzh);
    }

    public final y9.a zzc(final zzbvb zzbvbVar, final JSONObject jSONObject, final zzbvd zzbvdVar) {
        this.zzb.zzdn(zzbvbVar);
        zzfjc zzb = this.zzd.zzb(zzfjf.PROXY, zzgcj.zzm(this.zzd.zzb(zzfjf.PREPARE_HTTP_REQUEST, zzgcj.zzh(new zzebo(jSONObject, zzbvdVar))).zze(new zzebp(zzbvbVar.zzg, this.zzh, zzfjt.zza(this.zzi, 9))).zza(), new zzful() { // from class: com.google.android.gms.internal.ads.zzdzv
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                return zzdzz.this.zza(zzbvbVar, (zzebk) obj);
            }
        }, this.zzj));
        final zzdzh zzdzhVar = this.zzc;
        Objects.requireNonNull(zzdzhVar);
        zzfiq zza = zzb.zzf(new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdzw
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return zzdzh.this.zzc((zzbug) obj);
            }
        }).zza();
        this.zza = zza;
        y9.a zzn = zzgcj.zzn(this.zzd.zzb(zzfjf.PRE_PROCESS, zza).zze(new zzfio() { // from class: com.google.android.gms.internal.ads.zzdzu
            @Override // com.google.android.gms.internal.ads.zzfio
            public final Object zza(Object obj) {
                return new zzeax(zzebl.zza(new InputStreamReader((InputStream) obj)), jSONObject, zzbvdVar);
            }
        }).zzf(com.google.android.gms.ads.internal.zzu.B.f10566p.zza(this.zzi, this.zzf, this.zzg).zza("google.afma.response.normalize", zzeax.zza, zzbnl.zzb)).zza(), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdzx
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return zzdzz.this.zzd(zzbvbVar, (InputStream) obj);
            }
        }, this.zzj);
        zzgcj.zzr(zzn, new zzdzy(this), this.zzj);
        return zzn;
    }

    public final /* synthetic */ y9.a zzd(zzbvb zzbvbVar, InputStream inputStream) {
        return zzgcj.zzh(new zzfex(new zzfeu(this.zze), zzfew.zza(new InputStreamReader(inputStream), zzbvbVar)));
    }
}
