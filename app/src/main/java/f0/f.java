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

/* compiled from: KeyCycle.java */
/* loaded from: classes.dex */
public final class f extends d {

    /* renamed from: e  reason: collision with root package name */
    public int f16855e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f16856f = -1;

    /* renamed from: g  reason: collision with root package name */
    public String f16857g = null;

    /* renamed from: h  reason: collision with root package name */
    public float f16858h = Float.NaN;

    /* renamed from: i  reason: collision with root package name */
    public float f16859i = 0.0f;

    /* renamed from: j  reason: collision with root package name */
    public float f16860j = 0.0f;

    /* renamed from: k  reason: collision with root package name */
    public float f16861k = Float.NaN;

    /* renamed from: l  reason: collision with root package name */
    public int f16862l = -1;

    /* renamed from: m  reason: collision with root package name */
    public float f16863m = Float.NaN;

    /* renamed from: n  reason: collision with root package name */
    public float f16864n = Float.NaN;

    /* renamed from: o  reason: collision with root package name */
    public float f16865o = Float.NaN;

    /* renamed from: p  reason: collision with root package name */
    public float f16866p = Float.NaN;

    /* renamed from: q  reason: collision with root package name */
    public float f16867q = Float.NaN;

    /* renamed from: r  reason: collision with root package name */
    public float f16868r = Float.NaN;

    /* renamed from: s  reason: collision with root package name */
    public float f16869s = Float.NaN;

    /* renamed from: t  reason: collision with root package name */
    public float f16870t = Float.NaN;

    /* renamed from: u  reason: collision with root package name */
    public float f16871u = Float.NaN;

    /* renamed from: v  reason: collision with root package name */
    public float f16872v = Float.NaN;

    /* renamed from: w  reason: collision with root package name */
    public float f16873w = Float.NaN;

    /* compiled from: KeyCycle.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseIntArray f16874a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f16874a = sparseIntArray;
            sparseIntArray.append(13, 1);
            sparseIntArray.append(11, 2);
            sparseIntArray.append(14, 3);
            sparseIntArray.append(10, 4);
            sparseIntArray.append(19, 5);
            sparseIntArray.append(17, 6);
            sparseIntArray.append(16, 7);
            sparseIntArray.append(20, 8);
            sparseIntArray.append(0, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(5, 11);
            sparseIntArray.append(6, 12);
            sparseIntArray.append(7, 13);
            sparseIntArray.append(15, 14);
            sparseIntArray.append(3, 15);
            sparseIntArray.append(4, 16);
            sparseIntArray.append(1, 17);
            sparseIntArray.append(2, 18);
            sparseIntArray.append(8, 19);
            sparseIntArray.append(12, 20);
            sparseIntArray.append(18, 21);
        }
    }

    public f() {
        this.f16838d = new HashMap<>();
    }

    @Override // f0.d
    public final void a(HashMap<String, e0.d> hashMap) {
        hashMap.size();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(2, stackTrace.length - 1);
        String str = " ";
        for (int i10 = 1; i10 <= min; i10++) {
            stackTrace[i10].getFileName();
            stackTrace[i10].getLineNumber();
            stackTrace[i10].getMethodName();
            str = str + " ";
        }
        for (String str2 : hashMap.keySet()) {
            e0.d dVar = hashMap.get(str2);
            if (dVar != null) {
                str2.getClass();
                char c = 65535;
                switch (str2.hashCode()) {
                    case -1249320806:
                        if (str2.equals("rotationX")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1249320805:
                        if (str2.equals("rotationY")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1225497657:
                        if (str2.equals("translationX")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1225497656:
                        if (str2.equals("translationY")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -1225497655:
                        if (str2.equals("translationZ")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1001078227:
                        if (str2.equals("progress")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -908189618:
                        if (str2.equals("scaleX")) {
                            c = 6;
                            break;
                        }
                        break;
                    case -908189617:
                        if (str2.equals("scaleY")) {
                            c = 7;
                            break;
                        }
                        break;
                    case -40300674:
                        if (str2.equals(CellUtil.ROTATION)) {
                            c = '\b';
                            break;
                        }
                        break;
                    case -4379043:
                        if (str2.equals("elevation")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case 37232917:
                        if (str2.equals("transitionPathRotate")) {
                            c = '\n';
                            break;
                        }
                        break;
                    case 92909918:
                        if (str2.equals("alpha")) {
                            c = 11;
                            break;
                        }
                        break;
                    case 156108012:
                        if (str2.equals("waveOffset")) {
                            c = '\f';
                            break;
                        }
                        break;
                    case 1530034690:
                        if (str2.equals("wavePhase")) {
                            c = '\r';
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        dVar.b(this.f16867q, this.f16836a);
                        continue;
                    case 1:
                        dVar.b(this.f16868r, this.f16836a);
                        continue;
                    case 2:
                        dVar.b(this.f16871u, this.f16836a);
                        continue;
                    case 3:
                        dVar.b(this.f16872v, this.f16836a);
                        continue;
                    case 4:
                        dVar.b(this.f16873w, this.f16836a);
                        continue;
                    case 5:
                        dVar.b(this.f16861k, this.f16836a);
                        continue;
                    case 6:
                        dVar.b(this.f16869s, this.f16836a);
                        continue;
                    case 7:
                        dVar.b(this.f16870t, this.f16836a);
                        continue;
                    case '\b':
                        dVar.b(this.f16865o, this.f16836a);
                        continue;
                    case '\t':
                        dVar.b(this.f16864n, this.f16836a);
                        continue;
                    case '\n':
                        dVar.b(this.f16866p, this.f16836a);
                        continue;
                    case 11:
                        dVar.b(this.f16863m, this.f16836a);
                        continue;
                    case '\f':
                        dVar.b(this.f16859i, this.f16836a);
                        continue;
                    case '\r':
                        dVar.b(this.f16860j, this.f16836a);
                        continue;
                    default:
                        str2.startsWith("CUSTOM");
                        continue;
                }
            }
        }
    }

    @Override // f0.d
    /* renamed from: b */
    public final d clone() {
        f fVar = new f();
        super.c(this);
        fVar.f16855e = this.f16855e;
        fVar.f16856f = this.f16856f;
        fVar.f16857g = this.f16857g;
        fVar.f16858h = this.f16858h;
        fVar.f16859i = this.f16859i;
        fVar.f16860j = this.f16860j;
        fVar.f16861k = this.f16861k;
        fVar.f16862l = this.f16862l;
        fVar.f16863m = this.f16863m;
        fVar.f16864n = this.f16864n;
        fVar.f16865o = this.f16865o;
        fVar.f16866p = this.f16866p;
        fVar.f16867q = this.f16867q;
        fVar.f16868r = this.f16868r;
        fVar.f16869s = this.f16869s;
        fVar.f16870t = this.f16870t;
        fVar.f16871u = this.f16871u;
        fVar.f16872v = this.f16872v;
        fVar.f16873w = this.f16873w;
        return fVar;
    }

    @Override // f0.d
    public final void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f16863m)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f16864n)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f16865o)) {
            hashSet.add(CellUtil.ROTATION);
        }
        if (!Float.isNaN(this.f16867q)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f16868r)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f16869s)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f16870t)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f16866p)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f16871u)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f16872v)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f16873w)) {
            hashSet.add("translationZ");
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g0.d.f17348k);
        SparseIntArray sparseIntArray = a.f16874a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            SparseIntArray sparseIntArray2 = a.f16874a;
            switch (sparseIntArray2.get(index)) {
                case 1:
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
                case 2:
                    this.f16836a = obtainStyledAttributes.getInt(index, this.f16836a);
                    break;
                case 3:
                    obtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.f16855e = obtainStyledAttributes.getInteger(index, this.f16855e);
                    break;
                case 5:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.f16857g = obtainStyledAttributes.getString(index);
                        this.f16856f = 7;
                        break;
                    } else {
                        this.f16856f = obtainStyledAttributes.getInt(index, this.f16856f);
                        break;
                    }
                case 6:
                    this.f16858h = obtainStyledAttributes.getFloat(index, this.f16858h);
                    break;
                case 7:
                    if (obtainStyledAttributes.peekValue(index).type == 5) {
                        this.f16859i = obtainStyledAttributes.getDimension(index, this.f16859i);
                        break;
                    } else {
                        this.f16859i = obtainStyledAttributes.getFloat(index, this.f16859i);
                        break;
                    }
                case 8:
                    this.f16862l = obtainStyledAttributes.getInt(index, this.f16862l);
                    break;
                case 9:
                    this.f16863m = obtainStyledAttributes.getFloat(index, this.f16863m);
                    break;
                case 10:
                    this.f16864n = obtainStyledAttributes.getDimension(index, this.f16864n);
                    break;
                case 11:
                    this.f16865o = obtainStyledAttributes.getFloat(index, this.f16865o);
                    break;
                case 12:
                    this.f16867q = obtainStyledAttributes.getFloat(index, this.f16867q);
                    break;
                case 13:
                    this.f16868r = obtainStyledAttributes.getFloat(index, this.f16868r);
                    break;
                case 14:
                    this.f16866p = obtainStyledAttributes.getFloat(index, this.f16866p);
                    break;
                case 15:
                    this.f16869s = obtainStyledAttributes.getFloat(index, this.f16869s);
                    break;
                case 16:
                    this.f16870t = obtainStyledAttributes.getFloat(index, this.f16870t);
                    break;
                case 17:
                    this.f16871u = obtainStyledAttributes.getDimension(index, this.f16871u);
                    break;
                case 18:
                    this.f16872v = obtainStyledAttributes.getDimension(index, this.f16872v);
                    break;
                case 19:
                    this.f16873w = obtainStyledAttributes.getDimension(index, this.f16873w);
                    break;
                case 20:
                    this.f16861k = obtainStyledAttributes.getFloat(index, this.f16861k);
                    break;
                case 21:
                    this.f16860j = obtainStyledAttributes.getFloat(index, this.f16860j) / 360.0f;
                    break;
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
            }
        }
    }
}
