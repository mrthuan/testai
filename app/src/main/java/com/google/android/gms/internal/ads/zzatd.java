package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.hssf.record.UnknownRecord;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzatd {
    static boolean zza = false;
    public static final /* synthetic */ int zzc = 0;
    private static MessageDigest zzd;
    private static final Object zze = new Object();
    private static final Object zzf = new Object();
    static final CountDownLatch zzb = new CountDownLatch(1);

    public static String zza(byte[] bArr, String str) {
        byte[] zzg;
        Vector zzb2 = zzb(bArr, FunctionEval.FunctionID.EXTERNAL_FUNC);
        if (zzb2 != null && !zzb2.isEmpty()) {
            zzasv zza2 = zzasw.zza();
            int size = zzb2.size();
            for (int i10 = 0; i10 < size; i10++) {
                zza2.zza(zzgwm.zzv(zzg((byte[]) zzb2.get(i10), str, false), 0, 256));
            }
            byte[] zze2 = zze(bArr);
            zzgwm zzgwmVar = zzgwm.zzb;
            zza2.zzb(zzgwm.zzv(zze2, 0, zze2.length));
            zzg = ((zzasw) zza2.zzbr()).zzaV();
        } else {
            zzg = zzg(zzf(4096).zzaV(), str, true);
        }
        return zzasz.zza(zzg, true);
    }

    public static Vector zzb(byte[] bArr, int i10) {
        int length = bArr.length;
        if (length <= 0) {
            return null;
        }
        int i11 = length + 254;
        Vector vector = new Vector();
        for (int i12 = 0; i12 < i11 / FunctionEval.FunctionID.EXTERNAL_FUNC; i12++) {
            int i13 = i12 * FunctionEval.FunctionID.EXTERNAL_FUNC;
            try {
                int length2 = bArr.length;
                if (length2 - i13 > 255) {
                    length2 = i13 + FunctionEval.FunctionID.EXTERNAL_FUNC;
                }
                vector.add(Arrays.copyOfRange(bArr, i13, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    public static void zzd() {
        synchronized (zzf) {
            if (!zza) {
                zza = true;
                new Thread(new zzatc(null)).start();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x001c, code lost:
        r1.reset();
        r1.update(r6);
        r6 = com.google.android.gms.internal.ads.zzatd.zzd.digest();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] zze(byte[] r6) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzatd.zze
            monitor-enter(r0)
            zzd()     // Catch: java.lang.Throwable -> L32
            r1 = 0
            java.util.concurrent.CountDownLatch r2 = com.google.android.gms.internal.ads.zzatd.zzb     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L32
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L32
            r4 = 2
            boolean r2 = r2.await(r4, r3)     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L32
            if (r2 != 0) goto L14
            goto L1a
        L14:
            java.security.MessageDigest r2 = com.google.android.gms.internal.ads.zzatd.zzd     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L19
            goto L1a
        L19:
            r1 = r2
        L1a:
            if (r1 == 0) goto L2a
            r1.reset()     // Catch: java.lang.Throwable -> L32
            r1.update(r6)     // Catch: java.lang.Throwable -> L32
            java.security.MessageDigest r6 = com.google.android.gms.internal.ads.zzatd.zzd     // Catch: java.lang.Throwable -> L32
            byte[] r6 = r6.digest()     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r6
        L2a:
            java.security.NoSuchAlgorithmException r6 = new java.security.NoSuchAlgorithmException     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "Cannot compute hash"
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L32
            throw r6     // Catch: java.lang.Throwable -> L32
        L32:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzatd.zze(byte[]):byte[]");
    }

    public static zzasj zzf(int i10) {
        zzaro zza2 = zzasj.zza();
        zza2.zzD(4096L);
        return (zzasj) zza2.zzbr();
    }

    private static byte[] zzg(byte[] bArr, String str, boolean z10) {
        int i10;
        byte[] array;
        int length = bArr.length;
        if (true != z10) {
            i10 = FunctionEval.FunctionID.EXTERNAL_FUNC;
        } else {
            i10 = UnknownRecord.PHONETICPR_00EF;
        }
        if (length > i10) {
            bArr = zzf(4096).zzaV();
        }
        int i11 = i10 + 1;
        int length2 = bArr.length;
        byte b10 = (byte) length2;
        if (length2 < i10) {
            byte[] bArr2 = new byte[i10 - length2];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(i11).put(b10).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(i11).put(b10).put(bArr).array();
        }
        if (z10) {
            array = ByteBuffer.allocate(256).put(zze(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        zzate[] zzateVarArr = new zzaud().zzcG;
        int length3 = zzateVarArr.length;
        for (int i12 = 0; i12 < 12; i12++) {
            zzateVarArr[i12].zza(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzasx(str.getBytes("UTF-8")).zza(bArr3);
        }
        return bArr3;
    }
}
