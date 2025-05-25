package jb;

import com.google.firebase.encoders.proto.Protobuf;
import com.google.firebase.messaging.reporting.MessagingClientEvent;

/* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* loaded from: classes2.dex */
public final class a implements wa.c<MessagingClientEvent> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f19078a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final wa.b f19079b = new wa.b("projectNumber", androidx.appcompat.view.menu.d.f(android.support.v4.media.session.h.g(Protobuf.class, new com.google.firebase.encoders.proto.a(1, Protobuf.IntEncoding.DEFAULT))));
    public static final wa.b c = new wa.b("messageId", androidx.appcompat.view.menu.d.f(android.support.v4.media.session.h.g(Protobuf.class, new com.google.firebase.encoders.proto.a(2, Protobuf.IntEncoding.DEFAULT))));

    /* renamed from: d  reason: collision with root package name */
    public static final wa.b f19080d = new wa.b("instanceId", androidx.appcompat.view.menu.d.f(android.support.v4.media.session.h.g(Protobuf.class, new com.google.firebase.encoders.proto.a(3, Protobuf.IntEncoding.DEFAULT))));

    /* renamed from: e  reason: collision with root package name */
    public static final wa.b f19081e = new wa.b("messageType", androidx.appcompat.view.menu.d.f(android.support.v4.media.session.h.g(Protobuf.class, new com.google.firebase.encoders.proto.a(4, Protobuf.IntEncoding.DEFAULT))));

    /* renamed from: f  reason: collision with root package name */
    public static final wa.b f19082f = new wa.b("sdkPlatform", androidx.appcompat.view.menu.d.f(android.support.v4.media.session.h.g(Protobuf.class, new com.google.firebase.encoders.proto.a(5, Protobuf.IntEncoding.DEFAULT))));

    /* renamed from: g  reason: collision with root package name */
    public static final wa.b f19083g = new wa.b("packageName", androidx.appcompat.view.menu.d.f(android.support.v4.media.session.h.g(Protobuf.class, new com.google.firebase.encoders.proto.a(6, Protobuf.IntEncoding.DEFAULT))));

    /* renamed from: h  reason: collision with root package name */
    public static final wa.b f19084h = new wa.b("collapseKey", androidx.appcompat.view.menu.d.f(android.support.v4.media.session.h.g(Protobuf.class, new com.google.firebase.encoders.proto.a(7, Protobuf.IntEncoding.DEFAULT))));

    /* renamed from: i  reason: collision with root package name */
    public static final wa.b f19085i = new wa.b("priority", androidx.appcompat.view.menu.d.f(android.support.v4.media.session.h.g(Protobuf.class, new com.google.firebase.encoders.proto.a(8, Protobuf.IntEncoding.DEFAULT))));

    /* renamed from: j  reason: collision with root package name */
    public static final wa.b f19086j = new wa.b("ttl", androidx.appcompat.view.menu.d.f(android.support.v4.media.session.h.g(Protobuf.class, new com.google.firebase.encoders.proto.a(9, Protobuf.IntEncoding.DEFAULT))));

    /* renamed from: k  reason: collision with root package name */
    public static final wa.b f19087k = new wa.b("topic", androidx.appcompat.view.menu.d.f(android.support.v4.media.session.h.g(Protobuf.class, new com.google.firebase.encoders.proto.a(10, Protobuf.IntEncoding.DEFAULT))));

    /* renamed from: l  reason: collision with root package name */
    public static final wa.b f19088l = new wa.b("bulkId", androidx.appcompat.view.menu.d.f(android.support.v4.media.session.h.g(Protobuf.class, new com.google.firebase.encoders.proto.a(11, Protobuf.IntEncoding.DEFAULT))));

    /* renamed from: m  reason: collision with root package name */
    public static final wa.b f19089m = new wa.b("event", androidx.appcompat.view.menu.d.f(android.support.v4.media.session.h.g(Protobuf.class, new com.google.firebase.encoders.proto.a(12, Protobuf.IntEncoding.DEFAULT))));

    /* renamed from: n  reason: collision with root package name */
    public static final wa.b f19090n = new wa.b("analyticsLabel", androidx.appcompat.view.menu.d.f(android.support.v4.media.session.h.g(Protobuf.class, new com.google.firebase.encoders.proto.a(13, Protobuf.IntEncoding.DEFAULT))));

    /* renamed from: o  reason: collision with root package name */
    public static final wa.b f19091o = new wa.b("campaignId", androidx.appcompat.view.menu.d.f(android.support.v4.media.session.h.g(Protobuf.class, new com.google.firebase.encoders.proto.a(14, Protobuf.IntEncoding.DEFAULT))));

    /* renamed from: p  reason: collision with root package name */
    public static final wa.b f19092p = new wa.b("composerLabel", androidx.appcompat.view.menu.d.f(android.support.v4.media.session.h.g(Protobuf.class, new com.google.firebase.encoders.proto.a(15, Protobuf.IntEncoding.DEFAULT))));

    @Override // wa.a
    public final void a(Object obj, wa.d dVar) {
        MessagingClientEvent messagingClientEvent = (MessagingClientEvent) obj;
        wa.d dVar2 = dVar;
        dVar2.b(f19079b, messagingClientEvent.f13673a);
        dVar2.f(c, messagingClientEvent.f13674b);
        dVar2.f(f19080d, messagingClientEvent.c);
        dVar2.f(f19081e, messagingClientEvent.f13675d);
        dVar2.f(f19082f, messagingClientEvent.f13676e);
        dVar2.f(f19083g, messagingClientEvent.f13677f);
        dVar2.f(f19084h, messagingClientEvent.f13678g);
        dVar2.c(f19085i, messagingClientEvent.f13679h);
        dVar2.c(f19086j, messagingClientEvent.f13680i);
        dVar2.f(f19087k, messagingClientEvent.f13681j);
        dVar2.b(f19088l, messagingClientEvent.f13682k);
        dVar2.f(f19089m, messagingClientEvent.f13683l);
        dVar2.f(f19090n, messagingClientEvent.f13684m);
        dVar2.b(f19091o, messagingClientEvent.f13685n);
        dVar2.f(f19092p, messagingClientEvent.f13686o);
    }
}
