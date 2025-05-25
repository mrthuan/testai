package lib.zj.office.fc.ddf;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import lib.zj.office.fc.ddf.EscherRecord;

/* loaded from: classes3.dex */
public class DefaultEscherRecordFactory implements EscherRecordFactory {
    private static Class<?>[] escherRecordClasses;
    private static Map<Short, Constructor<? extends EscherRecord>> recordsMap;

    static {
        Class<?>[] clsArr = {EscherBSERecord.class, EscherOptRecord.class, EscherTertiaryOptRecord.class, EscherClientAnchorRecord.class, EscherDgRecord.class, EscherSpgrRecord.class, EscherSpRecord.class, EscherClientDataRecord.class, EscherDggRecord.class, EscherSplitMenuColorsRecord.class, EscherChildAnchorRecord.class, EscherTextboxRecord.class, EscherBinaryTagRecord.class};
        escherRecordClasses = clsArr;
        recordsMap = recordsToMap(clsArr);
    }

    private static Map<Short, Constructor<? extends EscherRecord>> recordsToMap(Class<?>[] clsArr) {
        HashMap hashMap = new HashMap();
        Class<?>[] clsArr2 = new Class[0];
        for (Class<?> cls : clsArr) {
            try {
                try {
                    hashMap.put(Short.valueOf(cls.getField("RECORD_ID").getShort(null)), cls.getConstructor(clsArr2));
                } catch (NoSuchMethodException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (IllegalAccessException e11) {
                throw new RuntimeException(e11);
            } catch (IllegalArgumentException e12) {
                throw new RuntimeException(e12);
            } catch (NoSuchFieldException e13) {
                throw new RuntimeException(e13);
            }
        }
        return hashMap;
    }

    @Override // lib.zj.office.fc.ddf.EscherRecordFactory
    public EscherRecord createRecord(byte[] bArr, int i10) {
        EscherRecord escherBitmapBlip;
        EscherRecord.EscherRecordHeader readHeader = EscherRecord.EscherRecordHeader.readHeader(bArr, i10);
        if ((readHeader.getOptions() & 15) == 15 && readHeader.getRecordId() != -4083) {
            EscherContainerRecord escherContainerRecord = new EscherContainerRecord();
            escherContainerRecord.setRecordId(readHeader.getRecordId());
            escherContainerRecord.setOptions(readHeader.getOptions());
            return escherContainerRecord;
        } else if (readHeader.getRecordId() >= -4072 && readHeader.getRecordId() <= -3817) {
            if (readHeader.getRecordId() != -4065 && readHeader.getRecordId() != -4067 && readHeader.getRecordId() != -4066) {
                if (readHeader.getRecordId() != -4070 && readHeader.getRecordId() != -4069 && readHeader.getRecordId() != -4068) {
                    escherBitmapBlip = new EscherBlipRecord();
                } else {
                    escherBitmapBlip = new EscherMetafileBlip();
                }
            } else {
                escherBitmapBlip = new EscherBitmapBlip();
            }
            escherBitmapBlip.setRecordId(readHeader.getRecordId());
            escherBitmapBlip.setOptions(readHeader.getOptions());
            return escherBitmapBlip;
        } else {
            Constructor<? extends EscherRecord> constructor = recordsMap.get(Short.valueOf(readHeader.getRecordId()));
            if (constructor == null) {
                return new UnknownEscherRecord();
            }
            try {
                EscherRecord newInstance = constructor.newInstance(new Object[0]);
                newInstance.setRecordId(readHeader.getRecordId());
                newInstance.setOptions(readHeader.getOptions());
                return newInstance;
            } catch (Exception unused) {
                return new UnknownEscherRecord();
            }
        }
    }
}
