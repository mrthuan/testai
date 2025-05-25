package lib.zj.office.fc.hwpf.model;

import lib.zj.office.fc.hwpf.model.io.HWPFOutputStream;
import lib.zj.office.fc.hwpf.model.types.FRDAbstractType;
import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
public class NotesTables {
    private PlexOfCps descriptors;
    private final NoteType noteType;
    private PlexOfCps textPositions;

    public NotesTables(NoteType noteType) {
        this.descriptors = new PlexOfCps(FRDAbstractType.getSize());
        PlexOfCps plexOfCps = new PlexOfCps(0);
        this.textPositions = plexOfCps;
        this.noteType = noteType;
        plexOfCps.addProperty(new GenericPropertyNode(0, 1, new byte[0]));
    }

    private void read(byte[] bArr, FileInformationBlock fileInformationBlock) {
        int notesDescriptorsOffset = fileInformationBlock.getNotesDescriptorsOffset(this.noteType);
        int notesDescriptorsSize = fileInformationBlock.getNotesDescriptorsSize(this.noteType);
        if (notesDescriptorsOffset != 0 && notesDescriptorsSize != 0) {
            this.descriptors = new PlexOfCps(bArr, notesDescriptorsOffset, notesDescriptorsSize, FRDAbstractType.getSize());
        }
        int notesTextPositionsOffset = fileInformationBlock.getNotesTextPositionsOffset(this.noteType);
        int notesTextPositionsSize = fileInformationBlock.getNotesTextPositionsSize(this.noteType);
        if (notesTextPositionsOffset != 0 && notesTextPositionsSize != 0) {
            this.textPositions = new PlexOfCps(bArr, notesTextPositionsOffset, notesTextPositionsSize, 0);
        }
    }

    public GenericPropertyNode getDescriptor(int i10) {
        return this.descriptors.getProperty(i10);
    }

    public int getDescriptorsCount() {
        return this.descriptors.length();
    }

    public GenericPropertyNode getTextPosition(int i10) {
        return this.textPositions.getProperty(i10);
    }

    public void writeRef(FileInformationBlock fileInformationBlock, HWPFOutputStream hWPFOutputStream) {
        PlexOfCps plexOfCps = this.descriptors;
        if (plexOfCps != null && plexOfCps.length() != 0) {
            int offset = hWPFOutputStream.getOffset();
            hWPFOutputStream.write(this.descriptors.toByteArray());
            int offset2 = hWPFOutputStream.getOffset();
            fileInformationBlock.setNotesDescriptorsOffset(this.noteType, offset);
            fileInformationBlock.setNotesDescriptorsSize(this.noteType, offset2 - offset);
            return;
        }
        fileInformationBlock.setNotesDescriptorsOffset(this.noteType, hWPFOutputStream.getOffset());
        fileInformationBlock.setNotesDescriptorsSize(this.noteType, 0);
    }

    public void writeTxt(FileInformationBlock fileInformationBlock, HWPFOutputStream hWPFOutputStream) {
        PlexOfCps plexOfCps = this.textPositions;
        if (plexOfCps != null && plexOfCps.length() != 0) {
            int offset = hWPFOutputStream.getOffset();
            hWPFOutputStream.write(this.textPositions.toByteArray());
            int offset2 = hWPFOutputStream.getOffset();
            fileInformationBlock.setNotesTextPositionsOffset(this.noteType, offset);
            fileInformationBlock.setNotesTextPositionsSize(this.noteType, offset2 - offset);
            return;
        }
        fileInformationBlock.setNotesTextPositionsOffset(this.noteType, hWPFOutputStream.getOffset());
        fileInformationBlock.setNotesTextPositionsSize(this.noteType, 0);
    }

    public NotesTables(NoteType noteType, byte[] bArr, FileInformationBlock fileInformationBlock) {
        this.descriptors = new PlexOfCps(FRDAbstractType.getSize());
        this.textPositions = new PlexOfCps(0);
        this.noteType = noteType;
        read(bArr, fileInformationBlock);
    }
}
