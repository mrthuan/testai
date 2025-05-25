package pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.gyf.immersionbar.BarHide;
import java.util.ArrayList;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.v0;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.data.PageRGBColor;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.data.PageSize;
import pdf.pdfreader.viewer.editor.free.ui.dialog.i3;
import pdf.pdfreader.viewer.editor.free.utils.w0;

/* compiled from: BaseOpenPdfActivity.kt */
/* loaded from: classes3.dex */
public abstract class f extends jl.a {
    public static final String D = ea.a.p("Q2QtXwNhFmg=", "qMdGjPVa");
    public static final String E = ea.a.p("KXJebQ==", "in2kuOAX");
    public static final String F = ea.a.p("Q2QtXwN3ZA==", "NywSO5Bx");
    public pdf.pdfreader.viewer.editor.free.ui.dialog.v A;
    public i3 B;

    /* renamed from: x  reason: collision with root package name */
    public ReaderPDFCore f25317x;

    /* renamed from: y  reason: collision with root package name */
    public com.gyf.immersionbar.g f25318y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f25319z;

    /* renamed from: t  reason: collision with root package name */
    public final Handler f25313t = new Handler(Looper.getMainLooper());

    /* renamed from: u  reason: collision with root package name */
    public String f25314u = "";

    /* renamed from: v  reason: collision with root package name */
    public String f25315v = "";

    /* renamed from: w  reason: collision with root package name */
    public String f25316w = ea.a.p("CVJ-TSZBe0w=", "4X1ybpKN");
    public final a C = new a(this, 0);

    public static void a2(f fVar) {
        ReaderPDFCore readerPDFCore;
        kotlin.jvm.internal.g.e(fVar, ea.a.p("R2gic1cw", "OHaPosVi"));
        if (pdf.pdfreader.viewer.editor.free.utils.extension.a.c(fVar)) {
            ReaderPDFCore readerPDFCore2 = fVar.f25317x;
            boolean z10 = false;
            if (readerPDFCore2 != null && readerPDFCore2.needsPassword()) {
                if (!TextUtils.isEmpty(fVar.f25315v) && (readerPDFCore = fVar.f25317x) != null) {
                    if (readerPDFCore.authenticatePassword(fVar.f25315v)) {
                        z10 = true;
                    }
                    if (z10) {
                        fVar.b2(true);
                        return;
                    }
                }
                pdf.pdfreader.viewer.editor.free.ui.dialog.v vVar = new pdf.pdfreader.viewer.editor.free.ui.dialog.v(fVar);
                fVar.A = vVar;
                vVar.f23532h = new e(fVar);
                fVar.W1(vVar);
                return;
            }
            ReaderPDFCore readerPDFCore3 = fVar.f25317x;
            if (readerPDFCore3 != null && readerPDFCore3.countPages() == 0) {
                fVar.f25317x = null;
            }
            if (fVar.f25317x == null) {
                String string = fVar.getResources().getString(R.string.arg_res_0x7f130391);
                kotlin.jvm.internal.g.d(string, ea.a.p("QWU4bwZyAWUBLlNlHVMici1uVSgULjB0rYDyblUuN2VSZC5yLGYLbBdfUXgKZSZ0LW9cKQ==", "OT2ESFP5"));
                String string2 = fVar.getResources().getString(R.string.arg_res_0x7f130390);
                kotlin.jvm.internal.g.d(string2, ea.a.p("HWUnbzlyAGU7LgFlQFMjclFuNSgbLkV0loDXZjhsJ18MbyZyOXAXXythCG5bdAhvSGU8KQ==", "PioTLcoq"));
                i3 i3Var = new i3(fVar, string, string2, null);
                fVar.B = i3Var;
                i3Var.setCanceledOnTouchOutside(false);
                i3 i3Var2 = fVar.B;
                if (i3Var2 != null) {
                    i3Var2.setCancelable(true);
                }
                i3 i3Var3 = fVar.B;
                if (i3Var3 != null) {
                    i3Var3.setOnCancelListener(new v0(fVar, 2));
                }
                fVar.W1(fVar.B);
                return;
            }
            fVar.b2(true);
        }
    }

    @Override // jl.a
    public int E1() {
        return 0;
    }

    public final void b2(final boolean z10) {
        w0.a().c.execute(new Runnable(z10) { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.d

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ boolean f25308b = true;

            @Override // java.lang.Runnable
            public final void run() {
                String p10 = ea.a.p("O2hYc10w", "8NhxE21B");
                f fVar = f.this;
                kotlin.jvm.internal.g.e(fVar, p10);
                fVar.e2(this.f25308b);
            }
        });
    }

    public View c2() {
        return null;
    }

    public View d2() {
        return null;
    }

    @Override // jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public void onCreate(Bundle bundle) {
        com.gyf.immersionbar.g gVar;
        String stringExtra = getIntent().getStringExtra(E);
        if (stringExtra == null) {
            stringExtra = ea.a.p("CVJ-TSZBe0w=", "uWBx2j1c");
        }
        this.f25316w = stringExtra;
        String str = "";
        if (bundle == null) {
            String stringExtra2 = getIntent().getStringExtra(D);
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            this.f25314u = stringExtra2;
            String stringExtra3 = getIntent().getStringExtra(F);
            if (stringExtra3 != null) {
                str = stringExtra3;
            }
            this.f25315v = str;
        } else {
            String string = bundle.getString(ea.a.p("BGQXUCV0aA==", "F3tqDk81"), "");
            kotlin.jvm.internal.g.d(string, ea.a.p("QGE9ZRdJDHMGYVpjDFMiYTBlHGcjdBB0Amk9Z3wiImRVUCp0GyJOIFAiKQ==", "pSTRumf0"));
            this.f25314u = string;
            String string2 = bundle.getString(ea.a.p("GWQMUBBzIXcncmQ=", "3UijqRCO"), "");
            kotlin.jvm.internal.g.d(string2, ea.a.p("QGE9ZRdJDHMGYVpjDFMiYTBlHGcjdBB0S2k7ZxoiCWRVUCpzAHcNchYiGCBLIik=", "9U2ycv5e"));
            this.f25315v = string2;
        }
        super.onCreate(bundle);
        this.f25318y = com.gyf.immersionbar.g.r(this);
        if (this.f19294h && new com.gyf.immersionbar.a(this).f13751b && (gVar = this.f25318y) != null) {
            gVar.e(BarHide.FLAG_HIDE_NAVIGATION_BAR);
        }
        com.gyf.immersionbar.g gVar2 = this.f25318y;
        if (gVar2 != null) {
            gVar2.p(d2());
            gVar2.f13799k.f13757d = false;
            gVar2.o(!pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this));
            gVar2.j(!pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this));
            gVar2.i(R.color.colorPrimary);
            gVar2.h();
            gVar2.f();
        }
        if (!this.f25319z) {
            this.f25319z = true;
            String str2 = this.f25314u;
            this.f25313t.postDelayed(this.C, 200L);
            w0.a().c.execute(new n0.g(26, this, str2));
        }
    }

    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public void onDestroy() {
        boolean z10;
        i3 i3Var;
        pdf.pdfreader.viewer.editor.free.ui.dialog.v vVar;
        super.onDestroy();
        this.f25313t.removeCallbacks(this.C);
        pdf.pdfreader.viewer.editor.free.ui.dialog.v vVar2 = this.A;
        boolean z11 = true;
        if (vVar2 != null && vVar2.isShowing()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (vVar = this.A) != null) {
            vVar.cancel();
        }
        i3 i3Var2 = this.B;
        if (i3Var2 == null || !i3Var2.isShowing()) {
            z11 = false;
        }
        if (z11 && (i3Var = this.B) != null) {
            i3Var.cancel();
        }
    }

    @Override // jl.a, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.g.e(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putString(ea.a.p("P2RXUBh0aA==", "RzZGRifX"), this.f25314u);
        outState.putString(ea.a.p("CmQ8UAtzCXcncmQ=", "yqzZjzGG"), this.f25315v);
    }

    @Override // jl.a
    public void C1() {
    }

    @Override // jl.a
    public void K1() {
    }

    public void f2() {
    }

    public void e2(boolean z10) {
    }

    public void g2(ArrayList arrayList, PageSize pageSize, PageRGBColor pageRGBColor) {
    }
}
