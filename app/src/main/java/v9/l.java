package v9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Iterator;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes2.dex */
public final class l extends g {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ IBinder f30784b;
    public final /* synthetic */ n c;

    public l(n nVar, IBinder iBinder) {
        this.c = nVar;
        this.f30784b = iBinder;
    }

    @Override // v9.g
    public final void a() {
        d bVar;
        n nVar = this.c;
        o oVar = nVar.f30786a;
        int i10 = c.f30778b;
        IBinder iBinder = this.f30784b;
        if (iBinder == null) {
            bVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
            if (queryLocalInterface instanceof d) {
                bVar = (d) queryLocalInterface;
            } else {
                bVar = new b(iBinder);
            }
        }
        oVar.f30799m = bVar;
        o oVar2 = nVar.f30786a;
        oVar2.f30789b.a("linkToDeath", new Object[0]);
        try {
            oVar2.f30799m.asBinder().linkToDeath(oVar2.f30796j, 0);
        } catch (RemoteException unused) {
            Object[] objArr = new Object[0];
            f fVar = oVar2.f30789b;
            fVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                f.b(fVar.f30779a, "linkToDeath failed", objArr);
            }
        }
        oVar2.f30793g = false;
        Iterator it = oVar2.f30790d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        oVar2.f30790d.clear();
    }
}
