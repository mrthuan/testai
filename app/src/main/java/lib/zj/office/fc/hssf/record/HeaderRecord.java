package lib.zj.office.fc.hssf.record;

/* loaded from: classes3.dex */
public final class HeaderRecord extends HeaderFooterBase {
    public static final short sid = 20;

    public HeaderRecord(String str) {
        super(str);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        return new HeaderRecord(getText());
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 20;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[HEADER]\n    .header = ");
        stringBuffer.append(getText());
        stringBuffer.append("\n[/HEADER]\n");
        return stringBuffer.toString();
    }

    public HeaderRecord(RecordInputStream recordInputStream) {
        super(recordInputStream);
    }
}
