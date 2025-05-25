package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import lib.zj.office.fc.hslf.record.SlideAtom;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2290a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2291b;
    public int c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = -1;
        int[] iArr = k.a.f19439l;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        x0.f0.n(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f2290a = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f2290a);
        }
    }

    private void setStacked(boolean z10) {
        int i10;
        int i11;
        if (this.f2291b != z10) {
            if (!z10 || this.f2290a) {
                this.f2291b = z10;
                setOrientation(z10 ? 1 : 0);
                if (z10) {
                    i10 = 8388613;
                } else {
                    i10 = 80;
                }
                setGravity(i10);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    if (z10) {
                        i11 = 8;
                    } else {
                        i11 = 4;
                    }
                    findViewById.setVisibility(i11);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        int paddingBottom;
        boolean z11;
        int size = View.MeasureSpec.getSize(i10);
        int i14 = 0;
        if (this.f2290a) {
            if (size > this.c && this.f2291b) {
                setStacked(false);
            }
            this.c = size;
        }
        if (!this.f2291b && View.MeasureSpec.getMode(i10) == 1073741824) {
            i12 = View.MeasureSpec.makeMeasureSpec(size, SlideAtom.USES_MASTER_SLIDE_ID);
            z10 = true;
        } else {
            i12 = i10;
            z10 = false;
        }
        super.onMeasure(i12, i11);
        if (this.f2290a && !this.f2291b) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                setStacked(true);
                z10 = true;
            }
        }
        if (z10) {
            super.onMeasure(i10, i11);
        }
        int childCount = getChildCount();
        int i15 = 0;
        while (true) {
            i13 = -1;
            if (i15 < childCount) {
                if (getChildAt(i15).getVisibility() == 0) {
                    break;
                }
                i15++;
            } else {
                i15 = -1;
                break;
            }
        }
        if (i15 >= 0) {
            View childAt = getChildAt(i15);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            i14 = 0 + childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f2291b) {
                int i16 = i15 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i16 >= childCount2) {
                        break;
                    } else if (getChildAt(i16).getVisibility() == 0) {
                        i13 = i16;
                        break;
                    } else {
                        i16++;
                    }
                }
                if (i13 >= 0) {
                    paddingBottom = getChildAt(i13).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                paddingBottom = getPaddingBottom();
            }
            i14 += paddingBottom;
        }
        WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
        if (f0.d.d(this) != i14) {
            setMinimumHeight(i14);
            if (i11 == 0) {
                super.onMeasure(i10, i11);
            }
        }
    }

    public void setAllowStacking(boolean z10) {
        if (this.f2290a != z10) {
            this.f2290a = z10;
            if (!z10 && this.f2291b) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
