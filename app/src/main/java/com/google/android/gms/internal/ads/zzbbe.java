package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbbe {
    private final Context zza;

    public zzbbe(Context context) {
        if (context != null) {
            this.zza = context;
            return;
        }
        throw new NullPointerException("Context can not be null");
    }

    public final boolean zza(Intent intent) {
        if (intent != null) {
            if (this.zza.getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
                return false;
            }
            return true;
        }
        throw new NullPointerException("Intent can not be null");
    }

    public final boolean zzb() {
        return zza(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    public final boolean zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.util.zzcd.a(this.zza, new Callable() { // from class: com.google.android.gms.internal.ads.zzbbd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
            }
        })).booleanValue() && Wrappers.a(this.zza).f11391a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        return false;
    }
}
