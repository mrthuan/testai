package rp;

import lib.zj.pdfeditor.ReaderPDFCore;

/* compiled from: ClipPopRunner.java */
/* loaded from: classes3.dex */
public final class b implements qp.a {
    @Override // qp.a
    public final boolean b(ReaderPDFCore.b bVar) {
        Boolean bool;
        boolean pagePopClip;
        long j10 = bVar.f21371a;
        if (j10 != 0) {
            pagePopClip = ReaderPDFCore.this.pagePopClip(j10);
            bool = Boolean.valueOf(pagePopClip);
        } else {
            bool = null;
        }
        if (bool != null && !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // qp.a
    public final /* synthetic */ void a() {
    }
}
