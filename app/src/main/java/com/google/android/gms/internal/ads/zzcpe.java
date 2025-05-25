package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcpe extends zzcru {
    private final zzcej zzc;
    private final int zzd;
    private final Context zze;
    private final zzcos zzf;
    private final zzdgx zzg;
    private final zzddu zzh;
    private final zzcxd zzi;
    private final boolean zzj;
    private final zzbzi zzk;
    private boolean zzl;

    public zzcpe(zzcrt zzcrtVar, Context context, zzcej zzcejVar, int i10, zzcos zzcosVar, zzdgx zzdgxVar, zzddu zzdduVar, zzcxd zzcxdVar, zzbzi zzbziVar) {
        super(zzcrtVar);
        this.zzl = false;
        this.zzc = zzcejVar;
        this.zze = context;
        this.zzd = i10;
        this.zzf = zzcosVar;
        this.zzg = zzdgxVar;
        this.zzh = zzdduVar;
        this.zzi = zzcxdVar;
        this.zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzeM)).booleanValue();
        this.zzk = zzbziVar;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcru
    public final void zzb() {
        super.zzb();
        zzcej zzcejVar = this.zzc;
        if (zzcejVar != null) {
            zzcejVar.destroy();
        }
    }

    public final void zzc(zzazj zzazjVar) {
        zzcej zzcejVar = this.zzc;
        if (zzcejVar != null) {
            zzcejVar.zzak(zzazjVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r3 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(android.app.Activity r3, com.google.android.gms.internal.ads.zzazw r4, boolean r5) {
        /*
            r2 = this;
            if (r3 != 0) goto L4
            android.content.Context r3 = r2.zze
        L4:
            boolean r4 = r2.zzj
            if (r4 == 0) goto Ld
            com.google.android.gms.internal.ads.zzddu r4 = r2.zzh
            r4.zzb()
        Ld:
            com.google.android.gms.internal.ads.zzbbn r4 = com.google.android.gms.internal.ads.zzbbw.zzat
            com.google.android.gms.ads.internal.client.zzba r0 = com.google.android.gms.ads.internal.client.zzba.f10115d
            com.google.android.gms.internal.ads.zzbbu r1 = r0.c
            java.lang.Object r4 = r1.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L5e
            com.google.android.gms.ads.internal.zzu r4 = com.google.android.gms.ads.internal.zzu.B
            com.google.android.gms.ads.internal.util.zzt r1 = r4.c
            boolean r1 = com.google.android.gms.ads.internal.util.zzt.e(r3)
            if (r1 == 0) goto L5e
            java.lang.String r5 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.google.android.gms.ads.internal.util.client.zzm.e(r5)
            com.google.android.gms.internal.ads.zzcxd r5 = r2.zzi
            r5.zzb()
            com.google.android.gms.internal.ads.zzbbn r5 = com.google.android.gms.internal.ads.zzbbw.zzau
            com.google.android.gms.internal.ads.zzbbu r0 = r0.c
            java.lang.Object r5 = r0.zza(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto Lcd
            com.google.android.gms.internal.ads.zzfos r5 = new com.google.android.gms.internal.ads.zzfos
            android.content.Context r3 = r3.getApplicationContext()
            com.google.android.gms.ads.internal.util.zzbt r4 = r4.f10568r
            android.os.Looper r4 = r4.a()
            r5.<init>(r3, r4)
            com.google.android.gms.internal.ads.zzfex r3 = r2.zza
            com.google.android.gms.internal.ads.zzfew r3 = r3.zzb
            com.google.android.gms.internal.ads.zzfeo r3 = r3.zzb
            java.lang.String r3 = r3.zzb
            r5.zza(r3)
            return
        L5e:
            com.google.android.gms.internal.ads.zzbbn r4 = com.google.android.gms.internal.ads.zzbbw.zzkU
            com.google.android.gms.internal.ads.zzbbu r0 = r0.c
            java.lang.Object r4 = r0.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0 = 0
            if (r4 == 0) goto L9b
            com.google.android.gms.internal.ads.zzcej r4 = r2.zzc
            if (r4 == 0) goto L9b
            com.google.android.gms.internal.ads.zzfel r4 = r4.zzD()
            if (r4 == 0) goto L9b
            boolean r1 = r4.zzar
            if (r1 == 0) goto L9b
            int r4 = r4.zzas
            com.google.android.gms.internal.ads.zzbzi r1 = r2.zzk
            int r1 = r1.zzb()
            if (r4 != r1) goto L88
            goto L9b
        L88:
            java.lang.String r3 = "The app open consent form has been shown."
            com.google.android.gms.ads.internal.util.client.zzm.e(r3)
            com.google.android.gms.internal.ads.zzcxd r3 = r2.zzi
            r4 = 12
            java.lang.String r5 = "The consent form has already been shown."
            com.google.android.gms.ads.internal.client.zze r4 = com.google.android.gms.internal.ads.zzfgi.zzd(r4, r5, r0)
            r3.zza(r4)
            return
        L9b:
            boolean r4 = r2.zzl
            if (r4 == 0) goto Laf
            java.lang.String r4 = "App open interstitial ad is already visible."
            com.google.android.gms.ads.internal.util.client.zzm.e(r4)
            com.google.android.gms.internal.ads.zzcxd r4 = r2.zzi
            r1 = 10
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfgi.zzd(r1, r0, r0)
            r4.zza(r0)
        Laf:
            boolean r4 = r2.zzl
            if (r4 != 0) goto Lcd
            com.google.android.gms.internal.ads.zzdgx r4 = r2.zzg     // Catch: com.google.android.gms.internal.ads.zzdgw -> Lc7
            com.google.android.gms.internal.ads.zzcxd r0 = r2.zzi     // Catch: com.google.android.gms.internal.ads.zzdgw -> Lc7
            r4.zza(r5, r3, r0)     // Catch: com.google.android.gms.internal.ads.zzdgw -> Lc7
            boolean r3 = r2.zzj     // Catch: com.google.android.gms.internal.ads.zzdgw -> Lc7
            if (r3 == 0) goto Lc3
            com.google.android.gms.internal.ads.zzddu r3 = r2.zzh     // Catch: com.google.android.gms.internal.ads.zzdgw -> Lc7
            r3.zza()     // Catch: com.google.android.gms.internal.ads.zzdgw -> Lc7
        Lc3:
            r3 = 1
            r2.zzl = r3
            return
        Lc7:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzcxd r4 = r2.zzi
            r4.zzc(r3)
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcpe.zzd(android.app.Activity, com.google.android.gms.internal.ads.zzazw, boolean):void");
    }

    public final void zze(long j10, int i10) {
        this.zzf.zza(j10, i10);
    }
}
