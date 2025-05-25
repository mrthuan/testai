package lib.zj.office.fc.hssf.record;

import java.io.PrintStream;
import lib.zj.office.fc.util.IntMapper;

/* loaded from: classes3.dex */
class SSTDeserializer {
    private IntMapper<lib.zj.office.fc.hssf.record.common.UnicodeString> strings;

    public SSTDeserializer(IntMapper<lib.zj.office.fc.hssf.record.common.UnicodeString> intMapper) {
        this.strings = intMapper;
    }

    public static void addToStringTable(IntMapper<lib.zj.office.fc.hssf.record.common.UnicodeString> intMapper, lib.zj.office.fc.hssf.record.common.UnicodeString unicodeString) {
        intMapper.add(unicodeString);
    }

    public void manufactureStrings(int i10, RecordInputStream recordInputStream) {
        lib.zj.office.fc.hssf.record.common.UnicodeString unicodeString;
        for (int i11 = 0; i11 < i10; i11++) {
            if (recordInputStream.available() == 0 && !recordInputStream.hasNextRecord()) {
                PrintStream printStream = System.err;
                printStream.println("Ran out of data before creating all the strings! String at index " + i11 + "");
                unicodeString = new lib.zj.office.fc.hssf.record.common.UnicodeString("");
            } else {
                unicodeString = new lib.zj.office.fc.hssf.record.common.UnicodeString(recordInputStream);
            }
            addToStringTable(this.strings, unicodeString);
        }
    }
}
