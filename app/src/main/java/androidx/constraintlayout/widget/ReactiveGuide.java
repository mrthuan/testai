package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import g0.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ReactiveGuide extends View implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public int f3357a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3358b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3359d;

    public ReactiveGuide(Context context) {
        super(context);
        this.f3357a = -1;
        this.f3358b = false;
        this.c = 0;
        this.f3359d = true;
        super.setVisibility(8);
        a(null);
    }

    public final void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.f17341d);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 3) {
                    this.f3357a = obtainStyledAttributes.getResourceId(index, this.f3357a);
                } else if (index == 0) {
                    this.f3358b = obtainStyledAttributes.getBoolean(index, this.f3358b);
                } else if (index == 2) {
                    this.c = obtainStyledAttributes.getResourceId(index, this.c);
                } else if (index == 1) {
                    this.f3359d = obtainStyledAttributes.getBoolean(index, this.f3359d);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f3357a != -1) {
            ConstraintLayout.getSharedValues().a(this.f3357a, this);
        }
    }

    public int getApplyToConstraintSetId() {
        return this.c;
    }

    public int getAttributeId() {
        return this.f3357a;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setAnimateChange(boolean z10) {
        this.f3358b = z10;
    }

    public void setApplyToConstraintSetId(int i10) {
        this.c = i10;
    }

    public void setAttributeId(int i10) {
        HashSet<WeakReference<b.a>> hashSet;
        b sharedValues = ConstraintLayout.getSharedValues();
        int i11 = this.f3357a;
        if (i11 != -1 && (hashSet = sharedValues.f3461a.get(Integer.valueOf(i11))) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<WeakReference<b.a>> it = hashSet.iterator();
            while (it.hasNext()) {
                WeakReference<b.a> next = it.next();
                b.a aVar = next.get();
                if (aVar == null || aVar == this) {
                    arrayList.add(next);
                }
            }
            hashSet.removeAll(arrayList);
        }
        this.f3357a = i10;
        if (i10 != -1) {
            sharedValues.a(i10, this);
        }
    }

    public void setGuidelineBegin(int i10) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f3294a = i10;
        setLayoutParams(bVar);
    }

    public void setGuidelineEnd(int i10) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f3296b = i10;
        setLayoutParams(bVar);
    }

    public void setGuidelinePercent(float f10) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.c = f10;
        setLayoutParams(bVar);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3357a = -1;
        this.f3358b = false;
        this.c = 0;
        this.f3359d = true;
        super.setVisibility(8);
        a(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3357a = -1;
        this.f3358b = false;
        this.c = 0;
        this.f3359d = true;
        super.setVisibility(8);
        a(attributeSet);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
    }
}
