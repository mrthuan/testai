package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzom {
    private final Context zza;
    private final Handler zzb;
    private final zzoi zzc;
    private final BroadcastReceiver zzd;
    private final zzoj zze;
    private zzof zzf;
    private zzon zzg;
    private zzh zzh;
    private boolean zzi;
    private final zzpx zzj;

    public zzom(Context context, zzpx zzpxVar, zzh zzhVar, zzon zzonVar) {
        zzoi zzoiVar;
        Context applicationContext = context.getApplicationContext();
        this.zza = applicationContext;
        this.zzj = zzpxVar;
        this.zzh = zzhVar;
        this.zzg = zzonVar;
        Handler handler = new Handler(zzet.zzy(), null);
        this.zzb = handler;
        if (zzet.zza >= 23) {
            zzoiVar = new zzoi(this, null);
        } else {
            zzoiVar = null;
        }
        this.zzc = zzoiVar;
        this.zzd = new zzol(this, null);
        Uri zza = zzof.zza();
        this.zze = zza != null ? new zzoj(this, handler, applicationContext.getContentResolver(), zza) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzj(zzof zzofVar) {
        if (this.zzi && !zzofVar.equals(this.zzf)) {
            this.zzf = zzofVar;
            this.zzj.zza.zzI(zzofVar);
        }
    }

    public final zzof zzc() {
        zzoi zzoiVar;
        if (this.zzi) {
            zzof zzofVar = this.zzf;
            zzofVar.getClass();
            return zzofVar;
        }
        this.zzi = true;
        zzoj zzojVar = this.zze;
        if (zzojVar != null) {
            zzojVar.zza();
        }
        if (zzet.zza >= 23 && (zzoiVar = this.zzc) != null) {
            zzog.zza(this.zza, zzoiVar, this.zzb);
        }
        Intent intent = null;
        if (this.zzd != null) {
            intent = this.zza.registerReceiver(this.zzd, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.zzb);
        }
        zzof zzd = zzof.zzd(this.zza, intent, this.zzh, this.zzg);
        this.zzf = zzd;
        return zzd;
    }

    public final void zzg(zzh zzhVar) {
        this.zzh = zzhVar;
        zzj(zzof.zzc(this.zza, zzhVar, this.zzg));
    }

    public final void zzh(AudioDeviceInfo audioDeviceInfo) {
        AudioDeviceInfo audioDeviceInfo2;
        zzon zzonVar = this.zzg;
        zzon zzonVar2 = null;
        if (zzonVar == null) {
            audioDeviceInfo2 = null;
        } else {
            audioDeviceInfo2 = zzonVar.zza;
        }
        if (zzet.zzG(audioDeviceInfo, audioDeviceInfo2)) {
            return;
        }
        if (audioDeviceInfo != null) {
            zzonVar2 = new zzon(audioDeviceInfo);
        }
        this.zzg = zzonVar2;
        zzj(zzof.zzc(this.zza, this.zzh, zzonVar2));
    }

    public final void zzi() {
        zzoi zzoiVar;
        if (!this.zzi) {
            return;
        }
        this.zzf = null;
        if (zzet.zza >= 23 && (zzoiVar = this.zzc) != null) {
            zzog.zzb(this.zza, zzoiVar);
        }
        BroadcastReceiver broadcastReceiver = this.zzd;
        if (broadcastReceiver != null) {
            this.zza.unregisterReceiver(broadcastReceiver);
        }
        zzoj zzojVar = this.zze;
        if (zzojVar != null) {
            zzojVar.zzb();
        }
        this.zzi = false;
    }
}
