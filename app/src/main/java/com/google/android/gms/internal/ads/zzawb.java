package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzawb extends zzaxd {
    public zzawb(zzavp zzavpVar, String str, String str2, zzaro zzaroVar, int i10, int i11) {
        super(zzavpVar, "d7YRusR2mxxBt1bBYjK2gXVvJl/MfqFw2IiZZVeFOFqksQBErGXLOKgf56kYtWpK", "q4VBjxb/Ij/RcUKEcmQK+TpC64QFNLpq6sfIawaWN1g=", zzaroVar, i10, 49);
    }

    @Override // com.google.android.gms.internal.ads.zzaxd
    public final void zza() {
        this.zzd.zzaa(3);
        try {
            int i10 = 1;
            boolean booleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
            zzaro zzaroVar = this.zzd;
            if (true == booleanValue) {
                i10 = 2;
            }
            zzaroVar.zzaa(i10);
        } catch (InvocationTargetException e10) {
            if (e10.getTargetException() instanceof Settings.SettingNotFoundException) {
                return;
            }
            throw e10;
        }
    }
}
