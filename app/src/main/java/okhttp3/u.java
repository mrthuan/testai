package okhttp3;

import java.io.File;
import java.io.FileInputStream;
import java.util.logging.Logger;

/* compiled from: RequestBody.kt */
/* loaded from: classes3.dex */
public final class u extends w {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f23437a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ File f23438b;

    public u(File file, r rVar) {
        this.f23437a = rVar;
        this.f23438b = file;
    }

    @Override // okhttp3.w
    public final long a() {
        return this.f23438b.length();
    }

    @Override // okhttp3.w
    public final r b() {
        return this.f23437a;
    }

    @Override // okhttp3.w
    public final void c(kk.g gVar) {
        Logger logger = kk.o.f19839a;
        File file = this.f23438b;
        kotlin.jvm.internal.g.e(file, "<this>");
        kk.n nVar = new kk.n(new FileInputStream(file), kk.z.f19858d);
        try {
            gVar.M(nVar);
            o9.d.l(nVar, null);
        } finally {
        }
    }
}
