package v4;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.RectF;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.AbstractC1846w0;
import com.inmobi.media.C1616eb;
import com.inmobi.media.EnumC1686jb;
import com.inmobi.media.Kb;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import lib.zj.pdfeditor.PDFPageView;
import lib.zj.pdfeditor.ReaderPDFCore;
import lib.zj.pdfeditor.text.editor.TextEditorState;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.BaseOperatePDFActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.m3;
import pdf.pdfreader.viewer.editor.free.ui.dialog.n3;
import pdf.pdfreader.viewer.editor.free.ui.myview.ReaderRoundProgressBar;
import qb.c1;
import v4.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f30537a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f30538b;
    public final /* synthetic */ Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f30539d;

    public /* synthetic */ a(int i10, Object obj, Object obj2, Object obj3) {
        this.f30537a = i10;
        this.f30538b = obj;
        this.c = obj2;
        this.f30539d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10;
        int i10 = this.f30537a;
        Object obj = this.f30539d;
        Object obj2 = this.c;
        Object obj3 = this.f30538b;
        switch (i10) {
            case 0:
                Activity activity = (Activity) obj3;
                g listener = (g) obj;
                kotlin.jvm.internal.g.e(activity, "$activity");
                kotlin.jvm.internal.g.e(listener, "$listener");
                PAGSdk.init(activity.getApplicationContext(), (PAGConfig) obj2, new b.a(listener, activity));
                return;
            case 1:
                Kb.a((AbstractC1846w0) obj3, (Kb) obj2, (InMobiAdRequestStatus) obj);
                return;
            case 2:
                C1616eb.c((String) obj3, (Map) obj2, (EnumC1686jb) obj);
                return;
            case 3:
                lib.zj.pdfeditor.text.editor.a aVar = (lib.zj.pdfeditor.text.editor.a) obj3;
                RectF rectF = (RectF) obj2;
                mj.a aVar2 = (mj.a) obj;
                PDFPageView pDFPageView = aVar.f21687f;
                if (rectF != null) {
                    aVar2.f22045b.set(rectF);
                    float editorSourceScale = 3.0f / pDFPageView.getEditorSourceScale();
                    RectF rectF2 = aVar.f21708z;
                    RectF rectF3 = aVar2.f22045b;
                    float f10 = aVar.f21702t * editorSourceScale;
                    rectF2.set(rectF3.left - (aVar.f21702t * editorSourceScale), rectF3.centerY() - f10, f10 + rectF3.left, (aVar.f21702t * editorSourceScale) + rectF3.centerY());
                    float f11 = aVar.f21702t * editorSourceScale;
                    aVar.A.set(rectF3.right - (aVar.f21702t * editorSourceScale), rectF3.centerY() - f11, f11 + rectF3.right, (aVar.f21702t * editorSourceScale) + rectF3.centerY());
                    pDFPageView.invalidate();
                    return;
                }
                aVar.g(TextEditorState.NONE);
                pDFPageView.y2(-1, -1, -1);
                aVar.D();
                return;
            case 4:
                pdf.pdfreader.viewer.editor.free.convert.opt.h hVar = (pdf.pdfreader.viewer.editor.free.convert.opt.h) obj3;
                ul.b bVar = (ul.b) obj2;
                Throwable th2 = (Throwable) obj;
                kotlin.jvm.internal.g.e(hVar, ea.a.p("R2gic1cw", "t0fE3yud"));
                kotlin.jvm.internal.g.e(bVar, ea.a.p("a2lcYR5l", "snPPO3UF"));
                kotlin.jvm.internal.g.e(th2, ea.a.p("F3Qjchx3A2IeZQ==", "08H4SB6Q"));
                pdf.pdfreader.viewer.editor.free.convert.opt.a aVar3 = hVar.c;
                if (aVar3 != null) {
                    aVar3.c(bVar, th2);
                    return;
                }
                return;
            case 5:
                PDFPageManagerActivity pDFPageManagerActivity = (PDFPageManagerActivity) obj3;
                ym.a aVar4 = (ym.a) obj;
                PDFPageManagerActivity.a aVar5 = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(pDFPageManagerActivity, ea.a.p("R2gic1cw", "xvSRAFQc"));
                pDFPageManagerActivity.f25273l0 = 0L;
                pDFPageManagerActivity.f25313t.removeCallbacks(pDFPageManagerActivity.f25274m0);
                pDFPageManagerActivity.o2().f1264d.f1510b.setVisibility(8);
                pDFPageManagerActivity.V = false;
                if (kotlin.jvm.internal.g.a((Boolean) obj2, Boolean.TRUE)) {
                    ArrayList arrayList = new ArrayList();
                    int i11 = aVar4.f32184f;
                    int i12 = aVar4.f32183e + i11;
                    while (i11 < i12) {
                        bn.a aVar6 = new bn.a();
                        aVar6.f5491e = i11;
                        arrayList.add(aVar6);
                        i11++;
                    }
                    pDFPageManagerActivity.s2().f();
                    if (!arrayList.isEmpty()) {
                        if (pDFPageManagerActivity.R) {
                            pDFPageManagerActivity.s2().e(arrayList);
                        } else {
                            pDFPageManagerActivity.s2().d((bn.a) kotlin.collections.m.r0(arrayList));
                        }
                    }
                    pDFPageManagerActivity.q2().i(aVar4.f32184f, arrayList);
                    pDFPageManagerActivity.z2();
                    pDFPageManagerActivity.C2(aVar4.f32184f);
                    pDFPageManagerActivity.I2(pDFPageManagerActivity.q2().getItemCount());
                    return;
                }
                return;
            case 6:
                BasePdf2ImageActivity basePdf2ImageActivity = (BasePdf2ImageActivity) obj3;
                List list = (List) obj2;
                Exception exc = (Exception) obj;
                kotlin.jvm.internal.g.e(basePdf2ImageActivity, ea.a.p("R2gic1cw", "uGOt6SM4"));
                if (pdf.pdfreader.viewer.editor.free.utils.extension.a.b(basePdf2ImageActivity)) {
                    if (!basePdf2ImageActivity.G2()) {
                        androidx.lifecycle.w<ArrayList<bn.a>> wVar = en.a.f16815a;
                        en.a.f16820g.j(Boolean.FALSE);
                        return;
                    }
                    return;
                }
                Handler handler = basePdf2ImageActivity.H;
                handler.removeCallbacks(basePdf2ImageActivity.f25483d0);
                if (basePdf2ImageActivity.f25482c0 == 0 || System.currentTimeMillis() - basePdf2ImageActivity.f25482c0 >= 300) {
                    j10 = 0;
                } else {
                    j10 = ((long) OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT) - (System.currentTimeMillis() - basePdf2ImageActivity.f25482c0);
                }
                basePdf2ImageActivity.f25482c0 = 0L;
                if (basePdf2ImageActivity.G2()) {
                    ReaderRoundProgressBar y22 = basePdf2ImageActivity.y2();
                    if (y22 != null) {
                        y22.setProgress(100);
                    }
                    if (j10 < 100) {
                        j10 = 100;
                    }
                }
                handler.postDelayed(new c1(5, basePdf2ImageActivity, list, exc), j10);
                return;
            case 7:
                RecentAddedActivity recentAddedActivity = (RecentAddedActivity) obj3;
                qo.g gVar = (qo.g) obj2;
                Dialog dialog = (Dialog) obj;
                RecentAddedActivity.a aVar7 = RecentAddedActivity.f26850l0;
                kotlin.jvm.internal.g.e(recentAddedActivity, ea.a.p("BmgrcxMw", "V2rB71hH"));
                kotlin.jvm.internal.g.e(gVar, ea.a.p("a2VHZRd0", "2Dnj2kgw"));
                recentAddedActivity.s2(gVar, true);
                if (!recentAddedActivity.isDestroyed() && !recentAddedActivity.isFinishing()) {
                    dialog.dismiss();
                    return;
                }
                return;
            case 8:
                BaseOperatePDFActivity baseOperatePDFActivity = (BaseOperatePDFActivity) obj3;
                PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) obj2;
                cg.l lVar = (cg.l) obj;
                int i13 = BaseOperatePDFActivity.Z;
                kotlin.jvm.internal.g.e(baseOperatePDFActivity, ea.a.p("R2gic1cw", "8vN5rYcc"));
                kotlin.jvm.internal.g.e(pdfPreviewEntity, ea.a.p("bGVadCp0eQ==", "bXH4CQU7"));
                kotlin.jvm.internal.g.e(lVar, ea.a.p("F28lQxtlAWshdVdjDHNz", "fqbMkSBP"));
                try {
                    baseOperatePDFActivity.s2().post(new a7.a(4, baseOperatePDFActivity, pdfPreviewEntity, new ReaderPDFCore(baseOperatePDFActivity, pdfPreviewEntity.getPath()), lVar));
                    return;
                } catch (Exception e10) {
                    baseOperatePDFActivity.s2().post(new pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.c(baseOperatePDFActivity, 8));
                    e10.printStackTrace();
                    return;
                }
            default:
                View view = (View) obj2;
                n3 n3Var = (n3) obj;
                kotlin.jvm.internal.g.e((m3) obj3, ea.a.p("O2hYc10w", "Ljd1624d"));
                kotlin.jvm.internal.g.e(view, ea.a.p("YHQKYg==", "9TDkK6AH"));
                kotlin.jvm.internal.g.e(n3Var, ea.a.p("R2gic1cx", "S4L91xZk"));
                int[] iArr = n3Var.f27708f;
                int[] iArr2 = n3Var.f27707e;
                try {
                    view.getLocationOnScreen(iArr2);
                    n3Var.f27704a.getLocationOnScreen(iArr);
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (iArr2[1] - iArr[1]) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    }
                    view.setLayoutParams(layoutParams);
                    Result.m13constructorimpl(tf.d.f30009a);
                    return;
                } catch (Throwable th3) {
                    Result.m13constructorimpl(androidx.activity.s.v(th3));
                    return;
                }
        }
    }
}
