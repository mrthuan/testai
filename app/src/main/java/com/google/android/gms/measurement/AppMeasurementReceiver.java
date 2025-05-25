package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.zzfn;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements zzfn.zza {
    public zzfn c;

    @Override // com.google.android.gms.measurement.internal.zzfn.zza
    public void doStartService(Context context, Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = WakefulBroadcastReceiver.f3969a;
        synchronized (sparseArray) {
            int i10 = WakefulBroadcastReceiver.f3970b;
            int i11 = i10 + 1;
            WakefulBroadcastReceiver.f3970b = i11;
            if (i11 <= 0) {
                WakefulBroadcastReceiver.f3970b = 1;
            }
            intent.putExtra("androidx.contentpager.content.wakelockid", i10);
            ComponentName startService = context.startService(intent);
            if (startService != null) {
                PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
                newWakeLock.setReferenceCounted(false);
                newWakeLock.acquire(60000L);
                sparseArray.put(i10, newWakeLock);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.c == null) {
            this.c = new zzfn(this);
        }
        this.c.zza(context, intent);
    }
}
