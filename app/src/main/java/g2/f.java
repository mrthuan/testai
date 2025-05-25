package g2;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.ArrayList;
import o0.d;

/* compiled from: AnimatorInflaterCompat.java */
/* loaded from: classes.dex */
public final class f {

    /* compiled from: AnimatorInflaterCompat.java */
    /* loaded from: classes.dex */
    public static class a implements TypeEvaluator<d.a[]> {

        /* renamed from: a  reason: collision with root package name */
        public d.a[] f17435a;

        @Override // android.animation.TypeEvaluator
        public final d.a[] evaluate(float f10, d.a[] aVarArr, d.a[] aVarArr2) {
            d.a[] aVarArr3 = aVarArr;
            d.a[] aVarArr4 = aVarArr2;
            if (o0.d.a(aVarArr3, aVarArr4)) {
                if (!o0.d.a(this.f17435a, aVarArr3)) {
                    this.f17435a = o0.d.e(aVarArr3);
                }
                for (int i10 = 0; i10 < aVarArr3.length; i10++) {
                    d.a aVar = this.f17435a[i10];
                    d.a aVar2 = aVarArr3[i10];
                    d.a aVar3 = aVarArr4[i10];
                    aVar.getClass();
                    aVar.f22643a = aVar2.f22643a;
                    int i11 = 0;
                    while (true) {
                        float[] fArr = aVar2.f22644b;
                        if (i11 < fArr.length) {
                            aVar.f22644b[i11] = (aVar3.f22644b[i11] * f10) + ((1.0f - f10) * fArr[i11]);
                            i11++;
                        }
                    }
                }
                return this.f17435a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x033d, code lost:
        if (r32 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x033f, code lost:
        if (r13 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0341, code lost:
        r1 = new android.animation.Animator[r13.size()];
        r2 = r13.iterator();
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0350, code lost:
        if (r2.hasNext() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0352, code lost:
        r1[r14] = (android.animation.Animator) r2.next();
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x035e, code lost:
        if (r33 != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0360, code lost:
        r32.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0364, code lost:
        r32.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0367, code lost:
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0316  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.Animator a(android.content.Context r27, android.content.res.Resources r28, android.content.res.Resources.Theme r29, android.content.res.XmlResourceParser r30, android.util.AttributeSet r31, android.animation.AnimatorSet r32, int r33) {
        /*
            Method dump skipped, instructions count: 872
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.f.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.content.res.XmlResourceParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    public static Keyframe b(Keyframe keyframe, float f10) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f10);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f10);
        }
        return Keyframe.ofObject(f10);
    }

    public static PropertyValuesHolder c(TypedArray typedArray, int i10, int i11, int i12, String str) {
        boolean z10;
        int i13;
        boolean z11;
        int i14;
        boolean z12;
        g gVar;
        int i15;
        PropertyValuesHolder ofInt;
        int i16;
        int i17;
        float f10;
        float f11;
        float f12;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i11);
        if (peekValue != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i13 = peekValue.type;
        } else {
            i13 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i12);
        if (peekValue2 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            i14 = peekValue2.type;
        } else {
            i14 = 0;
        }
        if (i10 == 4) {
            if ((z10 && d(i13)) || (z11 && d(i14))) {
                i10 = 3;
            } else {
                i10 = 0;
            }
        }
        if (i10 == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (i10 == 2) {
            String string = typedArray.getString(i11);
            String string2 = typedArray.getString(i12);
            d.a[] c = o0.d.c(string);
            d.a[] c10 = o0.d.c(string2);
            if (c == null && c10 == null) {
                return null;
            }
            if (c != null) {
                a aVar = new a();
                if (c10 != null) {
                    if (o0.d.a(c, c10)) {
                        ofObject = PropertyValuesHolder.ofObject(str, aVar, c, c10);
                    } else {
                        throw new InflateException(androidx.appcompat.view.menu.d.d(" Can't morph from ", string, " to ", string2));
                    }
                } else {
                    ofObject = PropertyValuesHolder.ofObject(str, aVar, c);
                }
                return ofObject;
            } else if (c10 == null) {
                return null;
            } else {
                return PropertyValuesHolder.ofObject(str, new a(), c10);
            }
        }
        if (i10 == 3) {
            gVar = g.f17436a;
        } else {
            gVar = null;
        }
        if (z12) {
            if (z10) {
                if (i13 == 5) {
                    f11 = typedArray.getDimension(i11, 0.0f);
                } else {
                    f11 = typedArray.getFloat(i11, 0.0f);
                }
                if (z11) {
                    if (i14 == 5) {
                        f12 = typedArray.getDimension(i12, 0.0f);
                    } else {
                        f12 = typedArray.getFloat(i12, 0.0f);
                    }
                    ofInt = PropertyValuesHolder.ofFloat(str, f11, f12);
                } else {
                    ofInt = PropertyValuesHolder.ofFloat(str, f11);
                }
            } else {
                if (i14 == 5) {
                    f10 = typedArray.getDimension(i12, 0.0f);
                } else {
                    f10 = typedArray.getFloat(i12, 0.0f);
                }
                ofInt = PropertyValuesHolder.ofFloat(str, f10);
            }
        } else if (z10) {
            if (i13 == 5) {
                i16 = (int) typedArray.getDimension(i11, 0.0f);
            } else if (d(i13)) {
                i16 = typedArray.getColor(i11, 0);
            } else {
                i16 = typedArray.getInt(i11, 0);
            }
            if (z11) {
                if (i14 == 5) {
                    i17 = (int) typedArray.getDimension(i12, 0.0f);
                } else if (d(i14)) {
                    i17 = typedArray.getColor(i12, 0);
                } else {
                    i17 = typedArray.getInt(i12, 0);
                }
                ofInt = PropertyValuesHolder.ofInt(str, i16, i17);
            } else {
                ofInt = PropertyValuesHolder.ofInt(str, i16);
            }
        } else {
            if (z11) {
                if (i14 == 5) {
                    i15 = (int) typedArray.getDimension(i12, 0.0f);
                } else if (d(i14)) {
                    i15 = typedArray.getColor(i12, 0);
                } else {
                    i15 = typedArray.getInt(i12, 0);
                }
                ofInt = PropertyValuesHolder.ofInt(str, i15);
            }
            if (propertyValuesHolder == null && gVar != null) {
                propertyValuesHolder.setEvaluator(gVar);
                return propertyValuesHolder;
            }
        }
        propertyValuesHolder = ofInt;
        return propertyValuesHolder == null ? propertyValuesHolder : propertyValuesHolder;
    }

    public static boolean d(int i10) {
        if (i10 >= 28 && i10 <= 31) {
            return true;
        }
        return false;
    }

    public static ValueAnimator e(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        TypedArray typedArray;
        TypedArray typedArray2;
        ValueAnimator valueAnimator3;
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        TypedArray f10 = n0.i.f(resources, theme, attributeSet, g2.a.f17417g);
        TypedArray f11 = n0.i.f(resources, theme, attributeSet, g2.a.f17421k);
        if (objectAnimator == null) {
            valueAnimator = new ValueAnimator();
        } else {
            valueAnimator = objectAnimator;
        }
        long c = n0.i.c(f10, xmlResourceParser, "duration", 1, OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT);
        int i12 = 0;
        long c10 = n0.i.c(f10, xmlResourceParser, "startOffset", 2, 0);
        int c11 = n0.i.c(f10, xmlResourceParser, "valueType", 7, 4);
        if (n0.i.e(xmlResourceParser, "valueFrom") && n0.i.e(xmlResourceParser, "valueTo")) {
            if (c11 == 4) {
                TypedValue peekValue = f10.peekValue(5);
                if (peekValue != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i10 = peekValue.type;
                } else {
                    i10 = 0;
                }
                TypedValue peekValue2 = f10.peekValue(6);
                if (peekValue2 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    i11 = peekValue2.type;
                } else {
                    i11 = 0;
                }
                if ((z10 && d(i10)) || (z11 && d(i11))) {
                    c11 = 3;
                } else {
                    c11 = 0;
                }
            }
            PropertyValuesHolder c12 = c(f10, c11, 5, 6, "");
            if (c12 != null) {
                valueAnimator.setValues(c12);
            }
        }
        valueAnimator.setDuration(c);
        valueAnimator.setStartDelay(c10);
        valueAnimator.setRepeatCount(n0.i.c(f10, xmlResourceParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(n0.i.c(f10, xmlResourceParser, "repeatMode", 4, 1));
        if (f11 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator;
            String d10 = n0.i.d(f11, xmlResourceParser, "pathData", 1);
            if (d10 != null) {
                String d11 = n0.i.d(f11, xmlResourceParser, "propertyXName", 2);
                String d12 = n0.i.d(f11, xmlResourceParser, "propertyYName", 3);
                if (d11 == null && d12 == null) {
                    throw new InflateException(f11.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path d13 = o0.d.d(d10);
                PathMeasure pathMeasure = new PathMeasure(d13, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f12 = 0.0f;
                do {
                    f12 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f12));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(d13, false);
                int min = Math.min(100, ((int) (f12 / 0.5f)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f13 = f12 / (min - 1);
                valueAnimator2 = valueAnimator;
                typedArray = f10;
                int i13 = 0;
                float f14 = 0.0f;
                while (true) {
                    propertyValuesHolder = null;
                    if (i12 >= min) {
                        break;
                    }
                    int i14 = min;
                    pathMeasure2.getPosTan(f14 - ((Float) arrayList.get(i13)).floatValue(), fArr3, null);
                    fArr[i12] = fArr3[0];
                    fArr2[i12] = fArr3[1];
                    f14 += f13;
                    int i15 = i13 + 1;
                    if (i15 < arrayList.size() && f14 > ((Float) arrayList.get(i15)).floatValue()) {
                        pathMeasure2.nextContour();
                        i13 = i15;
                    }
                    i12++;
                    min = i14;
                }
                if (d11 != null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofFloat(d11, fArr);
                } else {
                    propertyValuesHolder2 = null;
                }
                if (d12 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(d12, fArr2);
                }
                if (propertyValuesHolder2 == null) {
                    i12 = 0;
                    objectAnimator2.setValues(propertyValuesHolder);
                } else {
                    i12 = 0;
                    if (propertyValuesHolder == null) {
                        objectAnimator2.setValues(propertyValuesHolder2);
                    } else {
                        objectAnimator2.setValues(propertyValuesHolder2, propertyValuesHolder);
                    }
                }
            } else {
                valueAnimator2 = valueAnimator;
                typedArray = f10;
                objectAnimator2.setPropertyName(n0.i.d(f11, xmlResourceParser, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator;
            typedArray = f10;
        }
        if (!n0.i.e(xmlResourceParser, "interpolator")) {
            typedArray2 = typedArray;
        } else {
            typedArray2 = typedArray;
            i12 = typedArray2.getResourceId(i12, i12);
        }
        if (i12 > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(AnimationUtils.loadInterpolator(context, i12));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray2.recycle();
        if (f11 != null) {
            f11.recycle();
        }
        return valueAnimator3;
    }
}
