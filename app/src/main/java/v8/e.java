package v8;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes2.dex */
public final class e implements TypeEvaluator<Float> {

    /* renamed from: a  reason: collision with root package name */
    public final FloatEvaluator f30774a = new FloatEvaluator();

    @Override // android.animation.TypeEvaluator
    public final Float evaluate(float f10, Float f11, Float f12) {
        float floatValue = this.f30774a.evaluate(f10, (Number) f11, (Number) f12).floatValue();
        if (floatValue < 0.1f) {
            floatValue = 0.0f;
        }
        return Float.valueOf(floatValue);
    }
}
