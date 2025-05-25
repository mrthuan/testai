package lib.zj.office.fc.hwpf.sprm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import lib.zj.office.fc.hwpf.usermodel.BorderCode;
import lib.zj.office.fc.hwpf.usermodel.DateAndTime;
import lib.zj.office.fc.hwpf.usermodel.DropCapSpecifier;
import lib.zj.office.fc.hwpf.usermodel.LineSpacingDescriptor;
import lib.zj.office.fc.hwpf.usermodel.ParagraphProperties;
import lib.zj.office.fc.hwpf.usermodel.ShadingDescriptor;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.fc.util.POILogFactory;
import lib.zj.office.fc.util.POILogger;

@Internal
/* loaded from: classes3.dex */
public final class ParagraphSprmUncompressor extends SprmUncompressor {
    private static final POILogger logger = POILogFactory.getLogger(ParagraphSprmUncompressor.class);

    private static void handleTabs(ParagraphProperties paragraphProperties, SprmOperation sprmOperation) {
        byte[] grpprl = sprmOperation.getGrpprl();
        int grpprlOffset = sprmOperation.getGrpprlOffset();
        int i10 = grpprlOffset + 1;
        byte b10 = grpprl[grpprlOffset];
        int[] rgdxaTab = paragraphProperties.getRgdxaTab();
        byte[] rgtbd = paragraphProperties.getRgtbd();
        HashMap hashMap = new HashMap();
        for (int i11 = 0; i11 < rgdxaTab.length; i11++) {
            hashMap.put(Integer.valueOf(rgdxaTab[i11]), Byte.valueOf(rgtbd[i11]));
        }
        for (int i12 = 0; i12 < b10; i12++) {
            short s4 = LittleEndian.getShort(grpprl, i10);
            hashMap.remove(Integer.valueOf(s4));
            paragraphProperties.setTabClearPosition((short) Math.max((int) paragraphProperties.getTabClearPosition(), (int) s4));
            i10 += 2;
        }
        int i13 = i10 + 1;
        byte b11 = grpprl[i10];
        int i14 = i13;
        for (int i15 = 0; i15 < b11; i15++) {
            hashMap.put(Integer.valueOf(LittleEndian.getShort(grpprl, i14)), Byte.valueOf(grpprl[(b11 * 2) + i15 + i13]));
            i14 += 2;
        }
        int size = hashMap.size();
        int[] iArr = new int[size];
        byte[] bArr = new byte[size];
        ArrayList arrayList = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList);
        for (int i16 = 0; i16 < size; i16++) {
            Integer num = (Integer) arrayList.get(i16);
            iArr[i16] = num.intValue();
            bArr[i16] = ((Byte) hashMap.get(num)).byteValue();
        }
        paragraphProperties.setRgdxaTab(iArr);
        paragraphProperties.setRgtbd(bArr);
    }

    public static void unCompressPAPOperation(ParagraphProperties paragraphProperties, SprmOperation sprmOperation) {
        int operation = sprmOperation.getOperation();
        if (operation != 0) {
            boolean z10 = false;
            if (operation != 67) {
                if (operation != 69) {
                    if (operation != 97) {
                        switch (operation) {
                            case 2:
                                if (paragraphProperties.getIstd() <= 9 || paragraphProperties.getIstd() >= 1) {
                                    byte operand = (byte) sprmOperation.getOperand();
                                    paragraphProperties.setIstd(paragraphProperties.getIstd() + operand);
                                    paragraphProperties.setLvl((byte) (paragraphProperties.getLvl() + operand));
                                    if (((operand >> 7) & 1) == 1) {
                                        paragraphProperties.setIstd(Math.max(paragraphProperties.getIstd(), 1));
                                        return;
                                    } else {
                                        paragraphProperties.setIstd(Math.min(paragraphProperties.getIstd(), 9));
                                        return;
                                    }
                                }
                                return;
                            case 3:
                                paragraphProperties.setJc((byte) sprmOperation.getOperand());
                                return;
                            case 4:
                                if (sprmOperation.getOperand() != 0) {
                                    z10 = true;
                                }
                                paragraphProperties.setFSideBySide(z10);
                                return;
                            case 5:
                                if (sprmOperation.getOperand() != 0) {
                                    z10 = true;
                                }
                                paragraphProperties.setFKeep(z10);
                                return;
                            case 6:
                                if (sprmOperation.getOperand() != 0) {
                                    z10 = true;
                                }
                                paragraphProperties.setFKeepFollow(z10);
                                return;
                            case 7:
                                if (sprmOperation.getOperand() != 0) {
                                    z10 = true;
                                }
                                paragraphProperties.setFPageBreakBefore(z10);
                                return;
                            case 8:
                                paragraphProperties.setBrcl((byte) sprmOperation.getOperand());
                                return;
                            case 9:
                                paragraphProperties.setBrcp((byte) sprmOperation.getOperand());
                                return;
                            case 10:
                                paragraphProperties.setIlvl((byte) sprmOperation.getOperand());
                                return;
                            case 11:
                                paragraphProperties.setIlfo(sprmOperation.getOperand());
                                return;
                            case 12:
                                if (sprmOperation.getOperand() != 0) {
                                    z10 = true;
                                }
                                paragraphProperties.setFNoLnn(z10);
                                return;
                            case 13:
                                handleTabs(paragraphProperties, sprmOperation);
                                return;
                            case 14:
                                paragraphProperties.setDxaRight(sprmOperation.getOperand());
                                return;
                            case 15:
                                paragraphProperties.setDxaLeft(sprmOperation.getOperand());
                                return;
                            case 16:
                                paragraphProperties.setDxaLeft(sprmOperation.getOperand() + paragraphProperties.getDxaLeft());
                                paragraphProperties.setDxaLeft(Math.max(0, paragraphProperties.getDxaLeft()));
                                return;
                            case 17:
                                paragraphProperties.setDxaLeft1(sprmOperation.getOperand());
                                return;
                            case 18:
                                paragraphProperties.setLspd(new LineSpacingDescriptor(sprmOperation.getGrpprl(), sprmOperation.getGrpprlOffset()));
                                return;
                            case 19:
                                paragraphProperties.setDyaBefore(sprmOperation.getOperand());
                                return;
                            case 20:
                                paragraphProperties.setDyaAfter(sprmOperation.getOperand());
                                return;
                            default:
                                switch (operation) {
                                    case 22:
                                        if (sprmOperation.getOperand() != 0) {
                                            z10 = true;
                                        }
                                        paragraphProperties.setFInTable(z10);
                                        return;
                                    case 23:
                                        if (sprmOperation.getOperand() != 0) {
                                            z10 = true;
                                        }
                                        paragraphProperties.setFTtp(z10);
                                        return;
                                    case 24:
                                        paragraphProperties.setDxaAbs(sprmOperation.getOperand());
                                        return;
                                    case 25:
                                        paragraphProperties.setDyaAbs(sprmOperation.getOperand());
                                        return;
                                    case 26:
                                        paragraphProperties.setDxaWidth(sprmOperation.getOperand());
                                        return;
                                    case 27:
                                        byte operand2 = (byte) sprmOperation.getOperand();
                                        byte b10 = (byte) ((operand2 & 12) >> 2);
                                        byte b11 = (byte) (operand2 & 3);
                                        if (b10 != 3) {
                                            paragraphProperties.setPcVert(b10);
                                        }
                                        if (b11 != 3) {
                                            paragraphProperties.setPcHorz(b11);
                                            return;
                                        }
                                        return;
                                    default:
                                        switch (operation) {
                                            case 34:
                                                paragraphProperties.setDxaFromText(sprmOperation.getOperand());
                                                return;
                                            case 35:
                                                paragraphProperties.setWr((byte) sprmOperation.getOperand());
                                                return;
                                            case 36:
                                                paragraphProperties.setBrcTop(new BorderCode(sprmOperation.getGrpprl(), sprmOperation.getGrpprlOffset()));
                                                return;
                                            case 37:
                                                paragraphProperties.setBrcLeft(new BorderCode(sprmOperation.getGrpprl(), sprmOperation.getGrpprlOffset()));
                                                return;
                                            case 38:
                                                paragraphProperties.setBrcBottom(new BorderCode(sprmOperation.getGrpprl(), sprmOperation.getGrpprlOffset()));
                                                return;
                                            case 39:
                                                paragraphProperties.setBrcRight(new BorderCode(sprmOperation.getGrpprl(), sprmOperation.getGrpprlOffset()));
                                                return;
                                            case 40:
                                                paragraphProperties.setBrcBetween(new BorderCode(sprmOperation.getGrpprl(), sprmOperation.getGrpprlOffset()));
                                                return;
                                            case 41:
                                                paragraphProperties.setBrcBar(new BorderCode(sprmOperation.getGrpprl(), sprmOperation.getGrpprlOffset()));
                                                return;
                                            case 42:
                                                if (sprmOperation.getOperand() != 0) {
                                                    z10 = true;
                                                }
                                                paragraphProperties.setFNoAutoHyph(z10);
                                                return;
                                            case 43:
                                                paragraphProperties.setDyaHeight(sprmOperation.getOperand());
                                                return;
                                            case 44:
                                                paragraphProperties.setDcs(new DropCapSpecifier((short) sprmOperation.getOperand()));
                                                return;
                                            case 45:
                                                paragraphProperties.setShd(new ShadingDescriptor((short) sprmOperation.getOperand()));
                                                return;
                                            case 46:
                                                paragraphProperties.setDyaFromText(sprmOperation.getOperand());
                                                return;
                                            case 47:
                                                paragraphProperties.setDxaFromText(sprmOperation.getOperand());
                                                return;
                                            case 48:
                                                if (sprmOperation.getOperand() != 0) {
                                                    z10 = true;
                                                }
                                                paragraphProperties.setFLocked(z10);
                                                return;
                                            case 49:
                                                if (sprmOperation.getOperand() != 0) {
                                                    z10 = true;
                                                }
                                                paragraphProperties.setFWidowControl(z10);
                                                return;
                                            default:
                                                switch (operation) {
                                                    case 51:
                                                        if (sprmOperation.getOperand() != 0) {
                                                            z10 = true;
                                                        }
                                                        paragraphProperties.setFKinsoku(z10);
                                                        return;
                                                    case 52:
                                                        if (sprmOperation.getOperand() != 0) {
                                                            z10 = true;
                                                        }
                                                        paragraphProperties.setFWordWrap(z10);
                                                        return;
                                                    case 53:
                                                        if (sprmOperation.getOperand() != 0) {
                                                            z10 = true;
                                                        }
                                                        paragraphProperties.setFOverflowPunct(z10);
                                                        return;
                                                    case 54:
                                                        if (sprmOperation.getOperand() != 0) {
                                                            z10 = true;
                                                        }
                                                        paragraphProperties.setFTopLinePunct(z10);
                                                        return;
                                                    case 55:
                                                        if (sprmOperation.getOperand() != 0) {
                                                            z10 = true;
                                                        }
                                                        paragraphProperties.setFAutoSpaceDE(z10);
                                                        return;
                                                    case 56:
                                                        if (sprmOperation.getOperand() != 0) {
                                                            z10 = true;
                                                        }
                                                        paragraphProperties.setFAutoSpaceDN(z10);
                                                        return;
                                                    case 57:
                                                        paragraphProperties.setWAlignFont(sprmOperation.getOperand());
                                                        return;
                                                    case 58:
                                                        paragraphProperties.setFontAlign((short) sprmOperation.getOperand());
                                                        return;
                                                    default:
                                                        switch (operation) {
                                                            case 62:
                                                                int size = sprmOperation.size() - 3;
                                                                byte[] bArr = new byte[size];
                                                                System.arraycopy(bArr, 0, sprmOperation.getGrpprl(), sprmOperation.getGrpprlOffset(), size);
                                                                paragraphProperties.setAnld(bArr);
                                                                return;
                                                            case 63:
                                                                try {
                                                                    byte[] grpprl = sprmOperation.getGrpprl();
                                                                    int grpprlOffset = sprmOperation.getGrpprlOffset();
                                                                    if (grpprl[grpprlOffset] != 0) {
                                                                        z10 = true;
                                                                    }
                                                                    paragraphProperties.setFPropRMark(z10);
                                                                    paragraphProperties.setIbstPropRMark(LittleEndian.getShort(grpprl, grpprlOffset + 1));
                                                                    paragraphProperties.setDttmPropRMark(new DateAndTime(grpprl, grpprlOffset + 3));
                                                                    return;
                                                                } catch (Exception e10) {
                                                                    e10.printStackTrace();
                                                                    return;
                                                                }
                                                            case 64:
                                                                paragraphProperties.setLvl((byte) sprmOperation.getOperand());
                                                                return;
                                                            case 65:
                                                                if (sprmOperation.getOperand() != 0) {
                                                                    z10 = true;
                                                                }
                                                                paragraphProperties.setFBiDi(z10);
                                                                return;
                                                            default:
                                                                switch (operation) {
                                                                    case 71:
                                                                        if (sprmOperation.getOperand() != 0) {
                                                                            z10 = true;
                                                                        }
                                                                        paragraphProperties.setFUsePgsuSettings(z10);
                                                                        return;
                                                                    case 72:
                                                                        if (sprmOperation.getOperand() != 0) {
                                                                            z10 = true;
                                                                        }
                                                                        paragraphProperties.setFAdjustRight(z10);
                                                                        return;
                                                                    case 73:
                                                                        paragraphProperties.setItap(sprmOperation.getOperand());
                                                                        return;
                                                                    case 74:
                                                                        paragraphProperties.setItap((byte) (sprmOperation.getOperand() + paragraphProperties.getItap()));
                                                                        return;
                                                                    case 75:
                                                                        if (sprmOperation.getOperand() != 0) {
                                                                            z10 = true;
                                                                        }
                                                                        paragraphProperties.setFInnerTableCell(z10);
                                                                        return;
                                                                    case 76:
                                                                        if (sprmOperation.getOperand() != 0) {
                                                                            z10 = true;
                                                                        }
                                                                        paragraphProperties.setFTtpEmbedded(z10);
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
                    paragraphProperties.setJustificationLogical((byte) sprmOperation.getOperand());
                    return;
                } else if (sprmOperation.getSizeCode() == 6) {
                    int size2 = sprmOperation.size() - 3;
                    byte[] bArr2 = new byte[size2];
                    System.arraycopy(bArr2, 0, sprmOperation.getGrpprl(), sprmOperation.getGrpprlOffset(), size2);
                    paragraphProperties.setNumrm(bArr2);
                    return;
                } else {
                    return;
                }
            }
            if (sprmOperation.getOperand() != 0) {
                z10 = true;
            }
            paragraphProperties.setFNumRMIns(z10);
            return;
        }
        paragraphProperties.setIstd(sprmOperation.getOperand());
    }

    public static ParagraphProperties uncompressPAP(ParagraphProperties paragraphProperties, byte[] bArr, int i10) {
        try {
            ParagraphProperties paragraphProperties2 = (ParagraphProperties) paragraphProperties.clone();
            SprmIterator sprmIterator = new SprmIterator(bArr, i10);
            while (sprmIterator.hasNext()) {
                SprmOperation next = sprmIterator.next();
                if (next.getType() == 1) {
                    try {
                        unCompressPAPOperation(paragraphProperties2, next);
                    } catch (Exception e10) {
                        POILogger pOILogger = logger;
                        int i11 = POILogger.ERROR;
                        pOILogger.log(i11, (Object) ("Unable to apply SPRM operation '" + next.getOperation() + "': "), (Throwable) e10);
                    }
                }
            }
            return paragraphProperties2;
        } catch (CloneNotSupportedException unused) {
            throw new RuntimeException("There is no way this exception should happen!!");
        }
    }
}
