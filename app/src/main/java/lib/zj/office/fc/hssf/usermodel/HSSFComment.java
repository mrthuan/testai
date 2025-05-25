package lib.zj.office.fc.hssf.usermodel;

import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.hssf.record.NoteRecord;
import lib.zj.office.fc.hssf.record.TextObjectRecord;
import lib.zj.office.fc.ss.usermodel.Comment;
import lib.zj.office.fc.ss.usermodel.RichTextString;

/* loaded from: classes3.dex */
public class HSSFComment extends HSSFTextbox implements Comment {
    private String _author;
    private int _col;
    private NoteRecord _note;
    private int _row;
    private TextObjectRecord _txo;
    private boolean _visible;

    public HSSFComment(EscherContainerRecord escherContainerRecord, HSSFShape hSSFShape, HSSFAnchor hSSFAnchor) {
        super(escherContainerRecord, hSSFShape, hSSFAnchor);
        setShapeType(25);
        setFillColor(134217808, FunctionEval.FunctionID.EXTERNAL_FUNC);
        this._visible = false;
        this._author = "";
    }

    @Override // lib.zj.office.fc.ss.usermodel.Comment
    public String getAuthor() {
        return this._author;
    }

    @Override // lib.zj.office.fc.ss.usermodel.Comment
    public int getColumn() {
        return this._col;
    }

    public NoteRecord getNoteRecord() {
        return this._note;
    }

    @Override // lib.zj.office.fc.ss.usermodel.Comment
    public int getRow() {
        return this._row;
    }

    @Override // lib.zj.office.fc.ss.usermodel.Comment
    public /* bridge */ /* synthetic */ RichTextString getString() {
        return super.getString();
    }

    public TextObjectRecord getTextObjectRecord() {
        return this._txo;
    }

    @Override // lib.zj.office.fc.ss.usermodel.Comment
    public boolean isVisible() {
        return this._visible;
    }

    @Override // lib.zj.office.fc.ss.usermodel.Comment
    public void setAuthor(String str) {
        NoteRecord noteRecord = this._note;
        if (noteRecord != null) {
            noteRecord.setAuthor(str);
        }
        this._author = str;
    }

    @Override // lib.zj.office.fc.ss.usermodel.Comment
    public void setColumn(int i10) {
        NoteRecord noteRecord = this._note;
        if (noteRecord != null) {
            noteRecord.setColumn(i10);
        }
        this._col = i10;
    }

    @Override // lib.zj.office.fc.ss.usermodel.Comment
    public void setRow(int i10) {
        NoteRecord noteRecord = this._note;
        if (noteRecord != null) {
            noteRecord.setRow(i10);
        }
        this._row = i10;
    }

    @Override // lib.zj.office.fc.hssf.usermodel.HSSFTextbox, lib.zj.office.fc.ss.usermodel.Comment
    public void setString(RichTextString richTextString) {
        HSSFRichTextString hSSFRichTextString = (HSSFRichTextString) richTextString;
        if (hSSFRichTextString.numFormattingRuns() == 0) {
            hSSFRichTextString.applyFont((short) 0);
        }
        TextObjectRecord textObjectRecord = this._txo;
        if (textObjectRecord != null) {
            textObjectRecord.setStr(hSSFRichTextString);
        }
        super.setString(richTextString);
    }

    @Override // lib.zj.office.fc.ss.usermodel.Comment
    public void setVisible(boolean z10) {
        short s4;
        NoteRecord noteRecord = this._note;
        if (noteRecord != null) {
            if (z10) {
                s4 = 2;
            } else {
                s4 = 0;
            }
            noteRecord.setFlags(s4);
        }
        this._visible = z10;
    }

    @Deprecated
    public void setColumn(short s4) {
        setColumn((int) s4);
    }

    public HSSFComment(NoteRecord noteRecord, TextObjectRecord textObjectRecord) {
        this(null, null, null);
        this._txo = textObjectRecord;
        this._note = noteRecord;
    }
}
