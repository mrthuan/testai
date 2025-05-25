package qi;

import lib.zj.office.system.beans.CalloutView.CalloutView;

/* compiled from: CalloutView.java */
/* loaded from: classes3.dex */
public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CalloutView f29352a;

    public b(CalloutView calloutView) {
        this.f29352a = calloutView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c cVar = this.f29352a.f20981f;
        if (cVar != null) {
            cVar.a();
        }
    }
}
