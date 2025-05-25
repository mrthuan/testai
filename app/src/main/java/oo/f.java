package oo;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.s;

/* compiled from: BaseBottomInputDialog.kt */
/* loaded from: classes3.dex */
public abstract class f extends androidx.activity.l implements ComponentCallbacks {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ int f23527m = 0;

    /* renamed from: d  reason: collision with root package name */
    public View f23528d;

    /* renamed from: e  reason: collision with root package name */
    public ConstraintLayout f23529e;

    /* renamed from: f  reason: collision with root package name */
    public FrameLayout f23530f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f23531g;

    /* renamed from: h  reason: collision with root package name */
    public a f23532h;

    /* renamed from: i  reason: collision with root package name */
    public Boolean f23533i;

    /* renamed from: j  reason: collision with root package name */
    public Boolean f23534j;

    /* renamed from: k  reason: collision with root package name */
    public int f23535k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f23536l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        this(context, (Object) null);
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "aYxjdHp8"));
    }

    private final int q() {
        Context context = getContext();
        kotlin.jvm.internal.g.d(context, ea.a.p("UG8ldBZ4dA==", "qERQapxo"));
        Activity l10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.l(context);
        if (l10 != null && ((l10 instanceof ReaderPreviewActivity) || (l10 instanceof OfficeReaderActivity))) {
            if (l10.getRequestedOrientation() == 1) {
                return 1;
            }
            return 2;
        }
        return getContext().getResources().getConfiguration().orientation;
    }

    public static boolean x() {
        if (!pdf.pdfreader.viewer.editor.free.ads.f.m().g() && !pdf.pdfreader.viewer.editor.free.ads.l.m().g() && !pdf.pdfreader.viewer.editor.free.ads.g.m().g()) {
            return false;
        }
        return true;
    }

    private final void y() {
        if (!this.f23531g) {
            return;
        }
        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
        ConstraintLayout constraintLayout = this.f23529e;
        if (constraintLayout != null) {
            aVar.f(constraintLayout);
            aVar.k(R.id.container).f3373e.f3392b0 = 0;
            if (this.f23535k == 2) {
                aVar.k(R.id.container).f3373e.f3390a0 = (int) (Math.max(getContext().getResources().getDisplayMetrics().widthPixels, getContext().getResources().getDisplayMetrics().heightPixels) * 0.5f);
            } else {
                aVar.k(R.id.container).f3373e.f3390a0 = 0;
            }
            ConstraintLayout constraintLayout2 = this.f23529e;
            if (constraintLayout2 != null) {
                aVar.b(constraintLayout2);
                return;
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("Q2E5ZR10LmELb0F0", "5Z1PLTQk"));
                throw null;
            }
        }
        kotlin.jvm.internal.g.i(ea.a.p("Q2E5ZR10LmELb0F0", "SBhlNYIt"));
        throw null;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ea.a.p("K2lCbRBzcw==", "REUUDOtK");
        try {
            EditText u7 = u();
            if (u7 != null) {
                pdf.pdfreader.viewer.editor.free.utils.extension.g.a(u7);
            }
            super.dismiss();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.g.e(newConfig, "newConfig");
        int i10 = newConfig.orientation;
        if (i10 != this.f23535k) {
            this.f23535k = i10;
            y();
            EditText u7 = u();
            if (u7 != null) {
                u7.post(new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.b(this, 10));
            }
        }
    }

    @Override // androidx.activity.l, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        boolean w7;
        boolean v10;
        super.onCreate(bundle);
        this.f23535k = q();
        View inflate = View.inflate(getContext(), R.layout.dialog_bottom_container, null);
        kotlin.jvm.internal.g.c(inflate, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuIm5FbhJsAyA7eUFlWWFZZChvI2QNLgtvW3MaciRpC3QhYRFvEnRBdyZkVmUNLnRvNHM-chRpBnR5YRdvMHQ=", "ArroMhgo"));
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        this.f23529e = constraintLayout;
        View findViewById = constraintLayout.findViewById(R.id.container);
        kotlin.jvm.internal.g.d(findViewById, ea.a.p("Q2E5ZR10LmELb0F0R2Y_biBWW2UxQjpJACgwLhBkHGNcbj9hGm4Hcik=", "dby2e5cC"));
        this.f23530f = (FrameLayout) findViewById;
        LayoutInflater layoutInflater = getLayoutInflater();
        kotlin.jvm.internal.g.d(layoutInflater, ea.a.p("BGEebwx0Jm4ubAd0UXI=", "2dhgyoP7"));
        FrameLayout frameLayout = this.f23530f;
        if (frameLayout != null) {
            View p10 = p(layoutInflater, frameLayout);
            if (p10 == null) {
                p10 = View.inflate(getContext(), r(), null);
                kotlin.jvm.internal.g.d(p10, ea.a.p("Wm4tbBJ0BygRb1p0DHgiLGRnV3QKYTpvF3QmZThJDygaLGtuBmwOKQ==", "btKko5nt"));
            }
            this.f23528d = p10;
            FrameLayout frameLayout2 = this.f23530f;
            if (frameLayout2 != null) {
                frameLayout2.addView(s(), new FrameLayout.LayoutParams(-1, -2, 81));
                ConstraintLayout constraintLayout2 = this.f23529e;
                if (constraintLayout2 != null) {
                    setContentView(constraintLayout2);
                    t();
                    Boolean bool = this.f23533i;
                    if (bool != null) {
                        w7 = bool.booleanValue();
                    } else {
                        w7 = w();
                    }
                    setCancelable(w7);
                    Boolean bool2 = this.f23534j;
                    if (bool2 != null) {
                        v10 = bool2.booleanValue();
                    } else {
                        v10 = v();
                    }
                    setCanceledOnTouchOutside(v10);
                    ConstraintLayout constraintLayout3 = this.f23529e;
                    if (constraintLayout3 != null) {
                        constraintLayout3.setOnClickListener(new u4.g(this, 22));
                        FrameLayout frameLayout3 = this.f23530f;
                        if (frameLayout3 != null) {
                            frameLayout3.setOnClickListener(new e(0));
                            Window window = getWindow();
                            if (window != null) {
                                window.setLayout(-1, -2);
                                window.setGravity(80);
                            }
                            this.f23531g = true;
                            return;
                        }
                        kotlin.jvm.internal.g.i(ea.a.p("LG9fdBhpWWUoRmw=", "VkouixFR"));
                        throw null;
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("GmE6ZSl0NGExbxN0", "bzjHGxFt"));
                    throw null;
                }
                kotlin.jvm.internal.g.i(ea.a.p("Q2E5ZR10LmELb0F0", "yItoo9YS"));
                throw null;
            }
            kotlin.jvm.internal.g.i(ea.a.p("LG9fdBhpWWUoRmw=", "UlBWO2wL"));
            throw null;
        }
        kotlin.jvm.internal.g.i(ea.a.p("Dm8fdDBpJ2U6Rmw=", "rYmqQIEg"));
        throw null;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        getContext().unregisterComponentCallbacks(this);
        super.onDetachedFromWindow();
    }

    @Override // androidx.activity.l, android.app.Dialog
    public final void onStart() {
        super.onStart();
        ea.a.p("IG5idBhydA==", "Dw6cBkjm");
        this.f23535k = q();
        y();
        getContext().registerComponentCallbacks(this);
    }

    @Override // androidx.activity.l, android.app.Dialog
    public final void onStop() {
        getContext().unregisterComponentCallbacks(this);
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        EditText u7;
        super.onWindowFocusChanged(z10);
        this.f23536l = z10;
        if (this.f23531g && z10 && (u7 = u()) != null) {
            u7.postDelayed(new pdf.pdfreader.viewer.editor.free.ui.act.tools.j(this, 4), 200L);
        }
    }

    public View p(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        return null;
    }

    public abstract int r();

    public final View s() {
        View view = this.f23528d;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.g.i(ea.a.p("K29YdCZpB3c=", "iHY7pbw6"));
        throw null;
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z10) {
        super.setCancelable(z10);
        this.f23533i = Boolean.valueOf(z10);
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        this.f23534j = Boolean.valueOf(z10);
    }

    @Override // android.app.Dialog
    public void show() {
        ea.a.p("JWhcdw==", "cTV3JyJH");
        Context context = getContext();
        kotlin.jvm.internal.g.d(context, ea.a.p("Mm8cdDN4dA==", "s7QrVAW2"));
        Activity l10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.l(context);
        boolean z10 = false;
        if (l10 != null && l10.isFinishing()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        try {
            boolean z11 = this.f23531g;
            super.show();
            if (z11) {
                z();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public abstract void t();

    public abstract EditText u();

    public boolean v() {
        return this instanceof s;
    }

    public boolean w() {
        return this instanceof s;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, int i10) {
        super(context, i10);
        kotlin.jvm.internal.g.e(context, ea.a.p("LG9fdBx4dA==", "ofi62uwN"));
        ea.a.p("DWFCZTtvQ3Q1bQNuBXUcRFxhAm9n", "peYPRKbN");
        this.f23535k = 1;
    }

    public /* synthetic */ f(Context context, Object obj) {
        this(context, (int) R.style.BaseBottomInputDialog);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    public void z() {
    }
}
