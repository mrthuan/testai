package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzhaz {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzhay zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0136  */
    static {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhaz.<clinit>():void");
    }

    private zzhaz() {
    }

    public static boolean zzA() {
        return zzh;
    }

    public static boolean zzB() {
        return zzg;
    }

    private static int zzC(Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzD(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzE() {
        int i10 = zzgvz.zza;
        Field zzF = zzF(Buffer.class, "effectiveDirectAddress");
        if (zzF == null) {
            Field zzF2 = zzF(Buffer.class, "address");
            if (zzF2 != null && zzF2.getType() == Long.TYPE) {
                return zzF2;
            }
            return null;
        }
        return zzF;
    }

    private static Field zzF(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzG(Object obj, long j10, byte b10) {
        zzhay zzhayVar = zzf;
        long j11 = (-4) & j10;
        int i10 = zzhayVar.zza.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        zzhayVar.zza.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(FunctionEval.FunctionID.EXTERNAL_FUNC << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzH(Object obj, long j10, byte b10) {
        zzhay zzhayVar = zzf;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        zzhayVar.zza.putInt(obj, j11, ((255 & b10) << i10) | (zzhayVar.zza.getInt(obj, j11) & (~(FunctionEval.FunctionID.EXTERNAL_FUNC << i10))));
    }

    public static byte zza(long j10) {
        return zzf.zza(j10);
    }

    public static double zzb(Object obj, long j10) {
        return zzf.zzb(obj, j10);
    }

    public static float zzc(Object obj, long j10) {
        return zzf.zzc(obj, j10);
    }

    public static int zzd(Object obj, long j10) {
        return zzf.zza.getInt(obj, j10);
    }

    public static long zze(ByteBuffer byteBuffer) {
        zzhay zzhayVar = zzf;
        return zzhayVar.zza.getLong(byteBuffer, zzi);
    }

    public static long zzf(Object obj, long j10) {
        return zzf.zza.getLong(obj, j10);
    }

    public static Object zzg(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static Object zzh(Object obj, long j10) {
        return zzf.zza.getObject(obj, j10);
    }

    public static Unsafe zzi() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzhav());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void zzj(Throwable th2) {
        Logger.getLogger(zzhaz.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    public static void zzo(long j10, byte[] bArr, long j11, long j12) {
        zzf.zzd(j10, bArr, j11, j12);
    }

    public static void zzp(Object obj, long j10, boolean z10) {
        zzf.zze(obj, j10, z10);
    }

    public static void zzq(byte[] bArr, long j10, byte b10) {
        zzf.zzf(bArr, zza + j10, b10);
    }

    public static void zzr(Object obj, long j10, double d10) {
        zzf.zzg(obj, j10, d10);
    }

    public static void zzs(Object obj, long j10, float f10) {
        zzf.zzh(obj, j10, f10);
    }

    public static void zzt(Object obj, long j10, int i10) {
        zzf.zza.putInt(obj, j10, i10);
    }

    public static void zzu(Object obj, long j10, long j11) {
        zzf.zza.putLong(obj, j10, j11);
    }

    public static void zzv(Object obj, long j10, Object obj2) {
        zzf.zza.putObject(obj, j10, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean zzw(Object obj, long j10) {
        if (((byte) ((zzf.zza.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & FunctionEval.FunctionID.EXTERNAL_FUNC)) != 0) {
            return true;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ boolean zzx(Object obj, long j10) {
        if (((byte) ((zzf.zza.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & FunctionEval.FunctionID.EXTERNAL_FUNC)) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean zzy(Class cls) {
        int i10 = zzgvz.zza;
        try {
            Class cls2 = zzd;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean zzz(Object obj, long j10) {
        return zzf.zzi(obj, j10);
    }
}
