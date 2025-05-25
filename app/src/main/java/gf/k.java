package gf;

import android.util.Log;
import gf.j;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: StandardMethodCodec.java */
/* loaded from: classes.dex */
public final class k implements i {

    /* renamed from: b  reason: collision with root package name */
    public static final k f17803b;

    static {
        j jVar = j.f17801a;
        f17803b = new k();
    }

    public k() {
        j jVar = j.f17801a;
    }

    @Override // gf.i
    public final ByteBuffer b(wk.g gVar) {
        j.a aVar = new j.a();
        j jVar = j.f17801a;
        j.j(aVar, (String) gVar.f31333a);
        j.j(aVar, gVar.f31334b);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // gf.i
    public final wk.g e(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        j jVar = j.f17801a;
        Serializable e10 = j.e(byteBuffer);
        Serializable e11 = j.e(byteBuffer);
        if ((e10 instanceof String) && !byteBuffer.hasRemaining()) {
            return new wk.g((String) e10, e11);
        }
        throw new IllegalArgumentException("Method call corrupted");
    }

    @Override // gf.i
    public final ByteBuffer g(Object obj) {
        j.a aVar = new j.a();
        aVar.write(0);
        j jVar = j.f17801a;
        j.j(aVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // gf.i
    public final ByteBuffer h(String str, String str2) {
        j.a aVar = new j.a();
        aVar.write(1);
        j jVar = j.f17801a;
        j.j(aVar, "error");
        j.j(aVar, str);
        j.j(aVar, null);
        j.j(aVar, str2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // gf.i
    public final ByteBuffer i(String str, String str2, Object obj) {
        j.a aVar = new j.a();
        aVar.write(1);
        j jVar = j.f17801a;
        j.j(aVar, str);
        j.j(aVar, str2);
        if (obj instanceof Throwable) {
            j.j(aVar, Log.getStackTraceString((Throwable) obj));
        } else {
            j.j(aVar, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }
}
