package com.inmobi.media;

/* renamed from: com.inmobi.media.m0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1717m0 {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (r3.equals("nonvideo") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r3.equals("video") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
        if (r3.equals("audio") == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.HashMap a(java.lang.String r3, java.lang.String r4, boolean r5, org.json.JSONObject r6, byte r7) {
        /*
            java.lang.String r0 = "creativeTypeString"
            kotlin.jvm.internal.g.e(r3, r0)
            java.lang.String r0 = "customRefData"
            kotlin.jvm.internal.g.e(r4, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r3.hashCode()
            r2 = 93166550(0x58d9bd6, float:1.3316821E-35)
            if (r1 == r2) goto L35
            r2 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r1 == r2) goto L2c
            r2 = 1425678798(0x54fa21ce, float:8.594472E12)
            if (r1 == r2) goto L23
            goto L3d
        L23:
            java.lang.String r1 = "nonvideo"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L3f
            goto L3d
        L2c:
            java.lang.String r1 = "video"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L3f
            goto L3d
        L35:
            java.lang.String r1 = "audio"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L3f
        L3d:
            java.lang.String r1 = "unknown"
        L3f:
            java.lang.String r3 = "creativeType"
            r0.put(r3, r1)
            java.lang.String r3 = "customReferenceData"
            r0.put(r3, r4)
            java.lang.Byte r3 = java.lang.Byte.valueOf(r7)
            java.lang.String r4 = "impressionType"
            r0.put(r4, r3)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            if (r6 == 0) goto L77
            java.util.Iterator r4 = r6.keys()
        L5d:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L77
            java.lang.Object r7 = r4.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r1 = r6.optString(r7)
            kotlin.jvm.internal.g.b(r7)
            kotlin.jvm.internal.g.b(r1)
            r3.put(r7, r1)
            goto L5d
        L77:
            java.lang.String r4 = "macros"
            r0.put(r4, r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)
            java.lang.String r4 = "isolateVerificationScripts"
            r0.put(r4, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC1717m0.a(java.lang.String, java.lang.String, boolean, org.json.JSONObject, byte):java.util.HashMap");
    }
}
