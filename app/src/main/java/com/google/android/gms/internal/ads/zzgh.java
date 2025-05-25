package com.google.android.gms.internal.ads;

import android.system.ErrnoException;
import android.system.OsConstants;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgh {
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzb(Throwable th2) {
        if ((th2 instanceof ErrnoException) && ((ErrnoException) th2).errno == OsConstants.EACCES) {
            return true;
        }
        return false;
    }
}
