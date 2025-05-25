package lib.zj.office.fc.doc;

import android.graphics.Path;

/* loaded from: classes3.dex */
public class PathWithArrow {
    private Path endArrow;
    private Path[] polygon;
    private Path startArrow;

    public PathWithArrow(Path[] pathArr, Path path, Path path2) {
        this.polygon = pathArr;
        this.startArrow = path;
        this.endArrow = path2;
    }

    public Path getEndArrow() {
        return this.endArrow;
    }

    public Path[] getPolygonPath() {
        return this.polygon;
    }

    public Path getStartArrow() {
        return this.startArrow;
    }
}
