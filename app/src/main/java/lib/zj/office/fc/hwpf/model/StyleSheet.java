package lib.zj.office.fc.hwpf.model;

import a0.a;
import lib.zj.office.fc.hwpf.model.io.HWPFOutputStream;
import lib.zj.office.fc.hwpf.sprm.CharacterSprmUncompressor;
import lib.zj.office.fc.hwpf.sprm.ParagraphSprmUncompressor;
import lib.zj.office.fc.hwpf.usermodel.CharacterProperties;
import lib.zj.office.fc.hwpf.usermodel.ParagraphProperties;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public final class StyleSheet implements HDFType {
    private static final int CHP_TYPE = 2;
    public static final int NIL_STYLE = 4095;
    private static final int PAP_TYPE = 1;
    private static final int SEP_TYPE = 4;
    private static final int TAP_TYPE = 5;
    private int _cbSTDBaseInFile;
    private int _cbStshi;
    private int _flags;
    private int _istdMaxFixedWhenSaved;
    private int[] _rgftcStandardChpStsh;
    private int _stiMaxWhenSaved;
    StyleDescription[] _styleDescriptions;
    private int nVerBuiltInNamesWhenSaved;
    private static final ParagraphProperties NIL_PAP = new ParagraphProperties();
    private static final CharacterProperties NIL_CHP = new CharacterProperties();

    public StyleSheet(byte[] bArr, int i10) {
        this._cbStshi = LittleEndian.getShort(bArr, i10);
        int i11 = i10 + 2;
        int uShort = LittleEndian.getUShort(bArr, i11);
        int i12 = i11 + 2;
        this._cbSTDBaseInFile = LittleEndian.getUShort(bArr, i12);
        int i13 = i12 + 2;
        this._flags = LittleEndian.getShort(bArr, i13);
        int i14 = i13 + 2;
        this._stiMaxWhenSaved = LittleEndian.getUShort(bArr, i14);
        int i15 = i14 + 2;
        this._istdMaxFixedWhenSaved = LittleEndian.getUShort(bArr, i15);
        int i16 = i15 + 2;
        this.nVerBuiltInNamesWhenSaved = LittleEndian.getUShort(bArr, i16);
        int i17 = i16 + 2;
        this._rgftcStandardChpStsh = r3;
        int i18 = 0;
        int[] iArr = {LittleEndian.getShort(bArr, i17)};
        int i19 = i17 + 2;
        this._rgftcStandardChpStsh[1] = LittleEndian.getShort(bArr, i19);
        this._rgftcStandardChpStsh[2] = LittleEndian.getShort(bArr, i19 + 2);
        int i20 = i11 + this._cbStshi;
        this._styleDescriptions = new StyleDescription[uShort];
        for (int i21 = 0; i21 < uShort; i21++) {
            short s4 = LittleEndian.getShort(bArr, i20);
            int i22 = i20 + 2;
            if (s4 > 0) {
                this._styleDescriptions[i21] = new StyleDescription(bArr, this._cbSTDBaseInFile, i22, true);
            }
            i20 = i22 + s4;
        }
        while (true) {
            StyleDescription[] styleDescriptionArr = this._styleDescriptions;
            if (i18 < styleDescriptionArr.length) {
                if (styleDescriptionArr[i18] != null) {
                    createPap(i18);
                    createChp(i18);
                }
                i18++;
            } else {
                return;
            }
        }
    }

    private void createChp(int i10) {
        StyleDescription styleDescription = this._styleDescriptions[i10];
        CharacterProperties chp = styleDescription.getCHP();
        byte[] chpx = styleDescription.getCHPX();
        int baseStyle = styleDescription.getBaseStyle();
        if (baseStyle == i10) {
            baseStyle = 4095;
        }
        if (chp == null && chpx != null) {
            CharacterProperties characterProperties = new CharacterProperties();
            if (baseStyle != 4095 && (characterProperties = this._styleDescriptions[baseStyle].getCHP()) == null) {
                createChp(baseStyle);
                characterProperties = this._styleDescriptions[baseStyle].getCHP();
            }
            styleDescription.setCHP(CharacterSprmUncompressor.uncompressCHP(characterProperties, chpx, 0));
        }
    }

    private void createPap(int i10) {
        StyleDescription styleDescription = this._styleDescriptions[i10];
        ParagraphProperties pap = styleDescription.getPAP();
        byte[] papx = styleDescription.getPAPX();
        int baseStyle = styleDescription.getBaseStyle();
        if (pap == null && papx != null) {
            ParagraphProperties paragraphProperties = new ParagraphProperties();
            if (baseStyle != 4095 && (paragraphProperties = this._styleDescriptions[baseStyle].getPAP()) == null) {
                if (baseStyle != i10) {
                    createPap(baseStyle);
                    paragraphProperties = this._styleDescriptions[baseStyle].getPAP();
                } else {
                    throw new IllegalStateException(a.g("Pap style ", i10, " claimed to have itself as its parent, which isn't allowed"));
                }
            }
            if (paragraphProperties == null) {
                paragraphProperties = new ParagraphProperties();
            }
            styleDescription.setPAP(ParagraphSprmUncompressor.uncompressPAP(paragraphProperties, papx, 2));
        }
    }

    public boolean equals(Object obj) {
        StyleSheet styleSheet = (StyleSheet) obj;
        if (styleSheet._cbSTDBaseInFile == this._cbSTDBaseInFile && styleSheet._flags == this._flags && styleSheet._istdMaxFixedWhenSaved == this._istdMaxFixedWhenSaved && styleSheet._stiMaxWhenSaved == this._stiMaxWhenSaved) {
            int[] iArr = styleSheet._rgftcStandardChpStsh;
            int i10 = iArr[0];
            int[] iArr2 = this._rgftcStandardChpStsh;
            if (i10 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && styleSheet._cbStshi == this._cbStshi && styleSheet.nVerBuiltInNamesWhenSaved == this.nVerBuiltInNamesWhenSaved && styleSheet._styleDescriptions.length == this._styleDescriptions.length) {
                int i11 = 0;
                while (true) {
                    StyleDescription[] styleDescriptionArr = this._styleDescriptions;
                    if (i11 >= styleDescriptionArr.length) {
                        return true;
                    }
                    StyleDescription styleDescription = styleSheet._styleDescriptions[i11];
                    StyleDescription styleDescription2 = styleDescriptionArr[i11];
                    if (styleDescription != styleDescription2 && !styleDescription.equals(styleDescription2)) {
                        return false;
                    }
                    i11++;
                }
            }
        }
        return false;
    }

    public CharacterProperties getCharacterStyle(int i10) {
        if (i10 == 4095) {
            return NIL_CHP;
        }
        StyleDescription[] styleDescriptionArr = this._styleDescriptions;
        if (i10 >= styleDescriptionArr.length) {
            return NIL_CHP;
        }
        StyleDescription styleDescription = styleDescriptionArr[i10];
        if (styleDescription != null) {
            return styleDescription.getCHP();
        }
        return NIL_CHP;
    }

    public ParagraphProperties getParagraphStyle(int i10) {
        if (i10 == 4095) {
            return NIL_PAP;
        }
        StyleDescription[] styleDescriptionArr = this._styleDescriptions;
        if (i10 >= styleDescriptionArr.length) {
            return NIL_PAP;
        }
        StyleDescription styleDescription = styleDescriptionArr[i10];
        if (styleDescription == null) {
            return NIL_PAP;
        }
        if (styleDescription.getPAP() == null) {
            return NIL_PAP;
        }
        return this._styleDescriptions[i10].getPAP();
    }

    public StyleDescription getStyleDescription(int i10) {
        return this._styleDescriptions[i10];
    }

    public int numStyles() {
        return this._styleDescriptions.length;
    }

    public void writeTo(HWPFOutputStream hWPFOutputStream) {
        this._cbStshi = 18;
        byte[] bArr = new byte[18 + 2];
        LittleEndian.putUShort(bArr, 0, (short) 18);
        LittleEndian.putUShort(bArr, 2, (short) this._styleDescriptions.length);
        LittleEndian.putUShort(bArr, 4, (short) this._cbSTDBaseInFile);
        LittleEndian.putShort(bArr, 6, (short) this._flags);
        LittleEndian.putUShort(bArr, 8, (short) this._stiMaxWhenSaved);
        LittleEndian.putUShort(bArr, 10, (short) this._istdMaxFixedWhenSaved);
        LittleEndian.putUShort(bArr, 12, (short) this.nVerBuiltInNamesWhenSaved);
        LittleEndian.putShort(bArr, 14, (short) this._rgftcStandardChpStsh[0]);
        LittleEndian.putShort(bArr, 16, (short) this._rgftcStandardChpStsh[1]);
        LittleEndian.putShort(bArr, 18, (short) this._rgftcStandardChpStsh[2]);
        hWPFOutputStream.write(bArr);
        byte[] bArr2 = new byte[2];
        int i10 = 0;
        while (true) {
            StyleDescription[] styleDescriptionArr = this._styleDescriptions;
            if (i10 < styleDescriptionArr.length) {
                StyleDescription styleDescription = styleDescriptionArr[i10];
                if (styleDescription != null) {
                    byte[] byteArray = styleDescription.toByteArray();
                    LittleEndian.putShort(bArr2, (short) ((byteArray.length % 2) + byteArray.length));
                    hWPFOutputStream.write(bArr2);
                    hWPFOutputStream.write(byteArray);
                    if (byteArray.length % 2 == 1) {
                        hWPFOutputStream.write(0);
                    }
                } else {
                    bArr2[0] = 0;
                    bArr2[1] = 0;
                    hWPFOutputStream.write(bArr2);
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
