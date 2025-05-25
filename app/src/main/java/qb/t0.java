package qb;

import androidx.recyclerview.widget.RecyclerView;
import com.inmobi.media.C1666i5;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;
import pdf.pdfreader.viewer.editor.free.thumb.adapter.ThumbnailAdapter;
import pdf.pdfreader.viewer.editor.free.ui.myview.InterceptRecyclerView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class t0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29262a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f29263b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t0(Object obj, int i10, int i11) {
        this.f29262a = i11;
        this.c = obj;
        this.f29263b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        RecyclerView.m layoutManager;
        int i10 = this.f29262a;
        int i11 = this.f29263b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                C1666i5.a((C1666i5) obj, i11);
                return;
            case 1:
                ReaderAIPreviewActivity readerAIPreviewActivity = ReaderAIPreviewActivity.this;
                InterceptRecyclerView interceptRecyclerView = readerAIPreviewActivity.f24501p1;
                if (interceptRecyclerView != null && (layoutManager = interceptRecyclerView.getLayoutManager()) != null) {
                    layoutManager.B0(i11);
                }
                ThumbnailAdapter thumbnailAdapter = readerAIPreviewActivity.B0;
                if (thumbnailAdapter != null) {
                    thumbnailAdapter.h(i11 + 1);
                    return;
                }
                return;
            case 2:
                PDFPageManagerActivity pDFPageManagerActivity = (PDFPageManagerActivity) obj;
                PDFPageManagerActivity.a aVar = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(pDFPageManagerActivity, ea.a.p("R2gic1cw", "S7ZPCkaZ"));
                pDFPageManagerActivity.o2().f1284x.r0(i11);
                return;
            default:
                ImageAdjustActivity imageAdjustActivity = (ImageAdjustActivity) obj;
                ImageAdjustActivity.a aVar2 = ImageAdjustActivity.f25741u0;
                kotlin.jvm.internal.g.e(imageAdjustActivity, ea.a.p("O2hYc10w", "CFcRNQXF"));
                if (!imageAdjustActivity.y2().f695z.e()) {
                    if (i11 >= 0 && i11 < imageAdjustActivity.B2().getItemCount()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        imageAdjustActivity.y2().f695z.i(i11, false);
                        imageAdjustActivity.y2().f695z.post(new pdf.pdfreader.viewer.editor.free.feature.scan.ui.x(imageAdjustActivity, 1));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
