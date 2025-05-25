package f0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import lib.zj.office.fc.ss.util.CellUtil;

/* compiled from: KeyTimeCycle.java */
/* loaded from: classes.dex */
public final class j extends d {

    /* renamed from: e  reason: collision with root package name */
    public int f16889e = -1;

    /* renamed from: f  reason: collision with root package name */
    public float f16890f = Float.NaN;

    /* renamed from: g  reason: collision with root package name */
    public float f16891g = Float.NaN;

    /* renamed from: h  reason: collision with root package name */
    public float f16892h = Float.NaN;

    /* renamed from: i  reason: collision with root package name */
    public float f16893i = Float.NaN;

    /* renamed from: j  reason: collision with root package name */
    public float f16894j = Float.NaN;

    /* renamed from: k  reason: collision with root package name */
    public float f16895k = Float.NaN;

    /* renamed from: l  reason: collision with root package name */
    public float f16896l = Float.NaN;

    /* renamed from: m  reason: collision with root package name */
    public float f16897m = Float.NaN;

    /* renamed from: n  reason: collision with root package name */
    public float f16898n = Float.NaN;

    /* renamed from: o  reason: collision with root package name */
    public float f16899o = Float.NaN;

    /* renamed from: p  reason: collision with root package name */
    public float f16900p = Float.NaN;

    /* renamed from: q  reason: collision with root package name */
    public float f16901q = Float.NaN;

    /* renamed from: r  reason: collision with root package name */
    public int f16902r = 0;

    /* renamed from: s  reason: collision with root package name */
    public float f16903s = Float.NaN;

    /* renamed from: t  reason: collision with root package name */
    public float f16904t = 0.0f;

    /* compiled from: KeyTimeCycle.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseIntArray f16905a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f16905a = sparseIntArray;
            sparseIntArray.append(0, 1);
            sparseIntArray.append(9, 2);
            sparseIntArray.append(5, 4);
            sparseIntArray.append(6, 5);
            sparseIntArray.append(7, 6);
            sparseIntArray.append(3, 7);
            sparseIntArray.append(15, 8);
            sparseIntArray.append(14, 9);
            sparseIntArray.append(13, 10);
            sparseIntArray.append(11, 12);
            sparseIntArray.append(10, 13);
            sparseIntArray.append(4, 14);
            sparseIntArray.append(1, 15);
            sparseIntArray.append(2, 16);
            sparseIntArray.append(8, 17);
            sparseIntArray.append(12, 18);
            sparseIntArray.append(18, 20);
            sparseIntArray.append(17, 21);
            sparseIntArray.append(20, 19);
        }
    }

    public j() {
        this.f16838d = new HashMap<>();
    }

    @Override // f0.d
    public final void a(HashMap<String, e0.d> hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // f0.d
    /* renamed from: b */
    public final d clone() {
        j jVar = new j();
        super.c(this);
        jVar.f16889e = this.f16889e;
        jVar.f16902r = this.f16902r;
        jVar.f16903s = this.f16903s;
        jVar.f16904t = this.f16904t;
        jVar.f16901q = this.f16901q;
        jVar.f16890f = this.f16890f;
        jVar.f16891g = this.f16891g;
        jVar.f16892h = this.f16892h;
        jVar.f16895k = this.f16895k;
        jVar.f16893i = this.f16893i;
        jVar.f16894j = this.f16894j;
        jVar.f16896l = this.f16896l;
        jVar.f16897m = this.f16897m;
        jVar.f16898n = this.f16898n;
        jVar.f16899o = this.f16899o;
        jVar.f16900p = this.f16900p;
        return jVar;
    }

    @Override // f0.d
    public final void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f16890f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f16891g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f16892h)) {
            hashSet.add(CellUtil.ROTATION);
        }
        if (!Float.isNaN(this.f16893i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f16894j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f16898n)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f16899o)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f16900p)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f16895k)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f16896l)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f16897m)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f16901q)) {
            hashSet.add("progress");
        }
        if (this.f16838d.size() > 0) {
            Iterator<String> it = this.f16838d.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // f0.d
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g0.d.f17350m);
        SparseIntArray sparseIntArray = a.f16905a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            SparseIntArray sparseIntArray2 = a.f16905a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f16890f = obtainStyledAttributes.getFloat(index, this.f16890f);
                    break;
                case 2:
                    this.f16891g = obtainStyledAttributes.getDimension(index, this.f16891g);
                    break;
                case 3:
                case 11:
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
                case 4:
                    this.f16892h = obtainStyledAttributes.getFloat(index, this.f16892h);
                    break;
                case 5:
                    this.f16893i = obtainStyledAttributes.getFloat(index, this.f16893i);
                    break;
                case 6:
                    this.f16894j = obtainStyledAttributes.getFloat(index, this.f16894j);
                    break;
                case 7:
                    this.f16896l = obtainStyledAttributes.getFloat(index, this.f16896l);
                    break;
                case 8:
                    this.f16895k = obtainStyledAttributes.getFloat(index, this.f16895k);
                    break;
                case 9:
                    obtainStyledAttributes.getString(index);
                    break;
                case 10:
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
                case 12:
                    this.f16836a = obtainStyledAttributes.getInt(index, this.f16836a);
                    break;
                case 13:
                    this.f16889e = obtainStyledAttributes.getInteger(index, this.f16889e);
                    break;
                case 14:
                    this.f16897m = obtainStyledAttributes.getFloat(index, this.f16897m);
                    break;
                case 15:
                    this.f16898n = obtainStyledAttributes.getDimension(index, this.f16898n);
                    break;
                case 16:
                    this.f16899o = obtainStyledAttributes.getDimension(index, this.f16899o);
                    break;
                case 17:
                    this.f16900p = obtainStyledAttributes.getDimension(index, this.f16900p);
                    break;
                case 18:
                    this.f16901q = obtainStyledAttributes.getFloat(index, this.f16901q);
                    break;
                case 19:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        this.f16902r = 7;
                        break;
                    } else {
                        this.f16902r = obtainStyledAttributes.getInt(index, this.f16902r);
                        break;
                    }
                case 20:
                    this.f16903s = obtainStyledAttributes.getFloat(index, this.f16903s);
                    break;
                case 21:
                    if (obtainStyledAttributes.peekValue(index).type == 5) {
                        this.f16904t = obtainStyledAttributes.getDimension(index, this.f16904t);
                        break;
                    } else {
                        this.f16904t = obtainStyledAttributes.getFloat(index, this.f16904t);
                        break;
                    }
            }
        }
    }

    @Override // f0.d
    public final void f(HashMap<String, Integer> hashMap) {
        if (this.f16889e == -1) {
            return;
        }
        if (!Float.isNaN(this.f16890f)) {
            hashMap.put("alpha", Integer.valueOf(this.f16889e));
        }
        if (!Float.isNaN(this.f16891g)) {
            hashMap.put("elevation", Integer.valueOf(this.f16889e));
        }
        if (!Float.isNaN(this.f16892h)) {
            hashMap.put(CellUtil.ROTATION, Integer.valueOf(this.f16889e));
        }
        if (!Float.isNaN(this.f16893i)) {
            hashMap.put("rotationX", Integer.valueOf(this.f16889e));
        }
        if (!Float.isNaN(this.f16894j)) {
            hashMap.put("rotationY", Integer.valueOf(this.f16889e));
        }
        if (!Float.isNaN(this.f16898n)) {
            hashMap.put("translationX", Integer.valueOf(this.f16889e));
        }
        if (!Float.isNaN(this.f16899o)) {
            hashMap.put("translationY", Integer.valueOf(this.f16889e));
        }
        if (!Float.isNaN(this.f16900p)) {
            hashMap.put("translationZ", Integer.valueOf(this.f16889e));
        }
        if (!Float.isNaN(this.f16895k)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.f16889e));
        }
        if (!Float.isNaN(this.f16896l)) {
            hashMap.put("scaleX", Integer.valueOf(this.f16889e));
        }
        if (!Float.isNaN(this.f16896l)) {
            hashMap.put("scaleY", Integer.valueOf(this.f16889e));
        }
        if (!Float.isNaN(this.f16901q)) {
            hashMap.put("progress", Integer.valueOf(this.f16889e));
        }
        if (this.f16838d.size() > 0) {
            for (String str : this.f16838d.keySet()) {
                hashMap.put(a0.a.h("CUSTOM,", str), Integer.valueOf(this.f16889e));
            }
        }
    }
}
