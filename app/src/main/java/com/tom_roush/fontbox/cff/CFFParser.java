package com.tom_roush.fontbox.cff;

import a0.d;
import a6.h;
import androidx.activity.r;
import b.a;
import com.tom_roush.fontbox.afm.AFMParser;
import com.tom_roush.fontbox.cff.CFFOperator;
import com.tom_roush.fontbox.ttf.CFFTable;
import com.tom_roush.fontbox.util.Charsets;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: classes2.dex */
public class CFFParser {
    private static final String TAG_OTTO = "OTTO";
    private static final String TAG_TTCF = "ttcf";
    private static final String TAG_TTFONLY = "\u0000\u0001\u0000\u0000";
    private String debugFontName;
    private ByteSource source;
    private String[] stringIndex = null;

    /* loaded from: classes2.dex */
    public interface ByteSource {
        byte[] getBytes();
    }

    /* loaded from: classes2.dex */
    public static abstract class CFFBuiltInEncoding extends CFFEncoding {
        private int nSups;
        private Supplement[] supplement;

        /* loaded from: classes2.dex */
        public static class Supplement {
            private int code;
            private String name;
            private int sid;

            public int getCode() {
                return this.code;
            }

            public String getName() {
                return this.name;
            }

            public int getSID() {
                return this.sid;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(getClass().getName());
                sb2.append("[code=");
                sb2.append(this.code);
                sb2.append(", sid=");
                return h.g(sb2, this.sid, "]");
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class DictData {
        private final Map<String, Entry> entries;

        /* loaded from: classes2.dex */
        public static class Entry {
            private List<Number> operands;
            private CFFOperator operator;

            public /* synthetic */ Entry(int i10) {
                this();
            }

            public List<Number> getArray() {
                return this.operands;
            }

            public Boolean getBoolean(int i10) {
                Number number = this.operands.get(i10);
                if (number instanceof Integer) {
                    int intValue = number.intValue();
                    if (intValue != 0) {
                        if (intValue == 1) {
                            return Boolean.TRUE;
                        }
                    } else {
                        return Boolean.FALSE;
                    }
                }
                throw new IllegalArgumentException();
            }

            public List<Number> getDelta() {
                ArrayList arrayList = new ArrayList(this.operands);
                for (int i10 = 1; i10 < arrayList.size(); i10++) {
                    arrayList.set(i10, Integer.valueOf(((Number) arrayList.get(i10)).intValue() + ((Number) arrayList.get(i10 - 1)).intValue()));
                }
                return arrayList;
            }

            public Number getNumber(int i10) {
                return this.operands.get(i10);
            }

            public String toString() {
                return getClass().getName() + "[operands=" + this.operands + ", operator=" + this.operator + "]";
            }

            private Entry() {
                this.operands = new ArrayList();
                this.operator = null;
            }
        }

        public /* synthetic */ DictData(int i10) {
            this();
        }

        public void add(Entry entry) {
            if (entry.operator != null) {
                this.entries.put(entry.operator.getName(), entry);
            }
        }

        public List<Number> getArray(String str, List<Number> list) {
            Entry entry = getEntry(str);
            if (entry != null && !entry.getArray().isEmpty()) {
                return entry.getArray();
            }
            return list;
        }

        public Boolean getBoolean(String str, boolean z10) {
            Entry entry = getEntry(str);
            if (entry != null && !entry.getArray().isEmpty()) {
                z10 = entry.getBoolean(0).booleanValue();
            }
            return Boolean.valueOf(z10);
        }

        public List<Number> getDelta(String str, List<Number> list) {
            Entry entry = getEntry(str);
            if (entry != null && !entry.getArray().isEmpty()) {
                return entry.getDelta();
            }
            return list;
        }

        public Entry getEntry(String str) {
            return this.entries.get(str);
        }

        public Number getNumber(String str, Number number) {
            Entry entry = getEntry(str);
            if (entry != null && !entry.getArray().isEmpty()) {
                return entry.getNumber(0);
            }
            return number;
        }

        public String toString() {
            return getClass().getName() + "[entries=" + this.entries + "]";
        }

        private DictData() {
            this.entries = new HashMap();
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class EmbeddedCharset extends CFFCharset {
        public EmbeddedCharset(boolean z10) {
            super(z10);
        }
    }

    /* loaded from: classes2.dex */
    public static class EmptyCharset extends EmbeddedCharset {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmptyCharset(int i10) {
            super(true);
            addCID(0, 0);
            for (int i11 = 1; i11 <= i10; i11++) {
                addCID(i11, i11);
            }
        }

        public String toString() {
            return getClass().getName();
        }
    }

    /* loaded from: classes2.dex */
    public static class Format0Charset extends EmbeddedCharset {
        private int format;

        public Format0Charset(boolean z10) {
            super(z10);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass().getName());
            sb2.append("[format=");
            return h.g(sb2, this.format, "]");
        }
    }

    /* loaded from: classes2.dex */
    public static class Format0Encoding extends CFFBuiltInEncoding {
        private int format;
        private int nCodes;

        public /* synthetic */ Format0Encoding(int i10) {
            this();
        }

        public String toString() {
            return getClass().getName() + "[format=" + this.format + ", nCodes=" + this.nCodes + ", supplement=" + Arrays.toString(((CFFBuiltInEncoding) this).supplement) + "]";
        }

        private Format0Encoding() {
        }
    }

    /* loaded from: classes2.dex */
    public static class Format0FDSelect extends FDSelect {
        private int[] fds;
        private int format;

        public /* synthetic */ Format0FDSelect(CFFCIDFont cFFCIDFont, int i10) {
            this(cFFCIDFont);
        }

        @Override // com.tom_roush.fontbox.cff.FDSelect
        public int getFDIndex(int i10) {
            int[] iArr = this.fds;
            if (i10 < iArr.length) {
                return iArr[i10];
            }
            return 0;
        }

        public String toString() {
            return getClass().getName() + "[fds=" + Arrays.toString(this.fds) + "]";
        }

        private Format0FDSelect(CFFCIDFont cFFCIDFont) {
            super(cFFCIDFont);
        }
    }

    /* loaded from: classes2.dex */
    public static class Format1Charset extends EmbeddedCharset {
        private int format;
        private List<RangeMapping> rangesCID2GID;

        public Format1Charset(boolean z10) {
            super(z10);
        }

        @Override // com.tom_roush.fontbox.cff.CFFCharset
        public int getCIDForGID(int i10) {
            if (isCIDFont()) {
                for (RangeMapping rangeMapping : this.rangesCID2GID) {
                    if (rangeMapping.isInRange(i10)) {
                        return rangeMapping.mapValue(i10);
                    }
                }
            }
            return super.getCIDForGID(i10);
        }

        @Override // com.tom_roush.fontbox.cff.CFFCharset
        public int getGIDForCID(int i10) {
            if (isCIDFont()) {
                for (RangeMapping rangeMapping : this.rangesCID2GID) {
                    if (rangeMapping.isInReverseRange(i10)) {
                        return rangeMapping.mapReverseValue(i10);
                    }
                }
            }
            return super.getGIDForCID(i10);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass().getName());
            sb2.append("[format=");
            return h.g(sb2, this.format, "]");
        }
    }

    /* loaded from: classes2.dex */
    public static class Format1Encoding extends CFFBuiltInEncoding {
        private int format;
        private int nRanges;

        public /* synthetic */ Format1Encoding(int i10) {
            this();
        }

        public String toString() {
            return getClass().getName() + "[format=" + this.format + ", nRanges=" + this.nRanges + ", supplement=" + Arrays.toString(((CFFBuiltInEncoding) this).supplement) + "]";
        }

        private Format1Encoding() {
        }
    }

    /* loaded from: classes2.dex */
    public static class Format2Charset extends EmbeddedCharset {
        private int format;
        private List<RangeMapping> rangesCID2GID;

        public Format2Charset(boolean z10) {
            super(z10);
        }

        @Override // com.tom_roush.fontbox.cff.CFFCharset
        public int getCIDForGID(int i10) {
            for (RangeMapping rangeMapping : this.rangesCID2GID) {
                if (rangeMapping.isInRange(i10)) {
                    return rangeMapping.mapValue(i10);
                }
            }
            return super.getCIDForGID(i10);
        }

        @Override // com.tom_roush.fontbox.cff.CFFCharset
        public int getGIDForCID(int i10) {
            for (RangeMapping rangeMapping : this.rangesCID2GID) {
                if (rangeMapping.isInReverseRange(i10)) {
                    return rangeMapping.mapReverseValue(i10);
                }
            }
            return super.getGIDForCID(i10);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass().getName());
            sb2.append("[format=");
            return h.g(sb2, this.format, "]");
        }
    }

    /* loaded from: classes2.dex */
    public static final class Format3FDSelect extends FDSelect {
        private int format;
        private int nbRanges;
        private Range3[] range3;
        private int sentinel;

        public /* synthetic */ Format3FDSelect(CFFCIDFont cFFCIDFont, int i10) {
            this(cFFCIDFont);
        }

        @Override // com.tom_roush.fontbox.cff.FDSelect
        public int getFDIndex(int i10) {
            for (int i11 = 0; i11 < this.nbRanges; i11++) {
                if (this.range3[i11].first <= i10) {
                    int i12 = i11 + 1;
                    if (i12 < this.nbRanges) {
                        if (this.range3[i12].first > i10) {
                            return this.range3[i11].f15980fd;
                        }
                    } else if (this.sentinel > i10) {
                        return this.range3[i11].f15980fd;
                    } else {
                        return -1;
                    }
                }
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Format3FDSelect.class.getName());
            sb2.append("[format=");
            sb2.append(this.format);
            sb2.append(" nbRanges=");
            sb2.append(this.nbRanges);
            sb2.append(", range3=");
            sb2.append(Arrays.toString(this.range3));
            sb2.append(" sentinel=");
            return h.g(sb2, this.sentinel, "]");
        }

        private Format3FDSelect(CFFCIDFont cFFCIDFont) {
            super(cFFCIDFont);
        }
    }

    /* loaded from: classes2.dex */
    public static class Header {
        private int hdrSize;
        private int major;
        private int minor;
        private int offSize;

        private Header() {
        }

        public /* synthetic */ Header(int i10) {
            this();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass().getName());
            sb2.append("[major=");
            sb2.append(this.major);
            sb2.append(", minor=");
            sb2.append(this.minor);
            sb2.append(", hdrSize=");
            sb2.append(this.hdrSize);
            sb2.append(", offSize=");
            return h.g(sb2, this.offSize, "]");
        }
    }

    /* loaded from: classes2.dex */
    public static final class Range3 {

        /* renamed from: fd  reason: collision with root package name */
        private int f15980fd;
        private int first;

        private Range3() {
        }

        public /* synthetic */ Range3(int i10) {
            this();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Range3.class.getName());
            sb2.append("[first=");
            sb2.append(this.first);
            sb2.append(", fd=");
            return h.g(sb2, this.f15980fd, "]");
        }
    }

    /* loaded from: classes2.dex */
    public static final class RangeMapping {
        private final int endMappedValue;
        private final int endValue;
        private final int startMappedValue;
        private final int startValue;

        public /* synthetic */ RangeMapping(int i10, int i11, int i12, int i13) {
            this(i10, i11, i12);
        }

        public boolean isInRange(int i10) {
            if (i10 >= this.startValue && i10 <= this.endValue) {
                return true;
            }
            return false;
        }

        public boolean isInReverseRange(int i10) {
            if (i10 >= this.startMappedValue && i10 <= this.endMappedValue) {
                return true;
            }
            return false;
        }

        public int mapReverseValue(int i10) {
            if (isInReverseRange(i10)) {
                return (i10 - this.startMappedValue) + this.startValue;
            }
            return 0;
        }

        public int mapValue(int i10) {
            if (isInRange(i10)) {
                return (i10 - this.startValue) + this.startMappedValue;
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(RangeMapping.class.getName());
            sb2.append("[start value=");
            sb2.append(this.startValue);
            sb2.append(", end value=");
            sb2.append(this.endValue);
            sb2.append(", start mapped-value=");
            sb2.append(this.startMappedValue);
            sb2.append(", end mapped-value=");
            return h.g(sb2, this.endMappedValue, "]");
        }

        private RangeMapping(int i10, int i11, int i12) {
            this.startValue = i10;
            this.endValue = i10 + i12;
            this.startMappedValue = i11;
            this.endMappedValue = i11 + i12;
        }
    }

    private void concatenateMatrix(List<Number> list, List<Number> list2) {
        double doubleValue = list.get(0).doubleValue();
        double doubleValue2 = list.get(1).doubleValue();
        double doubleValue3 = list.get(2).doubleValue();
        double doubleValue4 = list.get(3).doubleValue();
        double doubleValue5 = list.get(4).doubleValue();
        double doubleValue6 = list.get(5).doubleValue();
        double doubleValue7 = list2.get(0).doubleValue();
        double doubleValue8 = list2.get(1).doubleValue();
        double doubleValue9 = list2.get(2).doubleValue();
        double doubleValue10 = list2.get(3).doubleValue();
        double doubleValue11 = list2.get(4).doubleValue();
        double doubleValue12 = list2.get(5).doubleValue();
        list.set(0, Double.valueOf((doubleValue2 * doubleValue9) + (doubleValue * doubleValue7)));
        list.set(1, Double.valueOf((doubleValue2 * doubleValue4) + (doubleValue * doubleValue8)));
        list.set(2, Double.valueOf((doubleValue4 * doubleValue9) + (doubleValue3 * doubleValue7)));
        list.set(3, Double.valueOf((doubleValue4 * doubleValue10) + (doubleValue3 * doubleValue8)));
        list.set(4, Double.valueOf((doubleValue9 * doubleValue6) + (doubleValue7 * doubleValue5) + doubleValue11));
        list.set(5, Double.valueOf((doubleValue6 * doubleValue10) + (doubleValue5 * doubleValue8) + doubleValue12));
    }

    private CFFDataInput createTaggedCFFDataInput(CFFDataInput cFFDataInput, byte[] bArr) {
        short readShort = cFFDataInput.readShort();
        cFFDataInput.readShort();
        cFFDataInput.readShort();
        cFFDataInput.readShort();
        for (int i10 = 0; i10 < readShort; i10++) {
            String readTagName = readTagName(cFFDataInput);
            readLong(cFFDataInput);
            long readLong = readLong(cFFDataInput);
            long readLong2 = readLong(cFFDataInput);
            if (CFFTable.TAG.equals(readTagName)) {
                return new CFFDataInput(Arrays.copyOfRange(bArr, (int) readLong, (int) (readLong + readLong2)));
            }
        }
        throw new IOException("CFF tag not found in this OpenType font.");
    }

    private String getString(DictData dictData, String str) {
        DictData.Entry entry = dictData.getEntry(str);
        if (entry != null) {
            return readString(entry.getNumber(0).intValue());
        }
        return null;
    }

    private void parseCIDFontDicts(CFFDataInput cFFDataInput, DictData dictData, CFFCIDFont cFFCIDFont, int i10) {
        DictData.Entry entry = dictData.getEntry("FDArray");
        if (entry != null) {
            cFFDataInput.setPosition(entry.getNumber(0).intValue());
            byte[][] readIndexData = readIndexData(cFFDataInput);
            if (readIndexData != null) {
                LinkedList linkedList = new LinkedList();
                LinkedList linkedList2 = new LinkedList();
                for (byte[] bArr : readIndexData) {
                    DictData readDictData = readDictData(new CFFDataInput(bArr));
                    DictData.Entry entry2 = readDictData.getEntry(StandardStructureTypes.PRIVATE);
                    if (entry2 != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
                        linkedHashMap.put(AFMParser.FONT_NAME, getString(readDictData, AFMParser.FONT_NAME));
                        linkedHashMap.put("FontType", readDictData.getNumber("FontType", 0));
                        linkedHashMap.put(AFMParser.FONT_BBOX, readDictData.getArray(AFMParser.FONT_BBOX, null));
                        linkedHashMap.put("FontMatrix", readDictData.getArray("FontMatrix", null));
                        linkedList2.add(linkedHashMap);
                        int intValue = entry2.getNumber(1).intValue();
                        cFFDataInput.setPosition(intValue);
                        DictData readDictData2 = readDictData(cFFDataInput, entry2.getNumber(0).intValue());
                        Map<String, Object> readPrivateDict = readPrivateDict(readDictData2);
                        linkedList.add(readPrivateDict);
                        int intValue2 = ((Integer) readDictData2.getNumber("Subrs", 0)).intValue();
                        if (intValue2 > 0) {
                            cFFDataInput.setPosition(intValue + intValue2);
                            readPrivateDict.put("Subrs", readIndexData(cFFDataInput));
                        }
                    } else {
                        throw new IOException("Font DICT invalid without \"Private\" entry");
                    }
                }
                cFFDataInput.setPosition(dictData.getEntry("FDSelect").getNumber(0).intValue());
                FDSelect readFDSelect = readFDSelect(cFFDataInput, i10, cFFCIDFont);
                cFFCIDFont.setFontDict(linkedList2);
                cFFCIDFont.setPrivDict(linkedList);
                cFFCIDFont.setFdSelect(readFDSelect);
                return;
            }
            throw new IOException("Font dict index is missing for a CIDKeyed Font");
        }
        throw new IOException("FDArray is missing for a CIDKeyed Font.");
    }

    private CFFFont parseFont(CFFDataInput cFFDataInput, String str, byte[] bArr) {
        boolean z10;
        CFFCIDFont cFFCIDFont;
        CFFCharset cFFISOAdobeCharset;
        List<Number> list;
        DictData readDictData = readDictData(new CFFDataInput(bArr));
        if (readDictData.getEntry("SyntheticBase") == null) {
            if (readDictData.getEntry("ROS") != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                CFFCIDFont cFFCIDFont2 = new CFFCIDFont();
                DictData.Entry entry = readDictData.getEntry("ROS");
                cFFCIDFont2.setRegistry(readString(entry.getNumber(0).intValue()));
                cFFCIDFont2.setOrdering(readString(entry.getNumber(1).intValue()));
                cFFCIDFont2.setSupplement(entry.getNumber(2).intValue());
                cFFCIDFont = cFFCIDFont2;
            } else {
                cFFCIDFont = new CFFType1Font();
            }
            this.debugFontName = str;
            cFFCIDFont.setName(str);
            cFFCIDFont.addValueToTopDict("version", getString(readDictData, "version"));
            cFFCIDFont.addValueToTopDict(AFMParser.NOTICE, getString(readDictData, AFMParser.NOTICE));
            cFFCIDFont.addValueToTopDict("Copyright", getString(readDictData, "Copyright"));
            cFFCIDFont.addValueToTopDict(AFMParser.FULL_NAME, getString(readDictData, AFMParser.FULL_NAME));
            cFFCIDFont.addValueToTopDict(AFMParser.FAMILY_NAME, getString(readDictData, AFMParser.FAMILY_NAME));
            cFFCIDFont.addValueToTopDict(AFMParser.WEIGHT, getString(readDictData, AFMParser.WEIGHT));
            cFFCIDFont.addValueToTopDict("isFixedPitch", readDictData.getBoolean("isFixedPitch", false));
            cFFCIDFont.addValueToTopDict(AFMParser.ITALIC_ANGLE, readDictData.getNumber(AFMParser.ITALIC_ANGLE, 0));
            cFFCIDFont.addValueToTopDict(AFMParser.UNDERLINE_POSITION, readDictData.getNumber(AFMParser.UNDERLINE_POSITION, -100));
            cFFCIDFont.addValueToTopDict(AFMParser.UNDERLINE_THICKNESS, readDictData.getNumber(AFMParser.UNDERLINE_THICKNESS, 50));
            cFFCIDFont.addValueToTopDict("PaintType", readDictData.getNumber("PaintType", 0));
            cFFCIDFont.addValueToTopDict("CharstringType", readDictData.getNumber("CharstringType", 2));
            cFFCIDFont.addValueToTopDict("FontMatrix", readDictData.getArray("FontMatrix", Arrays.asList(Double.valueOf(0.001d), Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.001d), Double.valueOf(0.0d), Double.valueOf(0.0d))));
            cFFCIDFont.addValueToTopDict("UniqueID", readDictData.getNumber("UniqueID", null));
            cFFCIDFont.addValueToTopDict(AFMParser.FONT_BBOX, readDictData.getArray(AFMParser.FONT_BBOX, Arrays.asList(0, 0, 0, 0)));
            cFFCIDFont.addValueToTopDict("StrokeWidth", readDictData.getNumber("StrokeWidth", 0));
            cFFCIDFont.addValueToTopDict("XUID", readDictData.getArray("XUID", null));
            cFFDataInput.setPosition(readDictData.getEntry("CharStrings").getNumber(0).intValue());
            byte[][] readIndexData = readIndexData(cFFDataInput);
            DictData.Entry entry2 = readDictData.getEntry("charset");
            if (entry2 != null) {
                int intValue = entry2.getNumber(0).intValue();
                if (!z10 && intValue == 0) {
                    cFFISOAdobeCharset = CFFISOAdobeCharset.getInstance();
                } else if (!z10 && intValue == 1) {
                    cFFISOAdobeCharset = CFFExpertCharset.getInstance();
                } else if (!z10 && intValue == 2) {
                    cFFISOAdobeCharset = CFFExpertSubsetCharset.getInstance();
                } else {
                    cFFDataInput.setPosition(intValue);
                    cFFISOAdobeCharset = readCharset(cFFDataInput, readIndexData.length, z10);
                }
            } else if (z10) {
                cFFISOAdobeCharset = new EmptyCharset(readIndexData.length);
            } else {
                cFFISOAdobeCharset = CFFISOAdobeCharset.getInstance();
            }
            cFFCIDFont.setCharset(cFFISOAdobeCharset);
            cFFCIDFont.charStrings = readIndexData;
            if (z10) {
                CFFCIDFont cFFCIDFont3 = (CFFCIDFont) cFFCIDFont;
                parseCIDFontDicts(cFFDataInput, readDictData, cFFCIDFont3, readIndexData.length);
                List<Map<String, Object>> fontDicts = cFFCIDFont3.getFontDicts();
                if (!fontDicts.isEmpty() && fontDicts.get(0).containsKey("FontMatrix")) {
                    list = (List) fontDicts.get(0).get("FontMatrix");
                } else {
                    list = null;
                }
                List<Number> array = readDictData.getArray("FontMatrix", null);
                if (array == null) {
                    if (list != null) {
                        cFFCIDFont.addValueToTopDict("FontMatrix", list);
                    } else {
                        cFFCIDFont.addValueToTopDict("FontMatrix", readDictData.getArray("FontMatrix", Arrays.asList(Double.valueOf(0.001d), Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.001d), Double.valueOf(0.0d), Double.valueOf(0.0d))));
                    }
                } else if (list != null) {
                    concatenateMatrix(array, list);
                }
            } else {
                parseType1Dicts(cFFDataInput, readDictData, cFFCIDFont, cFFISOAdobeCharset);
            }
            return cFFCIDFont;
        }
        throw new IOException("Synthetic Fonts are not supported");
    }

    private void parseType1Dicts(CFFDataInput cFFDataInput, DictData dictData, CFFType1Font cFFType1Font, CFFCharset cFFCharset) {
        int i10;
        CFFEncoding cFFStandardEncoding;
        DictData.Entry entry = dictData.getEntry("Encoding");
        if (entry != null) {
            i10 = entry.getNumber(0).intValue();
        } else {
            i10 = 0;
        }
        if (i10 != 0) {
            if (i10 != 1) {
                cFFDataInput.setPosition(i10);
                cFFStandardEncoding = readEncoding(cFFDataInput, cFFCharset);
            } else {
                cFFStandardEncoding = CFFExpertEncoding.getInstance();
            }
        } else {
            cFFStandardEncoding = CFFStandardEncoding.getInstance();
        }
        cFFType1Font.setEncoding(cFFStandardEncoding);
        DictData.Entry entry2 = dictData.getEntry(StandardStructureTypes.PRIVATE);
        if (entry2 != null) {
            int intValue = entry2.getNumber(1).intValue();
            cFFDataInput.setPosition(intValue);
            DictData readDictData = readDictData(cFFDataInput, entry2.getNumber(0).intValue());
            for (Map.Entry<String, Object> entry3 : readPrivateDict(readDictData).entrySet()) {
                cFFType1Font.addToPrivateDict(entry3.getKey(), entry3.getValue());
            }
            int intValue2 = ((Integer) readDictData.getNumber("Subrs", 0)).intValue();
            if (intValue2 > 0) {
                cFFDataInput.setPosition(intValue + intValue2);
                cFFType1Font.addToPrivateDict("Subrs", readIndexData(cFFDataInput));
                return;
            }
            return;
        }
        throw new IOException("Private dictionary entry missing for font " + cFFType1Font.fontName);
    }

    private CFFCharset readCharset(CFFDataInput cFFDataInput, int i10, boolean z10) {
        int readCard8 = cFFDataInput.readCard8();
        if (readCard8 != 0) {
            if (readCard8 != 1) {
                if (readCard8 == 2) {
                    return readFormat2Charset(cFFDataInput, readCard8, i10, z10);
                }
                throw new IllegalArgumentException();
            }
            return readFormat1Charset(cFFDataInput, readCard8, i10, z10);
        }
        return readFormat0Charset(cFFDataInput, readCard8, i10, z10);
    }

    private static DictData readDictData(CFFDataInput cFFDataInput) {
        DictData dictData = new DictData(0);
        while (cFFDataInput.hasRemaining()) {
            dictData.add(readEntry(cFFDataInput));
        }
        return dictData;
    }

    private CFFEncoding readEncoding(CFFDataInput cFFDataInput, CFFCharset cFFCharset) {
        int readCard8 = cFFDataInput.readCard8();
        int i10 = readCard8 & ShapeTypes.VERTICAL_SCROLL;
        if (i10 != 0) {
            if (i10 == 1) {
                return readFormat1Encoding(cFFDataInput, cFFCharset, readCard8);
            }
            throw new IllegalArgumentException();
        }
        return readFormat0Encoding(cFFDataInput, cFFCharset, readCard8);
    }

    private static DictData.Entry readEntry(CFFDataInput cFFDataInput) {
        int readUnsignedByte;
        DictData.Entry entry = new DictData.Entry(0);
        while (true) {
            readUnsignedByte = cFFDataInput.readUnsignedByte();
            if (readUnsignedByte >= 0 && readUnsignedByte <= 21) {
                entry.operator = readOperator(cFFDataInput, readUnsignedByte);
                return entry;
            } else if (readUnsignedByte != 28 && readUnsignedByte != 29) {
                if (readUnsignedByte == 30) {
                    entry.operands.add(readRealNumber(cFFDataInput));
                } else if (readUnsignedByte < 32 || readUnsignedByte > 254) {
                    break;
                } else {
                    entry.operands.add(readIntegerNumber(cFFDataInput, readUnsignedByte));
                }
            } else {
                entry.operands.add(readIntegerNumber(cFFDataInput, readUnsignedByte));
            }
        }
        throw new IOException(a.c("invalid DICT data b0 byte: ", readUnsignedByte));
    }

    private static FDSelect readFDSelect(CFFDataInput cFFDataInput, int i10, CFFCIDFont cFFCIDFont) {
        int readCard8 = cFFDataInput.readCard8();
        if (readCard8 != 0) {
            if (readCard8 == 3) {
                return readFormat3FDSelect(cFFDataInput, readCard8, i10, cFFCIDFont);
            }
            throw new IllegalArgumentException();
        }
        return readFormat0FDSelect(cFFDataInput, readCard8, i10, cFFCIDFont);
    }

    private Format0Charset readFormat0Charset(CFFDataInput cFFDataInput, int i10, int i11, boolean z10) {
        Format0Charset format0Charset = new Format0Charset(z10);
        format0Charset.format = i10;
        if (z10) {
            format0Charset.addCID(0, 0);
        } else {
            format0Charset.addSID(0, 0, ".notdef");
        }
        for (int i12 = 1; i12 < i11; i12++) {
            int readSID = cFFDataInput.readSID();
            if (z10) {
                format0Charset.addCID(i12, readSID);
            } else {
                format0Charset.addSID(i12, readSID, readString(readSID));
            }
        }
        return format0Charset;
    }

    private Format0Encoding readFormat0Encoding(CFFDataInput cFFDataInput, CFFCharset cFFCharset, int i10) {
        Format0Encoding format0Encoding = new Format0Encoding(0);
        format0Encoding.format = i10;
        format0Encoding.nCodes = cFFDataInput.readCard8();
        format0Encoding.add(0, 0, ".notdef");
        for (int i11 = 1; i11 <= format0Encoding.nCodes; i11++) {
            int readCard8 = cFFDataInput.readCard8();
            int sIDForGID = cFFCharset.getSIDForGID(i11);
            format0Encoding.add(readCard8, sIDForGID, readString(sIDForGID));
        }
        if ((i10 & 128) != 0) {
            readSupplement(cFFDataInput, format0Encoding);
        }
        return format0Encoding;
    }

    private static Format0FDSelect readFormat0FDSelect(CFFDataInput cFFDataInput, int i10, int i11, CFFCIDFont cFFCIDFont) {
        Format0FDSelect format0FDSelect = new Format0FDSelect(cFFCIDFont, 0);
        format0FDSelect.format = i10;
        format0FDSelect.fds = new int[i11];
        for (int i12 = 0; i12 < format0FDSelect.fds.length; i12++) {
            format0FDSelect.fds[i12] = cFFDataInput.readCard8();
        }
        return format0FDSelect;
    }

    private Format1Charset readFormat1Charset(CFFDataInput cFFDataInput, int i10, int i11, boolean z10) {
        Format1Charset format1Charset = new Format1Charset(z10);
        format1Charset.format = i10;
        if (z10) {
            format1Charset.addCID(0, 0);
            format1Charset.rangesCID2GID = new ArrayList();
        } else {
            format1Charset.addSID(0, 0, ".notdef");
        }
        int i12 = 1;
        while (i12 < i11) {
            int readSID = cFFDataInput.readSID();
            int readCard8 = cFFDataInput.readCard8();
            if (!z10) {
                for (int i13 = 0; i13 < readCard8 + 1; i13++) {
                    int i14 = readSID + i13;
                    format1Charset.addSID(i12 + i13, i14, readString(i14));
                }
            } else {
                format1Charset.rangesCID2GID.add(new RangeMapping(i12, readSID, readCard8, 0));
            }
            i12 = i12 + readCard8 + 1;
        }
        return format1Charset;
    }

    private Format1Encoding readFormat1Encoding(CFFDataInput cFFDataInput, CFFCharset cFFCharset, int i10) {
        Format1Encoding format1Encoding = new Format1Encoding(0);
        format1Encoding.format = i10;
        format1Encoding.nRanges = cFFDataInput.readCard8();
        format1Encoding.add(0, 0, ".notdef");
        int i11 = 1;
        for (int i12 = 0; i12 < format1Encoding.nRanges; i12++) {
            int readCard8 = cFFDataInput.readCard8();
            int readCard82 = cFFDataInput.readCard8();
            for (int i13 = 0; i13 <= readCard82; i13++) {
                int sIDForGID = cFFCharset.getSIDForGID(i11);
                format1Encoding.add(readCard8 + i13, sIDForGID, readString(sIDForGID));
                i11++;
            }
        }
        if ((i10 & 128) != 0) {
            readSupplement(cFFDataInput, format1Encoding);
        }
        return format1Encoding;
    }

    private Format2Charset readFormat2Charset(CFFDataInput cFFDataInput, int i10, int i11, boolean z10) {
        Format2Charset format2Charset = new Format2Charset(z10);
        format2Charset.format = i10;
        if (z10) {
            format2Charset.addCID(0, 0);
            format2Charset.rangesCID2GID = new ArrayList();
        } else {
            format2Charset.addSID(0, 0, ".notdef");
        }
        int i12 = 1;
        while (i12 < i11) {
            int readSID = cFFDataInput.readSID();
            int readCard16 = cFFDataInput.readCard16();
            if (!z10) {
                for (int i13 = 0; i13 < readCard16 + 1; i13++) {
                    int i14 = readSID + i13;
                    format2Charset.addSID(i12 + i13, i14, readString(i14));
                }
            } else {
                format2Charset.rangesCID2GID.add(new RangeMapping(i12, readSID, readCard16, 0));
            }
            i12 = i12 + readCard16 + 1;
        }
        return format2Charset;
    }

    private static Format3FDSelect readFormat3FDSelect(CFFDataInput cFFDataInput, int i10, int i11, CFFCIDFont cFFCIDFont) {
        Format3FDSelect format3FDSelect = new Format3FDSelect(cFFCIDFont, 0);
        format3FDSelect.format = i10;
        format3FDSelect.nbRanges = cFFDataInput.readCard16();
        format3FDSelect.range3 = new Range3[format3FDSelect.nbRanges];
        for (int i12 = 0; i12 < format3FDSelect.nbRanges; i12++) {
            Range3 range3 = new Range3(0);
            range3.first = cFFDataInput.readCard16();
            range3.f15980fd = cFFDataInput.readCard8();
            format3FDSelect.range3[i12] = range3;
        }
        format3FDSelect.sentinel = cFFDataInput.readCard16();
        return format3FDSelect;
    }

    private static Header readHeader(CFFDataInput cFFDataInput) {
        Header header = new Header(0);
        header.major = cFFDataInput.readCard8();
        header.minor = cFFDataInput.readCard8();
        header.hdrSize = cFFDataInput.readCard8();
        header.offSize = cFFDataInput.readOffSize();
        return header;
    }

    private static byte[][] readIndexData(CFFDataInput cFFDataInput) {
        int[] readIndexDataOffsets = readIndexDataOffsets(cFFDataInput);
        if (readIndexDataOffsets == null) {
            return null;
        }
        int length = readIndexDataOffsets.length - 1;
        byte[][] bArr = new byte[length];
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            bArr[i10] = cFFDataInput.readBytes(readIndexDataOffsets[i11] - readIndexDataOffsets[i10]);
            i10 = i11;
        }
        return bArr;
    }

    private static int[] readIndexDataOffsets(CFFDataInput cFFDataInput) {
        int readCard16 = cFFDataInput.readCard16();
        if (readCard16 == 0) {
            return null;
        }
        int readOffSize = cFFDataInput.readOffSize();
        int[] iArr = new int[readCard16 + 1];
        for (int i10 = 0; i10 <= readCard16; i10++) {
            int readOffset = cFFDataInput.readOffset(readOffSize);
            if (readOffset <= cFFDataInput.length()) {
                iArr[i10] = readOffset;
            } else {
                throw new IOException(a0.a.g("illegal offset value ", readOffset, " in CFF font"));
            }
        }
        return iArr;
    }

    private static Integer readIntegerNumber(CFFDataInput cFFDataInput, int i10) {
        if (i10 == 28) {
            return Integer.valueOf(cFFDataInput.readShort());
        }
        if (i10 == 29) {
            return Integer.valueOf(cFFDataInput.readInt());
        }
        if (i10 >= 32 && i10 <= 246) {
            return Integer.valueOf(i10 - 139);
        }
        if (i10 >= 247 && i10 <= 250) {
            return Integer.valueOf(((i10 - 247) * 256) + cFFDataInput.readUnsignedByte() + 108);
        } else if (i10 >= 251 && i10 <= 254) {
            return Integer.valueOf((((-(i10 - 251)) * 256) - cFFDataInput.readUnsignedByte()) - 108);
        } else {
            throw new IllegalArgumentException();
        }
    }

    private static long readLong(CFFDataInput cFFDataInput) {
        return cFFDataInput.readCard16() | (cFFDataInput.readCard16() << 16);
    }

    private static CFFOperator readOperator(CFFDataInput cFFDataInput, int i10) {
        return CFFOperator.getOperator(readOperatorKey(cFFDataInput, i10));
    }

    private static CFFOperator.Key readOperatorKey(CFFDataInput cFFDataInput, int i10) {
        if (i10 == 12) {
            return new CFFOperator.Key(i10, cFFDataInput.readUnsignedByte());
        }
        return new CFFOperator.Key(i10);
    }

    private Map<String, Object> readPrivateDict(DictData dictData) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(17);
        linkedHashMap.put("BlueValues", dictData.getDelta("BlueValues", null));
        linkedHashMap.put("OtherBlues", dictData.getDelta("OtherBlues", null));
        linkedHashMap.put("FamilyBlues", dictData.getDelta("FamilyBlues", null));
        linkedHashMap.put("FamilyOtherBlues", dictData.getDelta("FamilyOtherBlues", null));
        linkedHashMap.put("BlueScale", dictData.getNumber("BlueScale", Double.valueOf(0.039625d)));
        linkedHashMap.put("BlueShift", dictData.getNumber("BlueShift", 7));
        linkedHashMap.put("BlueFuzz", dictData.getNumber("BlueFuzz", 1));
        linkedHashMap.put(AFMParser.STD_HW, dictData.getNumber(AFMParser.STD_HW, null));
        linkedHashMap.put(AFMParser.STD_VW, dictData.getNumber(AFMParser.STD_VW, null));
        linkedHashMap.put("StemSnapH", dictData.getDelta("StemSnapH", null));
        linkedHashMap.put("StemSnapV", dictData.getDelta("StemSnapV", null));
        linkedHashMap.put("ForceBold", dictData.getBoolean("ForceBold", false));
        linkedHashMap.put("LanguageGroup", dictData.getNumber("LanguageGroup", 0));
        linkedHashMap.put("ExpansionFactor", dictData.getNumber("ExpansionFactor", Double.valueOf(0.06d)));
        linkedHashMap.put("initialRandomSeed", dictData.getNumber("initialRandomSeed", 0));
        linkedHashMap.put("defaultWidthX", dictData.getNumber("defaultWidthX", 0));
        linkedHashMap.put("nominalWidthX", dictData.getNumber("nominalWidthX", 0));
        return linkedHashMap;
    }

    private static Double readRealNumber(CFFDataInput cFFDataInput) {
        StringBuilder sb2 = new StringBuilder();
        int[] iArr = new int[2];
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (!z10) {
            int readUnsignedByte = cFFDataInput.readUnsignedByte();
            iArr[0] = readUnsignedByte / 16;
            iArr[1] = readUnsignedByte % 16;
            for (int i10 = 0; i10 < 2; i10++) {
                int i11 = iArr[i10];
                switch (i11) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        sb2.append(i11);
                        z11 = false;
                        break;
                    case 10:
                        sb2.append(".");
                        break;
                    case 11:
                        if (!z12) {
                            sb2.append("E");
                            z11 = true;
                            z12 = true;
                            break;
                        }
                        break;
                    case 12:
                        if (!z12) {
                            sb2.append("E-");
                            z11 = true;
                            z12 = true;
                            break;
                        }
                        break;
                    case 13:
                        break;
                    case 14:
                        sb2.append("-");
                        break;
                    case 15:
                        z10 = true;
                        break;
                    default:
                        throw new IllegalArgumentException(a.c("illegal nibble ", i11));
                }
            }
        }
        if (z11) {
            sb2.append(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
        }
        if (sb2.length() == 0) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(sb2.toString());
        } catch (NumberFormatException e10) {
            throw new IOException(e10);
        }
    }

    private String readString(int i10) {
        if (i10 >= 0 && i10 <= 390) {
            return CFFStandardString.getName(i10);
        }
        int i11 = i10 - 391;
        String[] strArr = this.stringIndex;
        if (i11 < strArr.length) {
            return strArr[i11];
        }
        return a.c("SID", i10);
    }

    private static String[] readStringIndexData(CFFDataInput cFFDataInput) {
        int[] readIndexDataOffsets = readIndexDataOffsets(cFFDataInput);
        if (readIndexDataOffsets == null) {
            return null;
        }
        int length = readIndexDataOffsets.length - 1;
        String[] strArr = new String[length];
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            int i12 = readIndexDataOffsets[i11] - readIndexDataOffsets[i10];
            if (i12 >= 0) {
                strArr[i10] = new String(cFFDataInput.readBytes(i12), Charsets.ISO_8859_1);
                i10 = i11;
            } else {
                StringBuilder f10 = d.f("Negative index data length + ", i12, " at ", i10, ": offsets[");
                f10.append(i11);
                f10.append("]=");
                f10.append(readIndexDataOffsets[i11]);
                f10.append(", offsets[");
                f10.append(i10);
                f10.append("]=");
                f10.append(readIndexDataOffsets[i10]);
                throw new IOException(f10.toString());
            }
        }
        return strArr;
    }

    private void readSupplement(CFFDataInput cFFDataInput, CFFBuiltInEncoding cFFBuiltInEncoding) {
        cFFBuiltInEncoding.nSups = cFFDataInput.readCard8();
        cFFBuiltInEncoding.supplement = new CFFBuiltInEncoding.Supplement[cFFBuiltInEncoding.nSups];
        for (int i10 = 0; i10 < cFFBuiltInEncoding.supplement.length; i10++) {
            CFFBuiltInEncoding.Supplement supplement = new CFFBuiltInEncoding.Supplement();
            supplement.code = cFFDataInput.readCard8();
            supplement.sid = cFFDataInput.readSID();
            supplement.name = readString(supplement.sid);
            cFFBuiltInEncoding.supplement[i10] = supplement;
            cFFBuiltInEncoding.add(supplement.code, supplement.sid, readString(supplement.sid));
        }
    }

    private static String readTagName(CFFDataInput cFFDataInput) {
        return new String(cFFDataInput.readBytes(4), Charsets.ISO_8859_1);
    }

    public List<CFFFont> parse(byte[] bArr, ByteSource byteSource) {
        this.source = byteSource;
        return parse(bArr);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("[");
        return r.g(sb2, this.debugFontName, "]");
    }

    public List<CFFFont> parse(byte[] bArr) {
        CFFDataInput cFFDataInput = new CFFDataInput(bArr);
        String readTagName = readTagName(cFFDataInput);
        if (TAG_OTTO.equals(readTagName)) {
            cFFDataInput = createTaggedCFFDataInput(cFFDataInput, bArr);
        } else if (!TAG_TTCF.equals(readTagName)) {
            if (!TAG_TTFONLY.equals(readTagName)) {
                cFFDataInput.setPosition(0);
            } else {
                throw new IOException("OpenType fonts containing a true type font are not supported.");
            }
        } else {
            throw new IOException("True Type Collection fonts are not supported.");
        }
        readHeader(cFFDataInput);
        String[] readStringIndexData = readStringIndexData(cFFDataInput);
        if (readStringIndexData != null) {
            byte[][] readIndexData = readIndexData(cFFDataInput);
            this.stringIndex = readStringIndexData(cFFDataInput);
            byte[][] readIndexData2 = readIndexData(cFFDataInput);
            ArrayList arrayList = new ArrayList(readStringIndexData.length);
            for (int i10 = 0; i10 < readStringIndexData.length; i10++) {
                CFFFont parseFont = parseFont(cFFDataInput, readStringIndexData[i10], readIndexData[i10]);
                parseFont.setGlobalSubrIndex(readIndexData2);
                parseFont.setData(this.source);
                arrayList.add(parseFont);
            }
            return arrayList;
        }
        throw new IOException("Name index missing in CFF font");
    }

    private static DictData readDictData(CFFDataInput cFFDataInput, int i10) {
        DictData dictData = new DictData(0);
        int position = cFFDataInput.getPosition() + i10;
        while (cFFDataInput.getPosition() < position) {
            dictData.add(readEntry(cFFDataInput));
        }
        return dictData;
    }
}
