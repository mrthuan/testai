package pdf.pdfreader.viewer.editor.free.pdfview;

import android.view.View;
import android.widget.Scroller;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.data.SignAction;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.data.SignActionInfo;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.SignPathActionInfo;
import yo.c;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class d implements zn.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SignActionInfo f26421a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c.b f26422b;
    public final /* synthetic */ SignActionInfo c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f26423d;

    /* compiled from: ReaderPreviewActivity.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f26424a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ float f26425b;

        public a(View view, float f10) {
            this.f26424a = view;
            this.f26425b = f10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d dVar = d.this;
            ReaderPreviewActivity.b0 b0Var = dVar.f26423d.f26276w1;
            Scroller scroller = b0Var.f21406o;
            if (scroller != null && !scroller.isFinished()) {
                b0Var.f21406o.forceFinished(true);
            }
            int[] iArr = new int[2];
            View view = this.f26424a;
            if (view != null) {
                view.getLocationOnScreen(iArr);
            }
            SignActionInfo signActionInfo = dVar.f26421a;
            c.b bVar = dVar.f26422b;
            if (bVar != null) {
                bVar.a(dVar.c, signActionInfo);
            }
            SignPathActionInfo signPathActionInfo = signActionInfo.getSignPathActionInfo();
            kj.b stampAnnotData = signActionInfo.getStampAnnotData();
            ReaderPreviewActivity readerPreviewActivity = dVar.f26423d;
            if (signPathActionInfo != null && stampAnnotData != null) {
                if (signActionInfo.getAction() == SignAction.Add) {
                    readerPreviewActivity.f26266u5.put(Long.valueOf(stampAnnotData.f19799a), Integer.valueOf(signPathActionInfo.getColor()));
                    readerPreviewActivity.f26259t5.put(Long.valueOf(stampAnnotData.f19799a), Integer.valueOf(signPathActionInfo.getSize()));
                } else if (signActionInfo.getAction() == SignAction.Remove) {
                    readerPreviewActivity.f26266u5.remove(Long.valueOf(stampAnnotData.f19799a));
                    readerPreviewActivity.f26259t5.remove(Long.valueOf(stampAnnotData.f19799a));
                }
            }
            if (signActionInfo.getAction() != SignAction.Remove) {
                ReaderPreviewActivity.g2(dVar.f26423d, signActionInfo.getPdfPageIndex(), iArr, signActionInfo.getStampAnnotData(), signActionInfo.getSignPathActionInfo(), this.f26425b);
                readerPreviewActivity.I2();
            }
            readerPreviewActivity.q5 = new SignActionInfo(signActionInfo);
        }
    }

    public d(ReaderPreviewActivity readerPreviewActivity, SignActionInfo signActionInfo, c.b bVar, SignActionInfo signActionInfo2) {
        this.f26423d = readerPreviewActivity;
        this.f26421a = signActionInfo;
        this.f26422b = bVar;
        this.c = signActionInfo2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
        r3.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
        if ((r5 instanceof lib.zj.pdfeditor.PDFPageView) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
        r5 = (lib.zj.pdfeditor.PDFPageView) r5;
        r1 = r10.f26421a.getStampAnnotData().f19799a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
        monitor-enter(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
        r3 = new java.util.ArrayList(r5.A0).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
        if (r3.hasNext() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
        r4 = (kj.b) r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:
        if (r4.f19799a != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
        r3.remove();
        r5.A0.remove(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
        r5.q1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0096, code lost:
        monitor-exit(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0097, code lost:
        r5.q1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0016, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0016, code lost:
        continue;
     */
    @Override // zn.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.pdfview.d.a():void");
    }
}
