package mj;

import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Result;
import lib.zj.pdfeditor.Annotation;

/* compiled from: TextEditorHelper.java */
/* loaded from: classes3.dex */
public final class o extends b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f22123b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ lib.zj.pdfeditor.text.editor.a f22124d;

    public o(lib.zj.pdfeditor.text.editor.a aVar, int i10, String str) {
        this.f22124d = aVar;
        this.f22123b = i10;
        this.c = str;
    }

    @Override // mj.d0
    public final int getPriority() {
        return 85;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        Integer m13constructorimpl;
        Pair pair;
        boolean z10;
        lib.zj.pdfeditor.text.editor.a aVar = this.f22124d;
        if (aVar.f21683d != null && this.f22123b == aVar.f21685e) {
            float[] fArr = new float[9];
            Matrix matrix = new Matrix();
            float editorScale = this.f22124d.f21687f.getEditorScale();
            float f10 = 1.0f / editorScale;
            matrix.postScale(f10, f10);
            matrix.getValues(fArr);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(this.c, options);
            int i11 = options.outWidth;
            if (i11 > 0 && (i10 = options.outHeight) > 0) {
                float f11 = i11;
                float f12 = i10;
                String path = this.c;
                kotlin.jvm.internal.g.e(path, "path");
                try {
                    m13constructorimpl = Result.m13constructorimpl(Integer.valueOf(new j1.a(path).i(0, ea.a.p("fHIiZR10A3Qbb24=", "tHStECsW"))));
                } catch (Throwable th2) {
                    m13constructorimpl = Result.m13constructorimpl(androidx.activity.s.v(th2));
                }
                if (Result.m18isFailureimpl(m13constructorimpl)) {
                    m13constructorimpl = 0;
                }
                int intValue = ((Number) m13constructorimpl).intValue();
                if (intValue != 5 && intValue != 6 && intValue != 7 && intValue != 8) {
                    pair = new Pair(Float.valueOf(f11), Float.valueOf(f12));
                } else {
                    pair = new Pair(Float.valueOf(f12), Float.valueOf(f11));
                }
                float min = Math.min(this.f22124d.f21687f.getMeasuredWidth() / ((Float) pair.getFirst()).floatValue(), this.f22124d.f21687f.getMeasuredHeight() / ((Float) pair.getSecond()).floatValue()) / 2.0f;
                float f13 = (f11 / editorScale) * min;
                float f14 = (f12 / editorScale) * min;
                matrix.postScale(min, min);
                float f15 = f13 / 2.0f;
                float f16 = f14 / 2.0f;
                switch (intValue) {
                    case 0:
                    case 1:
                        z10 = false;
                        break;
                    case 2:
                        z10 = matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 3:
                        z10 = matrix.postRotate(180.0f, f15, f16);
                        break;
                    case 4:
                        z10 = matrix.postScale(1.0f, -1.0f);
                        break;
                    case 5:
                        matrix.postScale(-1.0f, 1.0f);
                        z10 = matrix.postRotate(270.0f, f15, f16);
                        break;
                    case 6:
                        z10 = matrix.postRotate(90.0f, f15, f16);
                        break;
                    case 7:
                        matrix.postScale(-1.0f, 1.0f);
                        z10 = matrix.postRotate(90.0f, f15, f16);
                        break;
                    case 8:
                        z10 = matrix.postRotate(270.0f, f15, f16);
                        break;
                    default:
                        ea.a.p("dngiZg==", "IJvKxXSn");
                        z10 = false;
                        break;
                }
                if (z10) {
                    matrix.postTranslate((f14 - f13) / 2.0f, (f13 - f14) / 2.0f);
                }
                matrix.postTranslate(Math.abs((this.f22124d.f21687f.getMeasuredWidth() / editorScale) - ((((Float) pair.getFirst()).floatValue() / editorScale) * min)) / 2.0f, Math.abs((this.f22124d.f21687f.getMeasuredHeight() / editorScale) - ((((Float) pair.getSecond()).floatValue() / editorScale) * min)) / 2.0f);
                matrix.getValues(fArr);
            }
            if (this.f22124d.f21683d.insertImgToPageByMatrix(this.f22123b, this.c, fArr)) {
                this.f22124d.f21683d.recordEditorTextOrImageAction(this.f22123b);
                lib.zj.pdfeditor.text.editor.a.f(this.f22124d);
                ArrayList arrayList = new ArrayList();
                Annotation[] pageImageInfo = this.f22124d.f21683d.getPageImageInfo(this.f22123b);
                if (pageImageInfo != null && pageImageInfo.length > 0) {
                    for (Annotation annotation : pageImageInfo) {
                        arrayList.add(new e(annotation));
                    }
                    this.f22124d.f21678a.post(new androidx.fragment.app.g(12, this, arrayList));
                    return;
                }
                this.f22124d.f21678a.post(new androidx.activity.i(this, 21));
                return;
            }
            this.f22124d.f21678a.post(new b1.e(this, 12));
        }
    }
}
