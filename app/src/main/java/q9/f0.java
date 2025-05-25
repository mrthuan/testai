package q9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class f0 extends z {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ IBinder f29108b;
    public final /* synthetic */ h0 c;

    public f0(h0 h0Var, IBinder iBinder) {
        this.f29108b = iBinder;
        this.c = h0Var;
    }

    @Override // q9.z
    public final void a() {
        r pVar;
        h0 h0Var = this.c;
        i0 i0Var = h0Var.f29111a;
        int i10 = q.f29131a;
        IBinder iBinder = this.f29108b;
        if (iBinder == null) {
            pVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
            if (queryLocalInterface instanceof r) {
                pVar = (r) queryLocalInterface;
            } else {
                pVar = new p(iBinder);
            }
        }
        i0Var.f29126m = pVar;
        i0 i0Var2 = h0Var.f29111a;
        i0Var2.f29116b.d("linkToDeath", new Object[0]);
        try {
            i0Var2.f29126m.asBinder().linkToDeath(i0Var2.f29123j, 0);
        } catch (RemoteException e10) {
            i0Var2.f29116b.c(e10, "linkToDeath failed", new Object[0]);
        }
        i0Var2.f29120g = false;
        Iterator it = i0Var2.f29117d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        i0Var2.f29117d.clear();
    }
}
