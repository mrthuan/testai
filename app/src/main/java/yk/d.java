package yk;

import android.app.Activity;
import android.os.Handler;
import java.util.Vector;
import kotlin.jvm.internal.g;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.ads.FullScreenManage;
import pdf.pdfreader.viewer.editor.free.ads.a;
import pdf.pdfreader.viewer.editor.free.convert.opt.h;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergeChooserActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.k0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f32175a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f32176b;
    public final /* synthetic */ Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f32177d;

    public /* synthetic */ d(int i10, Activity activity, a.d dVar) {
        this.f32176b = i10;
        this.c = activity;
        this.f32177d = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f32175a;
        int i11 = this.f32176b;
        Object obj = this.f32177d;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                Activity activity = (Activity) obj2;
                g.e(activity, ea.a.p("a2FSdBB2XnR5", "pZ1FDBRl"));
                FullScreenManage.f23916d = 0;
                FullScreenManage.f(i11, activity, (a.d) obj);
                return;
            case 1:
                h.a((pdf.pdfreader.viewer.editor.free.convert.opt.a) obj2, i11, (Vector) obj);
                return;
            default:
                ReaderMergeChooserActivity readerMergeChooserActivity = (ReaderMergeChooserActivity) obj2;
                PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) obj;
                ReaderMergeChooserActivity.a aVar = ReaderMergeChooserActivity.f26759n0;
                g.e(readerMergeChooserActivity, ea.a.p("R2gic1cw", "r571fzmf"));
                Handler handler = readerMergeChooserActivity.K;
                g.e(pdfPreviewEntity, ea.a.p("XWUmdCN0eQ==", "PNyHJ1vL"));
                try {
                    handler.post(new k0(readerMergeChooserActivity, new ReaderPDFCore(readerMergeChooserActivity, pdfPreviewEntity.getPath()), pdfPreviewEntity, i11));
                    return;
                } catch (Exception e10) {
                    handler.post(new pdf.pdfreader.viewer.editor.free.convert.opt.c(readerMergeChooserActivity, e10, i11));
                    return;
                }
        }
    }

    public /* synthetic */ d(pdf.pdfreader.viewer.editor.free.convert.opt.a aVar, int i10, Vector vector) {
        this.c = aVar;
        this.f32176b = i10;
        this.f32177d = vector;
    }

    public /* synthetic */ d(ReaderMergeChooserActivity readerMergeChooserActivity, PdfPreviewEntity pdfPreviewEntity, int i10) {
        this.c = readerMergeChooserActivity;
        this.f32177d = pdfPreviewEntity;
        this.f32176b = i10;
    }
}
