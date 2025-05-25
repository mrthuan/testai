package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioRouting$OnRoutingChangedListener;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzqh {
    private final AudioTrack zza;
    private final zzom zzb;
    private AudioRouting$OnRoutingChangedListener zzc = new AudioRouting$OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.zzqg
        public final void onRoutingChanged(AudioRouting audioRouting) {
            zzqh.this.zzc(audioRouting);
        }
    };

    public zzqh(AudioTrack audioTrack, zzom zzomVar) {
        this.zza = audioTrack;
        this.zzb = zzomVar;
        audioTrack.addOnRoutingChangedListener(this.zzc, new Handler(Looper.myLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zzc(AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice;
        AudioDeviceInfo routedDevice2;
        if (this.zzc != null) {
            routedDevice = audioRouting.getRoutedDevice();
            if (routedDevice != null) {
                zzom zzomVar = this.zzb;
                routedDevice2 = audioRouting.getRoutedDevice();
                zzomVar.zzh(routedDevice2);
            }
        }
    }

    public void zzb() {
        AudioRouting$OnRoutingChangedListener audioRouting$OnRoutingChangedListener = this.zzc;
        audioRouting$OnRoutingChangedListener.getClass();
        this.zza.removeOnRoutingChangedListener(audioRouting$OnRoutingChangedListener);
        this.zzc = null;
    }
}
