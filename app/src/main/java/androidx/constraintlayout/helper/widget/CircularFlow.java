package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import g0.d;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class CircularFlow extends VirtualLayout {

    /* renamed from: u  reason: collision with root package name */
    public static int f2956u;

    /* renamed from: v  reason: collision with root package name */
    public static float f2957v;

    /* renamed from: k  reason: collision with root package name */
    public ConstraintLayout f2958k;

    /* renamed from: l  reason: collision with root package name */
    public int f2959l;

    /* renamed from: m  reason: collision with root package name */
    public float[] f2960m;

    /* renamed from: n  reason: collision with root package name */
    public int[] f2961n;

    /* renamed from: o  reason: collision with root package name */
    public int f2962o;

    /* renamed from: p  reason: collision with root package name */
    public int f2963p;

    /* renamed from: q  reason: collision with root package name */
    public String f2964q;

    /* renamed from: r  reason: collision with root package name */
    public String f2965r;

    /* renamed from: s  reason: collision with root package name */
    public Float f2966s;

    /* renamed from: t  reason: collision with root package name */
    public Integer f2967t;

    public CircularFlow(Context context) {
        super(context);
    }

    private void setAngles(String str) {
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f2963p = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                v(str.substring(i10).trim());
                return;
            } else {
                v(str.substring(i10, indexOf).trim());
                i10 = indexOf + 1;
            }
        }
    }

    private void setRadius(String str) {
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f2962o = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                w(str.substring(i10).trim());
                return;
            } else {
                w(str.substring(i10, indexOf).trim());
                i10 = indexOf + 1;
            }
        }
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.f2960m, this.f2963p);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.f2961n, this.f2962o);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void n(AttributeSet attributeSet) {
        super.n(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.c);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 33) {
                    this.f2959l = obtainStyledAttributes.getResourceId(index, 0);
                } else if (index == 29) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f2964q = string;
                    setAngles(string);
                } else if (index == 32) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f2965r = string2;
                    setRadius(string2);
                } else if (index == 30) {
                    Float valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, f2957v));
                    this.f2966s = valueOf;
                    setDefaultAngle(valueOf.floatValue());
                } else if (index == 31) {
                    Integer valueOf2 = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, f2956u));
                    this.f2967t = valueOf2;
                    setDefaultRadius(valueOf2.intValue());
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f2964q;
        if (str != null) {
            this.f2960m = new float[1];
            setAngles(str);
        }
        String str2 = this.f2965r;
        if (str2 != null) {
            this.f2961n = new int[1];
            setRadius(str2);
        }
        Float f10 = this.f2966s;
        if (f10 != null) {
            setDefaultAngle(f10.floatValue());
        }
        Integer num = this.f2967t;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        this.f2958k = (ConstraintLayout) getParent();
        for (int i10 = 0; i10 < this.f3272b; i10++) {
            View c = this.f2958k.c(this.f3271a[i10]);
            if (c != null) {
                int i11 = f2956u;
                float f11 = f2957v;
                int[] iArr = this.f2961n;
                HashMap<Integer, String> hashMap = this.f3277h;
                if (iArr != null && i10 < iArr.length) {
                    i11 = iArr[i10];
                } else {
                    Integer num2 = this.f2967t;
                    if (num2 != null && num2.intValue() != -1) {
                        this.f2962o++;
                        if (this.f2961n == null) {
                            this.f2961n = new int[1];
                        }
                        int[] radius = getRadius();
                        this.f2961n = radius;
                        radius[this.f2962o - 1] = i11;
                    } else {
                        hashMap.get(Integer.valueOf(c.getId()));
                    }
                }
                float[] fArr = this.f2960m;
                if (fArr != null && i10 < fArr.length) {
                    f11 = fArr[i10];
                } else {
                    Float f12 = this.f2966s;
                    if (f12 != null && f12.floatValue() != -1.0f) {
                        this.f2963p++;
                        if (this.f2960m == null) {
                            this.f2960m = new float[1];
                        }
                        float[] angles = getAngles();
                        this.f2960m = angles;
                        angles[this.f2963p - 1] = f11;
                    } else {
                        hashMap.get(Integer.valueOf(c.getId()));
                    }
                }
                ConstraintLayout.b bVar = (ConstraintLayout.b) c.getLayoutParams();
                bVar.f3327r = f11;
                bVar.f3323p = this.f2959l;
                bVar.f3325q = i11;
                c.setLayoutParams(bVar);
            }
        }
        h();
    }

    public void setDefaultAngle(float f10) {
        f2957v = f10;
    }

    public void setDefaultRadius(int i10) {
        f2956u = i10;
    }

    public final void v(String str) {
        float[] fArr;
        if (str == null || str.length() == 0 || this.c == null || (fArr = this.f2960m) == null) {
            return;
        }
        if (this.f2963p + 1 > fArr.length) {
            this.f2960m = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.f2960m[this.f2963p] = Integer.parseInt(str);
        this.f2963p++;
    }

    public final void w(String str) {
        Context context;
        int[] iArr;
        if (str == null || str.length() == 0 || (context = this.c) == null || (iArr = this.f2961n) == null) {
            return;
        }
        if (this.f2962o + 1 > iArr.length) {
            this.f2961n = Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.f2961n[this.f2962o] = (int) (Integer.parseInt(str) * context.getResources().getDisplayMetrics().density);
        this.f2962o++;
    }

    public CircularFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircularFlow(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
