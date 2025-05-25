package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class GV implements Comparable<GV> {
    public final int A00;
    public final GR A01;

    public GV(int i10, GR gr) {
        this.A00 = i10;
        this.A01 = gr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00 */
    public final int compareTo(GV gv) {
        return this.A00 - gv.A00;
    }
}
