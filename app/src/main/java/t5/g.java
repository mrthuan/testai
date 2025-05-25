package t5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.os.Build;
import android.util.JsonReader;
import android.view.MotionEvent;
import android.view.View;
import c7.p;
import com.facebook.internal.FeatureManager;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Objects;
import jb.r;
import lb.f;
import lib.zj.pdfeditor.PDFPageView;
import lib.zj.pdfeditor.PDFReaderView;
import lib.zj.pdfeditor.u0;
import lib.zj.pdfeditor.x;
import p001if.b;
import pa.a;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.OfficeAIReaderActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements FeatureManager.a, p.a, f.a, a.InterfaceC0328a, s6.d, SuccessContinuation, b.a, x, u0, ro.d, androidx.activity.result.b, OnAdInspectorClosedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29937a;

    public /* synthetic */ g(int i10) {
        this.f29937a = i10;
    }

    @Override // com.google.android.gms.ads.OnAdInspectorClosedListener
    public final void a(AdInspectorError adInspectorError) {
        int i10 = pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.n.f27916d0;
        ea.a.p("dmRtZRt0", "1o79hVOl");
        Objects.toString(adInspectorError);
    }

    @Override // c7.p.a
    public final Object apply(Object obj) {
        boolean z10;
        switch (this.f29937a) {
            case 5:
                s6.b bVar = p.f5653f;
                if (((Cursor) obj).getCount() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                kb.a aVar = (kb.a) obj;
                aVar.getClass();
                za.e eVar = r.f19151a;
                eVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    eVar.a(aVar, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
        }
    }

    @Override // p001if.b.a
    public final boolean b(View view) {
        return view.hasFocus();
    }

    @Override // androidx.activity.result.b
    public final void c(Object obj) {
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        ReaderImg2PDFChooseActivity.a aVar2 = ReaderImg2PDFChooseActivity.M0;
    }

    @Override // pa.a.InterfaceC0328a
    public final Object d(JsonReader jsonReader) {
        return pa.a.b(jsonReader);
    }

    @Override // lib.zj.pdfeditor.u0
    public final void e(View view) {
        int i10 = PDFReaderView.f21220m2;
        ((PDFPageView) view).n2(false);
    }

    @Override // lib.zj.pdfeditor.x
    public final void f(PDFReaderView pDFReaderView) {
        switch (this.f29937a) {
            case 11:
                pDFReaderView.C();
                return;
            default:
                pDFReaderView.d();
                return;
        }
    }

    @Override // ro.d
    public final void g(MotionEvent motionEvent) {
        String str = OfficeAIReaderActivity.K0;
    }

    @Override // lb.f.a
    public final String h(Context context) {
        int i10;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null && Build.VERSION.SDK_INT >= 24) {
            i10 = applicationInfo.minSdkVersion;
            return String.valueOf(i10);
        }
        return "";
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task j(Object obj) {
        ConfigFetchHandler.a aVar = (ConfigFetchHandler.a) obj;
        return Tasks.e(null);
    }

    @Override // com.facebook.internal.FeatureManager.a
    public final void k(boolean z10) {
        switch (this.f29937a) {
            case 0:
                com.facebook.d dVar = com.facebook.d.f9685a;
                return;
            case 1:
                if (z10) {
                    b6.e eVar = b6.e.f5335a;
                    if (!k6.a.b(b6.e.class)) {
                        try {
                            b6.e.f5335a.a();
                            if (!b6.e.c.isEmpty()) {
                                b6.e.f5336b = true;
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            k6.a.a(b6.e.class, th2);
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                if (z10) {
                    x5.a aVar = x5.a.f31618a;
                    if (!k6.a.b(x5.a.class)) {
                        try {
                            x5.a.f31619b = true;
                            x5.a.f31618a.a();
                            return;
                        } catch (Throwable th3) {
                            k6.a.a(x5.a.class, th3);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }
}
