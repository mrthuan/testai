package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzfsb;
import com.google.android.gms.internal.ads.zzfsc;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzad {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.os.Bundle a(android.content.Context r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzad.a(android.content.Context, java.lang.String):android.os.Bundle");
    }

    public static void b(Context context) {
        zzbbn zzbbnVar = zzbbw.zzfB;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            zzfsb zzj = zzfsb.zzj(context);
            zzfsc zzi = zzfsc.zzi(context);
            zzj.zzk();
            zzj.zzl();
            zzi.zzj();
            if (((Boolean) zzbaVar.c.zza(zzbbw.zzcJ)).booleanValue()) {
                zzi.zzk();
            }
            if (((Boolean) zzbaVar.c.zza(zzbbw.zzcK)).booleanValue()) {
                zzi.zzl();
            }
        } catch (IOException e10) {
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "clearStorageOnIdlessMode");
        }
    }
}
