package com.tom_roush.fontbox.ttf;

/* loaded from: classes2.dex */
public class NameRecord {
    public static final int ENCODING_MACINTOSH_ROMAN = 0;
    public static final int ENCODING_UNICODE_1_0 = 0;
    public static final int ENCODING_UNICODE_1_1 = 1;
    public static final int ENCODING_UNICODE_2_0_BMP = 3;
    public static final int ENCODING_UNICODE_2_0_FULL = 4;
    public static final int ENCODING_WINDOWS_SYMBOL = 0;
    public static final int ENCODING_WINDOWS_UNICODE_BMP = 1;
    public static final int ENCODING_WINDOWS_UNICODE_UCS4 = 10;
    public static final int LANGUAGE_MACINTOSH_ENGLISH = 0;
    public static final int LANGUAGE_UNICODE = 0;
    public static final int LANGUAGE_WINDOWS_EN_US = 1033;
    @Deprecated
    public static final int LANGUGAE_MACINTOSH_ENGLISH = 0;
    @Deprecated
    public static final int LANGUGAE_UNICODE = 0;
    @Deprecated
    public static final int LANGUGAE_WINDOWS_EN_US = 1033;
    public static final int NAME_COPYRIGHT = 0;
    public static final int NAME_FONT_FAMILY_NAME = 1;
    public static final int NAME_FONT_SUB_FAMILY_NAME = 2;
    public static final int NAME_FULL_FONT_NAME = 4;
    public static final int NAME_POSTSCRIPT_NAME = 6;
    public static final int NAME_TRADEMARK = 7;
    public static final int NAME_UNIQUE_FONT_ID = 3;
    public static final int NAME_VERSION = 5;
    public static final int PLATFORM_ISO = 2;
    public static final int PLATFORM_MACINTOSH = 1;
    public static final int PLATFORM_UNICODE = 0;
    public static final int PLATFORM_WINDOWS = 3;
    private int languageId;
    private int nameId;
    private int platformEncodingId;
    private int platformId;
    private String string;
    private int stringLength;
    private int stringOffset;

    public int getLanguageId() {
        return this.languageId;
    }

    public int getNameId() {
        return this.nameId;
    }

    public int getPlatformEncodingId() {
        return this.platformEncodingId;
    }

    public int getPlatformId() {
        return this.platformId;
    }

    public String getString() {
        return this.string;
    }

    public int getStringLength() {
        return this.stringLength;
    }

    public int getStringOffset() {
        return this.stringOffset;
    }

    public void initData(TrueTypeFont trueTypeFont, TTFDataStream tTFDataStream) {
        this.platformId = tTFDataStream.readUnsignedShort();
        this.platformEncodingId = tTFDataStream.readUnsignedShort();
        this.languageId = tTFDataStream.readUnsignedShort();
        this.nameId = tTFDataStream.readUnsignedShort();
        this.stringLength = tTFDataStream.readUnsignedShort();
        this.stringOffset = tTFDataStream.readUnsignedShort();
    }

    public void setLanguageId(int i10) {
        this.languageId = i10;
    }

    public void setNameId(int i10) {
        this.nameId = i10;
    }

    public void setPlatformEncodingId(int i10) {
        this.platformEncodingId = i10;
    }

    public void setPlatformId(int i10) {
        this.platformId = i10;
    }

    public void setString(String str) {
        this.string = str;
    }

    public void setStringLength(int i10) {
        this.stringLength = i10;
    }

    public void setStringOffset(int i10) {
        this.stringOffset = i10;
    }

    public String toString() {
        return "platform=" + this.platformId + " pEncoding=" + this.platformEncodingId + " language=" + this.languageId + " name=" + this.nameId + " " + this.string;
    }
}
