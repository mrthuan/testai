package qb;

import androidx.appcompat.libconvert.helper.NativeSoLoaderHelper;
import com.inmobi.media.AbstractRunnableC1690k1;
import com.inmobi.media.C1819u;
import pdf.pdfreader.viewer.editor.free.decrypt.ReaderDecryptAndCopyExecutor;
import pdf.pdfreader.viewer.editor.free.decrypt.ReaderEncryptionAndDecryptionHelper;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIChatRecyclerView;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.ThumbAdapter;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.feature.tools.ToolsNewFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class g1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29204a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f29205b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g1(int i10, AbstractRunnableC1690k1 abstractRunnableC1690k1) {
        this.f29204a = 0;
        this.f29205b = i10;
        this.c = abstractRunnableC1690k1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f29204a;
        int i11 = this.f29205b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                C1819u.b(i11, (AbstractRunnableC1690k1) obj);
                return;
            case 1:
                ReaderDecryptAndCopyExecutor readerDecryptAndCopyExecutor = (ReaderDecryptAndCopyExecutor) obj;
                kotlin.jvm.internal.g.e(readerDecryptAndCopyExecutor, ea.a.p("R2gic1cw", "x1lg06FF"));
                readerDecryptAndCopyExecutor.w0(new Throwable(b.a.c("Error ", i11)));
                return;
            case 2:
                ReaderEncryptionAndDecryptionHelper readerEncryptionAndDecryptionHelper = (ReaderEncryptionAndDecryptionHelper) obj;
                readerEncryptionAndDecryptionHelper.getClass();
                readerEncryptionAndDecryptionHelper.w0(new Throwable(ea.a.p("CnJDbwsg", "MXnfDBD3") + i11));
                return;
            case 3:
                AIChatRecyclerView aIChatRecyclerView = (AIChatRecyclerView) obj;
                AIChatActivity.a aVar = AIChatActivity.f24356v0;
                kotlin.jvm.internal.g.e(aIChatRecyclerView, ea.a.p("S3YrZXc=", "cooBGMQ7"));
                aIChatRecyclerView.C0(i11);
                return;
            case 4:
                PDFPageManagerActivity pDFPageManagerActivity = (PDFPageManagerActivity) obj;
                kotlin.jvm.internal.g.e(pDFPageManagerActivity, ea.a.p("MWgLcx0w", "UmEb9imO"));
                pDFPageManagerActivity.B1(pDFPageManagerActivity.T);
                pDFPageManagerActivity.N2(false, false);
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 5) {
                            pDFPageManagerActivity.O2();
                            return;
                        }
                        return;
                    }
                    pDFPageManagerActivity.m2();
                    return;
                } else if (pDFPageManagerActivity.Q != null) {
                    pDFPageManagerActivity.finish();
                    return;
                } else {
                    return;
                }
            case 5:
                ImageAdjustActivity imageAdjustActivity = (ImageAdjustActivity) obj;
                ImageAdjustActivity.a aVar2 = ImageAdjustActivity.f25741u0;
                kotlin.jvm.internal.g.e(imageAdjustActivity, ea.a.p("R2gic1cw", "WxYF5FoT"));
                ThumbAdapter thumbAdapter = imageAdjustActivity.Y;
                thumbAdapter.h(i11).f30416n = null;
                thumbAdapter.notifyItemChanged(i11);
                return;
            case 6:
                String str = ReaderHomeActivity.Y1;
                ((ReaderHomeActivity) obj).N2(i11);
                return;
            default:
                ToolsNewFragment toolsNewFragment = (ToolsNewFragment) obj;
                kotlin.jvm.internal.g.e(toolsNewFragment, ea.a.p("O2hYc10w", "oKn12c2L"));
                pdf.pdfreader.viewer.editor.free.ui.adapter.b0 b0Var = toolsNewFragment.f27952i0;
                if (b0Var != null) {
                    b0Var.notifyDataSetChanged();
                }
                if (i11 == NativeSoLoaderHelper.f1936e && toolsNewFragment.f27954k0) {
                    toolsNewFragment.q0(280, ea.a.p("O29ebHM=", "Kzxs4jmE"));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ g1(Object obj, int i10, int i11) {
        this.f29204a = i11;
        this.c = obj;
        this.f29205b = i10;
    }
}
