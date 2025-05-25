package com.facebook.ads.redexgen.X;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;

/* loaded from: assets/audience_network.dex */
public class CG extends C1375as {
    public static String[] A01 = {"5vbH5h", OperatorName.SET_LINE_CAPSTYLE, "C4GDfN5QjjsYSTm6MxZFmUsCMcA9wBBJ", "6VFwzkwOMMM2Di2Z85K5QmwqwgWhrd8W", "uhhUuQP5WsjWPtKrx", "v18Pv4VwePGedZr395LFzqQB6yfdWBSj", "eHjrumjSh1wPfIUStRl2rH8Zl9vSSm7d", "psLA63BrOeuZ89bQmrhMweOfIVNK7DGd"};
    public final /* synthetic */ CD A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.C1375as
    public final int A0O(View view, int i10) {
        int i11;
        AbstractC05484o A08 = A08();
        if (A08.A20()) {
            C05494p c05494p = (C05494p) view.getLayoutParams();
            int A0N = A0N(A08.A0k(view) - c05494p.leftMargin, A08.A0n(view) + c05494p.rightMargin, A08.A0e(), A08.A0h() - A08.A0f(), i10);
            i11 = this.A00.A02;
            int i12 = A0N + i11;
            if (A01[0].length() != 6) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[6] = "LE8phwfR0RxAHMOOl0X9IEx3wOgwcDNd";
            strArr[7] = "Bj9ROfqsKQjGAcpCTsOWpU0U4DTJlpud";
            return i12;
        }
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CG(CD cd2, C1314Zs c1314Zs) {
        super(c1314Zs);
        this.A00 = cd2;
    }

    @Override // com.facebook.ads.redexgen.X.C1375as
    public final float A0J(DisplayMetrics displayMetrics) {
        float f10;
        f10 = this.A00.A00;
        return f10 / displayMetrics.densityDpi;
    }

    @Override // com.facebook.ads.redexgen.X.C1375as
    public final int A0K() {
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.C1375as
    public final PointF A0P(int i10) {
        return this.A00.A4k(i10);
    }
}
