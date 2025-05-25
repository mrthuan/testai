package lh;

/* compiled from: WatermarkShape.java */
/* loaded from: classes.dex */
public final class t extends p {
    public byte E;
    public String F;
    public float K;
    public kh.b L;
    public boolean G = false;
    public int H = 36;
    public int I = -16777216;
    public int J = -1;
    public float M = 0.2f;

    @Override // lh.p, lh.h, lh.e, lh.b, lh.g
    public final void dispose() {
        kh.b bVar = this.L;
        if (bVar != null) {
            bVar.getClass();
        }
    }

    @Override // lh.p, lh.h, lh.e, lh.b, lh.g
    public final short getType() {
        if (this.E == 0) {
            return (short) 2;
        }
        return (short) 0;
    }
}
