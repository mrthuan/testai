package lib.zj.office.fc.hslf.record;

import java.io.OutputStream;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class TextRulerAtom extends RecordAtom {
    private byte[] _data;
    private byte[] _header;
    private int[] bulletOffsets;
    private int defaultTabSize;
    private int numLevels;
    private int[] tabStops;
    private int[] textOffsets;

    public TextRulerAtom() {
        this.bulletOffsets = new int[]{-1, -1, -1, -1, -1};
        this.textOffsets = new int[]{-1, -1, -1, -1, -1};
        byte[] bArr = new byte[8];
        this._header = bArr;
        this._data = new byte[0];
        LittleEndian.putShort(bArr, 2, (short) getRecordType());
        LittleEndian.putInt(this._header, 4, this._data.length);
    }

    public static TextRulerAtom getParagraphInstance() {
        return new TextRulerAtom(new byte[]{0, 0, -90, 15, 10, 0, 0, 0, 16, 3, 0, 0, -7, 0, Field.SECTION, 1, Field.SECTION, 1}, 0, 18);
    }

    private void read() {
        short s4 = LittleEndian.getShort(this._data);
        int[] iArr = {1, 0, 2, 3, 8, 4, 9, 5, 10, 6, 11, 7, 12};
        int i10 = 4;
        for (int i11 = 0; i11 < 13; i11++) {
            int i12 = iArr[i11];
            if (((1 << i12) & s4) != 0) {
                switch (i12) {
                    case 0:
                        this.defaultTabSize = LittleEndian.getShort(this._data, i10);
                        i10 += 2;
                        break;
                    case 1:
                        this.numLevels = LittleEndian.getShort(this._data, i10);
                        i10 += 2;
                        break;
                    case 2:
                        short s10 = LittleEndian.getShort(this._data, i10);
                        i10 += 2;
                        this.tabStops = new int[s10 * 2];
                        int i13 = 0;
                        while (true) {
                            int[] iArr2 = this.tabStops;
                            if (i13 < iArr2.length) {
                                iArr2[i13] = LittleEndian.getUShort(this._data, i10);
                                i10 += 2;
                                i13++;
                            }
                        }
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        short s11 = LittleEndian.getShort(this._data, i10);
                        i10 += 2;
                        this.bulletOffsets[iArr[i11] - 3] = s11;
                        break;
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        short s12 = LittleEndian.getShort(this._data, i10);
                        i10 += 2;
                        this.textOffsets[iArr[i11] - 8] = s12;
                        break;
                }
            }
        }
    }

    public int[] getBulletOffsets() {
        return this.bulletOffsets;
    }

    public int getDefaultTabSize() {
        return this.defaultTabSize;
    }

    public int getNumberOfLevels() {
        return this.numLevels;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return RecordTypes.TextRulerAtom.typeID;
    }

    public int[] getTabStops() {
        return this.tabStops;
    }

    public int[] getTextOffsets() {
        return this.textOffsets;
    }

    public void setParagraphIndent(short s4, short s10) {
        LittleEndian.putShort(this._data, 4, s4);
        LittleEndian.putShort(this._data, 6, s10);
        LittleEndian.putShort(this._data, 8, s10);
    }

    public void writeOut(OutputStream outputStream) {
        outputStream.write(this._header);
        outputStream.write(this._data);
    }

    public TextRulerAtom(byte[] bArr, int i10, int i11) {
        this.bulletOffsets = new int[]{-1, -1, -1, -1, -1};
        this.textOffsets = new int[]{-1, -1, -1, -1, -1};
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        int i12 = i11 - 8;
        byte[] bArr3 = new byte[i12];
        this._data = bArr3;
        System.arraycopy(bArr, i10 + 8, bArr3, 0, i12);
        try {
            read();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
    }
}
