package lib.zj.office.fc.hwpf.sprm;

import java.util.ArrayList;
import lib.zj.office.fc.hwpf.usermodel.CharacterProperties;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public final class CharacterSprmCompressor {
    public static byte[] compressCharacterProperty(CharacterProperties characterProperties, CharacterProperties characterProperties2) {
        int i10;
        ArrayList arrayList = new ArrayList();
        if (characterProperties.isFRMarkDel() != characterProperties2.isFRMarkDel()) {
            i10 = SprmUtils.addSprm((short) 2048, characterProperties.isFRMarkDel() ? 1 : 0, null, arrayList) + 0;
        } else {
            i10 = 0;
        }
        if (characterProperties.isFRMark() != characterProperties2.isFRMark()) {
            i10 += SprmUtils.addSprm((short) 2049, characterProperties.isFRMark() ? 1 : 0, null, arrayList);
        }
        if (characterProperties.isFFldVanish() != characterProperties2.isFFldVanish()) {
            i10 += SprmUtils.addSprm((short) 2050, characterProperties.isFFldVanish() ? 1 : 0, null, arrayList);
        }
        if (characterProperties.isFSpec() != characterProperties2.isFSpec() || characterProperties.getFcPic() != characterProperties2.getFcPic()) {
            i10 += SprmUtils.addSprm((short) 27139, characterProperties.getFcPic(), null, arrayList);
        }
        if (characterProperties.getIbstRMark() != characterProperties2.getIbstRMark()) {
            i10 += SprmUtils.addSprm((short) 18436, characterProperties.getIbstRMark(), null, arrayList);
        }
        if (!characterProperties.getDttmRMark().equals(characterProperties2.getDttmRMark())) {
            byte[] bArr = new byte[4];
            characterProperties.getDttmRMark().serialize(bArr, 0);
            i10 += SprmUtils.addSprm((short) 26629, LittleEndian.getInt(bArr), null, arrayList);
        }
        if (characterProperties.isFData() != characterProperties2.isFData()) {
            i10 += SprmUtils.addSprm((short) 2054, characterProperties.isFData() ? 1 : 0, null, arrayList);
        }
        if (characterProperties.isFSpec() && characterProperties.getFtcSym() != 0) {
            byte[] bArr2 = new byte[4];
            LittleEndian.putShort(bArr2, 0, (short) characterProperties.getFtcSym());
            LittleEndian.putShort(bArr2, 2, (short) characterProperties.getXchSym());
            i10 += SprmUtils.addSprm((short) 27145, 0, bArr2, arrayList);
        }
        if (characterProperties.isFOle2() != characterProperties.isFOle2()) {
            i10 += SprmUtils.addSprm((short) 2058, characterProperties.isFOle2() ? 1 : 0, null, arrayList);
        }
        if (characterProperties.getIcoHighlight() != characterProperties2.getIcoHighlight()) {
            i10 += SprmUtils.addSprm((short) 10764, characterProperties.getIcoHighlight(), null, arrayList);
        }
        if (characterProperties.getFcObj() != characterProperties2.getFcObj()) {
            i10 += SprmUtils.addSprm((short) 26638, characterProperties.getFcObj(), null, arrayList);
        }
        if (characterProperties.getIstd() != characterProperties2.getIstd()) {
            i10 += SprmUtils.addSprm((short) 18992, characterProperties.getIstd(), null, arrayList);
        }
        if (characterProperties.isFBold() != characterProperties2.isFBold()) {
            i10 += SprmUtils.addSprm((short) 2101, characterProperties.isFBold() ? 1 : 0, null, arrayList);
        }
        if (characterProperties.isFItalic() != characterProperties2.isFItalic()) {
            i10 += SprmUtils.addSprm((short) 2102, characterProperties.isFItalic() ? 1 : 0, null, arrayList);
        }
        if (characterProperties.isFStrike() != characterProperties2.isFStrike()) {
            i10 += SprmUtils.addSprm((short) 2103, characterProperties.isFStrike() ? 1 : 0, null, arrayList);
        }
        if (characterProperties.isFOutline() != characterProperties2.isFOutline()) {
            i10 += SprmUtils.addSprm((short) 2104, characterProperties.isFOutline() ? 1 : 0, null, arrayList);
        }
        if (characterProperties.isFShadow() != characterProperties2.isFShadow()) {
            i10 += SprmUtils.addSprm((short) 2105, characterProperties.isFShadow() ? 1 : 0, null, arrayList);
        }
        if (characterProperties.isFSmallCaps() != characterProperties2.isFSmallCaps()) {
            i10 += SprmUtils.addSprm((short) 2106, characterProperties.isFSmallCaps() ? 1 : 0, null, arrayList);
        }
        if (characterProperties.isFCaps() != characterProperties2.isFCaps()) {
            i10 += SprmUtils.addSprm((short) 2107, characterProperties.isFCaps() ? 1 : 0, null, arrayList);
        }
        if (characterProperties.isFVanish() != characterProperties2.isFVanish()) {
            i10 += SprmUtils.addSprm((short) 2108, characterProperties.isFVanish() ? 1 : 0, null, arrayList);
        }
        if (characterProperties.getKul() != characterProperties2.getKul()) {
            i10 += SprmUtils.addSprm((short) 10814, characterProperties.getKul(), null, arrayList);
        }
        if (characterProperties.getDxaSpace() != characterProperties2.getDxaSpace()) {
            i10 += SprmUtils.addSprm((short) -30656, characterProperties.getDxaSpace(), null, arrayList);
        }
        if (characterProperties.getIco() != characterProperties2.getIco()) {
            i10 += SprmUtils.addSprm((short) 10818, characterProperties.getIco(), null, arrayList);
        }
        if (characterProperties.getHps() != characterProperties2.getHps()) {
            i10 += SprmUtils.addSprm((short) 19011, characterProperties.getHps(), null, arrayList);
        }
        if (characterProperties.getHpsPos() != characterProperties2.getHpsPos()) {
            i10 += SprmUtils.addSprm((short) 18501, characterProperties.getHpsPos(), null, arrayList);
        }
        if (characterProperties.getHpsKern() != characterProperties2.getHpsKern()) {
            i10 += SprmUtils.addSprm((short) 18507, characterProperties.getHpsKern(), null, arrayList);
        }
        if (characterProperties.getHresi().equals(characterProperties2.getHresi())) {
            i10 += SprmUtils.addSprm((short) 18510, characterProperties.getHresi().getValue(), null, arrayList);
        }
        if (characterProperties.getFtcAscii() != characterProperties2.getFtcAscii()) {
            i10 += SprmUtils.addSprm((short) 19023, characterProperties.getFtcAscii(), null, arrayList);
        }
        if (characterProperties.getFtcFE() != characterProperties2.getFtcFE()) {
            i10 += SprmUtils.addSprm((short) 19024, characterProperties.getFtcFE(), null, arrayList);
        }
        if (characterProperties.getFtcOther() != characterProperties2.getFtcOther()) {
            i10 += SprmUtils.addSprm((short) 19025, characterProperties.getFtcOther(), null, arrayList);
        }
        if (characterProperties.isFDStrike() != characterProperties2.isFDStrike()) {
            i10 += SprmUtils.addSprm((short) 10835, characterProperties.isFDStrike() ? 1 : 0, null, arrayList);
        }
        if (characterProperties.isFImprint() != characterProperties2.isFImprint()) {
            i10 += SprmUtils.addSprm((short) 2132, characterProperties.isFImprint() ? 1 : 0, null, arrayList);
        }
        if (characterProperties.isFSpec() != characterProperties2.isFSpec()) {
            i10 += SprmUtils.addSprm((short) 2133, characterProperties.isFSpec() ? 1 : 0, null, arrayList);
        }
        if (characterProperties.isFObj() != characterProperties2.isFObj()) {
            i10 += SprmUtils.addSprm((short) 2134, characterProperties.isFObj() ? 1 : 0, null, arrayList);
        }
        if (characterProperties.isFEmboss() != characterProperties2.isFEmboss()) {
            i10 += SprmUtils.addSprm((short) 2136, characterProperties.isFEmboss() ? 1 : 0, null, arrayList);
        }
        if (characterProperties.getSfxtText() != characterProperties2.getSfxtText()) {
            i10 += SprmUtils.addSprm((short) 10329, characterProperties.getSfxtText(), null, arrayList);
        }
        if (!characterProperties.getCv().equals(characterProperties2.getCv()) && !characterProperties.getCv().isEmpty()) {
            i10 += SprmUtils.addSprm(CharacterProperties.SPRM_CCV, characterProperties.getCv().getValue(), null, arrayList);
        }
        return SprmUtils.getGrpprl(arrayList, i10);
    }
}
