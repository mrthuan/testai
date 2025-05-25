package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import g0.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* loaded from: classes.dex */
public final class ConstraintAttribute {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f3262a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3263b;
    public final AttributeType c;

    /* renamed from: d  reason: collision with root package name */
    public int f3264d;

    /* renamed from: e  reason: collision with root package name */
    public float f3265e;

    /* renamed from: f  reason: collision with root package name */
    public String f3266f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3267g;

    /* renamed from: h  reason: collision with root package name */
    public int f3268h;

    /* loaded from: classes.dex */
    public enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3270a;

        static {
            int[] iArr = new int[AttributeType.values().length];
            f3270a = iArr;
            try {
                iArr[AttributeType.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3270a[AttributeType.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3270a[AttributeType.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3270a[AttributeType.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3270a[AttributeType.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3270a[AttributeType.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3270a[AttributeType.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3270a[AttributeType.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public ConstraintAttribute(String str, AttributeType attributeType, Object obj, boolean z10) {
        this.f3262a = false;
        this.f3263b = str;
        this.c = attributeType;
        this.f3262a = z10;
        f(obj);
    }

    public static void d(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        AttributeType attributeType;
        Object valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), d.f17345h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        AttributeType attributeType2 = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                attributeType2 = AttributeType.BOOLEAN_TYPE;
            } else {
                if (index == 3) {
                    attributeType = AttributeType.COLOR_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == 2) {
                    attributeType = AttributeType.COLOR_DRAWABLE_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == 7) {
                    attributeType = AttributeType.DIMENSION_TYPE;
                    valueOf = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    attributeType = AttributeType.DIMENSION_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 5) {
                    attributeType = AttributeType.FLOAT_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == 6) {
                    attributeType = AttributeType.INT_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == 9) {
                    attributeType = AttributeType.STRING_TYPE;
                    valueOf = obtainStyledAttributes.getString(index);
                } else if (index == 8) {
                    attributeType = AttributeType.REFERENCE_TYPE;
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    valueOf = Integer.valueOf(resourceId);
                }
                Object obj2 = valueOf;
                attributeType2 = attributeType;
                obj = obj2;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new ConstraintAttribute(str, attributeType2, obj, z10));
        }
        obtainStyledAttributes.recycle();
    }

    public static void e(View view, HashMap<String, ConstraintAttribute> hashMap) {
        Class<?> cls = view.getClass();
        Iterator<String> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            ConstraintAttribute constraintAttribute = hashMap.get(next);
            if (!constraintAttribute.f3262a) {
                next = a0.a.h("set", next);
            }
            try {
                switch (a.f3270a[constraintAttribute.c.ordinal()]) {
                    case 1:
                        cls.getMethod(next, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f3264d));
                        break;
                    case 2:
                        cls.getMethod(next, Boolean.TYPE).invoke(view, Boolean.valueOf(constraintAttribute.f3267g));
                        break;
                    case 3:
                        cls.getMethod(next, CharSequence.class).invoke(view, constraintAttribute.f3266f);
                        break;
                    case 4:
                        cls.getMethod(next, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f3268h));
                        break;
                    case 5:
                        Method method = cls.getMethod(next, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(constraintAttribute.f3268h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 6:
                        cls.getMethod(next, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f3264d));
                        break;
                    case 7:
                        cls.getMethod(next, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f3265e));
                        break;
                    case 8:
                        cls.getMethod(next, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f3265e));
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

    public final float a() {
        switch (a.f3270a[this.c.ordinal()]) {
            case 2:
                if (this.f3267g) {
                    return 1.0f;
                }
                return 0.0f;
            case 3:
                throw new RuntimeException("Cannot interpolate String");
            case 4:
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                return this.f3264d;
            case 7:
                return this.f3265e;
            case 8:
                return this.f3265e;
            default:
                return Float.NaN;
        }
    }

    public final void b(float[] fArr) {
        float f10;
        switch (a.f3270a[this.c.ordinal()]) {
            case 2:
                if (this.f3267g) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                fArr[0] = f10;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int i10 = this.f3268h;
                int i11 = (i10 >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC;
                int i12 = (i10 >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC;
                int i13 = (i10 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC;
                int i14 = i10 & FunctionEval.FunctionID.EXTERNAL_FUNC;
                float pow = (float) Math.pow(i12 / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(i13 / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = (float) Math.pow(i14 / 255.0f, 2.2d);
                fArr[3] = i11 / 255.0f;
                return;
            case 6:
                fArr[0] = this.f3264d;
                return;
            case 7:
                fArr[0] = this.f3265e;
                return;
            case 8:
                fArr[0] = this.f3265e;
                return;
            default:
                return;
        }
    }

    public final int c() {
        int i10 = a.f3270a[this.c.ordinal()];
        if (i10 == 4 || i10 == 5) {
            return 4;
        }
        return 1;
    }

    public final void f(Object obj) {
        switch (a.f3270a[this.c.ordinal()]) {
            case 1:
            case 6:
                this.f3264d = ((Integer) obj).intValue();
                return;
            case 2:
                this.f3267g = ((Boolean) obj).booleanValue();
                return;
            case 3:
                this.f3266f = (String) obj;
                return;
            case 4:
            case 5:
                this.f3268h = ((Integer) obj).intValue();
                return;
            case 7:
                this.f3265e = ((Float) obj).floatValue();
                return;
            case 8:
                this.f3265e = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public ConstraintAttribute(ConstraintAttribute constraintAttribute, Object obj) {
        this.f3262a = false;
        this.f3263b = constraintAttribute.f3263b;
        this.c = constraintAttribute.c;
        f(obj);
    }
}
