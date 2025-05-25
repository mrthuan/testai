package lib.zj.office.fc.hssf.record.common;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public interface SharedFeature {
    int getDataSize();

    void serialize(LittleEndianOutput littleEndianOutput);

    String toString();
}
