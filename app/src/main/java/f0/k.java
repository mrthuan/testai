package f0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: KeyTrigger.java */
/* loaded from: classes.dex */
public final class k extends d {

    /* renamed from: q  reason: collision with root package name */
    public float f16918q;

    /* renamed from: e  reason: collision with root package name */
    public String f16906e = null;

    /* renamed from: f  reason: collision with root package name */
    public int f16907f = -1;

    /* renamed from: g  reason: collision with root package name */
    public String f16908g = null;

    /* renamed from: h  reason: collision with root package name */
    public String f16909h = null;

    /* renamed from: i  reason: collision with root package name */
    public int f16910i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f16911j = -1;

    /* renamed from: k  reason: collision with root package name */
    public View f16912k = null;

    /* renamed from: l  reason: collision with root package name */
    public float f16913l = 0.1f;

    /* renamed from: m  reason: collision with root package name */
    public boolean f16914m = true;

    /* renamed from: n  reason: collision with root package name */
    public boolean f16915n = true;

    /* renamed from: o  reason: collision with root package name */
    public boolean f16916o = true;

    /* renamed from: p  reason: collision with root package name */
    public float f16917p = Float.NaN;

    /* renamed from: r  reason: collision with root package name */
    public boolean f16919r = false;

    /* renamed from: s  reason: collision with root package name */
    public int f16920s = -1;

    /* renamed from: t  reason: collision with root package name */
    public int f16921t = -1;

    /* renamed from: u  reason: collision with root package name */
    public int f16922u = -1;

    /* renamed from: v  reason: collision with root package name */
    public RectF f16923v = new RectF();

    /* renamed from: w  reason: collision with root package name */
    public RectF f16924w = new RectF();

    /* renamed from: x  reason: collision with root package name */
    public HashMap<String, Method> f16925x = new HashMap<>();

    /* compiled from: KeyTrigger.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseIntArray f16926a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f16926a = sparseIntArray;
            sparseIntArray.append(0, 8);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 1);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(7, 6);
            sparseIntArray.append(9, 5);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(2, 10);
            sparseIntArray.append(8, 11);
            sparseIntArray.append(10, 12);
            sparseIntArray.append(11, 13);
            sparseIntArray.append(12, 14);
        }
    }

    public k() {
        this.f16838d = new HashMap<>();
    }

    public static void j(RectF rectF, View view, boolean z10) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z10) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // f0.d
    /* renamed from: b */
    public final d clone() {
        k kVar = new k();
        super.c(this);
        kVar.f16906e = this.f16906e;
        kVar.f16907f = this.f16907f;
        kVar.f16908g = this.f16908g;
        kVar.f16909h = this.f16909h;
        kVar.f16910i = this.f16910i;
        kVar.f16911j = this.f16911j;
        kVar.f16912k = this.f16912k;
        kVar.f16913l = this.f16913l;
        kVar.f16914m = this.f16914m;
        kVar.f16915n = this.f16915n;
        kVar.f16916o = this.f16916o;
        kVar.f16917p = this.f16917p;
        kVar.f16918q = this.f16918q;
        kVar.f16919r = this.f16919r;
        kVar.f16923v = this.f16923v;
        kVar.f16924w = this.f16924w;
        kVar.f16925x = this.f16925x;
        return kVar;
    }

    @Override // f0.d
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g0.d.f17351n);
        SparseIntArray sparseIntArray = a.f16926a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            SparseIntArray sparseIntArray2 = a.f16926a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f16908g = obtainStyledAttributes.getString(index);
                    break;
                case 2:
                    this.f16909h = obtainStyledAttributes.getString(index);
                    break;
                case 3:
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
                case 4:
                    this.f16906e = obtainStyledAttributes.getString(index);
                    break;
                case 5:
                    this.f16913l = obtainStyledAttributes.getFloat(index, this.f16913l);
                    break;
                case 6:
                    this.f16910i = obtainStyledAttributes.getResourceId(index, this.f16910i);
                    break;
                case 7:
                    if (MotionLayout.F0) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f16837b);
                        this.f16837b = resourceId;
                        if (resourceId == -1) {
                            this.c = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.c = obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.f16837b = obtainStyledAttributes.getResourceId(index, this.f16837b);
                        break;
                    }
                case 8:
                    int integer = obtainStyledAttributes.getInteger(index, this.f16836a);
                    this.f16836a = integer;
                    this.f16917p = (integer + 0.5f) / 100.0f;
                    break;
                case 9:
                    this.f16911j = obtainStyledAttributes.getResourceId(index, this.f16911j);
                    break;
                case 10:
                    this.f16919r = obtainStyledAttributes.getBoolean(index, this.f16919r);
                    break;
                case 11:
                    this.f16907f = obtainStyledAttributes.getResourceId(index, this.f16907f);
                    break;
                case 12:
                    this.f16922u = obtainStyledAttributes.getResourceId(index, this.f16922u);
                    break;
                case 13:
                    this.f16920s = obtainStyledAttributes.getResourceId(index, this.f16920s);
                    break;
                case 14:
                    this.f16921t = obtainStyledAttributes.getResourceId(index, this.f16921t);
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(android.view.View r10, float r11) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.k.h(android.view.View, float):void");
    }

    public final void i(View view, String str) {
        Method method;
        boolean z10;
        if (str == null) {
            return;
        }
        if (str.startsWith(".")) {
            if (str.length() == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                str = str.substring(1).toLowerCase(Locale.ROOT);
            }
            for (String str2 : this.f16838d.keySet()) {
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                if (z10 || lowerCase.matches(str)) {
                    ConstraintAttribute constraintAttribute = this.f16838d.get(str2);
                    if (constraintAttribute != null) {
                        Class<?> cls = view.getClass();
                        boolean z11 = constraintAttribute.f3262a;
                        String str3 = constraintAttribute.f3263b;
                        if (!z11) {
                            str3 = a0.a.h("set", str3);
                        }
                        try {
                            switch (ConstraintAttribute.a.f3270a[constraintAttribute.c.ordinal()]) {
                                case 1:
                                case 6:
                                    cls.getMethod(str3, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f3264d));
                                    break;
                                case 2:
                                    cls.getMethod(str3, Boolean.TYPE).invoke(view, Boolean.valueOf(constraintAttribute.f3267g));
                                    break;
                                case 3:
                                    cls.getMethod(str3, CharSequence.class).invoke(view, constraintAttribute.f3266f);
                                    break;
                                case 4:
                                    cls.getMethod(str3, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f3268h));
                                    break;
                                case 5:
                                    Method method2 = cls.getMethod(str3, Drawable.class);
                                    ColorDrawable colorDrawable = new ColorDrawable();
                                    colorDrawable.setColor(constraintAttribute.f3268h);
                                    method2.invoke(view, colorDrawable);
                                    break;
                                case 7:
                                    cls.getMethod(str3, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f3265e));
                                    break;
                                case 8:
                                    cls.getMethod(str3, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f3265e));
                                    break;
                            }
                        } catch (IllegalAccessException e10) {
                            e10.printStackTrace();
                        } catch (NoSuchMethodException e11) {
                            e11.getMessage();
                        } catch (InvocationTargetException e12) {
                            e12.printStackTrace();
                        }
                    }
                }
            }
            return;
        }
        if (this.f16925x.containsKey(str)) {
            method = this.f16925x.get(str);
            if (method == null) {
                return;
            }
        } else {
            method = null;
        }
        if (method == null) {
            try {
                method = view.getClass().getMethod(str, new Class[0]);
                this.f16925x.put(str, method);
            } catch (NoSuchMethodException unused) {
                this.f16925x.put(str, null);
                view.getClass();
                f0.a.d(view);
                return;
            }
        }
        try {
            method.invoke(view, new Object[0]);
        } catch (Exception unused2) {
            view.getClass();
            f0.a.d(view);
        }
    }

    @Override // f0.d
    public final void a(HashMap<String, e0.d> hashMap) {
    }

    @Override // f0.d
    public final void d(HashSet<String> hashSet) {
    }
}
