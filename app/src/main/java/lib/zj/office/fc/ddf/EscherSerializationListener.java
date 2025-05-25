package lib.zj.office.fc.ddf;

/* loaded from: classes3.dex */
public interface EscherSerializationListener {
    void afterRecordSerialize(int i10, short s4, int i11, EscherRecord escherRecord);

    void beforeRecordSerialize(int i10, short s4, EscherRecord escherRecord);
}
