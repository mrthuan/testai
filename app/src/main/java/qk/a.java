package qk;

/* compiled from: Block.java */
/* loaded from: classes3.dex */
public abstract class a extends r {
    @Override // qk.r
    public final r c() {
        return (a) this.f29377a;
    }

    @Override // qk.r
    public final void d(r rVar) {
        if (rVar instanceof a) {
            this.f29377a = rVar;
            return;
        }
        throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
    }
}
