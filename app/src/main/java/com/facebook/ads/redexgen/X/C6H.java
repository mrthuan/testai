package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.6H  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C6H {
    public static byte[] A00;
    public static String[] A01 = {"T8", "", "As3hIStO2xNa0GSSHrkEVjQu", "DXoFAMJTZKDaTyX0if7pZrkyLA7XvGsC", "niDMG5wZxQy0H8acRFWa8hH2XuraMrTN", "878XRXnWNCNw6FCwqGtfz4QO6Hd03tfb", "ID5FT62NpqbpmPra08cWCCHJVsi2pDHC", "txdj"};
    public static final AtomicReference<C6F> A02;
    public static final AtomicReference<String> A03;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[7].length() != 4) {
                throw new RuntimeException();
            }
            A01[6] = "PcSdqCtN9qYKSfDsPVWrfTZjyuiu0dLa";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 86);
            i13++;
        }
    }

    public static void A05() {
        A00 = new byte[]{19, Field.NUMWORDS, 22, 17, 33, Field.DATA, 23, 36, 36, Field.NUMWORDS, 22, 23, 17, 15, 24, 15, Field.NUMCHARS, 19, 13, 43, Field.ASK, Field.DATA, Field.QUOTE, 33, Field.EQ, 56, Field.FILLIN, Field.AUTONUMOUT, Field.AUTONUMOUT, 43, Field.ASK, Field.FILLIN};
    }

    static {
        A05();
        A02 = new AtomicReference<>();
        A03 = new AtomicReference<>(A04(0, 0, 12));
    }

    public static C6F A00() {
        C6F advertisingIdInfo = A02.get();
        if (advertisingIdInfo == null) {
            return C6F.A00();
        }
        return advertisingIdInfo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
        if (android.text.TextUtils.isEmpty(r6.A03()) != false) goto L2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.X.C6F A01(com.facebook.ads.redexgen.X.C7j r5, com.facebook.ads.redexgen.X.C6F r6) {
        /*
            if (r6 == 0) goto Lc
            java.lang.String r0 = r6.A03()     // Catch: java.lang.Throwable -> L11
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L29
        Lc:
            com.facebook.ads.redexgen.X.6F r0 = com.facebook.ads.redexgen.X.C6N.A00(r5)     // Catch: java.lang.Throwable -> L11
            return r0
        L11:
            r0 = move-exception
            com.facebook.ads.redexgen.X.8D r5 = r5.A07()
            int r4 = com.facebook.ads.redexgen.X.C8E.A1Q
            com.facebook.ads.redexgen.X.8F r3 = new com.facebook.ads.redexgen.X.8F
            r3.<init>(r0)
            r2 = 12
            r1 = 7
            r0 = 84
            java.lang.String r0 = A04(r2, r1, r0)
            r5.AA0(r0, r4, r3)
        L29:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C6H.A01(com.facebook.ads.redexgen.X.7j, com.facebook.ads.redexgen.X.6F):com.facebook.ads.redexgen.X.6F");
    }

    public static C6F A02(C7j c7j, C6F c6f, C6G c6g) {
        C6I c6i = null;
        try {
            if (AbstractC0876Il.A06(c7j) && (c6f == null || TextUtils.isEmpty(c6f.A03()))) {
                c6i = C6J.A00(c7j.getContentResolver());
            }
        } catch (Throwable th2) {
            c7j.A07().AA0(A04(12, 7, 84), C8E.A1S, new C8F(th2));
        }
        if (c6i != null && c6i.A01 != null) {
            A03.set(c6i.A01);
            c6g.A05(c6i.A01);
        }
        if (c6f == null && c6i != null && !TextUtils.isEmpty(c6i.A00)) {
            return new C6F(c6i.A00, c6i.A02, C6E.A04);
        }
        return c6f;
    }

    public static String A03() {
        String attributionId = A03.get();
        if (attributionId == null) {
            return A04(0, 0, 12);
        }
        return attributionId;
    }

    public static void A06(C6G c6g) {
        A02.set(c6g.A02());
        A03.set(c6g.A03());
    }

    public static void A07(C7j c7j) {
        long j10;
        C6F advertisingIdInfo;
        try {
            C6G c6g = new C6G(c7j);
            A06(c6g);
            if (A08()) {
                return;
            }
            C6F advertisingIdInfo2 = A02.get();
            if (advertisingIdInfo2 != null && !TextUtils.isEmpty(advertisingIdInfo2.A03())) {
                j10 = advertisingIdInfo2.A01();
            } else {
                j10 = -1;
            }
            if (j10 > 0 && System.currentTimeMillis() - j10 < AbstractC0876Il.A00(c7j)) {
                return;
            }
            if (AbstractC0876Il.A07(c7j)) {
                advertisingIdInfo = A01(c7j, A02(c7j, null, c6g));
            } else {
                advertisingIdInfo = A02(c7j, A01(c7j, null), c6g);
            }
            if (advertisingIdInfo != null && !TextUtils.isEmpty(advertisingIdInfo.A03())) {
                A02.set(advertisingIdInfo);
                c6g.A04(advertisingIdInfo);
            }
        } catch (Throwable t4) {
            c7j.A07().AA0(A04(12, 7, 84), C8E.A1R, new C8F(t4));
        }
    }

    public static boolean A08() {
        boolean z10 = false;
        boolean updated = L7.A04();
        if (updated) {
            String A04 = A04(0, 12, 92);
            boolean updated2 = L7.A05(A04);
            if (updated2) {
                A03.set(L7.A01(A04));
                z10 = true;
            }
        }
        boolean A042 = L7.A04();
        if (A01[7].length() != 4) {
            throw new RuntimeException();
        }
        A01[6] = "Cpq5b7Aomj18wFHDN8BPNJlk9AiHAVMm";
        if (A042) {
            String A043 = A04(19, 13, 108);
            boolean updated3 = L7.A05(A043);
            if (updated3) {
                String A012 = L7.A01(A043);
                AtomicReference<C6F> atomicReference = A02;
                if (A012 == null) {
                    if (A01[7].length() != 4) {
                        A01[7] = "Ywke";
                        A012 = A04(0, 0, 2);
                    } else {
                        A01[5] = "aB8iQRCNNWTx0AWcZvgXlT81SikGsrWB";
                        A012 = A04(0, 0, 12);
                    }
                }
                atomicReference.set(new C6F(A012, false, C6E.A03));
                return true;
            }
            return z10;
        }
        return z10;
    }
}
