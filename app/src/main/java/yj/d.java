package yj;

import java.util.List;
import k3.m;
import net.lingala.zip4j.progress.ProgressMonitor;
import wj.h;
import wj.k;
import xj.f;
import xj.l;
import yj.c;

/* compiled from: ExtractAllFilesTask.java */
/* loaded from: classes3.dex */
public final class d extends yj.a<a> {

    /* renamed from: f  reason: collision with root package name */
    public final char[] f32172f;

    /* renamed from: g  reason: collision with root package name */
    public h f32173g;

    /* compiled from: ExtractAllFilesTask.java */
    /* loaded from: classes3.dex */
    public static class a extends m {
        public final String c;

        public a(String str, u8.b bVar) {
            super(bVar, 1);
            this.c = str;
        }
    }

    public d(l lVar, char[] cArr, xj.h hVar, c.a aVar) {
        super(lVar, hVar, aVar);
        this.f32172f = cArr;
    }

    @Override // yj.c
    public final void a(Object obj, ProgressMonitor progressMonitor) {
        a aVar = (a) obj;
        try {
            k d10 = d((u8.b) aVar.f19572b);
            for (f fVar : (List) this.f32164d.f31850a.f30907b) {
                if (fVar.f31825i.startsWith("__MACOSX")) {
                    progressMonitor.f(fVar.f31823g);
                } else {
                    this.f32173g.a(fVar);
                    c(d10, fVar, aVar.c, progressMonitor, new byte[((u8.b) aVar.f19572b).f30261a]);
                    this.f32168a.getClass();
                }
            }
            d10.close();
        } finally {
            h hVar = this.f32173g;
            if (hVar != null) {
                hVar.close();
            }
        }
    }

    public final k d(u8.b bVar) {
        h mVar;
        f fVar;
        List list;
        l lVar = this.f32164d;
        if (lVar.f31854f.getName().endsWith(".zip.001")) {
            mVar = new wj.f(lVar.f31854f);
        } else {
            mVar = new wj.m(lVar.f31851b.f31834b, lVar.f31854f, lVar.f31853e);
        }
        this.f32173g = mVar;
        w1.f fVar2 = lVar.f31850a;
        if (fVar2 != null && (list = (List) fVar2.f30907b) != null && list.size() != 0) {
            fVar = (f) ((List) lVar.f31850a.f30907b).get(0);
        } else {
            fVar = null;
        }
        if (fVar != null) {
            this.f32173g.a(fVar);
        }
        return new k(this.f32173g, this.f32172f, bVar);
    }
}
