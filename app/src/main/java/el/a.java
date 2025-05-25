package el;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.ads.AppOpenManager;
import pdf.pdfreader.viewer.editor.free.ads.standard.LanguageMutableNative;

/* compiled from: LanguageMutableNative.kt */
/* loaded from: classes3.dex */
public final class a implements ae.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LanguageMutableNative f16790a;

    public a(LanguageMutableNative languageMutableNative) {
        this.f16790a = languageMutableNative;
    }

    @Override // ae.d
    public final void a(Context context, View view, yd.d dVar) {
        g.e(context, "context");
        LanguageMutableNative languageMutableNative = this.f16790a;
        languageMutableNative.f23980d = false;
        languageMutableNative.f23982f = false;
        hl.a aVar = languageMutableNative.f23979b;
        if (aVar != null) {
            aVar.e();
        }
        LanguageMutableNative.b(true);
        LanguageMutableNative.a(ea.a.p("XG4KZD9vA2Q=", "Ea4ION65"));
    }

    @Override // ae.c
    public final void b(Context context, yd.d dVar) {
        String str;
        String str2;
        g.e(context, "context");
        LanguageMutableNative languageMutableNative = this.f16790a;
        hl.a aVar = languageMutableNative.f23979b;
        if (aVar != null) {
            aVar.d();
        }
        languageMutableNative.f23983g = true;
        String p10 = ea.a.p("IWVGZhVvdw==", "PQrYhihY");
        String p11 = ea.a.p("I2FfZwxhUGUFYS5fFmwBY2s=", "DlvEs4wl");
        no.f.b(context).getClass();
        String c = no.f.c();
        if (languageMutableNative.f23981e) {
            str = "E2E-bhRy";
            str2 = "lUqPqZPb";
        } else {
            str = "LGFDZA==";
            str2 = "zwUwUoOz";
        }
        tn.a.d(context, p10, p11, androidx.activity.f.m(c, "_", ea.a.p(str, str2)), false);
        AppOpenManager.c().f23907g = false;
        LanguageMutableNative.a(ea.a.p("XG4KZDBsC2Nr", "5VnFCtdy"));
    }

    @Override // ae.c
    public final void c(yd.a aVar) {
        LanguageMutableNative languageMutableNative = this.f16790a;
        languageMutableNative.f23980d = false;
        languageMutableNative.f23982f = false;
        languageMutableNative.f23978a = null;
        languageMutableNative.c = true;
        hl.a aVar2 = languageMutableNative.f23979b;
        if (aVar2 != null) {
            aVar2.f();
        }
        LanguageMutableNative.b(false);
        LanguageMutableNative.a("onAdLoadFailed " + aVar);
        LanguageMutableNative.a(ea.a.p("V2U4dAFvGyATZA==", "LzbrT5DW"));
    }
}
