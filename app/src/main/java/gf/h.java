package gf;

import android.util.Log;
import gf.c;
import java.nio.ByteBuffer;
import we.c;

/* compiled from: MethodChannel.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final gf.c f17797a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17798b;
    public final i c;

    /* compiled from: MethodChannel.java */
    /* loaded from: classes.dex */
    public final class a implements c.a {

        /* renamed from: a  reason: collision with root package name */
        public final b f17799a;

        public a(b bVar) {
            this.f17799a = bVar;
        }

        @Override // gf.c.a
        public final void a(ByteBuffer byteBuffer, c.e eVar) {
            h hVar = h.this;
            try {
                this.f17799a.a(hVar.c.e(byteBuffer), new g(this, eVar));
            } catch (RuntimeException e10) {
                eVar.a(hVar.c.h(e10.getMessage(), Log.getStackTraceString(e10)));
            }
        }
    }

    /* compiled from: MethodChannel.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(wk.g gVar, g gVar2);
    }

    /* compiled from: MethodChannel.java */
    /* loaded from: classes.dex */
    public interface c {
    }

    public h(gf.c cVar, String str, i iVar) {
        this.f17797a = cVar;
        this.f17798b = str;
        this.c = iVar;
    }

    public final void a(Object obj, String str) {
        ByteBuffer b10 = this.c.b(new wk.g(str, obj));
        this.f17797a.a(this.f17798b, b10, null);
    }

    public final void b(b bVar) {
        this.f17797a.f(this.f17798b, new a(bVar));
    }
}
