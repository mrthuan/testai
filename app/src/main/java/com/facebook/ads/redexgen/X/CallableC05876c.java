package com.facebook.ads.redexgen.X;

import android.net.TrafficStats;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Callable;
import lib.zj.office.fc.hslf.record.RecordTypes;

/* renamed from: com.facebook.ads.redexgen.X.6c  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class CallableC05876c implements Callable<Boolean> {
    public static byte[] A02;
    public final C05866b A00;
    public final /* synthetic */ C05906f A01;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 41);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-34, -46, -29, -36, -26, -31, -25, -38, -43, -42, -32};
    }

    public CallableC05876c(C05906f c05906f, C05866b c05866b) {
        this.A01 = c05906f;
        this.A00 = c05866b;
    }

    private final Boolean A00() {
        String A01;
        C7j c7j;
        C7j c7j2;
        AnonymousClass00 A03;
        Map map;
        if (KQ.A02(this)) {
            return null;
        }
        try {
            TrafficStats.setThreadStatsTag(RecordTypes.EscherClientTextbox);
            if (this.A00.A04) {
                A01 = A01(0, 6, 72);
            } else {
                A01 = A01(6, 5, 72);
            }
            String str = this.A00.A08;
            String creativeType = this.A00.A07;
            AnonymousClass06 anonymousClass06 = new AnonymousClass06(str, creativeType, this.A00.A06, A01, this.A00.A02, this.A00.A05);
            anonymousClass06.A04 = this.A00.A03;
            anonymousClass06.A02 = this.A00.A01;
            anonymousClass06.A05 = this.A00.A04;
            c7j = this.A01.A04;
            if (C05936i.A06(c7j)) {
                map = C05906f.A0F;
                map.put(this.A00.A08, anonymousClass06);
            }
            c7j2 = this.A01.A04;
            A03 = C05906f.A03(c7j2.A01());
            return Boolean.valueOf(A03.AFn(anonymousClass06) != null);
        } catch (Throwable th2) {
            KQ.A00(th2, this);
            return null;
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() throws Exception {
        if (KQ.A02(this)) {
            return null;
        }
        try {
            return A00();
        } catch (Throwable th2) {
            KQ.A00(th2, this);
            return null;
        }
    }
}
