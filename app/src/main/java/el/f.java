package el;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.ads.AppOpenManager;

/* compiled from: UserGuideNativeCard.kt */
/* loaded from: classes3.dex */
public final class f implements ae.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f16814a;

    public f(e eVar) {
        this.f16814a = eVar;
    }

    @Override // ae.d
    public final void a(Context context, View view, yd.d dVar) {
        g.e(context, "context");
        e eVar = this.f16814a;
        eVar.f16811d = false;
        eVar.f16812e = false;
        eVar.f16813f = view;
        hl.a aVar = eVar.f16810b;
        if (aVar != null) {
            aVar.e();
        }
        e.a(ea.a.p("XG4KZD9vA2Q=", "uk092tbx"));
    }

    @Override // ae.c
    public final void b(Context context, yd.d dVar) {
        g.e(context, "context");
        hl.a aVar = this.f16814a.f16810b;
        if (aVar != null) {
            aVar.d();
        }
        AppOpenManager.c().f23907g = false;
        e.a(ea.a.p("IG5wZDpsXmNr", "Puhhkhxn"));
    }

    @Override // ae.c
    public final void c(yd.a aVar) {
        e eVar = this.f16814a;
        eVar.f16811d = false;
        eVar.f16812e = false;
        eVar.f16809a = null;
        eVar.c = true;
        hl.a aVar2 = eVar.f16810b;
        if (aVar2 != null) {
            aVar2.f();
        }
        e.a("onAdLoadFailed " + aVar);
        e.a(ea.a.p("IWUCdCRvASApZA==", "PGEqVx6n"));
    }
}
