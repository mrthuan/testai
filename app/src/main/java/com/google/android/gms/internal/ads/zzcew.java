package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcew {
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.google.android.gms.internal.ads.zzcej] */
    public static final zzcej zza(final Context context, final zzcgd zzcgdVar, final String str, final boolean z10, final boolean z11, final zzauo zzauoVar, final zzbcz zzbczVar, final VersionInfoParcel versionInfoParcel, zzbcl zzbclVar, final com.google.android.gms.ads.internal.zzm zzmVar, final com.google.android.gms.ads.internal.zza zzaVar, final zzbav zzbavVar, final zzfel zzfelVar, final zzfeo zzfeoVar, final zzeds zzedsVar, final zzffk zzffkVar) {
        zzbbw.zza(context);
        try {
            zzfvk zzfvkVar = new zzfvk(context, zzcgdVar, str, z10, z11, zzauoVar, zzbczVar, versionInfoParcel, null, zzmVar, zzaVar, zzbavVar, zzfelVar, zzfeoVar, zzffkVar, zzedsVar) { // from class: com.google.android.gms.internal.ads.zzces
                public final /* synthetic */ Context zza;
                public final /* synthetic */ zzcgd zzb;
                public final /* synthetic */ String zzc;
                public final /* synthetic */ boolean zzd;
                public final /* synthetic */ boolean zze;
                public final /* synthetic */ zzauo zzf;
                public final /* synthetic */ zzbcz zzg;
                public final /* synthetic */ VersionInfoParcel zzh;
                public final /* synthetic */ com.google.android.gms.ads.internal.zzm zzi;
                public final /* synthetic */ com.google.android.gms.ads.internal.zza zzj;
                public final /* synthetic */ zzbav zzk;
                public final /* synthetic */ zzfel zzl;
                public final /* synthetic */ zzfeo zzm;
                public final /* synthetic */ zzffk zzn;
                public final /* synthetic */ zzeds zzo;

                {
                    this.zzi = zzmVar;
                    this.zzj = zzaVar;
                    this.zzk = zzbavVar;
                    this.zzl = zzfelVar;
                    this.zzm = zzfeoVar;
                    this.zzn = zzffkVar;
                    this.zzo = zzedsVar;
                }

                @Override // com.google.android.gms.internal.ads.zzfvk
                public final Object zza() {
                    zzcgd zzcgdVar2 = this.zzb;
                    String str2 = this.zzc;
                    boolean z12 = this.zzd;
                    zzbav zzbavVar2 = this.zzk;
                    boolean z13 = this.zze;
                    zzauo zzauoVar2 = this.zzf;
                    zzfel zzfelVar2 = this.zzl;
                    zzbcz zzbczVar2 = this.zzg;
                    com.google.android.gms.ads.internal.zzm zzmVar2 = this.zzi;
                    zzfeo zzfeoVar2 = this.zzm;
                    Context context2 = this.zza;
                    VersionInfoParcel versionInfoParcel2 = this.zzh;
                    com.google.android.gms.ads.internal.zza zzaVar2 = this.zzj;
                    zzffk zzffkVar2 = this.zzn;
                    zzeds zzedsVar2 = this.zzo;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i10 = zzcfi.zza;
                        zzcfb zzcfbVar = new zzcfb(new zzcfi(new zzcgc(context2), zzcgdVar2, str2, z12, z13, zzauoVar2, zzbczVar2, versionInfoParcel2, null, zzmVar2, zzaVar2, zzbavVar2, zzfelVar2, zzfeoVar2, zzffkVar2));
                        com.google.android.gms.ads.internal.zzu.B.f10555e.getClass();
                        zzcfbVar.setWebViewClient(new zzcfs(zzcfbVar, zzbavVar2, z13, zzedsVar2));
                        zzcfbVar.setWebChromeClient(new zzcei(zzcfbVar));
                        return zzcfbVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            ?? zza = zzfvkVar.zza();
            StrictMode.setThreadPolicy(threadPolicy);
            return zza;
        } catch (Throwable th2) {
            throw new zzcev("Webview initialization failed.", th2);
        }
    }
}
