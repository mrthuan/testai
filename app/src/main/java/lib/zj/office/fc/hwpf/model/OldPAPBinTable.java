package lib.zj.office.fc.hwpf.model;

import java.util.Collections;
import lib.zj.office.fc.hwpf.model.PropertyNode;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public final class OldPAPBinTable extends PAPBinTable {
    public OldPAPBinTable(byte[] bArr, int i10, int i11, int i12, TextPieceTable textPieceTable) {
        PlexOfCps plexOfCps = new PlexOfCps(bArr, i10, i11, 2);
        int length = plexOfCps.length();
        for (int i13 = 0; i13 < length; i13++) {
            PAPFormattedDiskPage pAPFormattedDiskPage = new PAPFormattedDiskPage(bArr, bArr, LittleEndian.getShort(plexOfCps.getProperty(i13).getBytes()) * 512, textPieceTable);
            int size = pAPFormattedDiskPage.size();
            for (int i14 = 0; i14 < size; i14++) {
                PAPX papx = pAPFormattedDiskPage.getPAPX(i14);
                if (papx != null) {
                    this._paragraphs.add(papx);
                }
            }
        }
        Collections.sort(this._paragraphs, PropertyNode.StartComparator.instance);
    }
}
