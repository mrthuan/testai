package zh;

/* compiled from: CellLeafElement.java */
/* loaded from: classes3.dex */
public final class d extends i {

    /* renamed from: f  reason: collision with root package name */
    public final ei.d f32379f;

    /* renamed from: g  reason: collision with root package name */
    public final int f32380g;

    /* renamed from: h  reason: collision with root package name */
    public final int f32381h;

    /* renamed from: i  reason: collision with root package name */
    public final int f32382i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f32383j;

    public d(ei.a aVar, int i10, int i11) {
        super(null);
        this.f32379f = aVar.f16588a.f16601a;
        this.f32380g = aVar.i();
        this.f32381h = i10;
        this.f32382i = i11;
    }

    @Override // zh.i, zh.a, zh.h
    public final String getText() {
        boolean z10 = this.f32383j;
        int i10 = this.f32382i;
        int i11 = this.f32381h;
        int i12 = this.f32380g;
        ei.d dVar = this.f32379f;
        if (z10) {
            return dVar.n(i12).substring(i11, i10) + "\n";
        }
        return dVar.n(i12).substring(i11, i10);
    }

    @Override // zh.i, zh.a, zh.h
    public final void dispose() {
    }
}
