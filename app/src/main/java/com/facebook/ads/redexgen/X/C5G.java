package com.facebook.ads.redexgen.X;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.5G  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C5G extends Thread {
    public static byte[] A07;
    public static final String A08;
    public final int A00;
    public final Handler A01;
    public final C5I A02;
    public final C1314Zs A03;
    public final Runnable A04;
    public volatile long A05;
    public volatile boolean A06;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 101);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{103, 99, 12, 96, 111, 115, 12, 101, Field.INCLUDETEXT, Field.DOCPROPERTY, Field.INCLUDETEXT, Field.SECTIONPAGES, Field.DOCPROPERTY, 78, Field.FORMDROPDOWN, 10, 8, 3, 8, 31, 4, 14};
    }

    static {
        A02();
        A08 = C5G.class.getName();
    }

    public C5G(C1314Zs c1314Zs, C5I c5i) {
        this(c1314Zs, c5i, C0877Im.A08(c1314Zs));
    }

    public C5G(C1314Zs c1314Zs, C5I c5i, int i10) {
        this.A01 = new Handler(Looper.getMainLooper());
        this.A04 = new Runnable() { // from class: com.facebook.ads.redexgen.X.5F
            @Override // java.lang.Runnable
            public final void run() {
                if (KQ.A02(this)) {
                    return;
                }
                try {
                    C5G.this.A05 = 0L;
                    C5G.this.A06 = false;
                } catch (Throwable th2) {
                    KQ.A00(th2, this);
                }
            }
        };
        this.A05 = 0L;
        this.A06 = false;
        setName(A01(0, 15, 68));
        this.A00 = i10;
        this.A03 = c1314Zs;
        this.A02 = c5i;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (KQ.A02(this)) {
            return;
        }
        try {
            long j10 = this.A00;
            while (!isInterrupted()) {
                long interval = this.A05;
                boolean z10 = interval == 0;
                this.A05 = j10;
                if (z10) {
                    this.A01.post(this.A04);
                }
                try {
                    Thread.sleep(j10);
                    long interval2 = this.A05;
                    if (interval2 != 0 && !this.A06 && !Debug.isDebuggerConnected()) {
                        if (this.A02.A05()) {
                            this.A03.A07().AA0(A01(15, 7, 8), C8E.A1D, new C8F(this.A02.A04()));
                        }
                        this.A06 = true;
                    }
                } catch (InterruptedException unused) {
                    BuildConfigApi.isDebug();
                    return;
                }
            }
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
