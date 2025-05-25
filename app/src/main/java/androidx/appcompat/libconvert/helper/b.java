package androidx.appcompat.libconvert.helper;

import android.content.Intent;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import cg.l;
import com.facebook.FacebookException;
import com.facebook.internal.FeatureManager;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.abt.AbtException;
import com.lib.flutter.encrypt.NativeAppGlobalApi;
import d7.a;
import gf.b;
import io.flutter.plugins.pathprovider.Messages;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.g;
import lib.zj.pdfeditor.PDFPageView;
import lib.zj.pdfeditor.PDFReaderView;
import lib.zj.pdfeditor.text.editor.EditorView;
import lib.zj.pdfeditor.text.editor.TextEditorState;
import lib.zj.pdfeditor.x;
import ma.j0;
import mj.b0;
import mj.h;
import org.json.JSONArray;
import org.json.JSONException;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.LanguageChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.PreInstallOpenAdActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderSearchActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.f;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.BaseOperatePDFActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenClearDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PreviewAddTextDialog;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment;
import pdf.pdfreader.viewer.editor.free.utils.extension.e;
import ro.c;
import ro.d;
import x0.s0;
import x0.u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements OnSuccessListener, FeatureManager.a, a.InterfaceC0194a, Continuation, b.c, x, u, androidx.activity.result.b, d, ro.b, e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1954a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1955b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f1954a = i10;
        this.f1955b = obj;
    }

    @Override // androidx.activity.result.b
    public final void c(Object obj) {
        int i10 = this.f1954a;
        Object obj2 = this.f1955b;
        switch (i10) {
            case 12:
                ReaderHomeActivity.c2((ReaderHomeActivity) obj2, (Map) obj);
                return;
            case 13:
            default:
                ReaderImg2PDFChooseActivity.m2((ReaderImg2PDFChooseActivity) obj2, (Map) obj);
                return;
            case 14:
                BaseOperatePDFActivity baseOperatePDFActivity = (BaseOperatePDFActivity) obj2;
                Intent intent = (Intent) obj;
                int i11 = BaseOperatePDFActivity.Z;
                g.e(baseOperatePDFActivity, ea.a.p("O2hYc10w", "UTwuwLEr"));
                if (intent != null) {
                    pdf.pdfreader.viewer.editor.free.utils.g.a(baseOperatePDFActivity, intent, new BaseOperatePDFActivity.c());
                    return;
                }
                return;
        }
    }

    @Override // ro.b
    public final void d(Object obj, Object obj2) {
        DebugPageAndDialogFragment debugPageAndDialogFragment = (DebugPageAndDialogFragment) this.f1955b;
        int i10 = DebugPageAndDialogFragment.f27860g0;
        g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "Z3aUC0VK"));
        Toast.makeText(debugPageAndDialogFragment.g0(), String.valueOf((Boolean) obj), 0).show();
        ((PdfReaderOpenClearDialog) obj2).dismiss();
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.extension.e
    public final void e(Object obj) {
        pdf.pdfreader.viewer.editor.free.ui.frag.a aVar = (pdf.pdfreader.viewer.editor.free.ui.frag.a) this.f1955b;
        List list = (List) obj;
        c cVar = pdf.pdfreader.viewer.editor.free.ui.frag.a.f27997y0;
        aVar.getClass();
        if (list != null) {
            aVar.K0(ea.a.p("ZE8ZRA==", "LIIxbSjc"));
        }
    }

    @Override // lib.zj.pdfeditor.x
    public final void f(PDFReaderView pDFReaderView) {
        PDFPageView pDFPageView = (PDFPageView) this.f1955b;
        int i10 = PDFPageView.f21175y1;
        pDFPageView.getClass();
        h textEditorFocusInfo = pDFReaderView.getTextEditorFocusInfo();
        if (textEditorFocusInfo != null) {
            if (textEditorFocusInfo.f22083a == pDFPageView.c && pDFReaderView.F0 == PDFReaderView.Mode.Editor) {
                pDFReaderView.M1 = null;
                pDFReaderView.L1 = null;
                b0 b0Var = pDFReaderView.f21235k2;
                if (b0Var != null) {
                    b0Var.s(TextEditorState.NONE);
                }
                EditorView editorView = pDFReaderView.f21237l2;
                if (editorView != null) {
                    editorView.d();
                    pDFReaderView.f21237l2.c();
                }
            }
        }
    }

    @Override // ro.d
    public final void g(MotionEvent motionEvent) {
        boolean z10;
        pdf.pdfreader.viewer.editor.free.ui.dialog.a aVar;
        ViewGroup viewGroup;
        int i10 = this.f1954a;
        Object obj = this.f1955b;
        switch (i10) {
            case 13:
                ReaderSearchActivity readerSearchActivity = (ReaderSearchActivity) obj;
                String str = ReaderSearchActivity.f26794c0;
                readerSearchActivity.getClass();
                if (motionEvent != null && motionEvent.getActionMasked() == 0) {
                    try {
                        readerSearchActivity.e2();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                PreviewAddTextDialog previewAddTextDialog = (PreviewAddTextDialog) obj;
                int i11 = PreviewAddTextDialog.f27451o;
                g.e(previewAddTextDialog, ea.a.p("R2gic1cw", "b0P7vjyI"));
                View view = previewAddTextDialog.f27452d;
                if (view != null && view.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && (aVar = previewAddTextDialog.f27457i) != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    g.d(obtain, ea.a.p("IGJFYRBuH2kuKQ==", "ykpwCAK2"));
                    ReaderPreviewActivity readerPreviewActivity = (ReaderPreviewActivity) aVar;
                    if (!readerPreviewActivity.isFinishing() && (viewGroup = readerPreviewActivity.U3) != null) {
                        viewGroup.dispatchTouchEvent(obtain);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.facebook.internal.FeatureManager.a
    public final void k(boolean z10) {
        boolean z11;
        String str = (String) this.f1955b;
        FacebookException.a aVar = FacebookException.Companion;
        if (z10) {
            try {
                l6.a aVar2 = new l6.a(str);
                if (aVar2.f20518b != null && aVar2.c != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    h6.d.g(aVar2.f20517a, aVar2.toString());
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // d7.a.InterfaceC0194a
    public final Object l() {
        return ((c7.c) this.f1955b).c();
    }

    @Override // x0.u
    public final s0 m(View view, s0 s0Var) {
        int i10 = this.f1954a;
        Object obj = this.f1955b;
        switch (i10) {
            case 10:
                LanguageChooseActivity languageChooseActivity = (LanguageChooseActivity) obj;
                int i11 = LanguageChooseActivity.H;
                g.e(languageChooseActivity, ea.a.p("R2gic1cw", "Lr65rKTG"));
                g.e(view, ea.a.p("D2Elbx15D28HcxRwCHI3bSF0V3JmMD4=", "0TwgUfK3"));
                ea.a.p("Jm5CZQ1z", "gVBWn8GV");
                o0.b a10 = s0Var.a(7);
                g.d(a10, ea.a.p("Jm5CZQ1zGWc_dANuBmUccx1XB24hbxJJuoDfQz9tFGE7LmV5CWUZcyNzPmUYQglyRihHKQ==", "FCbfXyPd"));
                o0.b a11 = s0Var.a(2);
                g.d(a11, ea.a.p("Wm44ZQdzTGcXdH1uGmUic2xXW24ibzRJgYDhYRcuGXlDZWVuEnYLZxN0XW8HQjdyNygbKQ==", "cGcM0ioJ"));
                boolean hasWindowFocus = languageChooseActivity.hasWindowFocus();
                int i12 = a10.f22640b;
                if ((hasWindowFocus || i12 != 0) && !languageChooseActivity.e2().d()) {
                    boolean z10 = languageChooseActivity.f19294h;
                    int i13 = a10.f22641d;
                    int i14 = a10.c;
                    int i15 = a10.f22639a;
                    if (!z10) {
                        languageChooseActivity.b2().f941b.setPadding(i15, i12, i14, i13);
                    } else {
                        languageChooseActivity.b2().f941b.setPadding(i15 - a11.f22639a, i12 - a11.f22640b, i14 - a11.c, i13 - a11.f22641d);
                    }
                    ((Handler) languageChooseActivity.f26614y.getValue()).post(new f(languageChooseActivity, 1));
                }
                return s0Var;
            default:
                PreInstallOpenAdActivity preInstallOpenAdActivity = (PreInstallOpenAdActivity) obj;
                int i16 = PreInstallOpenAdActivity.f26628u;
                g.e(preInstallOpenAdActivity, ea.a.p("O2hYc10w", "Nf3rffgv"));
                g.e(view, ea.a.p("D2Elbx15D28HcxRwCHI3bSF0V3JmMD4=", "GKrn5jkB"));
                ea.a.p("Jm5CZQ1z", "AiGQAMZL");
                o0.b a12 = s0Var.a(7);
                g.d(a12, ea.a.p("A25BZUNzVmctdC9uR2UjcxBXO24tb0FJloDXQz5tMmEeLmZ5R2VWczFzEmVZQjZySyh7KQ==", "oVj27xxc"));
                preInstallOpenAdActivity.a2().f1351b.setPadding(0, a12.f22640b, 0, a12.f22641d);
                return s0Var;
        }
    }

    @Override // gf.b.c
    public final void n(Object obj, gf.a aVar) {
        Object h10;
        int i10 = this.f1954a;
        Object obj2 = this.f1955b;
        switch (i10) {
            case 7:
                NativeAppGlobalApi nativeAppGlobalApi = (NativeAppGlobalApi) obj2;
                NativeAppGlobalApi.Companion companion = NativeAppGlobalApi.Companion.f15737a;
                ea.a.p("PWVBbHk=", "kgFwKiVK");
                g.c(obj, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuFW5jbjxsOyA7eUFlWWtYdDZpJC4WbwRsUGMaaSpuFi42aT10dWs4dCNpXy44bk4_Pg==", "A6RFzNIW"));
                Object obj3 = ((List) obj).get(0);
                g.c(obj3, ea.a.p("X3UFbBRjK24mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiBFeRllFGsldCRpCC5ndCVpVmc=", "PF1i4Jm9"));
                try {
                    h10 = ge.a.H(Boolean.valueOf(nativeAppGlobalApi.c((String) obj3)));
                } catch (Throwable th2) {
                    h10 = b.b.h(th2);
                }
                aVar.i(h10);
                return;
            default:
                Messages.a aVar2 = (Messages.a) obj2;
                ArrayList<Object> arrayList = new ArrayList<>();
                try {
                    arrayList.add(0, ((io.flutter.plugins.pathprovider.a) aVar2).f18831a.getCacheDir().getPath());
                } catch (Throwable th3) {
                    arrayList = Messages.a(th3);
                }
                aVar.i(arrayList);
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        l tmp0 = (l) this.f1955b;
        g.e(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        boolean z10;
        switch (this.f1954a) {
            case 4:
                ExecutorService executorService = j0.f21911a;
                ((CountDownLatch) this.f1955b).countDown();
                return null;
            default:
                mb.e eVar = (mb.e) this.f1955b;
                eVar.getClass();
                if (task.o()) {
                    nb.d dVar = eVar.f21966d;
                    synchronized (dVar) {
                        dVar.c = Tasks.e(null);
                    }
                    dVar.f22412b.a();
                    if (task.k() != null) {
                        JSONArray jSONArray = ((nb.e) task.k()).f22417d;
                        aa.b bVar = eVar.f21965b;
                        if (bVar != null) {
                            try {
                                bVar.c(mb.e.f(jSONArray));
                            } catch (AbtException | JSONException unused) {
                            }
                        }
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }
}
