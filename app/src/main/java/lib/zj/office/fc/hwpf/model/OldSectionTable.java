package lib.zj.office.fc.hwpf.model;

import java.util.Collections;
import lib.zj.office.fc.hwpf.model.PropertyNode;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public final class OldSectionTable extends SectionTable {
    @Deprecated
    public OldSectionTable(byte[] bArr, int i10, int i11, int i12, TextPieceTable textPieceTable) {
        this(bArr, i10, i11);
    }

    public OldSectionTable(byte[] bArr, int i10, int i11) {
        SEPX sepx;
        PlexOfCps plexOfCps = new PlexOfCps(bArr, i10, i11, 12);
        int length = plexOfCps.length();
        for (int i12 = 0; i12 < length; i12++) {
            GenericPropertyNode property = plexOfCps.getProperty(i12);
            SectionDescriptor sectionDescriptor = new SectionDescriptor(property.getBytes(), 0);
            int fc2 = sectionDescriptor.getFc();
            int start = property.getStart();
            int end = property.getEnd();
            if (fc2 == -1) {
                sepx = new SEPX(sectionDescriptor, start, end, new byte[0]);
            } else {
                int i13 = LittleEndian.getShort(bArr, fc2) + 2;
                byte[] bArr2 = new byte[i13];
                System.arraycopy(bArr, fc2 + 2, bArr2, 0, i13);
                sepx = new SEPX(sectionDescriptor, start, end, bArr2);
            }
            this._sections.add(sepx);
        }
        Collections.sort(this._sections, PropertyNode.StartComparator.instance);
    }
}
