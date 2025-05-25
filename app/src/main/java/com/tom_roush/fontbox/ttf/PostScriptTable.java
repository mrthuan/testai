package com.tom_roush.fontbox.ttf;

import java.io.IOException;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* loaded from: classes2.dex */
public class PostScriptTable extends TTFTable {
    public static final String TAG = "post";
    private float formatType;
    private String[] glyphNames;
    private long isFixedPitch;
    private float italicAngle;
    private long maxMemType1;
    private long maxMemType42;
    private long mimMemType1;
    private long minMemType42;
    private short underlinePosition;
    private short underlineThickness;

    public PostScriptTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
        this.glyphNames = null;
    }

    public float getFormatType() {
        return this.formatType;
    }

    public String[] getGlyphNames() {
        return this.glyphNames;
    }

    public long getIsFixedPitch() {
        return this.isFixedPitch;
    }

    public float getItalicAngle() {
        return this.italicAngle;
    }

    public long getMaxMemType1() {
        return this.maxMemType1;
    }

    public long getMaxMemType42() {
        return this.maxMemType42;
    }

    public long getMinMemType1() {
        return this.mimMemType1;
    }

    public long getMinMemType42() {
        return this.minMemType42;
    }

    public String getName(int i10) {
        String[] strArr;
        if (i10 >= 0 && (strArr = this.glyphNames) != null && i10 < strArr.length) {
            return strArr[i10];
        }
        return null;
    }

    public short getUnderlinePosition() {
        return this.underlinePosition;
    }

    public short getUnderlineThickness() {
        return this.underlineThickness;
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    public void read(TrueTypeFont trueTypeFont, TTFDataStream tTFDataStream) {
        String str;
        String[] strArr;
        this.formatType = tTFDataStream.read32Fixed();
        this.italicAngle = tTFDataStream.read32Fixed();
        this.underlinePosition = tTFDataStream.readSignedShort();
        this.underlineThickness = tTFDataStream.readSignedShort();
        this.isFixedPitch = tTFDataStream.readUnsignedInt();
        this.minMemType42 = tTFDataStream.readUnsignedInt();
        this.maxMemType42 = tTFDataStream.readUnsignedInt();
        this.mimMemType1 = tTFDataStream.readUnsignedInt();
        this.maxMemType1 = tTFDataStream.readUnsignedInt();
        float f10 = this.formatType;
        int i10 = 0;
        if (f10 == 1.0f) {
            String[] strArr2 = new String[WGL4Names.NUMBER_OF_MAC_GLYPHS];
            this.glyphNames = strArr2;
            System.arraycopy(WGL4Names.MAC_GLYPH_NAMES, 0, strArr2, 0, WGL4Names.NUMBER_OF_MAC_GLYPHS);
        } else if (f10 == 2.0f) {
            int readUnsignedShort = tTFDataStream.readUnsignedShort();
            int[] iArr = new int[readUnsignedShort];
            this.glyphNames = new String[readUnsignedShort];
            int i11 = SlideAtom.USES_MASTER_SLIDE_ID;
            for (int i12 = 0; i12 < readUnsignedShort; i12++) {
                int readUnsignedShort2 = tTFDataStream.readUnsignedShort();
                iArr[i12] = readUnsignedShort2;
                if (readUnsignedShort2 <= 32767) {
                    i11 = Math.max(i11, readUnsignedShort2);
                }
            }
            if (i11 >= 258) {
                int i13 = (i11 - WGL4Names.NUMBER_OF_MAC_GLYPHS) + 1;
                strArr = new String[i13];
                int i14 = 0;
                while (i14 < i13) {
                    try {
                        strArr[i14] = tTFDataStream.readString(tTFDataStream.readUnsignedByte());
                        i14++;
                    } catch (IOException unused) {
                        while (i14 < i13) {
                            strArr[i14] = ".notdef";
                            i14++;
                        }
                    }
                }
            } else {
                strArr = null;
            }
            while (i10 < readUnsignedShort) {
                int i15 = iArr[i10];
                if (i15 >= 0 && i15 < 258) {
                    this.glyphNames[i10] = WGL4Names.MAC_GLYPH_NAMES[i15];
                } else if (i15 >= 258 && i15 <= 32767) {
                    this.glyphNames[i10] = strArr[i15 - 258];
                } else {
                    this.glyphNames[i10] = ".undefined";
                }
                i10++;
            }
        } else if (f10 == 2.5f) {
            int numberOfGlyphs = trueTypeFont.getNumberOfGlyphs();
            int[] iArr2 = new int[numberOfGlyphs];
            int i16 = 0;
            while (i16 < numberOfGlyphs) {
                int i17 = i16 + 1;
                iArr2[i16] = tTFDataStream.readSignedByte() + i17;
                i16 = i17;
            }
            this.glyphNames = new String[numberOfGlyphs];
            while (true) {
                String[] strArr3 = this.glyphNames;
                if (i10 >= strArr3.length) {
                    break;
                }
                int i18 = iArr2[i10];
                if (i18 >= 0 && i18 < 258 && (str = WGL4Names.MAC_GLYPH_NAMES[i18]) != null) {
                    strArr3[i10] = str;
                }
                i10++;
            }
        } else if (f10 == 3.0f) {
            this.font.getName();
        }
        this.initialized = true;
    }

    public void setFormatType(float f10) {
        this.formatType = f10;
    }

    public void setGlyphNames(String[] strArr) {
        this.glyphNames = strArr;
    }

    public void setIsFixedPitch(long j10) {
        this.isFixedPitch = j10;
    }

    public void setItalicAngle(float f10) {
        this.italicAngle = f10;
    }

    public void setMaxMemType1(long j10) {
        this.maxMemType1 = j10;
    }

    public void setMaxMemType42(long j10) {
        this.maxMemType42 = j10;
    }

    public void setMimMemType1(long j10) {
        this.mimMemType1 = j10;
    }

    public void setMinMemType42(long j10) {
        this.minMemType42 = j10;
    }

    public void setUnderlinePosition(short s4) {
        this.underlinePosition = s4;
    }

    public void setUnderlineThickness(short s4) {
        this.underlineThickness = s4;
    }
}
