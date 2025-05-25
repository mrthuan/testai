package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzob {
    public static int zza(int i10, int i11, zzh zzhVar) {
        boolean isDirectPlaybackSupported;
        for (int i12 = 10; i12 > 0; i12--) {
            int zzh = zzet.zzh(i12);
            if (zzh != 0) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(zzh).build(), zzhVar.zza().zza);
                if (isDirectPlaybackSupported) {
                    return i12;
                }
            }
        }
        return 0;
    }

    public static zzfxr<Integer> zzb(zzh zzhVar) {
        boolean isDirectPlaybackSupported;
        zzfxo zzfxoVar = new zzfxo();
        zzfzx it = zzof.zzb.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (zzet.zza >= zzet.zzg(intValue)) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), zzhVar.zza().zza);
                if (isDirectPlaybackSupported) {
                    zzfxoVar.zzf(Integer.valueOf(intValue));
                }
            }
        }
        zzfxoVar.zzf((Object) 2);
        return zzfxoVar.zzi();
    }
}
