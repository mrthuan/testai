package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzatc implements Runnable {
    private zzatc() {
        throw null;
    }

    public /* synthetic */ zzatc(zzatb zzatbVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzatd.zzc(MessageDigest.getInstance("MD5"));
            countDownLatch = zzatd.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzatd.zzb;
        } catch (Throwable th2) {
            zzatd.zzb.countDown();
            throw th2;
        }
        countDownLatch.countDown();
    }
}
