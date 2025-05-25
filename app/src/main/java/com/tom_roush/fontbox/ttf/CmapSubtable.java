package com.tom_roush.fontbox.ttf;

import androidx.appcompat.view.menu.d;
import b.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.hpsf.Variant;

/* loaded from: classes2.dex */
public class CmapSubtable implements CmapLookup {
    private static final long LEAD_OFFSET = 55232;
    private static final long SURROGATE_OFFSET = -56613888;
    private int[] glyphIdToCharacterCode;
    private int platformEncodingId;
    private int platformId;
    private long subTableOffset;
    private final Map<Integer, List<Integer>> glyphIdToCharacterCodeMultiple = new HashMap();
    private Map<Integer, Integer> characterCodeToGlyphId = new HashMap();

    /* loaded from: classes2.dex */
    public static class SubHeader {
        private final int entryCount;
        private final int firstCode;
        private final short idDelta;
        private final int idRangeOffset;

        public /* synthetic */ SubHeader(int i10, int i11, short s4, int i12, int i13) {
            this(i10, i11, s4, i12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getEntryCount() {
            return this.entryCount;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getFirstCode() {
            return this.firstCode;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public short getIdDelta() {
            return this.idDelta;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getIdRangeOffset() {
            return this.idRangeOffset;
        }

        private SubHeader(int i10, int i11, short s4, int i12) {
            this.firstCode = i10;
            this.entryCount = i11;
            this.idDelta = s4;
            this.idRangeOffset = i12;
        }
    }

    private void buildGlyphIdToCharacterCodeLookup(int i10) {
        this.glyphIdToCharacterCode = newGlyphIdToCharacterCode(i10 + 1);
        for (Map.Entry<Integer, Integer> entry : this.characterCodeToGlyphId.entrySet()) {
            if (this.glyphIdToCharacterCode[entry.getValue().intValue()] == -1) {
                this.glyphIdToCharacterCode[entry.getValue().intValue()] = entry.getKey().intValue();
            } else {
                List<Integer> list = this.glyphIdToCharacterCodeMultiple.get(entry.getValue());
                ArrayList arrayList = list;
                if (list == null) {
                    ArrayList arrayList2 = new ArrayList();
                    this.glyphIdToCharacterCodeMultiple.put(entry.getValue(), arrayList2);
                    arrayList2.add(Integer.valueOf(this.glyphIdToCharacterCode[entry.getValue().intValue()]));
                    this.glyphIdToCharacterCode[entry.getValue().intValue()] = Integer.MIN_VALUE;
                    arrayList = arrayList2;
                }
                arrayList.add(entry.getKey());
            }
        }
    }

    private int getCharCode(int i10) {
        if (i10 >= 0) {
            int[] iArr = this.glyphIdToCharacterCode;
            if (i10 < iArr.length) {
                return iArr[i10];
            }
            return -1;
        }
        return -1;
    }

    private int[] newGlyphIdToCharacterCode(int i10) {
        int[] iArr = new int[i10];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    @Override // com.tom_roush.fontbox.ttf.CmapLookup
    public List<Integer> getCharCodes(int i10) {
        int charCode = getCharCode(i10);
        if (charCode == -1) {
            return null;
        }
        if (charCode == Integer.MIN_VALUE) {
            List<Integer> list = this.glyphIdToCharacterCodeMultiple.get(Integer.valueOf(i10));
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list);
            Collections.sort(arrayList);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(Integer.valueOf(charCode));
        return arrayList2;
    }

    @Deprecated
    public Integer getCharacterCode(int i10) {
        List<Integer> list;
        int charCode = getCharCode(i10);
        if (charCode == -1) {
            return null;
        }
        if (charCode == Integer.MIN_VALUE && (list = this.glyphIdToCharacterCodeMultiple.get(Integer.valueOf(i10))) != null) {
            return list.get(0);
        }
        return Integer.valueOf(charCode);
    }

    @Override // com.tom_roush.fontbox.ttf.CmapLookup
    public int getGlyphId(int i10) {
        Integer num = this.characterCodeToGlyphId.get(Integer.valueOf(i10));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int getPlatformEncodingId() {
        return this.platformEncodingId;
    }

    public int getPlatformId() {
        return this.platformId;
    }

    public void initData(TTFDataStream tTFDataStream) {
        this.platformId = tTFDataStream.readUnsignedShort();
        this.platformEncodingId = tTFDataStream.readUnsignedShort();
        this.subTableOffset = tTFDataStream.readUnsignedInt();
    }

    public void initSubtable(CmapTable cmapTable, int i10, TTFDataStream tTFDataStream) {
        tTFDataStream.seek(cmapTable.getOffset() + this.subTableOffset);
        int readUnsignedShort = tTFDataStream.readUnsignedShort();
        if (readUnsignedShort < 8) {
            tTFDataStream.readUnsignedShort();
            tTFDataStream.readUnsignedShort();
        } else {
            tTFDataStream.readUnsignedShort();
            tTFDataStream.readUnsignedInt();
            tTFDataStream.readUnsignedInt();
        }
        if (readUnsignedShort != 0) {
            if (readUnsignedShort != 2) {
                if (readUnsignedShort != 4) {
                    if (readUnsignedShort != 6) {
                        if (readUnsignedShort != 8) {
                            if (readUnsignedShort != 10) {
                                switch (readUnsignedShort) {
                                    case 12:
                                        processSubtype12(tTFDataStream, i10);
                                        return;
                                    case 13:
                                        processSubtype13(tTFDataStream, i10);
                                        return;
                                    case 14:
                                        processSubtype14(tTFDataStream, i10);
                                        return;
                                    default:
                                        throw new IOException(a.c("Unknown cmap format:", readUnsignedShort));
                                }
                            }
                            processSubtype10(tTFDataStream, i10);
                            return;
                        }
                        processSubtype8(tTFDataStream, i10);
                        return;
                    }
                    processSubtype6(tTFDataStream, i10);
                    return;
                }
                processSubtype4(tTFDataStream, i10);
                return;
            }
            processSubtype2(tTFDataStream, i10);
            return;
        }
        processSubtype0(tTFDataStream);
    }

    public void processSubtype0(TTFDataStream tTFDataStream) {
        byte[] read = tTFDataStream.read(256);
        this.glyphIdToCharacterCode = newGlyphIdToCharacterCode(256);
        this.characterCodeToGlyphId = new HashMap(read.length);
        for (int i10 = 0; i10 < read.length; i10++) {
            int i11 = read[i10] & 255;
            this.glyphIdToCharacterCode[i11] = i10;
            this.characterCodeToGlyphId.put(Integer.valueOf(i10), Integer.valueOf(i11));
        }
    }

    public void processSubtype10(TTFDataStream tTFDataStream, int i10) {
        long readUnsignedInt = tTFDataStream.readUnsignedInt();
        long readUnsignedInt2 = tTFDataStream.readUnsignedInt();
        if (readUnsignedInt2 <= 2147483647L) {
            if (readUnsignedInt >= 0 && readUnsignedInt <= 1114111) {
                long j10 = readUnsignedInt + readUnsignedInt2;
                if (j10 <= 1114111 && (j10 < 55296 || j10 > 57343)) {
                    return;
                }
            }
            throw new IOException("Invalid Characters codes");
        }
        throw new IOException("Invalid number of Characters");
    }

    public void processSubtype12(TTFDataStream tTFDataStream, int i10) {
        long j10;
        int i11 = i10;
        long readUnsignedInt = tTFDataStream.readUnsignedInt();
        this.glyphIdToCharacterCode = newGlyphIdToCharacterCode(i11);
        this.characterCodeToGlyphId = new HashMap(i11);
        if (i11 == 0) {
            return;
        }
        long j11 = 0;
        long j12 = 0;
        while (j12 < readUnsignedInt) {
            long readUnsignedInt2 = tTFDataStream.readUnsignedInt();
            long readUnsignedInt3 = tTFDataStream.readUnsignedInt();
            long readUnsignedInt4 = tTFDataStream.readUnsignedInt();
            if (readUnsignedInt2 >= j11 && readUnsignedInt2 <= 1114111 && (readUnsignedInt2 < 55296 || readUnsignedInt2 > 57343)) {
                if ((readUnsignedInt3 <= j11 || readUnsignedInt3 >= readUnsignedInt2) && readUnsignedInt3 <= 1114111 && (readUnsignedInt3 < 55296 || readUnsignedInt3 > 57343)) {
                    long j13 = j11;
                    while (true) {
                        if (j13 <= readUnsignedInt3 - readUnsignedInt2) {
                            long j14 = readUnsignedInt4 + j13;
                            j10 = readUnsignedInt;
                            if (j14 >= i11) {
                                break;
                            }
                            int i12 = (int) j14;
                            int i13 = (int) (readUnsignedInt2 + j13);
                            this.glyphIdToCharacterCode[i12] = i13;
                            this.characterCodeToGlyphId.put(Integer.valueOf(i13), Integer.valueOf(i12));
                            j13++;
                            i11 = i10;
                            readUnsignedInt = j10;
                        } else {
                            j10 = readUnsignedInt;
                            break;
                        }
                    }
                    j12++;
                    i11 = i10;
                    readUnsignedInt = j10;
                    j11 = 0;
                } else {
                    throw new IOException("Invalid characters codes");
                }
            } else {
                throw new IOException("Invalid characters codes");
            }
        }
    }

    public void processSubtype13(TTFDataStream tTFDataStream, int i10) {
        int i11 = i10;
        long readUnsignedInt = tTFDataStream.readUnsignedInt();
        this.glyphIdToCharacterCode = newGlyphIdToCharacterCode(i11);
        this.characterCodeToGlyphId = new HashMap(i11);
        if (i11 == 0) {
            return;
        }
        long j10 = 0;
        long j11 = 0;
        while (j11 < readUnsignedInt) {
            long readUnsignedInt2 = tTFDataStream.readUnsignedInt();
            long readUnsignedInt3 = tTFDataStream.readUnsignedInt();
            long readUnsignedInt4 = tTFDataStream.readUnsignedInt();
            if (readUnsignedInt4 <= i11) {
                if (readUnsignedInt2 >= j10 && readUnsignedInt2 <= 1114111 && (readUnsignedInt2 < 55296 || readUnsignedInt2 > 57343)) {
                    if ((readUnsignedInt3 <= j10 || readUnsignedInt3 >= readUnsignedInt2) && readUnsignedInt3 <= 1114111 && (readUnsignedInt3 < 55296 || readUnsignedInt3 > 57343)) {
                        long j12 = j10;
                        while (j12 <= readUnsignedInt3 - readUnsignedInt2) {
                            long j13 = readUnsignedInt2 + j12;
                            if (j13 <= 2147483647L) {
                                long j14 = readUnsignedInt;
                                int i12 = (int) readUnsignedInt4;
                                int i13 = (int) j13;
                                this.glyphIdToCharacterCode[i12] = i13;
                                this.characterCodeToGlyphId.put(Integer.valueOf(i13), Integer.valueOf(i12));
                                j12++;
                                readUnsignedInt = j14;
                            } else {
                                throw new IOException("Character Code greater than Integer.MAX_VALUE");
                            }
                        }
                        j11++;
                        i11 = i10;
                        j10 = 0;
                    } else {
                        throw new IOException("Invalid Characters codes");
                    }
                } else {
                    throw new IOException("Invalid Characters codes");
                }
            } else {
                return;
            }
        }
    }

    public void processSubtype2(TTFDataStream tTFDataStream, int i10) {
        int i11;
        int[] iArr = new int[256];
        int i12 = 0;
        for (int i13 = 0; i13 < 256; i13++) {
            int readUnsignedShort = tTFDataStream.readUnsignedShort();
            iArr[i13] = readUnsignedShort;
            i12 = Math.max(i12, readUnsignedShort / 8);
        }
        SubHeader[] subHeaderArr = new SubHeader[i12 + 1];
        for (int i14 = 0; i14 <= i12; i14++) {
            subHeaderArr[i14] = new SubHeader(tTFDataStream.readUnsignedShort(), tTFDataStream.readUnsignedShort(), tTFDataStream.readSignedShort(), (tTFDataStream.readUnsignedShort() - (((i11 - i14) - 1) * 8)) - 2, 0);
        }
        long currentPosition = tTFDataStream.getCurrentPosition();
        this.glyphIdToCharacterCode = newGlyphIdToCharacterCode(i10);
        this.characterCodeToGlyphId = new HashMap(i10);
        if (i10 == 0) {
            return;
        }
        for (int i15 = 0; i15 <= i12; i15++) {
            SubHeader subHeader = subHeaderArr[i15];
            int firstCode = subHeader.getFirstCode();
            int idRangeOffset = subHeader.getIdRangeOffset();
            short idDelta = subHeader.getIdDelta();
            int entryCount = subHeader.getEntryCount();
            tTFDataStream.seek(idRangeOffset + currentPosition);
            for (int i16 = 0; i16 < entryCount; i16++) {
                int i17 = firstCode + i16 + (i15 << 8);
                int readUnsignedShort2 = tTFDataStream.readUnsignedShort();
                if (readUnsignedShort2 > 0 && (readUnsignedShort2 = (readUnsignedShort2 + idDelta) % 65536) < 0) {
                    readUnsignedShort2 += 65536;
                }
                if (readUnsignedShort2 < i10) {
                    this.glyphIdToCharacterCode[readUnsignedShort2] = i17;
                    this.characterCodeToGlyphId.put(Integer.valueOf(i17), Integer.valueOf(readUnsignedShort2));
                }
            }
        }
    }

    public void processSubtype4(TTFDataStream tTFDataStream, int i10) {
        long j10;
        int max;
        int readUnsignedShort = tTFDataStream.readUnsignedShort() / 2;
        tTFDataStream.readUnsignedShort();
        tTFDataStream.readUnsignedShort();
        tTFDataStream.readUnsignedShort();
        int[] readUnsignedShortArray = tTFDataStream.readUnsignedShortArray(readUnsignedShort);
        tTFDataStream.readUnsignedShort();
        int[] readUnsignedShortArray2 = tTFDataStream.readUnsignedShortArray(readUnsignedShort);
        int[] readUnsignedShortArray3 = tTFDataStream.readUnsignedShortArray(readUnsignedShort);
        long currentPosition = tTFDataStream.getCurrentPosition();
        int[] readUnsignedShortArray4 = tTFDataStream.readUnsignedShortArray(readUnsignedShort);
        this.characterCodeToGlyphId = new HashMap(i10);
        int i11 = 0;
        int i12 = 0;
        while (i11 < readUnsignedShort) {
            int i13 = readUnsignedShortArray2[i11];
            int i14 = readUnsignedShortArray[i11];
            int i15 = readUnsignedShortArray3[i11];
            int i16 = readUnsignedShortArray4[i11];
            int i17 = readUnsignedShort;
            int[] iArr = readUnsignedShortArray;
            int[] iArr2 = readUnsignedShortArray2;
            int[] iArr3 = readUnsignedShortArray3;
            long j11 = (i11 * 2) + currentPosition + i16;
            int i18 = Variant.VT_ILLEGAL;
            if (i13 != 65535 && i14 != 65535) {
                int i19 = i13;
                while (i19 <= i14) {
                    if (i16 == 0) {
                        j10 = currentPosition;
                        int i20 = (i19 + i15) & i18;
                        max = Math.max(i20, i12);
                        this.characterCodeToGlyphId.put(Integer.valueOf(i19), Integer.valueOf(i20));
                    } else {
                        j10 = currentPosition;
                        tTFDataStream.seek(((i19 - i13) * 2) + j11);
                        int readUnsignedShort2 = tTFDataStream.readUnsignedShort();
                        if (readUnsignedShort2 != 0) {
                            int i21 = (readUnsignedShort2 + i15) & Variant.VT_ILLEGAL;
                            max = Math.max(i21, i12);
                            this.characterCodeToGlyphId.put(Integer.valueOf(i19), Integer.valueOf(i21));
                        } else {
                            i19++;
                            currentPosition = j10;
                            i18 = Variant.VT_ILLEGAL;
                        }
                    }
                    i12 = max;
                    i19++;
                    currentPosition = j10;
                    i18 = Variant.VT_ILLEGAL;
                }
            }
            i11++;
            readUnsignedShortArray2 = iArr2;
            readUnsignedShort = i17;
            readUnsignedShortArray = iArr;
            readUnsignedShortArray3 = iArr3;
            currentPosition = currentPosition;
        }
        if (this.characterCodeToGlyphId.isEmpty()) {
            return;
        }
        buildGlyphIdToCharacterCodeLookup(i12);
    }

    public void processSubtype6(TTFDataStream tTFDataStream, int i10) {
        int readUnsignedShort = tTFDataStream.readUnsignedShort();
        int readUnsignedShort2 = tTFDataStream.readUnsignedShort();
        if (readUnsignedShort2 == 0) {
            return;
        }
        this.characterCodeToGlyphId = new HashMap(i10);
        int[] readUnsignedShortArray = tTFDataStream.readUnsignedShortArray(readUnsignedShort2);
        int i11 = 0;
        for (int i12 = 0; i12 < readUnsignedShort2; i12++) {
            i11 = Math.max(i11, readUnsignedShortArray[i12]);
            this.characterCodeToGlyphId.put(Integer.valueOf(readUnsignedShort + i12), Integer.valueOf(readUnsignedShortArray[i12]));
        }
        buildGlyphIdToCharacterCodeLookup(i11);
    }

    public void processSubtype8(TTFDataStream tTFDataStream, int i10) {
        int[] readUnsignedByteArray = tTFDataStream.readUnsignedByteArray(8192);
        long readUnsignedInt = tTFDataStream.readUnsignedInt();
        if (readUnsignedInt <= 65536) {
            this.glyphIdToCharacterCode = newGlyphIdToCharacterCode(i10);
            this.characterCodeToGlyphId = new HashMap(i10);
            if (i10 == 0) {
                return;
            }
            long j10 = 0;
            long j11 = 0;
            while (j10 < readUnsignedInt) {
                long readUnsignedInt2 = tTFDataStream.readUnsignedInt();
                long readUnsignedInt3 = tTFDataStream.readUnsignedInt();
                long readUnsignedInt4 = tTFDataStream.readUnsignedInt();
                if (readUnsignedInt2 <= readUnsignedInt3 && j11 <= readUnsignedInt2) {
                    long j12 = readUnsignedInt2;
                    while (j12 <= readUnsignedInt3) {
                        if (j12 <= 2147483647L) {
                            long j13 = readUnsignedInt;
                            int i11 = (int) j12;
                            int i12 = i11 / 8;
                            long j14 = readUnsignedInt3;
                            if (i12 < readUnsignedByteArray.length) {
                                if ((readUnsignedByteArray[i12] & (1 << (i11 % 8))) != 0) {
                                    long j15 = (((j12 >> 10) + LEAD_OFFSET) << 10) + (1023 & j12) + 56320 + SURROGATE_OFFSET;
                                    if (j15 <= 2147483647L) {
                                        i11 = (int) j15;
                                    } else {
                                        throw new IOException(d.c("[Sub Format 8] Invalid character code ", j15));
                                    }
                                }
                                long j16 = (j12 - readUnsignedInt2) + readUnsignedInt4;
                                int[] iArr = readUnsignedByteArray;
                                if (j16 <= i10 && j16 <= 2147483647L) {
                                    int i13 = (int) j16;
                                    this.glyphIdToCharacterCode[i13] = i11;
                                    this.characterCodeToGlyphId.put(Integer.valueOf(i11), Integer.valueOf(i13));
                                    j12++;
                                    readUnsignedByteArray = iArr;
                                    readUnsignedInt = j13;
                                    readUnsignedInt3 = j14;
                                } else {
                                    throw new IOException("CMap contains an invalid glyph index");
                                }
                            } else {
                                throw new IOException(d.c("[Sub Format 8] Invalid character code ", j12));
                            }
                        } else {
                            throw new IOException(d.c("[Sub Format 8] Invalid character code ", j12));
                        }
                    }
                    j10++;
                    j11 = 0;
                    readUnsignedInt = readUnsignedInt;
                } else {
                    throw new IOException("Range invalid");
                }
            }
            return;
        }
        throw new IOException("CMap ( Subtype8 ) is invalid");
    }

    public void setPlatformEncodingId(int i10) {
        this.platformEncodingId = i10;
    }

    public void setPlatformId(int i10) {
        this.platformId = i10;
    }

    public String toString() {
        return "{" + getPlatformId() + " " + getPlatformEncodingId() + "}";
    }

    public void processSubtype14(TTFDataStream tTFDataStream, int i10) {
    }
}
