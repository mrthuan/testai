package lib.zj.office.fc.hslf;

import lib.zj.office.fc.hslf.exceptions.CorruptPowerPointFileException;
import lib.zj.office.fc.hslf.record.CurrentUserAtom;
import lib.zj.office.fc.hslf.record.DocumentEncryptionAtom;
import lib.zj.office.fc.hslf.record.PersistPtrHolder;
import lib.zj.office.fc.hslf.record.Record;
import lib.zj.office.fc.hslf.record.UserEditAtom;

/* loaded from: classes3.dex */
public final class EncryptedSlideShow {
    public static boolean checkIfEncrypted(HSLFSlideShow hSLFSlideShow) {
        return false;
    }

    public static DocumentEncryptionAtom fetchDocumentEncryptionAtom(HSLFSlideShow hSLFSlideShow) {
        int[] knownSlideIDs;
        CurrentUserAtom currentUserAtom = hSLFSlideShow.getCurrentUserAtom();
        if (currentUserAtom.getCurrentEditOffset() != 0) {
            if (currentUserAtom.getCurrentEditOffset() <= hSLFSlideShow.getUnderlyingBytes().length) {
                try {
                    Record buildRecordAtOffset = Record.buildRecordAtOffset(hSLFSlideShow.getUnderlyingBytes(), (int) currentUserAtom.getCurrentEditOffset());
                    if (buildRecordAtOffset == null || !(buildRecordAtOffset instanceof UserEditAtom)) {
                        return null;
                    }
                    Record buildRecordAtOffset2 = Record.buildRecordAtOffset(hSLFSlideShow.getUnderlyingBytes(), ((UserEditAtom) buildRecordAtOffset).getPersistPointersOffset());
                    if (!(buildRecordAtOffset2 instanceof PersistPtrHolder)) {
                        return null;
                    }
                    PersistPtrHolder persistPtrHolder = (PersistPtrHolder) buildRecordAtOffset2;
                    int i10 = -1;
                    for (int i11 : persistPtrHolder.getKnownSlideIDs()) {
                        if (i11 > i10) {
                            i10 = i11;
                        }
                    }
                    if (i10 == -1) {
                        return null;
                    }
                    Record buildRecordAtOffset3 = Record.buildRecordAtOffset(hSLFSlideShow.getUnderlyingBytes(), persistPtrHolder.getSlideLocationsLookup().get(Integer.valueOf(i10)).intValue());
                    if (buildRecordAtOffset3 instanceof DocumentEncryptionAtom) {
                        return (DocumentEncryptionAtom) buildRecordAtOffset3;
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                    return null;
                }
            } else {
                throw new CorruptPowerPointFileException("The CurrentUserAtom claims that the offset of last edit details are past the end of the file");
            }
        }
        return null;
    }
}
