package pdf.pdfreader.viewer.editor.free.ui.frag;

import java.util.Set;
import pdf.pdfreader.viewer.editor.free.utils.drag.DragSelectionProcessor;

/* compiled from: PdfReaderFragment.java */
/* loaded from: classes3.dex */
public final class o implements DragSelectionProcessor.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f28063a;

    public o(n nVar) {
        this.f28063a = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1 A[SYNTHETIC] */
    @Override // pdf.pdfreader.viewer.editor.free.utils.drag.DragSelectionProcessor.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(int r4, int r5, boolean r6, boolean r7) {
        /*
            r3 = this;
            r6 = 0
            pdf.pdfreader.viewer.editor.free.ui.frag.n r0 = r3.f28063a
            if (r7 == 0) goto L2e
            pdf.pdfreader.viewer.editor.free.ui.adapter.d r7 = r0.E0
            if (r4 < 0) goto L18
            java.util.ArrayList<pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity> r7 = r7.f27210e
            int r1 = r7.size()
            if (r4 >= r1) goto L1b
            java.lang.Object r7 = r7.get(r4)
            pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity r7 = (pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity) r7
            goto L1c
        L18:
            r7.getClass()
        L1b:
            r7 = r6
        L1c:
            pdf.pdfreader.viewer.editor.free.ui.adapter.d r1 = r0.E0
            if (r1 == 0) goto L29
            if (r7 == 0) goto L29
            java.util.ArrayList<pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity> r1 = r1.f27213h
            boolean r7 = r1.contains(r7)
            goto L2a
        L29:
            r7 = 0
        L2a:
            r7 = r7 ^ 1
            r0.J0 = r7
        L2e:
            if (r4 > r5) goto Lc5
            pdf.pdfreader.viewer.editor.free.ui.adapter.d r7 = r0.E0
            if (r7 == 0) goto Lc1
            if (r4 < 0) goto L45
            java.util.ArrayList<pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity> r7 = r7.f27210e
            int r1 = r7.size()
            if (r4 >= r1) goto L45
            java.lang.Object r7 = r7.get(r4)
            pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity r7 = (pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity) r7
            goto L46
        L45:
            r7 = r6
        L46:
            if (r7 == 0) goto Lc1
            boolean r1 = r0.J0
            java.util.ArrayList<pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity> r2 = r0.F0
            if (r1 == 0) goto L8d
            pdf.pdfreader.viewer.editor.free.ui.adapter.d r1 = r0.E0
            java.util.ArrayList<pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity> r1 = r1.f27213h
            boolean r1 = r1.contains(r7)
            if (r1 != 0) goto Lc1
            pdf.pdfreader.viewer.editor.free.ui.adapter.d r1 = r0.E0
            java.util.ArrayList<pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity> r1 = r1.f27213h
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L65
            r0.W0()
        L65:
            pdf.pdfreader.viewer.editor.free.ui.adapter.d r1 = r0.E0
            java.util.ArrayList<pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity> r1 = r1.f27213h
            r1.add(r7)
            pdf.pdfreader.viewer.editor.free.ui.adapter.d r7 = r0.E0
            r7.notifyItemChanged(r4)
            pdf.pdfreader.viewer.editor.free.ui.adapter.d r7 = r0.E0
            java.util.ArrayList<pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity> r7 = r7.f27213h
            int r7 = r7.size()
            int r1 = r2.size()
            mo.c.M0(r7, r1)
            wk.b r7 = wk.b.b()
            qo.n r1 = new qo.n
            r1.<init>()
            r7.e(r1)
            goto Lc1
        L8d:
            pdf.pdfreader.viewer.editor.free.ui.adapter.d r1 = r0.E0
            java.util.ArrayList<pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity> r1 = r1.f27213h
            boolean r1 = r1.contains(r7)
            if (r1 == 0) goto Lc1
            r0.W0()
            pdf.pdfreader.viewer.editor.free.ui.adapter.d r1 = r0.E0
            java.util.ArrayList<pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity> r1 = r1.f27213h
            r1.remove(r7)
            pdf.pdfreader.viewer.editor.free.ui.adapter.d r7 = r0.E0
            r7.notifyItemChanged(r4)
            pdf.pdfreader.viewer.editor.free.ui.adapter.d r7 = r0.E0
            java.util.ArrayList<pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity> r7 = r7.f27213h
            int r7 = r7.size()
            int r1 = r2.size()
            mo.c.M0(r7, r1)
            wk.b r7 = wk.b.b()
            qo.n r1 = new qo.n
            r1.<init>()
            r7.e(r1)
        Lc1:
            int r4 = r4 + 1
            goto L2e
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.frag.o.a(int, int, boolean, boolean):void");
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.drag.DragSelectionProcessor.b
    public final Set<Integer> q() {
        return null;
    }
}
