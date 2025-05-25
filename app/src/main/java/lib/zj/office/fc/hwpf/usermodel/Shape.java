package lib.zj.office.fc.hwpf.usermodel;

import lib.zj.office.fc.hwpf.model.GenericPropertyNode;
import lib.zj.office.fc.util.LittleEndian;

@Deprecated
/* loaded from: classes3.dex */
public final class Shape {
    int _bottom;
    int _id;
    boolean _inDoc;
    int _left;
    int _right;
    int _top;

    public Shape(GenericPropertyNode genericPropertyNode) {
        boolean z10;
        byte[] bytes = genericPropertyNode.getBytes();
        this._id = LittleEndian.getInt(bytes);
        this._left = LittleEndian.getInt(bytes, 4);
        this._top = LittleEndian.getInt(bytes, 8);
        this._right = LittleEndian.getInt(bytes, 12);
        int i10 = LittleEndian.getInt(bytes, 16);
        this._bottom = i10;
        if (this._left >= 0 && this._right >= 0 && this._top >= 0 && i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this._inDoc = z10;
    }

    public int getBottom() {
        return this._bottom;
    }

    public int getHeight() {
        return (this._bottom - this._top) + 1;
    }

    public int getId() {
        return this._id;
    }

    public int getLeft() {
        return this._left;
    }

    public int getRight() {
        return this._right;
    }

    public int getTop() {
        return this._top;
    }

    public int getWidth() {
        return (this._right - this._left) + 1;
    }

    public boolean isWithinDocument() {
        return this._inDoc;
    }
}
