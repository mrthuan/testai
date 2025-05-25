package po;

import android.content.Context;
import kotlin.jvm.internal.g;

/* compiled from: DialogChainHandler.kt */
/* loaded from: classes3.dex */
public abstract class c extends a {
    @Override // po.a
    public final void a() {
        for (a aVar = this.f28986a; aVar != null; aVar = aVar.f28986a) {
            if (aVar.d()) {
                aVar.a();
                return;
            }
        }
    }

    @Override // po.a
    public final boolean c(Context context) {
        g.e(context, "context");
        return false;
    }

    @Override // po.a
    public final boolean d() {
        for (a aVar = this.f28986a; aVar != null; aVar = aVar.f28986a) {
            if (aVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final void e(a aVar) {
        a aVar2 = this.f28986a;
        if (aVar2 == null) {
            this.f28986a = aVar;
            return;
        }
        while (true) {
            a aVar3 = aVar2.f28986a;
            if (aVar3 == null) {
                aVar2.f28986a = aVar;
                return;
            }
            aVar2 = aVar3;
        }
    }

    public final void f(Context context) {
        g.e(context, "context");
        ea.a.p("C2lQbBZndGg7aW4=", "CFXPLix4");
        ea.a.p("VnguYwZ0ZQ==", "as97pBeL");
        if (d()) {
            return;
        }
        for (a aVar = this.f28986a; aVar != null && !aVar.c(context); aVar = aVar.f28986a) {
        }
    }

    public final void g(Context context, Class<? extends a> cls) {
        g.e(context, "context");
        ea.a.p("C2lQbBZndGg7aW4=", "Xbkg8ggG");
        if (d()) {
            return;
        }
        for (a aVar = this.f28986a; aVar != null; aVar = aVar.f28986a) {
            if (g.a(aVar.getClass(), cls)) {
                aVar.c(context);
                return;
            }
        }
    }
}
