package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
final class zzdy {
    private static final zzdx zza;
    private static final zzdx zzb;

    static {
        zzdx zzdxVar;
        try {
            zzdxVar = (zzdx) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzdxVar = null;
        }
        zza = zzdxVar;
        zzb = new zzdx();
    }

    public static zzdx zza() {
        return zza;
    }

    public static zzdx zzb() {
        return zzb;
    }
}
