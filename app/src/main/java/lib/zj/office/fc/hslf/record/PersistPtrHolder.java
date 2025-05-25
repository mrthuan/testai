package lib.zj.office.fc.hslf.record;

import java.util.Enumeration;
import java.util.Hashtable;
import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.fc.util.POILogger;

/* loaded from: classes3.dex */
public final class PersistPtrHolder extends PositionDependentRecordAtom {
    private byte[] _header;
    private byte[] _ptrData;
    private Hashtable<Integer, Integer> _slideLocations;
    private Hashtable<Integer, Integer> _slideOffsetDataLocation;
    private long _type;

    public PersistPtrHolder(byte[] bArr, int i10, int i11) {
        i11 = i11 < 8 ? 8 : i11;
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        this._type = LittleEndian.getUShort(this._header, 2);
        this._slideLocations = new Hashtable<>();
        this._slideOffsetDataLocation = new Hashtable<>();
        byte[] bArr3 = new byte[i11 - 8];
        this._ptrData = bArr3;
        System.arraycopy(bArr, i10 + 8, bArr3, 0, bArr3.length);
        int i12 = 0;
        while (true) {
            byte[] bArr4 = this._ptrData;
            if (i12 < bArr4.length) {
                long uInt = LittleEndian.getUInt(bArr4, i12);
                int i13 = (int) (uInt >> 20);
                int i14 = (int) (uInt - (i13 << 20));
                i12 += 4;
                for (int i15 = 0; i15 < i13; i15++) {
                    int i16 = i14 + i15;
                    this._slideLocations.put(Integer.valueOf(i16), Integer.valueOf((int) LittleEndian.getUInt(this._ptrData, i12)));
                    this._slideOffsetDataLocation.put(Integer.valueOf(i16), Integer.valueOf(i12));
                    i12 += 4;
                }
            } else {
                return;
            }
        }
    }

    public void addSlideLookup(int i10, int i11) {
        byte[] bArr = this._ptrData;
        int length = bArr.length + 8;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        this._slideLocations.put(Integer.valueOf(i10), Integer.valueOf(i11));
        this._slideOffsetDataLocation.put(Integer.valueOf(i10), Integer.valueOf(this._ptrData.length + 4));
        LittleEndian.putInt(bArr2, length - 8, i10 + 1048576);
        LittleEndian.putInt(bArr2, length - 4, i11);
        this._ptrData = bArr2;
        LittleEndian.putInt(this._header, 4, length);
    }

    public int[] getKnownSlideIDs() {
        int size = this._slideLocations.size();
        int[] iArr = new int[size];
        Enumeration<Integer> keys = this._slideLocations.keys();
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = keys.nextElement().intValue();
        }
        return iArr;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return this._type;
    }

    public Hashtable<Integer, Integer> getSlideLocationsLookup() {
        return this._slideLocations;
    }

    public Hashtable<Integer, Integer> getSlideOffsetDataLocationsLookup() {
        return this._slideOffsetDataLocation;
    }

    @Override // lib.zj.office.fc.hslf.record.PositionDependentRecordAtom, lib.zj.office.fc.hslf.record.PositionDependentRecord
    public void updateOtherRecordReferences(Hashtable<Integer, Integer> hashtable) {
        for (int i10 : getKnownSlideIDs()) {
            Integer valueOf = Integer.valueOf(i10);
            Integer num = this._slideLocations.get(valueOf);
            Integer num2 = hashtable.get(num);
            if (num2 == null) {
                this.logger.log(POILogger.WARN, "Couldn't find the new location of the \"slide\" with id " + valueOf + " that used to be at " + num);
                this.logger.log(POILogger.WARN, "Not updating the position of it, you probably won't be able to find it any more (if you ever could!)");
            } else {
                num = num2;
            }
            LittleEndian.putInt(this._ptrData, this._slideOffsetDataLocation.get(valueOf).intValue(), num.intValue());
            this._slideLocations.remove(valueOf);
            this._slideLocations.put(valueOf, num);
        }
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
    }
}
