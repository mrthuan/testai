package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class XY implements HD {
    public static String[] A0C = {"UHBxdqqmUd0cBUfteuxO11fv3nMetCkr", "bpIfqspTf2B8hIKXxN8UsfP", "nQLLlj7yvR51GKiSLDNkBhCd9wKHTmtF", "g1T6MLNH1r6BMEQeXhAGdqkubnn7KLBM", "2gOIWdRNZvq1Kh3BpRyp9hP618T8MmgQ", "QpJVxxzC0ZK3g", "rEgoyo7biwWjWc5JH9k81Kz3GFe4jtfN", "VeB4zDZa"};
    public long A00;
    public long A02;
    public H3 A03;
    public final Uri A05;
    public final C0786Ep A07;
    public final InterfaceC0838Gz A08;
    public final C0850Hl A09;
    public volatile boolean A0A;
    public final /* synthetic */ C0757Dg A0B;
    public final C4 A06 = new C4();
    public boolean A04 = true;
    public long A01 = -1;

    public XY(C0757Dg c0757Dg, Uri uri, InterfaceC0838Gz interfaceC0838Gz, C0786Ep c0786Ep, C0850Hl c0850Hl) {
        this.A0B = c0757Dg;
        this.A05 = (Uri) AbstractC0844Hf.A01(uri);
        this.A08 = (InterfaceC0838Gz) AbstractC0844Hf.A01(interfaceC0838Gz);
        this.A07 = (C0786Ep) AbstractC0844Hf.A01(c0786Ep);
        this.A09 = c0850Hl;
    }

    public final void A04(long j10, long j11) {
        this.A06.A00 = j10;
        this.A02 = j11;
        this.A04 = true;
    }

    @Override // com.facebook.ads.redexgen.X.HD
    public final void A4W() {
        this.A0A = true;
    }

    @Override // com.facebook.ads.redexgen.X.HD
    public final void A9o() throws IOException, InterruptedException {
        int result = 0;
        while (result == 0) {
            boolean z10 = this.A0A;
            if (A0C[4].charAt(0) == 'C') {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[6] = "tFp1bRZRusaEJJa7j65nePC0dyA6HXa4";
            strArr[2] = "yrMehS8ZHN9WesRJaME1jcDTy2vBV8ag";
            if (!z10) {
                InterfaceC0724By interfaceC0724By = null;
                try {
                    long j10 = this.A06.A00;
                    this.A03 = new H3(this.A05, j10, -1L, C0757Dg.A08(this.A0B));
                    this.A01 = this.A08.AEE(this.A03);
                    if (this.A01 != -1) {
                        this.A01 += j10;
                    }
                    C1288Ys c1288Ys = new C1288Ys(this.A08, j10, this.A01);
                    InterfaceC0723Bx extractor = this.A07.A02(c1288Ys, this.A08.A8c());
                    if (this.A04) {
                        extractor.AG7(j10, this.A02);
                        this.A04 = false;
                    }
                    while (result == 0 && !this.A0A) {
                        this.A09.A00();
                        result = extractor.AEk(c1288Ys, this.A06);
                        if (c1288Ys.A86() > C0757Dg.A03(this.A0B) + j10) {
                            j10 = c1288Ys.A86();
                            this.A09.A01();
                            C0757Dg.A04(this.A0B).post(C0757Dg.A06(this.A0B));
                        }
                    }
                    if (result == 1) {
                        result = 0;
                    } else {
                        this.A06.A00 = c1288Ys.A86();
                        C4 c42 = this.A06;
                        if (A0C[4].charAt(0) == 'C') {
                            throw new RuntimeException();
                        }
                        A0C[4] = "PQr9p7FkEdqUiF3RXdEEuViBVQM7OAy8";
                        this.A00 = c42.A00 - this.A03.A01;
                    }
                    IK.A0W(this.A08);
                } catch (Throwable th2) {
                    if (result != 1 && 0 != 0) {
                        this.A06.A00 = interfaceC0724By.A86();
                        this.A00 = this.A06.A00 - this.A03.A01;
                    }
                    IK.A0W(this.A08);
                    throw th2;
                }
            } else {
                return;
            }
        }
    }
}
