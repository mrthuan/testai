package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfni {
    private static int zza = 2;

    public static void zza(Context context) {
        context.registerReceiver(new zzfnh(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static int zzb() {
        if (zzfne.zza() != zzflw.CTV) {
            return 2;
        }
        return zza;
    }
}
