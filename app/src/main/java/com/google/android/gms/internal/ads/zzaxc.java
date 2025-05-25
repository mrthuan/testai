package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaxc {
    private final zzavp zza;
    private final String zzb;
    private final String zzc;
    private final Class[] zze;
    private volatile Method zzd = null;
    private final CountDownLatch zzf = new CountDownLatch(1);

    public zzaxc(zzavp zzavpVar, String str, String str2, Class... clsArr) {
        this.zza = zzavpVar;
        this.zzb = str;
        this.zzc = str2;
        this.zze = clsArr;
        zzavpVar.zzk().submit(new zzaxb(this));
    }

    public static /* bridge */ /* synthetic */ void zzb(zzaxc zzaxcVar) {
        try {
            zzavp zzavpVar = zzaxcVar.zza;
            Class<?> loadClass = zzavpVar.zzi().loadClass(zzaxcVar.zzc(zzavpVar.zzu(), zzaxcVar.zzb));
            if (loadClass != null) {
                zzaxcVar.zzd = loadClass.getMethod(zzaxcVar.zzc(zzaxcVar.zza.zzu(), zzaxcVar.zzc), zzaxcVar.zze);
            }
        } catch (zzaut | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th2) {
            zzaxcVar.zzf.countDown();
            throw th2;
        }
        zzaxcVar.zzf.countDown();
    }

    private final String zzc(byte[] bArr, String str) {
        return new String(this.zza.zze().zzb(bArr, str), "UTF-8");
    }

    public final Method zza() {
        if (this.zzd != null) {
            return this.zzd;
        }
        try {
            if (!this.zzf.await(2L, TimeUnit.SECONDS)) {
                return null;
            }
            return this.zzd;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
