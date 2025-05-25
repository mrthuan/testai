package u0;

import a6.h;
import android.content.Context;
import android.os.Build;
import android.util.JsonReader;
import com.facebook.e;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.p;
import com.facebook.internal.q;
import com.facebook.n;
import com.lib.flutter.encrypt.NativeGuideLanApi;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject;
import gf.b;
import j6.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.g;
import lb.f;
import lib.zj.pdfeditor.PDFReaderView;
import lib.zj.pdfeditor.x;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pa.a;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.feature.ocr.data.OCRWorkFlow;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImgPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment;
import pdf.pdfreader.viewer.editor.free.utils.extension.e;
import ya.d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements FeatureManager.a, f.a, a.InterfaceC0328a, b.c, x, e, androidx.activity.result.b, ro.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f30114a;

    public /* synthetic */ a(int i10) {
        this.f30114a = i10;
    }

    @Override // androidx.activity.result.b
    public final void c(Object obj) {
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        String str = ReaderImgPreviewActivity.f27400d0;
    }

    @Override // pa.a.InterfaceC0328a
    public final Object d(JsonReader jsonReader) {
        String str;
        d dVar = pa.a.f23839a;
        jsonReader.beginObject();
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -609862170:
                    if (nextName.equals("libraryName")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c = 1;
                        break;
                    }
                    break;
                case 230943785:
                    if (nextName.equals("buildId")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    str3 = jsonReader.nextString();
                    if (str3 != null) {
                        break;
                    } else {
                        throw new NullPointerException("Null libraryName");
                    }
                case 1:
                    str2 = jsonReader.nextString();
                    if (str2 != null) {
                        break;
                    } else {
                        throw new NullPointerException("Null arch");
                    }
                case 2:
                    str4 = jsonReader.nextString();
                    if (str4 != null) {
                        break;
                    } else {
                        throw new NullPointerException("Null buildId");
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (str2 == null) {
            str = " arch";
        } else {
            str = "";
        }
        if (str3 == null) {
            str = str.concat(" libraryName");
        }
        if (str4 == null) {
            str = h.c(str, " buildId");
        }
        if (str.isEmpty()) {
            return new oa.d(str2, str3, str4);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.extension.e
    public final void e(Object obj) {
        OCRWorkFlow oCRWorkFlow = (OCRWorkFlow) obj;
        String str = ReaderHomeActivity.Y1;
        if (oCRWorkFlow != null) {
            ReaderPdfApplication.k().f(null);
        }
    }

    @Override // lib.zj.pdfeditor.x
    public final void f(PDFReaderView pDFReaderView) {
        pDFReaderView.F();
    }

    @Override // lb.f.a
    public final String h(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return PDPrintFieldAttributeObject.ROLE_TV;
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        if (i10 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
            return "embedded";
        }
        return "";
    }

    @Override // com.facebook.internal.FeatureManager.a
    public final void k(boolean z10) {
        File[] listFiles;
        com.facebook.internal.f k10;
        HashSet<String> hashSet;
        HashSet<String> hashSet2 = null;
        switch (this.f30114a) {
            case 1:
                com.facebook.d dVar = com.facebook.d.f9685a;
                return;
            case 2:
                if (z10) {
                    b6.f fVar = b6.f.f5337a;
                    if (!k6.a.b(b6.f.class)) {
                        try {
                            b6.f.f5337a.a();
                            if (b6.f.c.isEmpty() && b6.f.f5339d.isEmpty()) {
                                b6.f.f5338b = false;
                            } else {
                                b6.f.f5338b = true;
                            }
                            return;
                        } catch (Throwable th2) {
                            k6.a.a(b6.f.class, th2);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 3:
                if (z10) {
                    b6.a aVar = b6.a.f5326a;
                    if (!k6.a.b(b6.a.class)) {
                        try {
                            if (!b6.a.f5327b) {
                                b6.a aVar2 = b6.a.f5326a;
                                aVar2.getClass();
                                if (!k6.a.b(aVar2) && (k10 = FetchedAppSettingsManager.k(com.facebook.d.b(), false)) != null) {
                                    JSONArray jSONArray = k10.f9782r;
                                    if (!k6.a.b(aVar2)) {
                                        try {
                                            try {
                                                hashSet = p.e(jSONArray);
                                                if (hashSet == null) {
                                                    hashSet = new HashSet<>();
                                                }
                                            } catch (Throwable th3) {
                                                k6.a.a(aVar2, th3);
                                            }
                                        } catch (Exception unused) {
                                            hashSet = new HashSet<>();
                                        }
                                        hashSet2 = hashSet;
                                    }
                                    b6.a.c = hashSet2;
                                }
                                b6.a.f5327b = !b6.a.c.isEmpty();
                                return;
                            }
                            return;
                        } catch (Throwable th4) {
                            k6.a.a(b6.a.class, th4);
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                if (z10) {
                    synchronized (j6.c.f19044b) {
                        com.facebook.d dVar2 = com.facebook.d.f9685a;
                        if (n.c()) {
                            c.a.a();
                        }
                        if (j6.c.c == null) {
                            j6.c cVar = new j6.c(Thread.getDefaultUncaughtExceptionHandler());
                            j6.c.c = cVar;
                            Thread.setDefaultUncaughtExceptionHandler(cVar);
                        }
                    }
                    if (FeatureManager.c(FeatureManager.Feature.CrashShield)) {
                        h6.a.f18045a = true;
                        if (n.c() && !p.t()) {
                            File b10 = h6.d.b();
                            if (b10 == null) {
                                listFiles = new File[0];
                            } else {
                                listFiles = b10.listFiles(new h6.c());
                                if (listFiles == null) {
                                    listFiles = new File[0];
                                }
                            }
                            ArrayList arrayList = new ArrayList();
                            for (File file : listFiles) {
                                g.e(file, "file");
                                InstrumentData instrumentData = new InstrumentData(file);
                                if (instrumentData.b()) {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("crash_shield", instrumentData.toString());
                                        String str = com.facebook.e.f9701j;
                                        String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{com.facebook.d.b()}, 1));
                                        g.d(format, "format(format, *args)");
                                        arrayList.add(e.c.h(null, format, jSONObject, new t5.b(instrumentData, 2)));
                                    } catch (JSONException unused2) {
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                com.facebook.h hVar = new com.facebook.h(arrayList);
                                String str2 = com.facebook.e.f9701j;
                                q.b(hVar);
                                new com.facebook.g(hVar).executeOnExecutor(com.facebook.d.c(), new Void[0]);
                            }
                        }
                        k6.a.f19603b = true;
                    }
                    if (FeatureManager.c(FeatureManager.Feature.ThreadCheck)) {
                        int i10 = m6.a.f21822a;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // gf.b.c
    public final void n(Object obj, gf.a aVar) {
        List h10;
        NativeGuideLanApi.Companion companion = NativeGuideLanApi.Companion.f15739a;
        ea.a.p("QWU7bHk=", "z5XoIr43");
        try {
            NativeGuideLanApi nativeGuideLanApi = NativeGuideLanApi.Companion.c;
            if (nativeGuideLanApi != null) {
                nativeGuideLanApi.j0();
            }
            h10 = ge.a.H(null);
        } catch (Throwable th2) {
            h10 = b.b.h(th2);
        }
        aVar.i(h10);
    }

    @Override // ro.a
    public final void o(Object obj) {
        Boolean bool = (Boolean) obj;
        int i10 = DebugPageAndDialogFragment.f27860g0;
    }
}
