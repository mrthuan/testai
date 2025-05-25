package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lib.zj.office.fc.hwpf.usermodel.Field;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Jz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0912Jz implements SF {
    public static byte[] A05;
    public JSONObject A00;
    public JSONObject A01;
    public final SG A03;
    public final List<SH> A04 = new ArrayList();
    public boolean A02 = false;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 29);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-74, -23, -30, -40, -32, -39, -108, -103, -25, -108, -40, -43, -24, -43, -108, -23, -28, -40, -43, -24, -39, -82, 126, -98, -98, -108, -40, -43, -24, -43, -108, -98, -98, 126, -103, -25, 126, -98, -98, -108, -38, -35, -30, -37, -39, -26, -28, -26, -35, -30, -24, -108, -98, -98, 126, -103, -25, 122, -83, -90, -100, -92, -99, Field.HYPERLINK, -96, -103, -85, Field.HYPERLINK, -90, -89, Field.HYPERLINK, -98, -95, -90, -97, -99, -86, -88, -86, -95, -90, -84, 111, -94, -101, -111, -103, -110, 77, -106, -96, 77, -101, -100, -95, 77, -97, -110, -114, -111, -90, -31, -34, -15, -34, -99, -70, -70, -99, -21, -14, -23, -23, -46, -43, -38, -45, -47, -34, -36, -34, -43, -38, -32, -116, -115, -87, -116, -38, -31, -40, -40, -106, -103, -98, -105, -107, -94, -96, -94, -103, -98, -92, 80, 109, 109, 80, -98, -91, -100, -100, -39, -32, -41, -41};
    }

    public C0912Jz(SG sg2) {
        this.A03 = sg2;
    }

    private boolean A02(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return false;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return true;
        }
        return true ^ SE.A02(jSONObject, jSONObject2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r10.A03.A05() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ac, code lost:
        throw new java.lang.IllegalArgumentException(A00(113, 19, 79));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean A03(org.json.JSONObject r11, org.json.JSONObject r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            if (r11 == 0) goto Lad
            if (r12 != 0) goto L1e
            com.facebook.ads.redexgen.X.SG r0 = r10.A03     // Catch: java.lang.Throwable -> Lbd
            boolean r0 = r0.A05()     // Catch: java.lang.Throwable -> Lbd
            if (r0 != 0) goto Le
            goto L1e
        Le:
            r2 = 132(0x84, float:1.85E-43)
            r1 = 19
            r0 = 19
            java.lang.String r0 = A00(r2, r1, r0)     // Catch: java.lang.Throwable -> Lbd
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lbd
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lbd
            throw r1     // Catch: java.lang.Throwable -> Lbd
        L1e:
            if (r12 == 0) goto L28
            com.facebook.ads.redexgen.X.SG r0 = r10.A03     // Catch: java.lang.Throwable -> Lbd
            boolean r0 = r0.A05()     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto L9d
        L28:
            org.json.JSONObject r0 = r10.A01     // Catch: java.lang.Throwable -> Lbd
            boolean r0 = r10.A02(r0, r12)     // Catch: java.lang.Throwable -> Lbd
            r9 = 0
            if (r0 != 0) goto L39
            org.json.JSONObject r0 = r10.A00     // Catch: java.lang.Throwable -> Lbd
            boolean r0 = r10.A02(r0, r11)     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto L9b
        L39:
            r10.A00 = r11     // Catch: java.lang.Throwable -> Lbd
            r10.A01 = r12     // Catch: java.lang.Throwable -> Lbd
            r8 = 1
            r10.A02 = r8     // Catch: java.lang.Throwable -> Lbd
            java.util.List<com.facebook.ads.redexgen.X.SH> r0 = r10.A04     // Catch: java.lang.Throwable -> Lbd
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> Lbd
        L46:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto L56
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> Lbd
            com.facebook.ads.redexgen.X.SH r0 = (com.facebook.ads.redexgen.X.SH) r0     // Catch: java.lang.Throwable -> Lbd
            r0.A4R()     // Catch: java.lang.Throwable -> Lbd
            goto L46
        L56:
            java.util.Locale r7 = java.util.Locale.US     // Catch: org.json.JSONException -> L99 java.lang.Throwable -> Lbd
            r2 = 0
            r1 = 57
            r0 = 87
            java.lang.String r0 = A00(r2, r1, r0)     // Catch: org.json.JSONException -> L99 java.lang.Throwable -> Lbd
            com.facebook.ads.redexgen.X.SG r6 = r10.A03     // Catch: org.json.JSONException -> L99 java.lang.Throwable -> Lbd
            org.json.JSONObject r1 = r10.A00     // Catch: org.json.JSONException -> L99 java.lang.Throwable -> Lbd
            r5 = 2
            if (r1 != 0) goto L92
            r3 = 151(0x97, float:2.12E-43)
            r2 = 4
            r1 = 78
            java.lang.String r1 = A00(r3, r2, r1)     // Catch: org.json.JSONException -> L99 java.lang.Throwable -> Lbd
        L71:
            org.json.JSONObject r2 = r10.A01     // Catch: org.json.JSONException -> L99 java.lang.Throwable -> Lbd
            if (r2 != 0) goto L8b
            r4 = 151(0x97, float:2.12E-43)
            r3 = 4
            r2 = 78
            java.lang.String r2 = A00(r4, r3, r2)     // Catch: org.json.JSONException -> L99 java.lang.Throwable -> Lbd
        L7e:
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: org.json.JSONException -> L99 java.lang.Throwable -> Lbd
            r3[r9] = r6     // Catch: org.json.JSONException -> L99 java.lang.Throwable -> Lbd
            r3[r8] = r1     // Catch: org.json.JSONException -> L99 java.lang.Throwable -> Lbd
            r3[r5] = r2     // Catch: org.json.JSONException -> L99 java.lang.Throwable -> Lbd
            java.lang.String.format(r7, r0, r3)     // Catch: org.json.JSONException -> L99 java.lang.Throwable -> Lbd
            goto L99
        L8b:
            org.json.JSONObject r2 = r10.A01     // Catch: org.json.JSONException -> L99 java.lang.Throwable -> Lbd
            java.lang.String r2 = r2.toString(r5)     // Catch: org.json.JSONException -> L99 java.lang.Throwable -> Lbd
            goto L7e
        L92:
            org.json.JSONObject r1 = r10.A00     // Catch: org.json.JSONException -> L99 java.lang.Throwable -> Lbd
            java.lang.String r1 = r1.toString(r5)     // Catch: org.json.JSONException -> L99 java.lang.Throwable -> Lbd
            goto L71
        L99:
            monitor-exit(r10)
            return r8
        L9b:
            monitor-exit(r10)
            return r9
        L9d:
            r2 = 113(0x71, float:1.58E-43)
            r1 = 19
            r0 = 79
            java.lang.String r0 = A00(r2, r1, r0)     // Catch: java.lang.Throwable -> Lbd
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lbd
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lbd
            throw r1     // Catch: java.lang.Throwable -> Lbd
        Lad:
            r2 = 101(0x65, float:1.42E-43)
            r1 = 12
            r0 = 96
            java.lang.String r0 = A00(r2, r1, r0)     // Catch: java.lang.Throwable -> Lbd
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lbd
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lbd
            throw r1     // Catch: java.lang.Throwable -> Lbd
        Lbd:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0912Jz.A03(org.json.JSONObject, org.json.JSONObject):boolean");
    }

    @Override // com.facebook.ads.redexgen.X.SF
    public final synchronized void A3n(SH sh2) {
        this.A04.add(sh2);
    }

    @Override // com.facebook.ads.redexgen.X.SF
    public final synchronized JSONObject A75() {
        if (this.A00 != null) {
        } else {
            throw new IllegalStateException(A00(82, 19, 16));
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.SF
    public final synchronized JSONObject A7T() {
        if (this.A03.A05()) {
            if (this.A01 != null) {
            } else {
                throw new IllegalStateException(A00(82, 19, 16));
            }
        } else {
            throw new IllegalStateException(A00(57, 25, 27));
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.SF
    public final SG A7Y() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.SF
    public final synchronized boolean A9b() {
        return this.A02;
    }
}
