package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes2.dex */
public final class zzay implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ zzbb zza;
    private final Activity zzb;

    public zzay(zzbb zzbbVar, Activity activity) {
        this.zza = zzbbVar;
        this.zzb = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb() {
        Application application;
        application = this.zza.zzb;
        application.unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Dialog dialog;
        Dialog dialog2;
        zzbw zzbwVar;
        AtomicReference atomicReference;
        Dialog dialog3;
        Dialog dialog4;
        Application application;
        AtomicReference atomicReference2;
        zzbw zzbwVar2;
        zzbb zzbbVar = this.zza;
        dialog = zzbbVar.zzg;
        if (dialog != null && zzbbVar.zza) {
            dialog2 = zzbbVar.zzg;
            dialog2.setOwnerActivity(activity);
            zzbb zzbbVar2 = this.zza;
            zzbwVar = zzbbVar2.zzc;
            if (zzbwVar != null) {
                zzbwVar2 = zzbbVar2.zzc;
                zzbwVar2.zza(activity);
            }
            atomicReference = this.zza.zzl;
            zzay zzayVar = (zzay) atomicReference.getAndSet(null);
            if (zzayVar != null) {
                zzayVar.zzb();
                zzbb zzbbVar3 = this.zza;
                zzay zzayVar2 = new zzay(zzbbVar3, activity);
                application = zzbbVar3.zzb;
                application.registerActivityLifecycleCallbacks(zzayVar2);
                atomicReference2 = this.zza.zzl;
                atomicReference2.set(zzayVar2);
            }
            zzbb zzbbVar4 = this.zza;
            dialog3 = zzbbVar4.zzg;
            if (dialog3 != null) {
                dialog4 = zzbbVar4.zzg;
                dialog4.show();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Dialog dialog;
        Dialog dialog2;
        if (activity != this.zzb) {
            return;
        }
        if (activity.isChangingConfigurations()) {
            zzbb zzbbVar = this.zza;
            if (zzbbVar.zza) {
                dialog = zzbbVar.zzg;
                if (dialog != null) {
                    dialog2 = zzbbVar.zzg;
                    dialog2.dismiss();
                    return;
                }
            }
        }
        this.zza.zzh(new zzg(3, "Activity is destroyed."));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
