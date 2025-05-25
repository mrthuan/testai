package el;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.ads.AppOpenManager;

/* compiled from: PreInstallNativeOpenAd.kt */
/* loaded from: classes3.dex */
public final class d implements ae.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f16806a;

    public d(c cVar) {
        this.f16806a = cVar;
    }

    @Override // ae.d
    public final void a(Context context, View view, yd.d dVar) {
        g.e(context, "context");
        c cVar = this.f16806a;
        cVar.f16803d = false;
        cVar.f16804e = false;
        cVar.f16805f = view;
        hl.a aVar = cVar.f16802b;
        if (aVar != null) {
            aVar.e();
        }
        c.a(ea.a.p("IG5wZDVvVmQ=", "YX1fIQh1"));
    }

    @Override // ae.c
    public final void b(Context context, yd.d dVar) {
        g.e(context, "context");
        hl.a aVar = this.f16806a.f16802b;
        if (aVar != null) {
            aVar.d();
        }
        AppOpenManager.c().f23907g = false;
        c.a(ea.a.p("IG5wZDpsXmNr", "6gK6Ve6W"));
    }

    @Override // ae.c
    public final void c(yd.a aVar) {
        c cVar = this.f16806a;
        cVar.f16803d = false;
        cVar.f16804e = false;
        cVar.f16801a = null;
        cVar.c = true;
        hl.a aVar2 = cVar.f16802b;
        if (aVar2 != null) {
            aVar2.f();
        }
        c.a("onAdLoadFailed " + aVar);
    }
}
