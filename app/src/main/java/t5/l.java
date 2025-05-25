package t5;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;

/* compiled from: ProgressNoopOutputStream.kt */
/* loaded from: classes.dex */
public final class l extends OutputStream implements m {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f29942a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f29943b = new HashMap();
    public com.facebook.e c;

    /* renamed from: d  reason: collision with root package name */
    public com.facebook.m f29944d;

    /* renamed from: e  reason: collision with root package name */
    public int f29945e;

    public l(Handler handler) {
        this.f29942a = handler;
    }

    @Override // t5.m
    public final void a(com.facebook.e eVar) {
        com.facebook.m mVar;
        this.c = eVar;
        if (eVar != null) {
            mVar = (com.facebook.m) this.f29943b.get(eVar);
        } else {
            mVar = null;
        }
        this.f29944d = mVar;
    }

    public final void b(long j10) {
        com.facebook.e eVar = this.c;
        if (eVar == null) {
            return;
        }
        if (this.f29944d == null) {
            com.facebook.m mVar = new com.facebook.m(this.f29942a, eVar);
            this.f29944d = mVar;
            this.f29943b.put(eVar, mVar);
        }
        com.facebook.m mVar2 = this.f29944d;
        if (mVar2 != null) {
            mVar2.f9846f += j10;
        }
        this.f29945e += (int) j10;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] buffer) {
        kotlin.jvm.internal.g.e(buffer, "buffer");
        b(buffer.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] buffer, int i10, int i11) {
        kotlin.jvm.internal.g.e(buffer, "buffer");
        b(i11);
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        b(1L);
    }
}
