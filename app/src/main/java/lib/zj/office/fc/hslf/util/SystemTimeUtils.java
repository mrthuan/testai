package lib.zj.office.fc.hslf.util;

import java.util.Date;
import java.util.GregorianCalendar;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class SystemTimeUtils {
    public static Date getDate(byte[] bArr) {
        return getDate(bArr, 0);
    }

    public static void storeDate(Date date, byte[] bArr) {
        storeDate(date, bArr, 0);
    }

    public static Date getDate(byte[] bArr, int i10) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, LittleEndian.getShort(bArr, i10));
        gregorianCalendar.set(2, LittleEndian.getShort(bArr, i10 + 2) - 1);
        gregorianCalendar.set(5, LittleEndian.getShort(bArr, i10 + 6));
        gregorianCalendar.set(11, LittleEndian.getShort(bArr, i10 + 8));
        gregorianCalendar.set(12, LittleEndian.getShort(bArr, i10 + 10));
        gregorianCalendar.set(13, LittleEndian.getShort(bArr, i10 + 12));
        gregorianCalendar.set(14, LittleEndian.getShort(bArr, i10 + 14));
        return gregorianCalendar.getTime();
    }

    public static void storeDate(Date date, byte[] bArr, int i10) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        LittleEndian.putShort(bArr, i10 + 0, (short) gregorianCalendar.get(1));
        LittleEndian.putShort(bArr, i10 + 2, (short) (gregorianCalendar.get(2) + 1));
        LittleEndian.putShort(bArr, i10 + 4, (short) (gregorianCalendar.get(7) - 1));
        LittleEndian.putShort(bArr, i10 + 6, (short) gregorianCalendar.get(5));
        LittleEndian.putShort(bArr, i10 + 8, (short) gregorianCalendar.get(11));
        LittleEndian.putShort(bArr, i10 + 10, (short) gregorianCalendar.get(12));
        LittleEndian.putShort(bArr, i10 + 12, (short) gregorianCalendar.get(13));
        LittleEndian.putShort(bArr, i10 + 14, (short) gregorianCalendar.get(14));
    }
}
