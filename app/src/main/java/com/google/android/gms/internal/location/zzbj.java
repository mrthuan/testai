package com.google.android.gms.internal.location;

import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes2.dex */
public final class zzbj {
    public static Looper zza(Looper looper) {
        if (looper != null) {
            return looper;
        }
        return zzb();
    }

    public static Looper zzb() {
        boolean z10;
        if (Looper.myLooper() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.l("Can't create handler inside thread that has not called Looper.prepare()", z10);
        return Looper.myLooper();
    }
}
