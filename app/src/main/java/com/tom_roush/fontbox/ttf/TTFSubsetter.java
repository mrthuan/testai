package com.tom_roush.fontbox.ttf;

import androidx.activity.r;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;
import lib.zj.office.fc.codec.CharEncoding;

/* loaded from: classes2.dex */
public final class TTFSubsetter {
    private static final byte[] PAD_BUF = {0, 0, 0};
    private final SortedSet<Integer> glyphIds;
    private boolean hasAddedCompoundReferences;
    private final List<String> keepTables;
    private String prefix;
    private final TrueTypeFont ttf;
    private final SortedMap<Integer, Integer> uniToGID;
    private final CmapLookup unicodeCmap;

    public TTFSubsetter(TrueTypeFont trueTypeFont) {
        this(trueTypeFont, null);
    }

    private void addCompoundReferences() {
        boolean z10;
        int i10;
        if (this.hasAddedCompoundReferences) {
            return;
        }
        this.hasAddedCompoundReferences = true;
        do {
            GlyphTable glyph = this.ttf.getGlyph();
            long[] offsets = this.ttf.getIndexToLocation().getOffsets();
            InputStream originalData = this.ttf.getOriginalData();
            try {
                originalData.skip(glyph.getOffset());
                Iterator<Integer> it = this.glyphIds.iterator();
                TreeSet treeSet = null;
                long j10 = 0;
                while (true) {
                    z10 = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    Integer next = it.next();
                    long j11 = offsets[next.intValue()];
                    long j12 = offsets[next.intValue() + 1] - j11;
                    originalData.skip(j11 - j10);
                    int i11 = (int) j12;
                    byte[] bArr = new byte[i11];
                    originalData.read(bArr);
                    if (i11 >= 2 && bArr[0] == -1 && bArr[1] == -1) {
                        int i12 = 10;
                        do {
                            i10 = ((bArr[i12] & 255) << 8) | (bArr[i12 + 1] & 255);
                            int i13 = i12 + 2;
                            int i14 = ((bArr[i13] & 255) << 8) | (bArr[i13 + 1] & 255);
                            if (!this.glyphIds.contains(Integer.valueOf(i14))) {
                                if (treeSet == null) {
                                    treeSet = new TreeSet();
                                }
                                treeSet.add(Integer.valueOf(i14));
                            }
                            int i15 = i13 + 2;
                            if ((i10 & 1) != 0) {
                                i12 = i15 + 4;
                            } else {
                                i12 = i15 + 2;
                            }
                            if ((i10 & 128) != 0) {
                                i12 += 8;
                            } else if ((i10 & 64) != 0) {
                                i12 += 4;
                            } else if ((i10 & 8) != 0) {
                                i12 += 2;
                            }
                        } while ((i10 & 32) != 0);
                        j10 = offsets[next.intValue() + 1];
                    } else {
                        j10 = offsets[next.intValue() + 1];
                    }
                }
                if (treeSet != null) {
                    this.glyphIds.addAll(treeSet);
                }
                if (treeSet != null) {
                    z10 = true;
                    continue;
                }
            } finally {
                originalData.close();
            }
        } while (z10);
    }

    private byte[] buildCmapTable() {
        if (this.ttf.getCmap() != null && !this.uniToGID.isEmpty()) {
            List<String> list = this.keepTables;
            if (list == null || list.contains(CmapTable.TAG)) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                writeUint16(dataOutputStream, 0);
                writeUint16(dataOutputStream, 1);
                writeUint16(dataOutputStream, 3);
                writeUint16(dataOutputStream, 1);
                writeUint32(dataOutputStream, 12L);
                Iterator<Map.Entry<Integer, Integer>> it = this.uniToGID.entrySet().iterator();
                Map.Entry<Integer, Integer> next = it.next();
                int newGlyphId = getNewGlyphId(next.getValue());
                int size = this.uniToGID.size() + 1;
                int[] iArr = new int[size];
                int[] iArr2 = new int[size];
                int[] iArr3 = new int[size];
                int i10 = 0;
                int i11 = newGlyphId;
                Map.Entry<Integer, Integer> entry = next;
                while (it.hasNext()) {
                    Map.Entry<Integer, Integer> next2 = it.next();
                    int newGlyphId2 = getNewGlyphId(next2.getValue());
                    if (next2.getKey().intValue() <= 65535) {
                        if (next2.getKey().intValue() != entry.getKey().intValue() + 1 || newGlyphId2 - i11 != next2.getKey().intValue() - next.getKey().intValue()) {
                            if (i11 != 0) {
                                iArr[i10] = next.getKey().intValue();
                                iArr2[i10] = entry.getKey().intValue();
                                iArr3[i10] = i11 - next.getKey().intValue();
                            } else {
                                if (!next.getKey().equals(entry.getKey())) {
                                    iArr[i10] = next.getKey().intValue() + 1;
                                    iArr2[i10] = entry.getKey().intValue();
                                    iArr3[i10] = i11 - next.getKey().intValue();
                                }
                                next = next2;
                                i11 = newGlyphId2;
                            }
                            i10++;
                            next = next2;
                            i11 = newGlyphId2;
                        }
                        entry = next2;
                    } else {
                        throw new UnsupportedOperationException("non-BMP Unicode character");
                    }
                }
                iArr[i10] = next.getKey().intValue();
                iArr2[i10] = entry.getKey().intValue();
                iArr3[i10] = i11 - next.getKey().intValue();
                int i12 = i10 + 1;
                iArr[i12] = 65535;
                iArr2[i12] = 65535;
                iArr3[i12] = 1;
                int i13 = i12 + 1;
                int pow = ((int) Math.pow(2.0d, log2(i13))) * 2;
                writeUint16(dataOutputStream, 4);
                writeUint16(dataOutputStream, (i13 * 4 * 2) + 16);
                writeUint16(dataOutputStream, 0);
                int i14 = i13 * 2;
                writeUint16(dataOutputStream, i14);
                writeUint16(dataOutputStream, pow);
                writeUint16(dataOutputStream, log2(pow / 2));
                writeUint16(dataOutputStream, i14 - pow);
                for (int i15 = 0; i15 < i13; i15++) {
                    writeUint16(dataOutputStream, iArr2[i15]);
                }
                writeUint16(dataOutputStream, 0);
                for (int i16 = 0; i16 < i13; i16++) {
                    writeUint16(dataOutputStream, iArr[i16]);
                }
                for (int i17 = 0; i17 < i13; i17++) {
                    writeUint16(dataOutputStream, iArr3[i17]);
                }
                for (int i18 = 0; i18 < i13; i18++) {
                    writeUint16(dataOutputStream, 0);
                }
                return byteArrayOutputStream.toByteArray();
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x010b A[Catch: all -> 0x012e, TryCatch #0 {all -> 0x012e, blocks: (B:3:0x001d, B:4:0x0030, B:6:0x0036, B:8:0x0060, B:10:0x0065, B:13:0x006b, B:15:0x0097, B:16:0x00a0, B:18:0x00b6, B:20:0x00bb, B:22:0x00bf, B:29:0x00cf, B:31:0x00d3, B:33:0x00d9, B:34:0x00e9, B:39:0x0100, B:40:0x0101, B:42:0x010b, B:44:0x011a, B:23:0x00c2, B:25:0x00c6, B:26:0x00c9, B:28:0x00cd, B:19:0x00b9, B:38:0x00fb, B:45:0x0124), top: B:51:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private byte[] buildGlyfTable(long[] r21) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tom_roush.fontbox.ttf.TTFSubsetter.buildGlyfTable(long[]):byte[]");
    }

    private byte[] buildHeadTable() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        HeaderTable header = this.ttf.getHeader();
        writeFixed(dataOutputStream, header.getVersion());
        writeFixed(dataOutputStream, header.getFontRevision());
        writeUint32(dataOutputStream, 0L);
        writeUint32(dataOutputStream, header.getMagicNumber());
        writeUint16(dataOutputStream, header.getFlags());
        writeUint16(dataOutputStream, header.getUnitsPerEm());
        writeLongDateTime(dataOutputStream, header.getCreated());
        writeLongDateTime(dataOutputStream, header.getModified());
        writeSInt16(dataOutputStream, header.getXMin());
        writeSInt16(dataOutputStream, header.getYMin());
        writeSInt16(dataOutputStream, header.getXMax());
        writeSInt16(dataOutputStream, header.getYMax());
        writeUint16(dataOutputStream, header.getMacStyle());
        writeUint16(dataOutputStream, header.getLowestRecPPEM());
        writeSInt16(dataOutputStream, header.getFontDirectionHint());
        writeSInt16(dataOutputStream, (short) 1);
        writeSInt16(dataOutputStream, header.getGlyphDataFormat());
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    private byte[] buildHheaTable() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        HorizontalHeaderTable horizontalHeader = this.ttf.getHorizontalHeader();
        writeFixed(dataOutputStream, horizontalHeader.getVersion());
        writeSInt16(dataOutputStream, horizontalHeader.getAscender());
        writeSInt16(dataOutputStream, horizontalHeader.getDescender());
        writeSInt16(dataOutputStream, horizontalHeader.getLineGap());
        writeUint16(dataOutputStream, horizontalHeader.getAdvanceWidthMax());
        writeSInt16(dataOutputStream, horizontalHeader.getMinLeftSideBearing());
        writeSInt16(dataOutputStream, horizontalHeader.getMinRightSideBearing());
        writeSInt16(dataOutputStream, horizontalHeader.getXMaxExtent());
        writeSInt16(dataOutputStream, horizontalHeader.getCaretSlopeRise());
        writeSInt16(dataOutputStream, horizontalHeader.getCaretSlopeRun());
        writeSInt16(dataOutputStream, horizontalHeader.getReserved1());
        writeSInt16(dataOutputStream, horizontalHeader.getReserved2());
        writeSInt16(dataOutputStream, horizontalHeader.getReserved3());
        writeSInt16(dataOutputStream, horizontalHeader.getReserved4());
        writeSInt16(dataOutputStream, horizontalHeader.getReserved5());
        writeSInt16(dataOutputStream, horizontalHeader.getMetricDataFormat());
        int size = this.glyphIds.subSet(0, Integer.valueOf(horizontalHeader.getNumberOfHMetrics())).size();
        if (this.glyphIds.last().intValue() >= horizontalHeader.getNumberOfHMetrics() && !this.glyphIds.contains(Integer.valueOf(horizontalHeader.getNumberOfHMetrics() - 1))) {
            size++;
        }
        writeUint16(dataOutputStream, size);
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    private byte[] buildHmtxTable() {
        long copyBytes;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        HorizontalHeaderTable horizontalHeader = this.ttf.getHorizontalHeader();
        HorizontalMetricsTable horizontalMetrics = this.ttf.getHorizontalMetrics();
        InputStream originalData = this.ttf.getOriginalData();
        boolean z10 = true;
        int numberOfHMetrics = horizontalHeader.getNumberOfHMetrics() - 1;
        z10 = (this.glyphIds.last().intValue() <= numberOfHMetrics || this.glyphIds.contains(Integer.valueOf(numberOfHMetrics))) ? false : false;
        try {
            originalData.skip(horizontalMetrics.getOffset());
            long j10 = 0;
            boolean z11 = z10;
            for (Integer num : this.glyphIds) {
                if (num.intValue() <= numberOfHMetrics) {
                    copyBytes = copyBytes(originalData, byteArrayOutputStream, num.intValue() * 4, j10, 4);
                } else {
                    if (z11) {
                        j10 = copyBytes(originalData, byteArrayOutputStream, numberOfHMetrics * 4, j10, 2);
                        z11 = false;
                    }
                    copyBytes = copyBytes(originalData, byteArrayOutputStream, ((num.intValue() - horizontalHeader.getNumberOfHMetrics()) * 2) + (horizontalHeader.getNumberOfHMetrics() * 4), j10, 2);
                }
                j10 = copyBytes;
            }
            return byteArrayOutputStream.toByteArray();
        } finally {
            originalData.close();
        }
    }

    private byte[] buildLocaTable(long[] jArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        for (long j10 : jArr) {
            writeUint32(dataOutputStream, j10);
        }
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    private byte[] buildMaxpTable() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        MaximumProfileTable maximumProfile = this.ttf.getMaximumProfile();
        writeFixed(dataOutputStream, 1.0d);
        writeUint16(dataOutputStream, this.glyphIds.size());
        writeUint16(dataOutputStream, maximumProfile.getMaxPoints());
        writeUint16(dataOutputStream, maximumProfile.getMaxContours());
        writeUint16(dataOutputStream, maximumProfile.getMaxCompositePoints());
        writeUint16(dataOutputStream, maximumProfile.getMaxCompositeContours());
        writeUint16(dataOutputStream, maximumProfile.getMaxZones());
        writeUint16(dataOutputStream, maximumProfile.getMaxTwilightPoints());
        writeUint16(dataOutputStream, maximumProfile.getMaxStorage());
        writeUint16(dataOutputStream, maximumProfile.getMaxFunctionDefs());
        writeUint16(dataOutputStream, maximumProfile.getMaxInstructionDefs());
        writeUint16(dataOutputStream, maximumProfile.getMaxStackElements());
        writeUint16(dataOutputStream, maximumProfile.getMaxSizeOfInstructions());
        writeUint16(dataOutputStream, maximumProfile.getMaxComponentElements());
        writeUint16(dataOutputStream, maximumProfile.getMaxComponentDepth());
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    private byte[] buildNameTable() {
        List<String> list;
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        NamingTable naming = this.ttf.getNaming();
        if (naming == null || ((list = this.keepTables) != null && !list.contains(NamingTable.TAG))) {
            return null;
        }
        List<NameRecord> nameRecords = naming.getNameRecords();
        int i10 = 0;
        for (NameRecord nameRecord : nameRecords) {
            if (shouldCopyNameRecord(nameRecord)) {
                i10++;
            }
        }
        writeUint16(dataOutputStream, 0);
        writeUint16(dataOutputStream, i10);
        writeUint16(dataOutputStream, (i10 * 12) + 6);
        if (i10 == 0) {
            return null;
        }
        byte[][] bArr = new byte[i10];
        int i11 = 0;
        for (NameRecord nameRecord2 : nameRecords) {
            if (shouldCopyNameRecord(nameRecord2)) {
                int platformId = nameRecord2.getPlatformId();
                int platformEncodingId = nameRecord2.getPlatformEncodingId();
                if (platformId == 3 && platformEncodingId == 1) {
                    str = CharEncoding.UTF_16BE;
                } else {
                    if (platformId == 2) {
                        if (platformEncodingId == 0) {
                            str = CharEncoding.US_ASCII;
                        } else if (platformEncodingId == 1) {
                            str = "UTF16-BE";
                        }
                    }
                    str = CharEncoding.ISO_8859_1;
                }
                String string = nameRecord2.getString();
                if (nameRecord2.getNameId() == 6 && this.prefix != null) {
                    string = r.g(new StringBuilder(), this.prefix, string);
                }
                bArr[i11] = string.getBytes(str);
                i11++;
            }
        }
        int i12 = 0;
        int i13 = 0;
        for (NameRecord nameRecord3 : nameRecords) {
            if (shouldCopyNameRecord(nameRecord3)) {
                writeUint16(dataOutputStream, nameRecord3.getPlatformId());
                writeUint16(dataOutputStream, nameRecord3.getPlatformEncodingId());
                writeUint16(dataOutputStream, nameRecord3.getLanguageId());
                writeUint16(dataOutputStream, nameRecord3.getNameId());
                writeUint16(dataOutputStream, bArr[i12].length);
                writeUint16(dataOutputStream, i13);
                i13 += bArr[i12].length;
                i12++;
            }
        }
        for (int i14 = 0; i14 < i10; i14++) {
            dataOutputStream.write(bArr[i14]);
        }
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    private byte[] buildOS2Table() {
        OS2WindowsMetricsTable oS2Windows = this.ttf.getOS2Windows();
        if (oS2Windows != null && !this.uniToGID.isEmpty()) {
            List<String> list = this.keepTables;
            if (list == null || list.contains(OS2WindowsMetricsTable.TAG)) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                writeUint16(dataOutputStream, oS2Windows.getVersion());
                writeSInt16(dataOutputStream, oS2Windows.getAverageCharWidth());
                writeUint16(dataOutputStream, oS2Windows.getWeightClass());
                writeUint16(dataOutputStream, oS2Windows.getWidthClass());
                writeSInt16(dataOutputStream, oS2Windows.getFsType());
                writeSInt16(dataOutputStream, oS2Windows.getSubscriptXSize());
                writeSInt16(dataOutputStream, oS2Windows.getSubscriptYSize());
                writeSInt16(dataOutputStream, oS2Windows.getSubscriptXOffset());
                writeSInt16(dataOutputStream, oS2Windows.getSubscriptYOffset());
                writeSInt16(dataOutputStream, oS2Windows.getSuperscriptXSize());
                writeSInt16(dataOutputStream, oS2Windows.getSuperscriptYSize());
                writeSInt16(dataOutputStream, oS2Windows.getSuperscriptXOffset());
                writeSInt16(dataOutputStream, oS2Windows.getSuperscriptYOffset());
                writeSInt16(dataOutputStream, oS2Windows.getStrikeoutSize());
                writeSInt16(dataOutputStream, oS2Windows.getStrikeoutPosition());
                writeSInt16(dataOutputStream, (short) oS2Windows.getFamilyClass());
                dataOutputStream.write(oS2Windows.getPanose());
                writeUint32(dataOutputStream, 0L);
                writeUint32(dataOutputStream, 0L);
                writeUint32(dataOutputStream, 0L);
                writeUint32(dataOutputStream, 0L);
                dataOutputStream.write(oS2Windows.getAchVendId().getBytes(CharEncoding.US_ASCII));
                writeUint16(dataOutputStream, oS2Windows.getFsSelection());
                writeUint16(dataOutputStream, this.uniToGID.firstKey().intValue());
                writeUint16(dataOutputStream, this.uniToGID.lastKey().intValue());
                writeUint16(dataOutputStream, oS2Windows.getTypoAscender());
                writeUint16(dataOutputStream, oS2Windows.getTypoDescender());
                writeUint16(dataOutputStream, oS2Windows.getTypoLineGap());
                writeUint16(dataOutputStream, oS2Windows.getWinAscent());
                writeUint16(dataOutputStream, oS2Windows.getWinDescent());
                dataOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
            return null;
        }
        return null;
    }

    private byte[] buildPostTable() {
        PostScriptTable postScript = this.ttf.getPostScript();
        if (postScript != null) {
            List<String> list = this.keepTables;
            if (list == null || list.contains(PostScriptTable.TAG)) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                writeFixed(dataOutputStream, 2.0d);
                writeFixed(dataOutputStream, postScript.getItalicAngle());
                writeSInt16(dataOutputStream, postScript.getUnderlinePosition());
                writeSInt16(dataOutputStream, postScript.getUnderlineThickness());
                writeUint32(dataOutputStream, postScript.getIsFixedPitch());
                writeUint32(dataOutputStream, postScript.getMinMemType42());
                writeUint32(dataOutputStream, postScript.getMaxMemType42());
                writeUint32(dataOutputStream, postScript.getMinMemType1());
                writeUint32(dataOutputStream, postScript.getMaxMemType1());
                writeUint16(dataOutputStream, this.glyphIds.size());
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Integer num : this.glyphIds) {
                    String name = postScript.getName(num.intValue());
                    Integer num2 = WGL4Names.MAC_GLYPH_NAMES_INDICES.get(name);
                    if (num2 != null) {
                        writeUint16(dataOutputStream, num2.intValue());
                    } else {
                        Integer num3 = (Integer) linkedHashMap.get(name);
                        if (num3 == null) {
                            num3 = Integer.valueOf(linkedHashMap.size());
                            linkedHashMap.put(name, num3);
                        }
                        writeUint16(dataOutputStream, num3.intValue() + WGL4Names.NUMBER_OF_MAC_GLYPHS);
                    }
                }
                for (String str : linkedHashMap.keySet()) {
                    byte[] bytes = str.getBytes(Charset.forName(CharEncoding.US_ASCII));
                    writeUint8(dataOutputStream, bytes.length);
                    dataOutputStream.write(bytes);
                }
                dataOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
            return null;
        }
        return null;
    }

    private long copyBytes(InputStream inputStream, OutputStream outputStream, long j10, long j11, int i10) {
        long j12 = j10 - j11;
        if (j12 == inputStream.skip(j12)) {
            byte[] bArr = new byte[i10];
            if (i10 == inputStream.read(bArr, 0, i10)) {
                outputStream.write(bArr, 0, i10);
                return j10 + i10;
            }
            throw new EOFException("Unexpected EOF exception parsing glyphId of hmtx table.");
        }
        throw new EOFException("Unexpected EOF exception parsing glyphId of hmtx table.");
    }

    private int getNewGlyphId(Integer num) {
        return this.glyphIds.headSet(num).size();
    }

    private int log2(int i10) {
        return (int) Math.round(Math.log(i10) / Math.log(2.0d));
    }

    private boolean shouldCopyNameRecord(NameRecord nameRecord) {
        if (nameRecord.getPlatformId() == 3 && nameRecord.getPlatformEncodingId() == 1 && nameRecord.getLanguageId() == 1033 && nameRecord.getNameId() >= 0 && nameRecord.getNameId() < 7) {
            return true;
        }
        return false;
    }

    private long toUInt32(int i10, int i11) {
        return (i11 & 65535) | ((i10 & 65535) << 16);
    }

    private long writeFileHeader(DataOutputStream dataOutputStream, int i10) {
        dataOutputStream.writeInt(65536);
        dataOutputStream.writeShort(i10);
        int highestOneBit = Integer.highestOneBit(i10);
        int i11 = highestOneBit * 16;
        dataOutputStream.writeShort(i11);
        int log2 = log2(highestOneBit);
        dataOutputStream.writeShort(log2);
        int i12 = (i10 * 16) - i11;
        dataOutputStream.writeShort(i12);
        return toUInt32(i10, i11) + 65536 + toUInt32(log2, i12);
    }

    private void writeFixed(DataOutputStream dataOutputStream, double d10) {
        double floor = Math.floor(d10);
        dataOutputStream.writeShort((int) floor);
        dataOutputStream.writeShort((int) ((d10 - floor) * 65536.0d));
    }

    private void writeLongDateTime(DataOutputStream dataOutputStream, Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar2.set(1904, 0, 1, 0, 0, 0);
        calendar2.set(14, 0);
        dataOutputStream.writeLong((calendar.getTimeInMillis() - calendar2.getTimeInMillis()) / 1000);
    }

    private void writeSInt16(DataOutputStream dataOutputStream, short s4) {
        dataOutputStream.writeShort(s4);
    }

    private void writeTableBody(OutputStream outputStream, byte[] bArr) {
        int length = bArr.length;
        outputStream.write(bArr);
        int i10 = length % 4;
        if (i10 != 0) {
            outputStream.write(PAD_BUF, 0, 4 - i10);
        }
    }

    private long writeTableHeader(DataOutputStream dataOutputStream, String str, long j10, byte[] bArr) {
        long j11 = 0;
        for (int i10 = 0; i10 < bArr.length; i10++) {
            j11 += (bArr[i10] & 255) << (24 - ((i10 % 4) * 8));
        }
        long j12 = j11 & 4294967295L;
        byte[] bytes = str.getBytes(CharEncoding.US_ASCII);
        dataOutputStream.write(bytes, 0, 4);
        dataOutputStream.writeInt((int) j12);
        dataOutputStream.writeInt((int) j10);
        dataOutputStream.writeInt(bArr.length);
        return toUInt32(bytes) + j12 + j12 + j10 + bArr.length;
    }

    private void writeUint16(DataOutputStream dataOutputStream, int i10) {
        dataOutputStream.writeShort(i10);
    }

    private void writeUint32(DataOutputStream dataOutputStream, long j10) {
        dataOutputStream.writeInt((int) j10);
    }

    private void writeUint8(DataOutputStream dataOutputStream, int i10) {
        dataOutputStream.writeByte(i10);
    }

    public void add(int i10) {
        int glyphId = this.unicodeCmap.getGlyphId(i10);
        if (glyphId != 0) {
            this.uniToGID.put(Integer.valueOf(i10), Integer.valueOf(glyphId));
            this.glyphIds.add(Integer.valueOf(glyphId));
        }
    }

    public void addAll(Set<Integer> set) {
        for (Integer num : set) {
            add(num.intValue());
        }
    }

    public Map<Integer, Integer> getGIDMap() {
        addCompoundReferences();
        HashMap hashMap = new HashMap();
        int i10 = 0;
        for (Integer num : this.glyphIds) {
            hashMap.put(Integer.valueOf(i10), Integer.valueOf(num.intValue()));
            i10++;
        }
        return hashMap;
    }

    public void setPrefix(String str) {
        this.prefix = str;
    }

    public void writeToStream(OutputStream outputStream) {
        List<String> list;
        if (!this.glyphIds.isEmpty()) {
            this.uniToGID.isEmpty();
        }
        addCompoundReferences();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        try {
            long[] jArr = new long[this.glyphIds.size() + 1];
            byte[] buildHeadTable = buildHeadTable();
            byte[] buildHheaTable = buildHheaTable();
            byte[] buildMaxpTable = buildMaxpTable();
            byte[] buildNameTable = buildNameTable();
            byte[] buildOS2Table = buildOS2Table();
            byte[] buildGlyfTable = buildGlyfTable(jArr);
            byte[] buildLocaTable = buildLocaTable(jArr);
            byte[] buildCmapTable = buildCmapTable();
            byte[] buildHmtxTable = buildHmtxTable();
            byte[] buildPostTable = buildPostTable();
            TreeMap treeMap = new TreeMap();
            if (buildOS2Table != null) {
                treeMap.put(OS2WindowsMetricsTable.TAG, buildOS2Table);
            }
            if (buildCmapTable != null) {
                treeMap.put(CmapTable.TAG, buildCmapTable);
            }
            treeMap.put(GlyphTable.TAG, buildGlyfTable);
            treeMap.put(HeaderTable.TAG, buildHeadTable);
            treeMap.put(HorizontalHeaderTable.TAG, buildHheaTable);
            treeMap.put(HorizontalMetricsTable.TAG, buildHmtxTable);
            treeMap.put(IndexToLocationTable.TAG, buildLocaTable);
            treeMap.put(MaximumProfileTable.TAG, buildMaxpTable);
            if (buildNameTable != null) {
                treeMap.put(NamingTable.TAG, buildNameTable);
            }
            if (buildPostTable != null) {
                treeMap.put(PostScriptTable.TAG, buildPostTable);
            }
            for (Map.Entry<String, TTFTable> entry : this.ttf.getTableMap().entrySet()) {
                String key = entry.getKey();
                TTFTable value = entry.getValue();
                if (!treeMap.containsKey(key) && ((list = this.keepTables) == null || list.contains(key))) {
                    treeMap.put(key, this.ttf.getTableBytes(value));
                }
            }
            long writeFileHeader = writeFileHeader(dataOutputStream, treeMap.size());
            long j10 = writeFileHeader;
            long size = (treeMap.size() * 16) + 12;
            for (Map.Entry entry2 : treeMap.entrySet()) {
                j10 += writeTableHeader(dataOutputStream, (String) entry2.getKey(), size, (byte[]) entry2.getValue());
                size += ((((byte[]) entry2.getValue()).length + 3) / 4) * 4;
            }
            long j11 = 2981146554L - (4294967295L & j10);
            buildHeadTable[8] = (byte) (j11 >>> 24);
            buildHeadTable[9] = (byte) (j11 >>> 16);
            buildHeadTable[10] = (byte) (j11 >>> 8);
            buildHeadTable[11] = (byte) j11;
            for (byte[] bArr : treeMap.values()) {
                writeTableBody(dataOutputStream, bArr);
            }
        } finally {
            dataOutputStream.close();
        }
    }

    public TTFSubsetter(TrueTypeFont trueTypeFont, List<String> list) {
        this.ttf = trueTypeFont;
        this.keepTables = list;
        this.uniToGID = new TreeMap();
        TreeSet treeSet = new TreeSet();
        this.glyphIds = treeSet;
        this.unicodeCmap = trueTypeFont.getUnicodeCmapLookup();
        treeSet.add(0);
    }

    private long toUInt32(byte[] bArr) {
        return ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (255 & bArr[3]);
    }
}
