package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzgr extends zzlb implements zzmj {
    private static final zzgr zza;
    private int zzd;
    private String zze = "";
    private zzli zzf = zzlb.zzbH();

    static {
        zzgr zzgrVar = new zzgr();
        zza = zzgrVar;
        zzlb.zzbO(zzgr.class, zzgrVar);
    }

    private zzgr() {
    }

    public final String zzb() {
        return this.zze;
    }

    public final List zzc() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzgq(null);
                }
                return new zzgr();
            }
            return zzlb.zzbL(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzd", "zze", "zzf", zzgy.class});
        }
        return (byte) 1;
    }
}
