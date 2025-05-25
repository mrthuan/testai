package com.google.android.datatransport.cct.internal;

import u6.g;
import u6.h;
import u6.i;

/* compiled from: AutoBatchedLogRequestEncoder.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f9880a = new a();

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: com.google.android.datatransport.cct.internal.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0153a implements wa.c<u6.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0153a f9881a = new C0153a();

        /* renamed from: b  reason: collision with root package name */
        public static final wa.b f9882b = wa.b.a("sdkVersion");
        public static final wa.b c = wa.b.a("model");

        /* renamed from: d  reason: collision with root package name */
        public static final wa.b f9883d = wa.b.a("hardware");

        /* renamed from: e  reason: collision with root package name */
        public static final wa.b f9884e = wa.b.a("device");

        /* renamed from: f  reason: collision with root package name */
        public static final wa.b f9885f = wa.b.a("product");

        /* renamed from: g  reason: collision with root package name */
        public static final wa.b f9886g = wa.b.a("osBuild");

        /* renamed from: h  reason: collision with root package name */
        public static final wa.b f9887h = wa.b.a("manufacturer");

        /* renamed from: i  reason: collision with root package name */
        public static final wa.b f9888i = wa.b.a("fingerprint");

        /* renamed from: j  reason: collision with root package name */
        public static final wa.b f9889j = wa.b.a("locale");

        /* renamed from: k  reason: collision with root package name */
        public static final wa.b f9890k = wa.b.a("country");

        /* renamed from: l  reason: collision with root package name */
        public static final wa.b f9891l = wa.b.a("mccMnc");

        /* renamed from: m  reason: collision with root package name */
        public static final wa.b f9892m = wa.b.a("applicationBuild");

        @Override // wa.a
        public final void a(Object obj, wa.d dVar) {
            u6.a aVar = (u6.a) obj;
            wa.d dVar2 = dVar;
            dVar2.f(f9882b, aVar.l());
            dVar2.f(c, aVar.i());
            dVar2.f(f9883d, aVar.e());
            dVar2.f(f9884e, aVar.c());
            dVar2.f(f9885f, aVar.k());
            dVar2.f(f9886g, aVar.j());
            dVar2.f(f9887h, aVar.g());
            dVar2.f(f9888i, aVar.d());
            dVar2.f(f9889j, aVar.f());
            dVar2.f(f9890k, aVar.b());
            dVar2.f(f9891l, aVar.h());
            dVar2.f(f9892m, aVar.a());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: classes.dex */
    public static final class b implements wa.c<g> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f9893a = new b();

        /* renamed from: b  reason: collision with root package name */
        public static final wa.b f9894b = wa.b.a("logRequest");

        @Override // wa.a
        public final void a(Object obj, wa.d dVar) {
            dVar.f(f9894b, ((g) obj).a());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: classes.dex */
    public static final class c implements wa.c<ClientInfo> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f9895a = new c();

        /* renamed from: b  reason: collision with root package name */
        public static final wa.b f9896b = wa.b.a("clientType");
        public static final wa.b c = wa.b.a("androidClientInfo");

        @Override // wa.a
        public final void a(Object obj, wa.d dVar) {
            ClientInfo clientInfo = (ClientInfo) obj;
            wa.d dVar2 = dVar;
            dVar2.f(f9896b, clientInfo.b());
            dVar2.f(c, clientInfo.a());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: classes.dex */
    public static final class d implements wa.c<h> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f9897a = new d();

        /* renamed from: b  reason: collision with root package name */
        public static final wa.b f9898b = wa.b.a("eventTimeMs");
        public static final wa.b c = wa.b.a("eventCode");

        /* renamed from: d  reason: collision with root package name */
        public static final wa.b f9899d = wa.b.a("eventUptimeMs");

        /* renamed from: e  reason: collision with root package name */
        public static final wa.b f9900e = wa.b.a("sourceExtension");

        /* renamed from: f  reason: collision with root package name */
        public static final wa.b f9901f = wa.b.a("sourceExtensionJsonProto3");

        /* renamed from: g  reason: collision with root package name */
        public static final wa.b f9902g = wa.b.a("timezoneOffsetSeconds");

        /* renamed from: h  reason: collision with root package name */
        public static final wa.b f9903h = wa.b.a("networkConnectionInfo");

        @Override // wa.a
        public final void a(Object obj, wa.d dVar) {
            h hVar = (h) obj;
            wa.d dVar2 = dVar;
            dVar2.b(f9898b, hVar.b());
            dVar2.f(c, hVar.a());
            dVar2.b(f9899d, hVar.c());
            dVar2.f(f9900e, hVar.e());
            dVar2.f(f9901f, hVar.f());
            dVar2.b(f9902g, hVar.g());
            dVar2.f(f9903h, hVar.d());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: classes.dex */
    public static final class e implements wa.c<i> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f9904a = new e();

        /* renamed from: b  reason: collision with root package name */
        public static final wa.b f9905b = wa.b.a("requestTimeMs");
        public static final wa.b c = wa.b.a("requestUptimeMs");

        /* renamed from: d  reason: collision with root package name */
        public static final wa.b f9906d = wa.b.a("clientInfo");

        /* renamed from: e  reason: collision with root package name */
        public static final wa.b f9907e = wa.b.a("logSource");

        /* renamed from: f  reason: collision with root package name */
        public static final wa.b f9908f = wa.b.a("logSourceName");

        /* renamed from: g  reason: collision with root package name */
        public static final wa.b f9909g = wa.b.a("logEvent");

        /* renamed from: h  reason: collision with root package name */
        public static final wa.b f9910h = wa.b.a("qosTier");

        @Override // wa.a
        public final void a(Object obj, wa.d dVar) {
            i iVar = (i) obj;
            wa.d dVar2 = dVar;
            dVar2.b(f9905b, iVar.f());
            dVar2.b(c, iVar.g());
            dVar2.f(f9906d, iVar.a());
            dVar2.f(f9907e, iVar.c());
            dVar2.f(f9908f, iVar.d());
            dVar2.f(f9909g, iVar.b());
            dVar2.f(f9910h, iVar.e());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* loaded from: classes.dex */
    public static final class f implements wa.c<NetworkConnectionInfo> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f9911a = new f();

        /* renamed from: b  reason: collision with root package name */
        public static final wa.b f9912b = wa.b.a("networkType");
        public static final wa.b c = wa.b.a("mobileSubtype");

        @Override // wa.a
        public final void a(Object obj, wa.d dVar) {
            NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
            wa.d dVar2 = dVar;
            dVar2.f(f9912b, networkConnectionInfo.b());
            dVar2.f(c, networkConnectionInfo.a());
        }
    }

    public final void a(xa.a<?> aVar) {
        b bVar = b.f9893a;
        ya.e eVar = (ya.e) aVar;
        eVar.a(g.class, bVar);
        eVar.a(u6.c.class, bVar);
        e eVar2 = e.f9904a;
        eVar.a(i.class, eVar2);
        eVar.a(u6.e.class, eVar2);
        c cVar = c.f9895a;
        eVar.a(ClientInfo.class, cVar);
        eVar.a(com.google.android.datatransport.cct.internal.b.class, cVar);
        C0153a c0153a = C0153a.f9881a;
        eVar.a(u6.a.class, c0153a);
        eVar.a(u6.b.class, c0153a);
        d dVar = d.f9897a;
        eVar.a(h.class, dVar);
        eVar.a(u6.d.class, dVar);
        f fVar = f.f9911a;
        eVar.a(NetworkConnectionInfo.class, fVar);
        eVar.a(com.google.android.datatransport.cct.internal.c.class, fVar);
    }
}
