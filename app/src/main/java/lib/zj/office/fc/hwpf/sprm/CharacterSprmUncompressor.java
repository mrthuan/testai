package lib.zj.office.fc.hwpf.sprm;

import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.hwpf.model.Colorref;
import lib.zj.office.fc.hwpf.model.Hyphenation;
import lib.zj.office.fc.hwpf.usermodel.BorderCode;
import lib.zj.office.fc.hwpf.usermodel.CharacterProperties;
import lib.zj.office.fc.hwpf.usermodel.DateAndTime;
import lib.zj.office.fc.hwpf.usermodel.ShadingDescriptor;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public final class CharacterSprmUncompressor extends SprmUncompressor {
    private static boolean getCHPFlag(byte b10, boolean z10) {
        if (b10 == 0) {
            return false;
        }
        if (b10 == 1) {
            return true;
        }
        int i10 = b10 & 129;
        if (i10 == 128) {
            return z10;
        }
        if (i10 != 129) {
            return false;
        }
        return !z10;
    }

    public static void unCompressCHPOperation(CharacterProperties characterProperties, CharacterProperties characterProperties2, SprmOperation sprmOperation) {
        int operation = sprmOperation.getOperation();
        if (operation != 12) {
            if (operation != 14) {
                if (operation != 48) {
                    if (operation != 119) {
                        boolean z10 = false;
                        if (operation != 50) {
                            if (operation != 51) {
                                boolean z11 = true;
                                switch (operation) {
                                    case 0:
                                        characterProperties2.setFRMarkDel(SprmUncompressor.getFlag(sprmOperation.getOperand()));
                                        return;
                                    case 1:
                                        characterProperties2.setFRMark(SprmUncompressor.getFlag(sprmOperation.getOperand()));
                                        return;
                                    case 2:
                                        characterProperties2.setFFldVanish(SprmUncompressor.getFlag(sprmOperation.getOperand()));
                                        return;
                                    case 3:
                                        characterProperties2.setFcPic(sprmOperation.getOperand());
                                        characterProperties2.setFSpec(true);
                                        return;
                                    case 4:
                                        characterProperties2.setIbstRMark((short) sprmOperation.getOperand());
                                        return;
                                    case 5:
                                        characterProperties2.setDttmRMark(new DateAndTime(sprmOperation.getGrpprl(), sprmOperation.getGrpprlOffset()));
                                        return;
                                    case 6:
                                        characterProperties2.setFData(SprmUncompressor.getFlag(sprmOperation.getOperand()));
                                        return;
                                    default:
                                        switch (operation) {
                                            case 8:
                                                int operand = sprmOperation.getOperand();
                                                characterProperties2.setFChsDiff(SprmUncompressor.getFlag((short) (operand & FunctionEval.FunctionID.EXTERNAL_FUNC)));
                                                characterProperties2.setChse((short) (operand & 16776960));
                                                return;
                                            case 9:
                                                characterProperties2.setFSpec(true);
                                                characterProperties2.setFtcSym(LittleEndian.getShort(sprmOperation.getGrpprl(), sprmOperation.getGrpprlOffset()));
                                                characterProperties2.setXchSym(LittleEndian.getShort(sprmOperation.getGrpprl(), sprmOperation.getGrpprlOffset() + 2));
                                                return;
                                            case 10:
                                                characterProperties2.setFOle2(SprmUncompressor.getFlag(sprmOperation.getOperand()));
                                                return;
                                            default:
                                                switch (operation) {
                                                    case 53:
                                                        characterProperties2.setFBold(getCHPFlag((byte) sprmOperation.getOperand(), characterProperties.isFBold()));
                                                        return;
                                                    case 54:
                                                        characterProperties2.setFItalic(getCHPFlag((byte) sprmOperation.getOperand(), characterProperties.isFItalic()));
                                                        return;
                                                    case 55:
                                                        characterProperties2.setFStrike(getCHPFlag((byte) sprmOperation.getOperand(), characterProperties.isFStrike()));
                                                        return;
                                                    case 56:
                                                        characterProperties2.setFOutline(getCHPFlag((byte) sprmOperation.getOperand(), characterProperties.isFOutline()));
                                                        return;
                                                    case 57:
                                                        characterProperties2.setFShadow(getCHPFlag((byte) sprmOperation.getOperand(), characterProperties.isFShadow()));
                                                        return;
                                                    case 58:
                                                        characterProperties2.setFSmallCaps(getCHPFlag((byte) sprmOperation.getOperand(), characterProperties.isFSmallCaps()));
                                                        return;
                                                    case 59:
                                                        characterProperties2.setFCaps(getCHPFlag((byte) sprmOperation.getOperand(), characterProperties.isFCaps()));
                                                        return;
                                                    case 60:
                                                        characterProperties2.setFVanish(getCHPFlag((byte) sprmOperation.getOperand(), characterProperties.isFVanish()));
                                                        return;
                                                    case 61:
                                                        characterProperties2.setFtcAscii((short) sprmOperation.getOperand());
                                                        return;
                                                    case 62:
                                                        characterProperties2.setKul((byte) sprmOperation.getOperand());
                                                        return;
                                                    case 63:
                                                        int operand2 = sprmOperation.getOperand();
                                                        int i10 = operand2 & FunctionEval.FunctionID.EXTERNAL_FUNC;
                                                        if (i10 != 0) {
                                                            characterProperties2.setHps(i10);
                                                        }
                                                        byte b10 = (byte) (((byte) ((65280 & operand2) >>> 8)) >>> 1);
                                                        if (b10 != 0) {
                                                            characterProperties2.setHps(Math.max((b10 * 2) + characterProperties2.getHps(), 2));
                                                        }
                                                        byte b11 = (byte) ((16711680 & operand2) >>> 16);
                                                        if (b11 != 128) {
                                                            characterProperties2.setHpsPos(b11);
                                                        }
                                                        if ((operand2 & 256) > 0) {
                                                            z10 = true;
                                                        }
                                                        if (z10 && b11 != 128 && b11 != 0 && characterProperties.getHpsPos() == 0) {
                                                            characterProperties2.setHps(Math.max(characterProperties2.getHps() - 2, 2));
                                                        }
                                                        if (z10 && b11 == 0 && characterProperties.getHpsPos() != 0) {
                                                            characterProperties2.setHps(Math.max(characterProperties2.getHps() + 2, 2));
                                                            return;
                                                        }
                                                        return;
                                                    case 64:
                                                        characterProperties2.setDxaSpace(sprmOperation.getOperand());
                                                        return;
                                                    case 65:
                                                        characterProperties2.setLidDefault((short) sprmOperation.getOperand());
                                                        return;
                                                    case 66:
                                                        characterProperties2.setIco((byte) sprmOperation.getOperand());
                                                        return;
                                                    case 67:
                                                        characterProperties2.setHps(sprmOperation.getOperand());
                                                        return;
                                                    case 68:
                                                        characterProperties2.setHps(Math.max((((byte) sprmOperation.getOperand()) * 2) + characterProperties2.getHps(), 2));
                                                        return;
                                                    case 69:
                                                        characterProperties2.setHpsPos((short) sprmOperation.getOperand());
                                                        return;
                                                    case 70:
                                                        if (sprmOperation.getOperand() != 0) {
                                                            if (characterProperties.getHpsPos() == 0) {
                                                                characterProperties2.setHps(Math.max(characterProperties2.getHps() - 2, 2));
                                                                return;
                                                            }
                                                            return;
                                                        } else if (characterProperties.getHpsPos() != 0) {
                                                            characterProperties2.setHps(Math.max(characterProperties2.getHps() + 2, 2));
                                                            return;
                                                        } else {
                                                            return;
                                                        }
                                                    default:
                                                        switch (operation) {
                                                            case 72:
                                                                characterProperties2.setIss((byte) sprmOperation.getOperand());
                                                                return;
                                                            case 73:
                                                                characterProperties2.setHps(LittleEndian.getShort(sprmOperation.getGrpprl(), sprmOperation.getGrpprlOffset()));
                                                                return;
                                                            case 74:
                                                                characterProperties2.setHps(Math.max(characterProperties2.getHps() + LittleEndian.getShort(sprmOperation.getGrpprl(), sprmOperation.getGrpprlOffset()), 8));
                                                                return;
                                                            case 75:
                                                                characterProperties2.setHpsKern(sprmOperation.getOperand());
                                                                return;
                                                            default:
                                                                switch (operation) {
                                                                    case 77:
                                                                        characterProperties2.setHps(characterProperties2.getHps() + ((int) ((sprmOperation.getOperand() / 100.0f) * characterProperties2.getHps())));
                                                                        return;
                                                                    case 78:
                                                                        characterProperties2.setHresi(new Hyphenation((short) sprmOperation.getOperand()));
                                                                        return;
                                                                    case 79:
                                                                        characterProperties2.setFtcAscii((short) sprmOperation.getOperand());
                                                                        return;
                                                                    case 80:
                                                                        characterProperties2.setFtcFE((short) sprmOperation.getOperand());
                                                                        return;
                                                                    case 81:
                                                                        characterProperties2.setFtcOther((short) sprmOperation.getOperand());
                                                                        return;
                                                                    default:
                                                                        switch (operation) {
                                                                            case 83:
                                                                                characterProperties2.setFDStrike(SprmUncompressor.getFlag(sprmOperation.getOperand()));
                                                                                return;
                                                                            case 84:
                                                                                characterProperties2.setFImprint(SprmUncompressor.getFlag(sprmOperation.getOperand()));
                                                                                return;
                                                                            case 85:
                                                                                characterProperties2.setFSpec(SprmUncompressor.getFlag(sprmOperation.getOperand()));
                                                                                return;
                                                                            case 86:
                                                                                characterProperties2.setFObj(SprmUncompressor.getFlag(sprmOperation.getOperand()));
                                                                                return;
                                                                            case 87:
                                                                                byte[] grpprl = sprmOperation.getGrpprl();
                                                                                int grpprlOffset = sprmOperation.getGrpprlOffset();
                                                                                if (grpprl[grpprlOffset] != 0) {
                                                                                    z10 = true;
                                                                                }
                                                                                characterProperties2.setFPropRMark(z10);
                                                                                characterProperties2.setIbstPropRMark(LittleEndian.getShort(grpprl, grpprlOffset + 1));
                                                                                characterProperties2.setDttmPropRMark(new DateAndTime(grpprl, grpprlOffset + 3));
                                                                                return;
                                                                            case 88:
                                                                                characterProperties2.setFEmboss(SprmUncompressor.getFlag(sprmOperation.getOperand()));
                                                                                return;
                                                                            case 89:
                                                                                characterProperties2.setSfxtText((byte) sprmOperation.getOperand());
                                                                                return;
                                                                            default:
                                                                                switch (operation) {
                                                                                    case 98:
                                                                                        byte[] bArr = new byte[32];
                                                                                        byte[] grpprl2 = sprmOperation.getGrpprl();
                                                                                        int grpprlOffset2 = sprmOperation.getGrpprlOffset();
                                                                                        if (grpprl2[grpprlOffset2] == 0) {
                                                                                            z11 = false;
                                                                                        }
                                                                                        characterProperties2.setFDispFldRMark(z11);
                                                                                        characterProperties2.setIbstDispFldRMark(LittleEndian.getShort(grpprl2, grpprlOffset2 + 1));
                                                                                        characterProperties2.setDttmDispFldRMark(new DateAndTime(grpprl2, grpprlOffset2 + 3));
                                                                                        System.arraycopy(grpprl2, grpprlOffset2 + 7, bArr, 0, 32);
                                                                                        characterProperties2.setXstDispFldRMark(bArr);
                                                                                        return;
                                                                                    case 99:
                                                                                        characterProperties2.setIbstRMarkDel((short) sprmOperation.getOperand());
                                                                                        return;
                                                                                    case 100:
                                                                                        characterProperties2.setDttmRMarkDel(new DateAndTime(sprmOperation.getGrpprl(), sprmOperation.getGrpprlOffset()));
                                                                                        return;
                                                                                    case 101:
                                                                                        characterProperties2.setBrc(new BorderCode(sprmOperation.getGrpprl(), sprmOperation.getGrpprlOffset()));
                                                                                        return;
                                                                                    case 102:
                                                                                        characterProperties2.setShd(new ShadingDescriptor(sprmOperation.getGrpprl(), sprmOperation.getGrpprlOffset()));
                                                                                        return;
                                                                                    default:
                                                                                        switch (operation) {
                                                                                            case 109:
                                                                                                characterProperties2.setLidDefault((short) sprmOperation.getOperand());
                                                                                                return;
                                                                                            case 110:
                                                                                                characterProperties2.setLidFE((short) sprmOperation.getOperand());
                                                                                                return;
                                                                                            case 111:
                                                                                                characterProperties2.setIdctHint((byte) sprmOperation.getOperand());
                                                                                                return;
                                                                                            case 112:
                                                                                                characterProperties2.setCv(new Colorref(sprmOperation.getOperand()));
                                                                                                return;
                                                                                            default:
                                                                                                return;
                                                                                        }
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                            }
                            try {
                                ((CharacterProperties) characterProperties.clone()).setFSpec(characterProperties2.isFSpec());
                                return;
                            } catch (CloneNotSupportedException unused) {
                                return;
                            }
                        }
                        characterProperties2.setFBold(false);
                        characterProperties2.setFItalic(false);
                        characterProperties2.setFOutline(false);
                        characterProperties2.setFStrike(false);
                        characterProperties2.setFShadow(false);
                        characterProperties2.setFSmallCaps(false);
                        characterProperties2.setFCaps(false);
                        characterProperties2.setFVanish(false);
                        characterProperties2.setKul((byte) 0);
                        characterProperties2.setIco((byte) 0);
                        return;
                    }
                    characterProperties2.setUnderlineColor(new Colorref(sprmOperation.getOperand()));
                    return;
                }
                characterProperties2.setIstd(sprmOperation.getOperand());
                return;
            }
            characterProperties2.setFcObj(sprmOperation.getOperand());
            return;
        }
        characterProperties2.setIcoHighlight((byte) sprmOperation.getOperand());
        characterProperties2.setFHighlight(SprmUncompressor.getFlag(sprmOperation.getOperand()));
    }

    public static CharacterProperties uncompressCHP(CharacterProperties characterProperties, byte[] bArr, int i10) {
        try {
            CharacterProperties characterProperties2 = (CharacterProperties) characterProperties.clone();
            SprmIterator sprmIterator = new SprmIterator(bArr, i10);
            while (sprmIterator.hasNext()) {
                SprmOperation next = sprmIterator.next();
                if (next.getType() == 2) {
                    unCompressCHPOperation(characterProperties, characterProperties2, next);
                }
            }
            return characterProperties2;
        } catch (CloneNotSupportedException unused) {
            throw new RuntimeException("There is no way this exception should happen!!");
        }
    }
}
