package com.google.android.gms.internal.ads;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzccr implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ boolean zzg;
    final /* synthetic */ int zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ zzccv zzj;

    public zzccr(zzccv zzccvVar, String str, String str2, int i10, int i11, long j10, long j11, boolean z10, int i12, int i13) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = j10;
        this.zzf = j11;
        this.zzg = z10;
        this.zzh = i12;
        this.zzi = i13;
        this.zzj = zzccvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        HashMap h10 = a6.h.h("event", "precacheProgress");
        h10.put("src", this.zza);
        h10.put("cachedSrc", this.zzb);
        h10.put("bytesLoaded", Integer.toString(this.zzc));
        h10.put("totalBytes", Integer.toString(this.zzd));
        h10.put("bufferedDuration", Long.toString(this.zze));
        h10.put("totalDuration", Long.toString(this.zzf));
        if (true != this.zzg) {
            str = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
        } else {
            str = "1";
        }
        h10.put("cacheReady", str);
        h10.put("playerCount", Integer.toString(this.zzh));
        h10.put("playerPreparedCount", Integer.toString(this.zzi));
        zzccv.zze(this.zzj, "onPrecacheEvent", h10);
    }
}
