package pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.a1;
import com.google.android.play.core.assetpacks.b1;
import com.gyf.immersionbar.BarHide;
import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.data.ImageFileInfo;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.dialog.ChooseSaveImageTypeDialog;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.widget.Pdf2ImageConvertCompletedView;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.OperateInterceptDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.OperatePdfFailedDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.i3;
import pdf.pdfreader.viewer.editor.free.ui.dialog.v;
import pdf.pdfreader.viewer.editor.free.ui.dialog.x;
import pdf.pdfreader.viewer.editor.free.ui.myview.ReaderRoundProgressBar;
import pdf.pdfreader.viewer.editor.free.utils.event.AppCoreFilterEvent;
import pdf.pdfreader.viewer.editor.free.utils.event.AppOpenSource;
import pdf.pdfreader.viewer.editor.free.utils.f0;
import pdf.pdfreader.viewer.editor.free.utils.h1;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.n0;
import pdf.pdfreader.viewer.editor.free.utils.r0;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import pdf.pdfreader.viewer.editor.free.utils.w0;

/* compiled from: BasePdf2ImageActivity.kt */
/* loaded from: classes3.dex */
public abstract class BasePdf2ImageActivity extends OperatePDFWatcherActivity {

    /* renamed from: k0  reason: collision with root package name */
    public static final String f25476k0 = ea.a.p("Q2QtXwNhFmg=", "Doa3701a");

    /* renamed from: l0  reason: collision with root package name */
    public static final String f25477l0 = ea.a.p("JnNubBZuUF8zbStnZQ==", "M3jID4JR");

    /* renamed from: m0  reason: collision with root package name */
    public static final String f25478m0 = ea.a.p("JXI7bQ==", "THCTy2jR");

    /* renamed from: n0  reason: collision with root package name */
    public static final String f25479n0 = ea.a.p("Q2QtXwN3ZA==", "5Z61KYUF");
    public final Handler H = new Handler(Looper.getMainLooper());
    public String I = "";
    public String J = "";
    public String K = ea.a.p("dVIETSxBLkw=", "0rDGtMiy");
    public boolean L;
    public ReaderPDFCore M;
    public boolean N;
    public cn.b O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public com.gyf.immersionbar.g S;
    public final androidx.activity.result.c<String[]> T;
    public boolean U;
    public v V;
    public final b W;
    public pdf.pdfreader.viewer.editor.free.feature.scan.dialog.r X;
    public i3 Y;
    public ChooseSaveImageTypeDialog Z;

    /* renamed from: a0  reason: collision with root package name */
    public OperateInterceptDialog f25480a0;

    /* renamed from: b0  reason: collision with root package name */
    public final c f25481b0;

    /* renamed from: c0  reason: collision with root package name */
    public long f25482c0;

    /* renamed from: d0  reason: collision with root package name */
    public final d f25483d0;

    /* renamed from: e0  reason: collision with root package name */
    public List<ImageFileInfo> f25484e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f25485f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f25486g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f25487h0;

    /* renamed from: i0  reason: collision with root package name */
    public OperatePdfFailedDialog f25488i0;

    /* renamed from: j0  reason: collision with root package name */
    public x f25489j0;

    /* compiled from: BasePdf2ImageActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a implements androidx.lifecycle.x, kotlin.jvm.internal.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cg.l f25490a;

        public a(cg.l lVar) {
            ea.a.p("KXVfYw1pWG4=", "NYblZju3");
            this.f25490a = lVar;
        }

        @Override // kotlin.jvm.internal.e
        public final cg.l a() {
            return this.f25490a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.x) && (obj instanceof kotlin.jvm.internal.e)) {
                return kotlin.jvm.internal.g.a(this.f25490a, ((kotlin.jvm.internal.e) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.f25490a.hashCode();
        }

        @Override // androidx.lifecycle.x
        public final /* synthetic */ void m(Object obj) {
            this.f25490a.invoke(obj);
        }
    }

    public BasePdf2ImageActivity() {
        androidx.activity.result.c<String[]> registerForActivityResult = registerForActivityResult(new j.b(), new h5.a(this, 15));
        kotlin.jvm.internal.g.d(registerForActivityResult, ea.a.p("PWVWaQp0UnIcbzhBFnQBdlx0F1IgcxBs2oDgfVAgZCBvIBEgWSAXIHp9QCBVIEggFSBOfQ==", "BjDu8FZD"));
        this.T = registerForActivityResult;
        this.W = new b(this, 0);
        this.f25481b0 = new c(this, 0);
        this.f25483d0 = new d(this, 0);
    }

    public static boolean E2(List list) {
        boolean z10;
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            float a10 = f0.a();
            ConcurrentHashMap<String, File> concurrentHashMap = pdf.pdfreader.viewer.editor.free.utils.v.f28781a;
            Iterator it = list.iterator();
            float f10 = 0.0f;
            while (it.hasNext()) {
                f10 += (float) ((ImageFileInfo) it.next()).getFileSize();
            }
            float floatValue = new BigDecimal(((f10 / 1024.0f) / 1024.0f) + pdf.pdfreader.viewer.editor.free.utils.v.f28783d).setScale(2, RoundingMode.HALF_UP).floatValue();
            t1.b("convert needSpace: " + floatValue + " freeSize: " + a10);
            ea.a.p("cWE4ZSNkBDI7bVVnDEE1dC12W3R5", "o531gm6V");
            String str = n0.f28727a;
            if (a10 <= floatValue) {
                return false;
            }
        }
        return true;
    }

    private final void X1(final boolean z10) {
        pdf.pdfreader.viewer.editor.free.feature.scan.dialog.r rVar = new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.r(this, z10 ? 1 : 0, getString(R.string.arg_res_0x7f1304d6), getString(R.string.arg_res_0x7f1303c8, getString(R.string.arg_res_0x7f130179)), new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity$showStoragePermissionDialog$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z11) {
                if (z11) {
                    if (z10) {
                        BasePdf2ImageActivity basePdf2ImageActivity = this;
                        String str = BasePdf2ImageActivity.f25476k0;
                        basePdf2ImageActivity.getClass();
                        BasePdf2ImageActivity basePdf2ImageActivity2 = this;
                        basePdf2ImageActivity2.f25485f0 = true;
                        basePdf2ImageActivity2.getClass();
                        r0.b(basePdf2ImageActivity2);
                        return;
                    }
                    BasePdf2ImageActivity basePdf2ImageActivity3 = this;
                    String str2 = BasePdf2ImageActivity.f25476k0;
                    basePdf2ImageActivity3.getClass();
                    this.p2();
                }
            }
        });
        this.X = rVar;
        rVar.show();
    }

    public static void l2(BasePdf2ImageActivity basePdf2ImageActivity) {
        ReaderPDFCore readerPDFCore;
        boolean z10;
        kotlin.jvm.internal.g.e(basePdf2ImageActivity, ea.a.p("R2gic1cw", "WDXa0jdA"));
        if (pdf.pdfreader.viewer.editor.free.utils.extension.a.c(basePdf2ImageActivity)) {
            ReaderPDFCore readerPDFCore2 = basePdf2ImageActivity.M;
            if (readerPDFCore2 != null && readerPDFCore2.needsPassword()) {
                if (!TextUtils.isEmpty(basePdf2ImageActivity.J) && (readerPDFCore = basePdf2ImageActivity.M) != null) {
                    if (readerPDFCore.authenticatePassword(basePdf2ImageActivity.J)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        w0.a().c.execute(new f(basePdf2ImageActivity, 1));
                        return;
                    }
                }
                v vVar = new v(basePdf2ImageActivity);
                basePdf2ImageActivity.V = vVar;
                vVar.f23532h = new k(basePdf2ImageActivity);
                basePdf2ImageActivity.W1(vVar);
                return;
            }
            ReaderPDFCore readerPDFCore3 = basePdf2ImageActivity.M;
            if (readerPDFCore3 != null && readerPDFCore3.countPages() == 0) {
                basePdf2ImageActivity.M = null;
            }
            if (basePdf2ImageActivity.M == null) {
                basePdf2ImageActivity.U2();
            } else {
                w0.a().c.execute(new f(basePdf2ImageActivity, 1));
            }
        }
    }

    public static void m2(BasePdf2ImageActivity basePdf2ImageActivity, Map map) {
        kotlin.jvm.internal.g.e(basePdf2ImageActivity, ea.a.p("R2gic1cw", "SGeADgyS"));
        basePdf2ImageActivity.H.removeCallbacks(basePdf2ImageActivity.W);
        boolean z10 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!((Boolean) entry.getValue()).booleanValue()) {
                z10 = false;
            }
        }
        if (z10) {
            if (basePdf2ImageActivity.f25486g0 == 1) {
                List<ImageFileInfo> list = basePdf2ImageActivity.f25484e0;
                if (list != null) {
                    basePdf2ImageActivity.q2(list);
                }
                basePdf2ImageActivity.f25485f0 = false;
            }
        } else if (!k0.b.b(basePdf2ImageActivity, ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFIAQSFfAVg5RT5OK0wQU2VPK0FwRQ==", "8JIlDmlj")) && !k0.b.b(basePdf2ImageActivity, ea.a.p("Vm4SchxpHS44ZRRtXXMkaVdufFcbSWJFK0UpVBRSDEF7XyVUPFI4R0U=", "1j7vsy1p"))) {
            basePdf2ImageActivity.X1(true);
        } else {
            basePdf2ImageActivity.X1(false);
        }
    }

    public static final void n2(BasePdf2ImageActivity basePdf2ImageActivity) {
        b1.Y();
        if (basePdf2ImageActivity.L) {
            AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
            AppCoreFilterEvent.h(ea.a.p("QzInbx1nPWYbbl1zaA==", "av4fVGYr"));
            tn.a.a(ReaderPdfApplication.m(), ea.a.p("N28EZTFwIm8kXwJvWmU=", "oJTvnVl9"));
            return;
        }
        AppOpenSource appOpenSource2 = AppCoreFilterEvent.f28650a;
        AppCoreFilterEvent.h(ea.a.p("PzJYbR5fUWk0aTlo", "MwVNU1Ap"));
        tn.a.a(ReaderPdfApplication.m(), ea.a.p("UG85ZSxwFm8bX1BvB2U=", "m0bFqDAz"));
    }

    public View A2() {
        return null;
    }

    public final void C2(Bundle bundle) {
        if (!this.U) {
            this.U = true;
            String str = this.I;
            this.H.postDelayed(this.f25481b0, 200L);
            w0.a().c.execute(new a1(14, this, str));
        }
    }

    public final boolean D2() {
        boolean z10;
        Collection collection = (Collection) en.a.f16819f.d();
        if (collection != null && !collection.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 || !this.P) {
            return false;
        }
        return true;
    }

    public final boolean F2() {
        return kotlin.jvm.internal.g.a(ea.a.p("dVIETSxPIVItRWxUO0EVVA==", "faD7W2VW"), this.K);
    }

    public final boolean G2() {
        return kotlin.jvm.internal.g.a(ea.a.p("dVIETSxQMEUkSXFX", "27MZdS4k"), this.K);
    }

    public final boolean H2() {
        return kotlin.jvm.internal.g.a(ea.a.p("CVJ-TSZUf0kIRA==", "P4gCvRvP"), this.K);
    }

    public final boolean I2() {
        BillingConfigImpl billingConfigImpl = BillingConfigImpl.c;
        if (billingConfigImpl.z() && !billingConfigImpl.w() && BillingConfigImpl.t()) {
            return true;
        }
        return false;
    }

    public boolean J2() {
        return false;
    }

    @Override // jl.a
    public void L1() {
        en.a.f16821h.e(this, new a(new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity$initViewModel$1
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke2(bool);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Boolean bool) {
                if (kotlin.jvm.internal.g.a(bool, Boolean.FALSE) && BasePdf2ImageActivity.this.D2()) {
                    Pdf2ImageConvertCompletedView t22 = BasePdf2ImageActivity.this.t2();
                    if (t22 != null && t22.getVisibility() == 0) {
                        BasePdf2ImageActivity basePdf2ImageActivity = BasePdf2ImageActivity.this;
                        if (!basePdf2ImageActivity.f25487h0) {
                            basePdf2ImageActivity.f25487h0 = true;
                            String string = basePdf2ImageActivity.getString(R.string.arg_res_0x7f1303e5);
                            kotlin.jvm.internal.g.d(string, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQHIgYQFlNF8BYURlC3M6Y1JlCnNRdTZsMyk=", "xNwoFr2T"));
                            j1.c(R.drawable.ic_copy_success, basePdf2ImageActivity.getResources().getDimensionPixelSize(R.dimen.dp_100), basePdf2ImageActivity, string, false);
                        }
                        Pdf2ImageConvertCompletedView t23 = BasePdf2ImageActivity.this.t2();
                        if (t23 != null) {
                            t23.e();
                        }
                    }
                }
            }
        }));
    }

    public void O2() {
        tn.a.d(this, ea.a.p("LG9fdhxydA==", "KVDXkOuN"), ea.a.p("QzIiYxxuFGUAdGtjBm4gZTZ0W24hXzBoDnc=", "armtUyPm"), r2(), false);
    }

    public final void R2() {
        com.gyf.immersionbar.g gVar;
        this.S = com.gyf.immersionbar.g.r(this);
        if (this.f19294h && new com.gyf.immersionbar.a(this).f13751b && (gVar = this.S) != null) {
            gVar.e(BarHide.FLAG_HIDE_NAVIGATION_BAR);
        }
        com.gyf.immersionbar.g gVar2 = this.S;
        if (gVar2 != null) {
            gVar2.p(A2());
            gVar2.f13799k.f13757d = false;
            gVar2.o(!pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this));
            gVar2.j(!pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this));
            gVar2.i(R.color.colorPrimary);
            gVar2.h();
            gVar2.f();
        }
    }

    public void S2(final boolean z10) {
        ChooseSaveImageTypeDialog chooseSaveImageTypeDialog = new ChooseSaveImageTypeDialog(this);
        this.Z = chooseSaveImageTypeDialog;
        chooseSaveImageTypeDialog.f25475y = new cg.l<String, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity$showChooseSaveImageTypeDialog$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(String str) {
                invoke2(str);
                return tf.d.f30009a;
            }

            /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void invoke2(final java.lang.String r14) {
                /*
                    Method dump skipped, instructions count: 355
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity$showChooseSaveImageTypeDialog$1.invoke2(java.lang.String):void");
            }
        };
        W1(this.Z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
        if (r0 == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T2(boolean r6, java.lang.Exception r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof java.io.IOException
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L22
            r0 = r7
            java.io.IOException r0 = (java.io.IOException) r0
            java.lang.String r0 = r0.getMessage()
            if (r0 == 0) goto L1f
            java.lang.String r3 = "Km8Yc0ZhJ2VobANmQCA4bhhkN3YgY2U="
            java.lang.String r4 = "7Pd86DW4"
            java.lang.String r3 = ea.a.p(r3, r4)
            boolean r0 = kotlin.text.k.O(r0, r3, r2)
            if (r0 != r1) goto L1f
            r0 = r1
            goto L20
        L1f:
            r0 = r2
        L20:
            if (r0 != 0) goto L30
        L22:
            androidx.lifecycle.w r0 = en.a.f16819f
            java.lang.Object r0 = r0.d()
            java.util.List r0 = (java.util.List) r0
            boolean r0 = E2(r0)
            if (r0 != 0) goto L46
        L30:
            dp.a r7 = dp.a.a()
            java.lang.String r0 = "Q2QtMhptBSA_ZVlvG3l7LWktHy1rLX1vIEMLbh1lGXR2cjlvAS1PLV8tGS0nb3ZzNGFRZWZsJmY6IAtuS2QOdlpjZQ=="
            java.lang.String r1 = "Ndkk5KXH"
            java.lang.String r0 = ea.a.p(r0, r1)
            r7.getClass()
            dp.a.c(r0)
            r5.W2(r6)
            return
        L46:
            kotlin.jvm.internal.Ref$BooleanRef r6 = new kotlin.jvm.internal.Ref$BooleanRef
            r6.<init>()
            boolean r7 = r7 instanceof java.lang.OutOfMemoryError
            if (r7 == 0) goto L5d
            r6.element = r1
            android.content.res.Resources r7 = r5.getResources()
            r0 = 2131952323(0x7f1302c3, float:1.9541086E38)
            java.lang.String r7 = r7.getString(r0)
            goto L6a
        L5d:
            r6.element = r2
            android.content.res.Resources r7 = r5.getResources()
            r0 = 2131952993(0x7f130561, float:1.9542444E38)
            java.lang.String r7 = r7.getString(r0)
        L6a:
            java.lang.String r0 = "JmYRKBwgXnN6Tz90OmYlZVhvHHkAchdvuID8Yz1uNWU9c1hvF19QcC4pQCBVIEggFSBOfQ=="
            java.lang.String r1 = "nCxoZZRC"
            java.lang.String r0 = ea.a.p(r0, r1)
            kotlin.jvm.internal.g.d(r7, r0)
            pdf.pdfreader.viewer.editor.free.ui.dialog.OperatePdfFailedDialog r0 = new pdf.pdfreader.viewer.editor.free.ui.dialog.OperatePdfFailedDialog
            pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity$showConvertErrorDialog$1 r1 = new pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity$showConvertErrorDialog$1
            r1.<init>()
            r0.<init>(r5, r1)
            android.content.res.Resources r1 = r5.getResources()
            r2 = 2131951926(0x7f130136, float:1.954028E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "PWVCbwxyVGUpLi1lAVMcclxuCSgXLhZ0l4DFbiYuMmEmbFRkJnRYXzlvJHYQchxfUnAaKQ=="
            java.lang.String r3 = "g2MpucAT"
            java.lang.String r2 = ea.a.p(r2, r3)
            kotlin.jvm.internal.g.d(r1, r2)
            r0.H(r1, r7)
            r5.f25488i0 = r0
            r5.W1(r0)
            boolean r6 = r6.element
            if (r6 == 0) goto Laf
            java.lang.String r6 = r5.s2()
            java.lang.String r7 = "_memory"
            java.lang.String r6 = r6.concat(r7)
            pdf.pdfreader.viewer.editor.free.utils.p.k(r5, r6)
            goto Lbc
        Laf:
            java.lang.String r6 = r5.s2()
            java.lang.String r7 = "_error"
            java.lang.String r6 = r6.concat(r7)
            pdf.pdfreader.viewer.editor.free.utils.p.k(r5, r6)
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity.T2(boolean, java.lang.Exception):void");
    }

    public final void U2() {
        String string = getResources().getString(R.string.arg_res_0x7f130391);
        kotlin.jvm.internal.g.d(string, ea.a.p("QWU4bwZyAWUBLlNlHVMici1uVSgULjB0loDFbiIuQmVSZC5yLGYLbBdfUXgKZSZ0LW9cKQ==", "tcE0usfq"));
        String string2 = getResources().getString(R.string.arg_res_0x7f130390);
        kotlin.jvm.internal.g.d(string2, ea.a.p("QWU4bwZyAWUBLlNlHVMici1uVSgULjB0tYCWZjNsMF9QbzlyBnAWXxFhWm4GdAlvNGVcKQ==", "W0ZUTfQt"));
        i3 i3Var = new i3(this, string, string2, null);
        this.Y = i3Var;
        i3Var.setCanceledOnTouchOutside(false);
        i3 i3Var2 = this.Y;
        if (i3Var2 != null) {
            i3Var2.setCancelable(true);
        }
        i3 i3Var3 = this.Y;
        if (i3Var3 != null) {
            i3Var3.setOnCancelListener(new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.a(this, 1));
        }
        W1(this.Y);
    }

    public final void V2(String str) {
        j1.c(-1, getResources().getDimensionPixelSize(R.dimen.dp_100), this, str, true);
    }

    public final void W2(final boolean z10) {
        x xVar = new x(this, getString(R.string.arg_res_0x7f1302ad), getString(R.string.arg_res_0x7f1304da), getString(R.string.arg_res_0x7f130421));
        this.f25489j0 = xVar;
        xVar.H = new x.a() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.e
            @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.x.a
            public final void d() {
                String p10 = ea.a.p("O2hYc10w", "rpXTnsKV");
                BasePdf2ImageActivity basePdf2ImageActivity = this;
                kotlin.jvm.internal.g.e(basePdf2ImageActivity, p10);
                if (z10) {
                    pdf.pdfreader.viewer.editor.free.utils.p.j(basePdf2ImageActivity, basePdf2ImageActivity.s2().concat("_save"));
                } else {
                    pdf.pdfreader.viewer.editor.free.utils.p.j(basePdf2ImageActivity, basePdf2ImageActivity.s2().concat("_space"));
                }
            }
        };
        W1(xVar);
        if (z10) {
            pdf.pdfreader.viewer.editor.free.utils.p.k(this, s2().concat("_save"));
        } else {
            pdf.pdfreader.viewer.editor.free.utils.p.k(this, s2().concat("_space"));
        }
    }

    public final void X2() {
        cg.a<tf.d> aVar = new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity$showQuitDialog$1
            {
                super(0);
            }

            @Override // cg.a
            public /* bridge */ /* synthetic */ tf.d invoke() {
                invoke2();
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                BasePdf2ImageActivity basePdf2ImageActivity = BasePdf2ImageActivity.this;
                basePdf2ImageActivity.N = false;
                cn.b bVar = basePdf2ImageActivity.O;
                if (bVar != null) {
                    bVar.c();
                }
                BasePdf2ImageActivity.this.K2();
                BasePdf2ImageActivity.this.B2();
            }
        };
        if (this.f25480a0 == null) {
            String string = getResources().getString(R.string.arg_res_0x7f13035a);
            kotlin.jvm.internal.g.d(string, ea.a.p("G2VBb0xyO2U7LgFlQFMjclFuNSgbLkV0BmkfZ39xN2kdX1FvV3Y9cjxpCGcp", "P6i29XED"));
            String string2 = getResources().getString(R.string.arg_res_0x7f1304a9);
            kotlin.jvm.internal.g.d(string2, ea.a.p("HmUnb0FyD2U7LgFlQFMjclFuNSgbLkV0loDXbjYuMXUeZQtxQWkYXytvCHZRciNfX3AmKQ==", "HClT4lFI"));
            this.f25480a0 = new OperateInterceptDialog(this, string, string2);
        }
        OperateInterceptDialog operateInterceptDialog = this.f25480a0;
        boolean z10 = false;
        if (operateInterceptDialog != null) {
            operateInterceptDialog.setOnDismissListener(new pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.a(this, 0));
        }
        OperateInterceptDialog operateInterceptDialog2 = this.f25480a0;
        if (operateInterceptDialog2 != null && !operateInterceptDialog2.isShowing()) {
            z10 = true;
        }
        if (z10) {
            OperateInterceptDialog operateInterceptDialog3 = this.f25480a0;
            if (operateInterceptDialog3 != null) {
                operateInterceptDialog3.A = new m(this, aVar);
            }
            if (operateInterceptDialog3 != null) {
                operateInterceptDialog3.show();
            }
            cn.b bVar = this.O;
            if (bVar != null) {
                bVar.f5726f.set(true);
            }
            pdf.pdfreader.viewer.editor.free.utils.p.m(this, s2());
        }
    }

    public final void o2() {
        OperateInterceptDialog operateInterceptDialog;
        OperateInterceptDialog operateInterceptDialog2 = this.f25480a0;
        boolean z10 = false;
        if (operateInterceptDialog2 != null && operateInterceptDialog2.isShowing()) {
            z10 = true;
        }
        if (z10 && (operateInterceptDialog = this.f25480a0) != null) {
            operateInterceptDialog.cancel();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.N) {
            X2();
        } else {
            super.onBackPressed();
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public void onCreate(Bundle bundle) {
        Pdf2ImageConvertCompletedView t22;
        String stringExtra = getIntent().getStringExtra(f25478m0);
        if (stringExtra == null) {
            stringExtra = ea.a.p("dVIETSxBLkw=", "3PSPifyy");
        }
        this.K = stringExtra;
        this.L = getIntent().getBooleanExtra(f25477l0, false);
        String str = "";
        if (bundle == null) {
            String stringExtra2 = getIntent().getStringExtra(f25476k0);
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            this.I = stringExtra2;
            String stringExtra3 = getIntent().getStringExtra(f25479n0);
            if (stringExtra3 != null) {
                str = stringExtra3;
            }
            this.J = str;
        } else {
            String string = bundle.getString(ea.a.p("Q2QtUBJ0aA==", "rg2RaFqr"), "");
            kotlin.jvm.internal.g.d(string, ea.a.p("O2EkZSlJAHM8YQhjUVMjYUxlfGcsdGV0BmkfZ3kiMmQuUDN0JSJCIGoiKQ==", "LzHRMne6"));
            this.I = string;
            String string2 = bundle.getString(ea.a.p("OGQyUApzHXcncmQ=", "UJHTknxE"), "");
            kotlin.jvm.internal.g.d(string2, ea.a.p("QGE9ZRdJDHMGYVpjDFMiYTBlHGcjdBB0N2lbZ0siA2RVUCpzAHcNchYiGCBLIik=", "E5cscJXd"));
            this.J = string2;
            this.P = bundle.getBoolean(ea.a.p("GHMKaB53C2QLbwh2UXIjUl1zJ2x0", "1cqYqngE"), false);
        }
        super.onCreate(bundle);
        if (bundle != null) {
            boolean z10 = bundle.getBoolean(ea.a.p("OmU1ZE1KNm04SAltUU85Ul1zJ21l", "DoHT4COt"), false);
            this.Q = z10;
            if (z10) {
                this.Q = false;
                finish();
                return;
            }
        }
        R2();
        if (!H2() || !(this instanceof Pdf2ImagePicPreviewActivity)) {
            C2(bundle);
        }
        if (!D2()) {
            Pdf2ImageConvertCompletedView t23 = t2();
            if (t23 != null) {
                t23.setVisibility(8);
                return;
            }
            return;
        }
        Pdf2ImageConvertCompletedView t24 = t2();
        if (t24 != null) {
            t24.f((List) en.a.f16819f.d(), this.L);
        }
        if (kotlin.jvm.internal.g.a(en.a.f16821h.d(), Boolean.TRUE) && (t22 = t2()) != null) {
            t22.h();
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public void onDestroy() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        pdf.pdfreader.viewer.editor.free.feature.scan.dialog.r rVar;
        x xVar;
        OperatePdfFailedDialog operatePdfFailedDialog;
        v vVar;
        i3 i3Var;
        ChooseSaveImageTypeDialog chooseSaveImageTypeDialog;
        cn.b bVar = this.O;
        if (bVar != null) {
            bVar.c();
        }
        super.onDestroy();
        Handler handler = this.H;
        handler.removeCallbacks(this.W);
        handler.removeCallbacks(this.f25483d0);
        handler.removeCallbacks(this.f25481b0);
        ChooseSaveImageTypeDialog chooseSaveImageTypeDialog2 = this.Z;
        boolean z15 = true;
        if (chooseSaveImageTypeDialog2 != null && chooseSaveImageTypeDialog2.isShowing()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (chooseSaveImageTypeDialog = this.Z) != null) {
            chooseSaveImageTypeDialog.cancel();
        }
        i3 i3Var2 = this.Y;
        if (i3Var2 != null && i3Var2.isShowing()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && (i3Var = this.Y) != null) {
            i3Var.cancel();
        }
        v vVar2 = this.V;
        if (vVar2 != null && vVar2.isShowing()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 && (vVar = this.V) != null) {
            vVar.cancel();
        }
        OperatePdfFailedDialog operatePdfFailedDialog2 = this.f25488i0;
        if (operatePdfFailedDialog2 != null && operatePdfFailedDialog2.isShowing()) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13 && (operatePdfFailedDialog = this.f25488i0) != null) {
            operatePdfFailedDialog.cancel();
        }
        x xVar2 = this.f25489j0;
        if (xVar2 != null && xVar2.isShowing()) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14 && (xVar = this.f25489j0) != null) {
            xVar.cancel();
        }
        pdf.pdfreader.viewer.editor.free.feature.scan.dialog.r rVar2 = this.X;
        if (rVar2 == null || !rVar2.isShowing()) {
            z15 = false;
        }
        if (z15 && (rVar = this.X) != null) {
            rVar.cancel();
        }
        o2();
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public void onResume() {
        List<ImageFileInfo> list;
        super.onResume();
        if (!h1.c() && pdf.pdfreader.viewer.editor.free.utils.extension.c.g(this)) {
            if (this.f25485f0 && (list = this.f25484e0) != null) {
                q2(list);
            }
            this.f25485f0 = false;
        }
    }

    @Override // jl.a, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.g.e(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean(ea.a.p("WnMYaBx3B2Qxb1p2DHIiUiFzR2x0", "0SU9G3fW"), this.P);
        outState.putString(ea.a.p("Q2QtUBJ0aA==", "HvTus4SC"), this.I);
        outState.putString(ea.a.p("Q2QtUBJzEXcdcmQ=", "Yr8M01Aq"), this.J);
        outState.putBoolean(ea.a.p("QWUqZApKF20CSFttDE84UiFzR21l", "X3LMKKa2"), this.Q);
    }

    public final boolean p2() {
        if (!h1.c() && !pdf.pdfreader.viewer.editor.free.utils.extension.c.g(this)) {
            this.H.postDelayed(this.W, 500L);
            this.T.a(new String[]{ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFIAQSFfCVgdRSdOGEwQU2VPK0FwRQ==", "AT8ULIuY"), ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFcXSTFFOEVsVApSGUEDX2JUNlJ2R0U=", "1j4Xg4OW")});
            return true;
        }
        return false;
    }

    public final void q2(List<ImageFileInfo> list) {
        if (p2()) {
            this.f25486g0 = 1;
            this.f25484e0 = list;
        } else if (E2(list)) {
            w0.a().c.execute(new n0.g(29, list, this));
        } else {
            W2(true);
        }
    }

    public final String r2() {
        if (this.L) {
            return ea.a.p("Q2QtMh9vDGc=", "P5DMwUdA");
        }
        return ea.a.p("QzIibWc=", "3BnavgW3");
    }

    public final String s2() {
        if (H2()) {
            return ea.a.p("KWgwcj1fPDIhbWc=", "sVZQXLO7");
        }
        return ea.a.p("SDINbWc=", "Wv8drBHI");
    }

    public Pdf2ImageConvertCompletedView t2() {
        return null;
    }

    public final String u2() {
        String str = this.K;
        switch (str.hashCode()) {
            case -1959354101:
                if (str.equals(ea.a.p("dVIETSxPIVItRWxUO0EVVA==", "uSuHu6Hm"))) {
                    return ea.a.p("FmNy", "CTy991Zr");
                }
                break;
            case -1271564784:
                if (str.equals(ea.a.p("dVIETSxILU03X2BPJkxT", "kiss1SPB"))) {
                    return ea.a.p("W28mZQ==", "u2yoKXSZ");
                }
                break;
            case -392488846:
                if (str.equals(ea.a.p("dVIETSxUKkkgRA==", "PU02jBl1"))) {
                    return ea.a.p("QGgqcmU=", "MamsyADL");
                }
                break;
            case -392274714:
                if (str.equals(ea.a.p("dVIETSxULU8-Uw==", "xSZbCHs7"))) {
                    return ea.a.p("R28kbHM=", "b3bAvSvY");
                }
                break;
            case 1465644033:
                if (str.equals(ea.a.p("CVJ-TSZMflMOXwdPJ0U=", "QJD4dAkO"))) {
                    return ea.a.p("VWknZQ==", "Icjlq5bL");
                }
                break;
            case 1803017235:
                if (str.equals(ea.a.p("dVIETSxQMEUkSXFX", "b5wG7Qga"))) {
                    return ea.a.p("T2kmdw==", "C69CKccz");
                }
                break;
        }
        return ea.a.p("R28kbHM=", "0uDXO9xI");
    }

    public final String v2() {
        if (J2()) {
            return ea.a.p("SmVz", "2LFX0DJF");
        }
        return ea.a.p("IW8=", "Wcp1if2O");
    }

    public final String w2() {
        if (H2()) {
            if (this.L) {
                return ea.a.p("PGhQchxfRzI2byRn", "FC6j2uiN");
            }
            return ea.a.p("P2glclxfNTIhbWc=", "VNLD9EoI");
        } else if (this.L) {
            return ea.a.p("PzJdbxdn", "Xf1fMPuv");
        } else {
            return ea.a.p("QzIibWc=", "nj0UBksd");
        }
    }

    public LinearLayout x2() {
        return null;
    }

    public ReaderRoundProgressBar y2() {
        return null;
    }

    public final int z2() {
        int i10 = getResources().getDisplayMetrics().widthPixels;
        if (i10 >= getResources().getDimensionPixelSize(R.dimen.dp_400)) {
            return getResources().getDimensionPixelSize(R.dimen.dp_360);
        }
        return i10 - getResources().getDimensionPixelSize(R.dimen.dp_40);
    }

    public void B2() {
    }

    public void K2() {
    }

    public void L2() {
    }

    public void M2() {
    }

    public void P2() {
    }

    public void Q2() {
    }

    public void N2(ArrayList<ImageFileInfo> arrayList) {
    }
}
