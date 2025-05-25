package com.google.android.gms.internal.ads;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzccp implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ zzccv zze;

    public zzccp(zzccv zzccvVar, String str, String str2, int i10, int i11, boolean z10) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = zzccvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap h10 = a6.h.h("event", "precacheProgress");
        h10.put("src", this.zza);
        h10.put("cachedSrc", this.zzb);
        h10.put("bytesLoaded", Integer.toString(this.zzc));
        h10.put("totalBytes", Integer.toString(this.zzd));
        h10.put("cacheReady", PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
        zzccv.zze(this.zze, "onPrecacheEvent", h10);
    }
}
