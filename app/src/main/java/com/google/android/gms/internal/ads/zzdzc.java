package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.InputStream;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdzc {
    private final zzgcu zza;
    private final zzdyg zzb;
    private final zzhew zzc;
    private final zzfki zzd;
    private final Context zze;
    private final VersionInfoParcel zzf;

    public zzdzc(zzgcu zzgcuVar, zzdyg zzdygVar, zzhew zzhewVar, zzfki zzfkiVar, Context context, VersionInfoParcel versionInfoParcel) {
        this.zza = zzgcuVar;
        this.zzb = zzdygVar;
        this.zzc = zzhewVar;
        this.zzd = zzfkiVar;
        this.zze = context;
        this.zzf = versionInfoParcel;
    }

    private final y9.a zzh(final zzbvb zzbvbVar, zzdzb zzdzbVar, final zzdzb zzdzbVar2, final zzgbq zzgbqVar) {
        y9.a zzf;
        String str = zzbvbVar.zzd;
        com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
        if (com.google.android.gms.ads.internal.util.zzt.c(str)) {
            zzf = zzgcj.zzg(new zzdyp(1));
        } else {
            zzf = zzgcj.zzf(zzdzbVar.zza(zzbvbVar), ExecutionException.class, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdza
                @Override // com.google.android.gms.internal.ads.zzgbq
                public final y9.a zza(Object obj) {
                    Throwable th2 = (ExecutionException) obj;
                    if (th2.getCause() != null) {
                        th2 = th2.getCause();
                    }
                    return zzgcj.zzg(th2);
                }
            }, this.zza);
        }
        return zzgcj.zzf(zzgcj.zzn(zzgcj.zzn(zzgca.zzu(zzf), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdyy
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return zzgcj.zzh(((zzdyq) obj).zzb());
            }
        }, this.zza), zzgbqVar, this.zza), zzdyp.class, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdyz
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return zzdzc.this.zzc(zzdzbVar2, zzbvbVar, zzgbqVar, (zzdyp) obj);
            }
        }, this.zza);
    }

    public final y9.a zza(final zzbvb zzbvbVar) {
        zzgbq zzgbqVar = new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdyv
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                String str = new String(zzgab.zzb((InputStream) obj), zzfuj.zzc);
                zzbvb zzbvbVar2 = zzbvb.this;
                zzbvbVar2.zzj = str;
                return zzgcj.zzh(zzbvbVar2);
            }
        };
        final zzdyg zzdygVar = this.zzb;
        Objects.requireNonNull(zzdygVar);
        return zzh(zzbvbVar, new zzdzb() { // from class: com.google.android.gms.internal.ads.zzdyw
            @Override // com.google.android.gms.internal.ads.zzdzb
            public final y9.a zza(zzbvb zzbvbVar2) {
                return zzdyg.this.zza(zzbvbVar2);
            }
        }, new zzdzb() { // from class: com.google.android.gms.internal.ads.zzdyx
            @Override // com.google.android.gms.internal.ads.zzdzb
            public final y9.a zza(zzbvb zzbvbVar2) {
                return zzdzc.this.zzd(zzbvbVar2);
            }
        }, zzgbqVar);
    }

    public final y9.a zzb(JSONObject jSONObject) {
        return zzgcj.zzn(zzgca.zzu(zzgcj.zzh(jSONObject)), com.google.android.gms.ads.internal.zzu.B.f10566p.zza(this.zze, this.zzf, this.zzd).zza("AFMA_getAdDictionary", zzbnl.zza, new zzbng() { // from class: com.google.android.gms.internal.ads.zzdyr
            @Override // com.google.android.gms.internal.ads.zzbng
            public final Object zza(JSONObject jSONObject2) {
                return new zzbvd(jSONObject2);
            }
        }), this.zza);
    }

    public final /* synthetic */ y9.a zzc(zzdzb zzdzbVar, zzbvb zzbvbVar, zzgbq zzgbqVar, zzdyp zzdypVar) {
        return zzgcj.zzn(zzdzbVar.zza(zzbvbVar), zzgbqVar, this.zza);
    }

    public final /* synthetic */ y9.a zzd(zzbvb zzbvbVar) {
        return ((zzeay) this.zzc.zzb()).zzb(zzbvbVar, Binder.getCallingUid());
    }

    public final /* synthetic */ y9.a zze(zzbvb zzbvbVar) {
        return this.zzb.zzd(zzbvbVar.zzh);
    }

    public final /* synthetic */ y9.a zzf(zzbvb zzbvbVar) {
        return ((zzeay) this.zzc.zzb()).zzi(zzbvbVar.zzh);
    }

    public final y9.a zzg(zzbvb zzbvbVar) {
        return zzh(zzbvbVar, new zzdzb() { // from class: com.google.android.gms.internal.ads.zzdyt
            @Override // com.google.android.gms.internal.ads.zzdzb
            public final y9.a zza(zzbvb zzbvbVar2) {
                return zzdzc.this.zze(zzbvbVar2);
            }
        }, new zzdzb() { // from class: com.google.android.gms.internal.ads.zzdyu
            @Override // com.google.android.gms.internal.ads.zzdzb
            public final y9.a zza(zzbvb zzbvbVar2) {
                return zzdzc.this.zzf(zzbvbVar2);
            }
        }, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdys
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                InputStream inputStream = (InputStream) obj;
                return zzgcj.zzh(null);
            }
        });
    }
}
