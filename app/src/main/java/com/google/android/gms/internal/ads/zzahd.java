package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzahd implements zzahf {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzahl zzc = new zzahl();
    private zzahe zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzacl zzaclVar, int i10) {
        ((zzaby) zzaclVar).zzn(this.zza, 0, i10, false);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (this.zza[i11] & 255);
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzahf
    public final void zza(zzahe zzaheVar) {
        this.zzd = zzaheVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahf
    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zze();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
        if (r0 == 1) goto L39;
     */
    @Override // com.google.android.gms.internal.ads.zzahf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzacl r14) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahd.zzc(com.google.android.gms.internal.ads.zzacl):boolean");
    }
}
