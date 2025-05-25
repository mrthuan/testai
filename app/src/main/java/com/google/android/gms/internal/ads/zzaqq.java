package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import lib.zj.office.fc.codec.CharEncoding;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzaqq implements zzaqr {
    private static final Logger zzb = Logger.getLogger(zzaqq.class.getName());
    final ThreadLocal zza = new zzaqp(this);

    public abstract zzaqu zza(String str, byte[] bArr, String str2);

    @Override // com.google.android.gms.internal.ads.zzaqr
    public final zzaqu zzb(zzheo zzheoVar, zzaqv zzaqvVar) {
        int zza;
        long j10;
        String str;
        long zzb2 = zzheoVar.zzb();
        ((ByteBuffer) this.zza.get()).rewind().limit(8);
        do {
            zza = zzheoVar.zza((ByteBuffer) this.zza.get());
            if (zza == 8) {
                ((ByteBuffer) this.zza.get()).rewind();
                long zze = zzaqt.zze((ByteBuffer) this.zza.get());
                byte[] bArr = null;
                if (zze < 8 && zze > 1) {
                    Logger logger = zzb;
                    Level level = Level.SEVERE;
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Plausibility check failed: size < 8 (size = ");
                    sb2.append(zze);
                    sb2.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb2.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                ((ByteBuffer) this.zza.get()).get(bArr2);
                try {
                    String str2 = new String(bArr2, CharEncoding.ISO_8859_1);
                    if (zze == 1) {
                        ((ByteBuffer) this.zza.get()).limit(16);
                        zzheoVar.zza((ByteBuffer) this.zza.get());
                        ((ByteBuffer) this.zza.get()).position(8);
                        j10 = zzaqt.zzf((ByteBuffer) this.zza.get()) - 16;
                    } else if (zze == 0) {
                        j10 = zzheoVar.zzc() - zzheoVar.zzb();
                    } else {
                        j10 = zze - 8;
                    }
                    if ("uuid".equals(str2)) {
                        ((ByteBuffer) this.zza.get()).limit(((ByteBuffer) this.zza.get()).limit() + 16);
                        zzheoVar.zza((ByteBuffer) this.zza.get());
                        bArr = new byte[16];
                        for (int position = ((ByteBuffer) this.zza.get()).position() - 16; position < ((ByteBuffer) this.zza.get()).position(); position++) {
                            bArr[position - (((ByteBuffer) this.zza.get()).position() - 16)] = ((ByteBuffer) this.zza.get()).get(position);
                        }
                        j10 -= 16;
                    }
                    long j11 = j10;
                    if (zzaqvVar instanceof zzaqu) {
                        str = ((zzaqu) zzaqvVar).zza();
                    } else {
                        str = "";
                    }
                    zzaqu zza2 = zza(str2, bArr, str);
                    ((ByteBuffer) this.zza.get()).rewind();
                    zza2.zzb(zzheoVar, (ByteBuffer) this.zza.get(), j11, this);
                    return zza2;
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException(e10);
                }
            }
        } while (zza >= 0);
        zzheoVar.zze(zzb2);
        throw new EOFException();
    }
}
