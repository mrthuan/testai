package com.bytedance.adsdk.lottie.fl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MaskParser.java */
/* loaded from: classes.dex */
public class CQU {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
        if (r0.equals("s") == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.bytedance.adsdk.lottie.ac.cJ.hm Qhi(android.util.JsonReader r11, com.bytedance.adsdk.lottie.ROR r12) {
        /*
            r11.beginObject()
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r2
            r4 = r1
        L8:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto Lbb
            java.lang.String r5 = r11.nextName()
            r5.getClass()
            int r6 = r5.hashCode()
            r7 = 3
            r8 = 2
            r9 = 1
            r10 = -1
            switch(r6) {
                case 111: goto L43;
                case 3588: goto L38;
                case 104433: goto L2d;
                case 3357091: goto L22;
                default: goto L20;
            }
        L20:
            r5 = r10
            goto L4d
        L22:
            java.lang.String r6 = "mode"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L2b
            goto L20
        L2b:
            r5 = r7
            goto L4d
        L2d:
            java.lang.String r6 = "inv"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L36
            goto L20
        L36:
            r5 = r8
            goto L4d
        L38:
            java.lang.String r6 = "pt"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L41
            goto L20
        L41:
            r5 = r9
            goto L4d
        L43:
            java.lang.String r6 = "o"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L4c
            goto L20
        L4c:
            r5 = r1
        L4d:
            switch(r5) {
                case 0: goto Lb5;
                case 1: goto Laf;
                case 2: goto La9;
                case 3: goto L54;
                default: goto L50;
            }
        L50:
            r11.skipValue()
            goto L8
        L54:
            java.lang.String r0 = r11.nextString()
            r0.getClass()
            int r5 = r0.hashCode()
            switch(r5) {
                case 97: goto L83;
                case 105: goto L78;
                case 110: goto L6d;
                case 115: goto L64;
                default: goto L62;
            }
        L62:
            r7 = r10
            goto L8d
        L64:
            java.lang.String r5 = "s"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L8d
            goto L62
        L6d:
            java.lang.String r5 = "n"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L76
            goto L62
        L76:
            r7 = r8
            goto L8d
        L78:
            java.lang.String r5 = "i"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L81
            goto L62
        L81:
            r7 = r9
            goto L8d
        L83:
            java.lang.String r5 = "a"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L8c
            goto L62
        L8c:
            r7 = r1
        L8d:
            switch(r7) {
                case 0: goto La5;
                case 1: goto L9c;
                case 2: goto L98;
                case 3: goto L94;
                default: goto L90;
            }
        L90:
            com.bytedance.adsdk.lottie.ac.cJ.hm$Qhi r0 = com.bytedance.adsdk.lottie.ac.cJ.hm.Qhi.MASK_MODE_ADD
            goto L8
        L94:
            com.bytedance.adsdk.lottie.ac.cJ.hm$Qhi r0 = com.bytedance.adsdk.lottie.ac.cJ.hm.Qhi.MASK_MODE_SUBTRACT
            goto L8
        L98:
            com.bytedance.adsdk.lottie.ac.cJ.hm$Qhi r0 = com.bytedance.adsdk.lottie.ac.cJ.hm.Qhi.MASK_MODE_NONE
            goto L8
        L9c:
            java.lang.String r0 = "Animation contains intersect masks. They are not supported but will be treated like add masks."
            r12.Qhi(r0)
            com.bytedance.adsdk.lottie.ac.cJ.hm$Qhi r0 = com.bytedance.adsdk.lottie.ac.cJ.hm.Qhi.MASK_MODE_INTERSECT
            goto L8
        La5:
            com.bytedance.adsdk.lottie.ac.cJ.hm$Qhi r0 = com.bytedance.adsdk.lottie.ac.cJ.hm.Qhi.MASK_MODE_ADD
            goto L8
        La9:
            boolean r4 = r11.nextBoolean()
            goto L8
        Laf:
            com.bytedance.adsdk.lottie.ac.Qhi.hm r2 = com.bytedance.adsdk.lottie.fl.fl.fl(r11, r12)
            goto L8
        Lb5:
            com.bytedance.adsdk.lottie.ac.Qhi.fl r3 = com.bytedance.adsdk.lottie.fl.fl.cJ(r11, r12)
            goto L8
        Lbb:
            r11.endObject()
            com.bytedance.adsdk.lottie.ac.cJ.hm r11 = new com.bytedance.adsdk.lottie.ac.cJ.hm
            r11.<init>(r0, r2, r3, r4)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.lottie.fl.CQU.Qhi(android.util.JsonReader, com.bytedance.adsdk.lottie.ROR):com.bytedance.adsdk.lottie.ac.cJ.hm");
    }
}
