package com.tom_roush.fontbox.ttf;

import androidx.activity.f;
import b.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class GlyphSubstitutionTable extends TTFTable {
    public static final String TAG = "GSUB";
    private FeatureRecord[] featureList;
    private String lastUsedSupportedScript;
    private final Map<Integer, Integer> lookupCache;
    private LookupTable[] lookupList;
    private final Map<Integer, Integer> reverseLookup;
    private LinkedHashMap<String, ScriptTable> scriptList;

    /* loaded from: classes2.dex */
    public static abstract class CoverageTable {
        int coverageFormat;

        public abstract int getCoverageIndex(int i10);
    }

    /* loaded from: classes2.dex */
    public static class CoverageTableFormat1 extends CoverageTable {
        int[] glyphArray;

        @Override // com.tom_roush.fontbox.ttf.GlyphSubstitutionTable.CoverageTable
        public int getCoverageIndex(int i10) {
            return Arrays.binarySearch(this.glyphArray, i10);
        }

        public String toString() {
            return String.format("CoverageTableFormat1[coverageFormat=%d,glyphArray=%s]", Integer.valueOf(this.coverageFormat), Arrays.toString(this.glyphArray));
        }
    }

    /* loaded from: classes2.dex */
    public static class CoverageTableFormat2 extends CoverageTable {
        RangeRecord[] rangeRecords;

        @Override // com.tom_roush.fontbox.ttf.GlyphSubstitutionTable.CoverageTable
        public int getCoverageIndex(int i10) {
            RangeRecord[] rangeRecordArr;
            for (RangeRecord rangeRecord : this.rangeRecords) {
                int i11 = rangeRecord.startGlyphID;
                if (i11 <= i10 && i10 <= rangeRecord.endGlyphID) {
                    return (rangeRecord.startCoverageIndex + i10) - i11;
                }
            }
            return -1;
        }

        public String toString() {
            return String.format("CoverageTableFormat2[coverageFormat=%d]", Integer.valueOf(this.coverageFormat));
        }
    }

    /* loaded from: classes2.dex */
    public static class FeatureRecord {
        FeatureTable featureTable;
        String featureTag;

        public String toString() {
            return String.format("FeatureRecord[featureTag=%s]", this.featureTag);
        }
    }

    /* loaded from: classes2.dex */
    public static class FeatureTable {
        int[] lookupListIndices;

        public String toString() {
            return String.format("FeatureTable[lookupListIndiciesCount=%d]", Integer.valueOf(this.lookupListIndices.length));
        }
    }

    /* loaded from: classes2.dex */
    public static class LangSysRecord {
        LangSysTable langSysTable;
        String langSysTag;

        public String toString() {
            return String.format("LangSysRecord[langSysTag=%s]", this.langSysTag);
        }
    }

    /* loaded from: classes2.dex */
    public static class LangSysTable {
        int[] featureIndices;
        int requiredFeatureIndex;

        public String toString() {
            return String.format("LangSysTable[requiredFeatureIndex=%d]", Integer.valueOf(this.requiredFeatureIndex));
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class LookupSubTable {
        CoverageTable coverageTable;
        int substFormat;

        public abstract int doSubstitution(int i10, int i11);
    }

    /* loaded from: classes2.dex */
    public static class LookupTable {
        int lookupFlag;
        int lookupType;
        int markFilteringSet;
        LookupSubTable[] subTables;

        public String toString() {
            return String.format("LookupTable[lookupType=%d,lookupFlag=%d,markFilteringSet=%d]", Integer.valueOf(this.lookupType), Integer.valueOf(this.lookupFlag), Integer.valueOf(this.markFilteringSet));
        }
    }

    /* loaded from: classes2.dex */
    public static class LookupTypeSingleSubstFormat1 extends LookupSubTable {
        short deltaGlyphID;

        @Override // com.tom_roush.fontbox.ttf.GlyphSubstitutionTable.LookupSubTable
        public int doSubstitution(int i10, int i11) {
            if (i11 >= 0) {
                return i10 + this.deltaGlyphID;
            }
            return i10;
        }

        public String toString() {
            return String.format("LookupTypeSingleSubstFormat1[substFormat=%d,deltaGlyphID=%d]", Integer.valueOf(this.substFormat), Short.valueOf(this.deltaGlyphID));
        }
    }

    /* loaded from: classes2.dex */
    public static class LookupTypeSingleSubstFormat2 extends LookupSubTable {
        int[] substituteGlyphIDs;

        @Override // com.tom_roush.fontbox.ttf.GlyphSubstitutionTable.LookupSubTable
        public int doSubstitution(int i10, int i11) {
            if (i11 >= 0) {
                return this.substituteGlyphIDs[i11];
            }
            return i10;
        }

        public String toString() {
            return String.format("LookupTypeSingleSubstFormat2[substFormat=%d,substituteGlyphIDs=%s]", Integer.valueOf(this.substFormat), Arrays.toString(this.substituteGlyphIDs));
        }
    }

    /* loaded from: classes2.dex */
    public static class RangeRecord {
        int endGlyphID;
        int startCoverageIndex;
        int startGlyphID;

        public String toString() {
            return String.format("RangeRecord[startGlyphID=%d,endGlyphID=%d,startCoverageIndex=%d]", Integer.valueOf(this.startGlyphID), Integer.valueOf(this.endGlyphID), Integer.valueOf(this.startCoverageIndex));
        }
    }

    /* loaded from: classes2.dex */
    public static class ScriptRecord {
        ScriptTable scriptTable;
        String scriptTag;

        public String toString() {
            return String.format("ScriptRecord[scriptTag=%s]", this.scriptTag);
        }
    }

    /* loaded from: classes2.dex */
    public static class ScriptTable {
        LangSysTable defaultLangSysTable;
        LinkedHashMap<String, LangSysTable> langSysTables;

        public String toString() {
            boolean z10;
            Object[] objArr = new Object[2];
            if (this.defaultLangSysTable != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            objArr[0] = Boolean.valueOf(z10);
            objArr[1] = Integer.valueOf(this.langSysTables.size());
            return String.format("ScriptTable[hasDefault=%s,langSysRecordsCount=%d]", objArr);
        }
    }

    public GlyphSubstitutionTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
        this.lookupCache = new HashMap();
        this.reverseLookup = new HashMap();
    }

    private int applyFeature(FeatureRecord featureRecord, int i10) {
        for (int i11 : featureRecord.featureTable.lookupListIndices) {
            LookupTable lookupTable = this.lookupList[i11];
            if (lookupTable.lookupType == 1) {
                i10 = doLookup(lookupTable, i10);
            }
        }
        return i10;
    }

    private boolean containsFeature(List<FeatureRecord> list, String str) {
        for (FeatureRecord featureRecord : list) {
            if (featureRecord.featureTag.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private int doLookup(LookupTable lookupTable, int i10) {
        LookupSubTable[] lookupSubTableArr;
        for (LookupSubTable lookupSubTable : lookupTable.subTables) {
            int coverageIndex = lookupSubTable.coverageTable.getCoverageIndex(i10);
            if (coverageIndex >= 0) {
                return lookupSubTable.doSubstitution(i10, coverageIndex);
            }
        }
        return i10;
    }

    private List<FeatureRecord> getFeatureRecords(Collection<LangSysTable> collection, final List<String> list) {
        int[] iArr;
        if (collection.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (LangSysTable langSysTable : collection) {
            int i10 = langSysTable.requiredFeatureIndex;
            if (i10 != 65535) {
                FeatureRecord[] featureRecordArr = this.featureList;
                if (i10 < featureRecordArr.length) {
                    arrayList.add(featureRecordArr[i10]);
                }
            }
            for (int i11 : langSysTable.featureIndices) {
                FeatureRecord[] featureRecordArr2 = this.featureList;
                if (i11 < featureRecordArr2.length && (list == null || list.contains(featureRecordArr2[i11].featureTag))) {
                    arrayList.add(this.featureList[i11]);
                }
            }
        }
        if (containsFeature(arrayList, "vrt2")) {
            removeFeature(arrayList, "vert");
        }
        if (list != null && arrayList.size() > 1) {
            Collections.sort(arrayList, new Comparator<FeatureRecord>() { // from class: com.tom_roush.fontbox.ttf.GlyphSubstitutionTable.1
                @Override // java.util.Comparator
                public int compare(FeatureRecord featureRecord, FeatureRecord featureRecord2) {
                    int indexOf = list.indexOf(featureRecord.featureTag);
                    int indexOf2 = list.indexOf(featureRecord2.featureTag);
                    if (indexOf < indexOf2) {
                        return -1;
                    }
                    return indexOf == indexOf2 ? 0 : 1;
                }
            });
        }
        return arrayList;
    }

    private Collection<LangSysTable> getLangSysTables(String str) {
        List emptyList = Collections.emptyList();
        ScriptTable scriptTable = this.scriptList.get(str);
        if (scriptTable != null) {
            if (scriptTable.defaultLangSysTable == null) {
                return scriptTable.langSysTables.values();
            }
            ArrayList arrayList = new ArrayList(scriptTable.langSysTables.values());
            arrayList.add(scriptTable.defaultLangSysTable);
            return arrayList;
        }
        return emptyList;
    }

    private void removeFeature(List<FeatureRecord> list, String str) {
        Iterator<FeatureRecord> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().featureTag.equals(str)) {
                it.remove();
            }
        }
    }

    private String selectScriptTag(String[] strArr) {
        if (strArr.length == 1) {
            String str = strArr[0];
            if (OpenTypeScript.INHERITED.equals(str) || (OpenTypeScript.TAG_DEFAULT.equals(str) && !this.scriptList.containsKey(str))) {
                if (this.lastUsedSupportedScript == null) {
                    this.lastUsedSupportedScript = this.scriptList.keySet().iterator().next();
                }
                return this.lastUsedSupportedScript;
            }
        }
        for (String str2 : strArr) {
            if (this.scriptList.containsKey(str2)) {
                this.lastUsedSupportedScript = str2;
                return str2;
            }
        }
        return strArr[0];
    }

    public int getSubstitution(int i10, String[] strArr, List<String> list) {
        if (i10 == -1) {
            return -1;
        }
        Integer num = this.lookupCache.get(Integer.valueOf(i10));
        if (num != null) {
            return num.intValue();
        }
        int i11 = i10;
        for (FeatureRecord featureRecord : getFeatureRecords(getLangSysTables(selectScriptTag(strArr)), list)) {
            i11 = applyFeature(featureRecord, i11);
        }
        this.lookupCache.put(Integer.valueOf(i10), Integer.valueOf(i11));
        this.reverseLookup.put(Integer.valueOf(i11), Integer.valueOf(i10));
        return i11;
    }

    public int getUnsubstitution(int i10) {
        Integer num = this.reverseLookup.get(Integer.valueOf(i10));
        if (num == null) {
            return i10;
        }
        return num.intValue();
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    public void read(TrueTypeFont trueTypeFont, TTFDataStream tTFDataStream) {
        long currentPosition = tTFDataStream.getCurrentPosition();
        tTFDataStream.readUnsignedShort();
        int readUnsignedShort = tTFDataStream.readUnsignedShort();
        int readUnsignedShort2 = tTFDataStream.readUnsignedShort();
        int readUnsignedShort3 = tTFDataStream.readUnsignedShort();
        int readUnsignedShort4 = tTFDataStream.readUnsignedShort();
        if (readUnsignedShort == 1) {
            tTFDataStream.readUnsignedInt();
        }
        this.scriptList = readScriptList(tTFDataStream, readUnsignedShort2 + currentPosition);
        this.featureList = readFeatureList(tTFDataStream, readUnsignedShort3 + currentPosition);
        this.lookupList = readLookupList(tTFDataStream, currentPosition + readUnsignedShort4);
    }

    public CoverageTable readCoverageTable(TTFDataStream tTFDataStream, long j10) {
        tTFDataStream.seek(j10);
        int readUnsignedShort = tTFDataStream.readUnsignedShort();
        int i10 = 0;
        if (readUnsignedShort != 1) {
            if (readUnsignedShort == 2) {
                CoverageTableFormat2 coverageTableFormat2 = new CoverageTableFormat2();
                coverageTableFormat2.coverageFormat = readUnsignedShort;
                int readUnsignedShort2 = tTFDataStream.readUnsignedShort();
                coverageTableFormat2.rangeRecords = new RangeRecord[readUnsignedShort2];
                while (i10 < readUnsignedShort2) {
                    coverageTableFormat2.rangeRecords[i10] = readRangeRecord(tTFDataStream);
                    i10++;
                }
                return coverageTableFormat2;
            }
            throw new IOException(a.c("Unknown coverage format: ", readUnsignedShort));
        }
        CoverageTableFormat1 coverageTableFormat1 = new CoverageTableFormat1();
        coverageTableFormat1.coverageFormat = readUnsignedShort;
        int readUnsignedShort3 = tTFDataStream.readUnsignedShort();
        coverageTableFormat1.glyphArray = new int[readUnsignedShort3];
        while (i10 < readUnsignedShort3) {
            coverageTableFormat1.glyphArray[i10] = tTFDataStream.readUnsignedShort();
            i10++;
        }
        return coverageTableFormat1;
    }

    public FeatureRecord[] readFeatureList(TTFDataStream tTFDataStream, long j10) {
        tTFDataStream.seek(j10);
        int readUnsignedShort = tTFDataStream.readUnsignedShort();
        FeatureRecord[] featureRecordArr = new FeatureRecord[readUnsignedShort];
        int[] iArr = new int[readUnsignedShort];
        String str = "";
        for (int i10 = 0; i10 < readUnsignedShort; i10++) {
            FeatureRecord featureRecord = new FeatureRecord();
            String readString = tTFDataStream.readString(4);
            featureRecord.featureTag = readString;
            if (i10 > 0 && readString.compareTo(str) < 0 && (!featureRecord.featureTag.matches("\\w{4}") || !str.matches("\\w{4}"))) {
                return new FeatureRecord[0];
            }
            iArr[i10] = tTFDataStream.readUnsignedShort();
            featureRecordArr[i10] = featureRecord;
            str = featureRecord.featureTag;
        }
        for (int i11 = 0; i11 < readUnsignedShort; i11++) {
            featureRecordArr[i11].featureTable = readFeatureTable(tTFDataStream, iArr[i11] + j10);
        }
        return featureRecordArr;
    }

    public FeatureTable readFeatureTable(TTFDataStream tTFDataStream, long j10) {
        tTFDataStream.seek(j10);
        FeatureTable featureTable = new FeatureTable();
        tTFDataStream.readUnsignedShort();
        int readUnsignedShort = tTFDataStream.readUnsignedShort();
        featureTable.lookupListIndices = new int[readUnsignedShort];
        for (int i10 = 0; i10 < readUnsignedShort; i10++) {
            featureTable.lookupListIndices[i10] = tTFDataStream.readUnsignedShort();
        }
        return featureTable;
    }

    public LangSysTable readLangSysTable(TTFDataStream tTFDataStream, long j10) {
        tTFDataStream.seek(j10);
        LangSysTable langSysTable = new LangSysTable();
        tTFDataStream.readUnsignedShort();
        langSysTable.requiredFeatureIndex = tTFDataStream.readUnsignedShort();
        int readUnsignedShort = tTFDataStream.readUnsignedShort();
        langSysTable.featureIndices = new int[readUnsignedShort];
        for (int i10 = 0; i10 < readUnsignedShort; i10++) {
            langSysTable.featureIndices[i10] = tTFDataStream.readUnsignedShort();
        }
        return langSysTable;
    }

    public LookupTable[] readLookupList(TTFDataStream tTFDataStream, long j10) {
        tTFDataStream.seek(j10);
        int readUnsignedShort = tTFDataStream.readUnsignedShort();
        int[] iArr = new int[readUnsignedShort];
        for (int i10 = 0; i10 < readUnsignedShort; i10++) {
            iArr[i10] = tTFDataStream.readUnsignedShort();
        }
        LookupTable[] lookupTableArr = new LookupTable[readUnsignedShort];
        for (int i11 = 0; i11 < readUnsignedShort; i11++) {
            lookupTableArr[i11] = readLookupTable(tTFDataStream, iArr[i11] + j10);
        }
        return lookupTableArr;
    }

    public LookupSubTable readLookupSubTable(TTFDataStream tTFDataStream, long j10) {
        tTFDataStream.seek(j10);
        int readUnsignedShort = tTFDataStream.readUnsignedShort();
        if (readUnsignedShort != 1) {
            if (readUnsignedShort == 2) {
                LookupTypeSingleSubstFormat2 lookupTypeSingleSubstFormat2 = new LookupTypeSingleSubstFormat2();
                lookupTypeSingleSubstFormat2.substFormat = readUnsignedShort;
                int readUnsignedShort2 = tTFDataStream.readUnsignedShort();
                int readUnsignedShort3 = tTFDataStream.readUnsignedShort();
                lookupTypeSingleSubstFormat2.substituteGlyphIDs = new int[readUnsignedShort3];
                for (int i10 = 0; i10 < readUnsignedShort3; i10++) {
                    lookupTypeSingleSubstFormat2.substituteGlyphIDs[i10] = tTFDataStream.readUnsignedShort();
                }
                lookupTypeSingleSubstFormat2.coverageTable = readCoverageTable(tTFDataStream, j10 + readUnsignedShort2);
                return lookupTypeSingleSubstFormat2;
            }
            throw new IOException(a.c("Unknown substFormat: ", readUnsignedShort));
        }
        LookupTypeSingleSubstFormat1 lookupTypeSingleSubstFormat1 = new LookupTypeSingleSubstFormat1();
        lookupTypeSingleSubstFormat1.substFormat = readUnsignedShort;
        int readUnsignedShort4 = tTFDataStream.readUnsignedShort();
        lookupTypeSingleSubstFormat1.deltaGlyphID = tTFDataStream.readSignedShort();
        lookupTypeSingleSubstFormat1.coverageTable = readCoverageTable(tTFDataStream, j10 + readUnsignedShort4);
        return lookupTypeSingleSubstFormat1;
    }

    public LookupTable readLookupTable(TTFDataStream tTFDataStream, long j10) {
        tTFDataStream.seek(j10);
        LookupTable lookupTable = new LookupTable();
        lookupTable.lookupType = tTFDataStream.readUnsignedShort();
        lookupTable.lookupFlag = tTFDataStream.readUnsignedShort();
        int readUnsignedShort = tTFDataStream.readUnsignedShort();
        int[] iArr = new int[readUnsignedShort];
        for (int i10 = 0; i10 < readUnsignedShort; i10++) {
            iArr[i10] = tTFDataStream.readUnsignedShort();
        }
        if ((lookupTable.lookupFlag & 16) != 0) {
            lookupTable.markFilteringSet = tTFDataStream.readUnsignedShort();
        }
        lookupTable.subTables = new LookupSubTable[readUnsignedShort];
        if (lookupTable.lookupType == 1) {
            for (int i11 = 0; i11 < readUnsignedShort; i11++) {
                lookupTable.subTables[i11] = readLookupSubTable(tTFDataStream, iArr[i11] + j10);
            }
        }
        return lookupTable;
    }

    public RangeRecord readRangeRecord(TTFDataStream tTFDataStream) {
        RangeRecord rangeRecord = new RangeRecord();
        rangeRecord.startGlyphID = tTFDataStream.readUnsignedShort();
        rangeRecord.endGlyphID = tTFDataStream.readUnsignedShort();
        rangeRecord.startCoverageIndex = tTFDataStream.readUnsignedShort();
        return rangeRecord;
    }

    public LinkedHashMap<String, ScriptTable> readScriptList(TTFDataStream tTFDataStream, long j10) {
        tTFDataStream.seek(j10);
        int readUnsignedShort = tTFDataStream.readUnsignedShort();
        ScriptRecord[] scriptRecordArr = new ScriptRecord[readUnsignedShort];
        int[] iArr = new int[readUnsignedShort];
        for (int i10 = 0; i10 < readUnsignedShort; i10++) {
            ScriptRecord scriptRecord = new ScriptRecord();
            scriptRecord.scriptTag = tTFDataStream.readString(4);
            iArr[i10] = tTFDataStream.readUnsignedShort();
            scriptRecordArr[i10] = scriptRecord;
        }
        for (int i11 = 0; i11 < readUnsignedShort; i11++) {
            scriptRecordArr[i11].scriptTable = readScriptTable(tTFDataStream, iArr[i11] + j10);
        }
        LinkedHashMap<String, ScriptTable> linkedHashMap = new LinkedHashMap<>(readUnsignedShort);
        for (int i12 = 0; i12 < readUnsignedShort; i12++) {
            ScriptRecord scriptRecord2 = scriptRecordArr[i12];
            linkedHashMap.put(scriptRecord2.scriptTag, scriptRecord2.scriptTable);
        }
        return linkedHashMap;
    }

    public ScriptTable readScriptTable(TTFDataStream tTFDataStream, long j10) {
        tTFDataStream.seek(j10);
        ScriptTable scriptTable = new ScriptTable();
        int readUnsignedShort = tTFDataStream.readUnsignedShort();
        int readUnsignedShort2 = tTFDataStream.readUnsignedShort();
        LangSysRecord[] langSysRecordArr = new LangSysRecord[readUnsignedShort2];
        int[] iArr = new int[readUnsignedShort2];
        String str = "";
        for (int i10 = 0; i10 < readUnsignedShort2; i10++) {
            LangSysRecord langSysRecord = new LangSysRecord();
            String readString = tTFDataStream.readString(4);
            langSysRecord.langSysTag = readString;
            if (i10 > 0 && readString.compareTo(str) <= 0) {
                throw new IOException(f.o(new StringBuilder("LangSysRecords not alphabetically sorted by LangSys tag: "), langSysRecord.langSysTag, " <= ", str));
            }
            iArr[i10] = tTFDataStream.readUnsignedShort();
            langSysRecordArr[i10] = langSysRecord;
            str = langSysRecord.langSysTag;
        }
        if (readUnsignedShort != 0) {
            scriptTable.defaultLangSysTable = readLangSysTable(tTFDataStream, readUnsignedShort + j10);
        }
        for (int i11 = 0; i11 < readUnsignedShort2; i11++) {
            langSysRecordArr[i11].langSysTable = readLangSysTable(tTFDataStream, iArr[i11] + j10);
        }
        scriptTable.langSysTables = new LinkedHashMap<>(readUnsignedShort2);
        for (int i12 = 0; i12 < readUnsignedShort2; i12++) {
            LangSysRecord langSysRecord2 = langSysRecordArr[i12];
            scriptTable.langSysTables.put(langSysRecord2.langSysTag, langSysRecord2.langSysTable);
        }
        return scriptTable;
    }
}
