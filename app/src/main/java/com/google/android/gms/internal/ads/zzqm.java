package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzqm extends AudioTrack$StreamEventCallback {
    final /* synthetic */ zzqn zza;

    public zzqm(zzqn zzqnVar, zzqp zzqpVar) {
        this.zza = zzqnVar;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        audioTrack.equals(zzqp.zzD(this.zza.zza));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (!audioTrack.equals(zzqp.zzD(this.zza.zza))) {
            return;
        }
        zzqp.zzG(this.zza.zza, true);
    }

    public final void onTearDown(AudioTrack audioTrack) {
        audioTrack.equals(zzqp.zzD(this.zza.zza));
    }
}
