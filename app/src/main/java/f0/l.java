package f0;

import android.graphics.Rect;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.a;
import e0.d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import lib.zj.office.fc.ss.util.CellUtil;

/* compiled from: MotionConstrainedPoint.java */
/* loaded from: classes.dex */
public final class l implements Comparable<l> {
    public int c;

    /* renamed from: a  reason: collision with root package name */
    public float f16927a = 1.0f;

    /* renamed from: b  reason: collision with root package name */
    public int f16928b = 0;

    /* renamed from: d  reason: collision with root package name */
    public float f16929d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f16930e = 0.0f;

    /* renamed from: f  reason: collision with root package name */
    public float f16931f = 0.0f;

    /* renamed from: g  reason: collision with root package name */
    public float f16932g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f16933h = 1.0f;

    /* renamed from: i  reason: collision with root package name */
    public float f16934i = 1.0f;

    /* renamed from: j  reason: collision with root package name */
    public float f16935j = Float.NaN;

    /* renamed from: k  reason: collision with root package name */
    public float f16936k = Float.NaN;

    /* renamed from: l  reason: collision with root package name */
    public float f16937l = 0.0f;

    /* renamed from: m  reason: collision with root package name */
    public float f16938m = 0.0f;

    /* renamed from: n  reason: collision with root package name */
    public float f16939n = 0.0f;

    /* renamed from: o  reason: collision with root package name */
    public float f16940o = Float.NaN;

    /* renamed from: p  reason: collision with root package name */
    public float f16941p = Float.NaN;

    /* renamed from: q  reason: collision with root package name */
    public final LinkedHashMap<String, ConstraintAttribute> f16942q = new LinkedHashMap<>();

    public static boolean c(float f10, float f11) {
        if (!Float.isNaN(f10) && !Float.isNaN(f11)) {
            if (Math.abs(f10 - f11) > 1.0E-6f) {
                return true;
            }
            return false;
        } else if (Float.isNaN(f10) != Float.isNaN(f11)) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(int i10, HashMap hashMap) {
        char c;
        for (String str : hashMap.keySet()) {
            e0.d dVar = (e0.d) hashMap.get(str);
            str.getClass();
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -760884510:
                    if (str.equals("transformPivotX")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -760884509:
                    if (str.equals("transformPivotY")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -40300674:
                    if (str.equals(CellUtil.ROTATION)) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            float f10 = 1.0f;
            float f11 = 0.0f;
            switch (c) {
                case 0:
                    if (!Float.isNaN(this.f16931f)) {
                        f11 = this.f16931f;
                    }
                    dVar.b(f11, i10);
                    break;
                case 1:
                    if (!Float.isNaN(this.f16932g)) {
                        f11 = this.f16932g;
                    }
                    dVar.b(f11, i10);
                    break;
                case 2:
                    if (!Float.isNaN(this.f16937l)) {
                        f11 = this.f16937l;
                    }
                    dVar.b(f11, i10);
                    break;
                case 3:
                    if (!Float.isNaN(this.f16938m)) {
                        f11 = this.f16938m;
                    }
                    dVar.b(f11, i10);
                    break;
                case 4:
                    if (!Float.isNaN(this.f16939n)) {
                        f11 = this.f16939n;
                    }
                    dVar.b(f11, i10);
                    break;
                case 5:
                    if (!Float.isNaN(this.f16941p)) {
                        f11 = this.f16941p;
                    }
                    dVar.b(f11, i10);
                    break;
                case 6:
                    if (!Float.isNaN(this.f16933h)) {
                        f10 = this.f16933h;
                    }
                    dVar.b(f10, i10);
                    break;
                case 7:
                    if (!Float.isNaN(this.f16934i)) {
                        f10 = this.f16934i;
                    }
                    dVar.b(f10, i10);
                    break;
                case '\b':
                    if (!Float.isNaN(this.f16935j)) {
                        f11 = this.f16935j;
                    }
                    dVar.b(f11, i10);
                    break;
                case '\t':
                    if (!Float.isNaN(this.f16936k)) {
                        f11 = this.f16936k;
                    }
                    dVar.b(f11, i10);
                    break;
                case '\n':
                    if (!Float.isNaN(this.f16930e)) {
                        f11 = this.f16930e;
                    }
                    dVar.b(f11, i10);
                    break;
                case 11:
                    if (!Float.isNaN(this.f16929d)) {
                        f11 = this.f16929d;
                    }
                    dVar.b(f11, i10);
                    break;
                case '\f':
                    if (!Float.isNaN(this.f16940o)) {
                        f11 = this.f16940o;
                    }
                    dVar.b(f11, i10);
                    break;
                case '\r':
                    if (!Float.isNaN(this.f16927a)) {
                        f10 = this.f16927a;
                    }
                    dVar.b(f10, i10);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        LinkedHashMap<String, ConstraintAttribute> linkedHashMap = this.f16942q;
                        if (linkedHashMap.containsKey(str2)) {
                            ConstraintAttribute constraintAttribute = linkedHashMap.get(str2);
                            if (dVar instanceof d.b) {
                                ((d.b) dVar).f16323f.append(i10, constraintAttribute);
                                break;
                            } else {
                                constraintAttribute.a();
                                Objects.toString(dVar);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
            }
        }
    }

    public final void b(View view) {
        float alpha;
        this.c = view.getVisibility();
        if (view.getVisibility() != 0) {
            alpha = 0.0f;
        } else {
            alpha = view.getAlpha();
        }
        this.f16927a = alpha;
        this.f16929d = view.getElevation();
        this.f16930e = view.getRotation();
        this.f16931f = view.getRotationX();
        this.f16932g = view.getRotationY();
        this.f16933h = view.getScaleX();
        this.f16934i = view.getScaleY();
        this.f16935j = view.getPivotX();
        this.f16936k = view.getPivotY();
        this.f16937l = view.getTranslationX();
        this.f16938m = view.getTranslationY();
        this.f16939n = view.getTranslationZ();
    }

    @Override // java.lang.Comparable
    public final int compareTo(l lVar) {
        lVar.getClass();
        return Float.compare(0.0f, 0.0f);
    }

    public final void d(Rect rect, androidx.constraintlayout.widget.a aVar, int i10, int i11) {
        float f10;
        rect.width();
        rect.height();
        a.C0012a k10 = aVar.k(i11);
        a.d dVar = k10.c;
        int i12 = dVar.c;
        this.f16928b = i12;
        int i13 = dVar.f3444b;
        this.c = i13;
        if (i13 != 0 && i12 == 0) {
            f10 = 0.0f;
        } else {
            f10 = dVar.f3445d;
        }
        this.f16927a = f10;
        a.e eVar = k10.f3374f;
        boolean z10 = eVar.f3459m;
        this.f16929d = eVar.f3460n;
        this.f16930e = eVar.f3449b;
        this.f16931f = eVar.c;
        this.f16932g = eVar.f3450d;
        this.f16933h = eVar.f3451e;
        this.f16934i = eVar.f3452f;
        this.f16935j = eVar.f3453g;
        this.f16936k = eVar.f3454h;
        this.f16937l = eVar.f3456j;
        this.f16938m = eVar.f3457k;
        this.f16939n = eVar.f3458l;
        a.c cVar = k10.f3372d;
        b0.c.c(cVar.f3433d);
        this.f16940o = cVar.f3437h;
        this.f16941p = k10.c.f3446e;
        Iterator<String> it = k10.f3375g.keySet().iterator();
        while (true) {
            boolean z11 = true;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            ConstraintAttribute constraintAttribute = k10.f3375g.get(next);
            constraintAttribute.getClass();
            int i14 = ConstraintAttribute.a.f3270a[constraintAttribute.c.ordinal()];
            if ((i14 == 1 || i14 == 2 || i14 == 3) ? false : false) {
                this.f16942q.put(next, constraintAttribute);
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return;
                    }
                }
            }
            float f11 = this.f16930e + 90.0f;
            this.f16930e = f11;
            if (f11 > 180.0f) {
                this.f16930e = f11 - 360.0f;
                return;
            }
            return;
        }
        this.f16930e -= 90.0f;
    }
}
