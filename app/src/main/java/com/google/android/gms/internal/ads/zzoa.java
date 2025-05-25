package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzoa {
    public static boolean zza(AudioManager audioManager, zzon zzonVar) {
        AudioDeviceInfo[] audioDeviceInfoArr;
        if (zzonVar == null) {
            audioManager.getClass();
            audioDeviceInfoArr = audioManager.getDevices(2);
        } else {
            audioDeviceInfoArr = new AudioDeviceInfo[]{zzonVar.zza};
        }
        zzfxw<Integer> zzb = zzb();
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            if (zzb.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return true;
            }
        }
        return false;
    }

    private static zzfxw<Integer> zzb() {
        zzfxv zzfxvVar = new zzfxv();
        zzfxvVar.zzg(8, 7);
        int i10 = zzet.zza;
        if (i10 >= 31) {
            zzfxvVar.zzg(26, 27);
        }
        if (i10 >= 33) {
            zzfxvVar.zzf((Object) 30);
        }
        return zzfxvVar.zzi();
    }
}
