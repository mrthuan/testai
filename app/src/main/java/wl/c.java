package wl;

import kotlin.jvm.internal.g;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f31362a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f31363b;
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f31364d;

    public /* synthetic */ c(int i10, int i11, PDFPageManagerActivity pDFPageManagerActivity) {
        this.f31362a = 2;
        this.f31363b = i10;
        this.c = i11;
        this.f31364d = pDFPageManagerActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Boolean bool;
        int i10 = this.f31362a;
        int i11 = this.c;
        int i12 = this.f31363b;
        Object obj = this.f31364d;
        switch (i10) {
            case 0:
                a aVar = (a) obj;
                g.e(aVar, ea.a.p("F2MqbB9iA2Nr", "VGSWk9p3"));
                aVar.p(i12, i11);
                return;
            case 1:
                AIChatActivity.i2((AIChatActivity) obj, i12, i11);
                return;
            default:
                PDFPageManagerActivity pDFPageManagerActivity = (PDFPageManagerActivity) obj;
                PDFPageManagerActivity.a aVar2 = PDFPageManagerActivity.H0;
                g.e(pDFPageManagerActivity, ea.a.p("O2hYc10w", "2GTtBir6"));
                if (i12 != i11) {
                    ReaderPDFCore readerPDFCore = pDFPageManagerActivity.f25317x;
                    if (readerPDFCore != null) {
                        bool = Boolean.valueOf(readerPDFCore.movePage(new int[]{i12}, i11));
                    } else {
                        bool = null;
                    }
                    if (!g.a(bool, Boolean.TRUE)) {
                        pDFPageManagerActivity.f25313t.post(new pdf.pdfreader.viewer.editor.free.convert.opt.e(i11, pDFPageManagerActivity, i12, 1));
                        return;
                    }
                    ReaderPDFCore readerPDFCore2 = pDFPageManagerActivity.f25317x;
                    if (readerPDFCore2 != null) {
                        ij.e eVar = new ij.e();
                        eVar.f18535a = 3;
                        eVar.f18536b = i12;
                        eVar.c = i11;
                        readerPDFCore2.addPageManagerAction(eVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ c(int i10, Object obj, int i11, int i12) {
        this.f31362a = i12;
        this.f31364d = obj;
        this.f31363b = i10;
        this.c = i11;
    }
}
