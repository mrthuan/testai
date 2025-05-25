package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import com.google.android.gms.common.api.Api;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcni {
    zzbts zza;
    zzbts zzb;
    private final Context zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzeep zze;
    private final zzdpq zzf;
    private final zzgcu zzg;
    private final Executor zzh;
    private final ScheduledExecutorService zzi;

    public zzcni(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar, zzeep zzeepVar, zzdpq zzdpqVar, zzgcu zzgcuVar, zzgcu zzgcuVar2, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = context;
        this.zzd = zzgVar;
        this.zze = zzeepVar;
        this.zzf = zzdpqVar;
        this.zzg = zzgcuVar;
        this.zzh = zzgcuVar2;
        this.zzi = scheduledExecutorService;
    }

    public static boolean zzj(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzjn));
    }

    private final y9.a zzk(final String str, final InputEvent inputEvent, Random random) {
        try {
            zzbbn zzbbnVar = zzbbw.zzjn;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
            if (str.contains((CharSequence) zzbaVar.c.zza(zzbbnVar)) && !this.zzd.zzS()) {
                final Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                buildUpon.appendQueryParameter((String) zzbaVar.c.zza(zzbbw.zzjo), String.valueOf(random.nextInt(Api.BaseClientBuilder.API_PRIORITY_OTHER)));
                if (inputEvent == null) {
                    buildUpon.appendQueryParameter((String) zzbaVar.c.zza(zzbbw.zzjp), "11");
                    return zzgcj.zzh(buildUpon.toString());
                }
                return zzgcj.zzf(zzgcj.zzn(zzgca.zzu(this.zze.zza()), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzcnc
                    @Override // com.google.android.gms.internal.ads.zzgbq
                    public final y9.a zza(Object obj) {
                        return zzcni.this.zzd(buildUpon, str, inputEvent, (Integer) obj);
                    }
                }, this.zzh), Throwable.class, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzcnd
                    @Override // com.google.android.gms.internal.ads.zzgbq
                    public final y9.a zza(Object obj) {
                        return zzcni.this.zze(buildUpon, (Throwable) obj);
                    }
                }, this.zzg);
            }
            return zzgcj.zzh(str);
        } catch (Exception e10) {
            return zzgcj.zzg(e10);
        }
    }

    public final y9.a zzb(final String str, Random random) {
        if (TextUtils.isEmpty(str)) {
            return zzgcj.zzh(str);
        }
        return zzgcj.zzf(zzk(str, this.zzf.zza(), random), Throwable.class, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzcmz
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return zzcni.this.zzc(str, (Throwable) obj);
            }
        }, this.zzg);
    }

    public final /* synthetic */ y9.a zzc(String str, final Throwable th2) {
        this.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnb
            @Override // java.lang.Runnable
            public final void run() {
                zzcni.this.zzg(th2);
            }
        });
        return zzgcj.zzh(str);
    }

    public final y9.a zzd(final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) {
        if (num.intValue() == 1) {
            Uri.Builder buildUpon = builder.build().buildUpon();
            zzbbn zzbbnVar = zzbbw.zzjq;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
            buildUpon.appendQueryParameter((String) zzbaVar.c.zza(zzbbnVar), "1");
            buildUpon.appendQueryParameter((String) zzbaVar.c.zza(zzbbw.zzjp), "12");
            if (str.contains((CharSequence) zzbaVar.c.zza(zzbbw.zzjr))) {
                buildUpon.authority((String) zzbaVar.c.zza(zzbbw.zzjs));
            }
            return zzgcj.zzn(zzgca.zzu(this.zze.zzb(buildUpon.build(), inputEvent)), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzcne
                @Override // com.google.android.gms.internal.ads.zzgbq
                public final y9.a zza(Object obj) {
                    zzbbn zzbbnVar2 = zzbbw.zzjp;
                    Uri.Builder builder2 = builder;
                    builder2.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbnVar2), "12");
                    return zzgcj.zzh(builder2.toString());
                }
            }, this.zzh);
        }
        builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzjp), "10");
        return zzgcj.zzh(builder.toString());
    }

    public final y9.a zze(Uri.Builder builder, final Throwable th2) {
        this.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcna
            @Override // java.lang.Runnable
            public final void run() {
                zzcni.this.zzh(th2);
            }
        });
        builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzjp), "9");
        return zzgcj.zzh(builder.toString());
    }

    public final void zzg(Throwable th2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzju)).booleanValue()) {
            zzbts zzc = zzbtq.zzc(this.zzc);
            this.zzb = zzc;
            zzc.zzh(th2, "AttributionReporting.getUpdatedUrlAndRegisterSource");
            return;
        }
        zzbts zza = zzbtq.zza(this.zzc);
        this.zza = zza;
        zza.zzh(th2, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
    }

    public final void zzh(Throwable th2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzju)).booleanValue()) {
            zzbts zzc = zzbtq.zzc(this.zzc);
            this.zzb = zzc;
            zzc.zzh(th2, "AttributionReporting");
            return;
        }
        zzbts zza = zzbtq.zza(this.zzc);
        this.zza = zza;
        zza.zzh(th2, "AttributionReportingSampled");
    }

    public final void zzi(String str, zzfll zzfllVar, Random random) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        y9.a zzk = zzk(str, this.zzf.zza(), random);
        zzbbn zzbbnVar = zzbbw.zzjt;
        zzgcj.zzr(zzgcj.zzo(zzk, ((Integer) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbnVar)).intValue(), TimeUnit.MILLISECONDS, this.zzi), new zzcnh(this, zzfllVar, str), this.zzg);
    }
}
