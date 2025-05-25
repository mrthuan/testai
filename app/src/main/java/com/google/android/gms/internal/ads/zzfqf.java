package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.AdError;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfqf {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfqg zzc;
    private final zzfoh zzd;
    private final zzfoc zze;
    private zzfpu zzf;
    private final Object zzg = new Object();

    public zzfqf(Context context, zzfqg zzfqgVar, zzfoh zzfohVar, zzfoc zzfocVar) {
        this.zzb = context;
        this.zzc = zzfqgVar;
        this.zzd = zzfohVar;
        this.zze = zzfocVar;
    }

    private final synchronized Class zzd(zzfpv zzfpvVar) {
        String zzk = zzfpvVar.zza().zzk();
        HashMap hashMap = zza;
        Class cls = (Class) hashMap.get(zzk);
        if (cls != null) {
            return cls;
        }
        try {
            if (this.zze.zza(zzfpvVar.zzc())) {
                try {
                    File zzb = zzfpvVar.zzb();
                    if (!zzb.exists()) {
                        zzb.mkdirs();
                    }
                    Class<?> loadClass = new DexClassLoader(zzfpvVar.zzc().getAbsolutePath(), zzb.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    hashMap.put(zzk, loadClass);
                    return loadClass;
                } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e10) {
                    throw new zzfqe((int) AdError.REMOTE_ADS_SERVICE_ERROR, e10);
                }
            }
            throw new zzfqe(2026, "VM did not pass signature verification");
        } catch (GeneralSecurityException e11) {
            throw new zzfqe(2026, e11);
        }
    }

    public final zzfok zza() {
        zzfpu zzfpuVar;
        synchronized (this.zzg) {
            zzfpuVar = this.zzf;
        }
        return zzfpuVar;
    }

    public final zzfpv zzb() {
        synchronized (this.zzg) {
            zzfpu zzfpuVar = this.zzf;
            if (zzfpuVar != null) {
                return zzfpuVar.zzf();
            }
            return null;
        }
    }

    public final boolean zzc(zzfpv zzfpvVar) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfpu zzfpuVar = new zzfpu(zzd(zzfpvVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfpvVar.zze(), null, new Bundle(), 2), zzfpvVar, this.zzc, this.zzd);
                if (zzfpuVar.zzh()) {
                    int zze = zzfpuVar.zze();
                    if (zze == 0) {
                        synchronized (this.zzg) {
                            zzfpu zzfpuVar2 = this.zzf;
                            if (zzfpuVar2 != null) {
                                try {
                                    zzfpuVar2.zzg();
                                } catch (zzfqe e10) {
                                    this.zzd.zzc(e10.zza(), -1L, e10);
                                }
                            }
                            this.zzf = zzfpuVar;
                        }
                        this.zzd.zzd(3000, System.currentTimeMillis() - currentTimeMillis);
                        return true;
                    }
                    throw new zzfqe(4001, "ci: " + zze);
                }
                throw new zzfqe(4000, "init failed");
            } catch (Exception e11) {
                throw new zzfqe((int) AdError.INTERNAL_ERROR_2004, e11);
            }
        } catch (zzfqe e12) {
            this.zzd.zzc(e12.zza(), System.currentTimeMillis() - currentTimeMillis, e12);
            return false;
        } catch (Exception e13) {
            this.zzd.zzc(4010, System.currentTimeMillis() - currentTimeMillis, e13);
            return false;
        }
    }
}
