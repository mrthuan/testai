package l3;

import e3.k;
import java.util.Arrays;
import java.util.List;

/* compiled from: ShapeGroup.java */
/* loaded from: classes.dex */
public final class i implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f20474a;

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f20475b;
    public final boolean c;

    public i(String str, List<b> list, boolean z10) {
        this.f20474a = str;
        this.f20475b = list;
        this.c = z10;
    }

    @Override // l3.b
    public final g3.c a(k kVar, com.airbnb.lottie.model.layer.a aVar) {
        return new g3.d(kVar, aVar, this);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f20474a + "' Shapes: " + Arrays.toString(this.f20475b.toArray()) + '}';
    }
}
