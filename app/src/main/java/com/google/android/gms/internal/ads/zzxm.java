package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzxm {
    private final Spatializer zza;
    private final boolean zzb;
    private Handler zzc;
    private Spatializer$OnSpatializerStateChangedListener zzd;

    private zzxm(Spatializer spatializer) {
        int immersiveAudioLevel;
        boolean z10;
        this.zza = spatializer;
        immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
        if (immersiveAudioLevel != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzb = z10;
    }

    public static zzxm zza(Context context) {
        Spatializer spatializer;
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            spatializer = audioManager.getSpatializer();
            return new zzxm(spatializer);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.zzxk] */
    public final void zzb(zzxt zzxtVar, Looper looper) {
        if (this.zzd == null && this.zzc == null) {
            this.zzd = new zzxl(this, zzxtVar);
            final Handler handler = new Handler(looper);
            this.zzc = handler;
            this.zza.addOnSpatializerStateChangedListener(new Executor() { // from class: com.google.android.gms.internal.ads.zzxk
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.zzd);
        }
    }

    public final void zzc() {
        Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = this.zzd;
        if (spatializer$OnSpatializerStateChangedListener != null && this.zzc != null) {
            this.zza.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
            Handler handler = this.zzc;
            int i10 = zzet.zza;
            handler.removeCallbacksAndMessages(null);
            this.zzc = null;
            this.zzd = null;
        }
    }

    public final boolean zzd(zzh zzhVar, zzaf zzafVar) {
        int i10;
        boolean canBeSpatialized;
        if ("audio/eac3-joc".equals(zzafVar.zzm) && zzafVar.zzz == 16) {
            i10 = 12;
        } else {
            i10 = zzafVar.zzz;
        }
        int zzh = zzet.zzh(i10);
        if (zzh == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(zzh);
        int i11 = zzafVar.zzA;
        if (i11 != -1) {
            channelMask.setSampleRate(i11);
        }
        canBeSpatialized = this.zza.canBeSpatialized(zzhVar.zza().zza, channelMask.build());
        return canBeSpatialized;
    }

    public final boolean zze() {
        boolean isAvailable;
        isAvailable = this.zza.isAvailable();
        return isAvailable;
    }

    public final boolean zzf() {
        boolean isEnabled;
        isEnabled = this.zza.isEnabled();
        return isEnabled;
    }

    public final boolean zzg() {
        return this.zzb;
    }
}
