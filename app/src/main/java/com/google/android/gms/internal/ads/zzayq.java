package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzayq {
    private final Object zza = new Object();
    private zzayo zzb = null;
    private boolean zzc = false;

    public final Activity zza() {
        synchronized (this.zza) {
            zzayo zzayoVar = this.zzb;
            if (zzayoVar != null) {
                return zzayoVar.zza();
            }
            return null;
        }
    }

    public final Context zzb() {
        synchronized (this.zza) {
            zzayo zzayoVar = this.zzb;
            if (zzayoVar != null) {
                return zzayoVar.zzb();
            }
            return null;
        }
    }

    public final void zzc(zzayp zzaypVar) {
        synchronized (this.zza) {
            if (this.zzb == null) {
                this.zzb = new zzayo();
            }
            this.zzb.zzf(zzaypVar);
        }
    }

    public final void zzd(Context context) {
        Application application;
        synchronized (this.zza) {
            if (!this.zzc) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                } else {
                    application = null;
                }
                if (application == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.e("Can not cast Context to Application");
                    return;
                }
                if (this.zzb == null) {
                    this.zzb = new zzayo();
                }
                this.zzb.zzg(application, context);
                this.zzc = true;
            }
        }
    }

    public final void zze(zzayp zzaypVar) {
        synchronized (this.zza) {
            zzayo zzayoVar = this.zzb;
            if (zzayoVar == null) {
                return;
            }
            zzayoVar.zzh(zzaypVar);
        }
    }
}
