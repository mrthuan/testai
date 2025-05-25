package f0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;

/* compiled from: KeyPosition.java */
/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: f  reason: collision with root package name */
    public String f16877f = null;

    /* renamed from: g  reason: collision with root package name */
    public int f16878g = -1;

    /* renamed from: h  reason: collision with root package name */
    public int f16879h = 0;

    /* renamed from: i  reason: collision with root package name */
    public float f16880i = Float.NaN;

    /* renamed from: j  reason: collision with root package name */
    public float f16881j = Float.NaN;

    /* renamed from: k  reason: collision with root package name */
    public float f16882k = Float.NaN;

    /* renamed from: l  reason: collision with root package name */
    public float f16883l = Float.NaN;

    /* renamed from: m  reason: collision with root package name */
    public float f16884m = Float.NaN;

    /* renamed from: n  reason: collision with root package name */
    public float f16885n = Float.NaN;

    /* renamed from: o  reason: collision with root package name */
    public int f16886o = 0;

    /* compiled from: KeyPosition.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseIntArray f16887a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f16887a = sparseIntArray;
            sparseIntArray.append(4, 1);
            sparseIntArray.append(2, 2);
            sparseIntArray.append(11, 3);
            sparseIntArray.append(0, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(8, 6);
            sparseIntArray.append(9, 7);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(10, 8);
            sparseIntArray.append(7, 11);
            sparseIntArray.append(6, 12);
            sparseIntArray.append(5, 10);
        }
    }

    @Override // f0.d
    /* renamed from: b */
    public final d clone() {
        h hVar = new h();
        super.c(this);
        hVar.f16877f = this.f16877f;
        hVar.f16878g = this.f16878g;
        hVar.f16879h = this.f16879h;
        hVar.f16880i = this.f16880i;
        hVar.f16881j = Float.NaN;
        hVar.f16882k = this.f16882k;
        hVar.f16883l = this.f16883l;
        hVar.f16884m = this.f16884m;
        hVar.f16885n = this.f16885n;
        return hVar;
    }

    @Override // f0.d
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g0.d.f17349l);
        SparseIntArray sparseIntArray = a.f16887a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            SparseIntArray sparseIntArray2 = a.f16887a;
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
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.f16877f = obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.f16877f = b0.c.c[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    this.f16888e = obtainStyledAttributes.getInteger(index, this.f16888e);
                    break;
                case 5:
                    this.f16879h = obtainStyledAttributes.getInt(index, this.f16879h);
                    break;
                case 6:
                    this.f16882k = obtainStyledAttributes.getFloat(index, this.f16882k);
                    break;
                case 7:
                    this.f16883l = obtainStyledAttributes.getFloat(index, this.f16883l);
                    break;
                case 8:
                    float f10 = obtainStyledAttributes.getFloat(index, this.f16881j);
                    this.f16880i = f10;
                    this.f16881j = f10;
                    break;
                case 9:
                    this.f16886o = obtainStyledAttributes.getInt(index, this.f16886o);
                    break;
                case 10:
                    this.f16878g = obtainStyledAttributes.getInt(index, this.f16878g);
                    break;
                case 11:
                    this.f16880i = obtainStyledAttributes.getFloat(index, this.f16880i);
                    break;
                case 12:
                    this.f16881j = obtainStyledAttributes.getFloat(index, this.f16881j);
                    break;
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
            }
        }
    }

    public final void h(Object obj, String str) {
        int parseInt;
        char c = 65535;
        switch (str.hashCode()) {
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c = 0;
                    break;
                }
                break;
            case -1127236479:
                if (str.equals("percentWidth")) {
                    c = 1;
                    break;
                }
                break;
            case -1017587252:
                if (str.equals("percentHeight")) {
                    c = 2;
                    break;
                }
                break;
            case -827014263:
                if (str.equals("drawPath")) {
                    c = 3;
                    break;
                }
                break;
            case -200259324:
                if (str.equals("sizePercent")) {
                    c = 4;
                    break;
                }
                break;
            case 428090547:
                if (str.equals("percentX")) {
                    c = 5;
                    break;
                }
                break;
            case 428090548:
                if (str.equals("percentY")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f16877f = obj.toString();
                return;
            case 1:
                this.f16880i = d.g((Number) obj);
                return;
            case 2:
                this.f16881j = d.g((Number) obj);
                return;
            case 3:
                Number number = (Number) obj;
                if (number instanceof Integer) {
                    parseInt = ((Integer) number).intValue();
                } else {
                    parseInt = Integer.parseInt(number.toString());
                }
                this.f16879h = parseInt;
                return;
            case 4:
                float g10 = d.g((Number) obj);
                this.f16880i = g10;
                this.f16881j = g10;
                return;
            case 5:
                this.f16882k = d.g((Number) obj);
                return;
            case 6:
                this.f16883l = d.g((Number) obj);
                return;
            default:
                return;
        }
    }

    @Override // f0.d
    public final void a(HashMap<String, e0.d> hashMap) {
    }
}
