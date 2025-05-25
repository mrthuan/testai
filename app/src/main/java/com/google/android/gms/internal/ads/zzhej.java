package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzhej implements zzaqu {
    private static final zzheu zzg = zzheu.zzb(zzhej.class);
    protected final String zza;
    long zzd;
    zzheo zzf;
    private ByteBuffer zzh;
    long zze = -1;
    boolean zzc = true;
    boolean zzb = true;

    public zzhej(String str) {
        this.zza = str;
    }

    private final synchronized void zzc() {
        String str;
        if (!this.zzc) {
            try {
                zzheu zzheuVar = zzg;
                String str2 = this.zza;
                if (str2.length() != 0) {
                    str = "mem mapping ".concat(str2);
                } else {
                    str = new String("mem mapping ");
                }
                zzheuVar.zza(str);
                this.zzh = this.zzf.zzd(this.zzd, this.zze);
                this.zzc = true;
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqu
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaqu
    public final void zzb(zzheo zzheoVar, ByteBuffer byteBuffer, long j10, zzaqr zzaqrVar) {
        this.zzd = zzheoVar.zzb();
        byteBuffer.remaining();
        this.zze = j10;
        this.zzf = zzheoVar;
        zzheoVar.zze(zzheoVar.zzb() + j10);
        this.zzc = false;
        this.zzb = false;
        zzf();
    }

    public abstract void zze(ByteBuffer byteBuffer);

    public final synchronized void zzf() {
        String str;
        zzc();
        zzheu zzheuVar = zzg;
        String str2 = this.zza;
        if (str2.length() != 0) {
            str = "parsing details of ".concat(str2);
        } else {
            str = new String("parsing details of ");
        }
        zzheuVar.zza(str);
        ByteBuffer byteBuffer = this.zzh;
        if (byteBuffer != null) {
            this.zzb = true;
            byteBuffer.rewind();
            zze(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                byteBuffer.slice();
            }
            this.zzh = null;
        }
    }
}
