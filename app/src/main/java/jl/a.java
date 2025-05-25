package jl;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.ImageView;
import androidx.activity.r;
import cg.l;
import d9.g;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.text.j;
import l.e;
import lib.zj.pdfeditor.ReaderView;
import no.f;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ReaderSplashActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.j2;
import pdf.pdfreader.viewer.editor.free.ui.dialog.x;
import pdf.pdfreader.viewer.editor.free.utils.a0;
import pdf.pdfreader.viewer.editor.free.utils.d1;
import pdf.pdfreader.viewer.editor.free.utils.event.EventCenter;
import pdf.pdfreader.viewer.editor.free.utils.exception.SoLoadFailException;
import pdf.pdfreader.viewer.editor.free.utils.extension.i;
import pdf.pdfreader.viewer.editor.free.utils.f0;
import pdf.pdfreader.viewer.editor.free.utils.h1;
import pdf.pdfreader.viewer.editor.free.utils.q0;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import pdf.pdfreader.viewer.editor.free.utils.v;
import pdf.pdfreader.viewer.editor.free.utils.z;

/* compiled from: BaseActivity.java */
/* loaded from: classes3.dex */
public abstract class a extends androidx.appcompat.app.c {

    /* renamed from: s  reason: collision with root package name */
    public static final String f19287s;

    /* renamed from: a  reason: collision with root package name */
    public Locale f19288a;

    /* renamed from: d  reason: collision with root package name */
    public d f19290d;

    /* renamed from: e  reason: collision with root package name */
    public j2 f19291e;

    /* renamed from: f  reason: collision with root package name */
    public j2 f19292f;

    /* renamed from: i  reason: collision with root package name */
    public z f19295i;

    /* renamed from: j  reason: collision with root package name */
    public Context f19296j;

    /* renamed from: p  reason: collision with root package name */
    public j2 f19302p;

    /* renamed from: q  reason: collision with root package name */
    public pdf.pdfreader.viewer.editor.free.ui.dialog.d f19303q;

    /* renamed from: b  reason: collision with root package name */
    public boolean f19289b = false;
    public boolean c = false;

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f19293g = Arrays.asList(ea.a.p("YWUqZBZyMnIXdl1lHkE1dC12W3R5", "qYntVSzr"), ea.a.p("AGZXaRplZWU7ZC9yNGMcaUNpGnk=", "GMgwTFyG"), ea.a.p("A2FfZwxhUGUZaCVvBmUpY0FpGGkxeQ==", "pDffBgMn"), ea.a.p("ckkYZR9mK24Ub3VjHWkgaTB5", "Yspazb22"), ea.a.p("Dkl0eAllRWk_billNGMcaUNpGnk=", "CD1EIbNZ"));

    /* renamed from: h  reason: collision with root package name */
    public boolean f19294h = false;

    /* renamed from: k  reason: collision with root package name */
    public boolean f19297k = false;

    /* renamed from: l  reason: collision with root package name */
    public boolean f19298l = false;

    /* renamed from: m  reason: collision with root package name */
    public final Handler f19299m = new Handler(Looper.getMainLooper());

    /* renamed from: n  reason: collision with root package name */
    public int f19300n = -1;

    /* renamed from: o  reason: collision with root package name */
    public final androidx.activity.result.c<String[]> f19301o = registerForActivityResult(new j.b(), new g(this, 10));

    /* renamed from: r  reason: collision with root package name */
    public final c f19304r = new c();

    /* compiled from: BaseActivity.java */
    /* loaded from: classes3.dex */
    public class b implements l<Boolean, tf.d> {
        public b() {
        }

        @Override // cg.l
        public final tf.d invoke(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null) {
                boolean booleanValue = bool2.booleanValue();
                a aVar = a.this;
                aVar.O1(booleanValue);
                Window window = aVar.getWindow();
                if (window != null) {
                    if (!bool2.booleanValue()) {
                        i.c(window, !aVar.f19294h);
                        return null;
                    }
                    i.c(window, true);
                    return null;
                }
                return null;
            }
            return null;
        }
    }

    /* compiled from: BaseActivity.java */
    /* loaded from: classes3.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            if (pdf.pdfreader.viewer.editor.free.utils.extension.a.b(aVar)) {
                return;
            }
            if (aVar.f19303q == null) {
                aVar.f19303q = new pdf.pdfreader.viewer.editor.free.ui.dialog.d(aVar, true);
            }
            aVar.W1(aVar.f19303q);
            aVar.f19303q.a(R.string.arg_res_0x7f1303a6);
            ImageView imageView = aVar.f19303q.f27523e;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        }
    }

    /* compiled from: BaseActivity.java */
    /* loaded from: classes3.dex */
    public interface d {
        void B(boolean z10);
    }

    static {
        ea.a.p("PWgHchFFInQhdHk=", "qeInuLWe");
        f19287s = ea.a.p("DWFCZThjQ2ksaT55", "CJXR4BtI");
    }

    public static File H1(String str) {
        File file = new File(v.E());
        bg.b.z0(file);
        file.mkdirs();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file.getAbsolutePath());
        File file2 = new File(r.g(sb2, File.separator, str));
        if (file2.exists()) {
            file2.delete();
        }
        return file2;
    }

    public static boolean N1(long j10) {
        float a10 = f0.a();
        t1.b(ea.a.p("PHBdaQ0gWWU_ZBlwFGMNOhUkAGUgZDZwMGMoIAtyHWUcaUtlQyATZihlL0kbdA1yW2ECUzFvF2E2ZQ==", "VNYnQMmx"));
        if (a10 > ((((float) j10) / 1000.0f) / 1000.0f) + 10.0f) {
            return true;
        }
        return false;
    }

    public final boolean A1() {
        if (h1.c() || pdf.pdfreader.viewer.editor.free.utils.extension.c.g(this)) {
            return true;
        }
        this.f19300n = 1;
        this.f19301o.a(new String[]{ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFIAQSFfCVg9RTROL0wQU2VPK0FwRQ==", "ZrCDLifn"), ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFcXSTFFaUUIVBFSB0EDX2JUNlJ2R0U=", "vrKL6PTI")});
        return false;
    }

    public final void B1(Dialog dialog) {
        if (dialog != null && M1() && dialog.isShowing()) {
            dialog.dismiss();
        }
    }

    public abstract void C1();

    public View D1() {
        return null;
    }

    public abstract int E1();

    public int F1() {
        return androidx.core.content.a.getColor(this, R.color.colorPrimary);
    }

    public int G1() {
        return androidx.core.content.a.getColor(this, R.color.colorPrimary);
    }

    public final void I1() {
        this.f19299m.removeCallbacks(this.f19304r);
        pdf.pdfreader.viewer.editor.free.ui.dialog.d dVar = this.f19303q;
        if (dVar != null && dVar.isShowing()) {
            this.f19303q.dismiss();
        }
    }

    public abstract void K1();

    public final boolean M1() {
        if (!isDestroyed() && !isFinishing()) {
            return true;
        }
        return false;
    }

    public final void P1() {
        j2 j2Var = this.f19291e;
        if (j2Var != null && j2Var.isShowing()) {
            this.f19291e.b();
        }
        j2 j2Var2 = this.f19292f;
        if (j2Var2 != null && j2Var2.isShowing()) {
            this.f19292f.b();
        }
    }

    public void Q1() {
        if (this.f19295i == null) {
            this.f19295i = new z();
        }
        this.f19295i.a(this, new b());
    }

    public final void R1(d dVar) {
        boolean isExternalStorageManager;
        this.f19290d = dVar;
        if (pdf.pdfreader.viewer.editor.free.utils.extension.c.g(this)) {
            dVar.B(true);
        } else if (h1.c()) {
            isExternalStorageManager = Environment.isExternalStorageManager();
            if (!isExternalStorageManager) {
                if (!isFinishing()) {
                    j2 j2Var = this.f19291e;
                    if (j2Var == null || !j2Var.isShowing()) {
                        j2 j2Var2 = new j2(this);
                        this.f19291e = j2Var2;
                        j2Var2.c(2);
                        this.f19291e.f27638i = new jl.b(this);
                    }
                    j2 j2Var3 = this.f19291e;
                    if (j2Var3 != null && !j2Var3.isShowing()) {
                        if (TextUtils.equals(null, ea.a.p("R28kbABfB2QbdA==", "0wsJtDPS"))) {
                            EventCenter.f(ea.a.p("OW8YbHM=", "ObMwLXxq"));
                        } else {
                            EventCenter.f(ea.a.p("L2xl", "G3Js9dGU"));
                        }
                        EventCenter.c(this);
                        this.f19291e.show();
                        return;
                    }
                    return;
                }
                return;
            }
            dVar.B(true);
        } else if (androidx.core.content.a.checkSelfPermission(this, ea.a.p("CW4zcjVpMS44ZRRtXXMkaVdufFcbSWJFK0UpVBRSDEEkXwRUFVIUR0U=", "e7hWZUMD")) != 0) {
            if (wn.b.f31388d) {
                EventCenter.f(ea.a.p("O2Vu", "4UCd2Vw8"));
                EventCenter.c(this);
            }
            tn.a.b(this, ea.a.p("Q2U5bRpzEWkdbmsxMA==", "vhGTt5oQ"), ea.a.p("P2VDbRBzRGk1bnswKnMRc2pzBm93", "KQX6eggW"));
            k0.b.a(this, new String[]{ea.a.p("OW4xch9pCC44ZRRtXXMkaVdufFcbSWJFK0UpVBRSDEEUXwZUP1ItR0U=", "7FXUplxk")}, 101);
        } else {
            dVar.B(true);
        }
    }

    public void S1(int i10) {
        f.b(this).getClass();
        d1 b10 = d1.b(this);
        String p10 = ea.a.p("OnNUciZzX28tXz5oEG0NX0F5HmUaMVE1", "1NznTrwB");
        SharedPreferences sharedPreferences = b10.f28619a;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putInt(p10, i10).apply();
        }
        overridePendingTransition(R.anim.theme_anim_in, R.anim.theme_anim_out);
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.ThemeWindowAnimation);
            window.setBackgroundDrawable(new ColorDrawable(androidx.core.content.a.getColor(this, R.color.colorPrimary)));
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    e.B(1);
                    return;
                }
                return;
            }
            e.B(2);
            return;
        }
        e.B(-1);
    }

    public final void U1() {
        int l10 = q0.l(this, 0, ea.a.p("RWkudyxtDWRl", "G3wvV9F0"));
        if (l10 == 0) {
            ReaderView.f21377y0 = false;
            ReaderView.f21378z0 = true;
            ReaderView.B0 = true;
        } else if (1 == l10) {
            ReaderView.f21377y0 = false;
            ReaderView.f21378z0 = true;
            ReaderView.B0 = false;
        } else if (2 == l10) {
            ReaderView.f21377y0 = true;
            ReaderView.f21378z0 = false;
            ReaderView.B0 = true;
        } else if (3 == l10) {
            ReaderView.f21377y0 = true;
            ReaderView.f21378z0 = false;
            ReaderView.B0 = false;
        } else {
            ReaderView.f21377y0 = true;
            ReaderView.f21378z0 = false;
            ReaderView.B0 = true;
        }
    }

    public final void V1() {
        this.f19299m.postDelayed(this.f19304r, 500L);
    }

    public final void W1(Dialog dialog) {
        if (dialog != null && M1() && !dialog.isShowing()) {
            dialog.show();
        }
    }

    public final void X1(boolean z10) {
        j2 j2Var = new j2(this);
        this.f19302p = j2Var;
        if (z10) {
            j2Var.c(1);
        } else {
            j2Var.c(0);
        }
        j2 j2Var2 = this.f19302p;
        j2Var2.f27638i = new C0259a(z10);
        j2Var2.show();
    }

    public final void Y1() {
        t1.b(ea.a.p("K3QFch5IBm0tQQhkZmU6b05lAGUqZVh0", "HFXdjiHp"));
        dp.a a10 = dp.a.a();
        String p10 = ea.a.p("QHQqcgdIDW0XQVpkO2U7bzJlYGUlZS10", "PLuWznaU");
        a10.getClass();
        dp.a.c(p10);
        Intent intent = new Intent(this, ReaderHomeActivity.class);
        intent.addFlags(268468224);
        startActivity(intent);
        finishAndRemoveTask();
        ReaderPdfApplication.c(ReaderHomeActivity.class);
    }

    public final void Z1() {
        t1.b(ea.a.p("PHRQcg1TR2w7cyJBG2Q6ZVhvGGUXZQZlPnQ=", "RsZpPNkg"));
        dp.a a10 = dp.a.a();
        String p10 = ea.a.p("PHRQcg1TR2w7cyJBG2Q6ZVhvGGUXZQZlKHQ=", "NGkbFMCc");
        a10.getClass();
        dp.a.c(p10);
        Intent intent = new Intent(this, ReaderSplashActivity.class);
        intent.addFlags(268468224);
        startActivity(intent);
        finishAndRemoveTask();
        ReaderPdfApplication.c(ReaderSplashActivity.class);
    }

    @Override // androidx.appcompat.app.c, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(a0.a(context, false));
        this.f19296j = context;
    }

    @Override // androidx.fragment.app.u, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        d dVar;
        boolean isExternalStorageManager;
        if (i10 == 100 && h1.c()) {
            isExternalStorageManager = Environment.isExternalStorageManager();
            if (isExternalStorageManager) {
                if (this.f19290d != null) {
                    B1(this.f19291e);
                    this.f19290d.B(true);
                }
            } else {
                d dVar2 = this.f19290d;
                if (dVar2 != null) {
                    dVar2.B(false);
                }
            }
        } else if (i10 == 101 && !h1.c() && androidx.core.content.a.checkSelfPermission(this, ea.a.p("Um4vchxpBi4CZUZtAHMlaStuHFcUSRdFM0U3VCRSPkF_XxhUPFIjR0U=", "loapD8ii")) == 0 && (dVar = this.f19290d) != null) {
            dVar.B(true);
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public void onCreate(Bundle bundle) {
        Window window;
        boolean h10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this);
        f.b(this).getClass();
        this.f19294h = f.d(this);
        boolean z10 = true;
        if (!this.f19293g.contains(getClass().getSimpleName()) && (window = getWindow()) != null) {
            i.g(window, G1(), F1());
            i.h(window, !h10);
            i.c(window, !this.f19294h);
        }
        b.b.Z(this);
        if (bundle == null) {
            z10 = false;
        }
        this.c = z10;
        try {
            super.onCreate(bundle);
        } catch (Exception e10) {
            e10.printStackTrace();
            dp.a a10 = dp.a.a();
            SoLoadFailException soLoadFailException = new SoLoadFailException(e10);
            a10.getClass();
            dp.a.e(soLoadFailException);
            t1.b(getClass().getSimpleName() + ea.a.p("E28lQwFlA3QXIFFyG28kIA==", "UPaIkPjd") + e10.getMessage());
            ReaderPdfApplication.o(this);
            finish();
        }
        if (ReaderPdfApplication.f23861m) {
            ReaderPdfApplication.o(this);
            finish();
            return;
        }
        ea.a.p("Yi0cLVRhVHQzdiN0DCAHbnZyC2ExZTo=", "WCdyo4Fj");
        a0.a(this, false);
        if (E1() != 0) {
            setContentView(E1());
        } else {
            View D1 = D1();
            if (D1 != null) {
                setContentView(D1);
            }
        }
        this.f19288a = a0.d(this);
        T1(bundle);
        Q1();
        if (this.f19298l) {
            return;
        }
        J1(bundle);
        C1();
        K1();
        L1();
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public void onDestroy() {
        View view;
        z.a aVar;
        ViewTreeObserver viewTreeObserver;
        super.onDestroy();
        z zVar = this.f19295i;
        if (zVar != null && (view = zVar.f28799b) != null && (aVar = zVar.f28798a) != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(aVar);
        }
        ea.a.p("Hi1mLV5hAXQbdl10ECA5bgBlQXQ0bzo6", "AJEBSb7q");
        j2 j2Var = this.f19291e;
        if (j2Var != null && j2Var.isShowing()) {
            this.f19291e.cancel();
        }
        j2 j2Var2 = this.f19292f;
        if (j2Var2 != null && j2Var2.isShowing()) {
            this.f19292f.cancel();
        }
        pdf.pdfreader.viewer.editor.free.ui.dialog.d dVar = this.f19303q;
        if (dVar != null && dVar.isShowing()) {
            this.f19303q.dismiss();
        }
        this.f19299m.removeCallbacks(this.f19304r);
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    public void onPause() {
        this.f19289b = true;
        super.onPause();
    }

    @Override // androidx.fragment.app.u, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == 101) {
            if (iArr.length > 0 && iArr[0] == 0) {
                tn.a.b(this, ea.a.p("AWU2bQFzJWknbjkxMA==", "lPqDhVVM"), ea.a.p("Q2U5bRpzEWkdbgUwNnMvcxtkXW5l", "hdKk0Vsi"));
                d dVar = this.f19290d;
                if (dVar != null) {
                    dVar.B(true);
                }
            } else if (!k0.b.b(this, ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFcXSTFFCUUVVC5SJUEDX2JUNlJ2R0U=", "4VgeVMkk"))) {
                if (this.f19292f == null) {
                    EventCenter.f(ea.a.p("O2VfMQ==", "O23iDOp6"));
                    j2 j2Var = new j2(this);
                    this.f19292f = j2Var;
                    j2Var.f27638i = new jl.c(this);
                }
                EventCenter.f(ea.a.p("O2VfMg==", "BkhJcTce"));
                this.f19292f.c(1);
                if (!this.f19292f.isShowing()) {
                    this.f19292f.show();
                }
            }
        }
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    public void onResume() {
        this.f19289b = false;
        this.f19297k = false;
        super.onResume();
    }

    @Override // androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f19297k = true;
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public void onStart() {
        this.f19297k = false;
        super.onStart();
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public void onStop() {
        super.onStop();
        if (isFinishing()) {
            p1.a.a(this).c(new Intent(ea.a.p("P2RXLglkUXI_YS5lBy4eaVB3C3JrZQFpE28WLgNyDmVhQXJUME95XxZPCUE5XypSekEqQwRTMV8mQzBJM0k_WRBEdFMtUnhZH0Q=", "fsTXgdek")));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        Window window;
        super.onWindowFocusChanged(z10);
        if (z10) {
            if (!this.f19293g.contains(getClass().getSimpleName()) && (window = getWindow()) != null) {
                i.c(window, !this.f19294h);
            }
        }
        if (z10) {
            if (EventCenter.f28656b && !EventCenter.f28655a) {
                EventCenter.f28656b = false;
            }
            if (!EventCenter.f28655a && !EventCenter.f28662i && pdf.pdfreader.viewer.editor.free.utils.extension.c.g(this)) {
                if (wn.b.f31388d) {
                    EventCenter.f28662i = true;
                    if (!EventCenter.c) {
                        EventCenter.c = true;
                        String str = EventCenter.f28663j;
                        if (j.H(str)) {
                            str = EventCenter.f28659f;
                        }
                        String p10 = ea.a.p("C2USZiRvdw==", "mVeeHGGG");
                        String p11 = ea.a.p("Q2U5bRpfBm8cZQ==", "9NRuSBaB");
                        f.b(this).getClass();
                        tn.a.d(this, p10, p11, a0.a.j(f.c(), "_", EventCenter.f28658e, "_total"), false);
                        if (!TextUtils.isEmpty(str)) {
                            String p12 = ea.a.p("HGUlZi1vdw==", "LHrRAyvY");
                            String p13 = ea.a.p("AmUzbV5fXG8mZQ==", "GPrA78w4");
                            f.b(this).getClass();
                            String c10 = f.c();
                            String str2 = EventCenter.f28658e;
                            tn.a.d(this, p12, p13, c10 + "_" + str2 + "_" + str, false);
                        }
                    }
                }
                if (h1.c()) {
                    if (!EventCenter.f28657d) {
                        if (kotlin.jvm.internal.g.a(EventCenter.f28661h, ea.a.p("F28iaVplWjE=", "nUyV9krw")) || kotlin.jvm.internal.g.a(EventCenter.f28661h, ea.a.p("B2UwMTE=", "GewBcq1I"))) {
                            EventCenter.f28657d = true;
                            tn.a.d(this, ea.a.p("P2VDbRBzRGk1bg==", "YWzWZDiO"), ea.a.p("Am8WbDtwInIlaVcxa2Q4bmU=", "dPvyHGqH"), androidx.activity.f.m(EventCenter.f28660g, "_", EventCenter.f28661h), false);
                        }
                    }
                } else if (!EventCenter.f28657d) {
                    if (kotlin.jvm.internal.g.a(EventCenter.f28661h, ea.a.p("JXkyMTA=", "qpVAvmi2")) || kotlin.jvm.internal.g.a(EventCenter.f28661h, ea.a.p("P2VDMQ==", "Xf1GyhNr")) || kotlin.jvm.internal.g.a(EventCenter.f28661h, ea.a.p("P2VDMg==", "EPrYFdgA"))) {
                        EventCenter.f28657d = true;
                        tn.a.d(this, ea.a.p("P2VDbRBzRGk1bg==", "mPyfZxOQ"), ea.a.p("R28kbABwB3IfaQUwNmQ5bmU=", "SJ0PDWH1"), androidx.activity.f.m(EventCenter.f28660g, "_", EventCenter.f28661h), false);
                    }
                }
            }
        }
    }

    public final void x1(Dialog dialog) {
        if (dialog != null && M1() && dialog.isShowing()) {
            dialog.cancel();
        }
    }

    public final void y1(Context context) {
        Locale locale;
        LocaleList locales;
        if (context != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                locales = context.getResources().getConfiguration().getLocales();
                locale = locales.get(0);
            } else {
                locale = context.getResources().getConfiguration().locale;
            }
            if (this.f19288a != locale) {
                if (locale != null) {
                    o9.d.s(f19287s, ea.a.p("X2ElZwZhBWVSclFzDHRsIA==", "vDn0fmgn") + this.f19288a.getDisplayName() + ea.a.p("Ey0g", "KBE9EaBQ") + locale.getDisplayName());
                }
                a0.a(context, false);
            }
        }
    }

    public final boolean z1(long j10) {
        if (!N1(j10)) {
            new x(this, 0).show();
            return false;
        }
        return true;
    }

    /* compiled from: BaseActivity.java */
    /* renamed from: jl.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0259a implements xn.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f19305a;

        public C0259a(boolean z10) {
            this.f19305a = z10;
        }

        @Override // xn.b
        public final void a() {
            boolean z10 = this.f19305a;
            a aVar = a.this;
            if (z10) {
                h1.i(aVar);
            } else {
                aVar.f19301o.a(new String[]{ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFIAQSFfLFgERSBOBEwQU2VPK0FwRQ==", "sifdiPrE"), ea.a.p("KW4Xcl1pLi44ZRRtXXMkaVdufFcbSWJFK0UpVBRSDEEEXyBUfVILR0U=", "kGHs2JNT")});
            }
        }

        @Override // xn.b
        public final void b() {
        }
    }

    public void L1() {
    }

    public void J1(Bundle bundle) {
    }

    public void O1(boolean z10) {
    }

    public void T1(Bundle bundle) {
    }

    public void w1(int i10) {
    }
}
