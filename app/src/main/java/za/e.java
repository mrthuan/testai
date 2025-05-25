package za;

import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ProtobufEncoder.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, wa.c<?>> f32326a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, wa.e<?>> f32327b;
    public final wa.c<Object> c;

    /* compiled from: ProtobufEncoder.java */
    /* loaded from: classes2.dex */
    public static final class a implements xa.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f32328a = new d();
    }

    public e(HashMap hashMap, HashMap hashMap2, d dVar) {
        this.f32326a = hashMap;
        this.f32327b = hashMap2;
        this.c = dVar;
    }

    public final void a(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        Map<Class<?>, wa.c<?>> map = this.f32326a;
        com.google.firebase.encoders.proto.b bVar = new com.google.firebase.encoders.proto.b(byteArrayOutputStream, map, this.f32327b, this.c);
        if (obj != null) {
            wa.c<?> cVar = map.get(obj.getClass());
            if (cVar != null) {
                cVar.a(obj, bVar);
                return;
            }
            throw new EncodingException("No encoder for " + obj.getClass());
        }
    }
}
