package d9;

import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.search.SearchView;
import com.google.android.material.tabs.d;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import com.lib.flutter.encrypt.FlutterAppApi;
import com.lib.flutter.encrypt.NativeAppGlobalApi;
import ff.c;
import ga.q;
import ga.r;
import gf.b;
import io.flutter.embedding.android.f;
import io.flutter.plugins.pathprovider.Messages;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import jb.c0;
import lib.zj.office.wp.control.Word;
import lib.zj.pdfeditor.PDFPageView;
import lib.zj.pdfeditor.PDFReaderView;
import lib.zj.pdfeditor.x;
import org.json.JSONException;
import org.json.JSONObject;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity;
import pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity;
import pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergeChooserActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenClearDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.a3;
import pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.c;
import pdf.pdfreader.viewer.editor.free.utils.w0;
import w8.w;
import x0.s0;
import x0.u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements w.b, ka.a, OnSuccessListener, b.d, b.c, c.a, cj.a, x, androidx.activity.result.b, u, ro.b, ro.d, d.b, pdf.pdfreader.viewer.editor.free.utils.extension.e, ga.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16159a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f16160b;

    public /* synthetic */ g(Object obj, int i10) {
        this.f16159a = i10;
        this.f16160b = obj;
    }

    @Override // ga.e
    public Object a(r rVar) {
        int i10 = this.f16159a;
        Object obj = this.f16160b;
        switch (i10) {
            case 0:
                return obj;
            default:
                return RemoteConfigRegistrar.a((q) obj, rVar);
        }
    }

    @Override // w8.w.b
    public s0 b(View view, s0 s0Var, w.c cVar) {
        int i10;
        int i11;
        MaterialToolbar materialToolbar = ((SearchView) this.f16160b).f12808g;
        boolean e10 = w.e(materialToolbar);
        if (e10) {
            i10 = cVar.c;
        } else {
            i10 = cVar.f31063a;
        }
        if (e10) {
            i11 = cVar.f31063a;
        } else {
            i11 = cVar.c;
        }
        materialToolbar.setPadding(s0Var.c() + i10, cVar.f31064b, s0Var.d() + i11, cVar.f31065d);
        return s0Var;
    }

    @Override // androidx.activity.result.b
    public void c(Object obj) {
        boolean z10;
        ym.a aVar;
        int i10 = this.f16159a;
        boolean z11 = true;
        Object obj2 = this.f16160b;
        switch (i10) {
            case 10:
                jl.a aVar2 = (jl.a) obj2;
                String str = jl.a.f19287s;
                aVar2.getClass();
                Iterator it = ((Map) obj).entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                            z10 = false;
                        }
                    } else {
                        z10 = true;
                    }
                }
                if (z10) {
                    aVar2.w1(aVar2.f19300n);
                    return;
                } else if (!k0.b.b(aVar2, ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFIAQSFfAFgNRR5OOEwQU2VPK0FwRQ==", "DywFEYLy")) && !k0.b.b(aVar2, ea.a.p("O24nclZpMC44ZRRtXXMkaVdufFcbSWJFK0UpVBRSDEEWXxBUdlIVR0U=", "E8ZC9TtO"))) {
                    aVar2.X1(true);
                    return;
                } else {
                    aVar2.X1(false);
                    return;
                }
            case 11:
                PDFPageManagerActivity pDFPageManagerActivity = (PDFPageManagerActivity) obj2;
                androidx.activity.result.a aVar3 = (androidx.activity.result.a) obj;
                PDFPageManagerActivity.a aVar4 = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(pDFPageManagerActivity, ea.a.p("BGhbc2Uw", "87p2AEPO"));
                if (aVar3 == null || aVar3.f1828a != -1) {
                    z11 = false;
                }
                if (z11) {
                    Intent intent = aVar3.f1829b;
                    if (intent != null) {
                        aVar = (ym.a) intent.getParcelableExtra(ea.a.p("NmwkbllQB2ctSQhmbw==", "h9TE2fge"));
                    } else {
                        aVar = null;
                    }
                    if (aVar != null) {
                        w0.a().c.execute(new l1.a(17, pDFPageManagerActivity, aVar));
                        return;
                    }
                    return;
                }
                return;
            default:
                Word2PDFConvertActivity.l2((Word2PDFConvertActivity) obj2, (Map) obj);
                return;
        }
    }

    @Override // ro.b
    public void d(Object obj, Object obj2) {
        ro.b<a3.c, PdfReaderOpenClearDialog> bVar;
        int i10 = this.f16159a;
        Object obj3 = this.f16160b;
        switch (i10) {
            case 13:
                OfficeReaderActivity officeReaderActivity = (OfficeReaderActivity) obj3;
                PdfReaderOpenClearDialog pdfReaderOpenClearDialog = (PdfReaderOpenClearDialog) obj2;
                String str = OfficeReaderActivity.D2;
                kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("R2gic1cw", "UMa2BWuI"));
                if (!((Boolean) obj).booleanValue() && !officeReaderActivity.X1) {
                    officeReaderActivity.c3();
                    return;
                }
                return;
            case 15:
                ReaderPreviewActivity readerPreviewActivity = (ReaderPreviewActivity) obj3;
                PdfReaderOpenClearDialog pdfReaderOpenClearDialog2 = (PdfReaderOpenClearDialog) obj2;
                ExecutorService executorService = ReaderPreviewActivity.U5;
                readerPreviewActivity.getClass();
                if (!((Boolean) obj).booleanValue() && !readerPreviewActivity.J4) {
                    readerPreviewActivity.w4();
                    return;
                }
                return;
            case 18:
                a3 a3Var = (a3) obj3;
                Integer num = (Integer) obj;
                PdfReaderOpenClearDialog pdfReaderOpenClearDialog3 = (PdfReaderOpenClearDialog) obj2;
                int i11 = a3.A;
                a3Var.getClass();
                if (num.intValue() >= 0 && num.intValue() < a3Var.f27492y.size() && (bVar = a3Var.f27493z) != null) {
                    bVar.d((a3.c) a3Var.f27492y.get(num.intValue()), pdfReaderOpenClearDialog3);
                } else {
                    ro.b<a3.c, PdfReaderOpenClearDialog> bVar2 = a3Var.f27493z;
                    if (bVar2 != null) {
                        bVar2.d(null, pdfReaderOpenClearDialog3);
                    }
                }
                a3Var.dismiss();
                return;
            default:
                pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.e eVar = (pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.e) obj3;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                PdfReaderOpenClearDialog pdfReaderOpenClearDialog4 = (PdfReaderOpenClearDialog) obj2;
                int i12 = pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.e.f27680f;
                kotlin.jvm.internal.g.e(eVar, ea.a.p("OWgBcxMw", "TRMh7MMr"));
                if (!booleanValue && !eVar.f27682e) {
                    eVar.f27681d = false;
                    eVar.c = null;
                    androidx.lifecycle.w<po.b> wVar = pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.c.f27668m;
                    c.a.a(eVar);
                    return;
                }
                return;
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.extension.e
    public void e(Object obj) {
        pdf.pdfreader.viewer.editor.free.ui.frag.a aVar = (pdf.pdfreader.viewer.editor.free.ui.frag.a) this.f16160b;
        List list = (List) obj;
        ro.c cVar = pdf.pdfreader.viewer.editor.free.ui.frag.a.f27997y0;
        aVar.getClass();
        if (list != null) {
            aVar.K0(ea.a.p("H1BU", "ZhmByixo"));
        }
    }

    @Override // lib.zj.pdfeditor.x
    public void f(PDFReaderView pDFReaderView) {
        int i10 = PDFPageView.f21175y1;
        pDFReaderView.a((RectF) this.f16160b);
    }

    @Override // ro.d
    public void g(MotionEvent motionEvent) {
        ReaderMergeChooserActivity readerMergeChooserActivity = (ReaderMergeChooserActivity) this.f16160b;
        ReaderMergeChooserActivity.a aVar = ReaderMergeChooserActivity.f26759n0;
        kotlin.jvm.internal.g.e(readerMergeChooserActivity, ea.a.p("R2gic1cw", "MzSwejzr"));
        EditText editText = readerMergeChooserActivity.S;
        if (editText != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.a(editText);
        } else {
            kotlin.jvm.internal.g.i(ea.a.p("KmRYdC1lT3Q=", "FlmdlFxN"));
            throw null;
        }
    }

    @Override // ka.a
    public void h(Bundle bundle) {
        ((ia.a) this.f16160b).f18476a.h(bundle);
    }

    @Override // gf.b.d
    public void i(Object obj) {
        boolean z10;
        int i10 = this.f16159a;
        Object obj2 = this.f16160b;
        switch (i10) {
            case 3:
                cg.a aVar = (cg.a) obj2;
                tf.c<gf.j> cVar = FlutterAppApi.c;
                kotlin.jvm.internal.g.e(aVar, ea.a.p("a2NQbBViVmNr", "6W6411Gc"));
                aVar.invoke();
                return;
            default:
                c.a aVar2 = (c.a) obj2;
                if (obj != null) {
                    try {
                        z10 = ((JSONObject) obj).getBoolean("handled");
                    } catch (JSONException e10) {
                        e10.toString();
                    }
                    ((f.b.a) ((f.c.a) ((g) aVar2).f16160b)).a(z10);
                    return;
                }
                z10 = false;
                ((f.b.a) ((f.c.a) ((g) aVar2).f16160b)).a(z10);
                return;
        }
    }

    @Override // cj.a
    public int j() {
        return ((Word) this.f16160b).getPageCount();
    }

    @Override // x0.u
    public s0 m(View view, s0 s0Var) {
        int i10;
        int i11 = this.f16159a;
        Object obj = this.f16160b;
        switch (i11) {
            case 12:
                Pdf2ImagePicPreviewActivity pdf2ImagePicPreviewActivity = (Pdf2ImagePicPreviewActivity) obj;
                int i12 = Pdf2ImagePicPreviewActivity.I0;
                kotlin.jvm.internal.g.e(pdf2ImagePicPreviewActivity, ea.a.p("R2gic1cw", "wycS9mrP"));
                kotlin.jvm.internal.g.e(view, ea.a.p("dg==", "B9G1j2eS"));
                ea.a.p("Jm5CZQ1z", "WDmZLpyv");
                o0.b a10 = s0Var.a(7);
                kotlin.jvm.internal.g.d(a10, ea.a.p("Jm5CZQ1zGWc_dANuBmUccx1XB24hbxJJoIDEQy1tHGE7LmV5CWUZcyNzPmUYQglyRihHKQ==", "ku1GBbBl"));
                boolean hasWindowFocus = pdf2ImagePicPreviewActivity.hasWindowFocus();
                int i13 = a10.f22640b;
                if ((hasWindowFocus || i13 != 0) && pdf2ImagePicPreviewActivity.H2()) {
                    FrameLayout frameLayout = pdf2ImagePicPreviewActivity.b3().f1134t;
                    if (i13 <= 0) {
                        i13 = pdf2ImagePicPreviewActivity.b3().f1134t.getPaddingTop();
                    }
                    frameLayout.setPadding(0, i13, 0, a10.f22641d);
                }
                return s0Var;
            default:
                pdf.pdfreader.viewer.editor.free.ui.act.a aVar = (pdf.pdfreader.viewer.editor.free.ui.act.a) obj;
                int i14 = pdf.pdfreader.viewer.editor.free.ui.act.a.H;
                kotlin.jvm.internal.g.e(aVar, ea.a.p("O2hYc10w", "bjgRDYYd"));
                kotlin.jvm.internal.g.e(view, ea.a.p("dg==", "F6H2nj7b"));
                ea.a.p("B241ZRZz", "nRnFbh71");
                o0.b a11 = s0Var.a(7);
                kotlin.jvm.internal.g.d(a11, ea.a.p("Im4CZTBzX2ctdC9uR2UjcxBXO24tb0FJloDXQz5tMmE_LiV5NGVfczFzEmVZQjZySyh7KQ==", "pbKqDqwQ"));
                if (aVar.f19294h) {
                    i10 = 0;
                } else {
                    i10 = a11.f22641d;
                }
                view.setPadding(a11.f22639a, 0, a11.c, i10);
                return s0Var;
        }
    }

    @Override // gf.b.c
    public void n(Object obj, gf.a aVar) {
        Object h10;
        int i10 = this.f16159a;
        Object obj2 = this.f16160b;
        switch (i10) {
            case 4:
                NativeAppGlobalApi nativeAppGlobalApi = (NativeAppGlobalApi) obj2;
                NativeAppGlobalApi.Companion companion = NativeAppGlobalApi.Companion.f15737a;
                ea.a.p("QWU7bHk=", "3er1Waxs");
                kotlin.jvm.internal.g.c(obj, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuPG5ebkdsVSBHeTtlU2sNdB5pWi4KbzpsIWNGaSluMC4faQB0DmtWdF9pJS4ybhs_Pg==", "Ss29jUJz"));
                List list = (List) obj;
                Object obj3 = list.get(0);
                kotlin.jvm.internal.g.c(obj3, ea.a.p("OXUFbFdjV24mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAjeRllV2tZdCRpCC5ndCVpVmc=", "BqWiw6lY"));
                String str = (String) obj3;
                Object obj4 = list.get(1);
                kotlin.jvm.internal.g.c(obj4, ea.a.p("HXU8bFZjBG4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAHeSBlVmsKdCRpCC5ndCVpVmc=", "h3sPveo9"));
                try {
                    nativeAppGlobalApi.d(str, (String) obj4);
                    h10 = ge.a.H(null);
                } catch (Throwable th2) {
                    h10 = b.b.h(th2);
                }
                aVar.i(h10);
                return;
            default:
                Messages.a aVar2 = (Messages.a) obj2;
                ArrayList<Object> arrayList = new ArrayList<>();
                try {
                    Context context = ((io.flutter.plugins.pathprovider.a) aVar2).f18831a;
                    File dir = context.getDir("flutter", 0);
                    if (dir == null) {
                        dir = new File(p001if.a.a(context), "app_flutter");
                    }
                    arrayList.add(0, dir.getPath());
                } catch (Throwable th3) {
                    arrayList = Messages.a(th3);
                }
                aVar.i(arrayList);
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        boolean z10;
        boolean z11;
        c0 c0Var = (c0) obj;
        com.google.firebase.messaging.a aVar = FirebaseMessaging.f13641n;
        if (((FirebaseMessaging) this.f16160b).e()) {
            if (c0Var.f19112h.a() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                synchronized (c0Var) {
                    z11 = c0Var.f19111g;
                }
                if (!z11) {
                    c0Var.h(0L);
                }
            }
        }
    }
}
