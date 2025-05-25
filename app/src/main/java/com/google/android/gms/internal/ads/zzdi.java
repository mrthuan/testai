package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdi {
    public static int zza(int i10, int i11, int i12) {
        if (i10 >= 0 && i10 < i12) {
            return i10;
        }
        throw new IndexOutOfBoundsException();
    }

    public static Object zzb(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    public static String zzc(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException();
    }

    public static void zzd(boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void zze(boolean z10, Object obj) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException((String) obj);
    }

    public static void zzf(boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void zzg(boolean z10, Object obj) {
        if (z10) {
            return;
        }
        throw new IllegalStateException((String) obj);
    }
}
