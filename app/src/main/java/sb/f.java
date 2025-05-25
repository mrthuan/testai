package sb;

import android.content.Context;
import cg.p;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.x;
import okhttp3.z;

/* compiled from: NetworkClient.kt */
/* loaded from: classes2.dex */
public final class f implements okhttp3.f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p<Boolean, String, tf.d> f29787a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f29788b;

    /* JADX WARN: Multi-variable type inference failed */
    public f(p<? super Boolean, ? super String, tf.d> pVar, Context context) {
        this.f29787a = pVar;
        this.f29788b = context;
    }

    @Override // okhttp3.f
    public final void a(okhttp3.internal.connection.e eVar, x xVar) {
        String str;
        boolean z10;
        String str2 = null;
        z zVar = xVar.f23447g;
        if (zVar != null) {
            str = zVar.h();
        } else {
            str = null;
        }
        AtomicReference<okhttp3.e> atomicReference = d.f29778a;
        int i10 = xVar.f23444d;
        if (200 <= i10 && i10 < 300) {
            z10 = true;
        } else {
            z10 = false;
        }
        p<Boolean, String, tf.d> pVar = this.f29787a;
        if (z10) {
            if (str != null) {
                str2 = b5.a.a(this.f29788b, str);
            }
            pVar.invoke(Boolean.FALSE, str2);
            return;
        }
        pVar.invoke(Boolean.FALSE, null);
    }

    @Override // okhttp3.f
    public final void b(okhttp3.internal.connection.e call, IOException iOException) {
        kotlin.jvm.internal.g.e(call, "call");
        iOException.printStackTrace();
        AtomicReference<okhttp3.e> atomicReference = d.f29778a;
        iOException.toString();
        this.f29787a.invoke(Boolean.valueOf(call.f23307p), null);
    }
}
