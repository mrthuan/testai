package lib.zj.office.fc.hwpf.usermodel;

import java.util.HashMap;
import java.util.Map;
import lib.zj.office.fc.hwpf.model.NotesTables;

/* loaded from: classes3.dex */
public class NotesImpl implements Notes {
    private Map<Integer, Integer> anchorToIndexMap = null;
    private final NotesTables notesTables;

    public NotesImpl(NotesTables notesTables) {
        this.notesTables = notesTables;
    }

    private void updateAnchorToIndexMap() {
        if (this.anchorToIndexMap != null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < this.notesTables.getDescriptorsCount(); i10++) {
            hashMap.put(Integer.valueOf(this.notesTables.getDescriptor(i10).getStart()), Integer.valueOf(i10));
        }
        this.anchorToIndexMap = hashMap;
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Notes
    public int getNoteAnchorPosition(int i10) {
        return this.notesTables.getDescriptor(i10).getStart();
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Notes
    public int getNoteIndexByAnchorPosition(int i10) {
        updateAnchorToIndexMap();
        Integer num = this.anchorToIndexMap.get(Integer.valueOf(i10));
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Notes
    public int getNoteTextEndOffset(int i10) {
        return this.notesTables.getTextPosition(i10).getEnd();
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Notes
    public int getNoteTextStartOffset(int i10) {
        return this.notesTables.getTextPosition(i10).getStart();
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Notes
    public int getNotesCount() {
        return this.notesTables.getDescriptorsCount();
    }
}
