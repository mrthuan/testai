package androidx.appcompat.libconvert;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import androidx.activity.i;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class ConvertCore {
    private static final String tag = "libconvert";
    protected final Context context;
    private final AtomicBoolean abort = new AtomicBoolean(false);
    private final AtomicBoolean converting = new AtomicBoolean(false);
    private final ExecutorService executorService = Executors.newFixedThreadPool(1);
    private boolean inited = false;
    private boolean useAssetsJNILib = true;
    private String password = "atlas";
    private boolean fake_failed = false;

    /* loaded from: classes.dex */
    public interface ConvertCallback {
        void onCanceled(String str, String str2);

        void onException(String str, String str2, Exception exc);

        void onFailed(String str, String str2, ConvertResult convertResult);

        void onFinally(String str, String str2, ConvertResult convertResult);

        @Deprecated
        void onMessage(String str);

        void onProgress(int i10, int i11);

        void onSuccess(String str, String str2, ConvertData convertData);
    }

    /* loaded from: classes.dex */
    public static class ConvertData {
        public int error;
        public int pages;
        public int words;
    }

    /* loaded from: classes.dex */
    public enum ConvertResult {
        Converting(-10),
        PasswordRequired(-9),
        AuthorizedFailed(-8),
        SystemError(-6),
        Exception(-5),
        InitFailed(-4),
        LowRAM(-3),
        LowROM(-2),
        ConvertFailed(-1),
        Success(0),
        Canceled(1);
        
        private final int value;

        ConvertResult(int i10) {
            this.value = i10;
        }

        public static ConvertResult fromValue(int i10) {
            ConvertResult[] values;
            for (ConvertResult convertResult : values()) {
                if (convertResult.getValue() == i10) {
                    return convertResult;
                }
            }
            throw new IllegalArgumentException(b.a.c("Invalid ConvertResult value: ", i10));
        }

        public int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes.dex */
    public interface OnProgressHandler {
        void onProgress(int i10, int i11);
    }

    public ConvertCore(Context context) {
        this.context = context.getApplicationContext();
    }

    public static /* synthetic */ void a(ConvertCore convertCore) {
        convertCore.gcJNI();
    }

    public static String abi() {
        return Build.SUPPORTED_ABIS[0];
    }

    private native void abortForceJNI(boolean z10);

    private native void abortJNI(boolean z10);

    private native boolean archiveImportJNI(String str, String str2);

    private File archivePath() {
        return new File(sitePackagesPath(), "libalgorithms.so");
    }

    private boolean before_convert() {
        if (!this.inited) {
            if (!init()) {
                return false;
            }
            if (this.fake_failed) {
                this.fake_failed = false;
                return false;
            } else if (!archiveImportJNI(archivePath().toString(), getPassword())) {
                return false;
            }
        }
        this.inited = true;
        return true;
    }

    private native int convertPageSliceJNI(String str, String str2, String str3, int i10, int i11, double d10, OnProgressHandler onProgressHandler, ConvertData convertData);

    private native void finiJNI();

    public native int gcJNI();

    private boolean init() {
        try {
            if (this.inited) {
                return true;
            }
            if (getUseAssetsJNILib()) {
                if (!load("preloader")) {
                    return false;
                }
            } else if (!loadLibrary("preloader")) {
                return false;
            }
            if (preload(baseNativeLibDir().toString()) != 0) {
                return false;
            }
            if (getUseAssetsJNILib()) {
                if (!load("convert")) {
                    return false;
                }
            } else if (!loadLibrary("convert")) {
                return false;
            }
            String file = this.context.getFilesDir().toString();
            String file2 = baseNativeLibDir().toString();
            String file3 = pythonDir().toString();
            setLogPathJNI(nativeLogPath().toString());
            setAppContextJNI(file2, file, file3, abi());
            setEnvJNI("PYTHONPATH", String.format("%s:%s:%s", baseNativeLibDir().getPath(), stdlibPath().getPath(), sitePackagesPath().getPath()));
            if (!initJNI()) {
                return false;
            }
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    private native boolean initJNI();

    private File libDynloadPath() {
        return new File(stdlibPath(), "lib-dynload");
    }

    private boolean libDynloadPathExists() {
        return libDynloadPath().exists();
    }

    private native String logPathJNI();

    private File platformPath() {
        return new File(pythonDir(), "lib");
    }

    private native int preload(String str);

    private boolean pythonExists() {
        if (pythonDir().exists() && sitePackagesPath().exists()) {
            return true;
        }
        return false;
    }

    private boolean pythonLibPathExists() {
        return stdlibPath().exists();
    }

    private native void setAppContextJNI(String str, String str2, String str3, String str4);

    private native void setEnvJNI(String str, String str2);

    private native void setLogPathJNI(String str);

    private File sitePackagesPath() {
        return new File(stdlibPath(), "site-packages");
    }

    private boolean sitePackagesPathExists() {
        return sitePackagesPath().exists();
    }

    private File stdlibPath() {
        return new File(platformPath(), "python3.8");
    }

    private native void unsetEnvJNI(String str);

    public File baseNativeLibDir() {
        return new File(this.context.getFilesDir(), abi());
    }

    public void cancel() {
        this.abort.set(true);
        if (this.inited) {
            abortJNI(true);
        }
    }

    public void cancelForce() {
        this.abort.set(true);
        if (this.inited) {
            abortForceJNI(true);
        }
    }

    @Deprecated
    public void convert(String str, String str2, String str3, ConvertCallback convertCallback) {
        convertPageSlice(str, str2, str3, 0, 0, 2.0d, convertCallback);
    }

    public void convertPageSlice(final String str, final String str2, final String str3, final int i10, final int i11, final double d10, final ConvertCallback convertCallback) {
        this.abort.set(false);
        if (this.inited) {
            abortForceJNI(false);
        }
        this.executorService.execute(new Runnable() { // from class: androidx.appcompat.libconvert.b
            @Override // java.lang.Runnable
            public final void run() {
                ConvertCore.this.lambda$convertPageSlice$0(str, str2, str3, i10, i11, d10, convertCallback);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0051, code lost:
        if (r17.inited != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0066, code lost:
        if (r17.inited != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x007d, code lost:
        if (r17.inited != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0023, code lost:
        if (r17.inited != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0025, code lost:
        abortForceJNI(false);
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0028, code lost:
        r25.onFinally(r18, r19, r1);
        r17.converting.set(false);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0123  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v15, types: [androidx.appcompat.libconvert.ConvertCore$ConvertResult] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* renamed from: doConvertPageSlice */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void lambda$convertPageSlice$0(java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21, int r22, double r23, androidx.appcompat.libconvert.ConvertCore.ConvertCallback r25) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.libconvert.ConvertCore.lambda$convertPageSlice$0(java.lang.String, java.lang.String, java.lang.String, int, int, double, androidx.appcompat.libconvert.ConvertCore$ConvertCallback):void");
    }

    public void fini() {
        this.inited = false;
        finiJNI();
    }

    public void gc() {
        this.executorService.execute(new i(this, 1));
    }

    public boolean getConverting() {
        return this.converting.get();
    }

    public String getPassword() {
        return this.password;
    }

    public boolean getUseAssetsJNILib() {
        return this.useAssetsJNILib;
    }

    @SuppressLint({"UnsafeDynamicallyLoadedCode"})
    public boolean load(String str) {
        String format = String.format("%s/lib%s.so", baseNativeLibDir(), str);
        try {
            if (new File(format).exists()) {
                System.load(format);
                String.format("load success: %s", format);
                return true;
            }
            String.format("%s not exists", format);
            return false;
        } catch (NullPointerException | SecurityException | UnsatisfiedLinkError e10) {
            String.format("load failed: %s", format);
            e10.printStackTrace();
            return false;
        }
    }

    public boolean loadLibrary(String str) {
        try {
            System.loadLibrary(str);
            return true;
        } catch (NullPointerException | SecurityException | UnsatisfiedLinkError e10) {
            String.format("load failed: %s", str);
            e10.printStackTrace();
            return false;
        }
    }

    public File nativeLogPath() {
        return new File(this.context.getFilesDir(), "log.txt");
    }

    public File pythonDir() {
        return new File(this.context.getFilesDir(), "python");
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setUseAssetsJNILib(boolean z10) {
        this.useAssetsJNILib = z10;
    }
}
