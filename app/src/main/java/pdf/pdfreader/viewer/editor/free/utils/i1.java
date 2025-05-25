package pdf.pdfreader.viewer.editor.free.utils;

import java.util.Calendar;
import java.util.Date;

/* compiled from: TimeUtils.java */
/* loaded from: classes3.dex */
public final class i1 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f28707a = 0;

    static {
        ea.a.p("HmkBZTN0Xmxz", "jVJlf7fQ");
    }

    public static boolean a(long j10) {
        if (System.currentTimeMillis() - j10 < 86400000) {
            return true;
        }
        return false;
    }

    public static boolean b(long j10) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        if (j10 < timeInMillis || j10 - timeInMillis >= 86400000) {
            return false;
        }
        return true;
    }
}
