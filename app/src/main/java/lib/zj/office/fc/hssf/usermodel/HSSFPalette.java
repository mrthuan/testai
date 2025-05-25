package lib.zj.office.fc.hssf.usermodel;

import com.google.android.gms.common.api.Api;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import lib.zj.office.fc.hssf.record.PaletteRecord;
import lib.zj.office.fc.hssf.util.HSSFColor;

/* loaded from: classes3.dex */
public final class HSSFPalette {
    private PaletteRecord _palette;

    /* loaded from: classes3.dex */
    public static final class CustomColor extends HSSFColor {
        private byte _blue;
        private short _byteOffset;
        private byte _green;
        private byte _red;

        public CustomColor(short s4, byte[] bArr) {
            this(s4, bArr[0], bArr[1], bArr[2]);
        }

        private String getGnumericPart(byte b10) {
            if (b10 == 0) {
                return PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
            }
            int i10 = b10 & 255;
            String upperCase = Integer.toHexString(i10 | (i10 << 8)).toUpperCase();
            while (upperCase.length() < 4) {
                upperCase = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES.concat(upperCase);
            }
            return upperCase;
        }

        @Override // lib.zj.office.fc.hssf.util.HSSFColor
        public String getHexString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(getGnumericPart(this._red));
            stringBuffer.append(':');
            stringBuffer.append(getGnumericPart(this._green));
            stringBuffer.append(':');
            stringBuffer.append(getGnumericPart(this._blue));
            return stringBuffer.toString();
        }

        @Override // lib.zj.office.fc.hssf.util.HSSFColor
        public short getIndex() {
            return this._byteOffset;
        }

        @Override // lib.zj.office.fc.hssf.util.HSSFColor
        public short[] getTriplet() {
            return new short[]{(short) (this._red & 255), (short) (this._green & 255), (short) (this._blue & 255)};
        }

        private CustomColor(short s4, byte b10, byte b11, byte b12) {
            this._byteOffset = s4;
            this._red = b10;
            this._green = b11;
            this._blue = b12;
        }
    }

    public HSSFPalette(PaletteRecord paletteRecord) {
        this._palette = paletteRecord;
    }

    private int unsignedInt(byte b10) {
        return b10 & 255;
    }

    public HSSFColor addColor(byte b10, byte b11, byte b12) {
        short s4 = 8;
        byte[] color = this._palette.getColor(8);
        while (s4 < 64) {
            if (color == null) {
                setColorAtIndex(s4, b10, b11, b12);
                return getColor(s4);
            }
            s4 = (short) (s4 + 1);
            color = this._palette.getColor(s4);
        }
        throw new RuntimeException("Could not find free color index");
    }

    public HSSFColor findColor(byte b10, byte b11, byte b12) {
        short s4 = 8;
        byte[] color = this._palette.getColor(8);
        while (color != null) {
            if (color[0] == b10 && color[1] == b11 && color[2] == b12) {
                return new CustomColor(s4, color);
            }
            s4 = (short) (s4 + 1);
            color = this._palette.getColor(s4);
        }
        return null;
    }

    public HSSFColor findSimilarColor(byte b10, byte b11, byte b12) {
        return findSimilarColor(unsignedInt(b10), unsignedInt(b11), unsignedInt(b12));
    }

    public HSSFColor getColor(short s4) {
        if (s4 == 64) {
            return HSSFColor.AUTOMATIC.getInstance();
        }
        byte[] color = this._palette.getColor(s4);
        if (color != null) {
            return new CustomColor(s4, color);
        }
        return null;
    }

    public void setColorAtIndex(short s4, byte b10, byte b11, byte b12) {
        this._palette.setColor(s4, b10, b11, b12);
    }

    public HSSFColor findSimilarColor(int i10, int i11, int i12) {
        short s4 = 8;
        byte[] color = this._palette.getColor(8);
        HSSFColor hSSFColor = null;
        int i13 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        while (color != null) {
            int abs = Math.abs(i10 - unsignedInt(color[0]));
            int abs2 = Math.abs(i12 - unsignedInt(color[2])) + Math.abs(i11 - unsignedInt(color[1])) + abs;
            if (abs2 < i13) {
                hSSFColor = getColor(s4);
                i13 = abs2;
            }
            s4 = (short) (s4 + 1);
            color = this._palette.getColor(s4);
        }
        return hSSFColor;
    }

    public HSSFColor getColor(int i10) {
        return getColor((short) i10);
    }
}
