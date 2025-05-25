package pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui;

import android.os.Handler;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.data.ImageFileInfo;
import pdf.pdfreader.viewer.editor.free.ui.myview.ReaderRoundProgressBar;
import pdf.pdfreader.viewer.editor.free.utils.w0;

/* compiled from: BasePdf2ImageActivity.kt */
/* loaded from: classes3.dex */
public final class j implements dn.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BasePdf2ImageActivity f25554a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f25555b;

    public j(BasePdf2ImageActivity basePdf2ImageActivity, boolean z10) {
        this.f25554a = basePdf2ImageActivity;
        this.f25555b = z10;
    }

    @Override // dn.a
    public final void a() {
        BasePdf2ImageActivity basePdf2ImageActivity = this.f25554a;
        if (pdf.pdfreader.viewer.editor.free.utils.extension.a.b(basePdf2ImageActivity)) {
            return;
        }
        basePdf2ImageActivity.o2();
        basePdf2ImageActivity.N = false;
        basePdf2ImageActivity.B2();
        basePdf2ImageActivity.M2();
        basePdf2ImageActivity.T2(false, new Exception());
    }

    @Override // dn.a
    public final void b(ArrayList<ImageFileInfo> arrayList) {
        int i10;
        BasePdf2ImageActivity basePdf2ImageActivity = this.f25554a;
        if (pdf.pdfreader.viewer.editor.free.utils.extension.a.b(basePdf2ImageActivity)) {
            return;
        }
        BillingConfigImpl.c.getClass();
        int i11 = 2;
        if (BillingConfigImpl.t()) {
            cn.f.c.getClass();
            if (cn.f.h() >= 1) {
                if (basePdf2ImageActivity.J2()) {
                    i10 = 1;
                } else {
                    i10 = 2;
                }
                cn.f.f5763f.c(cn.f.f5761d[1], Integer.valueOf(i10));
            }
            if (cn.f.h() < 2) {
                cn.f.f5764g.c(cn.f.f5761d[2], Integer.valueOf(cn.f.h() + 1));
            }
        } else {
            cn.f fVar = cn.f.c;
            if (basePdf2ImageActivity.J2()) {
                i11 = 1;
            }
            fVar.getClass();
            cn.f.f5762e.c(cn.f.f5761d[0], Integer.valueOf(i11));
        }
        basePdf2ImageActivity.o2();
        boolean G2 = basePdf2ImageActivity.G2();
        Handler handler = basePdf2ImageActivity.H;
        if (G2) {
            if (this.f25555b) {
                basePdf2ImageActivity.N = false;
                ReaderRoundProgressBar y22 = basePdf2ImageActivity.y2();
                if (y22 != null) {
                    y22.setProgress(100);
                }
                handler.postDelayed(new l1.a(18, basePdf2ImageActivity, arrayList), 100L);
                return;
            }
            w0.a().c.execute(new n0.g(29, arrayList, basePdf2ImageActivity));
            return;
        }
        basePdf2ImageActivity.N = false;
        ReaderRoundProgressBar y23 = basePdf2ImageActivity.y2();
        if (y23 != null) {
            y23.setProgress(100);
        }
        handler.postDelayed(new l.r(24, basePdf2ImageActivity, arrayList), 100L);
    }

    @Override // dn.a
    public final void c(int i10) {
        BasePdf2ImageActivity basePdf2ImageActivity = this.f25554a;
        if (pdf.pdfreader.viewer.editor.free.utils.extension.a.b(basePdf2ImageActivity)) {
            return;
        }
        if (i10 >= 100) {
            i10 = 99;
        }
        ReaderRoundProgressBar y22 = basePdf2ImageActivity.y2();
        if (y22 != null) {
            y22.setProgress(i10);
        }
    }
}
