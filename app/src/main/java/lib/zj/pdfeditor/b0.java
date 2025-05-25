package lib.zj.pdfeditor;

import android.graphics.RectF;
import java.util.HashMap;
import lib.zj.pdfeditor.PageView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements PageView.q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PageView f21469a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ float f21470b;
    public final /* synthetic */ float c;

    public /* synthetic */ b0(PageView pageView, float f10, float f11) {
        this.f21469a = pageView;
        this.f21470b = f10;
        this.c = f11;
    }

    public final void a() {
        TextChar[] textCharArr;
        int i10;
        int i11;
        int length;
        boolean z10;
        boolean z11;
        PageView pageView = this.f21469a;
        float f10 = this.f21470b;
        float f11 = this.c;
        if (!pageView.f21294o0) {
            TextChar[][] textCharArr2 = pageView.f21311x;
            new HashMap();
            if (textCharArr2 != null) {
                int length2 = textCharArr2.length;
                int i12 = 0;
                while (true) {
                    if (i12 < length2) {
                        textCharArr = textCharArr2[i12];
                        if (t0.b(textCharArr)) {
                            TextChar textChar = textCharArr[0];
                            if (((RectF) textChar).bottom + 5.0f > f11 && ((RectF) textChar).top - 5.0f < f11) {
                                break;
                            }
                        }
                        i12++;
                    } else {
                        textCharArr = null;
                        break;
                    }
                }
                if (textCharArr != null) {
                    int length3 = textCharArr.length - 1;
                    while (true) {
                        if (length3 >= 0) {
                            TextChar textChar2 = textCharArr[length3];
                            if (textChar2 != null && !textChar2.isInvalid && ((RectF) textChar2).right < f10) {
                                if (!Character.isWhitespace(textChar2.c) && !String.valueOf(textChar2.c).matches(".*[`~!@#$^&*()=|{}':;',\\[\\].<>/?~！@#￥……&*（）——|{}【】‘；：”“'。，、？《》].*")) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                                if (z11) {
                                    break;
                                }
                            }
                            length3--;
                        } else {
                            length3 = -1;
                            break;
                        }
                    }
                    if (length3 >= 0 && length3 < textCharArr.length - 1) {
                        i10 = length3 + 1;
                        i11 = 0;
                    } else {
                        i10 = 0;
                        i11 = 0;
                    }
                    while (true) {
                        if (i11 < textCharArr.length) {
                            TextChar textChar3 = textCharArr[i11];
                            if (textChar3 != null && !textChar3.isInvalid && ((RectF) textChar3).right > f10) {
                                if (!Character.isWhitespace(textChar3.c) && !String.valueOf(textChar3.c).matches(".*[`~!@#$^&*()=|{}':;',\\[\\].<>/?~！@#￥……&*（）——|{}【】‘；：”“'。，、？《》].*")) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                if (z10) {
                                    break;
                                }
                            }
                            i11++;
                        } else {
                            i11 = -1;
                            break;
                        }
                    }
                    if (i11 > 1) {
                        length = i11 - 1;
                    } else {
                        length = textCharArr.length - 1;
                    }
                    TextChar textChar4 = textCharArr[i10];
                    TextChar textChar5 = textCharArr[length];
                    RectF rectF = new RectF(((RectF) textChar4).left, Math.min(((RectF) textChar4).top, ((RectF) textChar5).top), ((RectF) textChar5).right, Math.max(textChar4.centerY(), textChar5.centerY()));
                    if (!pageView.f21294o0) {
                        pageView.f21309w = rectF;
                        pageView.q1();
                    }
                }
            }
        }
    }
}
