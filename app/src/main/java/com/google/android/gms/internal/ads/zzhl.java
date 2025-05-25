package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzhl {
    private final AudioManager zza;
    private final zzhj zzb;
    private zzhk zzc;
    private int zzd;
    private float zze = 1.0f;

    public zzhl(Context context, Handler handler, zzhk zzhkVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.zza = audioManager;
        this.zzc = zzhkVar;
        this.zzb = new zzhj(this, handler);
        this.zzd = 0;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzhl zzhlVar, int i10) {
        if (i10 != -3 && i10 != -2) {
            if (i10 != -1) {
                if (i10 != 1) {
                    a0.d.i("Unknown focus change type: ", i10, "AudioFocusManager");
                    return;
                }
                zzhlVar.zzg(1);
                zzhlVar.zzf(1);
                return;
            }
            zzhlVar.zzf(-1);
            zzhlVar.zze();
        } else if (i10 != -2) {
            zzhlVar.zzg(3);
        } else {
            zzhlVar.zzf(0);
            zzhlVar.zzg(2);
        }
    }

    private final void zze() {
        if (this.zzd == 0) {
            return;
        }
        if (zzet.zza < 26) {
            this.zza.abandonAudioFocus(this.zzb);
        }
        zzg(0);
    }

    private final void zzf(int i10) {
        int zzS;
        zzhk zzhkVar = this.zzc;
        if (zzhkVar != null) {
            zzji zzjiVar = (zzji) zzhkVar;
            boolean zzu = zzjiVar.zza.zzu();
            zzS = zzjm.zzS(zzu, i10);
            zzjiVar.zza.zzaf(zzu, i10, zzS);
        }
    }

    private final void zzg(int i10) {
        float f10;
        if (this.zzd != i10) {
            this.zzd = i10;
            if (i10 == 3) {
                f10 = 0.2f;
            } else {
                f10 = 1.0f;
            }
            if (this.zze != f10) {
                this.zze = f10;
                zzhk zzhkVar = this.zzc;
                if (zzhkVar != null) {
                    ((zzji) zzhkVar).zza.zzac();
                }
            }
        }
    }

    public final float zza() {
        return this.zze;
    }

    public final int zzb(boolean z10, int i10) {
        zze();
        if (z10) {
            return 1;
        }
        return -1;
    }

    public final void zzd() {
        this.zzc = null;
        zze();
    }
}
