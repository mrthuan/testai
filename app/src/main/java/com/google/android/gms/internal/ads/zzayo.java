package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzayo implements Application.ActivityLifecycleCallbacks {
    private Activity zza;
    private Context zzb;
    private Runnable zzh;
    private long zzj;
    private final Object zzc = new Object();
    private boolean zzd = true;
    private boolean zze = false;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private boolean zzi = false;

    private final void zzk(Activity activity) {
        synchronized (this.zzc) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.zza = activity;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.zzc) {
            try {
                Activity activity2 = this.zza;
                if (activity2 == null) {
                    return;
                }
                if (activity2.equals(activity)) {
                    this.zza = null;
                }
                Iterator it = this.zzg.iterator();
                while (it.hasNext()) {
                    try {
                        if (((zzazd) it.next()).zza()) {
                            it.remove();
                        }
                    } catch (Exception e10) {
                        com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        com.google.android.gms.ads.internal.util.client.zzm.g(6);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zzk(activity);
        synchronized (this.zzc) {
            for (zzazd zzazdVar : this.zzg) {
                try {
                    zzazdVar.zzb();
                } catch (Exception e10) {
                    com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "AppActivityTracker.ActivityListener.onActivityPaused");
                    com.google.android.gms.ads.internal.util.client.zzm.g(6);
                }
            }
        }
        this.zze = true;
        Runnable runnable = this.zzh;
        if (runnable != null) {
            com.google.android.gms.ads.internal.util.zzt.f10496l.removeCallbacks(runnable);
        }
        com.google.android.gms.ads.internal.util.zzf zzfVar = com.google.android.gms.ads.internal.util.zzt.f10496l;
        zzayn zzaynVar = new zzayn(this);
        this.zzh = zzaynVar;
        zzfVar.postDelayed(zzaynVar, this.zzj);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzk(activity);
        this.zze = false;
        boolean z10 = !this.zzd;
        this.zzd = true;
        Runnable runnable = this.zzh;
        if (runnable != null) {
            com.google.android.gms.ads.internal.util.zzt.f10496l.removeCallbacks(runnable);
        }
        synchronized (this.zzc) {
            for (zzazd zzazdVar : this.zzg) {
                try {
                    zzazdVar.zzc();
                } catch (Exception e10) {
                    com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "AppActivityTracker.ActivityListener.onActivityResumed");
                    com.google.android.gms.ads.internal.util.client.zzm.g(6);
                }
            }
            if (z10) {
                for (zzayp zzaypVar : this.zzf) {
                    try {
                        zzaypVar.zza(true);
                    } catch (Exception unused) {
                        com.google.android.gms.ads.internal.util.client.zzm.g(6);
                    }
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.b("App is still foreground.");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zzk(activity);
    }

    public final Activity zza() {
        return this.zza;
    }

    public final Context zzb() {
        return this.zzb;
    }

    public final void zzf(zzayp zzaypVar) {
        synchronized (this.zzc) {
            this.zzf.add(zzaypVar);
        }
    }

    public final void zzg(Application application, Context context) {
        if (!this.zzi) {
            application.registerActivityLifecycleCallbacks(this);
            if (context instanceof Activity) {
                zzk((Activity) context);
            }
            this.zzb = application;
            this.zzj = ((Long) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzaJ)).longValue();
            this.zzi = true;
        }
    }

    public final void zzh(zzayp zzaypVar) {
        synchronized (this.zzc) {
            this.zzf.remove(zzaypVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
