package lib.zj.office.fc.hssf.model;

import java.util.Iterator;
import java.util.List;
import lib.zj.office.fc.ddf.EscherOptRecord;
import lib.zj.office.fc.ddf.EscherProperties;
import lib.zj.office.fc.ddf.EscherProperty;
import lib.zj.office.fc.ddf.EscherSimpleProperty;
import lib.zj.office.fc.hssf.record.CommonObjectDataSubRecord;
import lib.zj.office.fc.hssf.record.NoteRecord;
import lib.zj.office.fc.hssf.record.NoteStructureSubRecord;
import lib.zj.office.fc.hssf.record.ObjRecord;
import lib.zj.office.fc.hssf.record.SubRecord;
import lib.zj.office.fc.hssf.usermodel.HSSFComment;
import lib.zj.office.fc.hssf.usermodel.HSSFShape;

/* loaded from: classes3.dex */
public final class CommentShape extends TextboxShape {
    private NoteRecord _note;

    public CommentShape(HSSFComment hSSFComment, int i10) {
        super(hSSFComment, i10);
        this._note = createNoteRecord(hSSFComment, i10);
        ObjRecord objRecord = getObjRecord();
        List<SubRecord> subRecords = objRecord.getSubRecords();
        int i11 = 0;
        for (int i12 = 0; i12 < subRecords.size(); i12++) {
            SubRecord subRecord = subRecords.get(i12);
            if (subRecord instanceof CommonObjectDataSubRecord) {
                ((CommonObjectDataSubRecord) subRecord).setAutofill(false);
                i11 = i12;
            }
        }
        objRecord.addSubRecord(i11 + 1, new NoteStructureSubRecord());
    }

    private NoteRecord createNoteRecord(HSSFComment hSSFComment, int i10) {
        short s4;
        String author;
        NoteRecord noteRecord = new NoteRecord();
        noteRecord.setColumn(hSSFComment.getColumn());
        noteRecord.setRow(hSSFComment.getRow());
        if (hSSFComment.isVisible()) {
            s4 = 2;
        } else {
            s4 = 0;
        }
        noteRecord.setFlags(s4);
        noteRecord.setShapeId(i10);
        if (hSSFComment.getAuthor() == null) {
            author = "";
        } else {
            author = hSSFComment.getAuthor();
        }
        noteRecord.setAuthor(author);
        return noteRecord;
    }

    @Override // lib.zj.office.fc.hssf.model.AbstractShape
    public int addStandardOptions(HSSFShape hSSFShape, EscherOptRecord escherOptRecord) {
        int i10;
        super.addStandardOptions(hSSFShape, escherOptRecord);
        Iterator<EscherProperty> it = escherOptRecord.getEscherProperties().iterator();
        while (it.hasNext()) {
            short id2 = it.next().getId();
            if (id2 != 387 && id2 != 448 && id2 != 959) {
                switch (id2) {
                }
            }
            it.remove();
        }
        if (((HSSFComment) hSSFShape).isVisible()) {
            i10 = 655360;
        } else {
            i10 = 655362;
        }
        escherOptRecord.addEscherProperty(new EscherSimpleProperty((short) 959, i10));
        escherOptRecord.addEscherProperty(new EscherSimpleProperty(EscherProperties.SHADOWSTYLE__SHADOWOBSURED, 196611));
        escherOptRecord.addEscherProperty(new EscherSimpleProperty((short) 513, 0));
        escherOptRecord.sortProperties();
        return escherOptRecord.getEscherProperties().size();
    }

    public NoteRecord getNoteRecord() {
        return this._note;
    }

    @Override // lib.zj.office.fc.hssf.model.AbstractShape
    public int getCmoObjectId(int i10) {
        return i10;
    }
}
