package pdf.pdfreader.viewer.editor.free.ui.frag;

import am.a1;
import android.app.Activity;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.play.core.assetpacks.b1;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.w;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.AppOpenManager;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.PdfReaderAppWidgetNewDialog;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.WidgetFromType;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ScanSettingActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderFeedbackActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenClearDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenDefaultDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.a3;
import pdf.pdfreader.viewer.editor.free.ui.dialog.c3;
import pdf.pdfreader.viewer.editor.free.ui.frag.SettingFragment;
import pdf.pdfreader.viewer.editor.free.utils.a0;
import pdf.pdfreader.viewer.editor.free.utils.c1;
import pdf.pdfreader.viewer.editor.free.utils.d1;
import pdf.pdfreader.viewer.editor.free.utils.e1;
import pdf.pdfreader.viewer.editor.free.utils.event.ScanEventCenter;
import pdf.pdfreader.viewer.editor.free.utils.g0;
import pdf.pdfreader.viewer.editor.free.utils.h1;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.k0;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: SettingFragment.kt */
/* loaded from: classes3.dex */
public final class SettingFragment extends pdf.pdfreader.viewer.editor.free.base.a {

    /* renamed from: u0  reason: collision with root package name */
    public static final a f27957u0;

    /* renamed from: d0  reason: collision with root package name */
    public TextView f27958d0;

    /* renamed from: e0  reason: collision with root package name */
    public SwitchCompat f27959e0;

    /* renamed from: f0  reason: collision with root package name */
    public pdf.pdfreader.viewer.editor.free.ui.dialog.e f27960f0;

    /* renamed from: g0  reason: collision with root package name */
    public String f27961g0;

    /* renamed from: h0  reason: collision with root package name */
    public PdfReaderOpenClearDialog f27962h0;

    /* renamed from: j0  reason: collision with root package name */
    public androidx.fragment.app.n f27964j0;

    /* renamed from: k0  reason: collision with root package name */
    public PdfPreviewEntity f27965k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f27966l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f27967m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f27968n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f27969o0;

    /* renamed from: q0  reason: collision with root package name */
    public pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.b f27971q0;

    /* renamed from: r0  reason: collision with root package name */
    public PdfReaderAppWidgetNewDialog f27972r0;

    /* renamed from: s0  reason: collision with root package name */
    public final SettingFragment$sideUpgradeChecker$1 f27973s0;

    /* renamed from: t0  reason: collision with root package name */
    public a3.c f27974t0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f27963i0 = true;

    /* renamed from: p0  reason: collision with root package name */
    public final pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.f f27970p0 = new pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.f();

    /* compiled from: SettingFragment.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    /* compiled from: SettingFragment.kt */
    /* loaded from: classes3.dex */
    public static final class b implements pdf.pdfreader.viewer.editor.free.utils.f {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f27976b;

        public b(Context context) {
            this.f27976b = context;
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.f
        public final void a(PdfPreviewEntity entity) {
            kotlin.jvm.internal.g.e(entity, "entity");
            b1.Y();
            tn.a.a(ReaderPdfApplication.m(), ea.a.p("Bm8XZS1mG2wtXwJvWmU=", "EdeerrbH"));
            SettingFragment settingFragment = SettingFragment.this;
            if (settingFragment.f27963i0) {
                settingFragment.f27965k0 = entity;
                settingFragment.f27966l0 = true;
                return;
            }
            k0.g(this.f27976b, entity.getPath(), entity, ea.a.p("dVIETSxUKkkgRA==", "F85SDvkI"));
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.f
        public final void b() {
            Context context = this.f27976b;
            j1.a(context, context.getString(R.string.arg_res_0x7f1303c0));
        }
    }

    static {
        ea.a.p("YGU_dBpuBUYAYVNtDG50", "s3sl03Yg");
        ea.a.p("QWUqZBZyPWQXYkFnNm05ZGU=", "NIjepagp");
        f27957u0 = new a();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [pdf.pdfreader.viewer.editor.free.ui.frag.SettingFragment$sideUpgradeChecker$1] */
    public SettingFragment() {
        final h5.m mVar = new h5.m();
        this.f27973s0 = new c5.i(mVar) { // from class: pdf.pdfreader.viewer.editor.free.ui.frag.SettingFragment$sideUpgradeChecker$1
            @Override // c5.i
            public final void l(boolean z10) {
                SettingFragment settingFragment = SettingFragment.this;
                try {
                    SettingFragment.a aVar = SettingFragment.f27957u0;
                    ConstraintLayout constraintLayout = settingFragment.y0().f706i;
                    int i10 = 8;
                    if (z10 || k() || settingFragment.f27969o0) {
                        if (settingFragment.y0().f706i.getVisibility() == 8) {
                            tn.a.b(settingFragment.y0().f706i.getContext(), ea.a.p("PGVFdBBuZw==", "cWtlrnNk"), ea.a.p("QGU_dBpuBV8HcFBhHWUJcyxvdw==", "zJSfVqCY"));
                        }
                        i10 = 0;
                    }
                    constraintLayout.setVisibility(i10);
                } catch (Exception unused) {
                }
            }

            @Override // c5.i
            public final void m(Activity activity, w wVar) {
                int i10;
                if (k()) {
                    c5.a b10 = c5.a.b();
                    b10.a();
                    h5.d dVar = b10.c.f5583e;
                    c5.a b11 = c5.a.b();
                    b11.a();
                    dVar.d(b11.f5564b, activity.getString(R.string.arg_res_0x7f1301ea));
                } else if (d().a()) {
                    c().g(activity);
                    try {
                        o9.b bVar = d().f18036a;
                        if (bVar != null) {
                            bVar.b();
                        }
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                } else if (d().b()) {
                    o9.a aVar = d().f18038d;
                    if (aVar == null) {
                        i10 = 0;
                    } else {
                        i10 = aVar.f22746a;
                    }
                    t0.d0(wVar, null, null, new SettingFragment$sideUpgradeChecker$1$onGetUpgradeInfo$1(activity, i10, d(), this, null), 3);
                }
            }
        };
    }

    @Override // androidx.fragment.app.Fragment
    public final void M(Bundle bundle) {
        super.M(bundle);
        if (i() instanceof androidx.appcompat.app.c) {
            androidx.fragment.app.u i10 = i();
            kotlin.jvm.internal.g.c(i10, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuV25BbgxsFCA7eUFlWWFZZChvI2QNLglwRWMBbTVhES5ZcBwuOHAIQyBtQWENQVR0M3YjdHk=", "keYs8lyx"));
            this.f27971q0 = new pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.b((androidx.appcompat.app.c) i10);
        }
        pdf.pdfreader.viewer.editor.free.utils.a aVar = new pdf.pdfreader.viewer.editor.free.utils.a();
        com.google.android.tools.d dVar = new com.google.android.tools.d(this, 20);
        androidx.fragment.app.o oVar = new androidx.fragment.app.o(this);
        if (this.f3669a <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            androidx.fragment.app.p pVar = new androidx.fragment.app.p(this, oVar, atomicReference, aVar, dVar);
            if (this.f3669a >= 0) {
                pVar.a();
            } else {
                this.V.add(pVar);
            }
            androidx.fragment.app.n nVar = new androidx.fragment.app.n(atomicReference);
            ea.a.p("QWUsaQB0B3I0b0ZBCnQ_di10S1IjczZsrYDcKTogFCATIGsgUyBCIFJ9PiBJIHYgZCASfQ==", "Oz04Lwxa");
            this.f27964j0 = nVar;
            Bundle bundle2 = this.f3674g;
            boolean z10 = false;
            if (bundle2 != null) {
                z10 = bundle2.getBoolean(ea.a.p("DGUbXzxlJnQhbgFfQXAwcllkN186dFd0ZQ==", "oGgbORwH"), false);
            }
            this.f27969o0 = z10;
            androidx.fragment.app.u f02 = f0();
            ea.a.p("HWUAdShyVEErdA92XXQuKCk=", "QYoqA1Lk");
            final SettingFragment$sideUpgradeChecker$1 settingFragment$sideUpgradeChecker$1 = this.f27973s0;
            settingFragment$sideUpgradeChecker$1.a(f02);
            final androidx.fragment.app.u f03 = f0();
            ea.a.p("PWVAdRByUkE5dCN2HHQRKCk=", "hbUtbWke");
            final LifecycleCoroutineScopeImpl x4 = b.b.x(this);
            c5.a b10 = c5.a.b();
            b10.a();
            Object obj = b10.c.f5583e.i().second;
            kotlin.jvm.internal.g.d(obj, "getInstance().upgradeCon…upgradeOpenSetting.second");
            if (((Boolean) obj).booleanValue()) {
                settingFragment$sideUpgradeChecker$1.d().d(f03, new d5.a() { // from class: c5.g
                    @Override // d5.a
                    public final void b(boolean z11) {
                        i this$0 = (i) settingFragment$sideUpgradeChecker$1;
                        w scope = (w) x4;
                        Activity activity = (Activity) f03;
                        kotlin.jvm.internal.g.e(this$0, "this$0");
                        kotlin.jvm.internal.g.e(scope, "$scope");
                        kotlin.jvm.internal.g.e(activity, "$activity");
                        if (this$0.d().a()) {
                            this$0.l(true);
                        } else if (this$0.d().b()) {
                            t0.d0(scope, null, null, new h(this$0, activity, null), 3);
                        } else {
                            this$0.l(false);
                        }
                    }
                });
                return;
            }
            return;
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    @Override // androidx.fragment.app.Fragment
    public final void O() {
        h5.l lVar;
        this.F = true;
        AppOpenManager.c().f23907g = true;
        SettingFragment$sideUpgradeChecker$1 settingFragment$sideUpgradeChecker$1 = this.f27973s0;
        settingFragment$sideUpgradeChecker$1.f18011d.removeCallbacksAndMessages(null);
        h5.m mVar = settingFragment$sideUpgradeChecker$1.f18010b;
        if (mVar != null && (lVar = mVar.c) != null) {
            try {
                o9.b bVar = mVar.f18036a;
                if (bVar != null) {
                    bVar.e(lVar);
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        PdfReaderAppWidgetNewDialog pdfReaderAppWidgetNewDialog = this.f27972r0;
        if (pdfReaderAppWidgetNewDialog != null) {
            pdfReaderAppWidgetNewDialog.dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void T() {
        this.F = true;
        this.f27963i0 = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void W() {
        PdfReaderOpenClearDialog pdfReaderOpenClearDialog;
        Context r4;
        this.F = true;
        this.f27963i0 = false;
        if (this.f27966l0) {
            this.f27966l0 = false;
            PdfPreviewEntity pdfPreviewEntity = this.f27965k0;
            this.f27965k0 = null;
            if (pdfPreviewEntity != null && (r4 = r()) != null) {
                k0.g(r4, pdfPreviewEntity.getPath(), pdfPreviewEntity, ea.a.p("CVJ-TSZUf0kIRA==", "ukihZNjp"));
            }
        }
        a3.c cVar = this.f27974t0;
        if (cVar != null) {
            PdfReaderOpenDefaultDialog.J.getClass();
            int i10 = cVar.f27498a;
            if (!(true ^ TextUtils.isEmpty(PdfReaderOpenDefaultDialog.a.c((ContextWrapper) ReaderPdfApplication.m(), i10)))) {
                Context r10 = r();
                if (r10 != null && (pdfReaderOpenClearDialog = this.f27962h0) != null) {
                    tn.a.d(r10, ea.a.p("KHVYZGU=", "bbBPgFBT"), ea.a.p("LGxUYQtfRWUpZT5fEW8GZQ==", "knbPJXdg"), pdfReaderOpenClearDialog.I(), false);
                }
                PdfReaderOpenClearDialog pdfReaderOpenClearDialog2 = this.f27962h0;
                if (pdfReaderOpenClearDialog2 != null) {
                    pdfReaderOpenClearDialog2.cancel();
                }
                Context g02 = g0();
                ea.a.p("QWU6dRpyB0MdbkBlEXR-KQ==", "8YawV0Xx");
                new PdfReaderOpenDefaultDialog(g02, i10, ea.a.p("QGV0", "Th5WJtkt"), null).show();
            }
        }
        this.f27974t0 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd  */
    @Override // pdf.pdfreader.viewer.editor.free.base.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s0() {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.frag.SettingFragment.s0():void");
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.a
    public final i2.a t0(LayoutInflater inflater, ViewGroup viewGroup) {
        kotlin.jvm.internal.g.e(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_settings, viewGroup, false);
        int i10 = R.id.iv_settings_default_open;
        if (((ImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_settings_default_open)) != null) {
            i10 = R.id.keep_on_switch;
            if (((SwitchCompat) com.google.android.play.core.assetpacks.c.u(inflate, R.id.keep_on_switch)) != null) {
                i10 = R.id.language_iv;
                if (((ImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.language_iv)) != null) {
                    i10 = R.id.nav_browse_pdf;
                    if (((LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.nav_browse_pdf)) != null) {
                        i10 = R.id.nav_default_open;
                        if (((LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.nav_default_open)) != null) {
                            i10 = R.id.nav_feedback;
                            if (((LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.nav_feedback)) != null) {
                                i10 = R.id.nav_img;
                                if (((ImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.nav_img)) != null) {
                                    i10 = R.id.nav_join_telegram;
                                    if (((LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.nav_join_telegram)) != null) {
                                        i10 = R.id.nav_keep_on;
                                        if (((LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.nav_keep_on)) != null) {
                                            i10 = R.id.nav_keep_on_tv;
                                            if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.nav_keep_on_tv)) != null) {
                                                i10 = R.id.nav_language;
                                                if (((ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.nav_language)) != null) {
                                                    i10 = R.id.nav_language_tip;
                                                    FrameLayout frameLayout = (FrameLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.nav_language_tip);
                                                    if (frameLayout != null) {
                                                        i10 = R.id.nav_language_tip_group;
                                                        if (((Group) com.google.android.play.core.assetpacks.c.u(inflate, R.id.nav_language_tip_group)) != null) {
                                                            i10 = R.id.nav_language_tip_iv;
                                                            if (((ImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.nav_language_tip_iv)) != null) {
                                                                i10 = R.id.nav_language_tv;
                                                                if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.nav_language_tv)) != null) {
                                                                    i10 = R.id.nav_notification;
                                                                    if (((ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.nav_notification)) != null) {
                                                                        i10 = R.id.nav_policy;
                                                                        if (((LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.nav_policy)) != null) {
                                                                            i10 = R.id.nav_scan_setting;
                                                                            LinearLayout linearLayout = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.nav_scan_setting);
                                                                            if (linearLayout != null) {
                                                                                i10 = R.id.nav_share_app;
                                                                                if (((LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.nav_share_app)) != null) {
                                                                                    i10 = R.id.nav_terms;
                                                                                    LinearLayout linearLayout2 = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.nav_terms);
                                                                                    if (linearLayout2 != null) {
                                                                                        i10 = R.id.nav_theme;
                                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.nav_theme);
                                                                                        if (constraintLayout != null) {
                                                                                            i10 = R.id.nav_theme_tip;
                                                                                            FrameLayout frameLayout2 = (FrameLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.nav_theme_tip);
                                                                                            if (frameLayout2 != null) {
                                                                                                i10 = R.id.nav_theme_tip_group;
                                                                                                Group group = (Group) com.google.android.play.core.assetpacks.c.u(inflate, R.id.nav_theme_tip_group);
                                                                                                if (group != null) {
                                                                                                    i10 = R.id.nav_theme_tip_iv;
                                                                                                    if (((ImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.nav_theme_tip_iv)) != null) {
                                                                                                        i10 = R.id.nav_theme_tv;
                                                                                                        TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.nav_theme_tv);
                                                                                                        if (textView != null) {
                                                                                                            i10 = R.id.nav_tv;
                                                                                                            if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.nav_tv)) != null) {
                                                                                                                i10 = R.id.nav_upgrade;
                                                                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.nav_upgrade);
                                                                                                                if (constraintLayout2 != null) {
                                                                                                                    i10 = R.id.nav_upgrade_tip;
                                                                                                                    FrameLayout frameLayout3 = (FrameLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.nav_upgrade_tip);
                                                                                                                    if (frameLayout3 != null) {
                                                                                                                        i10 = R.id.nav_upgrade_tip_group;
                                                                                                                        Group group2 = (Group) com.google.android.play.core.assetpacks.c.u(inflate, R.id.nav_upgrade_tip_group);
                                                                                                                        if (group2 != null) {
                                                                                                                            i10 = R.id.nav_upgrade_tip_iv;
                                                                                                                            if (((ImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.nav_upgrade_tip_iv)) != null) {
                                                                                                                                i10 = R.id.nav_upgrade_tv;
                                                                                                                                TextView textView2 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.nav_upgrade_tv);
                                                                                                                                if (textView2 != null) {
                                                                                                                                    i10 = R.id.notification_on;
                                                                                                                                    if (((SwitchCompat) com.google.android.play.core.assetpacks.c.u(inflate, R.id.notification_on)) != null) {
                                                                                                                                        i10 = R.id.scrollContent;
                                                                                                                                        if (((ScrollView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.scrollContent)) != null) {
                                                                                                                                            i10 = R.id.subscribe_bg;
                                                                                                                                            if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.subscribe_bg)) != null) {
                                                                                                                                                i10 = R.id.subscribe_content;
                                                                                                                                                if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.subscribe_content)) != null) {
                                                                                                                                                    i10 = R.id.subscribe_layout;
                                                                                                                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.subscribe_layout);
                                                                                                                                                    if (constraintLayout3 != null) {
                                                                                                                                                        i10 = R.id.subscribe_lottie;
                                                                                                                                                        LottieAnimationView lottieAnimationView = (LottieAnimationView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.subscribe_lottie);
                                                                                                                                                        if (lottieAnimationView != null) {
                                                                                                                                                            i10 = R.id.subscribe_title;
                                                                                                                                                            if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.subscribe_title)) != null) {
                                                                                                                                                                i10 = R.id.subscribed;
                                                                                                                                                                TextView textView3 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.subscribed);
                                                                                                                                                                if (textView3 != null) {
                                                                                                                                                                    i10 = R.id.theme_iv;
                                                                                                                                                                    if (((ImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.theme_iv)) != null) {
                                                                                                                                                                        i10 = R.id.tv_language;
                                                                                                                                                                        if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_language)) != null) {
                                                                                                                                                                            i10 = R.id.tv_setting_add_widgets;
                                                                                                                                                                            TextView textView4 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_setting_add_widgets);
                                                                                                                                                                            if (textView4 != null) {
                                                                                                                                                                                i10 = R.id.tv_theme;
                                                                                                                                                                                TextView textView5 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_theme);
                                                                                                                                                                                if (textView5 != null) {
                                                                                                                                                                                    i10 = R.id.tv_version;
                                                                                                                                                                                    if (((AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_version)) != null) {
                                                                                                                                                                                        i10 = R.id.upgrade_iv;
                                                                                                                                                                                        if (((ImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.upgrade_iv)) != null) {
                                                                                                                                                                                            return new a1((LinearLayout) inflate, frameLayout, linearLayout, linearLayout2, constraintLayout, frameLayout2, group, textView, constraintLayout2, frameLayout3, group2, textView2, constraintLayout3, lottieAnimationView, textView3, textView4, textView5);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpOWhkSRA6IA==", "MDTuu0Iw").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.a
    public final int u0() {
        return R.layout.fragment_settings;
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.a
    public final void v0() {
        t0.d0(b.b.x(this), null, null, new SettingFragment$initViewModel$1(this, null), 3);
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.a
    public final void x0() {
        SwitchCompat switchCompat;
        boolean z10;
        boolean isRequestPinAppWidgetSupported;
        int i10;
        int i11;
        if (r() == null) {
            return;
        }
        a0.a(r(), false);
        y0().f712o.addOnLayoutChangeListener(new pdf.pdfreader.viewer.editor.free.feature.ai.widget.l(this, 2));
        a1 y02 = y0();
        String p10 = ea.a.p("UWklZBpuBS4BdVZzCnI_YiFk", "WWao5GP1");
        TextView textView = y02.f712o;
        kotlin.jvm.internal.g.d(textView, p10);
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.frag.SettingFragment$initViews$2
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                invoke2(view);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                kotlin.jvm.internal.g.e(it, "it");
                tn.a.b(it.getContext(), ea.a.p("QGU_dBpuZw==", "Hm08bfLI"), ea.a.p("PGVFdBBuUF8qciVfFmwBY2s=", "ItlB1RhJ"));
                BaseSubscriptionActivity.a aVar = BaseSubscriptionActivity.L;
                Context context = it.getContext();
                kotlin.jvm.internal.g.d(context, ea.a.p("XXRnYwZuBWUwdA==", "qk4Iiqsf"));
                String p11 = ea.a.p("PGVFdBBuZw==", "slg1igBh");
                aVar.getClass();
                BaseSubscriptionActivity.a.a(context, p11);
            }
        });
        a1 y03 = y0();
        String p11 = ea.a.p("UWklZBpuBS4cYUJUDHI7cw==", "33vywzUa");
        LinearLayout linearLayout = y03.f701d;
        kotlin.jvm.internal.g.d(linearLayout, p11);
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(linearLayout, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.frag.SettingFragment$initViews$3
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                invoke2(view);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                kotlin.jvm.internal.g.e(it, "it");
                tn.a.d(it.getContext(), ea.a.p("QGU_dBpuZw==", "11meEuaA"), ea.a.p("N2UzdC1uD188ZRRta2M7aVtr", "qnDGDhqY"), ea.a.p("B2UBdCFuZw==", "28tuHCQE"), false);
                tn.b.b(it.getContext());
            }
        });
        View r02 = r0(R.id.nav_browse_pdf);
        kotlin.jvm.internal.g.d(r02, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuXGEwXyFyX3dKZWpwKGYp", "095L3qvM"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(r02, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.frag.SettingFragment$initViews$4
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                invoke2(view);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                androidx.fragment.app.n nVar;
                kotlin.jvm.internal.g.e(it, "it");
                AppOpenManager.c().f23907g = false;
                try {
                    nVar = SettingFragment.this.f27964j0;
                } catch (Exception unused) {
                    AppOpenManager.c().f23907g = true;
                }
                if (nVar != null) {
                    nVar.a(Boolean.TRUE);
                    tn.a.a(ReaderPdfApplication.m(), ea.a.p("UG85ZSxmC2xl", "hZ3Sr1FZ"));
                    if (SettingFragment.this.r() != null) {
                        tn.a.b(SettingFragment.this.g0(), ea.a.p("PGVFdBBuZw==", "A3ZMln8w"), ea.a.p("PGVFdBBuUF8saS93BWQOX1ZsB2Nr", "OromVzvx"));
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.g.i(ea.a.p("X2E-bhBoB3I=", "5mmsvpxb"));
                throw null;
            }
        });
        View r03 = r0(R.id.nav_share_app);
        kotlin.jvm.internal.g.d(r03, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuAGEzXxZoNXIkXy5wHCk=", "jFkQTAOl"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(r03, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.frag.SettingFragment$initViews$5
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                invoke2(view);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                kotlin.jvm.internal.g.e(it, "it");
                AppOpenManager.c().f23907g = false;
                SettingFragment settingFragment = SettingFragment.this;
                SettingFragment.a aVar = SettingFragment.f27957u0;
                settingFragment.getClass();
                try {
                    String string = settingFragment.v().getString(R.string.arg_res_0x7f13036c);
                    kotlin.jvm.internal.g.d(string, ea.a.p("PWVCbwxyVGUpLi1lAVMcclxuCSgXLhZ0M2laZ29yLmErZUNfGHBHXzRhJ2Up", "GwzLA4AK"));
                    String string2 = settingFragment.v().getString(R.string.arg_res_0x7f130361);
                    kotlin.jvm.internal.g.d(string2, ea.a.p("QWU4bwZyAWUBLlNlHVMici1uVSgULjB0i4CTLiNlDWRWcnlfAGgDchdfVXAZXyJpMGxXKQ==", "i5Qlj6DM"));
                    Context g02 = settingFragment.g0();
                    String format = String.format(string2, Arrays.copyOf(new Object[]{string}, 1));
                    kotlin.jvm.internal.g.d(format, ea.a.p("KW9DbRh0H2Y1cidhASxIKlRyCXMp", "Jvj2CoVe"));
                    e1.c(g02, string, format);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                if (SettingFragment.this.r() != null) {
                    tn.a.b(SettingFragment.this.g0(), ea.a.p("QGU_dBpuZw==", "0cU5XoO0"), ea.a.p("HGUjdDxuA187aAdyUWEncGdjPmkqaw==", "Q7oWUdd9"));
                }
            }
        });
        View r04 = r0(R.id.nav_feedback);
        kotlin.jvm.internal.g.d(r04, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuXGEwXyVlMmQRYSVrKQ==", "WsF58Zjl"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(r04, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.frag.SettingFragment$initViews$6
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                invoke2(view);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                kotlin.jvm.internal.g.e(it, "it");
                SettingFragment settingFragment = SettingFragment.this;
                SettingFragment.a aVar = SettingFragment.f27957u0;
                androidx.fragment.app.u i12 = settingFragment.i();
                if (i12 != null) {
                    Intent intent = new Intent(i12, ReaderFeedbackActivity.class);
                    intent.putExtra(ea.a.p("O2Fn", "vmRyXuE2"), ea.a.p("QGU_dBpuZw==", "hILSH2aj"));
                    h1.startActivity(i12, intent);
                }
                if (SettingFragment.this.r() != null) {
                    tn.a.b(SettingFragment.this.g0(), ea.a.p("O2U4dBluZw==", "9MHLpjEc"), ea.a.p("BGUddCRuFl8uZQNkVmE0a2djPmkqaw==", "VcwiMqml"));
                }
            }
        });
        View r05 = r0(R.id.nav_policy);
        kotlin.jvm.internal.g.d(r05, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuXGEwXzNvC2kueSk=", "gMoJ0RWg"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(r05, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.frag.SettingFragment$initViews$7
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                invoke2(view);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                kotlin.jvm.internal.g.e(it, "it");
                SettingFragment settingFragment = SettingFragment.this;
                SettingFragment.a aVar = SettingFragment.f27957u0;
                androidx.fragment.app.u i12 = settingFragment.i();
                if (i12 != null) {
                    tn.b.c(i12, i12.getResources().getString(R.string.arg_res_0x7f130353));
                    g0.f28700b = -1;
                }
                if (SettingFragment.this.r() != null) {
                    tn.a.d(SettingFragment.this.g0(), ea.a.p("QGU_dBpuZw==", "5pKATAGi"), ea.a.p("PGVFdBBuUF8qbyZpFnk3Y1lpDWs=", "KAIlrvWA"), ea.a.p("PGVFdBBuZw==", "Xz3iC8RT"), false);
                }
            }
        });
        a1 y04 = y0();
        String p12 = ea.a.p("LWlfZBBuUC40YTxTFmEGU1B0GmkrZw==", "DPGekOTT");
        LinearLayout linearLayout2 = y04.c;
        kotlin.jvm.internal.g.d(linearLayout2, p12);
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(linearLayout2, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.frag.SettingFragment$initViews$8
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                kotlin.jvm.internal.g.e(it, "it");
                tn.a.b(ScanEventCenter.a(), ea.a.p("BGUQdB1uZw==", "fAwdtCR9"), ea.a.p("QGU_dBpuBV8BY1VuNmM6aSdr", "vfzBvtaj"));
                int i12 = ScanSettingActivity.f25783v;
                Context context = it.getContext();
                kotlin.jvm.internal.g.d(context, ea.a.p("IXRLYxpuGGUwdA==", "VlHeulvq"));
                context.startActivity(new Intent(context, ScanSettingActivity.class));
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                invoke2(view);
                return tf.d.f30009a;
            }
        });
        a1 y05 = y0();
        String p13 = ea.a.p("NGkaZBtuMy4mYRBUXGU6ZQ==", "CbVtrTY9");
        ConstraintLayout constraintLayout = y05.f702e;
        kotlin.jvm.internal.g.d(constraintLayout, p13);
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(constraintLayout, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.frag.SettingFragment$initViews$9
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                invoke2(view);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(final View themeView) {
                kotlin.jvm.internal.g.e(themeView, "themeView");
                tn.a.b(themeView.getContext(), ea.a.p("PGVFdBBuZw==", "Qo4uNGje"), ea.a.p("PGVFdBBuUF8uaC9tEF8LbFxjaw==", "2K1TJW3C"));
                SettingFragment settingFragment = SettingFragment.this;
                if (settingFragment.f27968n0) {
                    settingFragment.f27968n0 = false;
                    settingFragment.y0().f704g.setVisibility(8);
                    no.f b10 = no.f.b(themeView.getContext());
                    Context context = themeView.getContext();
                    b10.getClass();
                    d1.b(context).c(ea.a.p("QnMfcmlzIHQ8aQhna3Q_ZVVlDXQgcGkxQDU=", "oN7z6EG2"), false);
                }
                c3 c3Var = new c3(SettingFragment.this.g0());
                final SettingFragment settingFragment2 = SettingFragment.this;
                c3Var.f27514y = new ro.a() { // from class: pdf.pdfreader.viewer.editor.free.ui.frag.v
                    @Override // ro.a
                    public final void o(Object obj) {
                        jl.a aVar;
                        Integer num = (Integer) obj;
                        String p14 = ea.a.p("Y3RfZShlImktdw==", "weG7EtXH");
                        View view = themeView;
                        kotlin.jvm.internal.g.e(view, p14);
                        String p15 = ea.a.p("DmgZc20w", "uEzpIyfH");
                        SettingFragment settingFragment3 = settingFragment2;
                        kotlin.jvm.internal.g.e(settingFragment3, p15);
                        no.f b11 = no.f.b(view.getContext());
                        Context context2 = view.getContext();
                        b11.getClass();
                        d1.b(context2).c(ea.a.p("RnMucixzCm8FX0BoDG0zXyN1W2QjX3I0NQ==", "cp0ifJ7N"), false);
                        kotlin.jvm.internal.g.d(num, ea.a.p("PnQ=", "KnWHBHTC"));
                        int intValue = num.intValue();
                        SettingFragment.a aVar2 = SettingFragment.f27957u0;
                        settingFragment3.z0(intValue);
                        androidx.fragment.app.u i12 = settingFragment3.i();
                        if (i12 instanceof jl.a) {
                            aVar = (jl.a) i12;
                        } else {
                            aVar = null;
                        }
                        if (aVar != null) {
                            aVar.S1(num.intValue());
                        }
                    }
                };
                c3Var.show();
            }
        });
        no.f b10 = no.f.b(r());
        Context r4 = r();
        b10.getClass();
        z0(no.f.a(r4));
        a1 y06 = y0();
        String p14 = ea.a.p("UWklZBpuBS4cYUJVGWckYSBl", "FSVpgvdG");
        ConstraintLayout constraintLayout2 = y06.f706i;
        kotlin.jvm.internal.g.d(constraintLayout2, p14);
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(constraintLayout2, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.frag.SettingFragment$initViews$10
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                invoke2(view);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View upgradeView) {
                kotlin.jvm.internal.g.e(upgradeView, "upgradeView");
                tn.a.b(upgradeView.getContext(), ea.a.p("QGU_dBpuZw==", "tz85LyO3"), ea.a.p("PGVFdBBuUF8vcC5hAWU3Y1lpDWs=", "gAcYWP3Z"));
                androidx.fragment.app.u i12 = SettingFragment.this.i();
                if (i12 != null) {
                    SettingFragment settingFragment = SettingFragment.this;
                    if (ge.h.a(i12)) {
                        SettingFragment$sideUpgradeChecker$1 settingFragment$sideUpgradeChecker$1 = settingFragment.f27973s0;
                        androidx.fragment.app.u f02 = settingFragment.f0();
                        ea.a.p("QWU6dRpyB0ERdF12AHQvKCk=", "yofasZpb");
                        LifecycleCoroutineScopeImpl x4 = b.b.x(settingFragment);
                        settingFragment$sideUpgradeChecker$1.getClass();
                        c5.a b11 = c5.a.b();
                        b11.a();
                        Object obj = b11.c.f5583e.i().second;
                        kotlin.jvm.internal.g.d(obj, "getInstance().upgradeCon…upgradeOpenSetting.second");
                        if (((Boolean) obj).booleanValue() && !settingFragment$sideUpgradeChecker$1.d().f18041g) {
                            settingFragment$sideUpgradeChecker$1.d().d(f02, new c5.f(settingFragment$sideUpgradeChecker$1, f02, x4));
                            return;
                        }
                        return;
                    }
                    j1.e(i12, settingFragment.x(R.string.arg_res_0x7f130228), true, null, -1);
                }
            }
        });
        View r06 = r0(R.id.nav_language);
        kotlin.jvm.internal.g.d(r06, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuAGEzXwlhJWcgYSZlKQ==", "YAWfKUAQ"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(r06, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.frag.SettingFragment$initViews$11
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                invoke2(view);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                kotlin.jvm.internal.g.e(it, "it");
                Context r10 = SettingFragment.this.r();
                if (r10 != null) {
                    SettingFragment settingFragment = SettingFragment.this;
                    tn.a.b(r10, ea.a.p("QmU7dFBuZw==", "u41O9pmd"), ea.a.p("QGU_dBpuBV8eYVpnHGExZRtjXmklaw==", "gVMiSdQR"));
                    if (settingFragment.f27960f0 == null) {
                        settingFragment.f27960f0 = new pdf.pdfreader.viewer.editor.free.ui.dialog.e(r10, new u(settingFragment, r10));
                    }
                    pdf.pdfreader.viewer.editor.free.ui.dialog.e eVar = settingFragment.f27960f0;
                    if (eVar == null || eVar.isShowing()) {
                        return;
                    }
                    eVar.show();
                }
            }
        });
        this.f27958d0 = (TextView) r0(R.id.tv_language);
        String c = a0.c(g0());
        TextView textView2 = this.f27958d0;
        if (textView2 != null) {
            textView2.setText(c);
        }
        View r07 = r0(R.id.keep_on_switch);
        SwitchCompat switchCompat2 = null;
        if (r07 instanceof SwitchCompat) {
            switchCompat = (SwitchCompat) r07;
        } else {
            switchCompat = null;
        }
        this.f27959e0 = switchCompat;
        if (switchCompat != null) {
            switchCompat.setChecked(no.f.b(g0()).f22628a);
        }
        SwitchCompat switchCompat3 = this.f27959e0;
        if (switchCompat3 != null) {
            switchCompat3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.frag.q
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    SettingFragment.a aVar = SettingFragment.f27957u0;
                    String p15 = ea.a.p("R2gic1cw", "01zj77N6");
                    SettingFragment settingFragment = SettingFragment.this;
                    kotlin.jvm.internal.g.e(settingFragment, p15);
                    b.b.O(settingFragment.f0(), z11);
                    tn.a.b(settingFragment.g0(), ea.a.p("QGU_dBpuZw==", "8RsQFY70"), ea.a.p("SmUEdBBuEV87YxRlUW44bmdjPmkqaw==", "ri9pyvdi"));
                }
            });
        }
        String str = "";
        if (r() != null) {
            g0();
            ea.a.p("QWUmdR5yPEMnbhJlTHR_KQ==", "kq3WwYKX");
            c1 c1Var = c1.f28564a;
            String p15 = ea.a.p("MA==", "FfXcv6BU");
            String h10 = de.e.h(c1.G, "");
            if (android.support.v4.media.session.h.b("DW8-Zitn", "CKnPBqbK", h10) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                p15 = h10;
            }
            boolean equals = TextUtils.equals(ea.a.p("MQ==", "eMqFwMxP"), p15);
            PdfReaderOpenDefaultDialog.a aVar = PdfReaderOpenDefaultDialog.J;
            Context g02 = g0();
            ea.a.p("PWVAdRByUkM1bj5lDXRAKQ==", "TeKoxy22");
            aVar.getClass();
            boolean z11 = !PdfReaderOpenDefaultDialog.a.b(g02);
            View r08 = r0(R.id.nav_notification);
            View r09 = r0(R.id.nav_default_open);
            if (r08 != null) {
                if (equals) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                r08.setVisibility(i11);
            }
            if (r09 != null) {
                if (z11) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                r09.setVisibility(i10);
            }
            if (r() != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    isRequestPinAppWidgetSupported = AppWidgetManager.getInstance(r()).isRequestPinAppWidgetSupported();
                    if (isRequestPinAppWidgetSupported) {
                        y0().f713p.setVisibility(0);
                    }
                }
                y0().f713p.setVisibility(8);
            }
        }
        View r010 = r0(R.id.notification_on);
        if (r010 instanceof SwitchCompat) {
            switchCompat2 = (SwitchCompat) r010;
        }
        if (switchCompat2 != null) {
            switchCompat2.setChecked(no.f.b(g0()).f22629b);
        }
        if (switchCompat2 != null) {
            switchCompat2.setOnCheckedChangeListener(new p8.a(this, 1));
        }
        View r011 = r0(R.id.nav_default_open);
        if (r011 != null) {
            r011.setOnClickListener(new pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.r(this, 1));
        }
        tn.a.b(r(), ea.a.p("QGU_dBpuZw==", "n59IFwR6"), ea.a.p("QGU_XwdlDl8BaFt3", "R5RbUg48"));
        View r012 = r0(R.id.nav_join_telegram);
        if (r012 != null) {
            r012.setOnClickListener(new u4.g(this, 24));
        }
        View r013 = r0(R.id.tv_version);
        kotlin.jvm.internal.g.c(r013, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuB25DbjZsWiA7eUFlWWFZZChvI2RbdwFkUmUaLhFlHXQ-aQt3", "exFAhnC6"));
        TextView textView3 = (TextView) r013;
        if (TextUtils.isEmpty(this.f27961g0)) {
            try {
                Context r10 = r();
                if (r10 != null) {
                    Properties properties = new Properties();
                    try {
                        properties.load(r10.getAssets().open(ea.a.p("UG8lZhpnTHAAb0RlG3Q_ZXM=", "XtR1Mppa")));
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                    if (properties.containsKey(ea.a.p("OWVDcxBvbg==", "8pyw6gkV"))) {
                        str = properties.getProperty(ea.a.p("OGUfcyhvbg==", "xBNmAHAK"));
                    }
                    this.f27961g0 = str;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        String str2 = this.f27961g0;
        if (str2 != null) {
            textView3.setText(y(R.string.arg_res_0x7f13040c, ea.a.p("fi4JLjE=", "xNhsZufi")) + str2);
        }
        textView3.setOnClickListener(new u4.j(this, 25));
        a1 y07 = y0();
        String p16 = ea.a.p("UWklZBpuBS4GdmdlHXQ_biNBVmQRaSdnFnRz", "sagHKUN9");
        TextView textView4 = y07.f713p;
        kotlin.jvm.internal.g.d(textView4, p16);
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView4, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.frag.SettingFragment$initViews$18
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                invoke2(view);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                SettingFragment settingFragment;
                pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.b bVar;
                kotlin.jvm.internal.g.e(it, "it");
                Context r11 = SettingFragment.this.r();
                if (r11 == null || (bVar = (settingFragment = SettingFragment.this).f27971q0) == null) {
                    return;
                }
                if (settingFragment.f27972r0 == null) {
                    settingFragment.f27972r0 = new PdfReaderAppWidgetNewDialog(r11, WidgetFromType.Setting, settingFragment.f27970p0, bVar);
                }
                PdfReaderAppWidgetNewDialog pdfReaderAppWidgetNewDialog = settingFragment.f27972r0;
                if (pdfReaderAppWidgetNewDialog != null) {
                    pdfReaderAppWidgetNewDialog.show();
                }
                if (eo.e.f(settingFragment.r()) != 3) {
                    eo.e.p(settingFragment.r(), 3);
                }
            }
        });
    }

    public final a1 y0() {
        i2.a aVar = this.f24022b0;
        kotlin.jvm.internal.g.c(aVar, ea.a.p("IHU9bBJjCG4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiA6eSFlEnANZmZwAmZGZTZkXXJ8diBlQWUGLhRkOHQtcmBmI2VXLg1hPGEEaVpkPm5fLhRyKGdbZRp0ImUldCtuKXMTaVxkAG5n", "9fNQ2iTC"));
        return (a1) aVar;
    }

    public final void z0(int i10) {
        String string;
        a1 y02 = y0();
        if (i10 == no.f.f22626q) {
            string = v().getString(R.string.arg_res_0x7f130260);
        } else if (i10 == no.f.f22627r) {
            string = v().getString(R.string.arg_res_0x7f130261);
        } else {
            string = v().getString(R.string.arg_res_0x7f1304c2);
        }
        y02.f714q.setText(string);
    }
}
