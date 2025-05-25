package v6;

import com.google.firebase.encoders.proto.Protobuf;

/* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* loaded from: classes.dex */
public final class f implements wa.c<y6.d> {

    /* renamed from: a  reason: collision with root package name */
    public static final f f30693a = new f();

    /* renamed from: b  reason: collision with root package name */
    public static final wa.b f30694b = new wa.b("currentCacheSizeBytes", androidx.appcompat.view.menu.d.f(android.support.v4.media.session.h.g(Protobuf.class, new com.google.firebase.encoders.proto.a(1, Protobuf.IntEncoding.DEFAULT))));
    public static final wa.b c = new wa.b("maxCacheSizeBytes", androidx.appcompat.view.menu.d.f(android.support.v4.media.session.h.g(Protobuf.class, new com.google.firebase.encoders.proto.a(2, Protobuf.IntEncoding.DEFAULT))));

    @Override // wa.a
    public final void a(Object obj, wa.d dVar) {
        y6.d dVar2 = (y6.d) obj;
        wa.d dVar3 = dVar;
        dVar3.b(f30694b, dVar2.f32086a);
        dVar3.b(c, dVar2.f32087b);
    }
}
