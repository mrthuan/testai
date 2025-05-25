package el;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.ads.ADRequestList;
import java.util.Iterator;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ads.AppOpenManager;
import pdf.pdfreader.viewer.editor.free.ads.standard.banner.BannerType;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.ui.act.LanguageChooseActivity;
import pdf.pdfreader.viewer.editor.free.utils.a0;
import pdf.pdfreader.viewer.editor.free.utils.c1;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import pdf.pdfreader.viewer.editor.free.utils.t1;

/* compiled from: LanguageMutableNativeB.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: g  reason: collision with root package name */
    public static final a f16791g = new a();
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: h  reason: collision with root package name */
    public static b f16792h;

    /* renamed from: a  reason: collision with root package name */
    public zd.d f16793a;

    /* renamed from: b  reason: collision with root package name */
    public hl.a f16794b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f16795d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f16796e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f16797f;

    /* compiled from: LanguageMutableNativeB.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public final synchronized b a() {
            b bVar;
            bVar = b.f16792h;
            if (bVar == null) {
                bVar = new b();
                b.f16792h = bVar;
            }
            return bVar;
        }
    }

    /* compiled from: LanguageMutableNativeB.kt */
    /* renamed from: el.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0214b implements ae.d {
        public C0214b() {
        }

        @Override // ae.d
        public final void a(Context context, View view, yd.d dVar) {
            g.e(context, "context");
            b bVar = b.this;
            bVar.f16795d = false;
            bVar.f16796e = false;
            hl.a aVar = bVar.f16794b;
            if (aVar != null) {
                aVar.e();
            }
            b.a(ea.a.p("IG5wZDVvVmQ=", "goyxl3FY"));
        }

        @Override // ae.c
        public final void b(Context context, yd.d dVar) {
            g.e(context, "context");
            b bVar = b.this;
            hl.a aVar = bVar.f16794b;
            if (aVar != null) {
                aVar.d();
            }
            bVar.f16797f = true;
            AppOpenManager.c().f23907g = false;
            b.a(ea.a.p("JW4RZHpsXmNr", "PbJP97CK"));
        }

        @Override // ae.c
        public final void c(yd.a aVar) {
            b bVar = b.this;
            bVar.f16795d = false;
            bVar.f16796e = false;
            bVar.f16793a = null;
            bVar.c = true;
            hl.a aVar2 = bVar.f16794b;
            if (aVar2 != null) {
                aVar2.f();
            }
            b.a("onAdLoadFailed " + aVar);
            b.a(ea.a.p("V2U4dAFvGyATZA==", "ErkoKSDp"));
        }
    }

    public static void a(String log) {
        g.e(log, "log");
        String m10 = androidx.activity.f.m(ea.a.p("X2ElZwZhBWU_dUBhC2wzTiV0W3YjQg==", "0LJ1GJY8"), " ", log);
        int i10 = zk.a.f32399a;
        t1.b(m10);
    }

    public final synchronized void b(Activity activity) {
        g.e(activity, "activity");
        if (BillingConfigImpl.c.w()) {
            String p10 = ea.a.p("N3I9bT91NCA9cwNyGCAka1FwcmwoblF1FWcUTSR0I2IrZRZhImkvZWhsCWFk", "L6GXVY3q");
            int i10 = zk.a.f32399a;
            t1.b(p10);
        } else if (this.f16795d) {
            a(ea.a.p("CWQRciZxBGU7dA9uUyx3c1NpIiAlb1dk", "oUh1Cqzw"));
        } else if (!c1.G(activity)) {
            a(ea.a.p("PGsvcENhVyAkbwdk", "UHOFc3cA"));
        } else {
            ADRequestList aDRequestList = new ADRequestList(new C0214b());
            float p02 = t0.p0(activity) * 0.66f;
            float dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.dp_330);
            if (p02 > dimensionPixelSize) {
                p02 = dimensionPixelSize;
            }
            aDRequestList.addAll(he.a.h(activity, p02));
            this.c = false;
            this.f16795d = true;
            this.f16796e = false;
            Iterator<yd.c> it = aDRequestList.iterator();
            while (it.hasNext()) {
                ((Bundle) it.next().f32118b.c).putInt(ea.a.p("LmRuYxFvXmM_cxVwGnMBdFxvbg==", "p6ollBEe"), !a0.i(activity) ? 1 : 0);
            }
            zd.d dVar = new zd.d(0);
            this.f16793a = dVar;
            a(ea.a.p("HW82ZBRhZA==", "yrqW4Ax9"));
            dVar.f(activity, aDRequestList);
        }
    }

    public final void c(LanguageChooseActivity context, FrameLayout frameLayout, int i10) {
        boolean z10;
        boolean z11;
        TextView textView;
        g.e(context, "context");
        if (BillingConfigImpl.c.w()) {
            String p10 = ea.a.p("G3IzbVp1LyA9cwNyGCAka1FwcmwoblF1FWcUTSR0I2IHZRhhR2k0ZWhsCWFk", "rwkV3B37");
            int i11 = zk.a.f32399a;
            t1.b(p10);
            return;
        }
        if (this.f16793a != null && !this.f16795d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            a(ea.a.p("QGgkd1NmA2keZVAgB28iICF4W3MyICJk", "qqyxS7P6"));
            return;
        }
        float p02 = t0.p0(context) * 0.66f;
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.dp_300);
        if (p02 > dimensionPixelSize) {
            p02 = dimensionPixelSize;
        }
        int i12 = (int) p02;
        try {
            if (this.f16793a != null) {
                frameLayout.removeAllViews();
                frameLayout.setVisibility(0);
                zd.d dVar = this.f16793a;
                if (dVar != null && dVar.i(context, frameLayout, i10, i12)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    this.f16796e = true;
                    hl.a aVar = this.f16794b;
                    if (aVar != null) {
                        aVar.f1(BannerType.Adaptive);
                    }
                    no.f.b(context).getClass();
                    if (no.f.f() && (textView = (TextView) frameLayout.findViewById(R.id.ad_action_button)) != null) {
                        textView.setText(context.getResources().getString(R.string.arg_res_0x7f130024));
                        textView.setAllCaps(false);
                    }
                    a(ea.a.p("PGhed1lzQmM5ZTlz", "klLeAnDi"));
                    return;
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        a(ea.a.p("QGgkd1NmA2keZWQ=", "AFKpSGPj"));
    }
}
