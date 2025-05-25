package u2;

import android.content.Context;
import android.os.Build;
import androidx.work.NetworkType;
import x2.p;

/* compiled from: NetworkConnectedController.java */
/* loaded from: classes.dex */
public final class d extends c<t2.b> {
    public d(Context context, z2.a aVar) {
        super((v2.e) v2.g.b(context, aVar).c);
    }

    @Override // u2.c
    public final boolean b(p pVar) {
        if (pVar.f31566j.f22669a == NetworkType.CONNECTED) {
            return true;
        }
        return false;
    }

    @Override // u2.c
    public final boolean c(t2.b bVar) {
        t2.b bVar2 = bVar;
        if (Build.VERSION.SDK_INT >= 26) {
            if (!bVar2.f29912a || !bVar2.f29913b) {
                return true;
            }
            return false;
        }
        return true ^ bVar2.f29912a;
    }
}
