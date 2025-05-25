package com.squareup.picasso;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.ThreadFactory;
import kk.h;
import okio.ByteString;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class Utils {
    private static final int KEY_PADDING = 50;
    static final char KEY_SEPARATOR = '\n';
    private static final int MAX_DISK_CACHE_SIZE = 52428800;
    private static final int MIN_DISK_CACHE_SIZE = 5242880;
    static final String OWNER_DISPATCHER = "Dispatcher";
    static final String OWNER_HUNTER = "Hunter";
    static final String OWNER_MAIN = "Main";
    private static final String PICASSO_CACHE = "picasso-cache";
    static final String THREAD_IDLE_NAME = "Picasso-Idle";
    static final int THREAD_LEAK_CLEANING_MS = 1000;
    static final String THREAD_PREFIX = "Picasso-";
    static final String VERB_BATCHED = "batched";
    static final String VERB_CANCELED = "canceled";
    static final String VERB_CHANGED = "changed";
    static final String VERB_COMPLETED = "completed";
    static final String VERB_CREATED = "created";
    static final String VERB_DECODED = "decoded";
    static final String VERB_DELIVERED = "delivered";
    static final String VERB_ENQUEUED = "enqueued";
    static final String VERB_ERRORED = "errored";
    static final String VERB_EXECUTING = "executing";
    static final String VERB_IGNORED = "ignored";
    static final String VERB_JOINED = "joined";
    static final String VERB_PAUSED = "paused";
    static final String VERB_REMOVED = "removed";
    static final String VERB_REPLAYING = "replaying";
    static final String VERB_RESUMED = "resumed";
    static final String VERB_RETRYING = "retrying";
    static final String VERB_TRANSFORMED = "transformed";
    static final StringBuilder MAIN_THREAD_KEY_BUILDER = new StringBuilder();
    private static final ByteString WEBP_FILE_HEADER_RIFF = ByteString.encodeUtf8("RIFF");
    private static final ByteString WEBP_FILE_HEADER_WEBP = ByteString.encodeUtf8("WEBP");

    /* loaded from: classes2.dex */
    public static class PicassoThread extends Thread {
        public PicassoThread(Runnable runnable) {
            super(runnable);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    /* loaded from: classes2.dex */
    public static class PicassoThreadFactory implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new PicassoThread(runnable);
        }
    }

    private Utils() {
    }

    @TargetApi(18)
    public static long calculateDiskCacheSize(File file) {
        long j10;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j10 = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
        } catch (IllegalArgumentException unused) {
            j10 = 5242880;
        }
        return Math.max(Math.min(j10, 52428800L), 5242880L);
    }

    public static int calculateMemoryCacheSize(Context context) {
        boolean z10;
        int memoryClass;
        ActivityManager activityManager = (ActivityManager) getService(context, "activity");
        if ((context.getApplicationInfo().flags & 1048576) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            memoryClass = activityManager.getLargeMemoryClass();
        } else {
            memoryClass = activityManager.getMemoryClass();
        }
        return (int) ((memoryClass * 1048576) / 7);
    }

    public static void checkMain() {
        if (isMain()) {
            return;
        }
        throw new IllegalStateException("Method call should happen from the main thread.");
    }

    public static void checkNotMain() {
        if (!isMain()) {
            return;
        }
        throw new IllegalStateException("Method call should not happen from the main thread.");
    }

    public static <T> T checkNotNull(T t4, String str) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(str);
    }

    public static File createDefaultCacheDir(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), PICASSO_CACHE);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static String createKey(Request request) {
        StringBuilder sb2 = MAIN_THREAD_KEY_BUILDER;
        String createKey = createKey(request, sb2);
        sb2.setLength(0);
        return createKey;
    }

    public static void flushStackLocalLeaks(Looper looper) {
        Handler handler = new Handler(looper) { // from class: com.squareup.picasso.Utils.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                sendMessageDelayed(obtainMessage(), 1000L);
            }
        };
        handler.sendMessageDelayed(handler.obtainMessage(), 1000L);
    }

    public static int getBitmapBytes(Bitmap bitmap) {
        int allocationByteCount = bitmap.getAllocationByteCount();
        if (allocationByteCount >= 0) {
            return allocationByteCount;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    public static String getLogIdsForHunter(BitmapHunter bitmapHunter) {
        return getLogIdsForHunter(bitmapHunter, "");
    }

    public static int getResourceId(Resources resources, Request request) {
        Uri uri;
        int i10 = request.resourceId;
        if (i10 == 0 && (uri = request.uri) != null) {
            String authority = uri.getAuthority();
            if (authority != null) {
                List<String> pathSegments = request.uri.getPathSegments();
                if (pathSegments != null && !pathSegments.isEmpty()) {
                    if (pathSegments.size() == 1) {
                        try {
                            return Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Last path segment is not a resource ID: " + request.uri);
                        }
                    } else if (pathSegments.size() == 2) {
                        return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + request.uri);
                    }
                }
                throw new FileNotFoundException("No path segments: " + request.uri);
            }
            throw new FileNotFoundException("No package provided: " + request.uri);
        }
        return i10;
    }

    public static Resources getResources(Context context, Request request) {
        Uri uri;
        if (request.resourceId == 0 && (uri = request.uri) != null) {
            String authority = uri.getAuthority();
            if (authority != null) {
                try {
                    return context.getPackageManager().getResourcesForApplication(authority);
                } catch (PackageManager.NameNotFoundException unused) {
                    throw new FileNotFoundException("Unable to obtain resources for package: " + request.uri);
                }
            }
            throw new FileNotFoundException("No package provided: " + request.uri);
        }
        return context.getResources();
    }

    public static <T> T getService(Context context, String str) {
        return (T) context.getSystemService(str);
    }

    public static boolean hasPermission(Context context, String str) {
        if (context.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    public static boolean isAirplaneModeOn(Context context) {
        try {
            if (Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) == 0) {
                return false;
            }
            return true;
        } catch (NullPointerException | SecurityException unused) {
            return false;
        }
    }

    public static boolean isMain() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public static boolean isWebPFile(h hVar) {
        if (hVar.N(0L, WEBP_FILE_HEADER_RIFF) && hVar.N(8L, WEBP_FILE_HEADER_WEBP)) {
            return true;
        }
        return false;
    }

    public static void log(String str, String str2, String str3) {
        log(str, str2, str3, "");
    }

    public static String getLogIdsForHunter(BitmapHunter bitmapHunter, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        Action action = bitmapHunter.getAction();
        if (action != null) {
            sb2.append(action.request.logId());
        }
        List<Action> actions = bitmapHunter.getActions();
        if (actions != null) {
            int size = actions.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 > 0 || action != null) {
                    sb2.append(", ");
                }
                sb2.append(actions.get(i10).request.logId());
            }
        }
        return sb2.toString();
    }

    public static void log(String str, String str2, String str3, String str4) {
        String.format("%1$-11s %2$-12s %3$s %4$s", str, str2, str3, str4);
    }

    public static String createKey(Request request, StringBuilder sb2) {
        String str = request.stableKey;
        if (str != null) {
            sb2.ensureCapacity(str.length() + 50);
            sb2.append(request.stableKey);
        } else {
            Uri uri = request.uri;
            if (uri != null) {
                String uri2 = uri.toString();
                sb2.ensureCapacity(uri2.length() + 50);
                sb2.append(uri2);
            } else {
                sb2.ensureCapacity(50);
                sb2.append(request.resourceId);
            }
        }
        sb2.append(KEY_SEPARATOR);
        if (request.rotationDegrees != 0.0f) {
            sb2.append("rotation:");
            sb2.append(request.rotationDegrees);
            if (request.hasRotationPivot) {
                sb2.append('@');
                sb2.append(request.rotationPivotX);
                sb2.append('x');
                sb2.append(request.rotationPivotY);
            }
            sb2.append(KEY_SEPARATOR);
        }
        if (request.hasSize()) {
            sb2.append("resize:");
            sb2.append(request.targetWidth);
            sb2.append('x');
            sb2.append(request.targetHeight);
            sb2.append(KEY_SEPARATOR);
        }
        if (request.centerCrop) {
            sb2.append("centerCrop:");
            sb2.append(request.centerCropGravity);
            sb2.append(KEY_SEPARATOR);
        } else if (request.centerInside) {
            sb2.append("centerInside");
            sb2.append(KEY_SEPARATOR);
        }
        List<Transformation> list = request.transformations;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append(request.transformations.get(i10).key());
                sb2.append(KEY_SEPARATOR);
            }
        }
        return sb2.toString();
    }
}
