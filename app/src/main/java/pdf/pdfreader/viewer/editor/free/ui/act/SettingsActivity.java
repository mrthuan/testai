package pdf.pdfreader.viewer.editor.free.ui.act;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import java.util.Locale;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.dialog.j3;
import pdf.pdfreader.viewer.editor.free.ui.frag.SettingFragment;

/* compiled from: SettingsActivity.kt */
/* loaded from: classes3.dex */
public final class SettingsActivity extends jl.a {

    /* renamed from: t  reason: collision with root package name */
    public boolean f26881t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f26882u;

    /* renamed from: w  reason: collision with root package name */
    public static final String f26880w = ea.a.p("DmVAXxdlF3QhbgFfQXAwcllkN186dFd0ZQ==", "eHe9dcdI");

    /* renamed from: v  reason: collision with root package name */
    public static final a f26879v = new a();

    /* compiled from: SettingsActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    @Override // jl.a
    public final int E1() {
        return R.layout.activity_settings;
    }

    @Override // jl.a
    public final int F1() {
        return androidx.core.content.a.getColor(this, R.color.colorPrimaryContainer);
    }

    @Override // jl.a
    public final int G1() {
        return androidx.core.content.a.getColor(this, R.color.colorPrimaryContainer);
    }

    @Override // jl.a
    public final void K1() {
        Configuration configuration;
        boolean z10;
        findViewById(R.id.back_iv).setOnClickListener(new k9.c(this, 20));
        View findViewById = findViewById(R.id.img_rate);
        boolean z11 = true;
        int i10 = 0;
        if (!eo.e.l(findViewById.getContext())) {
            Context context = findViewById.getContext();
            if (pdf.pdfreader.viewer.editor.free.utils.q0.q(Locale.getDefault()) || ((configuration = context.getResources().getConfiguration()) != null && pdf.pdfreader.viewer.editor.free.utils.q0.q(configuration.locale))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                z11 = false;
            }
        }
        if (!z11) {
            if (!this.f26881t) {
                tn.a.b(findViewById.getContext(), ea.a.p("QGU_dBpuZw==", "lSgE5SJR"), ea.a.p("PGVFdBBuUF82aSFlKnMAb3c=", "BQzVZdWp"));
            }
        } else {
            i10 = 4;
        }
        findViewById.setVisibility(i10);
        ea.a.p("Jm5YdC9pUnd-bCttF2QJJDE=", "QfUl2T4T");
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(findViewById, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.SettingsActivity$initView$2$1
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                invoke2(view);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                kotlin.jvm.internal.g.e(it, "it");
                eo.d.c(it.getContext(), ea.a.p("NQ==", "OskStOlE"), null);
                tn.a.b(it.getContext(), ea.a.p("AmVHdFpuZw==", "A6q33VHP"), ea.a.p("QGU_dBpuBV8eaV9lNmM6aSdr", "7aqQd1Il"));
            }
        });
        getLifecycle().a(new androidx.lifecycle.n() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.SettingsActivity$initView$3
            @Override // androidx.lifecycle.n
            public final void d(androidx.lifecycle.p pVar, Lifecycle.Event event) {
                View findViewById2;
                if (event == Lifecycle.Event.ON_RESUME) {
                    boolean z12 = wn.b.f31393i;
                    SettingsActivity settingsActivity = SettingsActivity.this;
                    if (z12) {
                        wn.b.f31393i = false;
                        new pdf.pdfreader.viewer.editor.free.ui.dialog.i(settingsActivity).show();
                    }
                    if (eo.e.l(settingsActivity) && (findViewById2 = settingsActivity.findViewById(R.id.img_rate)) != null) {
                        findViewById2.setVisibility(4);
                    }
                    if (pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.h.f27692d) {
                        pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.h.f27692d = false;
                        new j3(settingsActivity).show();
                    }
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r0 != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
        if (r1 != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    @Override // jl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S1(int r5) {
        /*
            r4 = this;
            boolean r0 = pdf.pdfreader.viewer.editor.free.utils.extension.c.h(r4)
            r1 = 0
            r2 = 32
            r3 = 1
            if (r0 == 0) goto L23
            int r0 = no.f.f22627r
            if (r5 == r0) goto L40
            if (r5 != 0) goto L23
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            if (r0 != r2) goto L20
            r0 = r3
            goto L21
        L20:
            r0 = r1
        L21:
            if (r0 == 0) goto L40
        L23:
            boolean r0 = pdf.pdfreader.viewer.editor.free.utils.extension.c.h(r4)
            if (r0 != 0) goto L68
            int r0 = no.f.f22626q
            if (r5 == r0) goto L40
            if (r5 != 0) goto L68
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            if (r0 != r2) goto L3e
            r1 = r3
        L3e:
            if (r1 == 0) goto L68
        L40:
            r4.f26881t = r3
            ap.e$a r0 = ap.e.f5166o
            r0.getClass()
            ap.e.f5168q = r3
            pdf.pdfreader.viewer.editor.free.ReaderPdfApplication r0 = pdf.pdfreader.viewer.editor.free.ReaderPdfApplication.f23853e
            r0 = 0
            pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity.f26652p2 = r0
            java.util.Stack<android.app.Activity> r0 = pdf.pdfreader.viewer.editor.free.ReaderPdfApplication.f23858j
            java.util.Iterator r0 = r0.iterator()
        L54:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r0.next()
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r1 instanceof pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity
            if (r2 == 0) goto L54
            r1.finish()
            goto L54
        L68:
            super.S1(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.act.SettingsActivity.S1(int):void");
    }

    @Override // android.app.Activity
    public final void finish() {
        if (this.f26881t && !this.f26882u) {
            Intent intent = new Intent(this, ReaderHomeActivity.class);
            intent.putExtra(ea.a.p("JnNjZQp0VnJ0", "xpUnvsEJ"), true);
            startActivity(intent);
        }
        super.finish();
    }

    @Override // jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z10;
        boolean z11 = false;
        if (bundle != null) {
            z10 = bundle.getBoolean(ea.a.p("WnMZZQB0A3J0", "45SSkmQu"), false);
        } else {
            Intent intent = getIntent();
            if (intent != null) {
                z10 = intent.getBooleanExtra(ea.a.p("HnM1ZQN0AnJ0", "XRwgpcHu"), false);
            } else {
                z10 = false;
            }
        }
        this.f26881t = z10;
        super.onCreate(bundle);
        if (bundle == null) {
            androidx.fragment.app.g0 supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            SettingFragment.a aVar2 = SettingFragment.f27957u0;
            Intent intent2 = getIntent();
            if (intent2 != null) {
                z11 = intent2.getBooleanExtra(f26880w, false);
            }
            aVar2.getClass();
            SettingFragment settingFragment = new SettingFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean(ea.a.p("WGUyXwBlFnQbblNfHHAxciVkV181dCJ0ZQ==", "SGk1p4wI"), z11);
            settingFragment.j0(bundle2);
            aVar.c(R.id.container, settingFragment, ea.a.p("QGU_dBpuBXM0clVnBGU4dA==", "cvUsI1ES"), 1);
            aVar.i();
        }
    }

    @Override // jl.a, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.g.e(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean(ea.a.p("WnMZZQB0A3J0", "2GD5pcpT"), this.f26881t);
    }

    @Override // jl.a
    public final void C1() {
    }
}
