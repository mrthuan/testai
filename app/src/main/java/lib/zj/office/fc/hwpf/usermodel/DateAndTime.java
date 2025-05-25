package lib.zj.office.fc.hwpf.usermodel;

import java.util.Calendar;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class DateAndTime implements Cloneable {
    public static final int SIZE = 4;
    private short _info;
    private short _info2;
    private static final BitField _minutes = BitFieldFactory.getInstance(63);
    private static final BitField _hours = BitFieldFactory.getInstance(1984);
    private static final BitField _dom = BitFieldFactory.getInstance(63488);
    private static final BitField _months = BitFieldFactory.getInstance(15);
    private static final BitField _years = BitFieldFactory.getInstance(8176);
    private static final BitField _weekday = BitFieldFactory.getInstance(57344);

    public DateAndTime() {
    }

    public Object clone() {
        return super.clone();
    }

    public boolean equals(Object obj) {
        DateAndTime dateAndTime = (DateAndTime) obj;
        if (this._info == dateAndTime._info && this._info2 == dateAndTime._info2) {
            return true;
        }
        return false;
    }

    public Calendar getDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(_years.getValue(this._info2) + 1900, _months.getValue(this._info2) - 1, _dom.getValue(this._info), _hours.getValue(this._info), _minutes.getValue(this._info), 0);
        calendar.set(14, 0);
        return calendar;
    }

    public boolean isEmpty() {
        if (this._info == 0 && this._info2 == 0) {
            return true;
        }
        return false;
    }

    public void serialize(byte[] bArr, int i10) {
        LittleEndian.putShort(bArr, i10, this._info);
        LittleEndian.putShort(bArr, i10 + 2, this._info2);
    }

    public String toString() {
        if (isEmpty()) {
            return "[DTTM] EMPTY";
        }
        return "[DTTM] " + getDate();
    }

    public DateAndTime(byte[] bArr, int i10) {
        this._info = LittleEndian.getShort(bArr, i10);
        this._info2 = LittleEndian.getShort(bArr, i10 + 2);
    }
}
