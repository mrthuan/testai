package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzqz extends zzcu {
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private byte[] zzh = zzet.zzf;
    private int zzi;
    private long zzj;

    @Override // com.google.android.gms.internal.ads.zzcu, com.google.android.gms.internal.ads.zzct
    public final ByteBuffer zzb() {
        int i10;
        if (super.zzh() && (i10 = this.zzi) > 0) {
            zzj(i10).put(this.zzh, 0, this.zzi).flip();
            this.zzi = 0;
        }
        return super.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzct
    public final void zze(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 != 0) {
            int min = Math.min(i10, this.zzg);
            this.zzj += min / this.zzb.zze;
            this.zzg -= min;
            byteBuffer.position(position + min);
            if (this.zzg <= 0) {
                int i11 = i10 - min;
                int length = (this.zzi + i11) - this.zzh.length;
                ByteBuffer zzj = zzj(length);
                int max = Math.max(0, Math.min(length, this.zzi));
                zzj.put(this.zzh, 0, max);
                int max2 = Math.max(0, Math.min(length - max, i11));
                byteBuffer.limit(byteBuffer.position() + max2);
                zzj.put(byteBuffer);
                byteBuffer.limit(limit);
                int i12 = i11 - max2;
                int i13 = this.zzi - max;
                this.zzi = i13;
                byte[] bArr = this.zzh;
                System.arraycopy(bArr, max, bArr, 0, i13);
                byteBuffer.get(this.zzh, this.zzi, i12);
                this.zzi += i12;
                zzj.flip();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcu, com.google.android.gms.internal.ads.zzct
    public final boolean zzh() {
        if (super.zzh() && this.zzi == 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final zzcr zzi(zzcr zzcrVar) {
        if (zzcrVar.zzd == 2) {
            this.zzf = true;
            if (this.zzd == 0 && this.zze == 0) {
                return zzcr.zza;
            }
            return zzcrVar;
        }
        throw new zzcs("Unhandled input format:", zzcrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final void zzk() {
        if (this.zzf) {
            this.zzf = false;
            int i10 = this.zze;
            int i11 = this.zzb.zze;
            this.zzh = new byte[i10 * i11];
            this.zzg = this.zzd * i11;
        }
        this.zzi = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final void zzl() {
        int i10;
        if (this.zzf) {
            if (this.zzi > 0) {
                this.zzj += i10 / this.zzb.zze;
            }
            this.zzi = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final void zzm() {
        this.zzh = zzet.zzf;
    }

    public final long zzo() {
        return this.zzj;
    }

    public final void zzp() {
        this.zzj = 0L;
    }

    public final void zzq(int i10, int i11) {
        this.zzd = i10;
        this.zze = i11;
    }
}
