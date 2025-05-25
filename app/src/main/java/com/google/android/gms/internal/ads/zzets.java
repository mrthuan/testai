package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzets implements zzevo {
    private final zzgcu zza;
    private final Context zzb;
    private final Set zzc;

    public zzets(zzgcu zzgcuVar, Context context, Set set) {
        this.zza = zzgcuVar;
        this.zzb = context;
        this.zzc = set;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 27;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzets.this.zzc();
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
        if (r0.contains("banner") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzett zzc() {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbbn r0 = com.google.android.gms.internal.ads.zzbbw.zzez
            com.google.android.gms.ads.internal.client.zzba r1 = com.google.android.gms.ads.internal.client.zzba.f10115d
            com.google.android.gms.internal.ads.zzbbu r2 = r1.c
            java.lang.Object r0 = r2.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L54
            com.google.android.gms.internal.ads.zzbbn r0 = com.google.android.gms.internal.ads.zzbbw.zzeJ
            com.google.android.gms.internal.ads.zzbbu r1 = r1.c
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L44
            java.util.Set r0 = r3.zzc
            java.lang.String r1 = "rewarded"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L44
            java.lang.String r1 = "interstitial"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L44
            java.lang.String r1 = "native"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L44
            java.lang.String r1 = "banner"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L54
        L44:
            android.content.Context r0 = r3.zzb
            com.google.android.gms.internal.ads.zzett r1 = new com.google.android.gms.internal.ads.zzett
            com.google.android.gms.ads.internal.zzu r2 = com.google.android.gms.ads.internal.zzu.B
            com.google.android.gms.internal.ads.zzeei r2 = r2.f10573w
            java.lang.String r0 = r2.zzf(r0)
            r1.<init>(r0)
            return r1
        L54:
            com.google.android.gms.internal.ads.zzett r0 = new com.google.android.gms.internal.ads.zzett
            r1 = 0
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzets.zzc():com.google.android.gms.internal.ads.zzett");
    }
}
