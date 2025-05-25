package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzheu {
    public static zzheu zzb(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new zzhep(cls.getSimpleName());
        }
        return new zzher(cls.getSimpleName());
    }

    public abstract void zza(String str);
}
