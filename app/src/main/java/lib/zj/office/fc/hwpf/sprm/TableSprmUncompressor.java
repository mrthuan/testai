package lib.zj.office.fc.hwpf.sprm;

import lib.zj.office.fc.hpsf.Variant;
import lib.zj.office.fc.hwpf.usermodel.BorderCode;
import lib.zj.office.fc.hwpf.usermodel.TableCellDescriptor;
import lib.zj.office.fc.hwpf.usermodel.TableProperties;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.fc.util.POILogFactory;
import lib.zj.office.fc.util.POILogger;

@Internal
/* loaded from: classes3.dex */
public final class TableSprmUncompressor extends SprmUncompressor {
    private static final POILogger logger = POILogFactory.getLogger(TableSprmUncompressor.class);

    public static void unCompressTAPOperation(TableProperties tableProperties, SprmOperation sprmOperation) {
        boolean z10;
        int i10;
        int operation = sprmOperation.getOperation();
        if (operation != 0) {
            int i11 = 0;
            if (operation != 1) {
                if (operation != 2) {
                    if (operation != 3) {
                        if (operation != 4) {
                            if (operation != 5) {
                                if (operation != 7) {
                                    if (operation != 8) {
                                        if (operation != 33) {
                                            if (operation != 97) {
                                                if (operation != 51) {
                                                    if (operation == 52) {
                                                        byte b10 = sprmOperation.getGrpprl()[sprmOperation.getGrpprlOffset() + 1];
                                                        byte b11 = sprmOperation.getGrpprl()[sprmOperation.getGrpprlOffset() + 2];
                                                        byte b12 = sprmOperation.getGrpprl()[sprmOperation.getGrpprlOffset() + 3];
                                                        short s4 = LittleEndian.getShort(sprmOperation.getGrpprl(), sprmOperation.getGrpprlOffset() + 4);
                                                        for (int i12 = sprmOperation.getGrpprl()[sprmOperation.getGrpprlOffset()]; i12 < b10; i12++) {
                                                            TableCellDescriptor tableCellDescriptor = tableProperties.getRgtc()[i12];
                                                            if ((b11 & 1) != 0) {
                                                                tableCellDescriptor.setFtsCellPaddingTop(b12);
                                                                tableCellDescriptor.setWCellPaddingTop(s4);
                                                            }
                                                            if ((b11 & 2) != 0) {
                                                                tableCellDescriptor.setFtsCellPaddingLeft(b12);
                                                                tableCellDescriptor.setWCellPaddingLeft(s4);
                                                            }
                                                            if ((b11 & 4) != 0) {
                                                                tableCellDescriptor.setFtsCellPaddingBottom(b12);
                                                                tableCellDescriptor.setWCellPaddingBottom(s4);
                                                            }
                                                            if ((b11 & 8) != 0) {
                                                                tableCellDescriptor.setFtsCellPaddingRight(b12);
                                                                tableCellDescriptor.setWCellPaddingRight(s4);
                                                            }
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                                tableProperties.setTCellSpacingDefault(LittleEndian.getShort(sprmOperation.getGrpprl(), sprmOperation.getGrpprlOffset() + 4));
                                                return;
                                            }
                                            tableProperties.setTableIndent((short) (sprmOperation.getOperand() >> 8));
                                            return;
                                        }
                                        int operand = sprmOperation.getOperand();
                                        int i13 = ((-16777216) & operand) >> 24;
                                        int i14 = (16711680 & operand) >> 16;
                                        int i15 = operand & Variant.VT_ILLEGAL;
                                        short itcMac = tableProperties.getItcMac();
                                        int i16 = itcMac + i14;
                                        short[] sArr = new short[i16 + 1];
                                        TableCellDescriptor[] tableCellDescriptorArr = new TableCellDescriptor[i16];
                                        if (i13 >= itcMac) {
                                            System.arraycopy(tableProperties.getRgdxaCenter(), 0, sArr, 0, itcMac + 1);
                                            System.arraycopy(tableProperties.getRgtc(), 0, tableCellDescriptorArr, 0, itcMac);
                                            i13 = itcMac;
                                        } else {
                                            int i17 = i13 + 1;
                                            System.arraycopy(tableProperties.getRgdxaCenter(), 0, sArr, 0, i17);
                                            int i18 = i13 + i14;
                                            int i19 = itcMac - i13;
                                            System.arraycopy(tableProperties.getRgdxaCenter(), i17, sArr, i18, i19);
                                            System.arraycopy(tableProperties.getRgtc(), 0, tableCellDescriptorArr, 0, i13);
                                            System.arraycopy(tableProperties.getRgtc(), i13, tableCellDescriptorArr, i18, i19);
                                        }
                                        int i20 = i13;
                                        while (true) {
                                            int i21 = i13 + i14;
                                            if (i20 < i21) {
                                                tableCellDescriptorArr[i20] = new TableCellDescriptor();
                                                sArr[i20] = (short) (sArr[i20 - 1] + i15);
                                                i20++;
                                            } else {
                                                sArr[i21] = (short) (sArr[i21 - 1] + i15);
                                                return;
                                            }
                                        }
                                    } else {
                                        byte[] grpprl = sprmOperation.getGrpprl();
                                        int grpprlOffset = sprmOperation.getGrpprlOffset();
                                        int i22 = grpprl[grpprlOffset];
                                        int i23 = i22 + 1;
                                        short[] sArr2 = new short[i23];
                                        TableCellDescriptor[] tableCellDescriptorArr2 = new TableCellDescriptor[i22];
                                        tableProperties.setItcMac(i22);
                                        tableProperties.setRgdxaCenter(sArr2);
                                        tableProperties.setRgtc(tableCellDescriptorArr2);
                                        for (int i24 = 0; i24 < i22; i24++) {
                                            sArr2[i24] = LittleEndian.getShort(grpprl, (i24 * 2) + 1 + grpprlOffset);
                                        }
                                        int i25 = (i23 * 2) + 1;
                                        if (grpprlOffset + i25 < (sprmOperation.size() + grpprlOffset) - 6) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        while (i11 < i22) {
                                            if (z10 && (i10 = (i11 * 20) + i25 + grpprlOffset) < grpprl.length) {
                                                tableCellDescriptorArr2[i11] = TableCellDescriptor.convertBytesToTC(grpprl, i10);
                                            } else {
                                                tableCellDescriptorArr2[i11] = new TableCellDescriptor();
                                            }
                                            i11++;
                                        }
                                        sArr2[i22] = LittleEndian.getShort(grpprl, (i22 * 2) + 1 + grpprlOffset);
                                    }
                                } else {
                                    tableProperties.setDyaRowHeight(sprmOperation.getOperand());
                                }
                            } else {
                                byte[] grpprl2 = sprmOperation.getGrpprl();
                                int grpprlOffset2 = sprmOperation.getGrpprlOffset();
                                tableProperties.setBrcTop(new BorderCode(grpprl2, grpprlOffset2));
                                int i26 = grpprlOffset2 + 4;
                                tableProperties.setBrcLeft(new BorderCode(grpprl2, i26));
                                int i27 = i26 + 4;
                                tableProperties.setBrcBottom(new BorderCode(grpprl2, i27));
                                int i28 = i27 + 4;
                                tableProperties.setBrcRight(new BorderCode(grpprl2, i28));
                                int i29 = i28 + 4;
                                tableProperties.setBrcHorizontal(new BorderCode(grpprl2, i29));
                                tableProperties.setBrcVertical(new BorderCode(grpprl2, i29 + 4));
                            }
                        } else {
                            tableProperties.setFTableHeader(SprmUncompressor.getFlag(sprmOperation.getOperand()));
                        }
                    } else {
                        tableProperties.setFCantSplit(SprmUncompressor.getFlag(sprmOperation.getOperand()));
                    }
                } else {
                    short[] rgdxaCenter = tableProperties.getRgdxaCenter();
                    if (rgdxaCenter != null) {
                        rgdxaCenter[0] = (short) (rgdxaCenter[0] + (tableProperties.getDxaGapHalf() - sprmOperation.getOperand()));
                    }
                    tableProperties.setDxaGapHalf(sprmOperation.getOperand());
                }
            } else {
                short[] rgdxaCenter2 = tableProperties.getRgdxaCenter();
                short itcMac2 = tableProperties.getItcMac();
                int operand2 = sprmOperation.getOperand() - (tableProperties.getDxaGapHalf() + rgdxaCenter2[0]);
                while (i11 < itcMac2) {
                    rgdxaCenter2[i11] = (short) (rgdxaCenter2[i11] + operand2);
                    i11++;
                }
            }
        } else {
            tableProperties.setJc((short) sprmOperation.getOperand());
        }
    }

    @Deprecated
    public static TableProperties uncompressTAP(byte[] bArr, int i10) {
        TableProperties tableProperties = new TableProperties();
        SprmIterator sprmIterator = new SprmIterator(bArr, i10);
        while (sprmIterator.hasNext()) {
            SprmOperation next = sprmIterator.next();
            if (next.getType() == 5) {
                try {
                    unCompressTAPOperation(tableProperties, next);
                } catch (ArrayIndexOutOfBoundsException e10) {
                    logger.log(POILogger.ERROR, (Object) "Unable to apply ", (Object) next, (Object) ": ", (Object) e10, (Throwable) e10);
                }
            }
        }
        return tableProperties;
    }

    public static TableProperties uncompressTAP(SprmBuffer sprmBuffer) {
        TableProperties tableProperties;
        SprmOperation findSprm = sprmBuffer.findSprm((short) -10744);
        if (findSprm != null) {
            tableProperties = new TableProperties(findSprm.getGrpprl()[findSprm.getGrpprlOffset()]);
        } else {
            logger.log(POILogger.WARN, "Some table rows didn't specify number of columns in SPRMs");
            tableProperties = new TableProperties((short) 1);
        }
        sprmBuffer.findSprm((short) -10701);
        SprmIterator it = sprmBuffer.iterator();
        while (it.hasNext()) {
            SprmOperation next = it.next();
            if (next.getType() == 5 || next.getType() == 1) {
                try {
                    unCompressTAPOperation(tableProperties, next);
                } catch (ArrayIndexOutOfBoundsException e10) {
                    logger.log(POILogger.ERROR, (Object) "Unable to apply ", (Object) next, (Object) ": ", (Object) e10, (Throwable) e10);
                }
            }
        }
        return tableProperties;
    }
}
