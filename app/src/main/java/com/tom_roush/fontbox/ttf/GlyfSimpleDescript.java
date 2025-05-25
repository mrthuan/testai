package com.tom_roush.fontbox.ttf;

/* loaded from: classes2.dex */
public class GlyfSimpleDescript extends GlyfDescript {
    private int[] endPtsOfContours;
    private byte[] flags;
    private final int pointCount;
    private short[] xCoordinates;
    private short[] yCoordinates;

    public GlyfSimpleDescript() {
        super((short) 0, null);
        this.pointCount = 0;
    }

    private void readCoords(int i10, TTFDataStream tTFDataStream, short s4) {
        short readSignedShort;
        int i11;
        short readSignedShort2;
        int i12;
        for (int i13 = 0; i13 < i10; i13++) {
            byte b10 = this.flags[i13];
            if ((b10 & 16) != 0) {
                if ((b10 & 2) != 0) {
                    i12 = tTFDataStream.readUnsignedByte();
                } else {
                    this.xCoordinates[i13] = s4;
                }
            } else if ((b10 & 2) != 0) {
                i12 = -((short) tTFDataStream.readUnsignedByte());
            } else {
                readSignedShort2 = tTFDataStream.readSignedShort();
                s4 = (short) (s4 + readSignedShort2);
                this.xCoordinates[i13] = s4;
            }
            readSignedShort2 = (short) i12;
            s4 = (short) (s4 + readSignedShort2);
            this.xCoordinates[i13] = s4;
        }
        short s10 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            byte b11 = this.flags[i14];
            if ((b11 & 32) != 0) {
                if ((b11 & 4) != 0) {
                    i11 = tTFDataStream.readUnsignedByte();
                } else {
                    this.yCoordinates[i14] = s10;
                }
            } else if ((b11 & 4) != 0) {
                i11 = -((short) tTFDataStream.readUnsignedByte());
            } else {
                readSignedShort = tTFDataStream.readSignedShort();
                s10 = (short) (s10 + readSignedShort);
                this.yCoordinates[i14] = s10;
            }
            readSignedShort = (short) i11;
            s10 = (short) (s10 + readSignedShort);
            this.yCoordinates[i14] = s10;
        }
    }

    private void readFlags(int i10, TTFDataStream tTFDataStream) {
        int i11 = 0;
        while (i11 < i10) {
            this.flags[i11] = (byte) tTFDataStream.readUnsignedByte();
            if ((this.flags[i11] & 8) != 0) {
                int readUnsignedByte = tTFDataStream.readUnsignedByte();
                for (int i12 = 1; i12 <= readUnsignedByte; i12++) {
                    int i13 = i11 + i12;
                    byte[] bArr = this.flags;
                    if (i13 >= bArr.length) {
                        return;
                    }
                    bArr[i13] = bArr[i11];
                }
                i11 += readUnsignedByte;
            }
            i11++;
        }
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public int getEndPtOfContours(int i10) {
        return this.endPtsOfContours[i10];
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public byte getFlags(int i10) {
        return this.flags[i10];
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public int getPointCount() {
        return this.pointCount;
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public short getXCoordinate(int i10) {
        return this.xCoordinates[i10];
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public short getYCoordinate(int i10) {
        return this.yCoordinates[i10];
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public boolean isComposite() {
        return false;
    }

    public GlyfSimpleDescript(short s4, TTFDataStream tTFDataStream, short s10) {
        super(s4, tTFDataStream);
        if (s4 == 0) {
            this.pointCount = 0;
            return;
        }
        int[] readUnsignedShortArray = tTFDataStream.readUnsignedShortArray(s4);
        this.endPtsOfContours = readUnsignedShortArray;
        int i10 = readUnsignedShortArray[s4 - 1];
        if (s4 == 1 && i10 == 65535) {
            this.pointCount = 0;
            return;
        }
        int i11 = i10 + 1;
        this.pointCount = i11;
        this.flags = new byte[i11];
        this.xCoordinates = new short[i11];
        this.yCoordinates = new short[i11];
        readInstructions(tTFDataStream, tTFDataStream.readUnsignedShort());
        readFlags(i11, tTFDataStream);
        readCoords(i11, tTFDataStream, s10);
    }
}
