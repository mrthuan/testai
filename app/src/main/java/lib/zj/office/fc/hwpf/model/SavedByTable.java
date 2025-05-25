package lib.zj.office.fc.hwpf.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import lib.zj.office.fc.hwpf.model.io.HWPFOutputStream;
import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
public final class SavedByTable {
    private SavedByEntry[] entries;

    public SavedByTable(byte[] bArr, int i10, int i11) {
        String[] read = SttbfUtils.read(bArr, i10);
        int length = read.length / 2;
        this.entries = new SavedByEntry[length];
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = i12 * 2;
            this.entries[i12] = new SavedByEntry(read[i13], read[i13 + 1]);
        }
    }

    public List<SavedByEntry> getEntries() {
        return Collections.unmodifiableList(Arrays.asList(this.entries));
    }

    public void writeTo(HWPFOutputStream hWPFOutputStream) {
        SavedByEntry[] savedByEntryArr = this.entries;
        String[] strArr = new String[savedByEntryArr.length * 2];
        int i10 = 0;
        for (SavedByEntry savedByEntry : savedByEntryArr) {
            int i11 = i10 + 1;
            strArr[i10] = savedByEntry.getUserName();
            i10 = i11 + 1;
            strArr[i11] = savedByEntry.getSaveLocation();
        }
        SttbfUtils.write(hWPFOutputStream, strArr);
    }
}
