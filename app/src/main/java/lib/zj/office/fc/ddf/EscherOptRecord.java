package lib.zj.office.fc.ddf;

/* loaded from: classes3.dex */
public class EscherOptRecord extends AbstractEscherOptRecord {
    public static final String RECORD_DESCRIPTION = "msofbtOPT";
    public static final short RECORD_ID = -4085;

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public short getOptions() {
        setOptions((short) ((this.properties.size() << 4) | 3));
        return super.getOptions();
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public String getRecordName() {
        return "Opt";
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public void dispose() {
    }
}
