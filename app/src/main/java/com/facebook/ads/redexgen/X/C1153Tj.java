package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Tj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1153Tj extends KY {
    public static String[] A01 = {"M2F6Kmdpn8vR7EEN0gGYLZs2yNDQD6jF", "WcwB5s3ZH8XUWWhYRsGPhRGAgRS7F", "1wzHcE8JrY1qQrLIUCacg6", "aO9bUKC9mwcMg2oxYIu04NXSdGwnlABS", "LSvrrVaEaUYZBIls3QQGViVr8YYMo4D4", "5u9inp355EzrKn8AcN", "FOTtox4pqjzhBM", "oEWmB2dr0o0vjQMmlNYMXQ5ONfeuqOC2"};
    public final /* synthetic */ A4 A00;

    public C1153Tj(A4 a42) {
        this.A00 = a42;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        AbstractC1022Oi abstractC1022Oi;
        int closeButtonStyle;
        AtomicBoolean atomicBoolean;
        AbstractC1022Oi abstractC1022Oi2;
        abstractC1022Oi = this.A00.A00;
        if (abstractC1022Oi != null) {
            abstractC1022Oi2 = this.A00.A00;
            String[] strArr = A01;
            if (strArr[7].charAt(6) != strArr[0].charAt(6)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[6] = "bfueFeeK4pCyDd";
            strArr2[1] = "8ekS6HwfggRtR8RWj86xgWcHB7DcW";
            abstractC1022Oi2.A0y();
        }
        MQ mq = this.A00.A07;
        closeButtonStyle = this.A00.getCloseButtonStyle();
        mq.setToolbarActionMode(closeButtonStyle);
        this.A00.A07.A06();
        atomicBoolean = this.A00.A05;
        atomicBoolean.set(true);
    }
}
