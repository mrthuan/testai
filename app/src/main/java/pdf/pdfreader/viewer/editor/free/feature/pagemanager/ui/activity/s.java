package pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a1;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25344a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PDFPageManagerActivity f25345b;

    public /* synthetic */ s(PDFPageManagerActivity pDFPageManagerActivity, int i10) {
        this.f25344a = i10;
        this.f25345b = pDFPageManagerActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GridLayoutManager gridLayoutManager;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i10;
        int i11 = this.f25344a;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
        ij.e eVar = null;
        PDFPageManagerActivity pDFPageManagerActivity = this.f25345b;
        switch (i11) {
            case 0:
                PDFPageManagerActivity.a aVar = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(pDFPageManagerActivity, ea.a.p("R2gic1cw", "hwan7Gaa"));
                ReaderPDFCore readerPDFCore = pDFPageManagerActivity.f25317x;
                if (readerPDFCore != null) {
                    eVar = readerPDFCore.redoPageManageAction();
                }
                if (eVar != null) {
                    pDFPageManagerActivity.f25313t.post(new a1(13, eVar, pDFPageManagerActivity));
                    return;
                }
                return;
            default:
                PDFPageManagerActivity.a aVar2 = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(pDFPageManagerActivity, ea.a.p("R2gic1cw", "x5sz1x9J"));
                RecyclerView.m layoutManager = pDFPageManagerActivity.o2().f1284x.getLayoutManager();
                kotlin.jvm.internal.g.c(layoutManager, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuWm4Ubj1sGCBHeTtlU2EMZABvXWQRLiRlJ3lRbCNyNWlQdxd3IWQTZUcuDHIaZC5hC29BdCRhOGEjZXI=", "59HtYKvz"));
                int i12 = 0;
                View childAt = pDFPageManagerActivity.o2().f1284x.getChildAt(0);
                int i13 = ((GridLayoutManager) layoutManager).F;
                if (childAt != null) {
                    int height = childAt.getHeight();
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    } else {
                        marginLayoutParams = null;
                    }
                    if (marginLayoutParams != null) {
                        i10 = marginLayoutParams.topMargin;
                    } else {
                        i10 = 0;
                    }
                    int i14 = height + i10;
                    ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    }
                    if (marginLayoutParams2 != null) {
                        i12 = marginLayoutParams2.bottomMargin;
                    }
                    i12 = (i14 + i12) * ((int) Math.ceil(gridLayoutManager.M() / i13));
                }
                if (i12 - pDFPageManagerActivity.o2().f1284x.getHeight() > pDFPageManagerActivity.o2().f1284x.getHeight() * 2) {
                    pDFPageManagerActivity.o2().f1284x.D0.A = true;
                    pDFPageManagerActivity.o2().f1284x.D0.d();
                    return;
                }
                return;
        }
    }
}
