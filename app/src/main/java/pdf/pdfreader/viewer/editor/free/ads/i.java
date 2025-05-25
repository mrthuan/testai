package pdf.pdfreader.viewer.editor.free.ads;

import be.c;
import com.lib.flutter.encrypt.EngineHelper;
import com.lib.flutter.encrypt.FlutterAppApi;
import pdf.pdfreader.viewer.editor.free.ads.a;

/* compiled from: ShareFileOpenAds.java */
/* loaded from: classes3.dex */
public final class i implements c.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f23959a;

    public i(j jVar) {
        this.f23959a = jVar;
    }

    @Override // be.c.a
    public final void a(boolean z10) {
        j jVar = this.f23959a;
        if (z10) {
            String p10 = ea.a.p("PGhed1lzQmM5ZTlz", "jdX8lkPI");
            jVar.getClass();
            j.a(p10);
            fp.a.d(true);
        } else {
            jVar.c = false;
            jVar.f23965f = InterstitialAdState.DEFAULT;
            j.a(ea.a.p("PGhed1lmVmk2ZWQ=", "Zt6EBEQu"));
        }
        jVar.f23964e = 0L;
        androidx.appcompat.view.menu.d.h("I2FCdCZzX28tXyx1GWw3YVFfGmkoZQ==", "jl4cui8Q", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), System.currentTimeMillis());
        a.d dVar = jVar.f23962b;
        if (dVar != null) {
            dVar.w(z10);
        }
        EngineHelper.f15726a.getClass();
        FlutterAppApi flutterAppApi = EngineHelper.f15727b;
        if (flutterAppApi != null) {
            flutterAppApi.d(ea.a.p("PHBdYQpoaGk0dC9yBnQBdFxhAl8uZXk=", "OyxPgnub"), z10, new yk.c());
        }
    }
}
