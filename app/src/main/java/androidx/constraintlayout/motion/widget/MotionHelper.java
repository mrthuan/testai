package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import f0.n;
import java.util.HashMap;

/* loaded from: classes.dex */
public class MotionHelper extends ConstraintHelper implements MotionLayout.i {

    /* renamed from: i  reason: collision with root package name */
    public boolean f2995i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2996j;

    /* renamed from: k  reason: collision with root package name */
    public float f2997k;

    /* renamed from: l  reason: collision with root package name */
    public View[] f2998l;

    public MotionHelper(Context context) {
        super(context);
        this.f2995i = false;
        this.f2996j = false;
    }

    public float getProgress() {
        return this.f2997k;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void n(AttributeSet attributeSet) {
        super.n(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g0.d.f17356s);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 1) {
                    this.f2995i = obtainStyledAttributes.getBoolean(index, this.f2995i);
                } else if (index == 0) {
                    this.f2996j = obtainStyledAttributes.getBoolean(index, this.f2996j);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f10) {
        this.f2997k = f10;
        int i10 = 0;
        if (this.f3272b > 0) {
            this.f2998l = m((ConstraintLayout) getParent());
            while (i10 < this.f3272b) {
                View view = this.f2998l[i10];
                i10++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i10 < childCount) {
            boolean z10 = viewGroup.getChildAt(i10) instanceof MotionHelper;
            i10++;
        }
    }

    public MotionHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2995i = false;
        this.f2996j = false;
        n(attributeSet);
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2995i = false;
        this.f2996j = false;
        n(attributeSet);
    }

    public void a() {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
    public final void c() {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
    public final void d() {
    }

    public void b(int i10, MotionLayout motionLayout) {
    }

    public void u(MotionLayout motionLayout, HashMap<View, n> hashMap) {
    }
}
