package lib.zj.office.fc.hwpf.usermodel;

import kh.b;
import lib.zj.office.system.f;

/* loaded from: classes3.dex */
public interface OfficeDrawing {

    /* loaded from: classes3.dex */
    public enum HorizontalPositioning {
        ABSOLUTE,
        CENTER,
        INSIDE,
        LEFT,
        OUTSIDE,
        RIGHT
    }

    /* loaded from: classes3.dex */
    public enum HorizontalRelativeElement {
        CHAR,
        MARGIN,
        PAGE,
        TEXT
    }

    /* loaded from: classes3.dex */
    public enum VerticalPositioning {
        ABSOLUTE,
        BOTTOM,
        CENTER,
        INSIDE,
        OUTSIDE,
        TOP
    }

    /* loaded from: classes3.dex */
    public enum VerticalRelativeElement {
        LINE,
        MARGIN,
        PAGE,
        TEXT
    }

    HWPFShape getAutoShape();

    byte getHorizontalPositioning();

    byte getHorizontalRelative();

    byte[] getPictureData(f fVar);

    byte[] getPictureData(f fVar, int i10);

    b getPictureEffectInfor();

    int getRectangleBottom();

    int getRectangleLeft();

    int getRectangleRight();

    int getRectangleTop();

    int getShapeId();

    String getTempFilePath(f fVar);

    byte getVerticalPositioning();

    byte getVerticalRelativeElement();

    int getWrap();

    boolean isAnchorLock();

    boolean isBelowText();
}
