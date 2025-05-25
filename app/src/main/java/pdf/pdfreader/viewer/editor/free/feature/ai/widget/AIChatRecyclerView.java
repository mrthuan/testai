package pdf.pdfreader.viewer.editor.free.feature.ai.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import kotlin.Pair;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIChatRecyclerView$smoothScroller$2;
import pdf.pdfreader.viewer.editor.free.utils.n0;
import qb.f1;

/* compiled from: AIChatRecyclerView.kt */
/* loaded from: classes3.dex */
public final class AIChatRecyclerView extends RecyclerView {
    public static final /* synthetic */ int L0 = 0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public g G0;
    public final int H0;
    public final tf.c I0;
    public int J0;
    public int K0;

    static {
        ea.a.p("ckkIaBJ0MGUReVdsDHIAaSF3", "5atEG0Mw");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AIChatRecyclerView(Context context) {
        this(context, null, 6, 0);
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "31ROreaM"));
    }

    private final v getSmoothScroller() {
        return (v) this.I0.getValue();
    }

    public final boolean A0(int i10) {
        LinearLayoutManager linearLayoutManager;
        RecyclerView.m layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        if (linearLayoutManager == null) {
            return false;
        }
        int Y0 = linearLayoutManager.Y0();
        int Z0 = linearLayoutManager.Z0();
        if (Y0 > i10 || i10 > Z0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B0() {
        /*
            r6 = this;
            java.lang.String r0 = "LnVFbypjRW82bB5hZw=="
            java.lang.String r1 = "usDtCJD1"
            ea.a.p(r0, r1)
            int r1 = r6.J0
            boolean r2 = r6.D0
            java.lang.String r3 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a
            if (r2 == 0) goto L11
            return
        L11:
            java.lang.String r2 = "sVAyNTOf"
            r3 = 0
            if (r1 >= 0) goto L24
            java.lang.String r1 = "XW8_IB9vA2QbblNBB3MhZTZQXXMvdCpvbg=="
            java.lang.String r4 = "yAiIKEr0"
            ea.a.p(r1, r4)
            ea.a.p(r0, r2)
            r6.E0 = r3
            return
        L24:
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = r6.getAdapter()
            boolean r4 = r1 instanceof pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a
            if (r4 == 0) goto L2f
            pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a r1 = (pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a) r1
            goto L30
        L2f:
            r1 = 0
        L30:
            r4 = 1
            if (r1 == 0) goto L48
            int r5 = r6.J0
            java.util.ArrayList r1 = r1.f24676e
            java.lang.Object r1 = kotlin.collections.m.t0(r5, r1)
            km.a r1 = (km.a) r1
            if (r1 == 0) goto L43
            boolean r1 = r1.f19895y
            r1 = r1 ^ r4
            goto L44
        L43:
            r1 = r3
        L44:
            if (r1 != 0) goto L48
            r1 = r4
            goto L49
        L48:
            r1 = r3
        L49:
            if (r1 == 0) goto L4c
            return
        L4c:
            int r1 = r6.J0
            boolean r1 = r6.A0(r1)
            if (r1 != 0) goto L61
            java.lang.String r1 = "JnN4dBxtYWkpaShsECBVIFNhAnNl"
            java.lang.String r4 = "PZt11t4t"
            ea.a.p(r1, r4)
            ea.a.p(r0, r2)
            r6.E0 = r3
            return
        L61:
            androidx.recyclerview.widget.RecyclerView$m r1 = r6.getLayoutManager()
            if (r1 == 0) goto L6d
            int r1 = r1.M()
            int r3 = r1 + (-1)
        L6d:
            int r1 = r6.J0
            if (r1 != r3) goto L85
            boolean r1 = r6.canScrollVertically(r4)
            if (r1 != 0) goto L85
            java.lang.String r1 = "gLWcNXTE"
            ea.a.p(r0, r1)
            java.lang.String r0 = "E287ZR0gA3UGbxRzCnI5bGw="
            java.lang.String r1 = "oN15DM3l"
            ea.a.p(r0, r1)
            r6.E0 = r4
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIChatRecyclerView.B0():void");
    }

    public final void C0(int i10) {
        ea.a.p("LnVFbypjRW82bB5hZw==", "YyKkPWuw");
        if (i10 <= 0 || this.D0) {
            return;
        }
        post(new n0.h(this, i10, 1));
    }

    public final void D0() {
        LinearLayoutManager linearLayoutManager;
        ea.a.p("LnVFbypjRW82bB5hZw==", "wVIf84tt");
        ea.a.p("PGNDbxVsY28Ybz50Gm0=", "EeTLXhhy");
        String str = n0.f28727a;
        this.D0 = false;
        RecyclerView.m layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        if (linearLayoutManager != null) {
            getSmoothScroller().f4320a = linearLayoutManager.M() - 1;
            linearLayoutManager.M0(getSmoothScroller());
        }
    }

    public final g getStateListener() {
        return this.G0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void h0(int i10) {
        boolean z10;
        LinearLayoutManager linearLayoutManager;
        if (i10 == 1) {
            this.D0 = true;
            ea.a.p("LnVFbypjRW82bB5hZw==", "obFEBG3l");
            ea.a.p("RnMuIAB0A3IGIEBvHGM-7_iMEmMnbiBlHCACdT9vR3NQciRsbA==", "pcKgXc90");
            String str = n0.f28727a;
        }
        if (i10 != 1 && i10 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.F0 = z10;
        if (i10 == 0) {
            B0();
            z0();
            if (!canScrollVertically(1)) {
                this.D0 = false;
                ea.a.p("LnVFbypjRW82bB5hZw==", "cURF3eV4");
                ea.a.p("HXNcICN0KnBodAl1V2h3JhhiPXQ9b1sg", "pUh9PEeR");
                String str2 = n0.f28727a;
            }
            if (this.K0 != -1) {
                RecyclerView.m layoutManager = getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    linearLayoutManager = (LinearLayoutManager) layoutManager;
                } else {
                    linearLayoutManager = null;
                }
                if (linearLayoutManager != null) {
                    int Z0 = linearLayoutManager.Z0();
                    int i11 = this.K0;
                    if (Z0 == i11 - 1 || Z0 == i11) {
                        u0(i11);
                    }
                }
                this.K0 = -1;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        LinearLayoutManager linearLayoutManager;
        int Y0;
        View C;
        super.onSizeChanged(i10, i11, i12, i13);
        RecyclerView.m layoutManager = getLayoutManager();
        Pair pair = null;
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        if (linearLayoutManager != null && (Y0 = linearLayoutManager.Y0()) != -1 && (C = linearLayoutManager.C(Y0)) != null) {
            pair = new Pair(Integer.valueOf(Y0), Integer.valueOf(i13 - C.getTop()));
        }
        if (pair != null) {
            post(new f1(this, i11, pair, 2));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.m mVar) {
        super.setLayoutManager(mVar);
        z0();
    }

    public final void setStateListener(g gVar) {
        this.G0 = gVar;
        z0();
    }

    public final void z0() {
        post(new androidx.activity.b(this, 28));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AIChatRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "FgB6NiG0"));
    }

    public /* synthetic */ AIChatRecyclerView(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? R.attr.recyclerViewStyle : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIChatRecyclerView(final Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.g.e(context, ea.a.p("F28AdCF4dA==", "qytnDQ7R"));
        this.E0 = true;
        this.H0 = context.getResources().getDimensionPixelSize(R.dimen.dp_20);
        this.I0 = kotlin.a.a(new cg.a<AIChatRecyclerView$smoothScroller$2.a>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIChatRecyclerView$smoothScroller$2

            /* compiled from: AIChatRecyclerView.kt */
            /* loaded from: classes3.dex */
            public static final class a extends v {
                @Override // androidx.recyclerview.widget.v
                public final float i(DisplayMetrics displayMetrics) {
                    kotlin.jvm.internal.g.e(displayMetrics, "displayMetrics");
                    return 10.0f / displayMetrics.densityDpi;
                }

                @Override // androidx.recyclerview.widget.v
                public final int k() {
                    return 1;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cg.a
            public final a invoke() {
                return new a(context);
            }
        });
        this.J0 = -1;
        this.K0 = -1;
    }
}
