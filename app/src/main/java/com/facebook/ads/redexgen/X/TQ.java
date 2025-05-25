package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class TQ extends AbstractC05364c<TK> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public MQ A04;
    public MR A05;
    public String A06;
    public List<QK> A07;
    public boolean A08;
    public final SparseBooleanArray A09 = new SparseBooleanArray();
    public final AbstractC1456cD A0A;
    public final C05906f A0B;
    public final C1314Zs A0C;
    public final J7 A0D;
    public final C0957Lv A0E;
    public final TV A0F;
    public final C1102Rk A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public TQ(C1314Zs c1314Zs, List<QK> list, AbstractC1456cD abstractC1456cD, J7 j72, C05906f c05906f, C1102Rk c1102Rk, C0957Lv c0957Lv, MR mr, String str, int i10, int i11, int i12, int i13, TV tv, MQ mq) {
        this.A0C = c1314Zs;
        this.A0D = j72;
        this.A0B = c05906f;
        this.A0G = c1102Rk;
        this.A0E = c0957Lv;
        this.A05 = mr;
        this.A0A = abstractC1456cD;
        this.A07 = list;
        this.A00 = i10;
        this.A03 = i13;
        this.A06 = str;
        this.A01 = i12;
        this.A02 = i11;
        this.A0F = tv;
        this.A04 = mq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC05364c
    /* renamed from: A01 */
    public final TK A0C(ViewGroup viewGroup, int i10) {
        return new TK(PN.A00(new C1025Ol(this.A0C, this.A0D, this.A05, this.A0A, null, this.A0G, this.A0E).A0J(this.A04).A0M(), this.A03, this.A06, this.A0F), this.A09, this.A0G, this.A00, this.A01, this.A02, this.A07.size(), this.A0C, this.A0A.A1Q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC05364c
    /* renamed from: A02 */
    public final void A0D(TK tk2, int i10) {
        tk2.A0j(this.A07.get(i10), this.A0D, this.A0B, this.A0E, this.A06);
        if (!this.A08 && i10 == 0) {
            tk2.AGH();
            this.A08 = true;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05364c
    public final int A0E() {
        return this.A07.size();
    }
}
