package qb;

import android.content.Context;
import android.graphics.RectF;
import android.os.Handler;
import androidx.room.RoomDatabase;
import ao.i2;
import cg.l;
import com.inmobi.media.C1761p5;
import com.lib.flutter.encrypt.FlutterAppApi;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import lib.zj.pdfeditor.ReaderPDFCore;
import lib.zj.pdfeditor.p;
import lib.zj.pdfeditor.text.PDFFreeTextEditView;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper;
import pdf.pdfreader.viewer.editor.free.feature.ai.db.AIDataBase;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.widget.Pdf2ImageConvertCompletedView;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity;
import pdf.pdfreader.viewer.editor.free.utils.FasterFileUtil;
import pdf.pdfreader.viewer.editor.free.utils.GetPDFPasswordProcess;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29168a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f29169b;
    public final /* synthetic */ Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f29170d;

    public /* synthetic */ c1(int i10, Object obj, Object obj2, Object obj3) {
        this.f29168a = i10;
        this.f29170d = obj;
        this.f29169b = obj2;
        this.c = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr;
        boolean z10;
        int i10 = this.f29168a;
        Object obj = this.c;
        Object obj2 = this.f29169b;
        Object obj3 = this.f29170d;
        switch (i10) {
            case 0:
                C1761p5.e((C1761p5) obj3, (String) obj2, (String) obj);
                return;
            case 1:
                FlutterAppApi flutterAppApi = (FlutterAppApi) obj3;
                String str = (String) obj2;
                String str2 = (String) obj;
                tf.c<gf.j> cVar = FlutterAppApi.c;
                kotlin.jvm.internal.g.e(flutterAppApi, ea.a.p("R2gic1cw", "SH0G91gq"));
                kotlin.jvm.internal.g.e(str, ea.a.p("F3QycGU=", "JXIneL52"));
                kotlin.jvm.internal.g.e(str2, ea.a.p("F2E5Zw==", "A4haFJLS"));
                try {
                    new gf.b(flutterAppApi.f15734a, ea.a.p("V2U9LhVsF3QGZUYuGWkxZStuHEYqdTd0F3IscCNBAmkdcy5uF0UadABhcGEdYQ==", "rmSr97yx"), FlutterAppApi.a.a(), null).a(ge.a.I(str, str2), new ha.n(8));
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            case 2:
                lib.zj.pdfeditor.p pVar = (lib.zj.pdfeditor.p) obj3;
                PDFFreeTextEditView pDFFreeTextEditView = (PDFFreeTextEditView) obj2;
                lj.b bVar = (lj.b) obj;
                pVar.getClass();
                if (pDFFreeTextEditView.isAttachedToWindow() && pDFFreeTextEditView.getVisibility() == 0 && pDFFreeTextEditView.f21608b0) {
                    pVar.c.getLocationOnScreen(new int[2]);
                    RectF frame = pDFFreeTextEditView.getFrame();
                    frame.offset(iArr[0], iArr[1]);
                    p.a aVar = new p.a(pDFFreeTextEditView);
                    i2 i2Var = (i2) bVar;
                    i2Var.getClass();
                    o9.d.s(ea.a.p("UmQvVBZ4FlAdcGBhZw==", "NjSvxLmC"), ea.a.p("b3NZbw5FU2kuQS5kIWUQdGVvHiBlcgBjOkYg", "OPtzNAJz") + frame);
                    ReaderPreviewActivity readerPreviewActivity = i2Var.f5074a;
                    readerPreviewActivity.N4 = aVar;
                    ReaderPreviewActivity.n2(readerPreviewActivity, frame);
                    return;
                }
                return;
            case 3:
                km.a aVar2 = (km.a) obj3;
                km.a aVar3 = (km.a) obj2;
                final cg.l lVar = (cg.l) obj;
                AIDataBase aIDataBase = km.e.f19907a;
                kotlin.jvm.internal.g.e(aVar3, ea.a.p("a2lfZm8=", "lpUlOPGo"));
                km.c cVar2 = (km.c) km.e.f19907a.k();
                RoomDatabase roomDatabase = cVar2.f19897a;
                roomDatabase.c();
                try {
                    final long c = androidx.activity.f.c(cVar2, aVar2, aVar3);
                    roomDatabase.j();
                    roomDatabase.g();
                    pdf.pdfreader.viewer.editor.free.utils.w0.a().f28791b.execute(new Runnable() { // from class: km.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            l lVar2 = lVar;
                            if (lVar2 != null) {
                                lVar2.invoke(Long.valueOf(c));
                            }
                        }
                    });
                    return;
                } catch (Throwable th2) {
                    roomDatabase.g();
                    throw th2;
                }
            case 4:
                AIChatActivity.h2((String) obj2, (km.a) obj, (AIChatActivity) obj3);
                return;
            case 5:
                BasePdf2ImageActivity basePdf2ImageActivity = (BasePdf2ImageActivity) obj3;
                List list = (List) obj2;
                Exception exc = (Exception) obj;
                kotlin.jvm.internal.g.e(basePdf2ImageActivity, ea.a.p("A2hecxAw", "gxw744Dl"));
                if (pdf.pdfreader.viewer.editor.free.utils.extension.a.b(basePdf2ImageActivity)) {
                    if (!basePdf2ImageActivity.G2()) {
                        androidx.lifecycle.w<ArrayList<bn.a>> wVar = en.a.f16815a;
                        en.a.f16820g.j(Boolean.FALSE);
                        return;
                    }
                    return;
                }
                List list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    basePdf2ImageActivity.T2(true, exc);
                } else {
                    String string = basePdf2ImageActivity.getString(R.string.arg_res_0x7f1303e5);
                    kotlin.jvm.internal.g.d(string, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHHIjYSdlQl86YT9lB3NGYyhlAHMEdR5sTSk=", "0IIXQHY4"));
                    String str3 = BasePdf2ImageActivity.f25476k0;
                    pdf.pdfreader.viewer.editor.free.utils.j1.c(R.drawable.ic_copy_success, basePdf2ImageActivity.getResources().getDimensionPixelSize(R.dimen.dp_100), basePdf2ImageActivity, string, false);
                    BasePdf2ImageActivity.n2(basePdf2ImageActivity);
                }
                if (basePdf2ImageActivity.G2()) {
                    basePdf2ImageActivity.B2();
                    tn.a.d(basePdf2ImageActivity, ea.a.p("IG8_dhRydA==", "IwCQqDwu"), ea.a.p("QzIiYxxuFGUAdGtzCHYzXzd1UWMjc3M=", "UIG09xYA"), basePdf2ImageActivity.r2(), false);
                    basePdf2ImageActivity.N = false;
                    return;
                }
                androidx.lifecycle.w<ArrayList<bn.a>> wVar2 = en.a.f16815a;
                en.a.f16820g.j(Boolean.FALSE);
                Pdf2ImageConvertCompletedView t22 = basePdf2ImageActivity.t2();
                if (t22 != null) {
                    t22.e();
                    return;
                }
                return;
            case 6:
                WeakReference weakReference = (WeakReference) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                RecentAddedActivity.a aVar4 = RecentAddedActivity.f26850l0;
                kotlin.jvm.internal.g.e(weakReference, ea.a.p("a3dUYRJDWG4uZTJ0", "niOw6Nrl"));
                kotlin.jvm.internal.g.e(arrayList, ea.a.p("F24uZRdQA3MBd1tyDUU4dC10eQ==", "VvjeERaC"));
                kotlin.jvm.internal.g.e(arrayList2, ea.a.p("a3RUbXA=", "OewPXFFt"));
                Object obj4 = weakReference.get();
                kotlin.jvm.internal.g.b(obj4);
                new DecryptAndCopyUIHelper((Context) obj4, arrayList, new RecentAddedActivity.g(weakReference, arrayList2)).g();
                return;
            case 7:
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) obj2;
                Set set = (Set) obj;
                FasterFileUtil fasterFileUtil = FasterFileUtil.f28517a;
                kotlin.jvm.internal.g.e(concurrentLinkedQueue, ea.a.p("a2RYcih1UnVl", "mz4FJxOJ"));
                kotlin.jvm.internal.g.e(set, ea.a.p("Z3AsdD5TF3Q=", "3tCMVrAH"));
                File[] listFiles = ((File) obj3).listFiles(new pdf.pdfreader.viewer.editor.free.utils.o());
                if (listFiles != null) {
                    for (File file : listFiles) {
                        if (file.isDirectory()) {
                            String name = file.getName();
                            kotlin.jvm.internal.g.d(name, ea.a.p("VWknZV1uA21l", "JimLoWa5"));
                            if (!kotlin.text.j.M(name, ea.a.p("Lg==", "Z4RMymfa"), false)) {
                                if (!kotlin.collections.f.w(file.getName(), FasterFileUtil.f28518b) && !kotlin.jvm.internal.g.a(file.getName(), ea.a.p("FWRRLkNkD3ItYQJlRi4haV13N3JnZVJpAG8DLjdyJ2U=", "HQe73il1"))) {
                                    concurrentLinkedQueue.offer(file);
                                }
                            }
                        } else {
                            ea.a.p("KWldZQ==", "bCgxZrRp");
                            if (com.google.android.play.core.assetpacks.b1.N(file) || com.google.android.play.core.assetpacks.b1.Q(file) || com.google.android.play.core.assetpacks.b1.M(file) || com.google.android.play.core.assetpacks.b1.O(file)) {
                                String absolutePath = file.getAbsolutePath();
                                kotlin.jvm.internal.g.d(absolutePath, ea.a.p("KWldZVdhVXM1bD90EFAJdGg=", "lv4Vorck"));
                                set.add(absolutePath);
                            }
                        }
                    }
                }
                FasterFileUtil.c.getAndDecrement();
                return;
            default:
                GetPDFPasswordProcess getPDFPasswordProcess = (GetPDFPasswordProcess) obj3;
                String str4 = (String) obj2;
                pdf.pdfreader.viewer.editor.free.utils.x xVar = (pdf.pdfreader.viewer.editor.free.utils.x) obj;
                kotlin.jvm.internal.g.e(getPDFPasswordProcess, ea.a.p("O2hYc10w", "tjGTvn41"));
                tf.c cVar3 = getPDFPasswordProcess.c;
                kotlin.jvm.internal.g.e(str4, ea.a.p("F3AqdGg=", "CSipWjZz"));
                kotlin.jvm.internal.g.e(xVar, ea.a.p("F2wicwdlDGVy", "QNn0IASv"));
                try {
                    ReaderPDFCore readerPDFCore = new ReaderPDFCore(getPDFPasswordProcess.f28521a, str4);
                    getPDFPasswordProcess.f28523d = readerPDFCore;
                    ((Handler) cVar3.getValue()).post(new a7.a(5, xVar, readerPDFCore, getPDFPasswordProcess, str4));
                    return;
                } catch (Exception unused) {
                    ((Handler) cVar3.getValue()).post(new l1.a(24, xVar, getPDFPasswordProcess));
                    return;
                }
        }
    }
}
