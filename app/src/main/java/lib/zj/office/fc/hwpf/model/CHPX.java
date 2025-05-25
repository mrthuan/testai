package lib.zj.office.fc.hwpf.model;

import lib.zj.office.fc.hwpf.sprm.CharacterSprmUncompressor;
import lib.zj.office.fc.hwpf.sprm.SprmBuffer;
import lib.zj.office.fc.hwpf.usermodel.CharacterProperties;
import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
public final class CHPX extends BytePropertyNode<CHPX> {
    @Deprecated
    public CHPX(int i10, int i11, CharIndexTranslator charIndexTranslator, byte[] bArr) {
        super(i10, charIndexTranslator.lookIndexBackward(i11), charIndexTranslator, new SprmBuffer(bArr, 0));
    }

    public CharacterProperties getCharacterProperties(StyleSheet styleSheet, short s4) {
        if (styleSheet == null) {
            return new CharacterProperties();
        }
        CharacterProperties characterStyle = styleSheet.getCharacterStyle(s4);
        if (characterStyle == null) {
            characterStyle = new CharacterProperties();
        }
        return CharacterSprmUncompressor.uncompressCHP(characterStyle, getGrpprl(), 0);
    }

    public byte[] getGrpprl() {
        return ((SprmBuffer) this._buf).toByteArray();
    }

    public SprmBuffer getSprmBuf() {
        return (SprmBuffer) this._buf;
    }

    public String toString() {
        return "CHPX from " + getStart() + " to " + getEnd() + " (in bytes " + getStartBytes() + " to " + getEndBytes() + ")";
    }

    @Deprecated
    public CHPX(int i10, int i11, CharIndexTranslator charIndexTranslator, SprmBuffer sprmBuffer) {
        super(i10, charIndexTranslator.lookIndexBackward(i11), charIndexTranslator, sprmBuffer);
    }

    public CHPX(int i10, int i11, SprmBuffer sprmBuffer) {
        super(i10, i11, sprmBuffer);
    }
}
