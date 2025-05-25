package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeps implements zzevo {
    private final zzgcu zza;
    private final Context zzb;

    public zzeps(zzgcu zzgcuVar, Context context) {
        this.zza = zzgcuVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 13;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeps.this.zzc();
            }
        });
    }

    public final zzept zzc() {
        int i10;
        int i11;
        AudioManager audioManager = (AudioManager) this.zzb.getSystemService("audio");
        int mode = audioManager.getMode();
        boolean isMusicActive = audioManager.isMusicActive();
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzka)).booleanValue()) {
            i10 = com.google.android.gms.ads.internal.zzu.B.f10555e.f(audioManager);
            i11 = audioManager.getStreamMaxVolume(3);
        } else {
            i10 = -1;
            i11 = -1;
        }
        int ringerMode = audioManager.getRingerMode();
        int streamVolume2 = audioManager.getStreamVolume(2);
        com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
        return new zzept(mode, isMusicActive, isSpeakerphoneOn, streamVolume, i10, i11, ringerMode, streamVolume2, zzuVar.f10558h.a(), zzuVar.f10558h.d());
    }
}
