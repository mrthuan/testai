package lib.zj.office.fc.hwpf.model;

import a0.a;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import lib.zj.office.fc.hwpf.model.types.FIBAbstractType;
import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
public final class FileInformationBlock extends FIBAbstractType implements Cloneable {
    FIBFieldHandler _fieldHandler;
    FIBLongHandler _longHandler;
    FIBShortHandler _shortHandler;

    public FileInformationBlock(byte[] bArr) {
        fillFields(bArr, 0);
    }

    public void clearOffsetsSizes() {
        this._fieldHandler.clearFields();
    }

    public void fillVariableFields(byte[] bArr, byte[] bArr2) {
        NoteType[] values;
        FIBShortHandler fIBShortHandler = new FIBShortHandler(bArr);
        this._shortHandler = fIBShortHandler;
        this._longHandler = new FIBLongHandler(bArr, fIBShortHandler.sizeInBytes() + 32);
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        hashSet.add(33);
        hashSet.add(31);
        hashSet.add(12);
        hashSet.add(13);
        hashSet.add(6);
        hashSet.add(73);
        hashSet.add(74);
        for (FieldsDocumentPart fieldsDocumentPart : FieldsDocumentPart.values()) {
            hashSet.add(Integer.valueOf(fieldsDocumentPart.getFibFieldsField()));
        }
        hashSet.add(22);
        hashSet.add(23);
        hashSet.add(21);
        for (NoteType noteType : NoteType.values()) {
            hashSet.add(Integer.valueOf(noteType.getFibDescriptorsFieldIndex()));
            hashSet.add(Integer.valueOf(noteType.getFibTextPositionsFieldIndex()));
        }
        hashSet.add(15);
        hashSet.add(51);
        hashSet.add(71);
        hashSet.add(87);
        this._fieldHandler = new FIBFieldHandler(bArr, this._longHandler.sizeInBytes() + this._shortHandler.sizeInBytes() + 32, bArr2, hashSet, true);
    }

    public int getCbMac() {
        return this._longHandler.getLong(0);
    }

    @Deprecated
    public int getCcpAtn() {
        return this._longHandler.getLong(7);
    }

    @Deprecated
    public int getCcpCommentAtn() {
        return getCcpAtn();
    }

    @Deprecated
    public int getCcpEdn() {
        return this._longHandler.getLong(8);
    }

    @Deprecated
    public int getCcpFtn() {
        return this._longHandler.getLong(4);
    }

    @Deprecated
    public int getCcpHdd() {
        return this._longHandler.getLong(5);
    }

    @Deprecated
    public int getCcpHdrTxtBx() {
        return this._longHandler.getLong(10);
    }

    @Deprecated
    public int getCcpText() {
        return this._longHandler.getLong(3);
    }

    @Deprecated
    public int getCcpTxtBx() {
        return this._longHandler.getLong(9);
    }

    public int getFSPAPlcfLength(FSPADocumentPart fSPADocumentPart) {
        return this._fieldHandler.getFieldSize(fSPADocumentPart.getFibFieldsField());
    }

    public int getFSPAPlcfOffset(FSPADocumentPart fSPADocumentPart) {
        return this._fieldHandler.getFieldOffset(fSPADocumentPart.getFibFieldsField());
    }

    public int getFcClx() {
        return this._fieldHandler.getFieldOffset(33);
    }

    public int getFcDggInfo() {
        return this._fieldHandler.getFieldOffset(50);
    }

    public int getFcDop() {
        return this._fieldHandler.getFieldOffset(31);
    }

    public int getFcPlcfLst() {
        return this._fieldHandler.getFieldOffset(73);
    }

    public int getFcPlcfTxbxBkd() {
        return this._fieldHandler.getFieldOffset(75);
    }

    public int getFcPlcfTxbxHdrBkd() {
        return this._fieldHandler.getFieldOffset(76);
    }

    public int getFcPlcfbkf() {
        return this._fieldHandler.getFieldOffset(22);
    }

    public int getFcPlcfbkl() {
        return this._fieldHandler.getFieldOffset(23);
    }

    public int getFcPlcfbteChpx() {
        return this._fieldHandler.getFieldOffset(12);
    }

    public int getFcPlcfbtePapx() {
        return this._fieldHandler.getFieldOffset(13);
    }

    @Deprecated
    public int getFcPlcffldAtn() {
        return this._fieldHandler.getFieldOffset(19);
    }

    @Deprecated
    public int getFcPlcffldEdn() {
        return this._fieldHandler.getFieldOffset(48);
    }

    @Deprecated
    public int getFcPlcffldFtn() {
        return this._fieldHandler.getFieldOffset(18);
    }

    @Deprecated
    public int getFcPlcffldHdr() {
        return this._fieldHandler.getFieldOffset(17);
    }

    @Deprecated
    public int getFcPlcffldHdrtxbx() {
        return this._fieldHandler.getFieldOffset(59);
    }

    @Deprecated
    public int getFcPlcffldMom() {
        return this._fieldHandler.getFieldOffset(16);
    }

    @Deprecated
    public int getFcPlcffldTxbx() {
        return this._fieldHandler.getFieldOffset(57);
    }

    public int getFcPlcfsed() {
        return this._fieldHandler.getFieldOffset(6);
    }

    @Deprecated
    public int getFcPlcspaMom() {
        return this._fieldHandler.getFieldOffset(40);
    }

    public int getFcPlfLfo() {
        return this._fieldHandler.getFieldOffset(74);
    }

    public int getFcStshf() {
        return this._fieldHandler.getFieldOffset(1);
    }

    public int getFcSttbSavedBy() {
        return this._fieldHandler.getFieldOffset(71);
    }

    public int getFcSttbfRMark() {
        return this._fieldHandler.getFieldOffset(51);
    }

    public int getFcSttbfbkmk() {
        return this._fieldHandler.getFieldOffset(21);
    }

    public int getFcSttbfffn() {
        return this._fieldHandler.getFieldOffset(15);
    }

    public int getFieldsPlcfLength(FieldsDocumentPart fieldsDocumentPart) {
        return this._fieldHandler.getFieldSize(fieldsDocumentPart.getFibFieldsField());
    }

    public int getFieldsPlcfOffset(FieldsDocumentPart fieldsDocumentPart) {
        return this._fieldHandler.getFieldOffset(fieldsDocumentPart.getFibFieldsField());
    }

    public int getLcbClx() {
        return this._fieldHandler.getFieldSize(33);
    }

    public int getLcbDggInfo() {
        return this._fieldHandler.getFieldSize(50);
    }

    public int getLcbDop() {
        return this._fieldHandler.getFieldSize(31);
    }

    public int getLcbPlcfLst() {
        return this._fieldHandler.getFieldSize(73);
    }

    public int getLcbPlcfTxbxBkd() {
        return this._fieldHandler.getFieldSize(75);
    }

    public int getLcbPlcfTxbxHdrBkd() {
        return this._fieldHandler.getFieldSize(76);
    }

    public int getLcbPlcfbkf() {
        return this._fieldHandler.getFieldSize(22);
    }

    public int getLcbPlcfbkl() {
        return this._fieldHandler.getFieldSize(23);
    }

    public int getLcbPlcfbteChpx() {
        return this._fieldHandler.getFieldSize(12);
    }

    public int getLcbPlcfbtePapx() {
        return this._fieldHandler.getFieldSize(13);
    }

    @Deprecated
    public int getLcbPlcffldAtn() {
        return this._fieldHandler.getFieldSize(19);
    }

    @Deprecated
    public int getLcbPlcffldEdn() {
        return this._fieldHandler.getFieldSize(48);
    }

    @Deprecated
    public int getLcbPlcffldFtn() {
        return this._fieldHandler.getFieldSize(18);
    }

    @Deprecated
    public int getLcbPlcffldHdr() {
        return this._fieldHandler.getFieldSize(17);
    }

    @Deprecated
    public int getLcbPlcffldHdrtxbx() {
        return this._fieldHandler.getFieldSize(59);
    }

    @Deprecated
    public int getLcbPlcffldMom() {
        return this._fieldHandler.getFieldSize(16);
    }

    @Deprecated
    public int getLcbPlcffldTxbx() {
        return this._fieldHandler.getFieldSize(57);
    }

    public int getLcbPlcfsed() {
        return this._fieldHandler.getFieldSize(6);
    }

    @Deprecated
    public int getLcbPlcspaMom() {
        return this._fieldHandler.getFieldSize(40);
    }

    public int getLcbPlfLfo() {
        return this._fieldHandler.getFieldSize(74);
    }

    public int getLcbStshf() {
        return this._fieldHandler.getFieldSize(1);
    }

    public int getLcbSttbSavedBy() {
        return this._fieldHandler.getFieldSize(71);
    }

    public int getLcbSttbfRMark() {
        return this._fieldHandler.getFieldSize(51);
    }

    public int getLcbSttbfbkmk() {
        return this._fieldHandler.getFieldSize(21);
    }

    public int getLcbSttbfffn() {
        return this._fieldHandler.getFieldSize(15);
    }

    public int getModifiedHigh() {
        return this._fieldHandler.getFieldSize(74);
    }

    public int getModifiedLow() {
        return this._fieldHandler.getFieldOffset(74);
    }

    public int getNotesDescriptorsOffset(NoteType noteType) {
        return this._fieldHandler.getFieldOffset(noteType.getFibDescriptorsFieldIndex());
    }

    public int getNotesDescriptorsSize(NoteType noteType) {
        return this._fieldHandler.getFieldSize(noteType.getFibDescriptorsFieldIndex());
    }

    public int getNotesTextPositionsOffset(NoteType noteType) {
        return this._fieldHandler.getFieldOffset(noteType.getFibTextPositionsFieldIndex());
    }

    public int getNotesTextPositionsSize(NoteType noteType) {
        return this._fieldHandler.getFieldSize(noteType.getFibTextPositionsFieldIndex());
    }

    public int getPlcfHddOffset() {
        return this._fieldHandler.getFieldOffset(11);
    }

    public int getPlcfHddSize() {
        return this._fieldHandler.getFieldSize(11);
    }

    @Override // lib.zj.office.fc.hwpf.model.types.FIBAbstractType
    public int getSize() {
        return this._fieldHandler.sizeInBytes() + this._longHandler.sizeInBytes() + this._shortHandler.sizeInBytes() + super.getSize();
    }

    public int getSubdocumentTextStreamLength(SubdocumentType subdocumentType) {
        return this._longHandler.getLong(subdocumentType.getFibLongFieldIndex());
    }

    public void setCbMac(int i10) {
        this._longHandler.setLong(0, i10);
    }

    @Deprecated
    public void setCcpAtn(int i10) {
        this._longHandler.setLong(7, i10);
    }

    @Deprecated
    public void setCcpEdn(int i10) {
        this._longHandler.setLong(8, i10);
    }

    @Deprecated
    public void setCcpFtn(int i10) {
        this._longHandler.setLong(4, i10);
    }

    @Deprecated
    public void setCcpHdd(int i10) {
        this._longHandler.setLong(5, i10);
    }

    @Deprecated
    public void setCcpHdrTxtBx(int i10) {
        this._longHandler.setLong(10, i10);
    }

    @Deprecated
    public void setCcpText(int i10) {
        this._longHandler.setLong(3, i10);
    }

    @Deprecated
    public void setCcpTxtBx(int i10) {
        this._longHandler.setLong(9, i10);
    }

    public void setFSPAPlcfLength(FSPADocumentPart fSPADocumentPart, int i10) {
        this._fieldHandler.setFieldSize(fSPADocumentPart.getFibFieldsField(), i10);
    }

    public void setFSPAPlcfOffset(FSPADocumentPart fSPADocumentPart, int i10) {
        this._fieldHandler.setFieldOffset(fSPADocumentPart.getFibFieldsField(), i10);
    }

    public void setFcClx(int i10) {
        this._fieldHandler.setFieldOffset(33, i10);
    }

    public void setFcDop(int i10) {
        this._fieldHandler.setFieldOffset(31, i10);
    }

    public void setFcPlcfLst(int i10) {
        this._fieldHandler.setFieldOffset(73, i10);
    }

    public void setFcPlcfbkf(int i10) {
        this._fieldHandler.setFieldOffset(22, i10);
    }

    public void setFcPlcfbkl(int i10) {
        this._fieldHandler.setFieldOffset(23, i10);
    }

    public void setFcPlcfbteChpx(int i10) {
        this._fieldHandler.setFieldOffset(12, i10);
    }

    public void setFcPlcfbtePapx(int i10) {
        this._fieldHandler.setFieldOffset(13, i10);
    }

    @Deprecated
    public void setFcPlcffldAtn(int i10) {
        this._fieldHandler.setFieldOffset(19, i10);
    }

    @Deprecated
    public void setFcPlcffldEdn(int i10) {
        this._fieldHandler.setFieldOffset(48, i10);
    }

    @Deprecated
    public void setFcPlcffldFtn(int i10) {
        this._fieldHandler.setFieldOffset(18, i10);
    }

    @Deprecated
    public void setFcPlcffldHdr(int i10) {
        this._fieldHandler.setFieldOffset(17, i10);
    }

    @Deprecated
    public void setFcPlcffldHdrtxbx(int i10) {
        this._fieldHandler.setFieldOffset(59, i10);
    }

    @Deprecated
    public void setFcPlcffldMom(int i10) {
        this._fieldHandler.setFieldOffset(16, i10);
    }

    @Deprecated
    public void setFcPlcffldTxbx(int i10) {
        this._fieldHandler.setFieldOffset(57, i10);
    }

    public void setFcPlcfsed(int i10) {
        this._fieldHandler.setFieldOffset(6, i10);
    }

    public void setFcPlfLfo(int i10) {
        this._fieldHandler.setFieldOffset(74, i10);
    }

    public void setFcStshf(int i10) {
        this._fieldHandler.setFieldOffset(1, i10);
    }

    public void setFcSttbSavedBy(int i10) {
        this._fieldHandler.setFieldOffset(71, i10);
    }

    public void setFcSttbfRMark(int i10) {
        this._fieldHandler.setFieldOffset(51, i10);
    }

    public void setFcSttbfbkmk(int i10) {
        this._fieldHandler.setFieldOffset(21, i10);
    }

    public void setFcSttbfffn(int i10) {
        this._fieldHandler.setFieldOffset(15, i10);
    }

    public void setFieldsPlcfLength(FieldsDocumentPart fieldsDocumentPart, int i10) {
        this._fieldHandler.setFieldSize(fieldsDocumentPart.getFibFieldsField(), i10);
    }

    public void setFieldsPlcfOffset(FieldsDocumentPart fieldsDocumentPart, int i10) {
        this._fieldHandler.setFieldOffset(fieldsDocumentPart.getFibFieldsField(), i10);
    }

    public void setLcbClx(int i10) {
        this._fieldHandler.setFieldSize(33, i10);
    }

    public void setLcbDop(int i10) {
        this._fieldHandler.setFieldSize(31, i10);
    }

    public void setLcbPlcfLst(int i10) {
        this._fieldHandler.setFieldSize(73, i10);
    }

    public void setLcbPlcfbkf(int i10) {
        this._fieldHandler.setFieldSize(22, i10);
    }

    public void setLcbPlcfbkl(int i10) {
        this._fieldHandler.setFieldSize(23, i10);
    }

    public void setLcbPlcfbteChpx(int i10) {
        this._fieldHandler.setFieldSize(12, i10);
    }

    public void setLcbPlcfbtePapx(int i10) {
        this._fieldHandler.setFieldSize(13, i10);
    }

    @Deprecated
    public void setLcbPlcffldAtn(int i10) {
        this._fieldHandler.setFieldSize(19, i10);
    }

    @Deprecated
    public void setLcbPlcffldEdn(int i10) {
        this._fieldHandler.setFieldSize(48, i10);
    }

    @Deprecated
    public void setLcbPlcffldFtn(int i10) {
        this._fieldHandler.setFieldSize(18, i10);
    }

    @Deprecated
    public void setLcbPlcffldHdr(int i10) {
        this._fieldHandler.setFieldSize(17, i10);
    }

    @Deprecated
    public void setLcbPlcffldHdrtxbx(int i10) {
        this._fieldHandler.setFieldSize(59, i10);
    }

    @Deprecated
    public void setLcbPlcffldMom(int i10) {
        this._fieldHandler.setFieldSize(16, i10);
    }

    @Deprecated
    public void setLcbPlcffldTxbx(int i10) {
        this._fieldHandler.setFieldSize(57, i10);
    }

    public void setLcbPlcfsed(int i10) {
        this._fieldHandler.setFieldSize(6, i10);
    }

    public void setLcbPlfLfo(int i10) {
        this._fieldHandler.setFieldSize(74, i10);
    }

    public void setLcbStshf(int i10) {
        this._fieldHandler.setFieldSize(1, i10);
    }

    public void setLcbSttbSavedBy(int i10) {
        this._fieldHandler.setFieldSize(71, i10);
    }

    public void setLcbSttbfRMark(int i10) {
        this._fieldHandler.setFieldSize(51, i10);
    }

    public void setLcbSttbfbkmk(int i10) {
        this._fieldHandler.setFieldSize(21, i10);
    }

    public void setLcbSttbfffn(int i10) {
        this._fieldHandler.setFieldSize(15, i10);
    }

    public void setModifiedHigh(int i10) {
        this._fieldHandler.setFieldSize(74, i10);
    }

    public void setModifiedLow(int i10) {
        this._fieldHandler.setFieldOffset(74, i10);
    }

    public void setNotesDescriptorsOffset(NoteType noteType, int i10) {
        this._fieldHandler.setFieldOffset(noteType.getFibDescriptorsFieldIndex(), i10);
    }

    public void setNotesDescriptorsSize(NoteType noteType, int i10) {
        this._fieldHandler.setFieldSize(noteType.getFibDescriptorsFieldIndex(), i10);
    }

    public void setNotesTextPositionsOffset(NoteType noteType, int i10) {
        this._fieldHandler.setFieldOffset(noteType.getFibTextPositionsFieldIndex(), i10);
    }

    public void setNotesTextPositionsSize(NoteType noteType, int i10) {
        this._fieldHandler.setFieldSize(noteType.getFibTextPositionsFieldIndex(), i10);
    }

    public void setPlcfHddOffset(int i10) {
        this._fieldHandler.setFieldOffset(11, i10);
    }

    public void setPlcfHddSize(int i10) {
        this._fieldHandler.setFieldSize(11, i10);
    }

    public void setSubdocumentTextStreamLength(SubdocumentType subdocumentType, int i10) {
        if (i10 >= 0) {
            this._longHandler.setLong(subdocumentType.getFibLongFieldIndex(), i10);
            return;
        }
        throw new IllegalArgumentException(a.g("Subdocument length can't be less than 0 (passed value is ", i10, "). If there is no subdocument length must be set to zero."));
    }

    @Override // lib.zj.office.fc.hwpf.model.types.FIBAbstractType
    public String toString() {
        SubdocumentType[] values;
        FieldsDocumentPart[] values2;
        NoteType[] values3;
        Method[] methods;
        StringBuilder sb2 = new StringBuilder(super.toString());
        sb2.append("[FIB2]\n\tSubdocuments info:\n");
        for (SubdocumentType subdocumentType : SubdocumentType.values()) {
            sb2.append("\t\t");
            sb2.append(subdocumentType);
            sb2.append(" has length of ");
            sb2.append(getSubdocumentTextStreamLength(subdocumentType));
            sb2.append(" char(s)\n");
        }
        sb2.append("\tFields PLCF info:\n");
        for (FieldsDocumentPart fieldsDocumentPart : FieldsDocumentPart.values()) {
            sb2.append("\t\t");
            sb2.append(fieldsDocumentPart);
            sb2.append(": PLCF starts at ");
            sb2.append(getFieldsPlcfOffset(fieldsDocumentPart));
            sb2.append(" and have length of ");
            sb2.append(getFieldsPlcfLength(fieldsDocumentPart));
            sb2.append("\n");
        }
        sb2.append("\tNotes PLCF info:\n");
        for (NoteType noteType : NoteType.values()) {
            sb2.append("\t\t");
            sb2.append(noteType);
            sb2.append(": descriptions starts ");
            sb2.append(getNotesDescriptorsOffset(noteType));
            sb2.append(" and have length of ");
            sb2.append(getNotesDescriptorsSize(noteType));
            sb2.append(" bytes\n\t\t");
            sb2.append(noteType);
            sb2.append(": text positions starts ");
            sb2.append(getNotesTextPositionsOffset(noteType));
            sb2.append(" and have length of ");
            sb2.append(getNotesTextPositionsSize(noteType));
            sb2.append(" bytes\n");
        }
        try {
            sb2.append("\tJava reflection info:\n");
            for (Method method : FileInformationBlock.class.getMethods()) {
                if (method.getName().startsWith("get") && Modifier.isPublic(method.getModifiers()) && !Modifier.isStatic(method.getModifiers()) && method.getParameterTypes().length <= 0) {
                    sb2.append("\t\t");
                    sb2.append(method.getName());
                    sb2.append(" => ");
                    sb2.append(method.invoke(this, new Object[0]));
                    sb2.append("\n");
                }
            }
        } catch (Exception e10) {
            sb2.append("(exc: " + e10.getMessage() + ")");
        }
        sb2.append("[/FIB2]\n");
        return sb2.toString();
    }
}
