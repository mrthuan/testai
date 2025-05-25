package t5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.JsonReader;
import android.view.MotionEvent;
import android.view.View;
import com.adjust.sdk.OnAttributionChangedListener;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.appevents.ml.ModelManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.p;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.lib.flutter.encrypt.FlutterAppApi;
import f9.m;
import gf.b;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.HashSet;
import lb.f;
import lib.zj.pdfeditor.PDFPageView;
import lib.zj.pdfeditor.PDFReaderView;
import lib.zj.pdfeditor.ReaderView;
import lib.zj.pdfeditor.u0;
import lib.zj.pdfeditor.x;
import oa.b0;
import pa.a;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.OfficeAIReaderActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements FeatureManager.a, s6.g, m.b, TextInputLayout.f, f.a, a.InterfaceC0328a, s6.d, Continuation, b.d, x, u0, ro.d, androidx.activity.result.b, OnAttributionChangedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29936a;

    public /* synthetic */ f(int i10) {
        this.f29936a = i10;
    }

    @Override // f9.m.b
    public final f9.d a(f9.d dVar) {
        int i10 = MaskableFrameLayout.f12238f;
        if (dVar instanceof f9.a) {
            return new f9.c(((f9.a) dVar).f17157a);
        }
        return dVar;
    }

    @Override // s6.d
    public final Object apply(Object obj) {
        b0 b0Var = (b0) obj;
        sa.a.f29755b.getClass();
        ya.d dVar = pa.a.f23839a;
        dVar.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            dVar.a(b0Var, stringWriter);
        } catch (IOException unused) {
        }
        return stringWriter.toString().getBytes(Charset.forName("UTF-8"));
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
        boolean z10 = ReaderView.f21377y0;
        if (view instanceof PDFPageView) {
            PDFPageView pDFPageView = (PDFPageView) view;
            if (pDFPageView.f21277g > 1.0f || pDFPageView.V) {
                pDFPageView.W1(true, false);
            }
        }
    }

    @Override // lib.zj.pdfeditor.x
    public final void f(PDFReaderView pDFReaderView) {
        switch (this.f29936a) {
            case 13:
                pDFReaderView.q();
                return;
            default:
                pDFReaderView.h();
                return;
        }
    }

    @Override // ro.d
    public final void g(MotionEvent motionEvent) {
        String str = OfficeAIReaderActivity.K0;
    }

    @Override // lb.f.a
    public final String h(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.targetSdkVersion);
        }
        return "";
    }

    @Override // gf.b.d
    public final void i(Object obj) {
        tf.c<gf.j> cVar = FlutterAppApi.c;
    }

    @Override // com.facebook.internal.FeatureManager.a
    public final void k(boolean z10) {
        com.facebook.internal.f k10;
        HashSet<String> e10;
        boolean z11 = false;
        switch (this.f29936a) {
            case 0:
                com.facebook.d dVar = com.facebook.d.f9685a;
                return;
            case 1:
                if (z10) {
                    u5.b bVar = u5.b.f30220a;
                    if (!k6.a.b(u5.b.class)) {
                        try {
                            try {
                                com.facebook.d.c().execute(new u5.a(0));
                                return;
                            } catch (Throwable th2) {
                                k6.a.a(u5.b.class, th2);
                                return;
                            }
                        } catch (Exception unused) {
                            p pVar = p.f9815a;
                            com.facebook.d dVar2 = com.facebook.d.f9685a;
                            return;
                        }
                    }
                    return;
                }
                return;
            case 2:
                if (z10) {
                    ModelManager modelManager = ModelManager.f9619a;
                    if (!k6.a.b(ModelManager.class)) {
                        try {
                            a6.c cVar = new a6.c(1);
                            p pVar2 = p.f9815a;
                            try {
                                com.facebook.d.c().execute(cVar);
                                return;
                            } catch (Exception unused2) {
                                return;
                            }
                        } catch (Throwable th3) {
                            k6.a.a(ModelManager.class, th3);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 3:
                if (z10) {
                    b6.b bVar2 = b6.b.f5328a;
                    if (!k6.a.b(b6.b.class)) {
                        try {
                            b6.b bVar3 = b6.b.f5328a;
                            bVar3.getClass();
                            if (!k6.a.b(bVar3) && (k10 = FetchedAppSettingsManager.k(com.facebook.d.b(), false)) != null && (e10 = p.e(k10.f9778n)) != null) {
                                b6.b.c = e10;
                            }
                            HashSet hashSet = b6.b.c;
                            if (hashSet == null || hashSet.isEmpty()) {
                                z11 = true;
                            }
                            if (!z11) {
                                b6.b.f5329b = true;
                                return;
                            }
                            return;
                        } catch (Throwable th4) {
                            k6.a.a(b6.b.class, th4);
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                c6.e eVar = c6.e.f5594a;
                if (z10) {
                    v5.b bVar4 = v5.b.f30651a;
                    if (!k6.a.b(v5.b.class)) {
                        try {
                            v5.b.f30655f.set(true);
                            return;
                        } catch (Throwable th5) {
                            k6.a.a(v5.b.class, th5);
                            return;
                        }
                    }
                    return;
                }
                v5.b bVar5 = v5.b.f30651a;
                if (!k6.a.b(v5.b.class)) {
                    try {
                        v5.b.f30655f.set(false);
                        return;
                    } catch (Throwable th6) {
                        k6.a.a(v5.b.class, th6);
                        return;
                    }
                }
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001c A[Catch: Exception -> 0x0017, TryCatch #0 {Exception -> 0x0017, blocks: (B:8:0x000e, B:16:0x001c, B:18:0x002f, B:19:0x0036, B:21:0x0047, B:22:0x004e, B:24:0x0058), top: B:34:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // com.adjust.sdk.OnAttributionChangedListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAttributionChanged(com.adjust.sdk.AdjustAttribution r7) {
        /*
            r6 = this;
            tf.c r0 = com.google.android.tools.InstallReferrerUtil.f13468a
            if (r7 == 0) goto L7
            java.lang.String r0 = r7.network
            goto L8
        L7:
            r0 = 0
        L8:
            java.lang.String r1 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L19
            int r4 = r0.length()     // Catch: java.lang.Exception -> L17
            if (r4 != 0) goto L15
            goto L19
        L15:
            r4 = r2
            goto L1a
        L17:
            r0 = move-exception
            goto L5f
        L19:
            r4 = r3
        L1a:
            if (r4 != 0) goto L62
            java.util.Locale r4 = java.util.Locale.ROOT     // Catch: java.lang.Exception -> L17
            java.lang.String r0 = r0.toLowerCase(r4)     // Catch: java.lang.Exception -> L17
            kotlin.jvm.internal.g.d(r0, r1)     // Catch: java.lang.Exception -> L17
            com.google.android.tools.InstallReferrerUtil.f13472f = r0     // Catch: java.lang.Exception -> L17
            java.lang.String r5 = "digital turbine"
            boolean r0 = kotlin.text.k.O(r0, r5, r2)     // Catch: java.lang.Exception -> L17
            if (r0 == 0) goto L36
            java.lang.String r0 = com.google.android.tools.InstallReferrerUtil.f13472f     // Catch: java.lang.Exception -> L17
            r1 = 2
            com.google.android.tools.InstallReferrerUtil.h(r1, r0)     // Catch: java.lang.Exception -> L17
            goto L62
        L36:
            java.lang.String r0 = com.google.android.tools.InstallReferrerUtil.f13472f     // Catch: java.lang.Exception -> L17
            java.lang.String r0 = r0.toLowerCase(r4)     // Catch: java.lang.Exception -> L17
            kotlin.jvm.internal.g.d(r0, r1)     // Catch: java.lang.Exception -> L17
            java.lang.String r1 = "applovin"
            boolean r0 = kotlin.text.k.O(r0, r1, r2)     // Catch: java.lang.Exception -> L17
            if (r0 == 0) goto L4e
            java.lang.String r0 = com.google.android.tools.InstallReferrerUtil.f13472f     // Catch: java.lang.Exception -> L17
            r1 = 4
            com.google.android.tools.InstallReferrerUtil.h(r1, r0)     // Catch: java.lang.Exception -> L17
            goto L62
        L4e:
            java.lang.String r0 = com.google.android.tools.InstallReferrerUtil.f13472f     // Catch: java.lang.Exception -> L17
            java.lang.String r1 = "moloco"
            boolean r0 = kotlin.text.k.O(r0, r1, r2)     // Catch: java.lang.Exception -> L17
            if (r0 == 0) goto L62
            java.lang.String r0 = com.google.android.tools.InstallReferrerUtil.f13472f     // Catch: java.lang.Exception -> L17
            r1 = 6
            com.google.android.tools.InstallReferrerUtil.h(r1, r0)     // Catch: java.lang.Exception -> L17
            goto L62
        L5f:
            r0.printStackTrace()
        L62:
            if (r7 == 0) goto L7a
            java.lang.String r7 = r7.network
            java.lang.String r0 = "LnRFclduUnQtbzhr"
            java.lang.String r1 = "AzhCoDjs"
            int r7 = android.support.v4.media.session.h.b(r0, r1, r7)
            if (r7 <= 0) goto L71
            r2 = r3
        L71:
            if (r2 == 0) goto L7a
            java.lang.String r7 = "cmQhdQB0MURL"
            java.lang.String r0 = "C39pKSrS"
            ea.a.p(r7, r0)
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.f.onAttributionChanged(com.adjust.sdk.AdjustAttribution):void");
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        Object obj = jb.j.c;
        return Integer.valueOf((int) TTAdConstant.DEEPLINK_UNAVAILABLE_CODE);
    }

    @Override // s6.g
    public final void b(Exception exc) {
    }
}
