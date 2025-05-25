package u2;

import android.content.Context;
import android.os.Build;
import androidx.work.NetworkType;
import x2.p;

/* compiled from: NetworkMeteredController.java */
/* loaded from: classes.dex */
public final class e extends c<t2.b> {
    static {
        o2.h.e("NetworkMeteredCtrlr");
    }

    public e(Context context, z2.a aVar) {
        super((v2.e) v2.g.b(context, aVar).c);
    }

    @Override // u2.c
    public final boolean b(p pVar) {
        if (pVar.f31566j.f22669a == NetworkType.METERED) {
            return true;
        }
        return false;
    }

    @Override // u2.c
    public final boolean c(t2.b bVar) {
        t2.b bVar2 = bVar;
        boolean z10 = true;
        if (Build.VERSION.SDK_INT < 26) {
            o2.h.c().a(new Throwable[0]);
            return !bVar2.f29912a;
        }
        if (bVar2.f29912a && bVar2.c) {
            z10 = false;
        }
        return z10;
    }
}
