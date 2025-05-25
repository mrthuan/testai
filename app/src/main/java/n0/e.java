package n0;

import java.util.ArrayList;

/* compiled from: GradientColorInflaterCompat.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f22289a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f22290b;

    public e(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f22289a = new int[size];
        this.f22290b = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            this.f22289a[i10] = ((Integer) arrayList.get(i10)).intValue();
            this.f22290b[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    public e(int i10, int i11) {
        this.f22289a = new int[]{i10, i11};
        this.f22290b = new float[]{0.0f, 1.0f};
    }

    public e(int i10, int i11, int i12) {
        this.f22289a = new int[]{i10, i11, i12};
        this.f22290b = new float[]{0.0f, 0.5f, 1.0f};
    }
}
