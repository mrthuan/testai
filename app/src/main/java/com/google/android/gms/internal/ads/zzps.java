package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzps {
    public static zzoq zza(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
        int playbackOffloadSupport;
        playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return zzoq.zza;
        }
        zzoo zzooVar = new zzoo();
        boolean z11 = false;
        if (zzet.zza > 32 && playbackOffloadSupport == 2) {
            z11 = true;
        }
        zzooVar.zza(true);
        zzooVar.zzb(z11);
        zzooVar.zzc(z10);
        return zzooVar.zzd();
    }
}
