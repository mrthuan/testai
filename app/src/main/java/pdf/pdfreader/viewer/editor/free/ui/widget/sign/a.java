package pdf.pdfreader.viewer.editor.free.ui.widget.sign;

import java.io.File;
import pdf.pdfreader.viewer.editor.free.ui.widget.DrawSignView;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.SignaturePad;

/* compiled from: SignaturePad.java */
/* loaded from: classes3.dex */
public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f28490a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SignaturePad f28491b;

    /* compiled from: SignaturePad.java */
    /* renamed from: pdf.pdfreader.viewer.editor.free.ui.widget.sign.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class RunnableC0357a implements Runnable {
        public RunnableC0357a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SignaturePad.f fVar = a.this.f28491b.f28478i;
            if (fVar != null) {
                ((DrawSignView) fVar).d();
            }
        }
    }

    /* compiled from: SignaturePad.java */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ File f28493a;

        public b(File file) {
            this.f28493a = file;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            SignaturePad.f fVar = aVar.f28491b.f28478i;
            if (fVar != null) {
                ((DrawSignView) fVar).e(this.f28493a.getAbsolutePath(), aVar.f28491b.f28482m);
            }
        }
    }

    /* compiled from: SignaturePad.java */
    /* loaded from: classes3.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SignaturePad.f fVar = a.this.f28491b.f28478i;
            if (fVar != null) {
                ((DrawSignView) fVar).d();
            }
        }
    }

    /* compiled from: SignaturePad.java */
    /* loaded from: classes3.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SignaturePad.f fVar = a.this.f28491b.f28478i;
            if (fVar != null) {
                ((DrawSignView) fVar).e(null, null);
            }
        }
    }

    public a(SignaturePad signaturePad, boolean z10) {
        this.f28491b = signaturePad;
        this.f28490a = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x0355 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0360 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x032b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x034a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0336 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0320 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 899
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.widget.sign.a.run():void");
    }
}
