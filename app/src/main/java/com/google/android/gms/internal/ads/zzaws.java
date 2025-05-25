package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaws extends zzaxd {
    public zzaws(zzavp zzavpVar, String str, String str2, zzaro zzaroVar, int i10, int i11) {
        super(zzavpVar, "0njjbCFUq6vJ1UgnErUI7KEtLgZLN7V9IJ5yZ3QtzXmjMaTjzKInpeDNakYTgh0P", "C8NIMy/t/HZjKrbJt0Xe/Cv+czK1jvEhHHQsIVfXSJE=", zzaroVar, i10, 73);
    }

    @Override // com.google.android.gms.internal.ads.zzaxd
    public final void zza() {
        try {
            int i10 = 1;
            boolean booleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
            zzaro zzaroVar = this.zzd;
            if (true == booleanValue) {
                i10 = 2;
            }
            zzaroVar.zzaf(i10);
        } catch (InvocationTargetException unused) {
            this.zzd.zzaf(3);
        }
    }
}
