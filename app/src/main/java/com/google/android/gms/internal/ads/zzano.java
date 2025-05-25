package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzano implements zzack {
    private final int zza;
    private final List zzb;
    private final zzek zzc;
    private final SparseIntArray zzd;
    private final zzanr zze;
    private final zzajy zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;
    private final SparseBooleanArray zzi;
    private final zzanl zzj;
    private zzank zzk;
    private zzacn zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    @Deprecated
    public zzano() {
        this(1, 1, zzajy.zza, new zzer(0L), new zzamc(0), 112800);
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x01bb, code lost:
        if (r1 == false) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int, boolean] */
    @Override // com.google.android.gms.internal.ads.zzack
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.zzacl r19, com.google.android.gms.internal.ads.zzadf r20) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzano.zzb(com.google.android.gms.internal.ads.zzacl, com.google.android.gms.internal.ads.zzadf):int");
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ List zzd() {
        return zzfxr.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zze(zzacn zzacnVar) {
        if (this.zza == 0) {
            zzacnVar = new zzakc(zzacnVar, this.zzf);
        }
        this.zzl = zzacnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzi(long j10, long j11) {
        zzank zzankVar;
        int size = this.zzb.size();
        for (int i10 = 0; i10 < size; i10++) {
            zzer zzerVar = (zzer) this.zzb.get(i10);
            if (zzerVar.zzf() != -9223372036854775807L) {
                long zzd = zzerVar.zzd();
                if (zzd != -9223372036854775807L) {
                    if (zzd != 0) {
                        if (zzd == j11) {
                        }
                    }
                }
            }
            zzerVar.zzi(j11);
        }
        if (j11 != 0 && (zzankVar = this.zzk) != null) {
            zzankVar.zzd(j11);
        }
        this.zzc.zzH(0);
        this.zzd.clear();
        for (int i11 = 0; i11 < this.zzg.size(); i11++) {
            ((zzant) this.zzg.valueAt(i11)).zzc();
        }
        this.zzq = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
        r1 = r1 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzack
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzj(com.google.android.gms.internal.ads.zzacl r7) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzek r0 = r6.zzc
            byte[] r0 = r0.zzM()
            com.google.android.gms.internal.ads.zzaby r7 = (com.google.android.gms.internal.ads.zzaby) r7
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.zzm(r0, r2, r1, r2)
            r1 = r2
        Lf:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L2b
            r3 = r2
        L14:
            r4 = 5
            if (r3 >= r4) goto L26
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L23
            int r1 = r1 + 1
            goto Lf
        L23:
            int r3 = r3 + 1
            goto L14
        L26:
            r7.zzo(r1, r2)
            r7 = 1
            return r7
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzano.zzj(com.google.android.gms.internal.ads.zzacl):boolean");
    }

    public zzano(int i10, int i11, zzajy zzajyVar, zzer zzerVar, zzanr zzanrVar, int i12) {
        this.zze = zzanrVar;
        this.zza = i11;
        this.zzf = zzajyVar;
        this.zzb = Collections.singletonList(zzerVar);
        this.zzc = new zzek(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzh = sparseBooleanArray;
        this.zzi = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzg = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzj = new zzanl(112800);
        this.zzl = zzacn.zza;
        this.zzr = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i13 = 0; i13 < size; i13++) {
            this.zzg.put(sparseArray2.keyAt(i13), (zzant) sparseArray2.valueAt(i13));
        }
        this.zzg.put(0, new zzanh(new zzanm(this)));
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ zzack zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzf() {
    }
}
