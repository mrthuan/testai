package lib.zj.office.fc.hssf.record;

import androidx.activity.r;
import b.a;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import lib.zj.office.fc.ss.util.HSSFCellRangeAddress;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.HexRead;
import lib.zj.office.fc.util.LittleEndianByteArrayInputStream;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;
import lib.zj.office.fc.util.POILogFactory;
import lib.zj.office.fc.util.POILogger;
import lib.zj.office.fc.util.StringUtil;

/* loaded from: classes3.dex */
public final class HyperlinkRecord extends StandardRecord {
    private static final byte[] FILE_TAIL;
    static final int HLINK_ABS = 2;
    static final int HLINK_LABEL = 20;
    static final int HLINK_PLACE = 8;
    private static final int HLINK_TARGET_FRAME = 128;
    private static final int HLINK_UNC_PATH = 256;
    static final int HLINK_URL = 1;
    private static final int TAIL_SIZE;
    public static final short sid = 440;
    private String _address;
    private int _fileOpts;
    private GUID _guid;
    private String _label;
    private int _linkOpts;
    private GUID _moniker;
    private HSSFCellRangeAddress _range;
    private String _shortFilename;
    private String _targetFrame;
    private String _textMark;
    private byte[] _uninterpretedTail;
    private POILogger logger = POILogFactory.getLogger(HyperlinkRecord.class);
    static final GUID STD_MONIKER = GUID.parse("79EAC9D0-BAF9-11CE-8C82-00AA004BA90B");
    static final GUID URL_MONIKER = GUID.parse("79EAC9E0-BAF9-11CE-8C82-00AA004BA90B");
    static final GUID FILE_MONIKER = GUID.parse("00000303-0000-0000-C000-000000000046");
    private static final byte[] URL_TAIL = HexRead.readFromString("79 58 81 F4  3B 1D 7F 48   AF 2C 82 5D  C4 85 27 63   00 00 00 00  A5 AB 00 00");

    /* loaded from: classes3.dex */
    public static final class GUID {
        public static final int ENCODED_SIZE = 16;
        private static final int TEXT_FORMAT_LENGTH = 36;
        private final int _d1;
        private final int _d2;
        private final int _d3;
        private final long _d4;

        public GUID(LittleEndianInput littleEndianInput) {
            this(littleEndianInput.readInt(), littleEndianInput.readUShort(), littleEndianInput.readUShort(), littleEndianInput.readLong());
        }

        public static GUID parse(String str) {
            char[] charArray = str.toCharArray();
            if (charArray.length == 36) {
                int parseShort = (parseShort(charArray, 0) << 16) + (parseShort(charArray, 4) << 0);
                int parseShort2 = parseShort(charArray, 9);
                int parseShort3 = parseShort(charArray, 14);
                for (int i10 = 23; i10 > 19; i10--) {
                    charArray[i10] = charArray[i10 - 1];
                }
                return new GUID(parseShort, parseShort2, parseShort3, parseLELong(charArray, 20));
            }
            throw new RecordFormatException("supplied text is the wrong length for a GUID");
        }

        private static int parseHexChar(char c) {
            if (c >= '0' && c <= '9') {
                return c - '0';
            }
            char c10 = 'A';
            if (c < 'A' || c > 'F') {
                c10 = 'a';
                if (c < 'a' || c > 'f') {
                    throw new RecordFormatException("Bad hex char '" + c + OperatorName.SHOW_TEXT_LINE);
                }
            }
            return (c - c10) + 10;
        }

        private static long parseLELong(char[] cArr, int i10) {
            long j10 = 0;
            for (int i11 = i10 + 14; i11 >= i10; i11 -= 2) {
                j10 = (((j10 << 4) + parseHexChar(cArr[i11 + 0])) << 4) + parseHexChar(cArr[i11 + 1]);
            }
            return j10;
        }

        private static int parseShort(char[] cArr, int i10) {
            int i11 = 0;
            for (int i12 = 0; i12 < 4; i12++) {
                i11 = (i11 << 4) + parseHexChar(cArr[i10 + i12]);
            }
            return i11;
        }

        public boolean equals(Object obj) {
            GUID guid = (GUID) obj;
            if (obj == null || !(obj instanceof GUID) || this._d1 != guid._d1 || this._d2 != guid._d2 || this._d3 != guid._d3 || this._d4 != guid._d4) {
                return false;
            }
            return true;
        }

        public String formatAsString() {
            StringBuilder sb2 = new StringBuilder(36);
            sb2.append(HexDump.intToHex(this._d1), 2, 8);
            sb2.append("-");
            sb2.append(HexDump.shortToHex(this._d2), 2, 4);
            sb2.append("-");
            sb2.append(HexDump.shortToHex(this._d3), 2, 4);
            sb2.append("-");
            char[] longToHex = HexDump.longToHex(getD4());
            sb2.append(longToHex, 2, 4);
            sb2.append("-");
            sb2.append(longToHex, 6, 12);
            return sb2.toString();
        }

        public int getD1() {
            return this._d1;
        }

        public int getD2() {
            return this._d2;
        }

        public int getD3() {
            return this._d3;
        }

        public long getD4() {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8);
            try {
                new DataOutputStream(byteArrayOutputStream).writeLong(this._d4);
                return new LittleEndianByteArrayInputStream(byteArrayOutputStream.toByteArray()).readLong();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }

        public void serialize(LittleEndianOutput littleEndianOutput) {
            littleEndianOutput.writeInt(this._d1);
            littleEndianOutput.writeShort(this._d2);
            littleEndianOutput.writeShort(this._d3);
            littleEndianOutput.writeLong(this._d4);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append(GUID.class.getName());
            sb2.append(" [");
            return r.g(sb2, formatAsString(), "]");
        }

        public GUID(int i10, int i11, int i12, long j10) {
            this._d1 = i10;
            this._d2 = i11;
            this._d3 = i12;
            this._d4 = j10;
        }
    }

    static {
        byte[] readFromString = HexRead.readFromString("FF FF AD DE  00 00 00 00   00 00 00 00  00 00 00 00   00 00 00 00  00 00 00 00");
        FILE_TAIL = readFromString;
        TAIL_SIZE = readFromString.length;
    }

    public HyperlinkRecord() {
    }

    private static String appendNullTerm(String str) {
        if (str == null) {
            return null;
        }
        return str.concat("\u0000");
    }

    private static String cleanString(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(0);
        if (indexOf < 0) {
            return str;
        }
        return str.substring(0, indexOf);
    }

    private static byte[] readTail(byte[] bArr, LittleEndianInput littleEndianInput) {
        byte[] bArr2 = new byte[TAIL_SIZE];
        littleEndianInput.readFully(bArr2);
        return bArr2;
    }

    private static void writeTail(byte[] bArr, LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.write(bArr);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        HyperlinkRecord hyperlinkRecord = new HyperlinkRecord();
        hyperlinkRecord._range = this._range.copy();
        hyperlinkRecord._guid = this._guid;
        hyperlinkRecord._linkOpts = this._linkOpts;
        hyperlinkRecord._fileOpts = this._fileOpts;
        hyperlinkRecord._label = this._label;
        hyperlinkRecord._address = this._address;
        hyperlinkRecord._moniker = this._moniker;
        hyperlinkRecord._shortFilename = this._shortFilename;
        hyperlinkRecord._targetFrame = this._targetFrame;
        hyperlinkRecord._textMark = this._textMark;
        hyperlinkRecord._uninterpretedTail = this._uninterpretedTail;
        return hyperlinkRecord;
    }

    public String getAddress() {
        if ((this._linkOpts & 1) != 0 && FILE_MONIKER.equals(this._moniker)) {
            String str = this._address;
            if (str == null) {
                str = this._shortFilename;
            }
            return cleanString(str);
        } else if ((this._linkOpts & 8) != 0) {
            return cleanString(this._textMark);
        } else {
            return cleanString(this._address);
        }
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        int i10;
        if ((this._linkOpts & 20) != 0) {
            i10 = (this._label.length() * 2) + 36;
        } else {
            i10 = 32;
        }
        if ((this._linkOpts & 128) != 0) {
            i10 = i10 + 4 + (this._targetFrame.length() * 2);
        }
        int i11 = this._linkOpts;
        if ((i11 & 1) != 0 && (i11 & 256) != 0) {
            i10 = i10 + 4 + (this._address.length() * 2);
        }
        int i12 = this._linkOpts;
        if ((i12 & 1) != 0 && (i12 & 256) == 0) {
            i10 += 16;
            if (URL_MONIKER.equals(this._moniker)) {
                i10 = i10 + 4 + (this._address.length() * 2);
                if (this._uninterpretedTail != null) {
                    i10 += TAIL_SIZE;
                }
            } else if (FILE_MONIKER.equals(this._moniker)) {
                i10 = this._shortFilename.length() + i10 + 2 + 4 + TAIL_SIZE + 4;
                String str = this._address;
                if (str != null) {
                    i10 = i10 + 6 + (str.length() * 2);
                }
            }
        }
        if ((this._linkOpts & 8) != 0) {
            return i10 + 4 + (this._textMark.length() * 2);
        }
        return i10;
    }

    public int getFileOptions() {
        return this._fileOpts;
    }

    public int getFirstColumn() {
        return this._range.getFirstColumn();
    }

    public int getFirstRow() {
        return this._range.getFirstRow();
    }

    public GUID getGuid() {
        return this._guid;
    }

    public String getLabel() {
        return cleanString(this._label);
    }

    public int getLabelOptions() {
        return 2;
    }

    public int getLastColumn() {
        return this._range.getLastColumn();
    }

    public int getLastRow() {
        return this._range.getLastRow();
    }

    public int getLinkOptions() {
        return this._linkOpts;
    }

    public GUID getMoniker() {
        return this._moniker;
    }

    public String getShortFilename() {
        return cleanString(this._shortFilename);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public String getTargetFrame() {
        return cleanString(this._targetFrame);
    }

    public String getTextMark() {
        return cleanString(this._textMark);
    }

    public boolean isDocumentLink() {
        if ((this._linkOpts & 8) > 0) {
            return true;
        }
        return false;
    }

    public boolean isFileLink() {
        int i10 = this._linkOpts;
        if ((i10 & 1) > 0 && (i10 & 2) == 0) {
            return true;
        }
        return false;
    }

    public boolean isUrlLink() {
        int i10 = this._linkOpts;
        if ((i10 & 1) > 0 && (i10 & 2) > 0) {
            return true;
        }
        return false;
    }

    public void newDocumentLink() {
        this._range = new HSSFCellRangeAddress(0, 0, 0, 0);
        this._guid = STD_MONIKER;
        this._linkOpts = 28;
        setLabel("");
        this._moniker = FILE_MONIKER;
        setAddress("");
        setTextMark("");
    }

    public void newFileLink() {
        this._range = new HSSFCellRangeAddress(0, 0, 0, 0);
        this._guid = STD_MONIKER;
        this._linkOpts = 21;
        this._fileOpts = 0;
        setLabel("");
        this._moniker = FILE_MONIKER;
        setAddress(null);
        setShortFilename("");
        this._uninterpretedTail = FILE_TAIL;
    }

    public void newUrlLink() {
        this._range = new HSSFCellRangeAddress(0, 0, 0, 0);
        this._guid = STD_MONIKER;
        this._linkOpts = 23;
        setLabel("");
        this._moniker = URL_MONIKER;
        setAddress("");
        this._uninterpretedTail = URL_TAIL;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        this._range.serialize(littleEndianOutput);
        this._guid.serialize(littleEndianOutput);
        littleEndianOutput.writeInt(2);
        littleEndianOutput.writeInt(this._linkOpts);
        if ((this._linkOpts & 20) != 0) {
            littleEndianOutput.writeInt(this._label.length());
            StringUtil.putUnicodeLE(this._label, littleEndianOutput);
        }
        if ((this._linkOpts & 128) != 0) {
            littleEndianOutput.writeInt(this._targetFrame.length());
            StringUtil.putUnicodeLE(this._targetFrame, littleEndianOutput);
        }
        int i10 = this._linkOpts;
        if ((i10 & 1) != 0 && (i10 & 256) != 0) {
            littleEndianOutput.writeInt(this._address.length());
            StringUtil.putUnicodeLE(this._address, littleEndianOutput);
        }
        int i11 = this._linkOpts;
        if ((i11 & 1) != 0 && (i11 & 256) == 0) {
            this._moniker.serialize(littleEndianOutput);
            if (URL_MONIKER.equals(this._moniker)) {
                if (this._uninterpretedTail == null) {
                    littleEndianOutput.writeInt(this._address.length() * 2);
                    StringUtil.putUnicodeLE(this._address, littleEndianOutput);
                } else {
                    littleEndianOutput.writeInt((this._address.length() * 2) + TAIL_SIZE);
                    StringUtil.putUnicodeLE(this._address, littleEndianOutput);
                    writeTail(this._uninterpretedTail, littleEndianOutput);
                }
            } else if (FILE_MONIKER.equals(this._moniker)) {
                littleEndianOutput.writeShort(this._fileOpts);
                littleEndianOutput.writeInt(this._shortFilename.length());
                StringUtil.putCompressedUnicode(this._shortFilename, littleEndianOutput);
                writeTail(this._uninterpretedTail, littleEndianOutput);
                String str = this._address;
                if (str == null) {
                    littleEndianOutput.writeInt(0);
                } else {
                    int length = str.length() * 2;
                    littleEndianOutput.writeInt(length + 6);
                    littleEndianOutput.writeInt(length);
                    littleEndianOutput.writeShort(3);
                    StringUtil.putUnicodeLE(this._address, littleEndianOutput);
                }
            }
        }
        if ((this._linkOpts & 8) != 0) {
            littleEndianOutput.writeInt(this._textMark.length());
            StringUtil.putUnicodeLE(this._textMark, littleEndianOutput);
        }
    }

    public void setAddress(String str) {
        if ((this._linkOpts & 1) != 0 && FILE_MONIKER.equals(this._moniker)) {
            this._shortFilename = appendNullTerm(str);
        } else if ((this._linkOpts & 8) != 0) {
            this._textMark = appendNullTerm(str);
        } else {
            this._address = appendNullTerm(str);
        }
    }

    public void setFirstColumn(int i10) {
        this._range.setFirstColumn(i10);
    }

    public void setFirstRow(int i10) {
        this._range.setFirstRow(i10);
    }

    public void setLabel(String str) {
        this._label = appendNullTerm(str);
    }

    public void setLastColumn(int i10) {
        this._range.setLastColumn(i10);
    }

    public void setLastRow(int i10) {
        this._range.setLastRow(i10);
    }

    public void setShortFilename(String str) {
        this._shortFilename = appendNullTerm(str);
    }

    public void setTextMark(String str) {
        this._textMark = appendNullTerm(str);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[HYPERLINK RECORD]\n    .range   = ");
        stringBuffer.append(this._range.formatAsString());
        stringBuffer.append("\n    .guid    = ");
        stringBuffer.append(this._guid.formatAsString());
        stringBuffer.append("\n    .linkOpts= ");
        stringBuffer.append(HexDump.intToHex(this._linkOpts));
        stringBuffer.append("\n    .label   = ");
        stringBuffer.append(getLabel());
        stringBuffer.append("\n");
        if ((this._linkOpts & 128) != 0) {
            stringBuffer.append("    .targetFrame= ");
            stringBuffer.append(getTargetFrame());
            stringBuffer.append("\n");
        }
        if ((this._linkOpts & 1) != 0 && this._moniker != null) {
            stringBuffer.append("    .moniker   = ");
            stringBuffer.append(this._moniker.formatAsString());
            stringBuffer.append("\n");
        }
        if ((this._linkOpts & 8) != 0) {
            stringBuffer.append("    .textMark= ");
            stringBuffer.append(getTextMark());
            stringBuffer.append("\n");
        }
        stringBuffer.append("    .address   = ");
        stringBuffer.append(getAddress());
        stringBuffer.append("\n[/HYPERLINK RECORD]\n");
        return stringBuffer.toString();
    }

    public HyperlinkRecord(RecordInputStream recordInputStream) {
        this._range = new HSSFCellRangeAddress(recordInputStream);
        this._guid = new GUID(recordInputStream);
        int readInt = recordInputStream.readInt();
        if (readInt == 2) {
            int readInt2 = recordInputStream.readInt();
            this._linkOpts = readInt2;
            if ((readInt2 & 20) != 0) {
                this._label = recordInputStream.readUnicodeLEString(recordInputStream.readInt());
            }
            if ((this._linkOpts & 128) != 0) {
                this._targetFrame = recordInputStream.readUnicodeLEString(recordInputStream.readInt());
            }
            int i10 = this._linkOpts;
            if ((i10 & 1) != 0 && (i10 & 256) != 0) {
                this._moniker = null;
                this._address = recordInputStream.readUnicodeLEString(recordInputStream.readInt());
            }
            int i11 = this._linkOpts;
            if ((i11 & 1) != 0 && (i11 & 256) == 0) {
                GUID guid = new GUID(recordInputStream);
                this._moniker = guid;
                if (URL_MONIKER.equals(guid)) {
                    int readInt3 = recordInputStream.readInt();
                    if (readInt3 == recordInputStream.remaining()) {
                        this._address = recordInputStream.readUnicodeLEString(readInt3 / 2);
                    } else {
                        this._address = recordInputStream.readUnicodeLEString((readInt3 - TAIL_SIZE) / 2);
                        this._uninterpretedTail = readTail(URL_TAIL, recordInputStream);
                    }
                } else if (FILE_MONIKER.equals(this._moniker)) {
                    this._fileOpts = recordInputStream.readShort();
                    this._shortFilename = StringUtil.readCompressedUnicode(recordInputStream, recordInputStream.readInt());
                    this._uninterpretedTail = readTail(FILE_TAIL, recordInputStream);
                    if (recordInputStream.readInt() > 0) {
                        int readInt4 = recordInputStream.readInt();
                        int readUShort = recordInputStream.readUShort();
                        if (readUShort == 3) {
                            this._address = StringUtil.readUnicodeLE(recordInputStream, readInt4 / 2);
                        } else {
                            throw new RecordFormatException(a.c("Expected 0x3 but found ", readUShort));
                        }
                    } else {
                        this._address = null;
                    }
                } else if (STD_MONIKER.equals(this._moniker)) {
                    this._fileOpts = recordInputStream.readShort();
                    byte[] bArr = new byte[recordInputStream.readInt()];
                    recordInputStream.readFully(bArr);
                    this._address = new String(bArr);
                }
            }
            if ((this._linkOpts & 8) != 0) {
                this._textMark = recordInputStream.readUnicodeLEString(recordInputStream.readInt());
            }
            if (recordInputStream.remaining() > 0) {
                POILogger pOILogger = this.logger;
                int i12 = POILogger.WARN;
                pOILogger.log(i12, "Hyperlink data remains: " + recordInputStream.remaining() + " : " + HexDump.toHex(recordInputStream.readRemainder()));
                return;
            }
            return;
        }
        throw new RecordFormatException(a.c("Stream Version must be 0x2 but found ", readInt));
    }
}
