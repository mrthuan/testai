package u2;

import android.content.Context;
import android.os.Build;
import androidx.work.NetworkType;
import x2.p;

/* compiled from: NetworkUnmeteredController.java */
/* loaded from: classes.dex */
public final class g extends c<t2.b> {
    public g(Context context, z2.a aVar) {
        super((v2.e) v2.g.b(context, aVar).c);
    }

    @Override // u2.c
    public final boolean b(p pVar) {
        NetworkType networkType = pVar.f31566j.f22669a;
        if (networkType != NetworkType.UNMETERED && (Build.VERSION.SDK_INT < 30 || networkType != NetworkType.TEMPORARILY_UNMETERED)) {
            return false;
        }
        return true;
    }

    @Override // u2.c
    public final boolean c(t2.b bVar) {
        t2.b bVar2 = bVar;
        if (bVar2.f29912a && !bVar2.c) {
            return false;
        }
        return true;
    }
}
