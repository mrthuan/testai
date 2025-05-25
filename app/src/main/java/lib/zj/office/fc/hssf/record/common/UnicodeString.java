package lib.zj.office.fc.hssf.record.common;

import a0.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.cont.ContinuableRecordInput;
import lib.zj.office.fc.hssf.record.cont.ContinuableRecordOutput;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;
import lib.zj.office.fc.util.POILogFactory;
import lib.zj.office.fc.util.POILogger;
import lib.zj.office.fc.util.StringUtil;

/* loaded from: classes3.dex */
public class UnicodeString implements Comparable<UnicodeString> {
    private short field_1_charCount;
    private byte field_2_optionflags;
    private String field_3_string;
    private List<FormatRun> field_4_format_runs;
    private ExtRst field_5_ext_rst;
    private static POILogger _logger = POILogFactory.getLogger(UnicodeString.class);
    private static final BitField highByte = BitFieldFactory.getInstance(1);
    private static final BitField extBit = BitFieldFactory.getInstance(4);
    private static final BitField richText = BitFieldFactory.getInstance(8);

    /* loaded from: classes3.dex */
    public static class ExtRst implements Comparable<ExtRst> {
        private byte[] extraData;
        private short formattingFontIndex;
        private short formattingOptions;
        private int numberOfRuns;
        private PhRun[] phRuns;
        private String phoneticText;
        private short reserved;

        public ExtRst() {
            populateEmpty();
        }

        private void populateEmpty() {
            this.reserved = (short) 1;
            this.phoneticText = "";
            this.phRuns = new PhRun[0];
            this.extraData = new byte[0];
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ExtRst) || compareTo((ExtRst) obj) != 0) {
                return false;
            }
            return true;
        }

        public int getDataSize() {
            return (this.phRuns.length * 6) + (this.phoneticText.length() * 2) + 10 + this.extraData.length;
        }

        public short getFormattingFontIndex() {
            return this.formattingFontIndex;
        }

        public short getFormattingOptions() {
            return this.formattingOptions;
        }

        public int getNumberOfRuns() {
            return this.numberOfRuns;
        }

        public PhRun[] getPhRuns() {
            return this.phRuns;
        }

        public String getPhoneticText() {
            return this.phoneticText;
        }

        public void serialize(ContinuableRecordOutput continuableRecordOutput) {
            int dataSize = getDataSize();
            continuableRecordOutput.writeContinueIfRequired(8);
            continuableRecordOutput.writeShort(this.reserved);
            continuableRecordOutput.writeShort(dataSize);
            continuableRecordOutput.writeShort(this.formattingFontIndex);
            continuableRecordOutput.writeShort(this.formattingOptions);
            continuableRecordOutput.writeContinueIfRequired(6);
            continuableRecordOutput.writeShort(this.numberOfRuns);
            continuableRecordOutput.writeShort(this.phoneticText.length());
            continuableRecordOutput.writeShort(this.phoneticText.length());
            continuableRecordOutput.writeContinueIfRequired(this.phoneticText.length() * 2);
            StringUtil.putUnicodeLE(this.phoneticText, continuableRecordOutput);
            int i10 = 0;
            while (true) {
                PhRun[] phRunArr = this.phRuns;
                if (i10 < phRunArr.length) {
                    phRunArr[i10].serialize(continuableRecordOutput);
                    i10++;
                } else {
                    continuableRecordOutput.write(this.extraData);
                    return;
                }
            }
        }

        public ExtRst clone() {
            ExtRst extRst = new ExtRst();
            extRst.reserved = this.reserved;
            extRst.formattingFontIndex = this.formattingFontIndex;
            extRst.formattingOptions = this.formattingOptions;
            extRst.numberOfRuns = this.numberOfRuns;
            extRst.phoneticText = this.phoneticText;
            extRst.phRuns = new PhRun[this.phRuns.length];
            int i10 = 0;
            while (true) {
                PhRun[] phRunArr = extRst.phRuns;
                if (i10 >= phRunArr.length) {
                    return extRst;
                }
                phRunArr[i10] = new PhRun(this.phRuns[i10].phoneticTextFirstCharacterOffset, this.phRuns[i10].realTextFirstCharacterOffset, this.phRuns[i10].realTextLength);
                i10++;
            }
        }

        @Override // java.lang.Comparable
        public int compareTo(ExtRst extRst) {
            int i10 = this.reserved - extRst.reserved;
            if (i10 != 0) {
                return i10;
            }
            int i11 = this.formattingFontIndex - extRst.formattingFontIndex;
            if (i11 != 0) {
                return i11;
            }
            int i12 = this.formattingOptions - extRst.formattingOptions;
            if (i12 != 0) {
                return i12;
            }
            int i13 = this.numberOfRuns - extRst.numberOfRuns;
            if (i13 != 0) {
                return i13;
            }
            int compareTo = this.phoneticText.compareTo(extRst.phoneticText);
            if (compareTo != 0) {
                return compareTo;
            }
            int length = this.phRuns.length - extRst.phRuns.length;
            if (length != 0) {
                return length;
            }
            int i14 = 0;
            while (true) {
                PhRun[] phRunArr = this.phRuns;
                if (i14 < phRunArr.length) {
                    int i15 = phRunArr[i14].phoneticTextFirstCharacterOffset - extRst.phRuns[i14].phoneticTextFirstCharacterOffset;
                    if (i15 != 0) {
                        return i15;
                    }
                    int i16 = this.phRuns[i14].realTextFirstCharacterOffset - extRst.phRuns[i14].realTextFirstCharacterOffset;
                    if (i16 != 0) {
                        return i16;
                    }
                    int i17 = this.phRuns[i14].realTextFirstCharacterOffset - extRst.phRuns[i14].realTextLength;
                    if (i17 != 0) {
                        return i17;
                    }
                    i14++;
                } else {
                    int length2 = this.extraData.length - extRst.extraData.length;
                    if (length2 != 0) {
                        return length2;
                    }
                    return 0;
                }
            }
        }

        public ExtRst(LittleEndianInput littleEndianInput, int i10) {
            short readShort = littleEndianInput.readShort();
            this.reserved = readShort;
            if (readShort == -1) {
                populateEmpty();
                return;
            }
            int i11 = 0;
            if (readShort != 1) {
                UnicodeString._logger.log(POILogger.WARN, "Warning - ExtRst has wrong magic marker, expecting 1 but found " + ((int) this.reserved) + " - ignoring");
                while (i11 < i10 - 2) {
                    littleEndianInput.readByte();
                    i11++;
                }
                populateEmpty();
                return;
            }
            short readShort2 = littleEndianInput.readShort();
            this.formattingFontIndex = littleEndianInput.readShort();
            this.formattingOptions = littleEndianInput.readShort();
            this.numberOfRuns = littleEndianInput.readUShort();
            short readShort3 = littleEndianInput.readShort();
            short readShort4 = littleEndianInput.readShort();
            if (readShort3 == 0 && readShort4 > 0) {
                readShort4 = 0;
            }
            if (readShort3 == readShort4) {
                String readUnicodeLE = StringUtil.readUnicodeLE(littleEndianInput, readShort3);
                this.phoneticText = readUnicodeLE;
                int length = ((readShort2 - 4) - 6) - (readUnicodeLE.length() * 2);
                int i12 = length / 6;
                this.phRuns = new PhRun[i12];
                int i13 = 0;
                while (true) {
                    PhRun[] phRunArr = this.phRuns;
                    if (i13 >= phRunArr.length) {
                        break;
                    }
                    phRunArr[i13] = new PhRun(littleEndianInput, 0);
                    i13++;
                }
                int i14 = length - (i12 * 6);
                if (i14 < 0) {
                    System.err.println("Warning - ExtRst overran by " + (0 - i14) + " bytes");
                    i14 = 0;
                }
                this.extraData = new byte[i14];
                while (true) {
                    byte[] bArr = this.extraData;
                    if (i11 >= bArr.length) {
                        return;
                    }
                    bArr[i11] = littleEndianInput.readByte();
                    i11++;
                }
            } else {
                throw new IllegalStateException(d.b("The two length fields of the Phonetic Text don't agree! ", readShort3, " vs ", readShort4));
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class FormatRun implements Comparable<FormatRun> {
        final short _character;
        short _fontIndex;

        public FormatRun(short s4, short s10) {
            this._character = s4;
            this._fontIndex = s10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof FormatRun)) {
                return false;
            }
            FormatRun formatRun = (FormatRun) obj;
            if (this._character != formatRun._character || this._fontIndex != formatRun._fontIndex) {
                return false;
            }
            return true;
        }

        public short getCharacterPos() {
            return this._character;
        }

        public short getFontIndex() {
            return this._fontIndex;
        }

        public void serialize(LittleEndianOutput littleEndianOutput) {
            littleEndianOutput.writeShort(this._character);
            littleEndianOutput.writeShort(this._fontIndex);
        }

        public String toString() {
            return "character=" + ((int) this._character) + ",fontIndex=" + ((int) this._fontIndex);
        }

        @Override // java.lang.Comparable
        public int compareTo(FormatRun formatRun) {
            short s4 = this._character;
            short s10 = formatRun._character;
            if (s4 == s10 && this._fontIndex == formatRun._fontIndex) {
                return 0;
            }
            return s4 == s10 ? this._fontIndex - formatRun._fontIndex : s4 - s10;
        }

        public FormatRun(LittleEndianInput littleEndianInput) {
            this(littleEndianInput.readShort(), littleEndianInput.readShort());
        }
    }

    /* loaded from: classes3.dex */
    public static class PhRun {
        private int phoneticTextFirstCharacterOffset;
        private int realTextFirstCharacterOffset;
        private int realTextLength;

        public /* synthetic */ PhRun(LittleEndianInput littleEndianInput, int i10) {
            this(littleEndianInput);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void serialize(ContinuableRecordOutput continuableRecordOutput) {
            continuableRecordOutput.writeContinueIfRequired(6);
            continuableRecordOutput.writeShort(this.phoneticTextFirstCharacterOffset);
            continuableRecordOutput.writeShort(this.realTextFirstCharacterOffset);
            continuableRecordOutput.writeShort(this.realTextLength);
        }

        public PhRun(int i10, int i11, int i12) {
            this.phoneticTextFirstCharacterOffset = i10;
            this.realTextFirstCharacterOffset = i11;
            this.realTextLength = i12;
        }

        private PhRun(LittleEndianInput littleEndianInput) {
            this.phoneticTextFirstCharacterOffset = littleEndianInput.readUShort();
            this.realTextFirstCharacterOffset = littleEndianInput.readUShort();
            this.realTextLength = littleEndianInput.readUShort();
        }
    }

    private UnicodeString() {
    }

    private int findFormatRunAt(int i10) {
        int size = this.field_4_format_runs.size();
        for (int i11 = 0; i11 < size; i11++) {
            short s4 = this.field_4_format_runs.get(i11)._character;
            if (s4 == i10) {
                return i11;
            }
            if (s4 > i10) {
                return -1;
            }
        }
        return -1;
    }

    private boolean isExtendedText() {
        return extBit.isSet(getOptionFlags());
    }

    private boolean isRichText() {
        return richText.isSet(getOptionFlags());
    }

    public void addFormatRun(FormatRun formatRun) {
        if (this.field_4_format_runs == null) {
            this.field_4_format_runs = new ArrayList();
        }
        int findFormatRunAt = findFormatRunAt(formatRun._character);
        if (findFormatRunAt != -1) {
            this.field_4_format_runs.remove(findFormatRunAt);
        }
        this.field_4_format_runs.add(formatRun);
        Collections.sort(this.field_4_format_runs);
        this.field_2_optionflags = richText.setByte(this.field_2_optionflags);
    }

    public void clearFormatting() {
        this.field_4_format_runs = null;
        this.field_2_optionflags = richText.clearByte(this.field_2_optionflags);
    }

    public Object clone() {
        UnicodeString unicodeString = new UnicodeString();
        unicodeString.field_1_charCount = this.field_1_charCount;
        unicodeString.field_2_optionflags = this.field_2_optionflags;
        unicodeString.field_3_string = this.field_3_string;
        if (this.field_4_format_runs != null) {
            unicodeString.field_4_format_runs = new ArrayList();
            for (FormatRun formatRun : this.field_4_format_runs) {
                unicodeString.field_4_format_runs.add(new FormatRun(formatRun._character, formatRun._fontIndex));
            }
        }
        ExtRst extRst = this.field_5_ext_rst;
        if (extRst != null) {
            unicodeString.field_5_ext_rst = extRst.clone();
        }
        return unicodeString;
    }

    public boolean equals(Object obj) {
        boolean z10;
        int size;
        ExtRst extRst;
        if (!(obj instanceof UnicodeString)) {
            return false;
        }
        UnicodeString unicodeString = (UnicodeString) obj;
        if (this.field_1_charCount == unicodeString.field_1_charCount && this.field_2_optionflags == unicodeString.field_2_optionflags && this.field_3_string.equals(unicodeString.field_3_string)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        List<FormatRun> list = this.field_4_format_runs;
        if (list == null && unicodeString.field_4_format_runs == null) {
            return true;
        }
        if ((list == null && unicodeString.field_4_format_runs != null) || ((list != null && unicodeString.field_4_format_runs == null) || (size = list.size()) != unicodeString.field_4_format_runs.size())) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.field_4_format_runs.get(i10).equals(unicodeString.field_4_format_runs.get(i10))) {
                return false;
            }
        }
        ExtRst extRst2 = this.field_5_ext_rst;
        if ((extRst2 != null || unicodeString.field_5_ext_rst != null) && (extRst2 == null || (extRst = unicodeString.field_5_ext_rst) == null || extRst2.compareTo(extRst) != 0)) {
            return false;
        }
        return true;
    }

    public Iterator<FormatRun> formatIterator() {
        List<FormatRun> list = this.field_4_format_runs;
        if (list != null) {
            return list.iterator();
        }
        return null;
    }

    public int getCharCount() {
        short s4 = this.field_1_charCount;
        if (s4 < 0) {
            return s4 + 65536;
        }
        return s4;
    }

    public short getCharCountShort() {
        return this.field_1_charCount;
    }

    public String getDebugInfo() {
        StringBuffer stringBuffer = new StringBuffer("[UNICODESTRING]\n    .charcount       = ");
        stringBuffer.append(Integer.toHexString(getCharCount()));
        stringBuffer.append("\n    .optionflags     = ");
        stringBuffer.append(Integer.toHexString(getOptionFlags()));
        stringBuffer.append("\n    .string          = ");
        stringBuffer.append(getString());
        stringBuffer.append("\n");
        if (this.field_4_format_runs != null) {
            for (int i10 = 0; i10 < this.field_4_format_runs.size(); i10++) {
                stringBuffer.append("      .format_run" + i10 + "          = ");
                stringBuffer.append(this.field_4_format_runs.get(i10).toString());
                stringBuffer.append("\n");
            }
        }
        if (this.field_5_ext_rst != null) {
            stringBuffer.append("    .field_5_ext_rst          = \n");
            stringBuffer.append(this.field_5_ext_rst.toString());
            stringBuffer.append("\n");
        }
        stringBuffer.append("[/UNICODESTRING]\n");
        return stringBuffer.toString();
    }

    public ExtRst getExtendedRst() {
        return this.field_5_ext_rst;
    }

    public FormatRun getFormatRun(int i10) {
        List<FormatRun> list = this.field_4_format_runs;
        if (list == null || i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return this.field_4_format_runs.get(i10);
    }

    public int getFormatRunCount() {
        List<FormatRun> list = this.field_4_format_runs;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public byte getOptionFlags() {
        return this.field_2_optionflags;
    }

    public String getString() {
        return this.field_3_string;
    }

    public int hashCode() {
        int i10;
        String str = this.field_3_string;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return this.field_1_charCount + i10;
    }

    public void removeFormatRun(FormatRun formatRun) {
        this.field_4_format_runs.remove(formatRun);
        if (this.field_4_format_runs.size() == 0) {
            this.field_4_format_runs = null;
            this.field_2_optionflags = richText.clearByte(this.field_2_optionflags);
        }
    }

    public void serialize(ContinuableRecordOutput continuableRecordOutput) {
        int i10;
        int i11;
        ExtRst extRst;
        List<FormatRun> list;
        if (isRichText() && (list = this.field_4_format_runs) != null) {
            i10 = list.size();
        } else {
            i10 = 0;
        }
        if (isExtendedText() && (extRst = this.field_5_ext_rst) != null) {
            i11 = extRst.getDataSize() + 4;
        } else {
            i11 = 0;
        }
        continuableRecordOutput.writeString(this.field_3_string, i10, i11);
        if (i10 > 0) {
            for (int i12 = 0; i12 < i10; i12++) {
                if (continuableRecordOutput.getAvailableSpace() < 4) {
                    continuableRecordOutput.writeContinue();
                }
                this.field_4_format_runs.get(i12).serialize(continuableRecordOutput);
            }
        }
        if (i11 > 0) {
            this.field_5_ext_rst.serialize(continuableRecordOutput);
        }
    }

    public void setCharCount(short s4) {
        this.field_1_charCount = s4;
    }

    public void setExtendedRst(ExtRst extRst) {
        if (extRst != null) {
            this.field_2_optionflags = extBit.setByte(this.field_2_optionflags);
        } else {
            this.field_2_optionflags = extBit.clearByte(this.field_2_optionflags);
        }
        this.field_5_ext_rst = extRst;
    }

    public void setOptionFlags(byte b10) {
        this.field_2_optionflags = b10;
    }

    public void setString(String str) {
        this.field_3_string = str;
        setCharCount((short) str.length());
        int length = str.length();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            } else if (str.charAt(i10) > 255) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            this.field_2_optionflags = highByte.setByte(this.field_2_optionflags);
        } else {
            this.field_2_optionflags = highByte.clearByte(this.field_2_optionflags);
        }
    }

    public void swapFontUse(short s4, short s10) {
        for (FormatRun formatRun : this.field_4_format_runs) {
            if (formatRun._fontIndex == s4) {
                formatRun._fontIndex = s10;
            }
        }
    }

    public String toString() {
        return getString();
    }

    public UnicodeString(String str) {
        setString(str);
    }

    @Override // java.lang.Comparable
    public int compareTo(UnicodeString unicodeString) {
        int compareTo = getString().compareTo(unicodeString.getString());
        if (compareTo != 0) {
            return compareTo;
        }
        List<FormatRun> list = this.field_4_format_runs;
        if (list == null && unicodeString.field_4_format_runs == null) {
            return 0;
        }
        if (list != null || unicodeString.field_4_format_runs == null) {
            if (list == null || unicodeString.field_4_format_runs != null) {
                int size = list.size();
                if (size != unicodeString.field_4_format_runs.size()) {
                    return size - unicodeString.field_4_format_runs.size();
                }
                for (int i10 = 0; i10 < size; i10++) {
                    int compareTo2 = this.field_4_format_runs.get(i10).compareTo(unicodeString.field_4_format_runs.get(i10));
                    if (compareTo2 != 0) {
                        return compareTo2;
                    }
                }
                ExtRst extRst = this.field_5_ext_rst;
                if (extRst == null && unicodeString.field_5_ext_rst == null) {
                    return 0;
                }
                if (extRst != null || unicodeString.field_5_ext_rst == null) {
                    if (extRst == null || unicodeString.field_5_ext_rst != null) {
                        int compareTo3 = extRst.compareTo(unicodeString.field_5_ext_rst);
                        if (compareTo3 != 0) {
                            return compareTo3;
                        }
                        return 0;
                    }
                    return -1;
                }
                return 1;
            }
            return -1;
        }
        return 1;
    }

    public UnicodeString(RecordInputStream recordInputStream) {
        this.field_1_charCount = recordInputStream.readShort();
        this.field_2_optionflags = recordInputStream.readByte();
        short readShort = isRichText() ? recordInputStream.readShort() : (short) 0;
        int readInt = isExtendedText() ? recordInputStream.readInt() : 0;
        if ((this.field_2_optionflags & 1) == 0) {
            this.field_3_string = recordInputStream.readCompressedUnicode(getCharCount());
        } else {
            this.field_3_string = recordInputStream.readUnicodeLEString(getCharCount());
        }
        if (isRichText() && readShort > 0) {
            this.field_4_format_runs = new ArrayList(readShort);
            for (int i10 = 0; i10 < readShort; i10++) {
                this.field_4_format_runs.add(new FormatRun(recordInputStream));
            }
        }
        if (!isExtendedText() || readInt <= 0) {
            return;
        }
        ExtRst extRst = new ExtRst(new ContinuableRecordInput(recordInputStream), readInt);
        this.field_5_ext_rst = extRst;
        if (extRst.getDataSize() + 4 != readInt) {
            POILogger pOILogger = _logger;
            int i11 = POILogger.WARN;
            StringBuilder e10 = androidx.appcompat.view.menu.d.e("ExtRst was supposed to be ", readInt, " bytes long, but seems to actually be ");
            e10.append(this.field_5_ext_rst.getDataSize() + 4);
            pOILogger.log(i11, e10.toString());
        }
    }
}
