package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.2 */
/* loaded from: classes2.dex */
final class zzme {
    private static final zzmd zza;
    private static final zzmd zzb;

    static {
        zzmd zzmdVar;
        try {
            zzmdVar = (zzmd) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzmdVar = null;
        }
        zza = zzmdVar;
        zzb = new zzmd();
    }

    public static zzmd zza() {
        return zza;
    }

    public static zzmd zzb() {
        return zzb;
    }
}
