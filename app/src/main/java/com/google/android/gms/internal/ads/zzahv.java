package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzahv extends zzahx {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzahv(int i10, long j10) {
        super(i10);
        this.zza = j10;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzahx
    public final String toString() {
        List list = this.zzb;
        String zzf = zzahx.zzf(this.zzd);
        String arrays = Arrays.toString(list.toArray());
        String arrays2 = Arrays.toString(this.zzc.toArray());
        return zzf + " leaves: " + arrays + " containers: " + arrays2;
    }

    public final zzahv zza(int i10) {
        int size = this.zzc.size();
        for (int i11 = 0; i11 < size; i11++) {
            zzahv zzahvVar = (zzahv) this.zzc.get(i11);
            if (zzahvVar.zzd == i10) {
                return zzahvVar;
            }
        }
        return null;
    }

    public final zzahw zzb(int i10) {
        int size = this.zzb.size();
        for (int i11 = 0; i11 < size; i11++) {
            zzahw zzahwVar = (zzahw) this.zzb.get(i11);
            if (zzahwVar.zzd == i10) {
                return zzahwVar;
            }
        }
        return null;
    }

    public final void zzc(zzahv zzahvVar) {
        this.zzc.add(zzahvVar);
    }

    public final void zzd(zzahw zzahwVar) {
        this.zzb.add(zzahwVar);
    }
}
