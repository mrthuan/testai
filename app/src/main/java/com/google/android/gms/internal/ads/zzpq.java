package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzpq extends zzcu {
    private int[] zzd;
    private int[] zze;

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zze(ByteBuffer byteBuffer) {
        int[] iArr = this.zze;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer zzj = zzj(((limit - position) / this.zzb.zze) * this.zzc.zze);
        while (position < limit) {
            for (int i10 : iArr) {
                zzj.putShort(byteBuffer.getShort(i10 + i10 + position));
            }
            position += this.zzb.zze;
        }
        byteBuffer.position(limit);
        zzj.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final zzcr zzi(zzcr zzcrVar) {
        boolean z10;
        boolean z11;
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzcr.zza;
        }
        if (zzcrVar.zzd == 2) {
            if (zzcrVar.zzc != iArr.length) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i10 = 0;
            while (true) {
                int length = iArr.length;
                if (i10 < length) {
                    int i11 = iArr[i10];
                    if (i11 < zzcrVar.zzc) {
                        if (i11 != i10) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z10 |= z11;
                        i10++;
                    } else {
                        throw new zzcs("Unhandled input format:", zzcrVar);
                    }
                } else if (z10) {
                    return new zzcr(zzcrVar.zzb, length, 2);
                } else {
                    return zzcr.zza;
                }
            }
        } else {
            throw new zzcs("Unhandled input format:", zzcrVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final void zzk() {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final void zzm() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzo(int[] iArr) {
        this.zzd = iArr;
    }
}
