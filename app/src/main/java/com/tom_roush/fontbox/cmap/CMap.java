package com.tom_roush.fontbox.cmap;

import a0.a;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class CMap {
    private static final String SPACE = " ";
    private int maxCodeLength;
    private int wmode = 0;
    private String cmapName = null;
    private String cmapVersion = null;
    private int cmapType = -1;
    private String registry = null;
    private String ordering = null;
    private int supplement = 0;
    private int minCodeLength = 4;
    private final List<CodespaceRange> codespaceRanges = new ArrayList();
    private final Map<Integer, String> charToUnicode = new HashMap();
    private final Map<String, byte[]> unicodeToByteCodes = new HashMap();
    private final Map<Integer, Integer> codeToCid = new HashMap();
    private final List<CIDRange> codeToCidRanges = new ArrayList();
    private int spaceMapping = -1;

    private int getCodeFromArray(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 = (i12 << 8) | ((bArr[i10 + i13] + 256) % 256);
        }
        return i12;
    }

    public static int toInt(byte[] bArr, int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 << 8) | (bArr[i12] & 255);
        }
        return i11;
    }

    public void addCIDMapping(int i10, int i11) {
        this.codeToCid.put(Integer.valueOf(i11), Integer.valueOf(i10));
    }

    public void addCIDRange(char c, char c10, int i10) {
        CIDRange cIDRange;
        if (!this.codeToCidRanges.isEmpty()) {
            cIDRange = (CIDRange) a.f(this.codeToCidRanges, -1);
        } else {
            cIDRange = null;
        }
        if (cIDRange == null || !cIDRange.extend(c, c10, i10)) {
            this.codeToCidRanges.add(new CIDRange(c, c10, i10));
        }
    }

    public void addCharMapping(byte[] bArr, String str) {
        this.unicodeToByteCodes.put(str, (byte[]) bArr.clone());
        int codeFromArray = getCodeFromArray(bArr, 0, bArr.length);
        this.charToUnicode.put(Integer.valueOf(codeFromArray), str);
        if (SPACE.equals(str)) {
            this.spaceMapping = codeFromArray;
        }
    }

    public void addCodespaceRange(CodespaceRange codespaceRange) {
        this.codespaceRanges.add(codespaceRange);
        this.maxCodeLength = Math.max(this.maxCodeLength, codespaceRange.getCodeLength());
        this.minCodeLength = Math.min(this.minCodeLength, codespaceRange.getCodeLength());
    }

    public byte[] getCodesFromUnicode(String str) {
        return this.unicodeToByteCodes.get(str);
    }

    public String getName() {
        return this.cmapName;
    }

    public String getOrdering() {
        return this.ordering;
    }

    public String getRegistry() {
        return this.registry;
    }

    public int getSpaceMapping() {
        return this.spaceMapping;
    }

    public int getSupplement() {
        return this.supplement;
    }

    public int getType() {
        return this.cmapType;
    }

    public String getVersion() {
        return this.cmapVersion;
    }

    public int getWMode() {
        return this.wmode;
    }

    public boolean hasCIDMappings() {
        if (this.codeToCid.isEmpty() && this.codeToCidRanges.isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean hasUnicodeMappings() {
        return !this.charToUnicode.isEmpty();
    }

    public int readCode(InputStream inputStream) {
        byte[] bArr = new byte[this.maxCodeLength];
        inputStream.read(bArr, 0, this.minCodeLength);
        inputStream.mark(this.maxCodeLength);
        int i10 = this.minCodeLength - 1;
        while (i10 < this.maxCodeLength) {
            i10++;
            for (CodespaceRange codespaceRange : this.codespaceRanges) {
                if (codespaceRange.isFullMatch(bArr, i10)) {
                    return toInt(bArr, i10);
                }
            }
            if (i10 < this.maxCodeLength) {
                bArr[i10] = (byte) inputStream.read();
            }
        }
        String str = "";
        for (int i11 = 0; i11 < this.maxCodeLength; i11++) {
            StringBuilder k10 = a.k(str);
            k10.append(String.format("0x%02X (%04o) ", Byte.valueOf(bArr[i11]), Byte.valueOf(bArr[i11])));
            str = k10.toString();
        }
        if (inputStream.markSupported()) {
            inputStream.reset();
        }
        return toInt(bArr, this.minCodeLength);
    }

    public void setName(String str) {
        this.cmapName = str;
    }

    public void setOrdering(String str) {
        this.ordering = str;
    }

    public void setRegistry(String str) {
        this.registry = str;
    }

    public void setSupplement(int i10) {
        this.supplement = i10;
    }

    public void setType(int i10) {
        this.cmapType = i10;
    }

    public void setVersion(String str) {
        this.cmapVersion = str;
    }

    public void setWMode(int i10) {
        this.wmode = i10;
    }

    public int toCID(int i10) {
        Integer num = this.codeToCid.get(Integer.valueOf(i10));
        if (num != null) {
            return num.intValue();
        }
        for (CIDRange cIDRange : this.codeToCidRanges) {
            int map = cIDRange.map((char) i10);
            if (map != -1) {
                return map;
            }
        }
        return 0;
    }

    public String toString() {
        return this.cmapName;
    }

    public String toUnicode(int i10) {
        return this.charToUnicode.get(Integer.valueOf(i10));
    }

    public void useCmap(CMap cMap) {
        for (CodespaceRange codespaceRange : cMap.codespaceRanges) {
            addCodespaceRange(codespaceRange);
        }
        this.charToUnicode.putAll(cMap.charToUnicode);
        this.codeToCid.putAll(cMap.codeToCid);
        this.codeToCidRanges.addAll(cMap.codeToCidRanges);
    }
}
