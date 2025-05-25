package androidx.work;

import android.content.Context;
import androidx.work.a;
import java.util.Collections;
import java.util.List;
import o2.h;
import o2.l;
import p2.j;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements c2.b<l> {
    static {
        h.e("WrkMgrInitializer");
    }

    @Override // c2.b
    public final List<Class<? extends c2.b<?>>> a() {
        return Collections.emptyList();
    }

    @Override // c2.b
    public final l create(Context context) {
        h.c().a(new Throwable[0]);
        j.f(context, new a(new a.C0026a()));
        return j.e(context);
    }
}
