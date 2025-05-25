package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcbo implements AudioManager.OnAudioFocusChangeListener {
    private final AudioManager zza;
    private final zzcbn zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private float zzf = 1.0f;

    public zzcbo(Context context, zzcbn zzcbnVar) {
        this.zza = (AudioManager) context.getSystemService("audio");
        this.zzb = zzcbnVar;
    }

    private final void zzf() {
        boolean z10 = false;
        if (this.zzd && !this.zze && this.zzf > 0.0f) {
            if (!this.zzc) {
                AudioManager audioManager = this.zza;
                if (audioManager != null) {
                    if (audioManager.requestAudioFocus(this, 3, 2) == 1) {
                        z10 = true;
                    }
                    this.zzc = z10;
                }
                this.zzb.zzn();
            }
        } else if (this.zzc) {
            AudioManager audioManager2 = this.zza;
            if (audioManager2 != null) {
                if (audioManager2.abandonAudioFocus(this) == 0) {
                    z10 = true;
                }
                this.zzc = z10;
            }
            this.zzb.zzn();
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzc = z10;
        this.zzb.zzn();
    }

    public final float zza() {
        float f10;
        if (this.zze) {
            f10 = 0.0f;
        } else {
            f10 = this.zzf;
        }
        if (!this.zzc) {
            return 0.0f;
        }
        return f10;
    }

    public final void zzb() {
        this.zzd = true;
        zzf();
    }

    public final void zzc() {
        this.zzd = false;
        zzf();
    }

    public final void zzd(boolean z10) {
        this.zze = z10;
        zzf();
    }

    public final void zze(float f10) {
        this.zzf = f10;
        zzf();
    }
}
