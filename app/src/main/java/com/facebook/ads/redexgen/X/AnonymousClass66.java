package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.66  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass66 extends AbstractC0780Ee implements Handler.Callback {
    public static String[] A0D = {"3hA3hEaqtnmobtKNR2kBBTtved21rXwe", "d00WeJBXtxGdjHumPCogae6hmL", "V3BKelPK", "LQ7ajOPvMri4UVBGHGKq5A2XMp5US8wn", "aO3vNkBPz686GW1RQIhbehKuZYa8jCXF", "", "AGk0mWwzzGVlhCwytPNvLIpQoO", "GzTesuYtGJubeKMXgzMFnLbwnyU"};
    public int A00;
    public int A01;
    public Format A02;
    public XQ A03;
    public DO A04;
    public DM A05;
    public DM A06;
    public boolean A07;
    public boolean A08;
    public final Handler A09;
    public final C06709u A0A;
    public final InterfaceC0810Fv A0B;
    public final InterfaceC0811Fw A0C;

    public AnonymousClass66(InterfaceC0811Fw interfaceC0811Fw, Looper looper) {
        this(interfaceC0811Fw, looper, InterfaceC0810Fv.A00);
    }

    public AnonymousClass66(InterfaceC0811Fw interfaceC0811Fw, Looper looper, InterfaceC0810Fv interfaceC0810Fv) {
        super(3);
        this.A0C = (InterfaceC0811Fw) AbstractC0844Hf.A01(interfaceC0811Fw);
        this.A09 = looper == null ? null : new Handler(looper, this);
        this.A0B = interfaceC0810Fv;
        this.A0A = new C06709u();
    }

    private long A00() {
        if (this.A01 == -1 || this.A01 >= this.A06.A7P()) {
            return Long.MAX_VALUE;
        }
        return this.A06.A7O(this.A01);
    }

    private void A01() {
        A06(Collections.emptyList());
    }

    private void A02() {
        this.A04 = null;
        this.A01 = -1;
        if (this.A06 != null) {
            this.A06.A08();
            this.A06 = null;
        }
        if (this.A05 != null) {
            this.A05.A08();
            this.A05 = null;
        }
    }

    private void A03() {
        A02();
        this.A03.AEy();
        this.A03 = null;
        this.A00 = 0;
    }

    private void A04() {
        A03();
        this.A03 = this.A0B.A4v(this.A02);
    }

    private void A05(List<C0807Fs> list) {
        this.A0C.ABg(list);
    }

    private void A06(List<C0807Fs> list) {
        if (this.A09 != null) {
            this.A09.obtainMessage(0, list).sendToTarget();
        } else {
            A05(list);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0780Ee
    public final void A15() {
        this.A02 = null;
        A01();
        A03();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0780Ee
    public final void A16(long j10, boolean z10) {
        A01();
        this.A07 = false;
        this.A08 = false;
        if (this.A00 != 0) {
            A04();
            return;
        }
        A02();
        this.A03.flush();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0780Ee
    public final void A18(Format[] formatArr, long j10) throws C06589h {
        this.A02 = formatArr[0];
        if (this.A03 != null) {
            this.A00 = 1;
        } else {
            this.A03 = this.A0B.A4v(this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.X.ZA
    public final boolean A9Q() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.ZA
    public final boolean A9b() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d2, code lost:
        if (r4 <= 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d4, code lost:
        r4 = r10.A06;
        r2 = com.facebook.ads.redexgen.X.AnonymousClass66.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e6, code lost:
        if (r2[1].length() == r2[6].length()) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e8, code lost:
        r2 = com.facebook.ads.redexgen.X.AnonymousClass66.A0D;
        r2[5] = "";
        r2[2] = "cCkc8Lor";
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f4, code lost:
        if (r4 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f6, code lost:
        r10.A06.A08();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fb, code lost:
        r10.A06 = r10.A05;
        r10.A05 = null;
        r10.A01 = r10.A06.A7r(r11);
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010c, code lost:
        r2 = com.facebook.ads.redexgen.X.AnonymousClass66.A0D;
        r2[5] = "";
        r2[2] = "MHQEiJiB";
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0118, code lost:
        if (r4 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011b, code lost:
        if (r4 <= 0) goto L45;
     */
    @Override // com.facebook.ads.redexgen.X.ZA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AFe(long r11, long r13) throws com.facebook.ads.redexgen.X.C06589h {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass66.AFe(long, long):void");
    }

    @Override // com.facebook.ads.redexgen.X.AF
    public final int AH6(Format format) {
        if (this.A0B.AH7(format)) {
            return AbstractC0780Ee.A0y(null, format.A0H) ? 4 : 2;
        } else if (AbstractC0862Hx.A0A(format.A0O)) {
            if (A0D[4].charAt(24) != 'c') {
                String[] strArr = A0D;
                strArr[5] = "";
                strArr[2] = "jIB0EZuh";
                return 1;
            }
            throw new RuntimeException();
        } else {
            return 0;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                List<C0807Fs> list = (List) message.obj;
                if (A0D[4].charAt(24) != 'c') {
                    String[] strArr = A0D;
                    strArr[1] = "331Gsuq8S7wfWBS8jIctkbUTPr";
                    strArr[6] = "KHUhuMJXaiRGhsQX4fJpTr5XSi";
                    A05(list);
                    return true;
                }
                throw new RuntimeException();
            default:
                throw new IllegalStateException();
        }
    }
}
