package pdf.pdfreader.viewer.editor.free.feature.ai.typing;

import jf.j;
import jf.m;
import qk.i;
import qk.r;

/* compiled from: BlockHandlerNoAdditionalNewLines.java */
/* loaded from: classes3.dex */
public final class a implements j.a {
    @Override // jf.j.a
    public final void a(j jVar, r rVar) {
        boolean z10;
        m mVar = (m) jVar;
        mVar.getClass();
        if (rVar.f29380e != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            mVar.u();
            if ((rVar instanceof i) && ((i) rVar).f29365f == 1) {
                mVar.c.a('\n');
            }
        }
    }

    @Override // jf.j.a
    public final void b(j jVar, r rVar) {
        boolean z10;
        m mVar = (m) jVar;
        mVar.u();
        if (rVar.f29380e != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (rVar instanceof i) && ((i) rVar).f29365f > 1 && mVar.y() > 0) {
            mVar.c.a('\n');
        }
    }
}
