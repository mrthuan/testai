package sb;

import cg.q;
import java.io.IOException;
import okhttp3.x;
import okhttp3.z;

/* compiled from: NetworkClient.kt */
/* loaded from: classes2.dex */
public final class g implements okhttp3.f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q<Boolean, Boolean, String, tf.d> f29789a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ okhttp3.e f29790b;

    public g(q qVar, okhttp3.internal.connection.e eVar) {
        this.f29789a = qVar;
        this.f29790b = eVar;
    }

    @Override // okhttp3.f
    public final void a(okhttp3.internal.connection.e eVar, x xVar) {
        boolean z10;
        int i10 = xVar.f23444d;
        if (200 <= i10 && i10 < 300) {
            z10 = true;
        } else {
            z10 = false;
        }
        String str = null;
        q<Boolean, Boolean, String, tf.d> qVar = this.f29789a;
        z zVar = xVar.f23447g;
        if (z10) {
            Boolean bool = Boolean.TRUE;
            Boolean bool2 = Boolean.FALSE;
            if (zVar != null) {
                str = zVar.h();
            }
            qVar.invoke(bool, bool2, str);
            return;
        }
        Boolean bool3 = Boolean.FALSE;
        if (zVar != null) {
            str = zVar.h();
        }
        qVar.invoke(bool3, bool3, str);
    }

    @Override // okhttp3.f
    public final void b(okhttp3.internal.connection.e call, IOException iOException) {
        kotlin.jvm.internal.g.e(call, "call");
        this.f29789a.invoke(Boolean.FALSE, Boolean.valueOf(this.f29790b.b()), iOException.getMessage());
    }
}
