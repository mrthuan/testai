package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class CountryRecord extends StandardRecord {
    public static final short sid = 140;
    private short field_1_default_country;
    private short field_2_current_country;

    public CountryRecord() {
    }

    public short getCurrentCountry() {
        return this.field_2_current_country;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 4;
    }

    public short getDefaultCountry() {
        return this.field_1_default_country;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(getDefaultCountry());
        littleEndianOutput.writeShort(getCurrentCountry());
    }

    public void setCurrentCountry(short s4) {
        this.field_2_current_country = s4;
    }

    public void setDefaultCountry(short s4) {
        this.field_1_default_country = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[COUNTRY]\n    .defaultcountry  = ");
        stringBuffer.append(Integer.toHexString(getDefaultCountry()));
        stringBuffer.append("\n    .currentcountry  = ");
        stringBuffer.append(Integer.toHexString(getCurrentCountry()));
        stringBuffer.append("\n[/COUNTRY]\n");
        return stringBuffer.toString();
    }

    public CountryRecord(RecordInputStream recordInputStream) {
        this.field_1_default_country = recordInputStream.readShort();
        this.field_2_current_country = recordInputStream.readShort();
    }
}
