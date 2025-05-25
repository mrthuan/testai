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

/* compiled from: KeyAttributes.java */
/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: e  reason: collision with root package name */
    public int f16839e = -1;

    /* renamed from: f  reason: collision with root package name */
    public float f16840f = Float.NaN;

    /* renamed from: g  reason: collision with root package name */
    public float f16841g = Float.NaN;

    /* renamed from: h  reason: collision with root package name */
    public float f16842h = Float.NaN;

    /* renamed from: i  reason: collision with root package name */
    public float f16843i = Float.NaN;

    /* renamed from: j  reason: collision with root package name */
    public float f16844j = Float.NaN;

    /* renamed from: k  reason: collision with root package name */
    public float f16845k = Float.NaN;

    /* renamed from: l  reason: collision with root package name */
    public float f16846l = Float.NaN;

    /* renamed from: m  reason: collision with root package name */
    public float f16847m = Float.NaN;

    /* renamed from: n  reason: collision with root package name */
    public float f16848n = Float.NaN;

    /* renamed from: o  reason: collision with root package name */
    public float f16849o = Float.NaN;

    /* renamed from: p  reason: collision with root package name */
    public float f16850p = Float.NaN;

    /* renamed from: q  reason: collision with root package name */
    public float f16851q = Float.NaN;

    /* renamed from: r  reason: collision with root package name */
    public float f16852r = Float.NaN;

    /* renamed from: s  reason: collision with root package name */
    public float f16853s = Float.NaN;

    /* compiled from: KeyAttributes.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseIntArray f16854a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f16854a = sparseIntArray;
            sparseIntArray.append(0, 1);
            sparseIntArray.append(11, 2);
            sparseIntArray.append(7, 4);
            sparseIntArray.append(8, 5);
            sparseIntArray.append(9, 6);
            sparseIntArray.append(1, 19);
            sparseIntArray.append(2, 20);
            sparseIntArray.append(5, 7);
            sparseIntArray.append(18, 8);
            sparseIntArray.append(17, 9);
            sparseIntArray.append(15, 10);
            sparseIntArray.append(13, 12);
            sparseIntArray.append(12, 13);
            sparseIntArray.append(6, 14);
            sparseIntArray.append(3, 15);
            sparseIntArray.append(4, 16);
            sparseIntArray.append(10, 17);
            sparseIntArray.append(14, 18);
        }
    }

    public e() {
        this.f16838d = new HashMap<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009c, code lost:
        if (r1.equals("scaleY") == false) goto L12;
     */
    @Override // f0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.util.HashMap<java.lang.String, e0.d> r7) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.e.a(java.util.HashMap):void");
    }

    @Override // f0.d
    /* renamed from: b */
    public final d clone() {
        e eVar = new e();
        super.c(this);
        eVar.f16839e = this.f16839e;
        eVar.f16840f = this.f16840f;
        eVar.f16841g = this.f16841g;
        eVar.f16842h = this.f16842h;
        eVar.f16843i = this.f16843i;
        eVar.f16844j = this.f16844j;
        eVar.f16845k = this.f16845k;
        eVar.f16846l = this.f16846l;
        eVar.f16847m = this.f16847m;
        eVar.f16848n = this.f16848n;
        eVar.f16849o = this.f16849o;
        eVar.f16850p = this.f16850p;
        eVar.f16851q = this.f16851q;
        eVar.f16852r = this.f16852r;
        eVar.f16853s = this.f16853s;
        return eVar;
    }

    @Override // f0.d
    public final void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f16840f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f16841g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f16842h)) {
            hashSet.add(CellUtil.ROTATION);
        }
        if (!Float.isNaN(this.f16843i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f16844j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f16845k)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f16846l)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f16850p)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f16851q)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f16852r)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f16847m)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f16848n)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f16849o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f16853s)) {
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g0.d.f17347j);
        SparseIntArray sparseIntArray = a.f16854a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            SparseIntArray sparseIntArray2 = a.f16854a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f16840f = obtainStyledAttributes.getFloat(index, this.f16840f);
                    break;
                case 2:
                    this.f16841g = obtainStyledAttributes.getDimension(index, this.f16841g);
                    break;
                case 3:
                case 11:
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
                case 4:
                    this.f16842h = obtainStyledAttributes.getFloat(index, this.f16842h);
                    break;
                case 5:
                    this.f16843i = obtainStyledAttributes.getFloat(index, this.f16843i);
                    break;
                case 6:
                    this.f16844j = obtainStyledAttributes.getFloat(index, this.f16844j);
                    break;
                case 7:
                    this.f16848n = obtainStyledAttributes.getFloat(index, this.f16848n);
                    break;
                case 8:
                    this.f16847m = obtainStyledAttributes.getFloat(index, this.f16847m);
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
                    this.f16839e = obtainStyledAttributes.getInteger(index, this.f16839e);
                    break;
                case 14:
                    this.f16849o = obtainStyledAttributes.getFloat(index, this.f16849o);
                    break;
                case 15:
                    this.f16850p = obtainStyledAttributes.getDimension(index, this.f16850p);
                    break;
                case 16:
                    this.f16851q = obtainStyledAttributes.getDimension(index, this.f16851q);
                    break;
                case 17:
                    this.f16852r = obtainStyledAttributes.getDimension(index, this.f16852r);
                    break;
                case 18:
                    this.f16853s = obtainStyledAttributes.getFloat(index, this.f16853s);
                    break;
                case 19:
                    this.f16845k = obtainStyledAttributes.getDimension(index, this.f16845k);
                    break;
                case 20:
                    this.f16846l = obtainStyledAttributes.getDimension(index, this.f16846l);
                    break;
            }
        }
    }

    @Override // f0.d
    public final void f(HashMap<String, Integer> hashMap) {
        if (this.f16839e == -1) {
            return;
        }
        if (!Float.isNaN(this.f16840f)) {
            hashMap.put("alpha", Integer.valueOf(this.f16839e));
        }
        if (!Float.isNaN(this.f16841g)) {
            hashMap.put("elevation", Integer.valueOf(this.f16839e));
        }
        if (!Float.isNaN(this.f16842h)) {
            hashMap.put(CellUtil.ROTATION, Integer.valueOf(this.f16839e));
        }
        if (!Float.isNaN(this.f16843i)) {
            hashMap.put("rotationX", Integer.valueOf(this.f16839e));
        }
        if (!Float.isNaN(this.f16844j)) {
            hashMap.put("rotationY", Integer.valueOf(this.f16839e));
        }
        if (!Float.isNaN(this.f16845k)) {
            hashMap.put("transformPivotX", Integer.valueOf(this.f16839e));
        }
        if (!Float.isNaN(this.f16846l)) {
            hashMap.put("transformPivotY", Integer.valueOf(this.f16839e));
        }
        if (!Float.isNaN(this.f16850p)) {
            hashMap.put("translationX", Integer.valueOf(this.f16839e));
        }
        if (!Float.isNaN(this.f16851q)) {
            hashMap.put("translationY", Integer.valueOf(this.f16839e));
        }
        if (!Float.isNaN(this.f16852r)) {
            hashMap.put("translationZ", Integer.valueOf(this.f16839e));
        }
        if (!Float.isNaN(this.f16847m)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.f16839e));
        }
        if (!Float.isNaN(this.f16848n)) {
            hashMap.put("scaleX", Integer.valueOf(this.f16839e));
        }
        if (!Float.isNaN(this.f16849o)) {
            hashMap.put("scaleY", Integer.valueOf(this.f16839e));
        }
        if (!Float.isNaN(this.f16853s)) {
            hashMap.put("progress", Integer.valueOf(this.f16839e));
        }
        if (this.f16838d.size() > 0) {
            for (String str : this.f16838d.keySet()) {
                hashMap.put(a0.a.h("CUSTOM,", str), Integer.valueOf(this.f16839e));
            }
        }
    }

    public final void h(Object obj, String str) {
        int parseInt;
        char c = 65535;
        switch (str.hashCode()) {
            case -1913008125:
                if (str.equals("motionProgress")) {
                    c = 0;
                    break;
                }
                break;
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c = 1;
                    break;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 2;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 3;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 4;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 5;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 6;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 7;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = '\b';
                    break;
                }
                break;
            case -760884510:
                if (str.equals("transformPivotX")) {
                    c = '\t';
                    break;
                }
                break;
            case -760884509:
                if (str.equals("transformPivotY")) {
                    c = '\n';
                    break;
                }
                break;
            case -40300674:
                if (str.equals(CellUtil.ROTATION)) {
                    c = 11;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = '\f';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = '\r';
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 14;
                    break;
                }
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    c = 15;
                    break;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c = 16;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f16853s = d.g((Number) obj);
                return;
            case 1:
                obj.toString();
                return;
            case 2:
                this.f16843i = d.g((Number) obj);
                return;
            case 3:
                this.f16844j = d.g((Number) obj);
                return;
            case 4:
                this.f16850p = d.g((Number) obj);
                return;
            case 5:
                this.f16851q = d.g((Number) obj);
                return;
            case 6:
                this.f16852r = d.g((Number) obj);
                return;
            case 7:
                this.f16848n = d.g((Number) obj);
                return;
            case '\b':
                this.f16849o = d.g((Number) obj);
                return;
            case '\t':
                this.f16845k = d.g((Number) obj);
                return;
            case '\n':
                this.f16846l = d.g((Number) obj);
                return;
            case 11:
                this.f16842h = d.g((Number) obj);
                return;
            case '\f':
                this.f16841g = d.g((Number) obj);
                return;
            case '\r':
                this.f16847m = d.g((Number) obj);
                return;
            case 14:
                this.f16840f = d.g((Number) obj);
                return;
            case 15:
                Number number = (Number) obj;
                if (number instanceof Integer) {
                    parseInt = ((Integer) number).intValue();
                } else {
                    parseInt = Integer.parseInt(number.toString());
                }
                this.f16839e = parseInt;
                return;
            case 16:
                if (obj instanceof Boolean) {
                    ((Boolean) obj).booleanValue();
                    return;
                } else {
                    Boolean.parseBoolean(obj.toString());
                    return;
                }
            default:
                return;
        }
    }
}
