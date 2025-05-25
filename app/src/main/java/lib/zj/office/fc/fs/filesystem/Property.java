package lib.zj.office.fc.fs.filesystem;

import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import lib.zj.office.fc.fs.storage.LittleEndian;
import lib.zj.office.fc.fs.storage.RawDataBlock;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* loaded from: classes3.dex */
public class Property {
    private static final int CHILD_PROPERTY_OFFSET = 76;
    public static final byte DIRECTORY_TYPE = 1;
    public static final byte DOCUMENT_TYPE = 2;
    private static final int NAME_SIZE_OFFSET = 64;
    private static final int NEXT_PROPERTY_OFFSET = 72;
    private static final int PREVIOUS_PROPERTY_OFFSET = 68;
    public static final int PROPERTY_TYPE_OFFSET = 66;
    public static final byte ROOT_TYPE = 5;
    private static final int SIZE_OFFSET = 120;
    private static final int START_BLOCK_OFFSET = 116;
    protected static final byte _NODE_BLACK = 1;
    protected static final byte _NODE_RED = 0;
    protected static final int _NO_INDEX = -1;
    private static int _big_block_minimum_bytes = 4096;
    private int _chlid_property;
    private String _name;
    private short _name_size;
    private int _next_property;
    private int _previous_property;
    private byte _property_type;
    private int _size;
    private int _start_block;
    private int blockSize;
    private RawDataBlock[] blocks;
    private byte[] documentRawData;
    protected Map<String, Property> properties = new HashMap();

    public Property(int i10, byte[] bArr, int i11) {
        this._name_size = LittleEndian.getShort(bArr, i11 + 64);
        this._previous_property = LittleEndian.getShort(bArr, i11 + 68);
        this._next_property = LittleEndian.getShort(bArr, i11 + 72);
        this._chlid_property = LittleEndian.getShort(bArr, i11 + 76);
        this._start_block = LittleEndian.getInt(bArr, i11 + 116);
        this._size = LittleEndian.getInt(bArr, i11 + 120);
        byte b10 = bArr[i11 + 66];
        this._property_type = b10;
        int i12 = (this._name_size / 2) - 1;
        if (i12 < 1) {
            if (b10 == 5) {
                this._name = "Root Entry";
                return;
            } else {
                this._name = "aaa";
                return;
            }
        }
        char[] cArr = new char[i12];
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            cArr[i14] = (char) LittleEndian.getShort(bArr, i13 + i11);
            i13 += 2;
        }
        this._name = new String(cArr, 0, i12);
    }

    private int getBlockIndexForOffset(int i10) {
        return i10 / this.blockSize;
    }

    private int getByteForOffset(int i10) {
        int i11 = this.blockSize;
        int i12 = i10 / i11;
        return this.blocks[i12].getData()[i10 - (i11 * i12)] & 255;
    }

    public void addChildProperty(Property property) {
        this.properties.put(property.getName(), property);
    }

    public void dispose() {
        Map<String, Property> map = this.properties;
        if (map != null) {
            for (String str : map.keySet()) {
                this.properties.get(str).dispose();
            }
            this.properties.clear();
        }
    }

    public RawDataBlock[] getBlocks() {
        return this.blocks;
    }

    public int getChildPropertyIndex() {
        return this._chlid_property;
    }

    public Property getChlidProperty(String str) {
        return this.properties.get(str);
    }

    public byte[] getDocumentRawData() {
        return this.documentRawData;
    }

    public int getInt(int i10) {
        int byteForOffset = getByteForOffset(i10);
        int byteForOffset2 = getByteForOffset(i10 + 1);
        return (getByteForOffset(i10 + 3) << 24) + (getByteForOffset(i10 + 2) << 16) + (byteForOffset2 << 8) + (byteForOffset << 0);
    }

    public long getLong(int i10) {
        long j10 = 0;
        for (int i11 = (i10 + 8) - 1; i11 >= i10; i11--) {
            j10 = (j10 << 8) | (getByteForOffset(i11) & FunctionEval.FunctionID.EXTERNAL_FUNC);
        }
        return j10;
    }

    public String getName() {
        return this._name;
    }

    public int getNextPropertyIndex() {
        return this._next_property;
    }

    public int getPreviousPropertyIndex() {
        return this._previous_property;
    }

    public long getPropertyRawDataSize() {
        int length;
        RawDataBlock[] rawDataBlockArr = this.blocks;
        if (rawDataBlockArr != null) {
            length = rawDataBlockArr[0].getData().length * this.blocks.length;
        } else {
            length = this.documentRawData.length;
        }
        return length;
    }

    public byte[] getRecordData(int i10) {
        int uInt = ((int) getUInt(i10 + 4)) + 8;
        if (uInt < 0) {
            uInt = 0;
        }
        byte[] bArr = this.documentRawData;
        if (bArr == null || bArr.length < uInt) {
            this.documentRawData = new byte[Math.max(uInt, this.blockSize)];
        }
        int i11 = this.blockSize;
        int i12 = i10 / i11;
        int i13 = i10 + uInt;
        int i14 = i13 / i11;
        if (i14 > i12) {
            int i15 = i10 % i11;
            System.arraycopy(this.blocks[i12].getData(), i15, this.documentRawData, 0, this.blockSize - i15);
            int i16 = this.blockSize - i15;
            int i17 = i12 + 1;
            if (i17 < i14) {
                while (i17 < i14) {
                    System.arraycopy(this.blocks[i17].getData(), 0, this.documentRawData, i16, this.blockSize);
                    i16 += this.blockSize;
                    i17++;
                }
            }
            RawDataBlock[] rawDataBlockArr = this.blocks;
            if (i14 < rawDataBlockArr.length) {
                System.arraycopy(rawDataBlockArr[i14].getData(), 0, this.documentRawData, i16, i13 % this.blockSize);
            }
        } else {
            System.arraycopy(this.blocks[i12].getData(), i10 % i11, this.documentRawData, 0, uInt);
        }
        return this.documentRawData;
    }

    public int getSize() {
        return this._size;
    }

    public int getStartBlock() {
        return this._start_block;
    }

    public long getUInt(int i10) {
        return getInt(i10) & 4294967295L;
    }

    public int getUShort(int i10) {
        return (getByteForOffset(i10 + 1) << 8) + (getByteForOffset(i10) << 0);
    }

    public boolean isDirectory() {
        if (this._property_type == 1) {
            return true;
        }
        return false;
    }

    public boolean isDocument() {
        if (this._property_type == 2) {
            return true;
        }
        return false;
    }

    public boolean isRoot() {
        if (this._property_type == 5) {
            return true;
        }
        return false;
    }

    public void setBlocks(RawDataBlock[] rawDataBlockArr) {
        this.blocks = rawDataBlockArr;
        this.blockSize = rawDataBlockArr[0].getData().length;
    }

    public void setDocumentRawData(byte[] bArr) {
        this.documentRawData = bArr;
    }

    public boolean shouldUseSmallBlocks() {
        if (getSize() < _big_block_minimum_bytes) {
            return true;
        }
        return false;
    }

    public void writeByte(OutputStream outputStream, int i10, int i11) {
        byte[] bArr = new byte[Math.min(i11, this.blockSize * 16)];
        int blockIndexForOffset = getBlockIndexForOffset(i10);
        int i12 = this.blockSize;
        int i13 = i10 - (i12 * blockIndexForOffset);
        int min = Math.min(i11, i12 - i13);
        System.arraycopy(this.blocks[blockIndexForOffset].getData(), i13, bArr, 0, min);
        int i14 = 1;
        while (min <= i11) {
            RawDataBlock[] rawDataBlockArr = this.blocks;
            if (blockIndexForOffset < rawDataBlockArr.length) {
                if (i14 < 16) {
                    blockIndexForOffset++;
                    i14++;
                    if (this.blockSize + min > i11) {
                        if (i11 > min && blockIndexForOffset < rawDataBlockArr.length) {
                            System.arraycopy(rawDataBlockArr[blockIndexForOffset].getData(), 0, bArr, min, i11 - min);
                        }
                        outputStream.write(bArr, 0, i11);
                        return;
                    }
                    System.arraycopy(rawDataBlockArr[blockIndexForOffset].getData(), 0, bArr, min, this.blockSize);
                    min += this.blockSize;
                } else {
                    outputStream.write(bArr, 0, min);
                    i11 -= min;
                    i14 = 0;
                    min = 0;
                }
            } else {
                return;
            }
        }
    }
}
