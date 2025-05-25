package pdf.pdfreader.viewer.editor.free.feature.scan.ui;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.gyf.immersionbar.BarHide;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.scan.group.enumerate.GroupAiFilterType;
import pdf.pdfreader.viewer.editor.free.utils.event.ScanEventCenter;

/* compiled from: ScanSettingActivity.kt */
/* loaded from: classes3.dex */
public final class ScanSettingActivity extends jl.a {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ int f25783v = 0;

    /* renamed from: t  reason: collision with root package name */
    public final tf.c f25784t = kotlin.a.a(new cg.a<am.s>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ScanSettingActivity$binding$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final am.s invoke() {
            View inflate = ScanSettingActivity.this.getLayoutInflater().inflate(R.layout.activity_scan_setting, (ViewGroup) null, false);
            int i10 = R.id.back_iv;
            AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.back_iv);
            if (appCompatImageView != null) {
                i10 = R.id.filter_background;
                View u7 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.filter_background);
                if (u7 != null) {
                    i10 = R.id.scan_batch_background;
                    View u10 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.scan_batch_background);
                    if (u10 != null) {
                        i10 = R.id.scan_batch_setting_title_tv;
                        if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.scan_batch_setting_title_tv)) != null) {
                            i10 = R.id.scan_crop_logo_iv;
                            if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.scan_crop_logo_iv)) != null) {
                                i10 = R.id.scan_crop_setting_arrow_iv;
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.scan_crop_setting_arrow_iv);
                                if (appCompatImageView2 != null) {
                                    i10 = R.id.scan_crop_setting_content_tv;
                                    TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.scan_crop_setting_content_tv);
                                    if (textView != null) {
                                        i10 = R.id.scan_crop_setting_desc_tv;
                                        if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.scan_crop_setting_desc_tv)) != null) {
                                            i10 = R.id.scan_crop_setting_title_tv;
                                            if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.scan_crop_setting_title_tv)) != null) {
                                                i10 = R.id.scan_filter_logo_iv;
                                                if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.scan_filter_logo_iv)) != null) {
                                                    i10 = R.id.scan_filter_setting_arrow_iv;
                                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.scan_filter_setting_arrow_iv);
                                                    if (appCompatImageView3 != null) {
                                                        i10 = R.id.scan_filter_setting_content_tv;
                                                        TextView textView2 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.scan_filter_setting_content_tv);
                                                        if (textView2 != null) {
                                                            i10 = R.id.scan_filter_setting_title_tv;
                                                            if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.scan_filter_setting_title_tv)) != null) {
                                                                i10 = R.id.title_tv;
                                                                if (((AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.title_tv)) != null) {
                                                                    i10 = R.id.top_space;
                                                                    Space space = (Space) com.google.android.play.core.assetpacks.c.u(inflate, R.id.top_space);
                                                                    if (space != null) {
                                                                        i10 = R.id.topView;
                                                                        View u11 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.topView);
                                                                        if (u11 != null) {
                                                                            return new am.s((ConstraintLayout) inflate, appCompatImageView, u7, u10, appCompatImageView2, textView, appCompatImageView3, textView2, space, u11);
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
            throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpEGhUSQE6IA==", "pDBOdtEx").concat(inflate.getResources().getResourceName(i10)));
        }
    });

    /* renamed from: u  reason: collision with root package name */
    public final tf.c f25785u = kotlin.a.a(new cg.a<List<? extends GroupAiFilterType>>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ScanSettingActivity$filters$2
        @Override // cg.a
        public final List<? extends GroupAiFilterType> invoke() {
            GroupAiFilterType.Companion.getClass();
            return GroupAiFilterType.a.a();
        }
    });

    public static final void a2(ScanSettingActivity scanSettingActivity) {
        int i10;
        scanSettingActivity.getClass();
        tn.a.b(ScanEventCenter.a(), ea.a.p("PGNQbiZzUnQuaSRn", "nTBFjAYs"), ea.a.p("F2M0bgFlAl8rcglwa2M7aVtr", "73dUrvKF"));
        jn.a.c.getClass();
        if (jn.a.h() == 0) {
            i10 = 0;
        } else if (jn.a.i() == 2) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        AppCompatImageView appCompatImageView = scanSettingActivity.c2().f1424e;
        kotlin.jvm.internal.g.d(appCompatImageView, ea.a.p("UWklZBpuBS4BY1VuKnI5cBdlRnQvbiRBPXIjd3h2", "OL1SGCo8"));
        new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.m(scanSettingActivity, appCompatImageView, i10, new n0(scanSettingActivity));
    }

    public static final void b2(ScanSettingActivity scanSettingActivity) {
        scanSettingActivity.getClass();
        tn.a.b(ScanEventCenter.a(), ea.a.p("QGMqbixzB3QGaVpn", "NjkHlLB0"), ea.a.p("QGMqbgBlFl8UaVh0DHIJYyhpUWs=", "5ra0AaOT"));
        AppCompatImageView appCompatImageView = scanSettingActivity.c2().f1426g;
        kotlin.jvm.internal.g.d(appCompatImageView, ea.a.p("UWklZBpuBS4BY1VuL2k6dCFyYWUydCpuCkFCcjp3KnY=", "m0UcIjlt"));
        new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.o(scanSettingActivity, appCompatImageView, new o0(scanSettingActivity), (List) scanSettingActivity.f25785u.getValue());
    }

    @Override // jl.a
    public final View D1() {
        tn.a.b(ScanEventCenter.a(), ea.a.p("QGMqbixzB3QGaVpn", "2kaL8xJs"), ea.a.p("PGNQbgplQ18paCV3", "ulMX22xx"));
        ConstraintLayout constraintLayout = c2().f1421a;
        kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("UWklZBpuBS4Ab1t0", "acfn3NAQ"));
        return constraintLayout;
    }

    @Override // jl.a
    public final int E1() {
        return 0;
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
        String string;
        AppCompatImageView appCompatImageView = c2().f1422b;
        kotlin.jvm.internal.g.d(appCompatImageView, ea.a.p("UWklZBpuBS4QYVdrIHY=", "8hOMnxS5"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatImageView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ScanSettingActivity$initView$1
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
                ScanSettingActivity.this.finish();
            }
        });
        jn.a.c.getClass();
        c2().f1427h.setText(nn.b.a(this, (GroupAiFilterType) kotlin.collections.m.t0(jn.a.j(), (List) this.f25785u.getValue())));
        TextView textView = c2().f1425f;
        if (jn.a.h() == 1) {
            int i10 = jn.a.i();
            if (i10 != 1) {
                if (i10 != 2) {
                    string = getString(R.string.arg_res_0x7f130080);
                } else {
                    string = getString(R.string.arg_res_0x7f1302c2);
                }
            } else {
                string = getString(R.string.arg_res_0x7f130080);
            }
        } else {
            string = getString(R.string.arg_res_0x7f130078);
        }
        textView.setText(string);
        TextView textView2 = c2().f1425f;
        kotlin.jvm.internal.g.d(textView2, ea.a.p("UWklZBpuBS4BY1VuKnI5cBdlRnQvbiRDKG49ZTZ0F3Y=", "GIXCsJF5"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView2, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ScanSettingActivity$initView$2
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
                ScanSettingActivity.a2(ScanSettingActivity.this);
            }
        });
        AppCompatImageView appCompatImageView2 = c2().f1424e;
        kotlin.jvm.internal.g.d(appCompatImageView2, ea.a.p("LWlfZBBuUC4pYytuNnIHcGZlGnQsbgJBEXJcdyp2", "eMPNc3cz"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatImageView2, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ScanSettingActivity$initView$3
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
                ScanSettingActivity.a2(ScanSettingActivity.this);
            }
        });
        TextView textView3 = c2().f1427h;
        kotlin.jvm.internal.g.d(textView3, ea.a.p("LWlfZBBuUC4pYytuM2kEdFByPWUxdAxuDUMibj9lKHQbdg==", "ktJUjMKF"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView3, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ScanSettingActivity$initView$4
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
                ScanSettingActivity.b2(ScanSettingActivity.this);
            }
        });
        AppCompatImageView appCompatImageView3 = c2().f1426g;
        kotlin.jvm.internal.g.d(appCompatImageView3, ea.a.p("LWlfZBBuUC4pYytuM2kEdFByPWUxdAxuAUEAcix3CnY=", "UkWOfrCC"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatImageView3, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.ScanSettingActivity$initView$5
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
                ScanSettingActivity.b2(ScanSettingActivity.this);
            }
        });
    }

    public final am.s c2() {
        return (am.s) this.f25784t.getValue();
    }

    @Override // jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.gyf.immersionbar.g r4 = com.gyf.immersionbar.g.r(this);
        if (this.f19294h && new com.gyf.immersionbar.a(this).f13751b) {
            r4.e(BarHide.FLAG_HIDE_NAVIGATION_BAR);
        }
        r4.p(c2().f1428i);
        r4.f13799k.f13757d = false;
        r4.o(!pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this));
        r4.j(!pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this));
        r4.i(R.color.colorPrimary);
        r4.h();
        r4.f();
    }

    @Override // jl.a
    public final void C1() {
    }
}
