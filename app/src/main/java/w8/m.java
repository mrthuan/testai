package w8;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* compiled from: RectEvaluator.java */
/* loaded from: classes2.dex */
public final class m implements TypeEvaluator<Rect> {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f31042a;

    public m(Rect rect) {
        this.f31042a = rect;
    }

    @Override // android.animation.TypeEvaluator
    public final Rect evaluate(float f10, Rect rect, Rect rect2) {
        Rect rect3 = rect;
        Rect rect4 = rect2;
        int i10 = rect3.left;
        int i11 = i10 + ((int) ((rect4.left - i10) * f10));
        int i12 = rect3.top;
        int i13 = i12 + ((int) ((rect4.top - i12) * f10));
        int i14 = rect3.right;
        int i15 = rect3.bottom;
        int i16 = i15 + ((int) ((rect4.bottom - i15) * f10));
        Rect rect5 = this.f31042a;
        rect5.set(i11, i13, i14 + ((int) ((rect4.right - i14) * f10)), i16);
        return rect5;
    }
}
