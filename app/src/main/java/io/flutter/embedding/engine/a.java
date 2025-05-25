package io.flutter.embedding.engine;

import android.util.SparseArray;
import ff.g;
import io.flutter.plugin.platform.e;
import io.flutter.plugin.platform.j;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: FlutterEngine.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final we.a f18637a;

    /* renamed from: b  reason: collision with root package name */
    public final ve.a f18638b;
    public final g c;

    /* renamed from: d  reason: collision with root package name */
    public final j f18639d;

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f18640e;

    /* renamed from: f  reason: collision with root package name */
    public final C0251a f18641f;

    /* compiled from: FlutterEngine.java */
    /* renamed from: io.flutter.embedding.engine.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0251a implements b {
        public C0251a() {
        }

        @Override // io.flutter.embedding.engine.a.b
        public final void a() {
            a aVar = a.this;
            Iterator it = aVar.f18640e.iterator();
            while (it.hasNext()) {
                ((b) it.next()).a();
            }
            while (true) {
                j jVar = aVar.f18639d;
                SparseArray<e> sparseArray = jVar.f18820j;
                if (sparseArray.size() > 0) {
                    jVar.f18828r.b(sparseArray.keyAt(0));
                } else {
                    aVar.c.f17283b = null;
                    return;
                }
            }
        }
    }

    /* compiled from: FlutterEngine.java */
    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x024d A[Catch: all -> 0x0287, Exception -> 0x0289, TryCatch #3 {Exception -> 0x0289, blocks: (B:24:0x011c, B:26:0x0196, B:27:0x01a9, B:29:0x01c0, B:32:0x01ca, B:33:0x01e7, B:35:0x021d, B:40:0x022a, B:42:0x023b, B:44:0x0244, B:51:0x025b, B:47:0x024d), top: B:89:0x011c, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0303 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(pdf.pdfreader.viewer.editor.free.ReaderPdfApplication r19) {
        /*
            Method dump skipped, instructions count: 800
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.a.<init>(pdf.pdfreader.viewer.editor.free.ReaderPdfApplication):void");
    }
}
