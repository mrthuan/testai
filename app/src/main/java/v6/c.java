package v6;

import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.firebase.encoders.proto.Protobuf;

/* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* loaded from: classes.dex */
public final class c implements wa.c<LogEventDropped> {

    /* renamed from: a  reason: collision with root package name */
    public static final c f30687a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final wa.b f30688b = new wa.b("eventsDroppedCount", androidx.appcompat.view.menu.d.f(android.support.v4.media.session.h.g(Protobuf.class, new com.google.firebase.encoders.proto.a(1, Protobuf.IntEncoding.DEFAULT))));
    public static final wa.b c = new wa.b("reason", androidx.appcompat.view.menu.d.f(android.support.v4.media.session.h.g(Protobuf.class, new com.google.firebase.encoders.proto.a(3, Protobuf.IntEncoding.DEFAULT))));

    @Override // wa.a
    public final void a(Object obj, wa.d dVar) {
        LogEventDropped logEventDropped = (LogEventDropped) obj;
        wa.d dVar2 = dVar;
        dVar2.b(f30688b, logEventDropped.f9920a);
        dVar2.f(c, logEventDropped.f9921b);
    }
}
