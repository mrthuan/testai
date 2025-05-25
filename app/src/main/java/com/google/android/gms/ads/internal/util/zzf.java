package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.Message;
import com.google.android.gms.internal.ads.zzbeb;
import com.google.android.gms.internal.ads.zzfru;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzf extends zzfru {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "AdMobHandler.handleMessage");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfru
    public final void zza(Message message) {
        try {
            super.zza(message);
        } catch (Throwable th2) {
            zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
            Context zzd = com.google.android.gms.ads.internal.zzu.B.f10557g.zzd();
            zzf zzfVar = zzt.f10496l;
            if (zzd != null) {
                try {
                    ((Boolean) zzbeb.zzb.zze()).booleanValue();
                } catch (IllegalStateException unused) {
                }
            }
            throw th2;
        }
    }
}
