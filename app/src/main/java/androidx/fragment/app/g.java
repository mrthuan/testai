package androidx.fragment.app;

import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.j;
import androidx.viewpager2.widget.ViewPager2;
import androidx.window.layout.SidecarWindowBackend;
import androidx.window.layout.WindowLayoutInfo;
import ao.d2;
import com.facebook.e;
import com.facebook.h;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.media.AbstractC1692k3;
import com.inmobi.media.AbstractC1846w0;
import com.inmobi.media.C1662i1;
import com.inmobi.media.C1820u0;
import com.inmobi.media.Kb;
import ha.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import jm.c;
import lib.zj.pdfeditor.ReaderPDFCore;
import lib.zj.pdfeditor.text.editor.EditorView;
import lib.zj.pdfeditor.text.editor.TextEditorState;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.OfficeAIReaderActivity;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.PdfReaderAppWidgetNewDialog;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.PDF2WordHelper;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.ui.activity.ReaderConvertPreviewActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.Pdf2WordConvertCompletedView;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergePdfActivity;
import pdf.pdfreader.viewer.editor.free.utils.event.PDF2WordEventCenter;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3774a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3775b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(int i10, Object obj, Object obj2) {
        this.f3774a = i10;
        this.f3775b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mj.e eVar;
        int i10;
        int dimensionPixelSize;
        switch (this.f3774a) {
            case 0:
                j.c transitionInfo = (j.c) this.f3775b;
                SpecialEffectsController.Operation operation = (SpecialEffectsController.Operation) this.c;
                kotlin.jvm.internal.g.e(transitionInfo, "$transitionInfo");
                kotlin.jvm.internal.g.e(operation, "$operation");
                transitionInfo.a();
                if (g0.J(2)) {
                    operation.toString();
                    return;
                }
                return;
            case 1:
            default:
                ReaderMergePdfActivity.b.c((ReaderMergePdfActivity) this.f3775b, (List) this.c);
                return;
            case 2:
                SidecarWindowBackend.WindowLayoutChangeCallbackWrapper.a((SidecarWindowBackend.WindowLayoutChangeCallbackWrapper) this.f3775b, (WindowLayoutInfo) this.c);
                return;
            case 3:
                ArrayList callbacks = (ArrayList) this.f3775b;
                com.facebook.h requests = (com.facebook.h) this.c;
                kotlin.jvm.internal.g.e(callbacks, "$callbacks");
                kotlin.jvm.internal.g.e(requests, "$requests");
                Iterator it = callbacks.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    Object obj = pair.second;
                    kotlin.jvm.internal.g.d(obj, "pair.second");
                    ((e.b) pair.first).b((com.facebook.i) obj);
                }
                Iterator it2 = requests.f9725d.iterator();
                while (it2.hasNext()) {
                    ((h.a) it2.next()).b(requests);
                }
                return;
            case 4:
                Runnable runnable = (Runnable) this.f3775b;
                h.b bVar = (h.b) this.c;
                try {
                    runnable.run();
                    ha.h.this.h(null);
                    return;
                } catch (Exception e10) {
                    ha.h.this.i(e10);
                    return;
                }
            case 5:
                jb.n nVar = (jb.n) this.f3775b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                nVar.getClass();
                try {
                    taskCompletionSource.b(nVar.a());
                    return;
                } catch (Exception e11) {
                    taskCompletionSource.a(e11);
                    return;
                }
            case 6:
                InMobiBanner.a((InMobiBanner) this.f3775b, (cg.a) this.c);
                return;
            case 7:
                Kb.a((Kb) this.f3775b, (byte[]) this.c);
                return;
            case 8:
                C1662i1.b((C1662i1) this.f3775b, (AdMetaInfo) this.c);
                return;
            case 9:
                AbstractC1692k3.b((WindowInsets) this.f3775b, (Context) this.c);
                return;
            case 10:
                C1820u0.a((AbstractC1846w0) this.f3775b, (WeakReference) this.c);
                return;
            case 11:
                lib.zj.pdfeditor.text.editor.a aVar = (lib.zj.pdfeditor.text.editor.a) this.f3775b;
                ReaderPDFCore.SelectInfo selectInfo = (ReaderPDFCore.SelectInfo) this.c;
                if (selectInfo != null) {
                    aVar.f21700r = selectInfo;
                    aVar.m();
                    return;
                }
                aVar.getClass();
                return;
            case 12:
                mj.o oVar = (mj.o) this.f3775b;
                ArrayList<mj.e> arrayList = (ArrayList) this.c;
                oVar.f22124d.A();
                oVar.f22124d.D();
                oVar.f22124d.E();
                oVar.f22124d.F();
                oVar.f22124d.g(TextEditorState.NONE);
                oVar.f22124d.f21697o = arrayList;
                if (!arrayList.isEmpty() && (eVar = (mj.e) androidx.appcompat.view.menu.d.b(arrayList, 1)) != null) {
                    lib.zj.pdfeditor.text.editor.a aVar2 = oVar.f22124d;
                    aVar2.f21706x = true;
                    eVar.c = true;
                    if (aVar2.f21680b == TextEditorState.ADJUST_TEXT_BLOCK) {
                        oVar.f22124d.D();
                    } else if (oVar.f22124d.f21680b == TextEditorState.EDIT_TEXT || oVar.f22124d.f21680b == TextEditorState.SELECT_TEXT) {
                        oVar.f22124d.A();
                        oVar.f22124d.F();
                        EditorView editorView = oVar.f22124d.f21687f.getEditorView();
                        if (editorView != null) {
                            editorView.c();
                        }
                    }
                    oVar.f22124d.I(eVar);
                    oVar.f22124d.g(TextEditorState.ADJUST_IMAGE);
                }
                oVar.f22124d.f21687f.invalidate();
                return;
            case 13:
                mj.x xVar = (mj.x) this.f3775b;
                xVar.c.f21695m = (ArrayList) this.c;
                xVar.c.f21687f.invalidate();
                return;
            case 14:
                wl.e eVar2 = (wl.e) this.f3775b;
                Throwable th2 = (Throwable) this.c;
                kotlin.jvm.internal.g.e(eVar2, ea.a.p("R2gic1cw", "jXZ0zdAN"));
                kotlin.jvm.internal.g.e(th2, ea.a.p("F3Qjchx3A2IeZQ==", "3Cy6sxS4"));
                wl.a aVar3 = eVar2.f31369f;
                if (aVar3 != null) {
                    aVar3.k1(th2);
                }
                eVar2.f31369f = null;
                return;
            case 15:
                FileRepository.a((pdf.pdfreader.viewer.editor.free.data.c) this.c, (List) this.f3775b);
                return;
            case 16:
                AIChatActivity aIChatActivity = (AIChatActivity) this.f3775b;
                km.a aVar4 = (km.a) this.c;
                AIChatActivity.a aVar5 = AIChatActivity.f24356v0;
                kotlin.jvm.internal.g.e(aIChatActivity, ea.a.p("TWgfc1ww", "f49vxB1R"));
                kotlin.jvm.internal.g.e(aVar4, ea.a.p("a2lFZW0=", "bsJi3Lfp"));
                if (!aIChatActivity.isFinishing()) {
                    aVar4.f19895y = true;
                    ArrayList arrayList2 = jm.c.f19315a;
                    c.a.c(aVar4);
                    c.a.b(Boolean.FALSE, Boolean.TRUE);
                    aIChatActivity.f24381u0 = aVar4;
                    return;
                }
                return;
            case 17:
                OfficeAIReaderActivity officeAIReaderActivity = (OfficeAIReaderActivity) this.f3775b;
                String str = OfficeAIReaderActivity.K0;
                kotlin.jvm.internal.g.e(officeAIReaderActivity, ea.a.p("O2hYc10w", "KxXAAvYN"));
                PdfPreviewEntity d10 = bm.c.b(officeAIReaderActivity).d((String) this.c);
                if (d10 != null) {
                    d10.setRecent(1);
                    d10.setRecentDate(System.currentTimeMillis());
                    FileRepository.I(d10);
                    bm.c.b(officeAIReaderActivity).i(d10);
                    return;
                }
                return;
            case 18:
                ViewPager2 viewPager2 = (ViewPager2) this.f3775b;
                PdfReaderAppWidgetNewDialog pdfReaderAppWidgetNewDialog = (PdfReaderAppWidgetNewDialog) this.c;
                int i11 = PdfReaderAppWidgetNewDialog.O;
                kotlin.jvm.internal.g.e(viewPager2, ea.a.p("a2l0", "zbIOh8Ar"));
                kotlin.jvm.internal.g.e(pdfReaderAppWidgetNewDialog, ea.a.p("R2gic1cw", "pxQ0WQk0"));
                viewPager2.i(viewPager2.getCurrentItem(), false);
                pdfReaderAppWidgetNewDialog.J(viewPager2.getCurrentItem());
                return;
            case 19:
                pdf.pdfreader.viewer.editor.free.feature.ocr.helper.h hVar = (pdf.pdfreader.viewer.editor.free.feature.ocr.helper.h) this.f3775b;
                Throwable th3 = (Throwable) this.c;
                kotlin.jvm.internal.g.e(hVar, ea.a.p("R2gic1cw", "wje3we0M"));
                kotlin.jvm.internal.g.e(th3, ea.a.p("F3Qjchx3A2IeZQ==", "qoStAia0"));
                pdf.pdfreader.viewer.editor.free.feature.ocr.helper.k<um.a> kVar = hVar.c;
                if (kVar != null) {
                    kVar.f(th3);
                    return;
                }
                return;
            case 20:
                ReaderConvertPreviewActivity readerConvertPreviewActivity = (ReaderConvertPreviewActivity) this.f3775b;
                PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) this.c;
                kotlin.jvm.internal.g.e(readerConvertPreviewActivity, ea.a.p("O2hYc10w", "JWjoM2IG"));
                if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(readerConvertPreviewActivity)) {
                    readerConvertPreviewActivity.J1 = pdfPreviewEntity;
                    readerConvertPreviewActivity.Q1 = false;
                    readerConvertPreviewActivity.M.post(new pdf.pdfreader.viewer.editor.free.feature.ocr.helper.c(readerConvertPreviewActivity, 1));
                    if (pdfPreviewEntity != null) {
                        Pdf2WordConvertCompletedView pdf2WordConvertCompletedView = readerConvertPreviewActivity.E1;
                        if (pdf2WordConvertCompletedView != null) {
                            pdf2WordConvertCompletedView.setVisibility(0);
                        }
                        Pdf2WordConvertCompletedView pdf2WordConvertCompletedView2 = readerConvertPreviewActivity.E1;
                        if (pdf2WordConvertCompletedView2 != null) {
                            pdf2WordConvertCompletedView2.f(readerConvertPreviewActivity.f24505s0, pdfPreviewEntity);
                        }
                    }
                    PDF2WordHelper.f25574a.getClass();
                    PDF2WordHelper.c = null;
                    PDF2WordHelper.f25579g.removeCallbacksAndMessages(null);
                    PDF2WordEventCenter pDF2WordEventCenter = PDF2WordEventCenter.f28672a;
                    String p10 = ea.a.p("Q2QtMgRvEGQtY1tuH2UkdBtzR2MlZTBz", "MOiAN2u0");
                    String p11 = ea.a.p("AW8fYWw=", "zqukbejH");
                    pDF2WordEventCenter.getClass();
                    PDF2WordEventCenter.a(p10, p11);
                    PDF2WordEventCenter.a(ea.a.p("P2RXMg5vRWQFYyVuA2UadGpzG2MmZRZz", "8JmOdLl3"), ea.a.p("LW87dlRyJF84cgN2XWV3", "IdNU1PPq"));
                    return;
                }
                return;
            case 21:
                Context context = (Context) this.f3775b;
                View view = (View) this.c;
                kotlin.jvm.internal.g.e(context, ea.a.p("U2MkbjhlDXQ=", "ZuwKLuqF"));
                PopupWindow popupWindow = com.google.android.play.core.assetpacks.b1.f13188l;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                }
                View inflate = LayoutInflater.from(context).inflate(R.layout.pop_add_text_move_hint, (ViewGroup) null, false);
                LinearLayout linearLayout = (LinearLayout) inflate;
                TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_add_text_move_tip);
                if (textView != null) {
                    ea.a.p("Wm4tbBJ0Byg-YU1vHHQfbiJsU3Qjcm1mQm8XKChvBXRWeD8pKQ==", "0zKk0UY9");
                    if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(context)) {
                        i10 = R.drawable.bg_add_text_move_guide_rtl;
                    } else {
                        i10 = R.drawable.bg_add_text_move_guide;
                    }
                    linearLayout.setBackgroundResource(i10);
                    textView.setText(context.getString(R.string.arg_res_0x7f13059a, context.getString(R.string.arg_res_0x7f13002f)));
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    int measuredWidth = (view.getMeasuredWidth() / 2) + iArr[0];
                    if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(context)) {
                        dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.dp_54) + (measuredWidth - linearLayout.getMeasuredWidth());
                    } else {
                        dimensionPixelSize = measuredWidth - context.getResources().getDimensionPixelSize(R.dimen.dp_54);
                    }
                    PopupWindow popupWindow2 = new PopupWindow((View) linearLayout, -2, -2, false);
                    popupWindow2.setOutsideTouchable(true);
                    popupWindow2.setBackgroundDrawable(androidx.core.content.a.getDrawable(context, R.color.no_color));
                    popupWindow2.showAtLocation(view, 0, dimensionPixelSize, iArr[1] - linearLayout.getMeasuredHeight());
                    fn.c.c.getClass();
                    pdf.pdfreader.viewer.editor.free.utils.q0.w(context, ea.a.p("JnNucxFvQF8qci92HGUfX1RkCl8xZR10LW0XdhVfI3UmZFRfEG5oMW0w", "UUzTrxpD"), false);
                    com.google.android.play.core.assetpacks.b1.f13188l = popupWindow2;
                    return;
                }
                throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpBGhSSSA6IA==", "hQMtprds").concat(inflate.getResources().getResourceName(R.id.tv_add_text_move_tip)));
            case 22:
                ReaderPreviewActivity readerPreviewActivity = (ReaderPreviewActivity) this.f3775b;
                ExecutorService executorService = ReaderPreviewActivity.U5;
                readerPreviewActivity.getClass();
                PdfPreviewEntity d11 = bm.c.b(readerPreviewActivity).d((String) this.c);
                if (d11 != null) {
                    d11.setRecent(1);
                    d11.setRecentDate(System.currentTimeMillis());
                    bm.c.b(readerPreviewActivity).i(d11);
                    return;
                }
                return;
            case 23:
                View view2 = (View) this.c;
                ReaderPreviewActivity readerPreviewActivity2 = ((d2) this.f3775b).f5030b;
                if (readerPreviewActivity2.I5) {
                    readerPreviewActivity2.h(view2.getResources().getString(R.string.arg_res_0x7f1300d4));
                    return;
                }
                readerPreviewActivity2.K = 3;
                readerPreviewActivity2.f26169d3 = ea.a.p("OWlUdwlvR3Vw", "gZRKluXE");
                ReaderPreviewActivity.k2(readerPreviewActivity2);
                return;
        }
    }
}
