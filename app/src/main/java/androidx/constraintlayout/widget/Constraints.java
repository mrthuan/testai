package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import g0.d;
import java.util.HashMap;

/* loaded from: classes.dex */
public class Constraints extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public androidx.constraintlayout.widget.a f3344a;

    public Constraints(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public androidx.constraintlayout.widget.a getConstraintSet() {
        if (this.f3344a == null) {
            this.f3344a = new androidx.constraintlayout.widget.a();
        }
        androidx.constraintlayout.widget.a aVar = this.f3344a;
        aVar.getClass();
        int childCount = getChildCount();
        HashMap<Integer, a.C0012a> hashMap = aVar.f3369f;
        hashMap.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            a aVar2 = (a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (aVar.f3368e && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id2))) {
                hashMap.put(Integer.valueOf(id2), new a.C0012a());
            }
            a.C0012a c0012a = hashMap.get(Integer.valueOf(id2));
            if (c0012a != null) {
                if (childAt instanceof ConstraintHelper) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) childAt;
                    c0012a.d(id2, aVar2);
                    if (constraintHelper instanceof Barrier) {
                        a.b bVar = c0012a.f3373e;
                        bVar.f3405i0 = 1;
                        Barrier barrier = (Barrier) constraintHelper;
                        bVar.f3401g0 = barrier.getType();
                        bVar.f3407j0 = barrier.getReferencedIds();
                        bVar.f3403h0 = barrier.getMargin();
                    }
                }
                c0012a.d(id2, aVar2);
            }
        }
        return this.f3344a;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        super.setVisibility(8);
    }

    /* loaded from: classes.dex */
    public static class a extends ConstraintLayout.b {
        public final float A0;
        public final float B0;
        public final float C0;
        public final float D0;

        /* renamed from: r0  reason: collision with root package name */
        public final float f3345r0;

        /* renamed from: s0  reason: collision with root package name */
        public final boolean f3346s0;

        /* renamed from: t0  reason: collision with root package name */
        public final float f3347t0;

        /* renamed from: u0  reason: collision with root package name */
        public final float f3348u0;

        /* renamed from: v0  reason: collision with root package name */
        public final float f3349v0;

        /* renamed from: w0  reason: collision with root package name */
        public final float f3350w0;

        /* renamed from: x0  reason: collision with root package name */
        public final float f3351x0;

        /* renamed from: y0  reason: collision with root package name */
        public final float f3352y0;

        /* renamed from: z0  reason: collision with root package name */
        public final float f3353z0;

        public a() {
            this.f3345r0 = 1.0f;
            this.f3346s0 = false;
            this.f3347t0 = 0.0f;
            this.f3348u0 = 0.0f;
            this.f3349v0 = 0.0f;
            this.f3350w0 = 0.0f;
            this.f3351x0 = 1.0f;
            this.f3352y0 = 1.0f;
            this.f3353z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3345r0 = 1.0f;
            this.f3346s0 = false;
            this.f3347t0 = 0.0f;
            this.f3348u0 = 0.0f;
            this.f3349v0 = 0.0f;
            this.f3350w0 = 0.0f;
            this.f3351x0 = 1.0f;
            this.f3352y0 = 1.0f;
            this.f3353z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.f17344g);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 15) {
                    this.f3345r0 = obtainStyledAttributes.getFloat(index, this.f3345r0);
                } else if (index == 28) {
                    this.f3347t0 = obtainStyledAttributes.getFloat(index, this.f3347t0);
                    this.f3346s0 = true;
                } else if (index == 23) {
                    this.f3349v0 = obtainStyledAttributes.getFloat(index, this.f3349v0);
                } else if (index == 24) {
                    this.f3350w0 = obtainStyledAttributes.getFloat(index, this.f3350w0);
                } else if (index == 22) {
                    this.f3348u0 = obtainStyledAttributes.getFloat(index, this.f3348u0);
                } else if (index == 20) {
                    this.f3351x0 = obtainStyledAttributes.getFloat(index, this.f3351x0);
                } else if (index == 21) {
                    this.f3352y0 = obtainStyledAttributes.getFloat(index, this.f3352y0);
                } else if (index == 16) {
                    this.f3353z0 = obtainStyledAttributes.getFloat(index, this.f3353z0);
                } else if (index == 17) {
                    this.A0 = obtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == 18) {
                    this.B0 = obtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == 19) {
                    this.C0 = obtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == 27) {
                    this.D0 = obtainStyledAttributes.getFloat(index, this.D0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
