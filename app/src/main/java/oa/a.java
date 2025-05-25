package oa;

import com.tom_roush.fontbox.ttf.NamingTable;
import oa.b0;

/* compiled from: AutoCrashlyticsReportEncoder.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f22785a = new a();

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: oa.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0305a implements wa.c<b0.a.AbstractC0306a> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0305a f22786a = new C0305a();

        /* renamed from: b  reason: collision with root package name */
        public static final wa.b f22787b = wa.b.a("arch");
        public static final wa.b c = wa.b.a("libraryName");

        /* renamed from: d  reason: collision with root package name */
        public static final wa.b f22788d = wa.b.a("buildId");

        @Override // wa.a
        public final void a(Object obj, wa.d dVar) {
            b0.a.AbstractC0306a abstractC0306a = (b0.a.AbstractC0306a) obj;
            wa.d dVar2 = dVar;
            dVar2.f(f22787b, abstractC0306a.a());
            dVar2.f(c, abstractC0306a.c());
            dVar2.f(f22788d, abstractC0306a.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes2.dex */
    public static final class b implements wa.c<b0.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f22789a = new b();

        /* renamed from: b  reason: collision with root package name */
        public static final wa.b f22790b = wa.b.a("pid");
        public static final wa.b c = wa.b.a("processName");

        /* renamed from: d  reason: collision with root package name */
        public static final wa.b f22791d = wa.b.a("reasonCode");

        /* renamed from: e  reason: collision with root package name */
        public static final wa.b f22792e = wa.b.a("importance");

        /* renamed from: f  reason: collision with root package name */
        public static final wa.b f22793f = wa.b.a("pss");

        /* renamed from: g  reason: collision with root package name */
        public static final wa.b f22794g = wa.b.a("rss");

        /* renamed from: h  reason: collision with root package name */
        public static final wa.b f22795h = wa.b.a("timestamp");

        /* renamed from: i  reason: collision with root package name */
        public static final wa.b f22796i = wa.b.a("traceFile");

        /* renamed from: j  reason: collision with root package name */
        public static final wa.b f22797j = wa.b.a("buildIdMappingForArch");

        @Override // wa.a
        public final void a(Object obj, wa.d dVar) {
            b0.a aVar = (b0.a) obj;
            wa.d dVar2 = dVar;
            dVar2.c(f22790b, aVar.c());
            dVar2.f(c, aVar.d());
            dVar2.c(f22791d, aVar.f());
            dVar2.c(f22792e, aVar.b());
            dVar2.b(f22793f, aVar.e());
            dVar2.b(f22794g, aVar.g());
            dVar2.b(f22795h, aVar.h());
            dVar2.f(f22796i, aVar.i());
            dVar2.f(f22797j, aVar.a());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes2.dex */
    public static final class c implements wa.c<b0.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f22798a = new c();

        /* renamed from: b  reason: collision with root package name */
        public static final wa.b f22799b = wa.b.a("key");
        public static final wa.b c = wa.b.a("value");

        @Override // wa.a
        public final void a(Object obj, wa.d dVar) {
            b0.c cVar = (b0.c) obj;
            wa.d dVar2 = dVar;
            dVar2.f(f22799b, cVar.a());
            dVar2.f(c, cVar.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes2.dex */
    public static final class d implements wa.c<b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f22800a = new d();

        /* renamed from: b  reason: collision with root package name */
        public static final wa.b f22801b = wa.b.a("sdkVersion");
        public static final wa.b c = wa.b.a("gmpAppId");

        /* renamed from: d  reason: collision with root package name */
        public static final wa.b f22802d = wa.b.a("platform");

        /* renamed from: e  reason: collision with root package name */
        public static final wa.b f22803e = wa.b.a("installationUuid");

        /* renamed from: f  reason: collision with root package name */
        public static final wa.b f22804f = wa.b.a("buildVersion");

        /* renamed from: g  reason: collision with root package name */
        public static final wa.b f22805g = wa.b.a("displayVersion");

        /* renamed from: h  reason: collision with root package name */
        public static final wa.b f22806h = wa.b.a("session");

        /* renamed from: i  reason: collision with root package name */
        public static final wa.b f22807i = wa.b.a("ndkPayload");

        /* renamed from: j  reason: collision with root package name */
        public static final wa.b f22808j = wa.b.a("appExitInfo");

        @Override // wa.a
        public final void a(Object obj, wa.d dVar) {
            b0 b0Var = (b0) obj;
            wa.d dVar2 = dVar;
            dVar2.f(f22801b, b0Var.h());
            dVar2.f(c, b0Var.d());
            dVar2.c(f22802d, b0Var.g());
            dVar2.f(f22803e, b0Var.e());
            dVar2.f(f22804f, b0Var.b());
            dVar2.f(f22805g, b0Var.c());
            dVar2.f(f22806h, b0Var.i());
            dVar2.f(f22807i, b0Var.f());
            dVar2.f(f22808j, b0Var.a());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes2.dex */
    public static final class e implements wa.c<b0.d> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f22809a = new e();

        /* renamed from: b  reason: collision with root package name */
        public static final wa.b f22810b = wa.b.a("files");
        public static final wa.b c = wa.b.a("orgId");

        @Override // wa.a
        public final void a(Object obj, wa.d dVar) {
            b0.d dVar2 = (b0.d) obj;
            wa.d dVar3 = dVar;
            dVar3.f(f22810b, dVar2.a());
            dVar3.f(c, dVar2.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes2.dex */
    public static final class f implements wa.c<b0.d.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f22811a = new f();

        /* renamed from: b  reason: collision with root package name */
        public static final wa.b f22812b = wa.b.a("filename");
        public static final wa.b c = wa.b.a("contents");

        @Override // wa.a
        public final void a(Object obj, wa.d dVar) {
            b0.d.a aVar = (b0.d.a) obj;
            wa.d dVar2 = dVar;
            dVar2.f(f22812b, aVar.b());
            dVar2.f(c, aVar.a());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes2.dex */
    public static final class g implements wa.c<b0.e.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f22813a = new g();

        /* renamed from: b  reason: collision with root package name */
        public static final wa.b f22814b = wa.b.a("identifier");
        public static final wa.b c = wa.b.a("version");

        /* renamed from: d  reason: collision with root package name */
        public static final wa.b f22815d = wa.b.a("displayVersion");

        /* renamed from: e  reason: collision with root package name */
        public static final wa.b f22816e = wa.b.a("organization");

        /* renamed from: f  reason: collision with root package name */
        public static final wa.b f22817f = wa.b.a("installationUuid");

        /* renamed from: g  reason: collision with root package name */
        public static final wa.b f22818g = wa.b.a("developmentPlatform");

        /* renamed from: h  reason: collision with root package name */
        public static final wa.b f22819h = wa.b.a("developmentPlatformVersion");

        @Override // wa.a
        public final void a(Object obj, wa.d dVar) {
            b0.e.a aVar = (b0.e.a) obj;
            wa.d dVar2 = dVar;
            dVar2.f(f22814b, aVar.d());
            dVar2.f(c, aVar.g());
            dVar2.f(f22815d, aVar.c());
            dVar2.f(f22816e, aVar.f());
            dVar2.f(f22817f, aVar.e());
            dVar2.f(f22818g, aVar.a());
            dVar2.f(f22819h, aVar.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes2.dex */
    public static final class h implements wa.c<b0.e.a.AbstractC0307a> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f22820a = new h();

        /* renamed from: b  reason: collision with root package name */
        public static final wa.b f22821b = wa.b.a("clsId");

        @Override // wa.a
        public final void a(Object obj, wa.d dVar) {
            ((b0.e.a.AbstractC0307a) obj).a();
            dVar.f(f22821b, null);
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes2.dex */
    public static final class i implements wa.c<b0.e.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f22822a = new i();

        /* renamed from: b  reason: collision with root package name */
        public static final wa.b f22823b = wa.b.a("arch");
        public static final wa.b c = wa.b.a("model");

        /* renamed from: d  reason: collision with root package name */
        public static final wa.b f22824d = wa.b.a("cores");

        /* renamed from: e  reason: collision with root package name */
        public static final wa.b f22825e = wa.b.a("ram");

        /* renamed from: f  reason: collision with root package name */
        public static final wa.b f22826f = wa.b.a("diskSpace");

        /* renamed from: g  reason: collision with root package name */
        public static final wa.b f22827g = wa.b.a("simulator");

        /* renamed from: h  reason: collision with root package name */
        public static final wa.b f22828h = wa.b.a("state");

        /* renamed from: i  reason: collision with root package name */
        public static final wa.b f22829i = wa.b.a("manufacturer");

        /* renamed from: j  reason: collision with root package name */
        public static final wa.b f22830j = wa.b.a("modelClass");

        @Override // wa.a
        public final void a(Object obj, wa.d dVar) {
            b0.e.c cVar = (b0.e.c) obj;
            wa.d dVar2 = dVar;
            dVar2.c(f22823b, cVar.a());
            dVar2.f(c, cVar.e());
            dVar2.c(f22824d, cVar.b());
            dVar2.b(f22825e, cVar.g());
            dVar2.b(f22826f, cVar.c());
            dVar2.a(f22827g, cVar.i());
            dVar2.c(f22828h, cVar.h());
            dVar2.f(f22829i, cVar.d());
            dVar2.f(f22830j, cVar.f());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes2.dex */
    public static final class j implements wa.c<b0.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f22831a = new j();

        /* renamed from: b  reason: collision with root package name */
        public static final wa.b f22832b = wa.b.a("generator");
        public static final wa.b c = wa.b.a("identifier");

        /* renamed from: d  reason: collision with root package name */
        public static final wa.b f22833d = wa.b.a("startedAt");

        /* renamed from: e  reason: collision with root package name */
        public static final wa.b f22834e = wa.b.a("endedAt");

        /* renamed from: f  reason: collision with root package name */
        public static final wa.b f22835f = wa.b.a("crashed");

        /* renamed from: g  reason: collision with root package name */
        public static final wa.b f22836g = wa.b.a("app");

        /* renamed from: h  reason: collision with root package name */
        public static final wa.b f22837h = wa.b.a("user");

        /* renamed from: i  reason: collision with root package name */
        public static final wa.b f22838i = wa.b.a("os");

        /* renamed from: j  reason: collision with root package name */
        public static final wa.b f22839j = wa.b.a("device");

        /* renamed from: k  reason: collision with root package name */
        public static final wa.b f22840k = wa.b.a("events");

        /* renamed from: l  reason: collision with root package name */
        public static final wa.b f22841l = wa.b.a("generatorType");

        @Override // wa.a
        public final void a(Object obj, wa.d dVar) {
            b0.e eVar = (b0.e) obj;
            wa.d dVar2 = dVar;
            dVar2.f(f22832b, eVar.e());
            dVar2.f(c, eVar.g().getBytes(b0.f22909a));
            dVar2.b(f22833d, eVar.i());
            dVar2.f(f22834e, eVar.c());
            dVar2.a(f22835f, eVar.k());
            dVar2.f(f22836g, eVar.a());
            dVar2.f(f22837h, eVar.j());
            dVar2.f(f22838i, eVar.h());
            dVar2.f(f22839j, eVar.b());
            dVar2.f(f22840k, eVar.d());
            dVar2.c(f22841l, eVar.f());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes2.dex */
    public static final class k implements wa.c<b0.e.d.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f22842a = new k();

        /* renamed from: b  reason: collision with root package name */
        public static final wa.b f22843b = wa.b.a("execution");
        public static final wa.b c = wa.b.a("customAttributes");

        /* renamed from: d  reason: collision with root package name */
        public static final wa.b f22844d = wa.b.a("internalKeys");

        /* renamed from: e  reason: collision with root package name */
        public static final wa.b f22845e = wa.b.a("background");

        /* renamed from: f  reason: collision with root package name */
        public static final wa.b f22846f = wa.b.a("uiOrientation");

        @Override // wa.a
        public final void a(Object obj, wa.d dVar) {
            b0.e.d.a aVar = (b0.e.d.a) obj;
            wa.d dVar2 = dVar;
            dVar2.f(f22843b, aVar.c());
            dVar2.f(c, aVar.b());
            dVar2.f(f22844d, aVar.d());
            dVar2.f(f22845e, aVar.a());
            dVar2.c(f22846f, aVar.e());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes2.dex */
    public static final class l implements wa.c<b0.e.d.a.b.AbstractC0309a> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f22847a = new l();

        /* renamed from: b  reason: collision with root package name */
        public static final wa.b f22848b = wa.b.a("baseAddress");
        public static final wa.b c = wa.b.a("size");

        /* renamed from: d  reason: collision with root package name */
        public static final wa.b f22849d = wa.b.a(NamingTable.TAG);

        /* renamed from: e  reason: collision with root package name */
        public static final wa.b f22850e = wa.b.a("uuid");

        @Override // wa.a
        public final void a(Object obj, wa.d dVar) {
            byte[] bArr;
            b0.e.d.a.b.AbstractC0309a abstractC0309a = (b0.e.d.a.b.AbstractC0309a) obj;
            wa.d dVar2 = dVar;
            dVar2.b(f22848b, abstractC0309a.a());
            dVar2.b(c, abstractC0309a.c());
            dVar2.f(f22849d, abstractC0309a.b());
            String d10 = abstractC0309a.d();
            if (d10 != null) {
                bArr = d10.getBytes(b0.f22909a);
            } else {
                bArr = null;
            }
            dVar2.f(f22850e, bArr);
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes2.dex */
    public static final class m implements wa.c<b0.e.d.a.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f22851a = new m();

        /* renamed from: b  reason: collision with root package name */
        public static final wa.b f22852b = wa.b.a("threads");
        public static final wa.b c = wa.b.a("exception");

        /* renamed from: d  reason: collision with root package name */
        public static final wa.b f22853d = wa.b.a("appExitInfo");

        /* renamed from: e  reason: collision with root package name */
        public static final wa.b f22854e = wa.b.a("signal");

        /* renamed from: f  reason: collision with root package name */
        public static final wa.b f22855f = wa.b.a("binaries");

        @Override // wa.a
        public final void a(Object obj, wa.d dVar) {
            b0.e.d.a.b bVar = (b0.e.d.a.b) obj;
            wa.d dVar2 = dVar;
            dVar2.f(f22852b, bVar.e());
            dVar2.f(c, bVar.c());
            dVar2.f(f22853d, bVar.a());
            dVar2.f(f22854e, bVar.d());
            dVar2.f(f22855f, bVar.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes2.dex */
    public static final class n implements wa.c<b0.e.d.a.b.AbstractC0311b> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f22856a = new n();

        /* renamed from: b  reason: collision with root package name */
        public static final wa.b f22857b = wa.b.a("type");
        public static final wa.b c = wa.b.a("reason");

        /* renamed from: d  reason: collision with root package name */
        public static final wa.b f22858d = wa.b.a("frames");

        /* renamed from: e  reason: collision with root package name */
        public static final wa.b f22859e = wa.b.a("causedBy");

        /* renamed from: f  reason: collision with root package name */
        public static final wa.b f22860f = wa.b.a("overflowCount");

        @Override // wa.a
        public final void a(Object obj, wa.d dVar) {
            b0.e.d.a.b.AbstractC0311b abstractC0311b = (b0.e.d.a.b.AbstractC0311b) obj;
            wa.d dVar2 = dVar;
            dVar2.f(f22857b, abstractC0311b.e());
            dVar2.f(c, abstractC0311b.d());
            dVar2.f(f22858d, abstractC0311b.b());
            dVar2.f(f22859e, abstractC0311b.a());
            dVar2.c(f22860f, abstractC0311b.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes2.dex */
    public static final class o implements wa.c<b0.e.d.a.b.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f22861a = new o();

        /* renamed from: b  reason: collision with root package name */
        public static final wa.b f22862b = wa.b.a(NamingTable.TAG);
        public static final wa.b c = wa.b.a("code");

        /* renamed from: d  reason: collision with root package name */
        public static final wa.b f22863d = wa.b.a("address");

        @Override // wa.a
        public final void a(Object obj, wa.d dVar) {
            b0.e.d.a.b.c cVar = (b0.e.d.a.b.c) obj;
            wa.d dVar2 = dVar;
            dVar2.f(f22862b, cVar.c());
            dVar2.f(c, cVar.b());
            dVar2.b(f22863d, cVar.a());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes2.dex */
    public static final class p implements wa.c<b0.e.d.a.b.AbstractC0312d> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f22864a = new p();

        /* renamed from: b  reason: collision with root package name */
        public static final wa.b f22865b = wa.b.a(NamingTable.TAG);
        public static final wa.b c = wa.b.a("importance");

        /* renamed from: d  reason: collision with root package name */
        public static final wa.b f22866d = wa.b.a("frames");

        @Override // wa.a
        public final void a(Object obj, wa.d dVar) {
            b0.e.d.a.b.AbstractC0312d abstractC0312d = (b0.e.d.a.b.AbstractC0312d) obj;
            wa.d dVar2 = dVar;
            dVar2.f(f22865b, abstractC0312d.c());
            dVar2.c(c, abstractC0312d.b());
            dVar2.f(f22866d, abstractC0312d.a());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes2.dex */
    public static final class q implements wa.c<b0.e.d.a.b.AbstractC0312d.AbstractC0313a> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f22867a = new q();

        /* renamed from: b  reason: collision with root package name */
        public static final wa.b f22868b = wa.b.a("pc");
        public static final wa.b c = wa.b.a("symbol");

        /* renamed from: d  reason: collision with root package name */
        public static final wa.b f22869d = wa.b.a("file");

        /* renamed from: e  reason: collision with root package name */
        public static final wa.b f22870e = wa.b.a("offset");

        /* renamed from: f  reason: collision with root package name */
        public static final wa.b f22871f = wa.b.a("importance");

        @Override // wa.a
        public final void a(Object obj, wa.d dVar) {
            b0.e.d.a.b.AbstractC0312d.AbstractC0313a abstractC0313a = (b0.e.d.a.b.AbstractC0312d.AbstractC0313a) obj;
            wa.d dVar2 = dVar;
            dVar2.b(f22868b, abstractC0313a.d());
            dVar2.f(c, abstractC0313a.e());
            dVar2.f(f22869d, abstractC0313a.a());
            dVar2.b(f22870e, abstractC0313a.c());
            dVar2.c(f22871f, abstractC0313a.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes2.dex */
    public static final class r implements wa.c<b0.e.d.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final r f22872a = new r();

        /* renamed from: b  reason: collision with root package name */
        public static final wa.b f22873b = wa.b.a("batteryLevel");
        public static final wa.b c = wa.b.a("batteryVelocity");

        /* renamed from: d  reason: collision with root package name */
        public static final wa.b f22874d = wa.b.a("proximityOn");

        /* renamed from: e  reason: collision with root package name */
        public static final wa.b f22875e = wa.b.a("orientation");

        /* renamed from: f  reason: collision with root package name */
        public static final wa.b f22876f = wa.b.a("ramUsed");

        /* renamed from: g  reason: collision with root package name */
        public static final wa.b f22877g = wa.b.a("diskUsed");

        @Override // wa.a
        public final void a(Object obj, wa.d dVar) {
            b0.e.d.c cVar = (b0.e.d.c) obj;
            wa.d dVar2 = dVar;
            dVar2.f(f22873b, cVar.a());
            dVar2.c(c, cVar.b());
            dVar2.a(f22874d, cVar.f());
            dVar2.c(f22875e, cVar.d());
            dVar2.b(f22876f, cVar.e());
            dVar2.b(f22877g, cVar.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes2.dex */
    public static final class s implements wa.c<b0.e.d> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f22878a = new s();

        /* renamed from: b  reason: collision with root package name */
        public static final wa.b f22879b = wa.b.a("timestamp");
        public static final wa.b c = wa.b.a("type");

        /* renamed from: d  reason: collision with root package name */
        public static final wa.b f22880d = wa.b.a("app");

        /* renamed from: e  reason: collision with root package name */
        public static final wa.b f22881e = wa.b.a("device");

        /* renamed from: f  reason: collision with root package name */
        public static final wa.b f22882f = wa.b.a("log");

        @Override // wa.a
        public final void a(Object obj, wa.d dVar) {
            b0.e.d dVar2 = (b0.e.d) obj;
            wa.d dVar3 = dVar;
            dVar3.b(f22879b, dVar2.d());
            dVar3.f(c, dVar2.e());
            dVar3.f(f22880d, dVar2.a());
            dVar3.f(f22881e, dVar2.b());
            dVar3.f(f22882f, dVar2.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes2.dex */
    public static final class t implements wa.c<b0.e.d.AbstractC0315d> {

        /* renamed from: a  reason: collision with root package name */
        public static final t f22883a = new t();

        /* renamed from: b  reason: collision with root package name */
        public static final wa.b f22884b = wa.b.a("content");

        @Override // wa.a
        public final void a(Object obj, wa.d dVar) {
            dVar.f(f22884b, ((b0.e.d.AbstractC0315d) obj).a());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes2.dex */
    public static final class u implements wa.c<b0.e.AbstractC0316e> {

        /* renamed from: a  reason: collision with root package name */
        public static final u f22885a = new u();

        /* renamed from: b  reason: collision with root package name */
        public static final wa.b f22886b = wa.b.a("platform");
        public static final wa.b c = wa.b.a("version");

        /* renamed from: d  reason: collision with root package name */
        public static final wa.b f22887d = wa.b.a("buildVersion");

        /* renamed from: e  reason: collision with root package name */
        public static final wa.b f22888e = wa.b.a("jailbroken");

        @Override // wa.a
        public final void a(Object obj, wa.d dVar) {
            b0.e.AbstractC0316e abstractC0316e = (b0.e.AbstractC0316e) obj;
            wa.d dVar2 = dVar;
            dVar2.c(f22886b, abstractC0316e.b());
            dVar2.f(c, abstractC0316e.c());
            dVar2.f(f22887d, abstractC0316e.a());
            dVar2.a(f22888e, abstractC0316e.d());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* loaded from: classes2.dex */
    public static final class v implements wa.c<b0.e.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final v f22889a = new v();

        /* renamed from: b  reason: collision with root package name */
        public static final wa.b f22890b = wa.b.a("identifier");

        @Override // wa.a
        public final void a(Object obj, wa.d dVar) {
            dVar.f(f22890b, ((b0.e.f) obj).a());
        }
    }

    public final void a(xa.a<?> aVar) {
        d dVar = d.f22800a;
        ya.e eVar = (ya.e) aVar;
        eVar.a(b0.class, dVar);
        eVar.a(oa.b.class, dVar);
        j jVar = j.f22831a;
        eVar.a(b0.e.class, jVar);
        eVar.a(oa.h.class, jVar);
        g gVar = g.f22813a;
        eVar.a(b0.e.a.class, gVar);
        eVar.a(oa.i.class, gVar);
        h hVar = h.f22820a;
        eVar.a(b0.e.a.AbstractC0307a.class, hVar);
        eVar.a(oa.j.class, hVar);
        v vVar = v.f22889a;
        eVar.a(b0.e.f.class, vVar);
        eVar.a(w.class, vVar);
        u uVar = u.f22885a;
        eVar.a(b0.e.AbstractC0316e.class, uVar);
        eVar.a(oa.v.class, uVar);
        i iVar = i.f22822a;
        eVar.a(b0.e.c.class, iVar);
        eVar.a(oa.k.class, iVar);
        s sVar = s.f22878a;
        eVar.a(b0.e.d.class, sVar);
        eVar.a(oa.l.class, sVar);
        k kVar = k.f22842a;
        eVar.a(b0.e.d.a.class, kVar);
        eVar.a(oa.m.class, kVar);
        m mVar = m.f22851a;
        eVar.a(b0.e.d.a.b.class, mVar);
        eVar.a(oa.n.class, mVar);
        p pVar = p.f22864a;
        eVar.a(b0.e.d.a.b.AbstractC0312d.class, pVar);
        eVar.a(oa.r.class, pVar);
        q qVar = q.f22867a;
        eVar.a(b0.e.d.a.b.AbstractC0312d.AbstractC0313a.class, qVar);
        eVar.a(oa.s.class, qVar);
        n nVar = n.f22856a;
        eVar.a(b0.e.d.a.b.AbstractC0311b.class, nVar);
        eVar.a(oa.p.class, nVar);
        b bVar = b.f22789a;
        eVar.a(b0.a.class, bVar);
        eVar.a(oa.c.class, bVar);
        C0305a c0305a = C0305a.f22786a;
        eVar.a(b0.a.AbstractC0306a.class, c0305a);
        eVar.a(oa.d.class, c0305a);
        o oVar = o.f22861a;
        eVar.a(b0.e.d.a.b.c.class, oVar);
        eVar.a(oa.q.class, oVar);
        l lVar = l.f22847a;
        eVar.a(b0.e.d.a.b.AbstractC0309a.class, lVar);
        eVar.a(oa.o.class, lVar);
        c cVar = c.f22798a;
        eVar.a(b0.c.class, cVar);
        eVar.a(oa.e.class, cVar);
        r rVar = r.f22872a;
        eVar.a(b0.e.d.c.class, rVar);
        eVar.a(oa.t.class, rVar);
        t tVar = t.f22883a;
        eVar.a(b0.e.d.AbstractC0315d.class, tVar);
        eVar.a(oa.u.class, tVar);
        e eVar2 = e.f22809a;
        eVar.a(b0.d.class, eVar2);
        eVar.a(oa.f.class, eVar2);
        f fVar = f.f22811a;
        eVar.a(b0.d.a.class, fVar);
        eVar.a(oa.g.class, fVar);
    }
}
