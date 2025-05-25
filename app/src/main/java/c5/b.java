package c5;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.RectF;
import androidx.activity.ComponentActivity;
import c7.p;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import h5.c;
import j5.a;
import java.util.Objects;
import lib.zj.pdfeditor.PDFPageView;
import lib.zj.pdfeditor.PDFReaderView;
import lib.zj.pdfeditor.x;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.utils.c1;
import pdf.pdfreader.viewer.editor.free.utils.h1;
import pdf.pdfreader.viewer.editor.free.utils.q0;
import ud.k;
import ud.q;
import v6.s;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements d5.a, p.a, Continuation, OnPaidEventListener, x {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5566a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f5567b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.f5566a = i10;
        this.f5567b = obj;
        this.c = obj2;
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public final void a(AdValue adValue) {
        ResponseInfo responseInfo;
        ResponseInfo responseInfo2;
        int i10 = this.f5566a;
        String str = null;
        Object obj = this.c;
        Object obj2 = this.f5567b;
        switch (i10) {
            case 3:
                Context context = (Context) obj2;
                k this$0 = (k) obj;
                kotlin.jvm.internal.g.e(this$0, "this$0");
                String str2 = this$0.f30328j;
                NativeAd nativeAd = this$0.f30323e;
                if (nativeAd != null && (responseInfo2 = nativeAd.getResponseInfo()) != null) {
                    str = responseInfo2.a();
                }
                wd.a.d(context, adValue, str2, str, this$0.f30321b, this$0.f30327i);
                return;
            default:
                Context context2 = (Context) obj2;
                q this$02 = (q) obj;
                kotlin.jvm.internal.g.e(this$02, "this$0");
                String str3 = this$02.f30358j;
                AppOpenAd appOpenAd = this$02.c;
                if (appOpenAd != null && (responseInfo = appOpenAd.getResponseInfo()) != null) {
                    str = responseInfo.a();
                }
                wd.a.d(context2, adValue, str3, str, this$02.f30351b, this$02.f30355g);
                return;
        }
    }

    @Override // c7.p.a
    public final Object apply(Object obj) {
        p pVar = (p) this.f5567b;
        s6.b bVar = p.f5653f;
        pVar.getClass();
        Long h10 = p.h((SQLiteDatabase) obj, (s) this.c);
        if (h10 == null) {
            return Boolean.FALSE;
        }
        return (Boolean) p.l(pVar.f().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{h10.toString()}), new t5.i(5));
    }

    @Override // d5.a
    public final void b(boolean z10) {
        pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.c cVar;
        int parseInt;
        ComponentActivity componentActivity;
        int i10;
        d this$0 = (d) this.f5567b;
        Activity activity = (Activity) this.c;
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(activity, "$activity");
        a b10 = a.b();
        b10.a();
        Object obj = b10.c.f5583e.i().first;
        kotlin.jvm.internal.g.d(obj, "getInstance().upgradeCon….upgradeOpenSetting.first");
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean k10 = d.k(activity);
        ReaderHomeActivity.u uVar = (ReaderHomeActivity.u) this$0;
        c.a aVar = h5.c.f18014h;
        boolean z11 = false;
        if (z10) {
            if (uVar.d().a()) {
                ea.a.f16518b = false;
                uVar.f(uVar.c());
            }
            if (uVar.d().b() && (componentActivity = uVar.f18009a) != null) {
                o9.a aVar2 = uVar.d().f18038d;
                if (aVar2 == null) {
                    i10 = 0;
                } else {
                    i10 = aVar2.f22746a;
                }
                h5.c a10 = aVar.a(componentActivity);
                a.C0258a c0258a = j5.a.f19040b;
                if (i10 != c0258a.a(a10.f18016a).a("pi_lcac", 0)) {
                    j5.a.b(c0258a.a(aVar.a(componentActivity).f18016a), "pi_lcac", i10);
                    aVar.a(componentActivity).h(100000);
                    aVar.a(componentActivity).g(0);
                    h5.c a11 = aVar.a(componentActivity);
                    a11.f18019e = 0;
                    j5.a.b(c0258a.a(a11.f18016a), "pi_mdstt", 0);
                    h5.c a12 = aVar.a(componentActivity);
                    a12.c = 0;
                    j5.a.b(c0258a.a(a12.f18016a), "pi_mdit", 0);
                    h5.c a13 = aVar.a(componentActivity);
                    a13.f18021g = -2;
                    j5.a.b(c0258a.a(a13.f18016a), "pi_lmdsooat", -2);
                    aVar.a(componentActivity).f(false);
                }
            }
        }
        ReaderHomeActivity readerHomeActivity = ReaderHomeActivity.this;
        if (z10) {
            if (uVar.d().b()) {
                boolean u7 = c1.u(readerHomeActivity);
                if (u7) {
                    readerHomeActivity.f26667i1 = true;
                }
                if (readerHomeActivity.f26682q0 != null && readerHomeActivity.H != null && q0.f(readerHomeActivity, "is_can_show_update_red_dot", true) && u7) {
                    readerHomeActivity.P0 = true;
                    if (readerHomeActivity.H.getCurrentItem() == 0) {
                        readerHomeActivity.g2(readerHomeActivity.f26682q0.getSelectedTabPosition());
                    } else {
                        readerHomeActivity.g2(0);
                    }
                }
                String h10 = de.e.h(ea.a.p("LXBecgdkXF8laQhfQXMycmcxZjI=", "98X9f97h"), "");
                if (android.support.v4.media.session.h.b("UG8lZhpn", "HwGyYF80", h10) == 0) {
                    z11 = true;
                }
                if (z11) {
                    ea.a.p("OnBWchhkUl83aSRfAHMNcmoxWjJlZABmFXUGdEUtSC1iMQAwSTAw", "CUZ3tjee");
                } else {
                    try {
                        parseInt = Integer.parseInt(h10);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    aVar.a(readerHomeActivity).h(parseInt);
                }
                parseInt = 110000;
                aVar.a(readerHomeActivity).h(parseInt);
            }
        } else {
            readerHomeActivity.f26667i1 = false;
        }
        if (z10 && booleanValue && k10 && uVar.d().b() && (cVar = readerHomeActivity.E0) != null && !readerHomeActivity.F0) {
            cVar.f27673g.f28987b = Boolean.TRUE;
            if ((pdf.pdfreader.viewer.editor.free.utils.extension.c.f(readerHomeActivity) || h1.c()) && !readerHomeActivity.H0 && !readerHomeActivity.f19289b) {
                readerHomeActivity.E0.g(readerHomeActivity, pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.i.class);
            }
        }
    }

    @Override // lib.zj.pdfeditor.x
    public final void f(PDFReaderView pDFReaderView) {
        RectF rectF = (RectF) this.f5567b;
        RectF rectF2 = (RectF) this.c;
        int i10 = PDFPageView.f21175y1;
        if (pDFReaderView.L1 != null) {
            Objects.toString(rectF);
            Objects.toString(rectF2);
            mj.h hVar = pDFReaderView.L1;
            RectF rectF3 = hVar.c;
            if (rectF3 != null) {
                rectF3.setEmpty();
            }
            if (hVar.f22085d == null) {
                hVar.f22085d = new RectF();
            }
            if (hVar.f22086e == null) {
                hVar.f22086e = new RectF();
            }
            hVar.f22085d.set(rectF);
            hVar.f22086e.set(rectF2);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        Context context = (Context) this.f5567b;
        Intent intent = (Intent) this.c;
        Object obj = jb.j.c;
        if (PlatformVersion.a() && ((Integer) task.k()).intValue() == 402) {
            return jb.j.a(context, intent).g(new t1.b(1), new t5.f(11));
        }
        return task;
    }
}
