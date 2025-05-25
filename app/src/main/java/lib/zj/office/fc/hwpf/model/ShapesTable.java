package lib.zj.office.fc.hwpf.model;

import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.hwpf.usermodel.Shape;
import lib.zj.office.fc.util.Internal;

@Internal
@Deprecated
/* loaded from: classes3.dex */
public final class ShapesTable {
    private List<Shape> _shapes;
    private List<Shape> _shapesVisibili;

    public ShapesTable(byte[] bArr, FileInformationBlock fileInformationBlock) {
        PlexOfCps plexOfCps = new PlexOfCps(bArr, fileInformationBlock.getFcPlcspaMom(), fileInformationBlock.getLcbPlcspaMom(), 26);
        this._shapes = new ArrayList();
        this._shapesVisibili = new ArrayList();
        for (int i10 = 0; i10 < plexOfCps.length(); i10++) {
            Shape shape = new Shape(plexOfCps.getProperty(i10));
            this._shapes.add(shape);
            if (shape.isWithinDocument()) {
                this._shapesVisibili.add(shape);
            }
        }
    }

    public List<Shape> getAllShapes() {
        return this._shapes;
    }

    public List<Shape> getVisibleShapes() {
        return this._shapesVisibili;
    }
}
