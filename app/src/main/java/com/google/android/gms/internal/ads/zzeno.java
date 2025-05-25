package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeno implements zzevn {
    public final Context zza;
    public final com.google.android.gms.ads.internal.client.zzq zzb;
    public final List zzc;

    public zzeno(Context context, com.google.android.gms.ads.internal.client.zzq zzqVar, List list) {
        this.zza = context;
        this.zzb = zzqVar;
        this.zzc = list;
    }

    @Override // com.google.android.gms.internal.ads.zzevn
    public final void zzj(Object obj) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ComponentName componentName;
        ComponentName componentName2;
        Bundle bundle = (Bundle) obj;
        if (!((Boolean) zzbdv.zza.zze()).booleanValue()) {
            return;
        }
        Bundle bundle2 = new Bundle();
        com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
        String str = null;
        try {
            ActivityManager activityManager = (ActivityManager) this.zza.getSystemService("activity");
            if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null) {
                componentName = runningTaskInfo.topActivity;
                if (componentName != null) {
                    componentName2 = runningTaskInfo.topActivity;
                    str = componentName2.getClassName();
                }
            }
        } catch (Exception unused) {
        }
        bundle2.putString("activity", str);
        Bundle bundle3 = new Bundle();
        bundle3.putInt(InMobiNetworkValues.WIDTH, this.zzb.f10241e);
        bundle3.putInt(InMobiNetworkValues.HEIGHT, this.zzb.f10239b);
        bundle2.putBundle("size", bundle3);
        if (!this.zzc.isEmpty()) {
            List list = this.zzc;
            bundle2.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
        }
        bundle.putBundle("view_hierarchy", bundle2);
    }
}
