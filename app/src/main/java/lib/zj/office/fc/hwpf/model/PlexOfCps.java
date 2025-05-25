package lib.zj.office.fc.hwpf.model;

import a6.h;
import java.util.ArrayList;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class PlexOfCps {
    private int _cbStruct;
    private int _iMac;
    private int _offset;
    private ArrayList<GenericPropertyNode> _props;

    public PlexOfCps(int i10) {
        this._props = new ArrayList<>();
        this._cbStruct = i10;
    }

    private int getStructOffset(int i10) {
        return (this._cbStruct * i10) + ((this._iMac + 1) * 4);
    }

    public void addProperty(GenericPropertyNode genericPropertyNode) {
        this._props.add(genericPropertyNode);
    }

    public GenericPropertyNode getProperty(int i10) {
        return this._props.get(i10);
    }

    public int length() {
        return this._iMac;
    }

    public byte[] toByteArray() {
        int size = this._props.size();
        int i10 = (size + 1) * 4;
        byte[] bArr = new byte[(this._cbStruct * size) + i10];
        GenericPropertyNode genericPropertyNode = null;
        for (int i11 = 0; i11 < size; i11++) {
            genericPropertyNode = this._props.get(i11);
            LittleEndian.putInt(bArr, i11 * 4, genericPropertyNode.getStart());
            byte[] bytes = genericPropertyNode.getBytes();
            int i12 = this._cbStruct;
            System.arraycopy(bytes, 0, bArr, (i11 * i12) + i10, i12);
        }
        LittleEndian.putInt(bArr, size * 4, genericPropertyNode.getEnd());
        return bArr;
    }

    public GenericPropertyNode[] toPropertiesArray() {
        ArrayList<GenericPropertyNode> arrayList = this._props;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList<GenericPropertyNode> arrayList2 = this._props;
            return (GenericPropertyNode[]) arrayList2.toArray(new GenericPropertyNode[arrayList2.size()]);
        }
        return new GenericPropertyNode[0];
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PLCF (cbStruct: ");
        sb2.append(this._cbStruct);
        sb2.append("; iMac: ");
        return h.g(sb2, this._iMac, ")");
    }

    private GenericPropertyNode getProperty(int i10, byte[] bArr, int i11) {
        int i12 = LittleEndian.getInt(bArr, (i10 * 4) + i11);
        int i13 = LittleEndian.getInt(bArr, ((i10 + 1) * 4) + i11);
        byte[] bArr2 = new byte[this._cbStruct];
        System.arraycopy(bArr, i11 + getStructOffset(i10), bArr2, 0, this._cbStruct);
        return new GenericPropertyNode(i12, i13, bArr2);
    }

    public PlexOfCps(byte[] bArr, int i10, int i11, int i12) {
        this._iMac = (i11 - 4) / (i12 + 4);
        this._cbStruct = i12;
        this._props = new ArrayList<>(this._iMac);
        for (int i13 = 0; i13 < this._iMac; i13++) {
            this._props.add(getProperty(i13, bArr, i10));
        }
    }
}
