package pdf.pdfreader.viewer.editor.free.ui.vm;

import android.app.Application;
import androidx.lifecycle.a;
import androidx.lifecycle.w;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.v;
import nl.g;
import no.d;
import pdf.pdfreader.viewer.editor.free.ads.s.network.NetworkType;
import pdf.pdfreader.viewer.editor.free.feature.ocr.data.OCRWorkFlow;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: AppViewModel.kt */
/* loaded from: classes3.dex */
public final class AppViewModel extends a {

    /* renamed from: d  reason: collision with root package name */
    public final w<Boolean> f28147d;

    /* renamed from: e  reason: collision with root package name */
    public final w<g> f28148e;

    /* renamed from: f  reason: collision with root package name */
    public final w<Boolean> f28149f;

    /* renamed from: g  reason: collision with root package name */
    public final w f28150g;

    /* renamed from: h  reason: collision with root package name */
    public final w<d> f28151h;

    /* renamed from: i  reason: collision with root package name */
    public final w f28152i;

    /* renamed from: j  reason: collision with root package name */
    public final v f28153j;

    /* renamed from: k  reason: collision with root package name */
    public final w<Boolean> f28154k;

    /* renamed from: l  reason: collision with root package name */
    public final StateFlowImpl f28155l;

    /* renamed from: m  reason: collision with root package name */
    public final StateFlowImpl f28156m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppViewModel(Application application) {
        super(application);
        kotlin.jvm.internal.g.e(application, "application");
        this.f28147d = new w<>(null);
        this.f28148e = new w<>();
        w<Boolean> wVar = new w<>(Boolean.FALSE);
        this.f28149f = wVar;
        this.f28150g = wVar;
        w<d> wVar2 = new w<>(null);
        this.f28151h = wVar2;
        this.f28152i = wVar2;
        this.f28153j = ea.a.d(0, 7);
        this.f28154k = new w<>(null);
        this.f28155l = t0.a(null);
        this.f28156m = t0.a(null);
    }

    public final void d(Boolean bool) {
        t0.d0(t0.X(this), null, null, new AppViewModel$sendEventSubscriptionState$1(this, bool, null), 3);
    }

    public final void e(NetworkType networkType) {
        t0.d0(t0.X(this), null, null, new AppViewModel$sendNetworkState$1(this, networkType, null), 3);
    }

    public final void f(OCRWorkFlow oCRWorkFlow) {
        t0.d0(t0.X(this), null, null, new AppViewModel$sendOCRWorkflowFinishEvent$1(this, oCRWorkFlow, null), 3);
    }

    public final void g(g gVar) {
        this.f28148e.k(gVar);
    }

    public final void h(boolean z10) {
        this.f28149f.k(Boolean.valueOf(z10));
    }

    public final void i(d dVar) {
        this.f28151h.j(dVar);
    }
}
