package com.google.android.gms.internal.play_billing;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public abstract class zzby extends zzbf {
    private static final Logger zzb = Logger.getLogger(zzby.class.getName());
    private static final boolean zzc = zzfp.zzx();
    zzbz zza;

    private zzby() {
        throw null;
    }

    public /* synthetic */ zzby(zzbx zzbxVar) {
    }

    @Deprecated
    public static int zzt(int i10, zzec zzecVar, zzeo zzeoVar) {
        int zzw = zzw(i10 << 3);
        return ((zzay) zzecVar).zza(zzeoVar) + zzw + zzw;
    }

    public static int zzu(zzec zzecVar, zzeo zzeoVar) {
        int zza = ((zzay) zzecVar).zza(zzeoVar);
        return zzw(zza) + zza;
    }

    public static int zzv(String str) {
        int length;
        try {
            length = zzfu.zzc(str);
        } catch (zzft unused) {
            length = str.getBytes(zzda.zzb).length;
        }
        return zzw(length) + length;
    }

    public static int zzw(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int zzx(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static zzby zzy(byte[] bArr, int i10, int i11) {
        return new zzbv(bArr, 0, i11);
    }

    public final void zzA(String str, zzft zzftVar) {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzftVar);
        byte[] bytes = str.getBytes(zzda.zzb);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzbw(e10);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b10);

    public abstract void zzd(int i10, boolean z10);

    public abstract void zze(int i10, zzbq zzbqVar);

    public abstract void zzf(int i10, int i11);

    public abstract void zzg(int i10);

    public abstract void zzh(int i10, long j10);

    public abstract void zzi(long j10);

    public abstract void zzj(int i10, int i11);

    public abstract void zzk(int i10);

    public abstract void zzl(byte[] bArr, int i10, int i11);

    public abstract void zzm(int i10, String str);

    public abstract void zzo(int i10, int i11);

    public abstract void zzp(int i10, int i11);

    public abstract void zzq(int i10);

    public abstract void zzr(int i10, long j10);

    public abstract void zzs(long j10);

    public final void zzz() {
        if (zza() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }
}
