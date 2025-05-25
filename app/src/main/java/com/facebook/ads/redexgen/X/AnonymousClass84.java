package com.facebook.ads.redexgen.X;

import android.os.Process;
import android.text.TextUtils;
import java.lang.Thread;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.84  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass84 implements Thread.UncaughtExceptionHandler {
    public static byte[] A04;
    public final C1313Zr A00;
    public final C8B A01;
    public final Thread.UncaughtExceptionHandler A02;
    public final Map<String, String> A03;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 48);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-79, -51, -102, -74, -64, -64, -74, -69, -76, 109, -112, -68, -69, -63, -78, -59, -63, -102, -90, -92, 101, -99, -104, -102, -100, -103, -90, -90, -94, 101, -104, -101, -86, 2, 17, 0, 18, 7, 7, 9, -10, 8, 13, 4, -7, -20, -18, -37, -19, -14, -23, -34, -40, -36, -24, -35, -34};
    }

    public AnonymousClass84(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C1313Zr c1313Zr, AnonymousClass83 anonymousClass83) {
        this(uncaughtExceptionHandler, c1313Zr, anonymousClass83, C8C.A00());
    }

    public AnonymousClass84(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C1313Zr c1313Zr, AnonymousClass83 anonymousClass83, C8B c8b) {
        this.A02 = uncaughtExceptionHandler;
        if (c1313Zr != null) {
            this.A00 = c1313Zr;
            this.A03 = anonymousClass83.A8N(c1313Zr);
            this.A01 = c8b;
            return;
        }
        throw new IllegalArgumentException(A00(2, 15, 29));
    }

    public static void A02() {
        try {
            Process.killProcess(Process.myPid());
        } catch (Throwable unused) {
        }
        try {
            System.exit(10);
        } catch (Throwable unused2) {
        }
    }

    private void A03(Thread thread, Throwable th2) {
        if (this.A02 != null) {
            this.A02.uncaughtException(thread, th2);
        } else {
            A02();
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        try {
            String A03 = AbstractC0947Ll.A03(this.A00, th2);
            if (!TextUtils.isEmpty(A03)) {
                String stackTraceString = A00(17, 16, 7);
                if (A03.contains(stackTraceString)) {
                    Map<String, String> A02 = new AnonymousClass82(A03, this.A03).A02();
                    String A00 = A00(38, 7, 100);
                    String stackTraceString2 = A00(33, 5, 111);
                    A02.put(A00, stackTraceString2);
                    Throwable A002 = KL.A00();
                    String A003 = A00(45, 12, 73);
                    if (A002 == th2) {
                        String stackTraceString3 = A00(1, 1, 108);
                        A02.put(A003, stackTraceString3);
                    } else {
                        String stackTraceString4 = A00(0, 1, 81);
                        A02.put(A003, stackTraceString4);
                    }
                    this.A01.AHi(new C8I(this.A00.A08().A01(), this.A00.A08().A02(), A02), this.A00);
                    if (C0877Im.A20(this.A00)) {
                        C0877Im.A0c(this.A00);
                    }
                }
            }
        } catch (Exception unused) {
        }
        A03(thread, th2);
    }
}
