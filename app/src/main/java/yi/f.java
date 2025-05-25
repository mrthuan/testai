package yi;

/* compiled from: UndefinedTag.java */
/* loaded from: classes3.dex */
public final class f extends c {
    public final int[] c;

    public f(int i10, int[] iArr) {
        super(i10);
        this.c = iArr;
    }

    @Override // yi.c
    public final c b(int i10, e eVar, int i11) {
        return new f(i10, eVar.c(i11));
    }

    public final String toString() {
        return "UNDEFINED TAG: " + this.f32156a + " length: " + this.c.length;
    }
}
