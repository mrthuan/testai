package lib.zj.office.fc.hwpf.usermodel;

import java.util.ArrayList;
import lib.zj.office.fc.ddf.DefaultEscherRecordFactory;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherRecord;
import lib.zj.office.fc.hwpf.model.PictureDescriptor;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public class InlineWordArt extends PictureDescriptor {
    private ArrayList<EscherRecord> escherRecords;

    public InlineWordArt(byte[] bArr, int i10) {
        super(bArr, i10);
        int i11 = LittleEndian.getInt(bArr, i10) + i10;
        int i12 = i10 + 4;
        int i13 = LittleEndian.getShort(bArr, i12) + i10 + 4;
        i13 = LittleEndian.getShort(bArr, i12 + 2) == 102 ? i13 + LittleEndian.getUnsignedByte(bArr, i13) + 1 : i13;
        int i14 = LittleEndian.getShort(bArr, i13) + i13;
        this.escherRecords = fillEscherRecords(bArr, i13 - 4, ((i14 >= i11 ? i13 : i14) - i13) + 4);
    }

    private ArrayList<EscherRecord> fillEscherRecords(byte[] bArr, int i10, int i11) {
        ArrayList<EscherRecord> arrayList = new ArrayList<>();
        DefaultEscherRecordFactory defaultEscherRecordFactory = new DefaultEscherRecordFactory();
        int i12 = i10;
        while (i12 < i10 + i11) {
            try {
                EscherRecord createRecord = defaultEscherRecordFactory.createRecord(bArr, i12);
                arrayList.add(createRecord);
                i12 += createRecord.fillFields(bArr, i12, defaultEscherRecordFactory);
            } catch (Exception unused) {
                return null;
            }
        }
        return arrayList;
    }

    public int getDxaGoal() {
        return this.dxaGoal;
    }

    public int getDyaGoal() {
        return this.dyaGoal;
    }

    public int getHorizontalScalingFactor() {
        return this.mx;
    }

    public HWPFShape getInlineWordArt() {
        ArrayList<EscherRecord> arrayList = this.escherRecords;
        if (arrayList == null || arrayList.size() <= 0 || !(this.escherRecords.get(0) instanceof EscherContainerRecord)) {
            return null;
        }
        return HWPFShapeFactory.createShape((EscherContainerRecord) this.escherRecords.get(0), null);
    }

    public int getVerticalScalingFactor() {
        return this.my;
    }
}
