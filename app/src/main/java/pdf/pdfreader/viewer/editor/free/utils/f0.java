package pdf.pdfreader.viewer.editor.free.utils;

import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.util.Objects;

/* compiled from: MemoryUtils.java */
/* loaded from: classes3.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f28693a = ea.a.p("fmUmbwF5N3QbbHM=", "vhqczM5F");

    /* renamed from: b  reason: collision with root package name */
    public static int f28694b = -1;

    public static float a() {
        try {
            File dataDirectory = Environment.getDataDirectory();
            String str = f28693a;
            ea.a.p("QHQqcgcgBWUGIEd0CHR2Zjcg", "DSbVRAeW");
            Objects.toString(dataDirectory);
            String str2 = n0.f28727a;
            StatFs statFs = new StatFs(dataDirectory.getPath());
            float availableBlocksLong = (((float) (statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong())) / 1000.0f) / 1000.0f;
            o9.d.s(str, ea.a.p("VGU_RgFlB0kcdFFyB2E6UzBvQGEhZXI6IA==", "9FOX5Y8e") + availableBlocksLong + ea.a.p("TQ==", "HUCdXYM0"));
            if (availableBlocksLong < 0.0f) {
                availableBlocksLong = (((float) statFs.getFreeBytes()) / 1000.0f) / 1000.0f;
                o9.d.s(str, ea.a.p("KGVFRgtlUkk0dC9yG2EEU0FvHGEiZVc6IA==", "ThVfxYju") + availableBlocksLong + ea.a.p("TQ==", "2h1pB3l7"));
            }
            if (availableBlocksLong <= 0.0f) {
                return 100.0f;
            }
            return availableBlocksLong;
        } catch (Error e10) {
            ea.a.p("cnI-bxog", "jN7Lho9i");
            e10.toString();
            String str3 = n0.f28727a;
            e10.printStackTrace();
            return 100.0f;
        } catch (Exception e11) {
            ea.a.p("A3hXZRV0G28mIA==", "9zf4erO1");
            e11.toString();
            String str4 = n0.f28727a;
            e11.printStackTrace();
            return 100.0f;
        }
    }

    public static long b() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
            if (availableBlocksLong < 0) {
                availableBlocksLong = statFs.getFreeBytes();
            }
            ea.a.p("V28YYQVlMmQUIFJyDGUFaT5lEj0g", "63nqS6af");
            String str = n0.f28727a;
            return availableBlocksLong;
        } catch (Error e10) {
            e10.printStackTrace();
            ea.a.p("J29nYS5lZmQuIAByUWUEaUJlcj1pMQYwRDBBMDA=", "mHC4X6Ub");
            String str2 = n0.f28727a;
            return 10000000L;
        }
    }
}
