package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdoa {
    private final com.google.android.gms.ads.internal.zza zzb;
    private final Context zzc;
    private final zzdsk zzd;
    private final Executor zze;
    private final zzauo zzf;
    private final VersionInfoParcel zzg;
    private final zzedh zzi;
    private final zzfll zzj;
    private final zzeds zzk;
    private final zzffk zzl;
    private y9.a zzm;
    private final zzdnn zza = new zzdnn();
    private final zzbjn zzh = new zzbjn();

    public zzdoa(zzdnx zzdnxVar) {
        this.zzc = zzdnx.zza(zzdnxVar);
        this.zze = zzdnx.zzj(zzdnxVar);
        this.zzf = zzdnx.zzb(zzdnxVar);
        this.zzg = zzdnx.zzd(zzdnxVar);
        this.zzb = zzdnx.zzc(zzdnxVar);
        this.zzi = zzdnx.zzf(zzdnxVar);
        this.zzj = zzdnx.zzi(zzdnxVar);
        this.zzd = zzdnx.zze(zzdnxVar);
        this.zzk = zzdnx.zzg(zzdnxVar);
        this.zzl = zzdnx.zzh(zzdnxVar);
    }

    public final /* synthetic */ zzcej zza(zzcej zzcejVar) {
        zzcejVar.zzag("/result", this.zzh);
        zzcgb zzN = zzcejVar.zzN();
        com.google.android.gms.ads.internal.zzb zzbVar = new com.google.android.gms.ads.internal.zzb(this.zzc, null);
        zzedh zzedhVar = this.zzi;
        zzfll zzfllVar = this.zzj;
        zzdsk zzdskVar = this.zzd;
        zzdnn zzdnnVar = this.zza;
        zzN.zzR(null, zzdnnVar, zzdnnVar, zzdnnVar, zzdnnVar, false, null, zzbVar, null, null, zzedhVar, zzfllVar, zzdskVar, null, null, null, null, null, null);
        return zzcejVar;
    }

    public final /* synthetic */ y9.a zzf(String str, JSONObject jSONObject, zzcej zzcejVar) {
        return this.zzh.zzb(zzcejVar, str, jSONObject);
    }

    public final synchronized y9.a zzg(final String str, final JSONObject jSONObject) {
        y9.a aVar = this.zzm;
        if (aVar == null) {
            return zzgcj.zzh(null);
        }
        return zzgcj.zzn(aVar, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdno
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return zzdoa.this.zzf(str, jSONObject, (zzcej) obj);
            }
        }, this.zze);
    }

    public final synchronized void zzh(zzfel zzfelVar, zzfeo zzfeoVar, zzcni zzcniVar) {
        y9.a aVar = this.zzm;
        if (aVar == null) {
            return;
        }
        zzgcj.zzr(aVar, new zzdnu(this, zzfelVar, zzfeoVar, zzcniVar), this.zze);
    }

    public final synchronized void zzi() {
        y9.a aVar = this.zzm;
        if (aVar == null) {
            return;
        }
        zzgcj.zzr(aVar, new zzdnq(this), this.zze);
        this.zzm = null;
    }

    public final synchronized void zzj(String str, Map map) {
        y9.a aVar = this.zzm;
        if (aVar == null) {
            return;
        }
        zzgcj.zzr(aVar, new zzdnt(this, "sendMessageToNativeJs", map), this.zze);
    }

    public final synchronized void zzk() {
        final String str = (String) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzdr);
        final Context context = this.zzc;
        final zzauo zzauoVar = this.zzf;
        final VersionInfoParcel versionInfoParcel = this.zzg;
        final com.google.android.gms.ads.internal.zza zzaVar = this.zzb;
        final zzeds zzedsVar = this.zzk;
        final zzffk zzffkVar = this.zzl;
        y9.a zzm = zzgcj.zzm(zzgcj.zzk(new zzgbp() { // from class: com.google.android.gms.internal.ads.zzceu
            @Override // com.google.android.gms.internal.ads.zzgbp
            public final y9.a zza() {
                zzcew zzcewVar = com.google.android.gms.ads.internal.zzu.B.f10554d;
                Context context2 = context;
                zzcgd zza = zzcgd.zza();
                zzauo zzauoVar2 = zzauoVar;
                zzeds zzedsVar2 = zzedsVar;
                com.google.android.gms.ads.internal.zza zzaVar2 = zzaVar;
                zzcej zza2 = zzcew.zza(context2, zza, "", false, false, zzauoVar2, null, versionInfoParcel, null, null, zzaVar2, zzbav.zza(), null, null, zzedsVar2, zzffkVar);
                final zzbzs zza3 = zzbzs.zza(zza2);
                zza2.zzN().zzB(new zzcfz() { // from class: com.google.android.gms.internal.ads.zzcet
                    @Override // com.google.android.gms.internal.ads.zzcfz
                    public final void zza(boolean z10, int i10, String str2, String str3) {
                        zzbzs.this.zzb();
                    }
                });
                zza2.loadUrl(str);
                return zza3;
            }
        }, zzbzo.zze), new zzful() { // from class: com.google.android.gms.internal.ads.zzdnp
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                zzcej zzcejVar = (zzcej) obj;
                zzdoa.this.zza(zzcejVar);
                return zzcejVar;
            }
        }, this.zze);
        this.zzm = zzm;
        zzbzr.zza(zzm, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzl(String str, zzbix zzbixVar) {
        y9.a aVar = this.zzm;
        if (aVar == null) {
            return;
        }
        zzgcj.zzr(aVar, new zzdnr(this, str, zzbixVar), this.zze);
    }

    public final void zzm(WeakReference weakReference, String str, zzbix zzbixVar) {
        zzl(str, new zzdnz(this, weakReference, str, zzbixVar, null));
    }

    public final synchronized void zzn(String str, zzbix zzbixVar) {
        y9.a aVar = this.zzm;
        if (aVar == null) {
            return;
        }
        zzgcj.zzr(aVar, new zzdns(this, str, zzbixVar), this.zze);
    }
}
