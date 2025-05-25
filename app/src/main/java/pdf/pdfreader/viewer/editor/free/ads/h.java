package pdf.pdfreader.viewer.editor.free.ads;

import android.app.Activity;
import android.content.Context;
import com.lib.flutter.encrypt.EngineHelper;
import com.lib.flutter.encrypt.FlutterAppApi;
import pdf.pdfreader.viewer.editor.free.ads.a;

/* compiled from: ShareFileOpenAds.java */
/* loaded from: classes3.dex */
public final class h implements ae.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Activity f23957a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f23958b;

    public h(j jVar, Activity activity) {
        this.f23958b = jVar;
        this.f23957a = activity;
    }

    @Override // ae.c
    public final void b(Context context, yd.d dVar) {
        String p10 = ea.a.p("IG5wZDpsXmNr", "RApFkxiY");
        j jVar = this.f23958b;
        jVar.getClass();
        j.a(p10);
        AppOpenManager.c().f23907g = false;
        jVar.f23965f = InterstitialAdState.CLOSE;
    }

    @Override // ae.c
    public final void c(yd.a aVar) {
        j jVar = this.f23958b;
        jVar.getClass();
        j.a(ea.a.p("Jm4MZBpvFGQOYQ9sUWQg", "7MIMVuJK") + aVar);
        jVar.f23965f = InterstitialAdState.FAIL;
        a.d dVar = jVar.f23962b;
        if (dVar != null) {
            dVar.a0();
        }
        jVar.b(this.f23957a);
        j.i(false);
    }

    @Override // ae.b
    public final void e(yd.d dVar) {
        String p10 = ea.a.p("HW4wZAJvDmQ=", "3crqNoFM");
        j jVar = this.f23958b;
        jVar.getClass();
        j.a(p10);
        jVar.f23964e = System.currentTimeMillis();
        jVar.f23965f = InterstitialAdState.SUCCESS;
        a.d dVar2 = jVar.f23962b;
        if (dVar2 != null) {
            dVar2.J();
        }
        j.i(true);
    }

    @Override // ae.b
    public final void onAdClosed() {
        String p10 = ea.a.p("XG4KZDBsDXMXZA==", "EkFvTq0M");
        j jVar = this.f23958b;
        jVar.getClass();
        j.a(p10);
        jVar.f23965f = InterstitialAdState.CLOSE;
        a.d dVar = jVar.f23962b;
        if (dVar != null) {
            dVar.close();
        }
        jVar.b(this.f23957a);
        EngineHelper.f15726a.getClass();
        FlutterAppApi flutterAppApi = EngineHelper.f15727b;
        if (flutterAppApi != null) {
            flutterAppApi.b(ea.a.p("PHBdYQpoaGk0dC9yBnQBdFxhAl8uZXk=", "NLBFWsPk"), new yk.c());
        }
    }
}
