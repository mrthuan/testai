package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzgwm implements Iterable<Byte>, Serializable {
    public static final zzgwm zzb = new zzgwk(zzgyl.zzb);
    private int zza = 0;

    static {
        int i10 = zzgvz.zza;
    }

    private static zzgwm zzc(Iterator it, int i10) {
        if (i10 > 0) {
            if (i10 == 1) {
                return (zzgwm) it.next();
            }
            int i11 = i10 >>> 1;
            zzgwm zzc = zzc(it, i11);
            zzgwm zzc2 = zzc(it, i10 - i11);
            if (Api.BaseClientBuilder.API_PRIORITY_OTHER - zzc.zzd() >= zzc2.zzd()) {
                return zzhad.zzC(zzc, zzc2);
            }
            throw new IllegalArgumentException(a0.d.b("ByteString would be too long: ", zzc.zzd(), "+", zzc2.zzd()));
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i10)));
    }

    public static int zzq(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) < 0) {
            if (i10 >= 0) {
                if (i11 < i10) {
                    throw new IndexOutOfBoundsException(a0.d.b("Beginning index larger than ending index: ", i10, ", ", i11));
                }
                throw new IndexOutOfBoundsException(a0.d.b("End index: ", i11, " >= ", i12));
            }
            throw new IndexOutOfBoundsException(a0.a.g("Beginning index: ", i10, " < 0"));
        }
        return i13;
    }

    public static zzgwl zzt() {
        return new zzgwl(128);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzgwm zzu(Iterable iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = iterable.size();
        }
        if (size == 0) {
            return zzb;
        }
        return zzc(iterable.iterator(), size);
    }

    public static zzgwm zzv(byte[] bArr, int i10, int i11) {
        zzq(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new zzgwk(bArr2);
    }

    public static zzgwm zzw(String str) {
        return new zzgwk(str.getBytes(zzgyl.zza));
    }

    public static void zzy(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException(b.a.c("Index < 0: ", i10));
            }
            throw new ArrayIndexOutOfBoundsException(a0.d.b("Index > length: ", i10, ", ", i11));
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.zza;
        if (i10 == 0) {
            int zzd = zzd();
            i10 = zzi(zzd, 0, zzd);
            if (i10 == 0) {
                i10 = 1;
            }
            this.zza = i10;
        }
        return i10;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        if (zzd() <= 50) {
            concat = zzhaq.zza(this);
        } else {
            concat = zzhaq.zza(zzk(0, 47)).concat("...");
        }
        objArr[2] = concat;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public final byte[] zzA() {
        int zzd = zzd();
        if (zzd == 0) {
            return zzgyl.zzb;
        }
        byte[] bArr = new byte[zzd];
        zze(bArr, 0, 0, zzd);
        return bArr;
    }

    public abstract byte zza(int i10);

    public abstract byte zzb(int i10);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i10, int i11, int i12);

    public abstract int zzf();

    public abstract boolean zzh();

    public abstract int zzi(int i10, int i11, int i12);

    public abstract int zzj(int i10, int i11, int i12);

    public abstract zzgwm zzk(int i10, int i11);

    public abstract zzgww zzl();

    public abstract String zzm(Charset charset);

    public abstract ByteBuffer zzn();

    public abstract void zzo(zzgwd zzgwdVar);

    public abstract boolean zzp();

    public final int zzr() {
        return this.zza;
    }

    @Override // java.lang.Iterable
    /* renamed from: zzs */
    public zzgwh iterator() {
        return new zzgwe(this);
    }

    public final String zzx() {
        Charset charset = zzgyl.zza;
        if (zzd() == 0) {
            return "";
        }
        return zzm(charset);
    }

    @Deprecated
    public final void zzz(byte[] bArr, int i10, int i11, int i12) {
        zzq(0, i12, zzd());
        zzq(i11, i11 + i12, bArr.length);
        if (i12 > 0) {
            zze(bArr, 0, i11, i12);
        }
    }
}
