package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import x0.q0;
import x9.b;
import x9.e;
import x9.f;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes2.dex */
public final class zzbb implements b {
    private final Application zzb;
    private final zzbw zzc;
    private final zzap zzd;
    private final zzbp zze;
    private final zzds zzf;
    private Dialog zzg;
    private zzbu zzh;
    private final AtomicBoolean zzi = new AtomicBoolean();
    private final AtomicReference zzj = new AtomicReference();
    private final AtomicReference zzk = new AtomicReference();
    private final AtomicReference zzl = new AtomicReference();
    boolean zza = false;

    public zzbb(Application application, zzab zzabVar, zzbw zzbwVar, zzap zzapVar, zzbp zzbpVar, zzds zzdsVar) {
        this.zzb = application;
        this.zzc = zzbwVar;
        this.zzd = zzapVar;
        this.zze = zzbpVar;
        this.zzf = zzdsVar;
    }

    private final void zzk() {
        Dialog dialog = this.zzg;
        if (dialog != null) {
            dialog.dismiss();
            this.zzg = null;
        }
        this.zzc.zza(null);
        zzay zzayVar = (zzay) this.zzl.getAndSet(null);
        if (zzayVar != null) {
            zzayVar.zzb();
        }
    }

    @Override // x9.b
    public final void show(Activity activity, b.a aVar) {
        String str;
        zzcr.zza();
        if (!this.zzi.compareAndSet(false, true)) {
            if (true != this.zza) {
                str = "ConsentForm#show can only be invoked once.";
            } else {
                str = "Privacy options form is being loading. Please try again later.";
            }
            aVar.a(new zzg(3, str).zza());
            return;
        }
        this.zzh.zzc();
        zzay zzayVar = new zzay(this, activity);
        this.zzb.registerActivityLifecycleCallbacks(zzayVar);
        this.zzl.set(zzayVar);
        this.zzc.zza(activity);
        Dialog dialog = new Dialog(activity, 16973840);
        dialog.setContentView(this.zzh);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            aVar.a(new zzg(3, "Activity with null windows is passed in.").zza());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        q0.a(window, false);
        this.zzk.set(aVar);
        dialog.show();
        this.zzg = dialog;
        this.zzh.zzd("UMP_messagePresented", "");
    }

    public final zzbu zzc() {
        return this.zzh;
    }

    public final void zzf(f fVar, e eVar) {
        zzbu zza = ((zzbv) this.zzf).zza();
        this.zzh = zza;
        zza.setBackgroundColor(0);
        zza.getSettings().setJavaScriptEnabled(true);
        zza.setWebViewClient(new zzbt(zza, null));
        this.zzj.set(new zzba(fVar, eVar, null));
        zzbu zzbuVar = this.zzh;
        zzbp zzbpVar = this.zze;
        zzbuVar.loadDataWithBaseURL(zzbpVar.zza(), zzbpVar.zzb(), "text/html", "UTF-8", null);
        zzcr.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzax
            @Override // java.lang.Runnable
            public final void run() {
                zzbb.this.zzj(new zzg(4, "Web view timed out."));
            }
        }, 10000L);
    }

    public final void zzg(int i10) {
        zzk();
        b.a aVar = (b.a) this.zzk.getAndSet(null);
        if (aVar == null) {
            return;
        }
        this.zzd.zzg(3);
        aVar.a(null);
    }

    public final void zzh(zzg zzgVar) {
        zzk();
        b.a aVar = (b.a) this.zzk.getAndSet(null);
        if (aVar == null) {
            return;
        }
        aVar.a(zzgVar.zza());
    }

    public final void zzi() {
        zzba zzbaVar = (zzba) this.zzj.getAndSet(null);
        if (zzbaVar == null) {
            return;
        }
        zzbaVar.onConsentFormLoadSuccess(this);
    }

    public final void zzj(zzg zzgVar) {
        zzba zzbaVar = (zzba) this.zzj.getAndSet(null);
        if (zzbaVar == null) {
            return;
        }
        zzbaVar.onConsentFormLoadFailure(zzgVar.zza());
    }
}
