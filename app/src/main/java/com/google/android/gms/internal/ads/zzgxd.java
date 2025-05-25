package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzgxd extends zzgwd {
    private static final Logger zza = Logger.getLogger(zzgxd.class.getName());
    private static final boolean zzb = zzhaz.zzA();
    public static final /* synthetic */ int zzf = 0;
    zzgxe zze;

    private zzgxd() {
        throw null;
    }

    public /* synthetic */ zzgxd(zzgxc zzgxcVar) {
    }

    public static int zzA(zzgzj zzgzjVar, zzhae zzhaeVar) {
        int zzaM = ((zzgvv) zzgzjVar).zzaM(zzhaeVar);
        return zzD(zzaM) + zzaM;
    }

    public static int zzB(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int zzC(String str) {
        int length;
        try {
            length = zzhbe.zze(str);
        } catch (zzhbd unused) {
            length = str.getBytes(zzgyl.zza).length;
        }
        return zzD(length) + length;
    }

    public static int zzD(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int zzE(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static zzgxd zzF(byte[] bArr, int i10, int i11) {
        return new zzgwz(bArr, 0, i11);
    }

    @Deprecated
    public static int zzy(int i10, zzgzj zzgzjVar, zzhae zzhaeVar) {
        int zzD = zzD(i10 << 3);
        return ((zzgvv) zzgzjVar).zzaM(zzhaeVar) + zzD + zzD;
    }

    public static int zzz(zzgzj zzgzjVar) {
        int zzaY = zzgzjVar.zzaY();
        return zzD(zzaY) + zzaY;
    }

    public final void zzG() {
        if (zzb() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public final void zzH(String str, zzhbd zzhbdVar) {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzhbdVar);
        byte[] bytes = str.getBytes(zzgyl.zza);
        try {
            int length = bytes.length;
            zzu(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgxa(e10);
        }
    }

    public abstract void zzL();

    public abstract void zzM(byte b10);

    public abstract void zzN(int i10, boolean z10);

    public abstract void zzO(int i10, zzgwm zzgwmVar);

    @Override // com.google.android.gms.internal.ads.zzgwd
    public abstract void zza(byte[] bArr, int i10, int i11);

    public abstract int zzb();

    public abstract void zzh(int i10, int i11);

    public abstract void zzi(int i10);

    public abstract void zzj(int i10, long j10);

    public abstract void zzk(long j10);

    public abstract void zzl(int i10, int i11);

    public abstract void zzm(int i10);

    public abstract void zzn(int i10, zzgzj zzgzjVar, zzhae zzhaeVar);

    public abstract void zzo(int i10, zzgzj zzgzjVar);

    public abstract void zzp(int i10, zzgwm zzgwmVar);

    public abstract void zzq(int i10, String str);

    public abstract void zzs(int i10, int i11);

    public abstract void zzt(int i10, int i11);

    public abstract void zzu(int i10);

    public abstract void zzv(int i10, long j10);

    public abstract void zzw(long j10);
}
