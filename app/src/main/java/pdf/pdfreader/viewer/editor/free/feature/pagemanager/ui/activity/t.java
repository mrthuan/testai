package pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity;

import java.util.ArrayList;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;
import qb.g1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25346a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f25347b;
    public final /* synthetic */ PDFPageManagerActivity c;

    public /* synthetic */ t(int i10, PDFPageManagerActivity pDFPageManagerActivity) {
        this.f25346a = 1;
        this.f25347b = i10;
        this.c = pDFPageManagerActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        Boolean bool;
        int i10 = this.f25346a;
        int i11 = this.f25347b;
        PDFPageManagerActivity pDFPageManagerActivity = this.c;
        switch (i10) {
            case 0:
                PDFPageManagerActivity.a aVar = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(pDFPageManagerActivity, ea.a.p("O2hYc10w", "uAGwNOCk"));
                ArrayList<bn.a> arrayList = (ArrayList) an.a.c.d();
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList(kotlin.collections.g.h0(arrayList, 10));
                    for (bn.a aVar2 : arrayList) {
                        arrayList2.add(Integer.valueOf(aVar2.f5491e));
                    }
                    ReaderPDFCore readerPDFCore = pDFPageManagerActivity.f25317x;
                    if (readerPDFCore != null) {
                        bool = Boolean.valueOf(readerPDFCore.rotatePage(kotlin.collections.m.D0(arrayList2), i11));
                    } else {
                        bool = null;
                    }
                    if (kotlin.jvm.internal.g.a(bool, Boolean.TRUE)) {
                        ReaderPDFCore readerPDFCore2 = pDFPageManagerActivity.f25317x;
                        if (readerPDFCore2 != null) {
                            ij.e eVar = new ij.e();
                            eVar.f18535a = 4;
                            eVar.f18537d = arrayList2;
                            readerPDFCore2.addPageManagerAction(eVar);
                        }
                        pDFPageManagerActivity.f25313t.post(new l.r(22, arrayList, pDFPageManagerActivity));
                        return;
                    }
                    return;
                }
                return;
            default:
                kotlin.jvm.internal.g.e(pDFPageManagerActivity, ea.a.p("Q2gRc3ww", "kd7xXHYQ"));
                if (i11 != 5) {
                    ReaderPDFCore readerPDFCore3 = pDFPageManagerActivity.f25317x;
                    if (readerPDFCore3 != null) {
                        readerPDFCore3.resetData();
                    }
                    ReaderPDFCore readerPDFCore4 = pDFPageManagerActivity.f25317x;
                    boolean z11 = true;
                    if (readerPDFCore4 != null && readerPDFCore4.hasChanges()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        if (i11 != 2) {
                            z11 = false;
                        }
                        PDFPageManagerActivity.a aVar3 = PDFPageManagerActivity.H0;
                        pDFPageManagerActivity.A2(z11);
                    }
                }
                pDFPageManagerActivity.f25313t.post(new g1(pDFPageManagerActivity, i11, 4));
                return;
        }
    }

    public /* synthetic */ t(PDFPageManagerActivity pDFPageManagerActivity) {
        this.f25346a = 0;
        this.c = pDFPageManagerActivity;
        this.f25347b = 90;
    }
}
