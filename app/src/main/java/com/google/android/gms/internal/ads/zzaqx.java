package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaqx extends zzhel {
    private Date zzg;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk;
    private float zzl;
    private zzhev zzm;
    private long zzn;

    public zzaqx() {
        super("mvhd");
        this.zzk = 1.0d;
        this.zzl = 1.0f;
        this.zzm = zzhev.zza;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MovieHeaderBox[creationTime=");
        sb2.append(this.zzg);
        sb2.append(";modificationTime=");
        sb2.append(this.zzh);
        sb2.append(";timescale=");
        sb2.append(this.zzi);
        sb2.append(";duration=");
        sb2.append(this.zzj);
        sb2.append(";rate=");
        sb2.append(this.zzk);
        sb2.append(";volume=");
        sb2.append(this.zzl);
        sb2.append(";matrix=");
        sb2.append(this.zzm);
        sb2.append(";nextTrackId=");
        return android.support.v4.media.session.h.e(sb2, this.zzn, "]");
    }

    public final long zzc() {
        return this.zzj;
    }

    public final long zzd() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzhej
    public final void zze(ByteBuffer byteBuffer) {
        zzh(byteBuffer);
        if (zzg() == 1) {
            this.zzg = zzheq.zza(zzaqt.zzf(byteBuffer));
            this.zzh = zzheq.zza(zzaqt.zzf(byteBuffer));
            this.zzi = zzaqt.zze(byteBuffer);
            this.zzj = zzaqt.zzf(byteBuffer);
        } else {
            this.zzg = zzheq.zza(zzaqt.zze(byteBuffer));
            this.zzh = zzheq.zza(zzaqt.zze(byteBuffer));
            this.zzi = zzaqt.zze(byteBuffer);
            this.zzj = zzaqt.zze(byteBuffer);
        }
        this.zzk = zzaqt.zzb(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.zzl = ((short) ((bArr[1] & 255) | ((short) (65280 & (bArr[0] << 8))))) / 256.0f;
        zzaqt.zzd(byteBuffer);
        zzaqt.zze(byteBuffer);
        zzaqt.zze(byteBuffer);
        double zzb = zzaqt.zzb(byteBuffer);
        double zzb2 = zzaqt.zzb(byteBuffer);
        double zza = zzaqt.zza(byteBuffer);
        this.zzm = new zzhev(zzb, zzb2, zzaqt.zzb(byteBuffer), zzaqt.zzb(byteBuffer), zza, zzaqt.zza(byteBuffer), zzaqt.zza(byteBuffer), zzaqt.zzb(byteBuffer), zzaqt.zzb(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = zzaqt.zze(byteBuffer);
    }
}
