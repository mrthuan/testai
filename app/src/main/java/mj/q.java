package mj;

import android.graphics.Matrix;
import java.util.ArrayList;
import lib.zj.pdfeditor.Annotation;

/* compiled from: TextEditorHelper.java */
/* loaded from: classes3.dex */
public final class q extends b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f22127b;
    public final /* synthetic */ Matrix c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Annotation f22128d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ lib.zj.pdfeditor.text.editor.a f22129e;

    public q(lib.zj.pdfeditor.text.editor.a aVar, int i10, Matrix matrix, Annotation annotation) {
        this.f22129e = aVar;
        this.f22127b = i10;
        this.c = matrix;
        this.f22128d = annotation;
    }

    @Override // mj.d0
    public final int getPriority() {
        return 85;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Matrix matrix;
        lib.zj.pdfeditor.text.editor.a aVar = this.f22129e;
        if (aVar.f21683d != null && this.f22127b == aVar.f21685e && (matrix = this.c) != null && this.f22128d != null) {
            float[] fArr = new float[9];
            matrix.getValues(fArr);
            if (this.f22129e.f21683d.handleImageByMatrix(this.f22127b, this.f22128d, fArr)) {
                this.f22129e.f21683d.recordEditorTextOrImageAction(this.f22127b);
                lib.zj.pdfeditor.text.editor.a.f(this.f22129e);
                Annotation[] pageImageInfo = this.f22129e.f21683d.getPageImageInfo(this.f22127b);
                ArrayList arrayList = new ArrayList();
                e eVar = null;
                if (pageImageInfo != null) {
                    for (Annotation annotation : pageImageInfo) {
                        e eVar2 = new e(annotation);
                        arrayList.add(eVar2);
                        if (annotation.getImgIndex() == this.f22128d.getImgIndex()) {
                            eVar2.c = true;
                            eVar = eVar2;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f22129e.f21678a.post(new androidx.fragment.app.f(7, this, arrayList, eVar));
                }
            }
        }
    }
}
