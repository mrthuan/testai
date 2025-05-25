package t5;

import android.animation.ValueAnimator;
import android.database.Cursor;
import android.util.Base64;
import android.util.JsonReader;
import android.view.View;
import c7.p;
import cl.a;
import com.facebook.appevents.gps.ara.GpsAraTriggersManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.lib.flutter.encrypt.NativeSplashApi;
import com.tom_roush.fontbox.ttf.NamingTable;
import gf.b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import lib.zj.pdfeditor.PDFPageView;
import lib.zj.pdfeditor.PDFReaderView;
import lib.zj.pdfeditor.c0;
import lib.zj.pdfeditor.f0;
import lib.zj.pdfeditor.u0;
import lib.zj.pdfeditor.x;
import oa.b0;
import oa.o;
import pa.a;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity;
import v6.j;
import v6.s;
import w8.g;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements FeatureManager.a, p.a, g.a, a.InterfaceC0328a, b.c, x, u0, androidx.activity.result.b, a.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29940a;

    public /* synthetic */ i(int i10) {
        this.f29940a = i10;
    }

    @Override // c7.p.a
    public final Object apply(Object obj) {
        byte[] decode;
        switch (this.f29940a) {
            case 4:
                Cursor cursor = (Cursor) obj;
                s6.b bVar = p.f5653f;
                ArrayList arrayList = new ArrayList();
                while (cursor.moveToNext()) {
                    j.a a10 = s.a();
                    a10.b(cursor.getString(1));
                    a10.c(f7.a.b(cursor.getInt(2)));
                    String string = cursor.getString(3);
                    if (string == null) {
                        decode = null;
                    } else {
                        decode = Base64.decode(string, 0);
                    }
                    a10.f30714b = decode;
                    arrayList.add(a10.a());
                }
                return arrayList;
            default:
                return Boolean.valueOf(((Cursor) obj).moveToNext());
        }
    }

    @Override // w8.g.a
    public final void b(ValueAnimator valueAnimator, View view) {
        view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @Override // androidx.activity.result.b
    public final void c(Object obj) {
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        int i10 = CameraActivity.H0;
    }

    @Override // pa.a.InterfaceC0328a
    public final Object d(JsonReader jsonReader) {
        ya.d dVar = pa.a.f23839a;
        o.a aVar = new o.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 3373707:
                    if (nextName.equals(NamingTable.TAG)) {
                        c = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals("size")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextName.equals("uuid")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1153765347:
                    if (nextName.equals("baseAddress")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        aVar.c = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null name");
                    }
                case 1:
                    aVar.f23001b = Long.valueOf(jsonReader.nextLong());
                    break;
                case 2:
                    aVar.f23002d = new String(Base64.decode(jsonReader.nextString(), 2), b0.f22909a);
                    break;
                case 3:
                    aVar.f23000a = Long.valueOf(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    @Override // lib.zj.pdfeditor.u0
    public final void e(View view) {
        int i10 = PDFReaderView.f21220m2;
        PDFPageView pDFPageView = (PDFPageView) view;
        pDFPageView.f21311x = null;
        pDFPageView.f21307v = null;
        f0 f0Var = pDFPageView.f21281i;
        if (f0Var != null) {
            f0Var.a();
            pDFPageView.f21281i = null;
        }
        c0 c0Var = pDFPageView.f21283j;
        if (c0Var != null) {
            c0Var.a();
            pDFPageView.f21283j = null;
        }
    }

    @Override // lib.zj.pdfeditor.x
    public final void f(PDFReaderView pDFReaderView) {
        pDFReaderView.i();
    }

    @Override // com.facebook.internal.FeatureManager.a
    public final void k(boolean z10) {
        com.facebook.internal.f k10;
        boolean z11 = true;
        switch (this.f29940a) {
            case 1:
                if (z10) {
                    GpsAraTriggersManager gpsAraTriggersManager = GpsAraTriggersManager.f9522a;
                    if (!k6.a.b(GpsAraTriggersManager.class)) {
                        try {
                            GpsAraTriggersManager.f9523b = true;
                            GpsAraTriggersManager.c = new y5.a(com.facebook.d.a());
                            GpsAraTriggersManager.f9524d = "https://www." + com.facebook.d.f9698o + "/privacy_sandbox/mobile/register/trigger";
                            return;
                        } catch (Throwable th2) {
                            k6.a.a(GpsAraTriggersManager.class, th2);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 2:
                if (z10) {
                    b6.g gVar = b6.g.f5340a;
                    if (!k6.a.b(b6.g.class)) {
                        try {
                            if (!b6.g.f5341b) {
                                b6.g gVar2 = b6.g.f5340a;
                                gVar2.getClass();
                                if (!k6.a.b(gVar2) && (k10 = FetchedAppSettingsManager.k(com.facebook.d.b(), false)) != null) {
                                    gVar2.a(k10.f9781q);
                                }
                                if (b6.g.c.isEmpty() && b6.g.f5342d.isEmpty()) {
                                    z11 = false;
                                }
                                b6.g.f5341b = z11;
                                return;
                            }
                            return;
                        } catch (Throwable th3) {
                            k6.a.a(b6.g.class, th3);
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                if (z10) {
                    AtomicBoolean atomicBoolean = i6.d.f18471a;
                    synchronized (i6.d.class) {
                        if (!k6.a.b(i6.d.class)) {
                            if (!i6.d.f18471a.getAndSet(true)) {
                                com.facebook.d dVar = com.facebook.d.f9685a;
                                if (com.facebook.n.c()) {
                                    i6.d.a();
                                }
                                int i10 = i6.a.f18467a;
                                if (!k6.a.b(i6.a.class)) {
                                    i6.a.f18468b.scheduleWithFixedDelay(i6.a.f18469d, 0L, 500L, TimeUnit.MILLISECONDS);
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
        }
    }

    @Override // gf.b.c
    public final void n(Object obj, gf.a aVar) {
        List h10;
        NativeSplashApi.Companion companion = NativeSplashApi.Companion.f15741a;
        ea.a.p("QWU7bHk=", "DTBUaCdH");
        try {
            NativeSplashApi nativeSplashApi = NativeSplashApi.Companion.c;
            if (nativeSplashApi != null) {
                nativeSplashApi.v();
            }
            h10 = ge.a.H(null);
        } catch (Throwable th2) {
            h10 = b.b.h(th2);
        }
        aVar.i(h10);
    }
}
