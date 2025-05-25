package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.do  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class Cdo<ModelType, StateType> {
    public static byte[] A07;
    public static final Cdo A08;
    public String A00;
    public boolean A01;
    public final Cdo A02;
    public final ModelType A03;
    public final StateType A04;
    public final String A05;
    public final List<InterfaceC1544dr<ModelType, StateType>> A06;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 26);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{78, 113, 125, 111, 104, 119, 113, 118, 108, Field.BIDIOUTLINE, 121, 108, 121, 56, 107, 112, 119, 109, 116, 124, 56, 118, 119, 108, 56, 123, 119, 118, 108, 121, 113, 118, 56, 121, 56, 110, 113, 125, 111, 56, 121, 107, 56, 117, 119, 124, 125, 116, Field.FORMDROPDOWN, Field.HTMLCONTROL, Field.FORMTEXT, Field.SECTIONPAGES, Field.AUTOTEXT};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final void A03(InterfaceC1532dd interfaceC1532dd) {
        for (InterfaceC1544dr<ModelType, StateType> interfaceC1544dr : this.A06) {
            interfaceC1544dr.A5y(this, interfaceC1532dd);
        }
        if (interfaceC1532dd.A8h(this) == EnumC1533de.A02) {
            this.A01 = true;
        }
    }

    static {
        A02();
        A08 = new Cdo(null, null, A01(48, 5, 44), A01(48, 5, 44), Collections.emptyList(), A08);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.do != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dp != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Cdo(com.facebook.ads.redexgen.X.C1542dp<ModelType, StateType> r8) {
        /*
            r7 = this;
            java.lang.Object r1 = com.facebook.ads.redexgen.X.C1542dp.A01(r8)
            java.lang.Object r2 = com.facebook.ads.redexgen.X.C1542dp.A02(r8)
            java.lang.String r3 = com.facebook.ads.redexgen.X.C1542dp.A03(r8)
            java.lang.String r4 = com.facebook.ads.redexgen.X.C1542dp.A03(r8)
            java.util.List r0 = com.facebook.ads.redexgen.X.C1542dp.A04(r8)
            if (r0 != 0) goto L23
            java.util.List r5 = java.util.Collections.emptyList()
        L1a:
            com.facebook.ads.redexgen.X.do r6 = com.facebook.ads.redexgen.X.C1542dp.A00(r8)
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L23:
            java.util.List r5 = com.facebook.ads.redexgen.X.C1542dp.A04(r8)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.Cdo.<init>(com.facebook.ads.redexgen.X.dp):void");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.do != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public Cdo(ModelType modeltype, StateType statetype, String str, String str2, List<InterfaceC1544dr<ModelType, StateType>> list, Cdo cdo) {
        if (!(modeltype instanceof View)) {
            this.A03 = modeltype;
            this.A04 = statetype;
            this.A05 = str;
            this.A00 = str2;
            this.A02 = cdo;
            this.A01 = false;
            this.A06 = list;
            return;
        }
        throw new IllegalArgumentException(A01(0, 48, 2));
    }

    public static <ModelType, StateType> C1542dp<ModelType, StateType> A00(ModelType model, StateType state, String str) {
        return new C1542dp<>(model, state, str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.do != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public final boolean A04() {
        return this.A01;
    }
}
