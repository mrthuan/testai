package lib.zj.pdfeditor;

import android.graphics.RectF;
import java.util.HashMap;

/* compiled from: PageView.java */
/* loaded from: classes3.dex */
public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    public final TextChar[][] f21601a;

    /* renamed from: b  reason: collision with root package name */
    public final RectF f21602b;
    public final HashMap<TextChar, Boolean> c = new HashMap<>();

    public t0(TextChar[][] textCharArr, RectF rectF) {
        this.f21601a = textCharArr;
        this.f21602b = rectF;
    }

    public static boolean b(TextChar[] textCharArr) {
        if (textCharArr == null || textCharArr.length == 0) {
            return false;
        }
        for (TextChar textChar : textCharArr) {
            if (textChar != null && !Character.isWhitespace(textChar.c)) {
                return true;
            }
        }
        return false;
    }

    public final void a(s0 s0Var) {
        TextChar[][] textCharArr;
        boolean z10;
        float f10;
        float f11;
        int i10 = 0;
        for (TextChar[] textCharArr2 : this.f21601a) {
            if (b(textCharArr2)) {
                TextChar textChar = textCharArr2[0];
                float f12 = ((RectF) textChar).bottom;
                RectF rectF = this.f21602b;
                if (f12 > rectF.top) {
                    float f13 = ((RectF) textChar).top;
                    if (f13 < rectF.bottom) {
                        float abs = Math.abs(f12 - f13);
                        TextChar textChar2 = textCharArr2[0];
                        boolean z11 = true;
                        if (((RectF) textChar2).top - rectF.top < abs && i10 == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f14 = ((RectF) textChar2).bottom;
                        float f15 = rectF.bottom;
                        if (Math.abs(f14 - f15) >= 1.0E-4f && Float.compare(f14, f15) < 0) {
                            z11 = false;
                        }
                        if (z10 && z11) {
                            f11 = Math.min(rectF.left, rectF.right);
                            f10 = Math.max(rectF.left, rectF.right);
                        } else {
                            f10 = Float.POSITIVE_INFINITY;
                            if (z10) {
                                f11 = rectF.left;
                            } else {
                                f11 = Float.NEGATIVE_INFINITY;
                                if (z11) {
                                    f10 = rectF.right;
                                }
                            }
                        }
                        s0Var.c();
                        for (TextChar textChar3 : textCharArr2) {
                            if (textChar3 != null && !textChar3.isInvalid && ((RectF) textChar3).right > f11 && ((RectF) textChar3).left < f10) {
                                s0Var.b(textChar3);
                            }
                        }
                        s0Var.a();
                        i10++;
                    }
                }
            }
        }
    }
}
