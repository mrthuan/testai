package lib.zj.office.fc.hssf.record;

/* loaded from: classes3.dex */
public final class FooterRecord extends HeaderFooterBase {
    public static final short sid = 21;

    public FooterRecord(String str) {
        super(str);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        return new FooterRecord(getText());
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 21;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[FOOTER]\n    .footer = ");
        stringBuffer.append(getText());
        stringBuffer.append("\n[/FOOTER]\n");
        return stringBuffer.toString();
    }

    public FooterRecord(RecordInputStream recordInputStream) {
        super(recordInputStream);
    }
}
