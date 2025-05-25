package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;
import lib.zj.office.fc.util.StringUtil;

/* loaded from: classes3.dex */
public abstract class HeaderFooterBase extends StandardRecord {
    private boolean field_2_hasMultibyte;
    private String field_3_text;

    public HeaderFooterBase(String str) {
        setText(str);
    }

    private int getTextLength() {
        return this.field_3_text.length();
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public final int getDataSize() {
        int i10 = 1;
        if (getTextLength() < 1) {
            return 0;
        }
        int textLength = getTextLength();
        if (this.field_2_hasMultibyte) {
            i10 = 2;
        }
        return (textLength * i10) + 3;
    }

    public final String getText() {
        return this.field_3_text;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public final void serialize(LittleEndianOutput littleEndianOutput) {
        if (getTextLength() > 0) {
            littleEndianOutput.writeShort(getTextLength());
            littleEndianOutput.writeByte(this.field_2_hasMultibyte ? 1 : 0);
            if (this.field_2_hasMultibyte) {
                StringUtil.putUnicodeLE(this.field_3_text, littleEndianOutput);
            } else {
                StringUtil.putCompressedUnicode(this.field_3_text, littleEndianOutput);
            }
        }
    }

    public final void setText(String str) {
        if (str != null) {
            this.field_2_hasMultibyte = StringUtil.hasMultibyte(str);
            this.field_3_text = str;
            if (getDataSize() <= 8224) {
                return;
            }
            throw new IllegalArgumentException("Header/Footer string too long (limit is 8224 bytes)");
        }
        throw new IllegalArgumentException("text must not be null");
    }

    public HeaderFooterBase(RecordInputStream recordInputStream) {
        if (recordInputStream.remaining() > 0) {
            short readShort = recordInputStream.readShort();
            boolean z10 = recordInputStream.readByte() != 0;
            this.field_2_hasMultibyte = z10;
            if (z10) {
                this.field_3_text = recordInputStream.readUnicodeLEString(readShort);
                return;
            } else {
                this.field_3_text = recordInputStream.readCompressedUnicode(readShort);
                return;
            }
        }
        this.field_3_text = "";
    }
}
