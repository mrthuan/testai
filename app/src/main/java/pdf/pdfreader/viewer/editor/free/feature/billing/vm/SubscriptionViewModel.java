package pdf.pdfreader.viewer.editor.free.feature.billing.vm;

import androidx.lifecycle.j0;
import ea.a;
import java.util.Iterator;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.r;
import kotlinx.coroutines.flow.v;
import ol.d;
import ol.e;
import ol.i;
import pdf.pdfreader.viewer.editor.free.billing.SubscriptionType;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionRetainFragment;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.state.SubscriptionRetainPage;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: SubscriptionViewModel.kt */
/* loaded from: classes3.dex */
public final class SubscriptionViewModel extends j0 {

    /* renamed from: d  reason: collision with root package name */
    public final v f24948d;

    /* renamed from: e  reason: collision with root package name */
    public final v f24949e;

    /* renamed from: f  reason: collision with root package name */
    public final v f24950f;

    /* renamed from: g  reason: collision with root package name */
    public final r f24951g;

    /* renamed from: h  reason: collision with root package name */
    public final r f24952h;

    /* renamed from: i  reason: collision with root package name */
    public final r f24953i;

    /* renamed from: j  reason: collision with root package name */
    public final StateFlowImpl f24954j;

    /* renamed from: k  reason: collision with root package name */
    public final StateFlowImpl f24955k;

    /* renamed from: l  reason: collision with root package name */
    public d f24956l;

    /* renamed from: m  reason: collision with root package name */
    public d f24957m;

    /* renamed from: n  reason: collision with root package name */
    public d f24958n;

    public SubscriptionViewModel() {
        d dVar;
        d dVar2;
        v d10 = a.d(0, 7);
        this.f24948d = d10;
        this.f24949e = d10;
        this.f24950f = a.d(1, 6);
        BillingConfigImpl billingConfigImpl = BillingConfigImpl.c;
        this.f24951g = billingConfigImpl.k();
        this.f24952h = billingConfigImpl.m();
        this.f24953i = (r) BillingConfigImpl.f24862p.getValue();
        StateFlowImpl a10 = t0.a(new pm.a(0));
        this.f24954j = a10;
        this.f24955k = a10;
        if (billingConfigImpl.q()) {
            dVar = e.f23480d;
        } else {
            dVar = e.c;
        }
        this.f24956l = dVar;
        if (billingConfigImpl.q()) {
            dVar2 = e.f23480d;
        } else {
            dVar2 = e.c;
        }
        this.f24957m = dVar2;
        this.f24958n = e.f23481e;
    }

    public static boolean h(String plan) {
        g.e(plan, "plan");
        if (g.a(plan, a.p("ezI=", "PYr79B09"))) {
            return BillingConfigImpl.c.h();
        }
        return BillingConfigImpl.c.i();
    }

    public final void d(SubscriptionType type) {
        g.e(type, "type");
        StateFlowImpl stateFlowImpl = this.f24954j;
        stateFlowImpl.setValue(pm.a.a((pm.a) stateFlowImpl.b(), type, false, 2));
    }

    public final d e(String plan) {
        g.e(plan, "plan");
        if (g.a(plan, a.p("ADI=", "PtH6QtKU"))) {
            return this.f24957m;
        }
        return this.f24956l;
    }

    public final boolean f(String plan) {
        d dVar;
        Object obj;
        boolean z10;
        g.e(plan, "plan");
        if (g.a(plan, a.p("ezI=", "CQNmfGaZ"))) {
            dVar = this.f24957m;
        } else {
            dVar = this.f24956l;
        }
        Iterator<T> it = dVar.c.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((i) obj).f23489a == SubscriptionType.YEAR_TRIAL_14D) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    public final boolean g(String plan) {
        d dVar;
        Object obj;
        boolean z10;
        g.e(plan, "plan");
        if (g.a(plan, a.p("BzI=", "t4e4XimI"))) {
            dVar = this.f24957m;
        } else {
            dVar = this.f24956l;
        }
        Iterator<T> it = dVar.c.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((i) obj).f23489a == SubscriptionType.YEAR_TRIAL_7D) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    public final void i(d newInfo, String plan) {
        boolean z10;
        Object obj;
        boolean z11;
        g.e(newInfo, "newInfo");
        g.e(plan, "plan");
        if (g.a(plan, a.p("BzI=", "vZpBVcIF"))) {
            this.f24957m = newInfo;
        } else {
            this.f24956l = newInfo;
        }
        StateFlowImpl stateFlowImpl = this.f24954j;
        pm.a aVar = (pm.a) stateFlowImpl.b();
        Iterator<T> it = newInfo.c.iterator();
        while (true) {
            z10 = false;
            if (it.hasNext()) {
                obj = it.next();
                if (((i) obj).f23489a == SubscriptionType.YEAR_TRIAL_3D) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (z11) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            z10 = true;
        }
        stateFlowImpl.setValue(pm.a.a(aVar, null, z10, 1));
    }

    public final void j(SubscriptionRetainPage page) {
        g.e(page, "page");
        t0.d0(t0.X(this), null, null, new SubscriptionViewModel$sendBackPressedEvent$1(this, page, null), 3);
    }

    public final void k() {
        t0.d0(t0.X(this), null, null, new SubscriptionViewModel$sendRestorePurchaseEvent$1(this, null), 3);
    }

    public final void l(SubscriptionRetainFragment fragment, String freeTrialCount, boolean z10) {
        g.e(fragment, "fragment");
        g.e(freeTrialCount, "freeTrialCount");
        t0.d0(t0.X(this), null, null, new SubscriptionViewModel$sendRetainPageContinueEvent$1(this, fragment, freeTrialCount, z10, null), 3);
    }

    public final void m(SubscriptionRetainFragment fragment) {
        g.e(fragment, "fragment");
        t0.d0(t0.X(this), null, null, new SubscriptionViewModel$sendRetainPageFinishEvent$1(this, fragment, null), 3);
    }

    public final void n(String str, boolean z10) {
        t0.d0(t0.X(this), null, null, new SubscriptionViewModel$sendRetainPageShowedEvent$1(this, str, z10, null), 3);
    }

    public final void o(boolean z10) {
        t0.d0(t0.X(this), null, null, new SubscriptionViewModel$sendWindowFocusChanged$1(this, z10, null), 3);
    }
}
