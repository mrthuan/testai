package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzhj implements AudioManager.OnAudioFocusChangeListener {
    final /* synthetic */ zzhl zza;
    private final Handler zzb;

    public zzhj(zzhl zzhlVar, Handler handler) {
        this.zza = zzhlVar;
        this.zzb = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i10) {
        this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzhi
            @Override // java.lang.Runnable
            public final void run() {
                zzhl.zzc(zzhj.this.zza, i10);
            }
        });
    }
}
