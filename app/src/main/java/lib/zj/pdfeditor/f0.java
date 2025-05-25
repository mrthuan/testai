package lib.zj.pdfeditor;

import android.graphics.RectF;
import lib.zj.pdfeditor.PageView;

/* compiled from: PageView.java */
/* loaded from: classes3.dex */
public final class f0 extends AsyncTask<Void, Void, TextChar[][]> {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ PageView.q f21495i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ PageView f21496j;

    public f0(PageView pageView, b0 b0Var) {
        this.f21496j = pageView;
        this.f21495i = b0Var;
    }

    @Override // lib.zj.pdfeditor.AsyncTask
    public final TextChar[][] b(Void[] voidArr) {
        TextChar[][] text = this.f21496j.getText();
        if (text != null) {
            for (TextChar[] textCharArr : text) {
                if (textCharArr != null) {
                    for (int i10 = 0; i10 < textCharArr.length; i10++) {
                        TextChar textChar = textCharArr[i10];
                        if (!textChar.isInvalid) {
                            for (int i11 = i10 + 1; i11 < textCharArr.length; i11++) {
                                TextChar textChar2 = textCharArr[i11];
                                float abs = Math.abs(((RectF) textChar2).left - ((RectF) textChar2).right);
                                if (String.valueOf(textChar.c).equals(String.valueOf(textChar2.c)) && Math.abs(((RectF) textChar).left - ((RectF) textChar2).left) < abs && Float.compare(((RectF) textChar).top, ((RectF) textChar2).top) == 0 && Math.abs(((RectF) textChar).right - ((RectF) textChar2).right) < abs && Float.compare(((RectF) textChar).bottom, ((RectF) textChar2).bottom) == 0) {
                                    textChar2.isInvalid = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return text;
    }

    @Override // lib.zj.pdfeditor.AsyncTask
    public final void f(TextChar[][] textCharArr) {
        TextChar[][] textCharArr2 = textCharArr;
        PageView pageView = this.f21496j;
        if (pageView.isAttachedToWindow() && textCharArr2 != null) {
            pageView.f21311x = textCharArr2;
            pageView.q1();
            PageView.q qVar = this.f21495i;
            if (qVar != null) {
                ((b0) qVar).a();
            }
        }
    }
}
