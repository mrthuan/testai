package lib.zj.office.fc.hssf.record.common;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class FeatSmartTag implements SharedFeature {
    private byte[] data;

    public FeatSmartTag() {
        this.data = new byte[0];
    }

    @Override // lib.zj.office.fc.hssf.record.common.SharedFeature
    public int getDataSize() {
        return this.data.length;
    }

    @Override // lib.zj.office.fc.hssf.record.common.SharedFeature
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.write(this.data);
    }

    @Override // lib.zj.office.fc.hssf.record.common.SharedFeature
    public String toString() {
        return " [FEATURE SMART TAGS]\n [/FEATURE SMART TAGS]\n";
    }

    public FeatSmartTag(RecordInputStream recordInputStream) {
        this.data = recordInputStream.readRemainder();
    }
}
