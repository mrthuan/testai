package el;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ads.standard.banner.BannerType;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.utils.t1;

/* compiled from: PreInstallNativeOpenAd.kt */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: g  reason: collision with root package name */
    public static final a f16799g = new a();
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: h  reason: collision with root package name */
    public static c f16800h;

    /* renamed from: a  reason: collision with root package name */
    public zd.d f16801a;

    /* renamed from: b  reason: collision with root package name */
    public hl.a f16802b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f16803d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f16804e;

    /* renamed from: f  reason: collision with root package name */
    public View f16805f;

    /* compiled from: PreInstallNativeOpenAd.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public final synchronized c a() {
            c cVar;
            cVar = c.f16800h;
            if (cVar == null) {
                cVar = new c();
                c.f16800h = cVar;
            }
            return cVar;
        }
    }

    public static void a(String str) {
        String m10 = androidx.activity.f.m(ea.a.p("KnJWSRlzBGEkbChhQGkhZXdwN24IZA==", "qFz3wprO"), " ", str);
        int i10 = zk.a.f32399a;
        t1.b(m10);
    }

    public final void b(FrameLayout frameLayout) {
        boolean z10;
        ViewGroup viewGroup;
        if (BillingConfigImpl.c.w()) {
            String p10 = ea.a.p("GnIUbSF1HSA9cwNyGCAka1FwcmwoblF1FWcUTSR0I2IGZT9hPGkGZWhsCWFk", "RAjqHpg9");
            int i10 = zk.a.f32399a;
            t1.b(p10);
            return;
        }
        if (this.f16801a != null && this.f16805f != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            a(ea.a.p("PGhed1lmVmk2ZS4gG28cIFB4B3MxIARk", "lbW1NFmh"));
            return;
        }
        try {
            View view = this.f16805f;
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
                frameLayout.removeAllViews();
                frameLayout.addView(this.f16805f);
                frameLayout.setVisibility(0);
                this.f16804e = true;
                hl.a aVar = this.f16802b;
                if (aVar != null) {
                    aVar.f1(BannerType.Native);
                }
                Context context = frameLayout.getContext();
                g.d(context, ea.a.p("LmR9YQBvQnR0YyVuAWUQdA==", "cyoORFwP"));
                TextView textView = (TextView) frameLayout.findViewById(R.id.ad_action_button);
                if (textView != null) {
                    textView.setText(context.getResources().getString(R.string.arg_res_0x7f130024));
                    textView.setAllCaps(false);
                }
                a(ea.a.p("QGgkd1NzF2MRZUdz", "aD2tQ7ha"));
                return;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        a(ea.a.p("PGhed1lmVmk2ZWQ=", "1rAnsjVx"));
    }
}
