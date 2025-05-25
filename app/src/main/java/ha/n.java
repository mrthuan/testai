package ha;

import android.animation.ValueAnimator;
import android.database.Cursor;
import android.util.Base64;
import android.util.JsonReader;
import android.view.View;
import c7.p;
import com.facebook.appevents.o;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.datatransport.TransportRegistrar;
import com.lib.flutter.encrypt.FlutterAppApi;
import com.lib.flutter.encrypt.NativeSplashApi;
import db.a;
import ga.r;
import gf.b;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import lib.zj.pdfeditor.PDFReaderView;
import lib.zj.pdfeditor.x;
import pa.a;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.BaseOperatePDFActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.g2;
import w8.g;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class n implements ga.e, FeatureManager.a, p.a, g.a, a.InterfaceC0196a, a.InterfaceC0328a, b.d, b.c, x, g2.f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18139a;

    public /* synthetic */ n(int i10) {
        this.f18139a = i10;
    }

    @Override // ga.e
    public Object a(r rVar) {
        switch (this.f18139a) {
            case 0:
                ga.m<ScheduledExecutorService> mVar = ExecutorsRegistrar.f13493a;
                return UiExecutor.INSTANCE;
            default:
                return TransportRegistrar.a(rVar);
        }
    }

    @Override // c7.p.a
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        s6.b bVar = p.f5653f;
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    @Override // w8.g.a
    public void b(ValueAnimator valueAnimator, View view) {
        view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.g2.f
    public void c(boolean z10) {
        int i10 = BaseOperatePDFActivity.Z;
    }

    @Override // pa.a.InterfaceC0328a
    public Object d(JsonReader jsonReader) {
        String str;
        switch (this.f18139a) {
            case 6:
                ya.d dVar = pa.a.f23839a;
                jsonReader.beginObject();
                String str2 = null;
                byte[] bArr = null;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    nextName.getClass();
                    if (!nextName.equals("filename")) {
                        if (!nextName.equals("contents")) {
                            jsonReader.skipValue();
                        } else {
                            bArr = Base64.decode(jsonReader.nextString(), 2);
                            if (bArr == null) {
                                throw new NullPointerException("Null contents");
                            }
                        }
                    } else {
                        str2 = jsonReader.nextString();
                        if (str2 == null) {
                            throw new NullPointerException("Null filename");
                        }
                    }
                }
                jsonReader.endObject();
                if (str2 == null) {
                    str = " filename";
                } else {
                    str = "";
                }
                if (bArr == null) {
                    str = str.concat(" contents");
                }
                if (str.isEmpty()) {
                    return new oa.g(str2, bArr);
                }
                throw new IllegalStateException("Missing required properties:".concat(str));
            default:
                return pa.a.a(jsonReader);
        }
    }

    @Override // lib.zj.pdfeditor.x
    public void f(PDFReaderView pDFReaderView) {
        switch (this.f18139a) {
            case 10:
                pDFReaderView.u();
                return;
            case 11:
                pDFReaderView.B();
                return;
            default:
                pDFReaderView.w();
                return;
        }
    }

    @Override // gf.b.d
    public void i(Object obj) {
        tf.c<gf.j> cVar = FlutterAppApi.c;
    }

    @Override // com.facebook.internal.FeatureManager.a
    public void k(boolean z10) {
        com.facebook.internal.f k10;
        switch (this.f18139a) {
            case 0:
                if (z10) {
                    int i10 = o.f9644a;
                    if (!k6.a.b(o.class)) {
                        try {
                            FetchedAppSettingsManager.f9740e.add(new com.facebook.appevents.n());
                            FetchedAppSettingsManager.d();
                            return;
                        } catch (Throwable th2) {
                            k6.a.a(o.class, th2);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                if (z10) {
                    e6.a aVar = e6.a.f16466a;
                    if (!k6.a.b(e6.a.class)) {
                        try {
                            e6.a.f16467b = true;
                            e6.a.f16466a.b();
                            return;
                        } catch (Throwable th3) {
                            k6.a.a(e6.a.class, th3);
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                if (z10) {
                    b6.d dVar = b6.d.f5332a;
                    if (!k6.a.b(b6.d.class)) {
                        try {
                            b6.d dVar2 = b6.d.f5332a;
                            dVar2.getClass();
                            if (!k6.a.b(dVar2) && (k10 = FetchedAppSettingsManager.k(com.facebook.d.b(), false)) != null) {
                                b6.d.c = k10.f9777m;
                            }
                            if (b6.d.c != null) {
                                b6.d.f5333b = true;
                                return;
                            }
                            return;
                        } catch (Throwable th4) {
                            k6.a.a(b6.d.class, th4);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override // gf.b.c
    public void n(Object obj, gf.a aVar) {
        List h10;
        Boolean bool;
        NativeSplashApi.Companion companion = NativeSplashApi.Companion.f15741a;
        ea.a.p("PWVBbHk=", "Lo4KbuzW");
        try {
            NativeSplashApi nativeSplashApi = NativeSplashApi.Companion.c;
            if (nativeSplashApi != null) {
                bool = Boolean.valueOf(nativeSplashApi.e1());
            } else {
                bool = null;
            }
            h10 = ge.a.H(bool);
        } catch (Throwable th2) {
            h10 = b.b.h(th2);
        }
        aVar.i(h10);
    }

    @Override // db.a.InterfaceC0196a
    public void g(db.b bVar) {
    }
}
