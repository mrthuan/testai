package lib.zj.office.fc.util;

import java.io.PrintStream;

/* loaded from: classes3.dex */
public class SystemOutLogger extends POILogger {
    private String _cat;

    @Override // lib.zj.office.fc.util.POILogger
    public boolean check(int i10) {
        int i11;
        try {
            i11 = Integer.parseInt(System.getProperty("poi.log.level", POILogger.WARN + ""));
        } catch (SecurityException unused) {
            i11 = POILogger.DEBUG;
        }
        if (i10 >= i11) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.util.POILogger
    public void initialize(String str) {
        this._cat = str;
    }

    @Override // lib.zj.office.fc.util.POILogger
    public void log(int i10, Object obj) {
        log(i10, obj, (Throwable) null);
    }

    @Override // lib.zj.office.fc.util.POILogger
    public void log(int i10, Object obj, Throwable th2) {
        if (check(i10)) {
            PrintStream printStream = System.out;
            printStream.println("[" + this._cat + "] " + obj);
            if (th2 != null) {
                th2.printStackTrace(System.out);
            }
        }
    }
}
