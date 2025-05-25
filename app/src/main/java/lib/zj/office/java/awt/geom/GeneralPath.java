package lib.zj.office.java.awt.geom;

import lib.zj.office.java.awt.geom.Path2D;

/* loaded from: classes3.dex */
public final class GeneralPath extends Path2D.Float {
    private static final long serialVersionUID = -8327096662768731142L;

    public GeneralPath() {
        super(1, 20);
    }

    public GeneralPath(int i10) {
        super(i10, 20);
    }

    public GeneralPath(int i10, int i11) {
        super(i10, i11);
    }

    public GeneralPath(lib.zj.office.java.awt.b bVar) {
        super(bVar, (AffineTransform) null);
    }

    public GeneralPath(int i10, byte[] bArr, int i11, float[] fArr, int i12) {
        this.windingRule = i10;
        this.pointTypes = bArr;
        this.numTypes = i11;
        this.floatCoords = fArr;
        this.numCoords = i12;
    }
}
