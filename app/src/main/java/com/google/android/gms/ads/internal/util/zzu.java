package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.os.Process;
import android.webkit.CookieManager;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@TargetApi(21)
/* loaded from: classes.dex */
public class zzu extends zzab {
    public final CookieManager i() {
        boolean z10;
        zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
        zzf zzfVar = zzt.f10496l;
        int myUid = Process.myUid();
        if (myUid != 0 && myUid != 1000) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzv(th2, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }
}
