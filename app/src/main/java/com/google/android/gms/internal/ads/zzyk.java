package com.google.android.gms.internal.ads;

import java.util.Arrays;
import lib.zj.office.fc.hpsf.Variant;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzyk {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzyd[] zzd = new zzyd[100];

    public zzyk(boolean z10, int i10) {
    }

    public final synchronized int zza() {
        return this.zzb * 65536;
    }

    public final synchronized zzyd zzb() {
        zzyd zzydVar;
        this.zzb++;
        int i10 = this.zzc;
        if (i10 > 0) {
            zzyd[] zzydVarArr = this.zzd;
            int i11 = i10 - 1;
            this.zzc = i11;
            zzydVar = zzydVarArr[i11];
            zzydVar.getClass();
            zzydVarArr[i11] = null;
        } else {
            zzydVar = new zzyd(new byte[65536], 0);
            int i12 = this.zzb;
            zzyd[] zzydVarArr2 = this.zzd;
            int length = zzydVarArr2.length;
            if (i12 > length) {
                this.zzd = (zzyd[]) Arrays.copyOf(zzydVarArr2, length + length);
                return zzydVar;
            }
        }
        return zzydVar;
    }

    public final synchronized void zzc(zzyd zzydVar) {
        zzyd[] zzydVarArr = this.zzd;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        zzydVarArr[i10] = zzydVar;
        this.zzb--;
        notifyAll();
    }

    public final synchronized void zzd(zzye zzyeVar) {
        while (zzyeVar != null) {
            zzyd[] zzydVarArr = this.zzd;
            int i10 = this.zzc;
            this.zzc = i10 + 1;
            zzydVarArr[i10] = zzyeVar.zzc();
            this.zzb--;
            zzyeVar = zzyeVar.zzd();
        }
        notifyAll();
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i10) {
        int i11 = this.zza;
        this.zza = i10;
        if (i10 < i11) {
            zzg();
        }
    }

    public final synchronized void zzg() {
        int i10 = this.zza;
        int i11 = zzet.zza;
        int max = Math.max(0, ((i10 + Variant.VT_ILLEGAL) / 65536) - this.zzb);
        int i12 = this.zzc;
        if (max >= i12) {
            return;
        }
        Arrays.fill(this.zzd, max, i12, (Object) null);
        this.zzc = max;
    }
}
