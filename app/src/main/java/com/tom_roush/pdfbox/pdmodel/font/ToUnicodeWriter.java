package com.tom_roush.pdfbox.pdmodel.font;

import a6.h;
import com.tom_roush.pdfbox.util.Charsets;
import com.tom_roush.pdfbox.util.Hex;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
final class ToUnicodeWriter {
    static final int MAX_ENTRIES_PER_OPERATOR = 100;
    private final Map<Integer, String> cidToUnicode = new TreeMap();
    private int wMode = 0;

    private void writeLine(BufferedWriter bufferedWriter, String str) {
        bufferedWriter.write(str);
        bufferedWriter.write(10);
    }

    public void add(int i10, String str) {
        if (i10 >= 0 && i10 <= 65535) {
            if (str != null && !str.isEmpty()) {
                this.cidToUnicode.put(Integer.valueOf(i10), str);
                return;
            }
            throw new IllegalArgumentException("Text is null or empty");
        }
        throw new IllegalArgumentException("CID is not valid");
    }

    public void setWMode(int i10) {
        this.wMode = i10;
    }

    public void writeTo(OutputStream outputStream) {
        int i10;
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, Charsets.US_ASCII));
        writeLine(bufferedWriter, "/CIDInit /ProcSet findresource begin");
        writeLine(bufferedWriter, "12 dict begin\n");
        writeLine(bufferedWriter, "begincmap");
        writeLine(bufferedWriter, "/CIDSystemInfo");
        writeLine(bufferedWriter, "<< /Registry (Adobe)");
        writeLine(bufferedWriter, "/Ordering (UCS)");
        writeLine(bufferedWriter, "/Supplement 0");
        writeLine(bufferedWriter, ">> def\n");
        writeLine(bufferedWriter, "/CMapName /Adobe-Identity-UCS def");
        writeLine(bufferedWriter, "/CMapType 2 def\n");
        if (this.wMode != 0) {
            writeLine(bufferedWriter, h.g(new StringBuilder("/WMode /"), this.wMode, " def"));
        }
        writeLine(bufferedWriter, "1 begincodespacerange");
        writeLine(bufferedWriter, "<0000> <FFFF>");
        writeLine(bufferedWriter, "endcodespacerange\n");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i11 = -1;
        String str = null;
        int i12 = -1;
        for (Map.Entry<Integer, String> entry : this.cidToUnicode.entrySet()) {
            int intValue = entry.getKey().intValue();
            String value = entry.getValue();
            if (intValue == i11 + 1 && str.codePointCount(0, str.length()) == 1 && value.codePointAt(0) == str.codePointAt(0) + 1 && str.codePointAt(0) + 1 <= 255 - (intValue - i12)) {
                arrayList2.set(arrayList2.size() - 1, Integer.valueOf(intValue));
            } else {
                arrayList.add(Integer.valueOf(intValue));
                arrayList2.add(Integer.valueOf(intValue));
                arrayList3.add(value);
                i12 = intValue;
            }
            str = value;
            i11 = intValue;
        }
        int ceil = (int) Math.ceil(arrayList.size() / 100.0d);
        for (int i13 = 0; i13 < ceil; i13++) {
            if (i13 == ceil - 1) {
                i10 = arrayList.size() - (i13 * 100);
            } else {
                i10 = 100;
            }
            bufferedWriter.write(i10 + " beginbfrange\n");
            for (int i14 = 0; i14 < i10; i14++) {
                int i15 = (i13 * 100) + i14;
                bufferedWriter.write(60);
                bufferedWriter.write(Hex.getChars(((Integer) arrayList.get(i15)).shortValue()));
                bufferedWriter.write("> ");
                bufferedWriter.write(60);
                bufferedWriter.write(Hex.getChars(((Integer) arrayList2.get(i15)).shortValue()));
                bufferedWriter.write("> ");
                bufferedWriter.write(60);
                bufferedWriter.write(Hex.getCharsUTF16BE((String) arrayList3.get(i15)));
                bufferedWriter.write(">\n");
            }
            writeLine(bufferedWriter, "endbfrange\n");
        }
        writeLine(bufferedWriter, "endcmap");
        writeLine(bufferedWriter, "CMapName currentdict /CMap defineresource pop");
        writeLine(bufferedWriter, "end");
        writeLine(bufferedWriter, "end");
        bufferedWriter.flush();
    }
}
