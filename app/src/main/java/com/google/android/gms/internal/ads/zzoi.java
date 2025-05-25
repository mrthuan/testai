package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzoi extends AudioDeviceCallback {
    final /* synthetic */ zzom zza;

    public /* synthetic */ zzoi(zzom zzomVar, zzoh zzohVar) {
        this.zza = zzomVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        Context context;
        zzh zzhVar;
        zzon zzonVar;
        zzom zzomVar = this.zza;
        context = zzomVar.zza;
        zzhVar = zzomVar.zzh;
        zzonVar = zzomVar.zzg;
        this.zza.zzj(zzof.zzc(context, zzhVar, zzonVar));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        zzon zzonVar;
        Context context;
        zzh zzhVar;
        zzon zzonVar2;
        zzonVar = this.zza.zzg;
        int i10 = zzet.zza;
        int length = audioDeviceInfoArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            } else if (zzet.zzG(audioDeviceInfoArr[i11], zzonVar)) {
                this.zza.zzg = null;
                break;
            } else {
                i11++;
            }
        }
        zzom zzomVar = this.zza;
        context = zzomVar.zza;
        zzhVar = zzomVar.zzh;
        zzonVar2 = zzomVar.zzg;
        zzomVar.zzj(zzof.zzc(context, zzhVar, zzonVar2));
    }
}
