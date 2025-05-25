package h5;

import am.y0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.lib.flutter.encrypt.FlutterAppApi;
import com.lib.flutter.encrypt.NativeAppGlobalApi;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import d7.a;
import gf.b;
import io.flutter.plugins.pathprovider.Messages;
import java.io.File;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import lib.zj.pdfeditor.PDFPageView;
import lib.zj.pdfeditor.PDFReaderView;
import lib.zj.pdfeditor.u0;
import ma.j0;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.vh.OCRAdjustViewHolder;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.d;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.pic.widget.CropImageView;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergeChooserActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderSplitPdfActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.PDFChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.x;
import pdf.pdfreader.viewer.editor.free.utils.a1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements d5.a, a.InterfaceC0194a, Continuation, SuccessContinuation, b.d, b.c, u0, androidx.activity.result.b, CropImageView.c, dn.b, ro.d, x.a, a1.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18007a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f18008b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f18007a = i10;
        this.f18008b = obj;
    }

    @Override // pdf.pdfreader.viewer.editor.free.pic.widget.CropImageView.c
    public final void a(List list) {
        um.a aVar = (um.a) this.f18008b;
        int i10 = OCRAdjustViewHolder.f25160d;
        kotlin.jvm.internal.g.e(aVar, ea.a.p("a2lcYR5l", "yGeo8LoJ"));
        ul.c cVar = aVar.f30437f;
        cVar.f30427d = true;
        kotlin.jvm.internal.g.d(list, ea.a.p("WnQ=", "myb2bs0Q"));
        cVar.f30430g = list;
        aVar.f30438g = null;
        aVar.f30439h = null;
        aVar.f30436e = null;
    }

    @Override // d5.a
    public final void b(boolean z10) {
        b this$0 = (b) this.f18008b;
        kotlin.jvm.internal.g.e(this$0, "this$0");
        if (z10 && this$0.d().a() && ea.a.f16518b) {
            this$0.f(this$0.c());
        }
    }

    @Override // androidx.activity.result.b
    public final void c(Object obj) {
        int i10 = this.f18007a;
        Object obj2 = this.f18008b;
        switch (i10) {
            case 12:
                pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.b bVar = (pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.b) obj2;
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                kotlin.jvm.internal.g.e(bVar, ea.a.p("HWgHc3Yw", "qKinRzxQ"));
                kotlin.jvm.internal.g.d(aVar, ea.a.p("WnQ=", "5DKtKtBI"));
                bVar.f24807a.v(aVar);
                return;
            case 15:
                BasePdf2ImageActivity.m2((BasePdf2ImageActivity) obj2, (Map) obj);
                return;
            default:
                ReaderMergeChooserActivity.n2((ReaderMergeChooserActivity) obj2, (Map) obj);
                return;
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.x.a
    public final void d() {
        ReaderSplitPdfActivity readerSplitPdfActivity = (ReaderSplitPdfActivity) this.f18008b;
        ReaderSplitPdfActivity.a aVar = ReaderSplitPdfActivity.f26822q0;
        kotlin.jvm.internal.g.e(readerSplitPdfActivity, ea.a.p("R2gic1cw", "420DhMG3"));
        readerSplitPdfActivity.startActivity(new Intent(readerSplitPdfActivity, ReaderHomeActivity.class));
    }

    @Override // lib.zj.pdfeditor.u0
    public final void e(View view) {
        PDFReaderView pDFReaderView = (PDFReaderView) this.f18008b;
        int i10 = PDFReaderView.f21220m2;
        pDFReaderView.getClass();
        PDFPageView pDFPageView = (PDFPageView) view;
        if (pDFPageView.getPage() != pDFReaderView.K1.getPage()) {
            pDFPageView.n2(true);
        }
    }

    @Override // ro.d
    public final void g(MotionEvent motionEvent) {
        int i10 = this.f18007a;
        Object obj = this.f18008b;
        switch (i10) {
            case 16:
                ReaderPreviewActivity.a2((ReaderPreviewActivity) obj, motionEvent);
                return;
            default:
                PDFChooseActivity pDFChooseActivity = (PDFChooseActivity) obj;
                PDFChooseActivity.a aVar = PDFChooseActivity.f27008u0;
                kotlin.jvm.internal.g.e(pDFChooseActivity, ea.a.p("R2gic1cw", "15vDoAlD"));
                EditText editText = pDFChooseActivity.f27014f0;
                if (editText != null) {
                    pdf.pdfreader.viewer.editor.free.utils.extension.g.a(editText);
                    return;
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("VmQidCdlGnQ=", "76SBrjdz"));
                    throw null;
                }
        }
    }

    @Override // dn.b
    public final void h(bn.a aVar, Bitmap bitmap, boolean z10) {
        pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.d dVar = (pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.d) this.f18008b;
        d.a aVar2 = pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.d.f25379j0;
        kotlin.jvm.internal.g.e(dVar, ea.a.p("B2gBcxIw", "Rysh6nXH"));
        try {
            VB vb2 = dVar.Y;
            kotlin.jvm.internal.g.b(vb2);
            if (((y0) vb2).c.getContext() instanceof Activity) {
                VB vb3 = dVar.Y;
                kotlin.jvm.internal.g.b(vb3);
                Context context = ((y0) vb3).c.getContext();
                kotlin.jvm.internal.g.c(context, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuGW5IbgFsOCA7eUFlWWFZZChvI2RbYRhwG0ENdCx2DHR5", "yp1YvetT"));
                if (pdf.pdfreader.viewer.editor.free.utils.extension.a.b((Activity) context)) {
                    return;
                }
            }
            VB vb4 = dVar.Y;
            kotlin.jvm.internal.g.b(vb4);
            ((y0) vb4).c.setStrokeColor(null);
            dVar.x0();
            com.bumptech.glide.e n10 = com.bumptech.glide.b.c(dVar.r()).g(dVar).l(bitmap).n(OS2WindowsMetricsTable.WEIGHT_CLASS_EXTRA_BOLD, OS2WindowsMetricsTable.WEIGHT_CLASS_EXTRA_BOLD);
            n10.H(new d.C0343d());
            n10.E = com.bumptech.glide.a.c();
            VB vb5 = dVar.Y;
            kotlin.jvm.internal.g.b(vb5);
            n10.E(((y0) vb5).c);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // gf.b.d
    public final void i(Object obj) {
        cg.l lVar = (cg.l) this.f18008b;
        tf.c<gf.j> cVar = FlutterAppApi.c;
        kotlin.jvm.internal.g.e(lVar, ea.a.p("F2MqbB9iA2Nr", "tWK0nDfs"));
        kotlin.jvm.internal.g.c(obj, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuB25GbkBsDyBHeTtlU2sNdB5pWi46dCRpKmc=", "hk5c4ZGR"));
        lVar.invoke((String) obj);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task j(Object obj) {
        int i10 = this.f18007a;
        Object obj2 = this.f18008b;
        switch (i10) {
            case 5:
                mb.e eVar = (mb.e) obj2;
                Void r52 = (Void) obj;
                Task<nb.e> b10 = eVar.f21966d.b();
                Task<nb.e> b11 = eVar.f21967e.b();
                return Tasks.g(b10, b11).i(eVar.c, new c7.j(eVar, b10, b11));
            default:
                int[] iArr = com.google.firebase.remoteconfig.internal.c.f13730p;
                ((HttpURLConnection) obj2).setRequestProperty("X-Goog-Firebase-Installations-Auth", ((eb.h) obj).a());
                return Tasks.e(null);
        }
    }

    @Override // d7.a.InterfaceC0194a
    public final Object l() {
        ((b7.e) this.f18008b).f5359i.b();
        return null;
    }

    @Override // gf.b.c
    public final void n(Object obj, gf.a aVar) {
        Object h10;
        int i10 = this.f18007a;
        String str = null;
        Object obj2 = this.f18008b;
        switch (i10) {
            case 8:
                NativeAppGlobalApi nativeAppGlobalApi = (NativeAppGlobalApi) obj2;
                NativeAppGlobalApi.Companion companion = NativeAppGlobalApi.Companion.f15737a;
                ea.a.p("QWU7bHk=", "vPwS5TaW");
                kotlin.jvm.internal.g.c(obj, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuWm50bgRsJSBHeTtlU2sNdB5pWi4KbzpsIWNGaSluMC55aSp0TWsmdF9pJS4ybhs_Pg==", "5YqI74t6"));
                List list = (List) obj;
                Object obj3 = list.get(0);
                kotlin.jvm.internal.g.c(obj3, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuLm5gbi1sDSBHeTtlU2sNdB5pWi46dCRpKmc=", "AMXaleb3"));
                String str2 = (String) obj3;
                Object obj4 = list.get(1);
                kotlin.jvm.internal.g.c(obj4, ea.a.p("IXUqbBdjAm4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiA7eTZlF2sMdCRpCC5ndCVpVmc=", "FdOF7cFn"));
                try {
                    nativeAppGlobalApi.e(str2, (String) obj4);
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
                    File externalFilesDir = ((io.flutter.plugins.pathprovider.a) aVar2).f18831a.getExternalFilesDir(null);
                    if (externalFilesDir != null) {
                        str = externalFilesDir.getAbsolutePath();
                    }
                    arrayList.add(0, str);
                } catch (Throwable th3) {
                    arrayList = Messages.a(th3);
                }
                aVar.i(arrayList);
                return;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f18008b;
        ExecutorService executorService = j0.f21911a;
        if (task.o()) {
            taskCompletionSource.d(task.k());
            return null;
        } else if (task.j() != null) {
            taskCompletionSource.c(task.j());
            return null;
        } else {
            return null;
        }
    }
}
