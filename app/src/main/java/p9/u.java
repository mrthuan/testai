package p9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class u extends o {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ IBinder f23823b;
    public final /* synthetic */ w c;

    public u(w wVar, IBinder iBinder) {
        this.c = wVar;
        this.f23823b = iBinder;
    }

    @Override // p9.o
    public final void a() {
        h fVar;
        w wVar = this.c;
        x xVar = wVar.f23825a;
        int i10 = g.f23807b;
        IBinder iBinder = this.f23823b;
        if (iBinder == null) {
            fVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            if (queryLocalInterface instanceof h) {
                fVar = (h) queryLocalInterface;
            } else {
                fVar = new f(iBinder);
            }
        }
        xVar.f23838m = fVar;
        x xVar2 = wVar.f23825a;
        xVar2.f23828b.c("linkToDeath", new Object[0]);
        try {
            xVar2.f23838m.asBinder().linkToDeath(xVar2.f23835j, 0);
        } catch (RemoteException e10) {
            xVar2.f23828b.b(e10, "linkToDeath failed", new Object[0]);
        }
        xVar2.f23832g = false;
        Iterator it = xVar2.f23829d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        xVar2.f23829d.clear();
    }
}
