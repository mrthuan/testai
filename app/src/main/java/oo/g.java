package oo;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.dialog.AIStatementDialog;
import pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: BaseBottomSheetDialog.kt */
/* loaded from: classes3.dex */
public abstract class g extends com.google.android.material.bottomsheet.b implements ComponentCallbacks {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f23537x = 0;

    /* renamed from: p  reason: collision with root package name */
    public View f23538p;

    /* renamed from: q  reason: collision with root package name */
    public ConstraintLayout f23539q;

    /* renamed from: r  reason: collision with root package name */
    public FrameLayout f23540r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f23541s;

    /* renamed from: t  reason: collision with root package name */
    public a f23542t;

    /* renamed from: u  reason: collision with root package name */
    public Boolean f23543u;

    /* renamed from: v  reason: collision with root package name */
    public Boolean f23544v;

    /* renamed from: w  reason: collision with root package name */
    public int f23545w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        this(context, (Object) null);
        kotlin.jvm.internal.g.e(context, ea.a.p("VG8AdF14dA==", "KZ7n87Md"));
    }

    public boolean A() {
        return this instanceof AIStatementDialog;
    }

    public boolean B() {
        return !(this instanceof pdf.pdfreader.viewer.editor.free.feature.billing.dialog.a);
    }

    public boolean C() {
        return this instanceof pdf.pdfreader.viewer.editor.free.ui.dialog.e;
    }

    public boolean D() {
        return !(this instanceof pdf.pdfreader.viewer.editor.free.feature.billing.dialog.a);
    }

    public float E() {
        return 0.8f;
    }

    public final void F() {
        if (!this.f23541s) {
            return;
        }
        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
        ConstraintLayout constraintLayout = this.f23539q;
        if (constraintLayout != null) {
            aVar.f(constraintLayout);
            if (C()) {
                aVar.k(R.id.container).f3373e.f3392b0 = (int) (E() * Math.max(getContext().getResources().getDisplayMetrics().widthPixels, getContext().getResources().getDisplayMetrics().heightPixels));
            } else {
                aVar.k(R.id.container).f3373e.f3392b0 = 0;
            }
            if (this.f23545w == 2) {
                aVar.k(R.id.container).f3373e.f3390a0 = (int) (Math.max(getContext().getResources().getDisplayMetrics().widthPixels, getContext().getResources().getDisplayMetrics().heightPixels) * 0.5f);
            } else {
                aVar.k(R.id.container).f3373e.f3390a0 = 0;
            }
            ConstraintLayout constraintLayout2 = this.f23539q;
            if (constraintLayout2 != null) {
                aVar.b(constraintLayout2);
                return;
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("P2FDZRd0e2Ejbz90", "kwg4jVY8"));
                throw null;
            }
        }
        kotlin.jvm.internal.g.i(ea.a.p("AWEEZVl0e2ExbxN0", "gpqv77wF"));
        throw null;
    }

    @Override // l.p, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ea.a.p("HWkQbQxzcw==", "iuycer7i");
        try {
            super.dismiss();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.g.e(newConfig, "newConfig");
        int i10 = newConfig.orientation;
        if (i10 != this.f23545w) {
            this.f23545w = i10;
            F();
        }
    }

    @Override // com.google.android.material.bottomsheet.b, l.p, androidx.activity.l, android.app.Dialog
    public void onCreate(Bundle bundle) {
        boolean B;
        boolean A;
        super.onCreate(bundle);
        this.f23545w = v();
        View inflate = View.inflate(getContext(), R.layout.dialog_bottom_container, null);
        kotlin.jvm.internal.g.c(inflate, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuDW5EbhlsLSBHeTtlU2EMZABvXWQRLjVvKnNGcidpLXQOYRBvGXRvd1pkLGUHLiFvHHNAcghpOHQIYUtvM3Q=", "bilAWzav"));
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        this.f23539q = constraintLayout;
        View findViewById = constraintLayout.findViewById(R.id.container);
        kotlin.jvm.internal.g.d(findViewById, ea.a.p("QWFAZVd0ImExbxN0GmY-blxWO2U-Qk9JECgjLjhkbGNebkZhUG4Lcik=", "2o129nlN"));
        this.f23540r = (FrameLayout) findViewById;
        LayoutInflater layoutInflater = getLayoutInflater();
        kotlin.jvm.internal.g.d(layoutInflater, ea.a.p("I2FIbwx0fm48bCt0EHI=", "GVg6hWkF"));
        FrameLayout frameLayout = this.f23540r;
        if (frameLayout != null) {
            View u7 = u(layoutInflater, frameLayout);
            if (u7 == null) {
                u7 = View.inflate(getContext(), w(), null);
                kotlin.jvm.internal.g.d(u7, ea.a.p("Wm4tbBJ0BygRb1p0DHgiLGRnV3QKYTpvH3RiZUJJICgaLGtuBmwOKQ==", "j01DDVYN"));
            }
            this.f23538p = u7;
            FrameLayout frameLayout2 = this.f23540r;
            if (frameLayout2 != null) {
                frameLayout2.addView(x(), new FrameLayout.LayoutParams(-1, -2, 81));
                ConstraintLayout constraintLayout2 = this.f23539q;
                if (constraintLayout2 != null) {
                    setContentView(constraintLayout2);
                    y();
                    z();
                    Boolean bool = this.f23543u;
                    if (bool != null) {
                        B = bool.booleanValue();
                    } else {
                        B = B();
                    }
                    setCancelable(B);
                    Boolean bool2 = this.f23544v;
                    if (bool2 != null) {
                        A = bool2.booleanValue();
                    } else {
                        A = A();
                    }
                    setCanceledOnTouchOutside(A);
                    ConstraintLayout constraintLayout3 = this.f23539q;
                    if (constraintLayout3 != null) {
                        constraintLayout3.setOnClickListener(new f5.d(this, 24));
                        FrameLayout frameLayout3 = this.f23540r;
                        if (frameLayout3 != null) {
                            frameLayout3.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.billing.ui.h(3));
                            x().addOnLayoutChangeListener(new pdf.pdfreader.viewer.editor.free.feature.ai.widget.c(this, 3));
                            this.f23541s = true;
                            return;
                        }
                        kotlin.jvm.internal.g.i(ea.a.p("LG9fdBhpWWUoRmw=", "xJUTclgh"));
                        throw null;
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("MWFBZV90AGExbxN0", "omA31LqT"));
                    throw null;
                }
                kotlin.jvm.internal.g.i(ea.a.p("Q2E5ZR10LmELb0F0", "axCAK9OC"));
                throw null;
            }
            kotlin.jvm.internal.g.i(ea.a.p("LG9fdBhpWWUoRmw=", "bATL4dBh"));
            throw null;
        }
        kotlin.jvm.internal.g.i(ea.a.p("UG8ldBJpDGUARmw=", "aqR1BfFN"));
        throw null;
    }

    @Override // com.google.android.material.bottomsheet.b, android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        getContext().unregisterComponentCallbacks(this);
        super.onDetachedFromWindow();
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.activity.l, android.app.Dialog
    public final void onStart() {
        super.onStart();
        ea.a.p("IG5idBhydA==", "hmPivAMB");
        this.f23545w = v();
        F();
        getContext().registerComponentCallbacks(this);
    }

    @Override // l.p, androidx.activity.l, android.app.Dialog
    public void onStop() {
        getContext().unregisterComponentCallbacks(this);
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    @Override // com.google.android.material.bottomsheet.b, android.app.Dialog
    public final void setCancelable(boolean z10) {
        super.setCancelable(z10);
        this.f23543u = Boolean.valueOf(z10);
    }

    @Override // com.google.android.material.bottomsheet.b, android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        this.f23544v = Boolean.valueOf(z10);
    }

    @Override // android.app.Dialog
    public void show() {
        ea.a.p("Mmg1dw==", "TvAZA7VW");
        Context context = getContext();
        kotlin.jvm.internal.g.d(context, ea.a.p("NW8gdBR4dA==", "v4VNqEAu"));
        Activity l10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.l(context);
        boolean z10 = false;
        if (l10 != null && l10.isFinishing()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        try {
            boolean z11 = this.f23541s;
            super.show();
            if (z11) {
                G();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public View u(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        return null;
    }

    public final int v() {
        Context context = getContext();
        kotlin.jvm.internal.g.d(context, ea.a.p("UG8ldBZ4dA==", "qE58MEXS"));
        Activity l10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.l(context);
        if (l10 != null && ((l10 instanceof ReaderPreviewActivity) || (l10 instanceof OfficeReaderActivity))) {
            if (l10.getRequestedOrientation() == 1) {
                return 1;
            }
            return 2;
        }
        return getContext().getResources().getConfiguration().orientation;
    }

    public abstract int w();

    public final View x() {
        View view = this.f23538p;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.g.i(ea.a.p("QW8kdCVpB3c=", "s5OCK5Vo"));
        throw null;
    }

    public abstract void z();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, int i10) {
        super(context, i10);
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "R5dCHmof"));
        ea.a.p("cWE4ZTFvFnQdbWdoDGUiRC1hXm9n", "9L60WWQr");
        this.f23545w = 1;
    }

    public /* synthetic */ g(Context context, Object obj) {
        this(context, (int) R.style.BaseBottomDialog);
    }

    public void G() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    public void y() {
    }
}
