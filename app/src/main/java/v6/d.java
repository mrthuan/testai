package v6;

import com.google.firebase.encoders.proto.Protobuf;

/* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* loaded from: classes.dex */
public final class d implements wa.c<y6.c> {

    /* renamed from: a  reason: collision with root package name */
    public static final d f30689a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static final wa.b f30690b = new wa.b("logSource", androidx.appcompat.view.menu.d.f(android.support.v4.media.session.h.g(Protobuf.class, new com.google.firebase.encoders.proto.a(1, Protobuf.IntEncoding.DEFAULT))));
    public static final wa.b c = new wa.b("logEventDropped", androidx.appcompat.view.menu.d.f(android.support.v4.media.session.h.g(Protobuf.class, new com.google.firebase.encoders.proto.a(2, Protobuf.IntEncoding.DEFAULT))));

    @Override // wa.a
    public final void a(Object obj, wa.d dVar) {
        y6.c cVar = (y6.c) obj;
        wa.d dVar2 = dVar;
        dVar2.f(f30690b, cVar.f32084a);
        dVar2.f(c, cVar.f32085b);
    }
}
