package f8;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Property;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;

/* compiled from: MotionSpec.java */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final y.i<String, i> f17151a = new y.i<>();

    /* renamed from: b  reason: collision with root package name */
    public final y.i<String, PropertyValuesHolder[]> f17152b = new y.i<>();

    public static h a(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0) {
            return b(context, resourceId);
        }
        return null;
    }

    public static h b(Context context, int i10) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (loadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return c(arrayList);
        } catch (Exception unused) {
            Integer.toHexString(i10);
            return null;
        }
    }

    public static h c(ArrayList arrayList) {
        h hVar = new h();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) arrayList.get(i10);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                hVar.h(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
                    if (interpolator instanceof AccelerateInterpolator) {
                        interpolator = b.c;
                    } else if (interpolator instanceof DecelerateInterpolator) {
                        interpolator = b.f17143d;
                    }
                } else {
                    interpolator = b.f17142b;
                }
                i iVar = new i(startDelay, duration, interpolator);
                iVar.f17155d = objectAnimator.getRepeatCount();
                iVar.f17156e = objectAnimator.getRepeatMode();
                hVar.f17151a.put(propertyName, iVar);
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return hVar;
    }

    public final ObjectAnimator d(String str, ExtendedFloatingActionButton extendedFloatingActionButton, Property property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(extendedFloatingActionButton, e(str));
        ofPropertyValuesHolder.setProperty(property);
        f(str).a(ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }

    public final PropertyValuesHolder[] e(String str) {
        if (g(str)) {
            PropertyValuesHolder[] orDefault = this.f17152b.getOrDefault(str, null);
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[orDefault.length];
            for (int i10 = 0; i10 < orDefault.length; i10++) {
                propertyValuesHolderArr[i10] = orDefault[i10].clone();
            }
            return propertyValuesHolderArr;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        return this.f17151a.equals(((h) obj).f17151a);
    }

    public final i f(String str) {
        boolean z10;
        y.i<String, i> iVar = this.f17151a;
        if (iVar.getOrDefault(str, null) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return iVar.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    public final boolean g(String str) {
        if (this.f17152b.getOrDefault(str, null) != null) {
            return true;
        }
        return false;
    }

    public final void h(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f17152b.put(str, propertyValuesHolderArr);
    }

    public final int hashCode() {
        return this.f17151a.hashCode();
    }

    public final String toString() {
        return "\n" + h.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f17151a + "}\n";
    }
}
