package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes2.dex */
public final class zzfti {
    private static final zzfua zzb = new zzfua("OverlayDisplayService");
    private static final Intent zzc = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    final zzftz zza;
    private final String zzd;

    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.gms.internal.ads.zzftf] */
    public zzfti(Context context) {
        if (zzfuc.zza(context)) {
            this.zza = new zzftz(context.getApplicationContext(), zzb, "OverlayDisplayService", zzc, new Object() { // from class: com.google.android.gms.internal.ads.zzftf
            });
        } else {
            this.zza = null;
        }
        this.zzd = context.getPackageName();
    }

    public final void zza() {
        if (this.zza == null) {
            return;
        }
        zzb.zzc("unbind LMD display overlay service", new Object[0]);
        this.zza.zzn();
    }

    public final void zzb(final zzfsz zzfszVar, final zzftn zzftnVar) {
        zzftz zzftzVar = this.zza;
        if (zzftzVar == null) {
            zzb.zza("error: %s", "Play Store not found.");
        } else {
            zzftzVar.zzi(new Runnable() { // from class: com.google.android.gms.internal.ads.zzftg
                @Override // java.lang.Runnable
                public final void run() {
                    zzfti.this.zzc(zzfszVar, zzftnVar);
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzfsj] */
    public final /* synthetic */ void zzc(zzfsz zzfszVar, zzftn zzftnVar) {
        try {
            zzftz zzftzVar = this.zza;
            zzftzVar.getClass();
            ?? zzc2 = zzftzVar.zzc();
            if (zzc2 == 0) {
                return;
            }
            String str = this.zzd;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzfszVar.zzb());
            bundle.putString("callerPackage", str);
            bundle.putString("appId", zzfszVar.zza());
            zzc2.zze(bundle, new zzfth(this, zzftnVar));
        } catch (RemoteException e10) {
            zzb.zzb(e10, "dismiss overlay display from: %s", this.zzd);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzfsj] */
    public final /* synthetic */ void zzd(zzftk zzftkVar, zzftn zzftnVar) {
        try {
            zzftz zzftzVar = this.zza;
            zzftzVar.getClass();
            ?? zzc2 = zzftzVar.zzc();
            if (zzc2 == 0) {
                return;
            }
            String str = this.zzd;
            Bundle bundle = new Bundle();
            bundle.putBinder("windowToken", zzftkVar.zzf());
            bundle.putString("adFieldEnifd", zzftkVar.zzg());
            bundle.putInt("layoutGravity", zzftkVar.zzc());
            bundle.putFloat("layoutVerticalMargin", zzftkVar.zza());
            bundle.putInt("displayMode", 0);
            bundle.putInt("triggerMode", 0);
            bundle.putInt("windowWidthPx", zzftkVar.zze());
            bundle.putString("deeplinkUrl", null);
            bundle.putBoolean("stableSessionToken", true);
            bundle.putString("callerPackage", str);
            if (zzftkVar.zzh() != null) {
                bundle.putString("appId", zzftkVar.zzh());
            }
            zzc2.zzf(str, bundle, new zzfth(this, zzftnVar));
        } catch (RemoteException e10) {
            zzb.zzb(e10, "show overlay display from: %s", this.zzd);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.zzfsj] */
    public final /* synthetic */ void zze(zzftp zzftpVar, int i10, zzftn zzftnVar) {
        try {
            zzftz zzftzVar = this.zza;
            zzftzVar.getClass();
            ?? zzc2 = zzftzVar.zzc();
            if (zzc2 == 0) {
                return;
            }
            String str = this.zzd;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", zzftpVar.zzb());
            bundle.putInt("displayMode", i10);
            bundle.putString("callerPackage", str);
            bundle.putString("appId", zzftpVar.zza());
            zzc2.zzg(bundle, new zzfth(this, zzftnVar));
        } catch (RemoteException e10) {
            zzb.zzb(e10, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i10), this.zzd);
        }
    }

    public final void zzf(final zzftk zzftkVar, final zzftn zzftnVar) {
        zzftz zzftzVar = this.zza;
        if (zzftzVar == null) {
            zzb.zza("error: %s", "Play Store not found.");
        } else if (zzftkVar.zzh() == null) {
            zzb.zza("Failed to convert OverlayDisplayShowRequest when to create a new session: appId cannot be null.", new Object[0]);
            zzftl zzc2 = zzftm.zzc();
            zzc2.zzb(8160);
            zzftnVar.zza(zzc2.zzc());
        } else {
            zzftzVar.zzi(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfte
                @Override // java.lang.Runnable
                public final void run() {
                    zzfti.this.zzd(zzftkVar, zzftnVar);
                }
            });
        }
    }

    public final void zzg(final zzftp zzftpVar, final zzftn zzftnVar, final int i10) {
        zzftz zzftzVar = this.zza;
        if (zzftzVar == null) {
            zzb.zza("error: %s", "Play Store not found.");
        } else {
            zzftzVar.zzi(new Runnable() { // from class: com.google.android.gms.internal.ads.zzftd
                @Override // java.lang.Runnable
                public final void run() {
                    zzfti.this.zze(zzftpVar, i10, zzftnVar);
                }
            });
        }
    }
}
