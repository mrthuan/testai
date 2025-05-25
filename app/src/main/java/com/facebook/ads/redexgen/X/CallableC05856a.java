package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.facebook.ads.redexgen.X.6a  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class CallableC05856a implements Callable<Boolean> {
    public final BlockingQueue<Boolean> A00 = new LinkedBlockingQueue();
    public final /* synthetic */ C05906f A01;

    public CallableC05856a(C05906f c05906f, C05866b c05866b) {
        this.A01 = c05906f;
        new Handler(Looper.getMainLooper()).post(new C1317Zv(this, c05906f, c05866b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00 */
    public final Boolean call() throws Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C05866b c05866b) {
        C7j c7j;
        C7j c7j2;
        long currentTimeMillis = System.currentTimeMillis();
        c7j = this.A01.A04;
        RW A05 = RW.A05(c7j.A01());
        Uri A00 = L5.A00(c05866b.A08);
        long j10 = c05866b.A00;
        if (j10 == -1) {
            c7j2 = this.A01.A04;
            j10 = C0877Im.A0Q(c7j2);
        }
        A05.A0G(A00, new C1316Zu(this, c05866b, j10, currentTimeMillis), j10);
    }
}
