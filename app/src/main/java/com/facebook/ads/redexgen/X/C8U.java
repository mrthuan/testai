package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.8U  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C8U {
    public static byte[] A04;
    public final String A00;
    public final String A01;
    public final Map<C8Y, List<String>> A02 = new HashMap();
    public final JSONObject A03;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 6);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{Field.ADDIN, Field.BIDIOUTLINE, Field.DOCPROPERTY, 64, 113, 118, 104};
    }

    /* JADX WARN: Incorrect condition in loop: B:12:0x0035 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C8U(java.lang.String r7, java.lang.String r8, org.json.JSONObject r9, org.json.JSONArray r10) {
        /*
            r6 = this;
            r6.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r6.A02 = r0
            r6.A00 = r7
            r6.A01 = r8
            r6.A03 = r9
            if (r10 == 0) goto L18
            int r0 = r10.length()
            if (r0 != 0) goto L19
        L18:
            return
        L19:
            com.facebook.ads.redexgen.X.8Y[] r5 = com.facebook.ads.redexgen.X.C8Y.values()
            int r4 = r5.length
            r3 = 0
        L1f:
            if (r3 >= r4) goto L30
            r2 = r5[r3]
            java.util.Map<com.facebook.ads.redexgen.X.8Y, java.util.List<java.lang.String>> r1 = r6.A02
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.put(r2, r0)
            int r3 = r3 + 1
            goto L1f
        L30:
            r4 = 0
        L31:
            int r0 = r10.length()
            if (r4 >= r0) goto L72
            org.json.JSONObject r5 = r10.getJSONObject(r4)     // Catch: java.lang.Exception -> L6f
            r2 = 0
            r1 = 4
            r0 = 35
            java.lang.String r0 = A00(r2, r1, r0)     // Catch: java.lang.Exception -> L6f
            java.lang.String r3 = r5.getString(r0)     // Catch: java.lang.Exception -> L6f
            r2 = 4
            r1 = 3
            r0 = 2
            java.lang.String r0 = A00(r2, r1, r0)     // Catch: java.lang.Exception -> L6f
            java.lang.String r2 = r5.getString(r0)     // Catch: java.lang.Exception -> L6f
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.Exception -> L6f
            java.lang.String r0 = r3.toUpperCase(r0)     // Catch: java.lang.Exception -> L6f
            com.facebook.ads.redexgen.X.8Y r1 = com.facebook.ads.redexgen.X.C8Y.valueOf(r0)     // Catch: java.lang.Exception -> L6f
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L6f
            if (r0 != 0) goto L6f
            java.util.Map<com.facebook.ads.redexgen.X.8Y, java.util.List<java.lang.String>> r0 = r6.A02     // Catch: java.lang.Exception -> L6f
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L6f
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L6f
            if (r0 == 0) goto L6f
            r0.add(r2)     // Catch: java.lang.Exception -> L6f
        L6f:
            int r4 = r4 + 1
            goto L31
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C8U.<init>(java.lang.String, java.lang.String, org.json.JSONObject, org.json.JSONArray):void");
    }

    public final String A02() {
        return this.A00;
    }

    public final List<String> A03(C8Y c8y) {
        return this.A02.get(c8y);
    }

    public final JSONObject A04() {
        return this.A03;
    }
}
