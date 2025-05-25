package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbct {
    private u.l zza;
    private u.d zzb;
    private u.g zzc;
    private zzbcs zzd;

    public static boolean zzg(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                for (int i10 = 0; i10 < queryIntentActivities.size(); i10++) {
                    if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i10).activityInfo.name)) {
                        return resolveActivity.activityInfo.packageName.equals(zzhfv.zza(context));
                    }
                }
            }
        }
        return false;
    }

    public final u.l zza() {
        u.d dVar = this.zzb;
        if (dVar == null) {
            this.zza = null;
        } else if (this.zza == null) {
            this.zza = dVar.b(null);
        }
        return this.zza;
    }

    public final void zzb(Activity activity) {
        String zza;
        if (this.zzb == null && (zza = zzhfv.zza(activity)) != null) {
            zzhfw zzhfwVar = new zzhfw(this);
            this.zzc = zzhfwVar;
            u.d.a(activity, zza, zzhfwVar);
        }
    }

    public final void zzc(u.d dVar) {
        this.zzb = dVar;
        dVar.getClass();
        try {
            dVar.f30087a.E(0L);
        } catch (RemoteException unused) {
        }
        zzbcs zzbcsVar = this.zzd;
        if (zzbcsVar != null) {
            zzbcsVar.zza();
        }
    }

    public final void zzd() {
        this.zzb = null;
        this.zza = null;
    }

    public final void zze(zzbcs zzbcsVar) {
        this.zzd = zzbcsVar;
    }

    public final void zzf(Activity activity) {
        u.g gVar = this.zzc;
        if (gVar == null) {
            return;
        }
        activity.unbindService(gVar);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }
}
