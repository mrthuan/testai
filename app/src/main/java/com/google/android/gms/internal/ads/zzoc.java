package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzoc {
    public static zzof zza(AudioManager audioManager, zzh zzhVar) {
        List directProfilesForAttributes;
        int encapsulationType;
        int format;
        int[] channelMasks;
        int[] channelMasks2;
        directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(zzhVar.zza().zza);
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(zzgap.zzg(12)));
        for (int i10 = 0; i10 < directProfilesForAttributes.size(); i10++) {
            AudioProfile b10 = m.b(directProfilesForAttributes.get(i10));
            encapsulationType = b10.getEncapsulationType();
            if (encapsulationType != 1) {
                format = b10.getFormat();
                if (zzet.zzK(format) || zzof.zzb.containsKey(Integer.valueOf(format))) {
                    Integer valueOf = Integer.valueOf(format);
                    if (!hashMap.containsKey(valueOf)) {
                        channelMasks = b10.getChannelMasks();
                        hashMap.put(valueOf, new HashSet(zzgap.zzg(channelMasks)));
                    } else {
                        Set set = (Set) hashMap.get(valueOf);
                        set.getClass();
                        channelMasks2 = b10.getChannelMasks();
                        set.addAll(zzgap.zzg(channelMasks2));
                    }
                }
            }
        }
        zzfxo zzfxoVar = new zzfxo();
        for (Map.Entry entry : hashMap.entrySet()) {
            zzfxoVar.zzf(new zzod(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new zzof(zzfxoVar.zzi());
    }

    public static zzon zzb(AudioManager audioManager, zzh zzhVar) {
        List audioDevicesForAttributes;
        audioManager.getClass();
        try {
            audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(zzhVar.zza().zza);
            if (!audioDevicesForAttributes.isEmpty()) {
                return new zzon((AudioDeviceInfo) audioDevicesForAttributes.get(0));
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
