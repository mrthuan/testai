package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import lib.zj.office.fc.hssf.record.UnknownRecord;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.88  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass88 {
    public static SparseIntArray A00;
    public static Executor A01;
    public static boolean A02;
    public static boolean A03;
    public static byte[] A04;
    public static String[] A05 = {"7RJhgfAHrbCmdmvJO272XvW7u1fNB6AD", "SRAGcoTEjCaoOjv1TM3aABjegfXmDbQ2", "TJJTsgNcbEXqB1u8vE3MpXQkjlg70u98", "t1ySRzXu9XpLihhV0EPpMNwY8xH1TItL", "3rsqEGuQmw5YOXxTuvx2sfjKNK9b", "ZMUzhorUr0JjW6bP", "tg0Wl7kwCnCjIdXfhu7KKTsHjGWToUDr", "3JMITBtDsKuz"};
    public static final List<Integer> A06;
    public static final List<AnonymousClass89> A07;
    public static final AtomicBoolean A08;
    public static final AtomicInteger A09;
    public static final AtomicReference<AnonymousClass86> A0A;
    public static final AtomicReference<AnonymousClass87> A0B;
    public static final AtomicReference<Boolean> A0C;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 61);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A04 = new byte[]{117, 105, -86, -83, -83, -78, -67, -78, -72, -73, -86, -75, -110, -73, -81, -72, 105, -122, 105, -53, -65, 12, 4, 18, 18, 0, 6, 4, -65, -36, -65, -43, -55, Field.NUMCHARS, 30, 11, 29, 34, 25, 14, -20, 24, 13, 14, -55, -26, -55, -46, -91, -61, -48, -119, -42, -126, -50, -47, -55, -126, -90, -57, -60, -41, -55, -126, -89, -40, -57, -48, -42, -112, -126, -91, -47, -48, -42, -57, -38, -42, -126, -53, -43, -126, -48, -41, -50, -50, -112, -74, -30, -24, -31, -25, -40, -27, -83, -109, -46, -13, -16, 3, -11, -82, -15, 0, -17, 1, -10, -82, -16, -13, -15, -17, 3, 1, -13, -82, -3, -12, -82, -13, 4, -13, -4, 2, -82, 5, -9, 2, -10, -82, 1, 3, -16, 2, 7, -2, -13, -82, -53, -82, -56, -5, -26, -24, -24, -25, -24, -25, -93, -20, -15, -80, -16, -24, -16, -14, -11, -4, -93, -17, -14, -22, -93, -17, -20, -16, -20, -9, -92, -93, -49, -28, -10, -9, -93, -24, -7, -24, -15, -9, -67, -93, -12, Field.FILLIN, 18, 20, 31, Field.QUOTE, 24, 30, 29, -49, -13, 20, 17, 36, 22, -49, -12, Field.PAGEREF, 20, 29, Field.QUOTE, -49, Field.ASK, 24, Field.QUOTE, 23, -49, 34, 36, 17, Field.QUOTE, Field.DATA, 31, 20, -49, -20, -49, -123, -72, -93, -91, -80, -76, -87, -81, -82, 96, -92, -75, -78, -87, -82, -89, 96, -84, -81, -89, -89, -87, -82, -89, 96, -92, -91, -94, -75, -89, 96, -91, -74, -91, -82, -76, 110, -55, -4, -25, -23, -12, -8, -19, -13, -14, -92, -9, -20, -13, -7, -16, -24, -92, -14, -13, -8, -92, -20, -27, -12, -12, -23, -14, -92, -20, -23, -10, -23, -78, -122, -126, -127, -75, -92, -87, -91, -82, -93, -91, -114, -91, -76, -73, -81, -78, -85, -20, 17, 9, 18, -61, -25, 8, 5, 24, 10, -61, -24, 25, 8, 17, 23, -61, 26, 12, 23, 11, -61, 22, 24, 5, 23, Field.NUMCHARS, 19, 8, -61, -32, -61, -99, -72, -72, 105, -74, -86, -73, -62, 105, -82, -65, -82, -73, -67, -68, 105, -72, -81, 105, -68, -66, -85, -67, -62, -71, -82, 105, -84, -72, -83, -82, -125, 105, -8, -6, -11, -6, -9, 10, -9, -11, 2, 5, -3, -3, -1, 4, -3, -90, -77, -72, -93, -88, -87, -72, -87, -89, -72, -83, -77, -78, -93, -69, -77, -93, -73, -83, -85, -78, -91, -80, -93, -88, -91, -72, -91, -93, -80, -77, -85, -85, -83, -78, -85, -6, -8, -6, -1, -4, -60, -59, -65, -52, -49, -57, -57, -55, -50, -57, -49, -43, -54, -36, -47, -31, -16, -23, -23, -32, -25, 11, 18, 5, 1, 24, 3, 14, 11, 6, 3, 22, 11, 17, 16, -80, -89, -74, -71, -79, -76, -83};
    }

    static {
        A04();
        A00 = new SparseIntArray();
        A03 = false;
        A0B = new AtomicReference<>();
        A0A = new AtomicReference<>();
        A01 = Executors.newSingleThreadExecutor();
        A06 = Arrays.asList(10, 50, 100, 1000);
        A07 = Collections.synchronizedList(new ArrayList());
        A09 = new AtomicInteger();
        A08 = new AtomicBoolean();
        A0C = new AtomicReference<>(false);
        A02 = false;
    }

    public static int A00(String str, int i10, C7j c7j) {
        if ((A01(462, 7, 5).equals(str) && C8E.A20 == i10) || A01(422, 5, 90).equals(str) || A01(UnknownRecord.CODENAME_1BA, 6, 62).equals(str)) {
            return 200;
        }
        if (A01(386, 36, 7).equals(str)) {
            return 50;
        }
        if (A01(371, 15, 89).equals(str)) {
            return Io.A05(c7j);
        }
        return -1;
    }

    public static /* synthetic */ List A02() {
        List<AnonymousClass89> list = A07;
        if (A05[0].charAt(12) != 'b') {
            String[] strArr = A05;
            strArr[6] = "zk7JrRKdkqRVNKieaZlWPGFPyzHfiD6w";
            strArr[3] = "fyoGHU5IjzPGh6SPmUkkru2DTQYQg6uC";
            return list;
        }
        throw new RuntimeException();
    }

    public static void A05(C7j c7j, int i10, int i11) {
        c7j.A07().AA0(A01(427, 10, 35), C8E.A2Z, new C8F(A01(338, 33, 12) + i10, A01(87, 9, 54) + i11));
    }

    @Deprecated
    public static void A06(C7j c7j, String str, int i10, C8F c8f) {
        if (c7j == null) {
            A0F(new RuntimeException(A01(48, 39, 37)));
            return;
        }
        AbstractC06137i.A01(c7j.A01());
        if (A02 && c8f.A01() == 0) {
            A0D(new RuntimeException(A01(96, 44, 81) + str + A01(31, 16, 108) + i10, c8f));
        }
        try {
            if (A0J(c7j, str, i10, Math.random(), c8f)) {
                A09(c7j, str, i10, c8f);
            }
        } catch (Throwable th2) {
            if (A05[7].length() == 7) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[6] = "Wr4fCxMFDWkIVvnx3dc83TKhQDpVGTp5";
            strArr[3] = "OVQSbEPH5m9BJKnAfFJqQw5cDphpT4wi";
            A0F(th2);
        }
    }

    @Deprecated
    public static void A07(C7j c7j, String str, int i10, C8F c8f) {
        try {
            c8f.A05(2);
            c8f.A0A(false);
            c8f.A06(1);
            if (Io.A0Q(c7j)) {
                c8f.A08(true);
            } else {
                c8f.A08(false);
            }
            A06(c7j, str, i10, c8f);
        } catch (Throwable t4) {
            A0F(t4);
        }
    }

    @Deprecated
    public static void A08(C7j c7j, String str, int i10, C8F c8f) {
        try {
            c8f.A05(2);
            c8f.A08(false);
            A06(c7j, str, i10, c8f);
        } catch (Throwable th2) {
            String[] strArr = A05;
            if (strArr[2].charAt(18) != strArr[1].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[2] = "lrlTLjNTeannl0YPXC3Gfh7JwXVpOQq4";
            strArr2[1] = "kBSf974kPIRKP3U3j132aDHcl1k5alA0";
            A0F(th2);
        }
    }

    public static void A09(C7j c7j, String str, int i10, C8F c8f) {
        synchronized (AnonymousClass88.class) {
            if (!A03) {
                int A012 = Io.A01(c7j);
                int threshold = A09.getAndIncrement();
                if (threshold < A012 - 1) {
                    A07.add(new AnonymousClass89(str, i10, c8f));
                } else if (A09.get() == A012) {
                    A07.add(new AnonymousClass89(A01(427, 10, 35), C8E.A2W, new C8F(A01(ShapeTypes.FLOW_CHART_PREPARATION, 42, 70) + str + A01(47, 1, 91) + i10)));
                }
            } else {
                A0A(c7j, str, i10, c8f, true);
            }
        }
    }

    public static void A0A(C7j c7j, String str, int i10, C8F c8f, boolean z10) {
        AnonymousClass87 anonymousClass87 = A0B.get();
        boolean z11 = anonymousClass87 != null && anonymousClass87.A9f();
        boolean z12 = A08.get();
        String[] strArr = A05;
        if (strArr[6].charAt(6) == strArr[3].charAt(6)) {
            throw new RuntimeException();
        }
        A05[0] = "wcUF0zMFhzDc2LBIPX26ddygqjW04ktX";
        if (z12 || z11) {
            int A012 = c8f.A01();
            String A013 = A01(289, 17, 3);
            String A014 = A01(31, 16, 108);
            if (A012 == 0) {
                Log.e(A013, A01(ShapeTypes.CORNER_TABS, 37, 114) + str + A014 + i10, c8f);
            } else {
                Log.i(A013, A01(306, 32, 102) + str + A014 + i10 + A01(19, 12, 98) + c8f.getMessage() + A01(0, 19, 12) + c8f.A03());
            }
        }
        C1305Zj c1305Zj = new C1305Zj(c7j, str, i10, c8f, anonymousClass87);
        if (z10) {
            A01.execute(c1305Zj);
        } else {
            c1305Zj.run();
        }
    }

    public static void A0C(C1313Zr c1313Zr, AnonymousClass87 anonymousClass87, AnonymousClass86 anonymousClass86, boolean z10) {
        A0A.set(anonymousClass86);
        A0B.set(anonymousClass87);
        A08.set(z10);
        synchronized (AnonymousClass88.class) {
            if (!A03) {
                A03 = true;
                A01.execute(new C1306Zk(c1313Zr));
            }
        }
    }

    public static void A0D(final RuntimeException runtimeException) {
        if (A02) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.facebook.ads.redexgen.X.85
                @Override // java.lang.Runnable
                public final void run() {
                    throw runtimeException;
                }
            });
        }
    }

    @Deprecated
    public static void A0E(Throwable th2) {
        if (A02) {
            A0D(new RuntimeException(A01(256, 33, 71), th2));
        }
    }

    public static void A0F(Throwable th2) {
        Log.e(A01(289, 17, 3), A01(219, 37, 3), th2);
        if (A02) {
            A0D(new RuntimeException(th2));
        }
    }

    public static boolean A0H(C7j c7j) {
        Boolean shouldSkipFunnelEventsForSession = A0C.get();
        return (shouldSkipFunnelEventsForSession == null || !shouldSkipFunnelEventsForSession.booleanValue()) && Io.A0A(c7j) != 0;
    }

    public static boolean A0I(C7j c7j) {
        Boolean shouldSkipFunnelEventsForSession = A0C.get();
        if (shouldSkipFunnelEventsForSession != null && shouldSkipFunnelEventsForSession.booleanValue()) {
            return false;
        }
        double funnelEventLogProbability = 1.0d / Io.A0A(c7j);
        return c7j.A08().A00() <= funnelEventLogProbability;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x017b, code lost:
        com.facebook.ads.redexgen.X.AnonymousClass88.A0C.set(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0185, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0186, code lost:
        if (r0 <= 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0188, code lost:
        r7 = 1.0d / r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x018a, code lost:
        if (r11 == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x018c, code lost:
        r7 = r7 * r2;
        r2 = com.facebook.ads.redexgen.X.AnonymousClass88.A05;
        r1 = r2[6];
        r2 = r2[3];
        r1 = r1.charAt(6);
        r0 = r2.charAt(6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x019e, code lost:
        if (r1 == r0) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01a0, code lost:
        r2 = com.facebook.ads.redexgen.X.AnonymousClass88.A05;
        r2[5] = "ov2u4VJ7e4Jf0Cpe";
        r2[4] = "3S8vDNMGZoIrI2ECoHj3stfewtnb";
        r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01ae, code lost:
        if (r0 > 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01b0, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01b2, code lost:
        r2 = com.facebook.ads.redexgen.X.AnonymousClass88.A05;
        r2[2] = "J7AbISTAh4tNpjUdhq3A9LORixiN2LjD";
        r2[1] = "NK4gpNISnoGezA2FzC3Uh9mHyAzfRHIK";
        r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01c0, code lost:
        if (r0 > 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01c3, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01c5, code lost:
        r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01c7, code lost:
        if (r0 > 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01c9, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01cb, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01cf, code lost:
        r7 = 1.0d - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01da, code lost:
        if (com.facebook.ads.redexgen.X.AnonymousClass88.A05[7].length() == 7) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01dc, code lost:
        com.facebook.ads.redexgen.X.AnonymousClass88.A05[0] = "IU4RZwbJxJdQMYPPezGzztuufFdsMCjm";
        r0 = (r16 > r7 ? 1 : (r16 == r7 ? 0 : -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01e5, code lost:
        if (r0 < 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01e7, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01e9, code lost:
        r0 = (r16 > r7 ? 1 : (r16 == r7 ? 0 : -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01eb, code lost:
        if (r0 < 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:?, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:?, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0152, code lost:
        if (r6 == 2) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0161, code lost:
        if (r6 == 2) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0163, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0164, code lost:
        r0 = com.facebook.ads.redexgen.X.AnonymousClass88.A0C.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x016c, code lost:
        if (r0 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0172, code lost:
        if (r0.booleanValue() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0174, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0175, code lost:
        r0 = com.facebook.ads.redexgen.X.Io.A0A(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0179, code lost:
        if (r0 != 0) goto L104;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0J(com.facebook.ads.redexgen.X.C7j r13, java.lang.String r14, int r15, double r16, com.facebook.ads.redexgen.X.C8F r18) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass88.A0J(com.facebook.ads.redexgen.X.7j, java.lang.String, int, double, com.facebook.ads.redexgen.X.8F):boolean");
    }

    public static boolean A0K(C7j c7j, String str, int i10, C8F c8f) {
        if (Io.A0P(c7j)) {
            int customLimit = A00.get(i10);
            int eventsLimit = Io.A00(c7j);
            if (c8f.A02() != -1) {
                eventsLimit = c8f.A02();
            } else {
                int currentCounter = A00(str, i10, c7j);
                if (eventsLimit < currentCounter) {
                    eventsLimit = currentCounter;
                }
            }
            if (customLimit >= eventsLimit) {
                if (A06.contains(Integer.valueOf(customLimit)) && c8f.A0D()) {
                    A05(c7j, i10, customLimit);
                }
                A00.put(i10, customLimit + 1);
                return true;
            }
            A00.put(i10, customLimit + 1);
            return false;
        }
        return true;
    }
}
