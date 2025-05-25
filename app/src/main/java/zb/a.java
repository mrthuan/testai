package zb;

/* compiled from: DimensionStatus.java */
/* loaded from: classes2.dex */
public final class a {
    public static final a c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f32332d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f32333e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f32334f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f32335g;

    /* renamed from: h  reason: collision with root package name */
    public static final a[] f32336h;

    /* renamed from: a  reason: collision with root package name */
    public final int f32337a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f32338b;

    static {
        a aVar = new a(0, false);
        c = aVar;
        a aVar2 = new a(1, true);
        a aVar3 = new a(2, false);
        f32332d = aVar3;
        a aVar4 = new a(3, true);
        a aVar5 = new a(4, false);
        f32333e = aVar5;
        a aVar6 = new a(5, true);
        a aVar7 = new a(6, false);
        f32334f = aVar7;
        a aVar8 = new a(7, true);
        a aVar9 = new a(8, false);
        a aVar10 = new a(9, true);
        f32335g = aVar10;
        f32336h = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, new a(10, false), new a(10, true)};
    }

    public a(int i10, boolean z10) {
        this.f32337a = i10;
        this.f32338b = z10;
    }

    public final boolean a(a aVar) {
        int i10 = aVar.f32337a;
        int i11 = this.f32337a;
        if (i11 >= i10 && ((this.f32338b && f32335g != this) || i11 != i10)) {
            return false;
        }
        return true;
    }
}
