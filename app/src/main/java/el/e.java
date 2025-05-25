package el;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.u;
import com.google.ads.ADRequestList;
import java.util.Iterator;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ads.standard.banner.BannerType;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.utils.a0;
import pdf.pdfreader.viewer.editor.free.utils.c1;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import pdf.pdfreader.viewer.editor.free.utils.t1;

/* compiled from: UserGuideNativeCard.kt */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: g  reason: collision with root package name */
    public static final a f16807g = new a();
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: h  reason: collision with root package name */
    public static e f16808h;

    /* renamed from: a  reason: collision with root package name */
    public zd.d f16809a;

    /* renamed from: b  reason: collision with root package name */
    public hl.a f16810b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f16811d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f16812e;

    /* renamed from: f  reason: collision with root package name */
    public View f16813f;

    /* compiled from: UserGuideNativeCard.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public final synchronized e a() {
            e eVar;
            eVar = e.f16808h;
            if (eVar == null) {
                eVar = new e();
                e.f16808h = eVar;
            }
            return eVar;
        }
    }

    public static void a(String str) {
        String m10 = androidx.activity.f.m(ea.a.p("GnNUcj51XmQ_Tit0HHYNQ1RyZA==", "h2GR3MbU"), " ", str);
        int i10 = zk.a.f32399a;
        t1.b(m10);
    }

    public final synchronized void b(u uVar) {
        if (BillingConfigImpl.c.w()) {
            String p10 = ea.a.p("FnIBbT51JSA9cwNyGCAka1FwcmwoblF1FWcUTSR0I2IKZSphI2k-ZWhsCWFk", "8JfdWHKn");
            int i10 = zk.a.f32399a;
            t1.b(p10);
        } else if (this.f16811d) {
            a(ea.a.p("LmQRchxxQmUpdCNuEixIc15pHiApbwRk", "EML6yeZs"));
        } else if (!c1.k(uVar)) {
            a(ea.a.p("QGsicFNhBiAeb1Vk", "f5n2eDND"));
        } else {
            ADRequestList aDRequestList = new ADRequestList(new f(this));
            float p02 = t0.p0(uVar) * 0.62f;
            float dimensionPixelSize = uVar.getResources().getDimensionPixelSize(R.dimen.dp_300);
            if (p02 > dimensionPixelSize) {
                p02 = dimensionPixelSize;
            }
            aDRequestList.addAll(he.a.c(uVar, p02));
            this.c = false;
            this.f16811d = true;
            this.f16812e = false;
            Iterator<yd.c> it = aDRequestList.iterator();
            while (it.hasNext()) {
                ((Bundle) it.next().f32118b.c).putInt(ea.a.p("FGQKYyRvLWMtczlwW3M-dFFvbg==", "69uULDAf"), !a0.i(uVar) ? 1 : 0);
            }
            zd.d dVar = new zd.d();
            this.f16809a = dVar;
            a(ea.a.p("PW8kZGRhZA==", "41QED7cJ"));
            dVar.f(uVar, aDRequestList);
        }
    }

    public final void c(FrameLayout frameLayout) {
        boolean z10;
        ViewGroup viewGroup;
        if (BillingConfigImpl.c.w()) {
            String p10 = ea.a.p("Q3IubRp1DyAHc1FyRSAlay1wEmwnbiR1V2c2TQ90MWJfZQVhB2kUZVJsW2Fk", "6SzPAKta");
            int i10 = zk.a.f32399a;
            t1.b(p10);
            return;
        }
        if (this.f16809a != null && this.f16813f != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            a(ea.a.p("PGhed1lmVmk2ZS4gG28cIFB4B3MxIARk", "VnbKwEMA"));
            return;
        }
        try {
            View view = this.f16813f;
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
                frameLayout.addView(this.f16813f);
                frameLayout.setVisibility(0);
                this.f16812e = true;
                hl.a aVar = this.f16810b;
                if (aVar != null) {
                    aVar.f1(BannerType.Native);
                }
                Context context = frameLayout.getContext();
                g.d(context, ea.a.p("UmQHYQpvF3RcY1tuHWUudA==", "7SAk5iPb"));
                TextView textView = (TextView) frameLayout.findViewById(R.id.ad_action_button);
                if (textView != null) {
                    textView.setText(context.getResources().getString(R.string.arg_res_0x7f130024));
                    textView.setAllCaps(false);
                }
                a(ea.a.p("QGgkd1NzF2MRZUdz", "IatXiXqs"));
                return;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        a(ea.a.p("PGhed1lmVmk2ZWQ=", "6nuRruYm"));
    }
}
