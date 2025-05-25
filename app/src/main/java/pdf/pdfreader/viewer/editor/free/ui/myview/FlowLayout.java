package pdf.pdfreader.viewer.editor.free.ui.myview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.d;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.a;

/* loaded from: classes3.dex */
public class FlowLayout extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public boolean f28077a;

    /* renamed from: b  reason: collision with root package name */
    public int f28078b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f28079d;

    /* renamed from: e  reason: collision with root package name */
    public float f28080e;

    /* renamed from: f  reason: collision with root package name */
    public float f28081f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f28082g;

    /* renamed from: h  reason: collision with root package name */
    public int f28083h;

    /* renamed from: i  reason: collision with root package name */
    public int f28084i;

    /* renamed from: j  reason: collision with root package name */
    public int f28085j;

    /* renamed from: k  reason: collision with root package name */
    public int f28086k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f28087l;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList f28088m;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList f28089n;

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList f28090o;

    public FlowLayout(Context context) {
        this(context, null);
    }

    public static float c(int i10, int i11, int i12, int i13) {
        if (i10 == -65536) {
            if (i13 > 1) {
                return (i11 - i12) / (i13 - 1);
            }
            return 0.0f;
        }
        return i10;
    }

    public final float a() {
        return TypedValue.applyDimension(1, 0.0f, getResources().getDisplayMetrics());
    }

    public final int b(int i10, int i11, int i12, int i13) {
        if (this.f28078b != -65536) {
            ArrayList arrayList = this.f28089n;
            if (i13 < arrayList.size()) {
                ArrayList arrayList2 = this.f28090o;
                if (i13 < arrayList2.size() && ((Integer) arrayList2.get(i13)).intValue() > 0) {
                    if (i10 != 1) {
                        if (i10 == 5) {
                            return (i11 - i12) - ((Integer) arrayList.get(i13)).intValue();
                        }
                    } else {
                        return ((i11 - i12) - ((Integer) arrayList.get(i13)).intValue()) / 2;
                    }
                }
            }
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public int getChildSpacing() {
        return this.f28078b;
    }

    public int getChildSpacingForLastRow() {
        return this.f28079d;
    }

    public int getMaxRows() {
        return this.f28083h;
    }

    public int getMinChildSpacing() {
        return this.c;
    }

    public float getRowSpacing() {
        return this.f28080e;
    }

    public int getRowsCount() {
        return this.f28090o.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0176  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r25, int r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.myview.FlowLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        float f10;
        int i13;
        int min;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        float f11;
        int i23;
        int i24;
        int i25;
        int i26;
        View view;
        int i27;
        int i28;
        int i29;
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        ArrayList arrayList = this.f28087l;
        arrayList.clear();
        ArrayList arrayList2 = this.f28088m;
        arrayList2.clear();
        ArrayList arrayList3 = this.f28089n;
        arrayList3.clear();
        ArrayList arrayList4 = this.f28090o;
        arrayList4.clear();
        int childCount = getChildCount();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        if (mode != 0 && this.f28077a) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i30 = this.f28078b;
        if (i30 == -65536 && mode == 0) {
            i12 = 0;
        } else {
            i12 = i30;
        }
        if (i12 == -65536) {
            f10 = this.c;
        } else {
            f10 = i12;
        }
        float f12 = f10;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        while (i33 < childCount) {
            float f13 = f12;
            View childAt = getChildAt(i33);
            int i38 = i31;
            int i39 = i32;
            if (childAt.getVisibility() == 8) {
                i18 = i33;
                i29 = i12;
                i20 = size;
                i21 = size2;
                i22 = childCount;
                f11 = f13;
                i31 = i38;
                i32 = i39;
                i25 = paddingLeft;
                i26 = mode2;
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    i22 = childCount;
                    i23 = i38;
                    i24 = i39;
                    i18 = i33;
                    i21 = size2;
                    f11 = f13;
                    i26 = mode2;
                    view = childAt;
                    i19 = i12;
                    i20 = size;
                    i25 = paddingLeft;
                    measureChildWithMargins(childAt, i10, 0, i11, i37);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    int i40 = marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                    i28 = marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    i27 = i40;
                } else {
                    i18 = i33;
                    i19 = i12;
                    i20 = size;
                    i21 = size2;
                    i22 = childCount;
                    f11 = f13;
                    i23 = i38;
                    i24 = i39;
                    i25 = paddingLeft;
                    i26 = mode2;
                    view = childAt;
                    measureChild(view, i10, i11);
                    i27 = 0;
                    i28 = 0;
                }
                int measuredWidth = view.getMeasuredWidth() + i27;
                int measuredHeight = view.getMeasuredHeight() + i28;
                if (z10 && i23 + measuredWidth > i25) {
                    int i41 = i36;
                    i29 = i19;
                    arrayList.add(Float.valueOf(c(i29, i25, i35, i41)));
                    arrayList4.add(Integer.valueOf(i41));
                    arrayList2.add(Integer.valueOf(i24));
                    int i42 = (int) f11;
                    arrayList3.add(Integer.valueOf(i23 - i42));
                    if (arrayList.size() <= this.f28083h) {
                        i37 += i24;
                    }
                    i34 = Math.max(i34, i23);
                    i31 = measuredWidth + i42;
                    i36 = 1;
                    i32 = measuredHeight;
                    i35 = measuredWidth;
                } else {
                    i29 = i19;
                    i36++;
                    i35 = measuredWidth + i35;
                    i34 = i34;
                    i32 = Math.max(i24, measuredHeight);
                    i31 = (int) (measuredWidth + f11 + i23);
                }
            }
            i33 = i18 + 1;
            i12 = i29;
            paddingLeft = i25;
            f12 = f11;
            mode2 = i26;
            size = i20;
            childCount = i22;
            size2 = i21;
        }
        int i43 = i31;
        int i44 = i32;
        int i45 = size;
        int i46 = size2;
        int i47 = mode2;
        int i48 = i34;
        int i49 = i36;
        float f14 = f12;
        int i50 = i12;
        int i51 = paddingLeft;
        int i52 = i35;
        int i53 = this.f28079d;
        if (i53 == -65537) {
            if (arrayList.size() >= 1) {
                arrayList.add((Float) d.b(arrayList, 1));
            } else {
                arrayList.add(Float.valueOf(c(i50, i51, i52, i49)));
            }
        } else if (i53 != -65538) {
            arrayList.add(Float.valueOf(c(i53, i51, i52, i49)));
        } else {
            arrayList.add(Float.valueOf(c(i50, i51, i52, i49)));
        }
        arrayList4.add(Integer.valueOf(i49));
        arrayList2.add(Integer.valueOf(i44));
        arrayList3.add(Integer.valueOf(i43 - ((int) f14)));
        if (arrayList.size() <= this.f28083h) {
            i37 += i44;
        }
        int max = Math.max(i48, i43);
        if (i50 == -65536) {
            min = i45;
            i13 = min;
        } else if (mode == 0) {
            min = getPaddingRight() + getPaddingLeft() + max;
            i13 = i45;
        } else {
            i13 = i45;
            min = Math.min(getPaddingRight() + getPaddingLeft() + max, i13);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop() + i37;
        int min2 = Math.min(arrayList.size(), this.f28083h);
        float f15 = this.f28080e;
        if (f15 == -65536.0f && i47 == 0) {
            f15 = 0.0f;
        }
        if (f15 == -65536.0f) {
            if (min2 > 1) {
                this.f28081f = (i46 - paddingBottom) / (min2 - 1);
            } else {
                this.f28081f = 0.0f;
            }
            i15 = i46;
            i14 = i15;
        } else {
            this.f28081f = f15;
            if (min2 > 1) {
                float f16 = (f15 * (min2 - 1)) + paddingBottom;
                if (i47 == 0) {
                    paddingBottom = (int) f16;
                } else {
                    int i54 = (int) f16;
                    i14 = i46;
                    i15 = Math.min(i54, i14);
                }
            }
            i14 = i46;
            i15 = paddingBottom;
        }
        this.f28086k = i15;
        if (mode == 1073741824) {
            i16 = i13;
        } else {
            i16 = min;
        }
        if (i47 == 1073741824) {
            i17 = i14;
        } else {
            i17 = i15;
        }
        setMeasuredDimension(i16, i17);
    }

    public void setChildSpacing(int i10) {
        this.f28078b = i10;
        requestLayout();
    }

    public void setChildSpacingForLastRow(int i10) {
        this.f28079d = i10;
        requestLayout();
    }

    public void setFlow(boolean z10) {
        this.f28077a = z10;
        requestLayout();
    }

    public void setGravity(int i10) {
        if (this.f28084i != i10) {
            this.f28084i = i10;
            requestLayout();
        }
    }

    public void setMaxRows(int i10) {
        this.f28083h = i10;
        requestLayout();
    }

    public void setMinChildSpacing(int i10) {
        this.c = i10;
        requestLayout();
    }

    public void setRowSpacing(float f10) {
        this.f28080e = f10;
        requestLayout();
    }

    public void setRowVerticalGravity(int i10) {
        if (this.f28085j != i10) {
            this.f28085j = i10;
            requestLayout();
        }
    }

    public void setRtl(boolean z10) {
        this.f28082g = z10;
        requestLayout();
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28077a = true;
        this.f28078b = 0;
        this.c = 0;
        this.f28079d = -65538;
        this.f28080e = 0.0f;
        this.f28081f = 0.0f;
        this.f28082g = false;
        this.f28083h = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f28084i = -1;
        this.f28085j = -65536;
        this.f28087l = new ArrayList();
        this.f28088m = new ArrayList();
        this.f28089n = new ArrayList();
        this.f28090o = new ArrayList();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, a.c, 0, 0);
        try {
            this.f28077a = obtainStyledAttributes.getBoolean(3, true);
            try {
                this.f28078b = obtainStyledAttributes.getInt(1, 0);
            } catch (NumberFormatException unused) {
                this.f28078b = obtainStyledAttributes.getDimensionPixelSize(1, (int) a());
            }
            try {
                this.c = obtainStyledAttributes.getInt(5, 0);
            } catch (NumberFormatException unused2) {
                this.c = obtainStyledAttributes.getDimensionPixelSize(5, (int) a());
            }
            try {
                this.f28079d = obtainStyledAttributes.getInt(2, -65538);
            } catch (NumberFormatException unused3) {
                this.f28079d = obtainStyledAttributes.getDimensionPixelSize(2, (int) a());
            }
            try {
                this.f28080e = obtainStyledAttributes.getInt(6, 0);
            } catch (NumberFormatException unused4) {
                this.f28080e = obtainStyledAttributes.getDimension(6, a());
            }
            this.f28083h = obtainStyledAttributes.getInt(4, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            this.f28082g = obtainStyledAttributes.getBoolean(8, false);
            this.f28084i = obtainStyledAttributes.getInt(0, -1);
            this.f28085j = obtainStyledAttributes.getInt(7, -65536);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }
}
