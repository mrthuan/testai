package c4;

import android.os.Build;
import android.util.Log;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.io.File;

/* compiled from: HardwareConfigState.java */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: f  reason: collision with root package name */
    public static final File f5535f = new File("/proc/self/fd");

    /* renamed from: g  reason: collision with root package name */
    public static volatile o f5536g;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5537a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5538b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public int f5539d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5540e = true;

    public o() {
        boolean z10 = true;
        String str = Build.MODEL;
        if (str != null && str.length() >= 7) {
            String substring = str.substring(0, 7);
            substring.getClass();
            char c = 65535;
            switch (substring.hashCode()) {
                case -1398613787:
                    if (substring.equals("SM-A520")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1398431166:
                    if (substring.equals("SM-G930")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1398431161:
                    if (substring.equals("SM-G935")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1398431073:
                    if (substring.equals("SM-G960")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1398431068:
                    if (substring.equals("SM-G965")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1398343746:
                    if (substring.equals("SM-J720")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1398222624:
                    if (substring.equals("SM-N935")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    if (Build.VERSION.SDK_INT == 26) {
                        z10 = false;
                        break;
                    }
                    break;
            }
        }
        this.f5537a = z10;
        if (Build.VERSION.SDK_INT >= 28) {
            this.f5538b = 20000;
            this.c = 0;
            return;
        }
        this.f5538b = OS2WindowsMetricsTable.WEIGHT_CLASS_BOLD;
        this.c = 128;
    }

    public final boolean a(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        boolean z12;
        boolean z13;
        if (!z10 || !this.f5537a || Build.VERSION.SDK_INT < 26 || z11 || i10 < (i12 = this.c) || i11 < i12) {
            return false;
        }
        synchronized (this) {
            int i13 = this.f5539d + 1;
            this.f5539d = i13;
            if (i13 >= 50) {
                this.f5539d = 0;
                if (f5535f.list().length < this.f5538b) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.f5540e = z13;
                if (!z13) {
                    Log.isLoggable("Downsampler", 5);
                }
            }
            z12 = this.f5540e;
        }
        if (!z12) {
            return false;
        }
        return true;
    }
}
