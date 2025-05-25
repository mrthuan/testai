package com.google.android.tools;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.w;
import c7.p;
import cg.l;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.search.SearchBar;
import com.google.firebase.messaging.c;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.lib.flutter.encrypt.FlutterAppApi;
import com.lib.flutter.encrypt.NativeAppGlobalApi;
import gf.b;
import io.flutter.plugins.pathprovider.Messages;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import lib.zj.pdfeditor.PDFPageView;
import lib.zj.pdfeditor.PDFReaderView;
import lib.zj.pdfeditor.ReaderPDFCore;
import lib.zj.pdfeditor.text.editor.TextEditorState;
import lib.zj.pdfeditor.x;
import ma.j0;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRResultActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.ui.activity.ReaderConvertPreviewActivity;
import pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.c;
import pdf.pdfreader.viewer.editor.free.ui.dialog.x;
import pdf.pdfreader.viewer.editor.free.ui.frag.SettingFragment;
import x0.s0;
import x0.u;
import y0.j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements OnCompleteListener, p.a, j, y0.d, la.b, Continuation, SuccessContinuation, b.d, b.c, x, u, x.a, androidx.activity.result.b, ro.a, pdf.pdfreader.viewer.editor.free.utils.extension.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13484a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f13485b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f13484a = i10;
        this.f13485b = obj;
    }

    @Override // y0.j
    public boolean a(View view) {
        int i10 = BottomSheetDragHandleView.f12157m;
        return ((BottomSheetDragHandleView) this.f13485b).c();
    }

    @Override // c7.p.a
    public Object apply(Object obj) {
        p pVar = (p) this.f13485b;
        Cursor cursor = (Cursor) obj;
        s6.b bVar = p.f5653f;
        pVar.getClass();
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(0);
            pVar.d(i10, LogEventDropped.Reason.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    @Override // la.b
    public void b(la.a aVar) {
        ia.a aVar2 = (ia.a) this.f13485b;
        synchronized (aVar2) {
            if (aVar2.f18477b instanceof la.c) {
                aVar2.c.add(aVar);
            }
            aVar2.f18477b.b(aVar);
        }
    }

    @Override // androidx.activity.result.b
    public void c(Object obj) {
        Context r4;
        int i10 = this.f13484a;
        Object obj2 = this.f13485b;
        switch (i10) {
            case 17:
                ReaderHomeActivity.a2((ReaderHomeActivity) obj2, (Map) obj);
                return;
            default:
                SettingFragment settingFragment = (SettingFragment) obj2;
                Intent intent = (Intent) obj;
                SettingFragment.a aVar = SettingFragment.f27957u0;
                kotlin.jvm.internal.g.e(settingFragment, ea.a.p("O2hYc10w", "iKLmtDtL"));
                if (intent != null && (r4 = settingFragment.r()) != null) {
                    pdf.pdfreader.viewer.editor.free.utils.g.a(r4, intent, new SettingFragment.b(settingFragment, r4));
                    return;
                }
                return;
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.x.a
    public void d() {
        ReaderConvertPreviewActivity readerConvertPreviewActivity = (ReaderConvertPreviewActivity) this.f13485b;
        int i10 = ReaderConvertPreviewActivity.R1;
        kotlin.jvm.internal.g.e(readerConvertPreviewActivity, ea.a.p("O2hYc10w", "B4p8Dyb2"));
        pdf.pdfreader.viewer.editor.free.utils.p.j(readerConvertPreviewActivity, readerConvertPreviewActivity.R2().concat("_space"));
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.extension.e
    public void e(Object obj) {
        pdf.pdfreader.viewer.editor.free.ui.frag.a aVar = (pdf.pdfreader.viewer.editor.free.ui.frag.a) this.f13485b;
        List list = (List) obj;
        ro.c cVar = pdf.pdfreader.viewer.editor.free.ui.frag.a.f27997y0;
        aVar.getClass();
        if (list != null) {
            aVar.K0(ea.a.p("ClhyRUw=", "zRZiNVQo"));
        }
    }

    @Override // lib.zj.pdfeditor.x
    public void f(PDFReaderView pDFReaderView) {
        int i10 = this.f13484a;
        Object obj = this.f13485b;
        switch (i10) {
            case 11:
                int i11 = PDFPageView.f21175y1;
                pDFReaderView.s((TextEditorState) obj);
                return;
            case 12:
                RectF rectF = (RectF) obj;
                int i12 = PDFPageView.f21175y1;
                if (pDFReaderView.L1 != null) {
                    Objects.toString(rectF);
                    mj.h hVar = pDFReaderView.L1;
                    RectF rectF2 = hVar.f22085d;
                    if (rectF2 != null) {
                        rectF2.setEmpty();
                    }
                    RectF rectF3 = hVar.f22086e;
                    if (rectF3 != null) {
                        rectF3.setEmpty();
                    }
                    if (hVar.c == null) {
                        hVar.c = new RectF();
                    }
                    hVar.c.set(rectF);
                    return;
                }
                return;
            default:
                int i13 = PDFPageView.f21175y1;
                pDFReaderView.c((ReaderPDFCore.SelectInfo) obj);
                return;
        }
    }

    @Override // gf.b.d
    public void i(Object obj) {
        l lVar = (l) this.f13485b;
        tf.c<gf.j> cVar = FlutterAppApi.c;
        kotlin.jvm.internal.g.e(lVar, ea.a.p("bGMEbC1iFWNr", "UyHeAt97"));
        kotlin.jvm.internal.g.c(obj, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuDm5gbhdsAyBHeTtlU2sNdB5pWi46dCRpKmc=", "aMboOi5o"));
        lVar.invoke((String) obj);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task j(Object obj) {
        nb.e eVar = (nb.e) obj;
        int[] iArr = ConfigFetchHandler.f13694k;
        return Tasks.e((ConfigFetchHandler.a) this.f13485b);
    }

    @Override // x0.u
    public s0 m(View view, s0 s0Var) {
        int i10;
        int i11 = this.f13484a;
        Object obj = this.f13485b;
        switch (i11) {
            case 14:
                OCRResultActivity oCRResultActivity = (OCRResultActivity) obj;
                OCRResultActivity.a aVar = OCRResultActivity.f25101x;
                kotlin.jvm.internal.g.e(oCRResultActivity, ea.a.p("O2hYc10w", "TjnkGmFG"));
                kotlin.jvm.internal.g.e(view, ea.a.p("dg==", "aMlzrhEP"));
                ea.a.p("Wm44ZQdz", "GimtTM3S");
                if (oCRResultActivity.hasWindowFocus() || view.getPaddingBottom() == 0) {
                    o0.b a10 = s0Var.a(7);
                    kotlin.jvm.internal.g.d(a10, ea.a.p("Jm5CZQ1zGWc_dANuBmUccx1XB24hbxJJpoCUQyltNWE7LmV5CWUZcyNzPmUYQglyRihHKQ==", "l2NvD2FE"));
                    if (oCRResultActivity.f19294h) {
                        i10 = 0;
                    } else {
                        i10 = a10.f22641d;
                    }
                    view.setPadding(a10.f22639a, 0, a10.c, i10);
                }
                return s0Var;
            default:
                Word2PDFConvertActivity word2PDFConvertActivity = (Word2PDFConvertActivity) obj;
                Word2PDFConvertActivity.a aVar2 = Word2PDFConvertActivity.f26020p1;
                kotlin.jvm.internal.g.e(word2PDFConvertActivity, ea.a.p("O2hYc10w", "YFQx4fKV"));
                kotlin.jvm.internal.g.e(view, ea.a.p("c2Ffbxd5Wm8vc2pwFHIJbVB0C3JlMD4=", "b8u26vvU"));
                ea.a.p("Wm44ZQdz", "C2i9cafl");
                o0.b a11 = s0Var.a(7);
                kotlin.jvm.internal.g.d(a11, ea.a.p("Wm44ZQdzTGcXdH1uGmUic2xXW24ibzRJlYDIQw5tHWFHLh95A2VMcwtzQGUEQjdyNygbKQ==", "wnamSIcl"));
                boolean z10 = word2PDFConvertActivity.f26049u0;
                int i12 = a11.f22640b;
                if ((z10 || i12 != 0) && word2PDFConvertActivity.H0) {
                    FrameLayout frameLayout = word2PDFConvertActivity.T;
                    if (frameLayout != null) {
                        if (i12 <= 0) {
                            i12 = frameLayout.getPaddingTop();
                        }
                        int i13 = a11.f22641d;
                        if (i13 <= 0) {
                            FrameLayout frameLayout2 = word2PDFConvertActivity.T;
                            if (frameLayout2 != null) {
                                i13 = frameLayout2.getPaddingBottom();
                            } else {
                                kotlin.jvm.internal.g.i(ea.a.p("FHAEYRRoOm8ndA==", "Fmghghx9"));
                                throw null;
                            }
                        }
                        frameLayout.setPadding(0, i12, 0, i13);
                    } else {
                        kotlin.jvm.internal.g.i(ea.a.p("QHAnYQBoMG8ddA==", "RidYfTO0"));
                        throw null;
                    }
                }
                return s0Var;
        }
    }

    @Override // gf.b.c
    public void n(Object obj, gf.a aVar) {
        Object h10;
        int i10 = this.f13484a;
        Object obj2 = this.f13485b;
        switch (i10) {
            case 9:
                NativeAppGlobalApi nativeAppGlobalApi = (NativeAppGlobalApi) obj2;
                NativeAppGlobalApi.Companion companion = NativeAppGlobalApi.Companion.f15737a;
                ea.a.p("PWVBbHk=", "cKLzFFtA");
                kotlin.jvm.internal.g.c(obj, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuB257bhRsPSBHeTtlU2sNdB5pWi4KbzpsIWNGaSluMC4kaSV0XWs-dF9pJS4ybhs_Pg==", "hVaQX57D"));
                Object obj3 = ((List) obj).get(0);
                kotlin.jvm.internal.g.c(obj3, ea.a.p("J3VebFFjNm4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiA9eUJlUWs4dCRpCC5ndCVpVmc=", "LJI2qWvJ"));
                try {
                    nativeAppGlobalApi.f((String) obj3);
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
                    File filesDir = context.getFilesDir();
                    if (filesDir == null) {
                        filesDir = new File(p001if.a.a(context), "files");
                    }
                    arrayList.add(0, filesDir.getPath());
                } catch (Throwable th3) {
                    arrayList = Messages.a(th3);
                }
                aVar.i(arrayList);
                return;
        }
    }

    @Override // ro.a
    public void o(Object obj) {
        pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.j jVar = (pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.j) this.f13485b;
        Boolean bool = (Boolean) obj;
        int i10 = pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.j.f27694f;
        kotlin.jvm.internal.g.e(jVar, ea.a.p("R2gic1cw", "TVe3RMaJ"));
        jVar.f27696e = null;
        jVar.f28987b = Boolean.FALSE;
        w<po.b> wVar = pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.c.f27668m;
        c.a.a(jVar);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task it) {
        int i10 = this.f13484a;
        Object obj = this.f13485b;
        switch (i10) {
            case 0:
                l callback = (l) obj;
                kotlin.jvm.internal.g.e(callback, "$callback");
                kotlin.jvm.internal.g.e(it, "it");
                if (it.o()) {
                    String str = (String) it.k();
                    if (str == null) {
                        str = "";
                    }
                    callback.invoke(str);
                    return;
                }
                return;
            default:
                int i11 = com.google.firebase.messaging.b.f13664b;
                ((c.a) obj).f13672b.d(null);
                return;
        }
    }

    @Override // y0.d
    public void onTouchExplorationStateChanged(boolean z10) {
        int i10 = SearchBar.f12789m0;
        ((SearchBar) this.f13485b).setFocusableInTouchMode(z10);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f13485b;
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
