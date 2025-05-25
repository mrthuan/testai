package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzpy {
    public static void zza(AudioTrack audioTrack, zzon zzonVar) {
        AudioDeviceInfo audioDeviceInfo;
        if (zzonVar == null) {
            audioDeviceInfo = null;
        } else {
            audioDeviceInfo = zzonVar.zza;
        }
        audioTrack.setPreferredDevice(audioDeviceInfo);
    }
}
