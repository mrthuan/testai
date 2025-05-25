package com.google.android.gms.internal.ads;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzccq implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ long zzg;
    final /* synthetic */ boolean zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ int zzj;
    final /* synthetic */ zzccv zzk;

    public zzccq(zzccv zzccvVar, String str, String str2, long j10, long j11, long j12, long j13, long j14, boolean z10, int i10, int i11) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = j12;
        this.zzf = j13;
        this.zzg = j14;
        this.zzh = z10;
        this.zzi = i10;
        this.zzj = i11;
        this.zzk = zzccvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        HashMap h10 = a6.h.h("event", "precacheProgress");
        h10.put("src", this.zza);
        h10.put("cachedSrc", this.zzb);
        h10.put("bufferedDuration", Long.toString(this.zzc));
        h10.put("totalDuration", Long.toString(this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbG)).booleanValue()) {
            h10.put("qoeLoadedBytes", Long.toString(this.zze));
            h10.put("qoeCachedBytes", Long.toString(this.zzf));
            h10.put("totalBytes", Long.toString(this.zzg));
            com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
            h10.put("reportTime", Long.toString(System.currentTimeMillis()));
        }
        if (true != this.zzh) {
            str = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
        } else {
            str = "1";
        }
        h10.put("cacheReady", str);
        h10.put("playerCount", Integer.toString(this.zzi));
        h10.put("playerPreparedCount", Integer.toString(this.zzj));
        zzccv.zze(this.zzk, "onPrecacheEvent", h10);
    }
}
