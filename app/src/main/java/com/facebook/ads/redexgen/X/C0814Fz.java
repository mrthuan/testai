package com.facebook.ads.redexgen.X;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Fz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0814Fz {
    public static String[] A08 = {"NNB71xZWHcIAwa9uUtpvwNL455Xxeezs", "7QOt3X2j", "TEDKkRRul1WFzr82L9WTKNimJ5QIfSph", "GWtDxnTfe2ZoKDGEH1yJGGpEeFzji6Jf", "njyHzmlo1StOJj3vanJMJLtGSQUoz0PU", "cTvWCqBujMq", "198fKajelm", "8OSCnn3izS8kyTjbgbfvgF"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final List<C0813Fy> A06 = new ArrayList();
    public final List<SpannableString> A07 = new ArrayList();
    public final StringBuilder A05 = new StringBuilder();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.X.C0807Fs A05() {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0814Fz.A05():com.facebook.ads.redexgen.X.Fs");
    }

    public C0814Fz(int i10, int i11) {
        A09(i10);
        A0A(i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a4, code lost:
        if (r11 == (-1)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a6, code lost:
        if (r5 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
        r11 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b1, code lost:
        if (r11 == (-1)) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.text.SpannableString A00() {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0814Fz.A00():android.text.SpannableString");
    }

    public static void A01(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
        spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
    }

    public static void A02(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
        spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
    }

    public static void A03(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
        if (i12 == -1) {
            return;
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
    }

    public final int A04() {
        return this.A03;
    }

    public final void A06() {
        int length = this.A05.length();
        if (length > 0) {
            int length2 = length - 1;
            this.A05.delete(length2, length);
            int length3 = this.A06.size();
            for (int i10 = length3 - 1; i10 >= 0; i10--) {
                C0813Fy c0813Fy = this.A06.get(i10);
                int length4 = c0813Fy.A00;
                if (length4 == length) {
                    int length5 = c0813Fy.A00;
                    c0813Fy.A00 = length5 - 1;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0022 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A07() {
        /*
            r3 = this;
            java.util.List<android.text.SpannableString> r1 = r3.A07
            android.text.SpannableString r0 = r3.A00()
            r1.add(r0)
            java.lang.StringBuilder r0 = r3.A05
            r2 = 0
            r0.setLength(r2)
            java.util.List<com.facebook.ads.redexgen.X.Fy> r0 = r3.A06
            r0.clear()
            int r1 = r3.A01
            int r0 = r3.A03
            int r1 = java.lang.Math.min(r1, r0)
        L1c:
            java.util.List<android.text.SpannableString> r0 = r3.A07
            int r0 = r0.size()
            if (r0 < r1) goto L2a
            java.util.List<android.text.SpannableString> r0 = r3.A07
            r0.remove(r2)
            goto L1c
        L2a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0814Fz.A07():void");
    }

    public final void A08(char c) {
        this.A05.append(c);
    }

    public final void A09(int i10) {
        this.A00 = i10;
        this.A06.clear();
        this.A07.clear();
        this.A05.setLength(0);
        this.A03 = 15;
        this.A02 = 0;
        this.A04 = 0;
    }

    public final void A0A(int i10) {
        this.A01 = i10;
    }

    public final void A0B(int i10) {
        this.A02 = i10;
    }

    public final void A0C(int i10) {
        this.A03 = i10;
    }

    public final void A0D(int i10) {
        this.A04 = i10;
    }

    public final void A0E(int i10, boolean z10) {
        this.A06.add(new C0813Fy(i10, z10, this.A05.length()));
    }

    public final boolean A0F() {
        return this.A06.isEmpty() && this.A07.isEmpty() && this.A05.length() == 0;
    }

    public final String toString() {
        return this.A05.toString();
    }
}
