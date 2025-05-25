package v6;

import com.google.firebase.encoders.proto.Protobuf;

/* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* loaded from: classes.dex */
public final class g implements wa.c<y6.e> {

    /* renamed from: a  reason: collision with root package name */
    public static final g f30695a = new g();

    /* renamed from: b  reason: collision with root package name */
    public static final wa.b f30696b = new wa.b("startMs", androidx.appcompat.view.menu.d.f(android.support.v4.media.session.h.g(Protobuf.class, new com.google.firebase.encoders.proto.a(1, Protobuf.IntEncoding.DEFAULT))));
    public static final wa.b c = new wa.b("endMs", androidx.appcompat.view.menu.d.f(android.support.v4.media.session.h.g(Protobuf.class, new com.google.firebase.encoders.proto.a(2, Protobuf.IntEncoding.DEFAULT))));

    @Override // wa.a
    public final void a(Object obj, wa.d dVar) {
        y6.e eVar = (y6.e) obj;
        wa.d dVar2 = dVar;
        dVar2.b(f30696b, eVar.f32088a);
        dVar2.b(c, eVar.f32089b);
    }
}
