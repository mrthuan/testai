package lib.zj.office.fc.hwpf.model;

import java.util.Collections;
import lib.zj.office.fc.hwpf.model.PropertyNode;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public final class OldCHPBinTable extends CHPBinTable {
    public OldCHPBinTable(byte[] bArr, int i10, int i11, int i12, TextPieceTable textPieceTable) {
        PlexOfCps plexOfCps = new PlexOfCps(bArr, i10, i11, 2);
        int length = plexOfCps.length();
        for (int i13 = 0; i13 < length; i13++) {
            CHPFormattedDiskPage cHPFormattedDiskPage = new CHPFormattedDiskPage(bArr, LittleEndian.getShort(plexOfCps.getProperty(i13).getBytes()) * 512, textPieceTable);
            int size = cHPFormattedDiskPage.size();
            for (int i14 = 0; i14 < size; i14++) {
                CHPX chpx = cHPFormattedDiskPage.getCHPX(i14);
                if (chpx != null) {
                    this._textRuns.add(chpx);
                }
            }
        }
        Collections.sort(this._textRuns, PropertyNode.StartComparator.instance);
    }
}
