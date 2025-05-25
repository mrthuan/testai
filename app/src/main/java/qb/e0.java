package qb;

import am.e2;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.A4;
import com.inmobi.media.C1631fc;
import com.inmobi.media.C1646h;
import com.inmobi.media.C1724m7;
import com.inmobi.media.InterfaceC1645gc;
import com.inmobi.media.Q5;
import com.inmobi.media.X5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptContainer;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;
import pdf.pdfreader.viewer.editor.free.merge.MergePdfData;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergePdfActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29181a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f29182b;
    public final /* synthetic */ Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f29183d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f29184e;

    public /* synthetic */ e0(int i10, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f29181a = i10;
        this.f29182b = obj;
        this.c = obj2;
        this.f29183d = obj3;
        this.f29184e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f29181a;
        Object obj = this.f29184e;
        Object obj2 = this.f29183d;
        Object obj3 = this.c;
        Object obj4 = this.f29182b;
        switch (i10) {
            case 0:
                X5.a((X5) obj4, (Context) obj3, (String) obj2, (Q5) obj);
                return;
            case 1:
                C1631fc.b((C1646h) obj4, (AdConfig) obj3, (InterfaceC1645gc) obj2, (A4) obj);
                return;
            case 2:
                C1724m7.a((String) obj2, (C1724m7) obj4, (JSONObject) obj3, (String) obj);
                return;
            case 3:
                PointF pointF = (PointF) obj3;
                RectF rectF = (RectF) obj2;
                PointF pointF2 = (PointF) obj;
                lib.zj.pdfeditor.text.editor.a aVar = lib.zj.pdfeditor.text.editor.a.this;
                if (pointF != null) {
                    aVar.f21682c0.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
                    aVar.f21686e0.setEmpty();
                    ArrayList<RectF> arrayList = aVar.V;
                    if (!arrayList.isEmpty()) {
                        arrayList.get(0).left = rectF.left;
                    }
                }
                if (pointF2 != null) {
                    aVar.f21684d0.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
                    aVar.f21688f0.setEmpty();
                    ArrayList<RectF> arrayList2 = aVar.V;
                    if (!arrayList2.isEmpty()) {
                        arrayList2.get(arrayList2.size() - 1).right = rectF.right;
                    }
                }
                aVar.J();
                float o10 = aVar.o();
                aVar.O(o10, aVar.f21682c0);
                aVar.N(o10, aVar.f21684d0);
                aVar.f21687f.invalidate();
                return;
            case 4:
                e2 e2Var = (e2) obj4;
                int[] iArr = (int[]) obj3;
                View view = (View) obj2;
                PDFPageManagerActivity pDFPageManagerActivity = (PDFPageManagerActivity) obj;
                PDFPageManagerActivity.a aVar2 = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(e2Var, ea.a.p("F3AkcDFpDGQbbmc=", "qBSMKODK"));
                kotlin.jvm.internal.g.e(iArr, ea.a.p("F2M-cgFlDHQkaVF3JW81YTBpXW4=", "keJNSoxq"));
                kotlin.jvm.internal.g.e(pDFPageManagerActivity, ea.a.p("EWghc1cw", "4FeHslr2"));
                LinearLayout linearLayout = (LinearLayout) e2Var.f868h;
                kotlin.jvm.internal.g.d(linearLayout, ea.a.p("P29BQhBuU2k0Z2R2Nm8GdFBuGkJn", "AfsLfyPP"));
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                if (layoutParams != null) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                    int dimensionPixelSize = (pDFPageManagerActivity.getResources().getDimensionPixelSize(R.dimen.dp_9) + (pDFPageManagerActivity.getResources().getDimensionPixelSize(R.dimen.dp_42) + (((view.getWidth() / 2) + iArr[0]) - linearLayout.getMeasuredWidth()))) - pDFPageManagerActivity.getResources().getDimensionPixelSize(R.dimen.dp_28);
                    ((ViewGroup.MarginLayoutParams) bVar).leftMargin = dimensionPixelSize;
                    if (dimensionPixelSize < 0) {
                        ((ViewGroup.MarginLayoutParams) bVar).width = linearLayout.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
                        ((ViewGroup.MarginLayoutParams) bVar).leftMargin = 0;
                    }
                    linearLayout.setLayoutParams(bVar);
                    return;
                }
                throw new NullPointerException(ea.a.p("H3UkbGJjGW4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAFeThlYmEWZDpvD2RMLjRvVnMmcihpWHQYYQhvJHRsdxhkL2U2LjtvJnMSclVpOXR0YStvPHQYTBV5HnUlUCNyEG1z", "J6qHBxpq"));
            default:
                final ReaderHomeActivity readerHomeActivity = (ReaderHomeActivity) obj4;
                final WeakReference weakReference = (WeakReference) obj3;
                final ArrayList arrayList3 = (ArrayList) obj;
                String str = ReaderHomeActivity.Y1;
                readerHomeActivity.getClass();
                new DecryptAndCopyUIHelper((Context) weakReference.get(), (ArrayList) obj2, new DecryptAndCopyUIHelper.b() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.q
                    @Override // pdf.pdfreader.viewer.editor.free.decrypt.DecryptAndCopyUIHelper.b
                    public final void a(List list) {
                        ReaderHomeActivity readerHomeActivity2 = readerHomeActivity;
                        readerHomeActivity2.B1 = 1;
                        Iterator it = list.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            ArrayList arrayList4 = arrayList3;
                            if (hasNext) {
                                DecryptContainer decryptContainer = (DecryptContainer) it.next();
                                Iterator it2 = arrayList4.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        MergePdfData mergePdfData = (MergePdfData) it2.next();
                                        if (mergePdfData.getId() == decryptContainer.getPdfPreviewEntity().getId()) {
                                            mergePdfData.setCopyPath(decryptContainer.getNewPath());
                                            break;
                                        }
                                    }
                                }
                            } else {
                                tn.a.d(readerHomeActivity2, ea.a.p("VGUdZ2U=", "Mr9okdjK"), ea.a.p("XmU5ZxZfEWgddw==", "7672gq5K"), ea.a.p("LGhebwpl", "28py2LgV"), false);
                                int i11 = ReaderMergePdfActivity.f26780f0;
                                ReaderMergePdfActivity.a.a((Context) weakReference.get(), arrayList4);
                                pdf.pdfreader.viewer.editor.free.ads.n.f23972a.b(readerHomeActivity2);
                                return;
                            }
                        }
                    }
                }).g();
                return;
        }
    }

    public /* synthetic */ e0(String str, C1724m7 c1724m7, JSONObject jSONObject, String str2) {
        this.f29181a = 2;
        this.f29183d = str;
        this.f29182b = c1724m7;
        this.c = jSONObject;
        this.f29184e = str2;
    }
}
