package lib.zj.office.fc.hwpf.sprm;

import java.util.ArrayList;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Paragraph;
import lib.zj.office.fc.hwpf.usermodel.ParagraphProperties;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public final class ParagraphSprmCompressor {
    public static byte[] compressParagraphProperty(ParagraphProperties paragraphProperties, ParagraphProperties paragraphProperties2) {
        int i10;
        int i11;
        ArrayList arrayList = new ArrayList();
        if (paragraphProperties.getIstd() != paragraphProperties2.getIstd()) {
            i10 = SprmUtils.addSprm((short) 17920, paragraphProperties.getIstd(), null, arrayList) + 0;
        } else {
            i10 = 0;
        }
        if (paragraphProperties.getJc() != paragraphProperties2.getJc()) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_JC, paragraphProperties.getJc(), null, arrayList);
        }
        if (paragraphProperties.getFSideBySide() != paragraphProperties2.getFSideBySide()) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_FSIDEBYSIDE, paragraphProperties.getFSideBySide(), arrayList);
        }
        if (paragraphProperties.getFKeep() != paragraphProperties2.getFKeep()) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_FKEEP, paragraphProperties.getFKeep(), arrayList);
        }
        if (paragraphProperties.getFKeepFollow() != paragraphProperties2.getFKeepFollow()) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_FKEEPFOLLOW, paragraphProperties.getFKeepFollow(), arrayList);
        }
        if (paragraphProperties.getFPageBreakBefore() != paragraphProperties2.getFPageBreakBefore()) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_FPAGEBREAKBEFORE, paragraphProperties.getFPageBreakBefore(), arrayList);
        }
        if (paragraphProperties.getBrcl() != paragraphProperties2.getBrcl()) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_BRCL, paragraphProperties.getBrcl(), null, arrayList);
        }
        if (paragraphProperties.getBrcp() != paragraphProperties2.getBrcp()) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_BRCP, paragraphProperties.getBrcp(), null, arrayList);
        }
        if (paragraphProperties.getIlvl() != paragraphProperties2.getIlvl()) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_ILVL, paragraphProperties.getIlvl(), null, arrayList);
        }
        if (paragraphProperties.getIlfo() != paragraphProperties2.getIlfo()) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_ILFO, paragraphProperties.getIlfo(), null, arrayList);
        }
        if (paragraphProperties.getFNoLnn() != paragraphProperties2.getFNoLnn()) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_FNOLINENUMB, paragraphProperties.getFNoLnn(), arrayList);
        }
        if (paragraphProperties.getItbdMac() == paragraphProperties2.getItbdMac() && Arrays.equals(paragraphProperties.getRgdxaTab(), paragraphProperties2.getRgdxaTab())) {
            Arrays.equals(paragraphProperties.getRgtbd(), paragraphProperties2.getRgtbd());
        }
        if (paragraphProperties.getDxaLeft() != paragraphProperties2.getDxaLeft()) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_DXALEFT, paragraphProperties.getDxaLeft(), null, arrayList);
        }
        if (paragraphProperties.getDxaLeft1() != paragraphProperties2.getDxaLeft1()) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_DXALEFT1, paragraphProperties.getDxaLeft1(), null, arrayList);
        }
        if (paragraphProperties.getDxaRight() != paragraphProperties2.getDxaRight()) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_DXARIGHT, paragraphProperties.getDxaRight(), null, arrayList);
        }
        if (paragraphProperties.getDxcLeft() != paragraphProperties2.getDxcLeft()) {
            i10 += SprmUtils.addSprm((short) 17494, paragraphProperties.getDxcLeft(), null, arrayList);
        }
        if (paragraphProperties.getDxcLeft1() != paragraphProperties2.getDxcLeft1()) {
            i10 += SprmUtils.addSprm((short) 17495, paragraphProperties.getDxcLeft1(), null, arrayList);
        }
        if (paragraphProperties.getDxcRight() != paragraphProperties2.getDxcRight()) {
            i10 += SprmUtils.addSprm((short) 17493, paragraphProperties.getDxcRight(), null, arrayList);
        }
        if (!paragraphProperties.getLspd().equals(paragraphProperties2.getLspd())) {
            byte[] bArr = new byte[4];
            paragraphProperties.getLspd().serialize(bArr, 0);
            i10 += SprmUtils.addSprm(Paragraph.SPRM_DYALINE, LittleEndian.getInt(bArr), null, arrayList);
        }
        if (paragraphProperties.getDyaBefore() != paragraphProperties2.getDyaBefore()) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_DYABEFORE, paragraphProperties.getDyaBefore(), null, arrayList);
        }
        if (paragraphProperties.getDyaAfter() != paragraphProperties2.getDyaAfter()) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_DYAAFTER, paragraphProperties.getDyaAfter(), null, arrayList);
        }
        if (paragraphProperties.getFDyaBeforeAuto() != paragraphProperties2.getFDyaBeforeAuto()) {
            i10 += SprmUtils.addSprm((short) 9307, paragraphProperties.getFDyaBeforeAuto(), arrayList);
        }
        if (paragraphProperties.getFDyaAfterAuto() != paragraphProperties2.getFDyaAfterAuto()) {
            i10 += SprmUtils.addSprm((short) 9308, paragraphProperties.getFDyaAfterAuto(), arrayList);
        }
        if (paragraphProperties.getFInTable() != paragraphProperties2.getFInTable()) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_FINTABLE, paragraphProperties.getFInTable(), arrayList);
        }
        if (paragraphProperties.getFTtp() != paragraphProperties2.getFTtp()) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_FTTP, paragraphProperties.getFTtp(), arrayList);
        }
        if (paragraphProperties.getDxaAbs() != paragraphProperties2.getDxaAbs()) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_DXAABS, paragraphProperties.getDxaAbs(), null, arrayList);
        }
        if (paragraphProperties.getDyaAbs() != paragraphProperties2.getDyaAbs()) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_DYAABS, paragraphProperties.getDyaAbs(), null, arrayList);
        }
        if (paragraphProperties.getDxaWidth() != paragraphProperties2.getDxaWidth()) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_DXAWIDTH, paragraphProperties.getDxaWidth(), null, arrayList);
        }
        if (paragraphProperties.getWr() != paragraphProperties2.getWr()) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_WR, paragraphProperties.getWr(), null, arrayList);
        }
        if (paragraphProperties.getBrcBar().equals(paragraphProperties2.getBrcBar())) {
            i10 += SprmUtils.addSprm((short) 25640, paragraphProperties.getBrcBar().toInt(), null, arrayList);
        }
        if (!paragraphProperties.getBrcBottom().equals(paragraphProperties2.getBrcBottom())) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_BRCBOTTOM, paragraphProperties.getBrcBottom().toInt(), null, arrayList);
        }
        if (!paragraphProperties.getBrcLeft().equals(paragraphProperties2.getBrcLeft())) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_BRCLEFT, paragraphProperties.getBrcLeft().toInt(), null, arrayList);
        }
        if (!paragraphProperties.getBrcRight().equals(paragraphProperties2.getBrcRight())) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_BRCRIGHT, paragraphProperties.getBrcRight().toInt(), null, arrayList);
        }
        if (!paragraphProperties.getBrcTop().equals(paragraphProperties2.getBrcTop())) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_BRCTOP, paragraphProperties.getBrcTop().toInt(), null, arrayList);
        }
        if (paragraphProperties.getFNoAutoHyph() != paragraphProperties2.getFNoAutoHyph()) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_FNOAUTOHYPH, paragraphProperties.getFNoAutoHyph(), arrayList);
        }
        if (paragraphProperties.getDyaHeight() != paragraphProperties2.getDyaHeight() || paragraphProperties.getFMinHeight() != paragraphProperties2.getFMinHeight()) {
            short dyaHeight = (short) paragraphProperties.getDyaHeight();
            if (paragraphProperties.getFMinHeight()) {
                dyaHeight = (short) (dyaHeight | 32768);
            }
            i10 += SprmUtils.addSprm(Paragraph.SPRM_WHEIGHTABS, dyaHeight, null, arrayList);
        }
        if (paragraphProperties.getDcs() != null && !paragraphProperties.getDcs().equals(paragraphProperties2.getDcs())) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_DCS, paragraphProperties.getDcs().toShort(), null, arrayList);
        }
        if (paragraphProperties.getShd() != null && !paragraphProperties.getShd().equals(paragraphProperties2.getShd())) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_SHD, paragraphProperties.getShd().toShort(), null, arrayList);
        }
        if (paragraphProperties.getDyaFromText() != paragraphProperties2.getDyaFromText()) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_DYAFROMTEXT, paragraphProperties.getDyaFromText(), null, arrayList);
        }
        if (paragraphProperties.getDxaFromText() != paragraphProperties2.getDxaFromText()) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_DXAFROMTEXT, paragraphProperties.getDxaFromText(), null, arrayList);
        }
        if (paragraphProperties.getFLocked() != paragraphProperties2.getFLocked()) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_FLOCKED, paragraphProperties.getFLocked(), arrayList);
        }
        if (paragraphProperties.getFWidowControl() != paragraphProperties2.getFWidowControl()) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_FWIDOWCONTROL, paragraphProperties.getFWidowControl(), arrayList);
        }
        if (paragraphProperties.getFKinsoku() != paragraphProperties2.getFKinsoku()) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_FKINSOKU, paragraphProperties.getDyaBefore(), null, arrayList);
        }
        if (paragraphProperties.getFWordWrap() != paragraphProperties2.getFWordWrap()) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_FWORDWRAP, paragraphProperties.getFWordWrap(), arrayList);
        }
        if (paragraphProperties.getFOverflowPunct() != paragraphProperties2.getFOverflowPunct()) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_FOVERFLOWPUNCT, paragraphProperties.getFOverflowPunct(), arrayList);
        }
        if (paragraphProperties.getFTopLinePunct() != paragraphProperties2.getFTopLinePunct()) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_FTOPLINEPUNCT, paragraphProperties.getFTopLinePunct(), arrayList);
        }
        if (paragraphProperties.getFAutoSpaceDE() != paragraphProperties2.getFAutoSpaceDE()) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_AUTOSPACEDE, paragraphProperties.getFAutoSpaceDE(), arrayList);
        }
        if (paragraphProperties.getFAutoSpaceDN() != paragraphProperties2.getFAutoSpaceDN()) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_AUTOSPACEDN, paragraphProperties.getFAutoSpaceDN(), arrayList);
        }
        if (paragraphProperties.getWAlignFont() != paragraphProperties2.getWAlignFont()) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_WALIGNFONT, paragraphProperties.getWAlignFont(), null, arrayList);
        }
        if (paragraphProperties.isFBackward() != paragraphProperties2.isFBackward() || paragraphProperties.isFVertical() != paragraphProperties2.isFVertical() || paragraphProperties.isFRotateFont() != paragraphProperties2.isFRotateFont()) {
            if (paragraphProperties.isFBackward()) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            if (paragraphProperties.isFVertical()) {
                i11 |= 1;
            }
            if (paragraphProperties.isFRotateFont()) {
                i11 |= 4;
            }
            i10 += SprmUtils.addSprm(Paragraph.SPRM_FRAMETEXTFLOW, i11, null, arrayList);
        }
        if (!Arrays.equals(paragraphProperties.getAnld(), paragraphProperties2.getAnld())) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_ANLD, 0, paragraphProperties.getAnld(), arrayList);
        }
        if (paragraphProperties.getFPropRMark() != paragraphProperties2.getFPropRMark() || paragraphProperties.getIbstPropRMark() != paragraphProperties2.getIbstPropRMark() || !paragraphProperties.getDttmPropRMark().equals(paragraphProperties2.getDttmPropRMark())) {
            byte[] bArr2 = new byte[7];
            bArr2[0] = paragraphProperties.getFPropRMark() ? (byte) 1 : (byte) 0;
            LittleEndian.putShort(bArr2, 1, (short) paragraphProperties.getIbstPropRMark());
            paragraphProperties.getDttmPropRMark().serialize(bArr2, 3);
            i10 += SprmUtils.addSprm(Paragraph.SPRM_PROPRMARK, 0, bArr2, arrayList);
        }
        if (paragraphProperties.getLvl() != paragraphProperties2.getLvl()) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_OUTLVL, paragraphProperties.getLvl(), null, arrayList);
        }
        if (paragraphProperties.getFBiDi() != paragraphProperties2.getFBiDi()) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_FBIDI, paragraphProperties.getFBiDi(), arrayList);
        }
        if (paragraphProperties.getFNumRMIns() != paragraphProperties2.getFNumRMIns()) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_FNUMRMLNS, paragraphProperties.getFNumRMIns(), arrayList);
        }
        if (!Arrays.equals(paragraphProperties.getNumrm(), paragraphProperties2.getNumrm())) {
            i10 += SprmUtils.addSprm(Paragraph.SPRM_NUMRM, 0, paragraphProperties.getNumrm(), arrayList);
        }
        if (paragraphProperties.getFInnerTableCell() != paragraphProperties2.getFInnerTableCell()) {
            i10 += SprmUtils.addSprm((short) 9291, paragraphProperties.getFInnerTableCell(), arrayList);
        }
        if (paragraphProperties.getFTtpEmbedded() != paragraphProperties2.getFTtpEmbedded()) {
            i10 += SprmUtils.addSprm((short) 9292, paragraphProperties.getFTtpEmbedded(), arrayList);
        }
        if (paragraphProperties.getItap() != paragraphProperties2.getItap()) {
            i10 += SprmUtils.addSprm((short) 26185, paragraphProperties.getItap(), null, arrayList);
        }
        return SprmUtils.getGrpprl(arrayList, i10);
    }
}
