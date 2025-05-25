package zh;

/* compiled from: AbstractElement.java */
/* loaded from: classes3.dex */
public abstract class a implements h {

    /* renamed from: a  reason: collision with root package name */
    public long f32371a;

    /* renamed from: b  reason: collision with root package name */
    public long f32372b;

    /* renamed from: d  reason: collision with root package name */
    public byte f32373d = 0;
    public f c = new c();

    @Override // zh.h
    public final long a() {
        return this.f32372b;
    }

    @Override // zh.h
    public final long b() {
        return this.f32371a;
    }

    @Override // zh.h
    public final byte c() {
        return this.f32373d;
    }

    @Override // zh.h
    public final f d() {
        return this.c;
    }

    @Override // zh.h
    public void dispose() {
        f fVar = this.c;
        if (fVar != null) {
            ((c) fVar).f32378d = null;
        }
    }

    @Override // zh.h
    public String getText() {
        return null;
    }

    @Override // zh.h
    public short getType() {
        return (short) -1;
    }

    public final String toString() {
        return "[" + this.f32371a + ", " + this.f32372b + "]：" + getText();
    }
}
