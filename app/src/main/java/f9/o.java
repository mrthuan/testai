package f9;

import android.graphics.Canvas;
import android.graphics.Matrix;
import f9.p;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShapePath.java */
/* loaded from: classes2.dex */
public final class o extends p.f {
    public final /* synthetic */ List c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Matrix f17246d;

    public o(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.f17246d = matrix;
    }

    @Override // f9.p.f
    public final void a(Matrix matrix, e9.a aVar, int i10, Canvas canvas) {
        for (p.f fVar : this.c) {
            fVar.a(this.f17246d, aVar, i10, canvas);
        }
    }
}
