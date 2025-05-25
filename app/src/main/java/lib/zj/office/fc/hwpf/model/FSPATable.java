package lib.zj.office.fc.hwpf.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.hwpf.model.types.FSPAAbstractType;
import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
public final class FSPATable {
    private final Map<Integer, GenericPropertyNode> _byStart = new LinkedHashMap();

    public FSPATable(byte[] bArr, FileInformationBlock fileInformationBlock, FSPADocumentPart fSPADocumentPart) {
        PlexOfCps plexOfCps = new PlexOfCps(bArr, fileInformationBlock.getFSPAPlcfOffset(fSPADocumentPart), fileInformationBlock.getFSPAPlcfLength(fSPADocumentPart), FSPAAbstractType.getSize());
        for (int i10 = 0; i10 < plexOfCps.length(); i10++) {
            GenericPropertyNode property = plexOfCps.getProperty(i10);
            this._byStart.put(Integer.valueOf(property.getStart()), property);
        }
    }

    public FSPA getFspaFromCp(int i10) {
        GenericPropertyNode genericPropertyNode = this._byStart.get(Integer.valueOf(i10));
        if (genericPropertyNode == null) {
            return null;
        }
        return new FSPA(genericPropertyNode.getBytes(), 0);
    }

    public FSPA[] getShapes() {
        ArrayList arrayList = new ArrayList(this._byStart.size());
        for (GenericPropertyNode genericPropertyNode : this._byStart.values()) {
            arrayList.add(new FSPA(genericPropertyNode.getBytes(), 0));
        }
        return (FSPA[]) arrayList.toArray(new FSPA[arrayList.size()]);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[FPSA PLC size=");
        stringBuffer.append(this._byStart.size());
        stringBuffer.append("]\n");
        for (Map.Entry<Integer, GenericPropertyNode> entry : this._byStart.entrySet()) {
            Integer key = entry.getKey();
            stringBuffer.append("  ");
            stringBuffer.append(key.toString());
            stringBuffer.append(" => \t");
            try {
                stringBuffer.append(getFspaFromCp(key.intValue()).toString());
            } catch (Exception e10) {
                stringBuffer.append(e10.getMessage());
            }
            stringBuffer.append("\n");
        }
        stringBuffer.append("[/FSPA PLC]");
        return stringBuffer.toString();
    }

    @Deprecated
    public FSPATable(byte[] bArr, int i10, int i11, List<TextPiece> list) {
        if (i10 == 0) {
            return;
        }
        PlexOfCps plexOfCps = new PlexOfCps(bArr, i10, i11, FSPA.FSPA_SIZE);
        for (int i12 = 0; i12 < plexOfCps.length(); i12++) {
            GenericPropertyNode property = plexOfCps.getProperty(i12);
            this._byStart.put(Integer.valueOf(property.getStart()), property);
        }
    }
}
