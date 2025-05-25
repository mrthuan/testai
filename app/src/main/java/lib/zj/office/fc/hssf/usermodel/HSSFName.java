package lib.zj.office.fc.hssf.usermodel;

import a0.a;
import a6.h;
import androidx.activity.f;
import androidx.appcompat.view.menu.d;
import di.e;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;
import lib.zj.office.fc.hssf.model.InternalWorkbook;
import lib.zj.office.fc.hssf.record.NameCommentRecord;
import lib.zj.office.fc.hssf.record.NameRecord;
import lib.zj.office.fc.ss.usermodel.Name;

/* loaded from: classes3.dex */
public final class HSSFName implements Name {
    private e _book;
    private NameCommentRecord _commentRec;
    private NameRecord _definedNameRec;

    public HSSFName(e eVar, NameRecord nameRecord) {
        this(eVar, nameRecord, null);
    }

    private static void validateName(String str) {
        if (str.length() != 0) {
            char charAt = str.charAt(0);
            if ((charAt == '_' || Character.isLetter(charAt)) && str.indexOf(32) == -1) {
                return;
            }
            throw new IllegalArgumentException(h.d("Invalid name: '", str, "'; Names must begin with a letter or underscore and not contain spaces"));
        }
        throw new IllegalArgumentException("Name cannot be blank");
    }

    @Override // lib.zj.office.fc.ss.usermodel.Name
    public String getComment() {
        NameCommentRecord nameCommentRecord = this._commentRec;
        if (nameCommentRecord != null && nameCommentRecord.getCommentText() != null && this._commentRec.getCommentText().length() > 0) {
            return this._commentRec.getCommentText();
        }
        return this._definedNameRec.getDescriptionText();
    }

    @Override // lib.zj.office.fc.ss.usermodel.Name
    public String getNameName() {
        return this._definedNameRec.getNameText();
    }

    public String getReference() {
        return getRefersToFormula();
    }

    @Override // lib.zj.office.fc.ss.usermodel.Name
    public String getRefersToFormula() {
        return null;
    }

    public Ptg[] getRefersToFormulaDefinition() {
        if (!this._definedNameRec.isFunctionName()) {
            return this._definedNameRec.getNameDefinition();
        }
        throw new IllegalStateException("Only applicable to named ranges");
    }

    @Override // lib.zj.office.fc.ss.usermodel.Name
    public int getSheetIndex() {
        return this._definedNameRec.getSheetNumber() - 1;
    }

    @Override // lib.zj.office.fc.ss.usermodel.Name
    public String getSheetName() {
        return this._book.f16209m.findSheetNameFromExternSheet(this._definedNameRec.getExternSheetNumber());
    }

    @Override // lib.zj.office.fc.ss.usermodel.Name
    public boolean isDeleted() {
        return Ptg.doesFormulaReferToDeletedCell(this._definedNameRec.getNameDefinition());
    }

    @Override // lib.zj.office.fc.ss.usermodel.Name
    public boolean isFunctionName() {
        return this._definedNameRec.isFunctionName();
    }

    @Override // lib.zj.office.fc.ss.usermodel.Name
    public void setComment(String str) {
        this._definedNameRec.setDescriptionText(str);
        NameCommentRecord nameCommentRecord = this._commentRec;
        if (nameCommentRecord != null) {
            nameCommentRecord.setCommentText(str);
        }
    }

    @Override // lib.zj.office.fc.ss.usermodel.Name
    public void setFunction(boolean z10) {
        this._definedNameRec.setFunction(z10);
    }

    @Override // lib.zj.office.fc.ss.usermodel.Name
    public void setNameName(String str) {
        String str2;
        validateName(str);
        InternalWorkbook internalWorkbook = this._book.f16209m;
        this._definedNameRec.setNameText(str);
        int sheetNumber = this._definedNameRec.getSheetNumber();
        int numNames = internalWorkbook.getNumNames();
        while (true) {
            numNames--;
            if (numNames >= 0) {
                NameRecord nameRecord = internalWorkbook.getNameRecord(numNames);
                if (nameRecord != this._definedNameRec && nameRecord.getNameText().equalsIgnoreCase(str) && sheetNumber == nameRecord.getSheetNumber()) {
                    StringBuilder sb2 = new StringBuilder("The ");
                    if (sheetNumber == 0) {
                        str2 = "workbook";
                    } else {
                        str2 = "sheet";
                    }
                    String o10 = f.o(sb2, str2, " already contains this name: ", str);
                    this._definedNameRec.setNameText(str + "(2)");
                    throw new IllegalArgumentException(o10);
                }
            } else {
                NameCommentRecord nameCommentRecord = this._commentRec;
                if (nameCommentRecord != null) {
                    nameCommentRecord.getNameText();
                    this._commentRec.setNameText(str);
                    this._book.f16209m.updateNameCommentRecordCache(this._commentRec);
                    return;
                }
                return;
            }
        }
    }

    public void setReference(String str) {
        setRefersToFormula(str);
    }

    @Override // lib.zj.office.fc.ss.usermodel.Name
    public void setSheetIndex(int i10) {
        String g10;
        int numberOfSheets = this._book.getNumberOfSheets() - 1;
        if (i10 >= -1 && i10 <= numberOfSheets) {
            this._definedNameRec.setSheetNumber(i10 + 1);
            return;
        }
        StringBuilder e10 = d.e("Sheet index (", i10, ") is out of range");
        if (numberOfSheets == -1) {
            g10 = "";
        } else {
            g10 = a.g(" (0..", numberOfSheets, ")");
        }
        e10.append(g10);
        throw new IllegalArgumentException(e10.toString());
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(64);
        a0.d.h(HSSFName.class, stringBuffer, " [");
        stringBuffer.append(this._definedNameRec.getNameText());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public HSSFName(e eVar, NameRecord nameRecord, NameCommentRecord nameCommentRecord) {
        this._book = eVar;
        this._definedNameRec = nameRecord;
        this._commentRec = nameCommentRecord;
    }

    public void dispose() {
    }

    @Override // lib.zj.office.fc.ss.usermodel.Name
    public void setRefersToFormula(String str) {
    }
}
