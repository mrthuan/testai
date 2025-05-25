package lib.zj.office.fc.hslf.usermodel;

import java.util.ArrayList;
import lib.zj.office.fc.hslf.record.Document;
import lib.zj.office.fc.hslf.record.Record;
import lib.zj.office.fc.hslf.record.RecordContainer;
import lib.zj.office.fc.hslf.record.RecordTypes;
import lib.zj.office.fc.hslf.record.Sound;

/* loaded from: classes3.dex */
public final class SoundData {
    private Sound _container;

    public SoundData(Sound sound) {
        this._container = sound;
    }

    public static SoundData[] find(Document document) {
        Record[] childRecords;
        ArrayList arrayList = new ArrayList();
        Record[] childRecords2 = document.getChildRecords();
        for (int i10 = 0; i10 < childRecords2.length; i10++) {
            if (childRecords2[i10].getRecordType() == RecordTypes.SoundCollection.typeID) {
                for (Record record : ((RecordContainer) childRecords2[i10]).getChildRecords()) {
                    if (record instanceof Sound) {
                        arrayList.add(new SoundData((Sound) record));
                    }
                }
            }
        }
        return (SoundData[]) arrayList.toArray(new SoundData[arrayList.size()]);
    }

    public byte[] getData() {
        return this._container.getSoundData();
    }

    public String getSoundName() {
        return this._container.getSoundName();
    }

    public String getSoundType() {
        return this._container.getSoundType();
    }
}
