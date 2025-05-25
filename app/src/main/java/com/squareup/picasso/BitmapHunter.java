package com.squareup.picasso;

import a0.a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.squareup.picasso.NetworkRequestHandler;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestHandler;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import kk.f;
import kk.s;
import kk.t;
import kk.y;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class BitmapHunter implements Runnable {
    Action action;
    List<Action> actions;
    final Cache cache;
    final Request data;
    final Dispatcher dispatcher;
    Exception exception;
    int exifOrientation;
    Future<?> future;
    final String key;
    Picasso.LoadedFrom loadedFrom;
    final int memoryPolicy;
    int networkPolicy;
    final Picasso picasso;
    Picasso.Priority priority;
    final RequestHandler requestHandler;
    Bitmap result;
    int retryCount;
    final int sequence = SEQUENCE_GENERATOR.incrementAndGet();
    final Stats stats;
    private static final Object DECODE_LOCK = new Object();
    private static final ThreadLocal<StringBuilder> NAME_BUILDER = new ThreadLocal<StringBuilder>() { // from class: com.squareup.picasso.BitmapHunter.1
        @Override // java.lang.ThreadLocal
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    };
    private static final AtomicInteger SEQUENCE_GENERATOR = new AtomicInteger();
    private static final RequestHandler ERRORING_HANDLER = new RequestHandler() { // from class: com.squareup.picasso.BitmapHunter.2
        @Override // com.squareup.picasso.RequestHandler
        public boolean canHandleRequest(Request request) {
            return true;
        }

        @Override // com.squareup.picasso.RequestHandler
        public RequestHandler.Result load(Request request, int i10) {
            throw new IllegalStateException("Unrecognized type of request: " + request);
        }
    };

    public BitmapHunter(Picasso picasso, Dispatcher dispatcher, Cache cache, Stats stats, Action action, RequestHandler requestHandler) {
        this.picasso = picasso;
        this.dispatcher = dispatcher;
        this.cache = cache;
        this.stats = stats;
        this.action = action;
        this.key = action.getKey();
        this.data = action.getRequest();
        this.priority = action.getPriority();
        this.memoryPolicy = action.getMemoryPolicy();
        this.networkPolicy = action.getNetworkPolicy();
        this.requestHandler = requestHandler;
        this.retryCount = requestHandler.getRetryCount();
    }

    public static Bitmap applyCustomTransformations(List<Transformation> list, Bitmap bitmap) {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            final Transformation transformation = list.get(i10);
            try {
                Bitmap transform = transformation.transform(bitmap);
                if (transform == null) {
                    final StringBuilder k10 = a.k("Transformation ");
                    k10.append(transformation.key());
                    k10.append(" returned null after ");
                    k10.append(i10);
                    k10.append(" previous transformation(s).\n\nTransformation list:\n");
                    for (Transformation transformation2 : list) {
                        k10.append(transformation2.key());
                        k10.append('\n');
                    }
                    Picasso.HANDLER.post(new Runnable() { // from class: com.squareup.picasso.BitmapHunter.4
                        @Override // java.lang.Runnable
                        public void run() {
                            throw new NullPointerException(k10.toString());
                        }
                    });
                    return null;
                } else if (transform == bitmap && bitmap.isRecycled()) {
                    Picasso.HANDLER.post(new Runnable() { // from class: com.squareup.picasso.BitmapHunter.5
                        @Override // java.lang.Runnable
                        public void run() {
                            throw new IllegalStateException("Transformation " + Transformation.this.key() + " returned input Bitmap but recycled it.");
                        }
                    });
                    return null;
                } else if (transform != bitmap && !bitmap.isRecycled()) {
                    Picasso.HANDLER.post(new Runnable() { // from class: com.squareup.picasso.BitmapHunter.6
                        @Override // java.lang.Runnable
                        public void run() {
                            throw new IllegalStateException("Transformation " + Transformation.this.key() + " mutated input Bitmap but failed to recycle the original.");
                        }
                    });
                    return null;
                } else {
                    i10++;
                    bitmap = transform;
                }
            } catch (RuntimeException e10) {
                Picasso.HANDLER.post(new Runnable() { // from class: com.squareup.picasso.BitmapHunter.3
                    @Override // java.lang.Runnable
                    public void run() {
                        throw new RuntimeException("Transformation " + Transformation.this.key() + " crashed with exception.", e10);
                    }
                });
                return null;
            }
        }
        return bitmap;
    }

    private Picasso.Priority computeNewPriority() {
        boolean z10;
        Picasso.Priority priority = Picasso.Priority.LOW;
        List<Action> list = this.actions;
        boolean z11 = true;
        if (list != null && !list.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Action action = this.action;
        if (action == null && !z10) {
            z11 = false;
        }
        if (!z11) {
            return priority;
        }
        if (action != null) {
            priority = action.getPriority();
        }
        if (z10) {
            int size = this.actions.size();
            for (int i10 = 0; i10 < size; i10++) {
                Picasso.Priority priority2 = this.actions.get(i10).getPriority();
                if (priority2.ordinal() > priority.ordinal()) {
                    priority = priority2;
                }
            }
        }
        return priority;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Bitmap decodeStream(y yVar, Request request) {
        t m10 = ge.a.m(yVar);
        boolean isWebPFile = Utils.isWebPFile(m10);
        boolean z10 = request.purgeable;
        BitmapFactory.Options createBitmapOptions = RequestHandler.createBitmapOptions(request);
        boolean requiresInSampleSize = RequestHandler.requiresInSampleSize(createBitmapOptions);
        if (!isWebPFile) {
            s sVar = new s(m10);
            if (requiresInSampleSize) {
                MarkableInputStream markableInputStream = new MarkableInputStream(sVar);
                markableInputStream.allowMarksToExpire(false);
                long savePosition = markableInputStream.savePosition(1024);
                BitmapFactory.decodeStream(markableInputStream, null, createBitmapOptions);
                RequestHandler.calculateInSampleSize(request.targetWidth, request.targetHeight, createBitmapOptions, request);
                markableInputStream.reset(savePosition);
                markableInputStream.allowMarksToExpire(true);
                sVar = markableInputStream;
            }
            Bitmap decodeStream = BitmapFactory.decodeStream(sVar, null, createBitmapOptions);
            if (decodeStream != null) {
                return decodeStream;
            }
            throw new IOException("Failed to decode stream.");
        }
        y yVar2 = m10.f19847a;
        f fVar = m10.f19848b;
        fVar.M(yVar2);
        byte[] h10 = fVar.h(fVar.f19826b);
        if (requiresInSampleSize) {
            BitmapFactory.decodeByteArray(h10, 0, h10.length, createBitmapOptions);
            RequestHandler.calculateInSampleSize(request.targetWidth, request.targetHeight, createBitmapOptions, request);
        }
        return BitmapFactory.decodeByteArray(h10, 0, h10.length, createBitmapOptions);
    }

    public static BitmapHunter forRequest(Picasso picasso, Dispatcher dispatcher, Cache cache, Stats stats, Action action) {
        Request request = action.getRequest();
        List<RequestHandler> requestHandlers = picasso.getRequestHandlers();
        int size = requestHandlers.size();
        for (int i10 = 0; i10 < size; i10++) {
            RequestHandler requestHandler = requestHandlers.get(i10);
            if (requestHandler.canHandleRequest(request)) {
                return new BitmapHunter(picasso, dispatcher, cache, stats, action, requestHandler);
            }
        }
        return new BitmapHunter(picasso, dispatcher, cache, stats, action, ERRORING_HANDLER);
    }

    public static int getExifRotation(int i10) {
        switch (i10) {
            case 3:
            case 4:
                return ShapeTypes.MATH_EQUAL;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public static int getExifTranslation(int i10) {
        if (i10 != 2 && i10 != 7 && i10 != 4 && i10 != 5) {
            return 1;
        }
        return -1;
    }

    private static boolean shouldResize(boolean z10, int i10, int i11, int i12, int i13) {
        if (z10 && ((i12 == 0 || i10 <= i12) && (i13 == 0 || i11 <= i13))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x024b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap transformResult(com.squareup.picasso.Request r26, android.graphics.Bitmap r27, int r28) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.BitmapHunter.transformResult(com.squareup.picasso.Request, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    public static void updateThreadName(Request request) {
        String name = request.getName();
        StringBuilder sb2 = NAME_BUILDER.get();
        sb2.ensureCapacity(name.length() + 8);
        sb2.replace(8, sb2.length(), name);
        Thread.currentThread().setName(sb2.toString());
    }

    public void attach(Action action) {
        boolean z10 = this.picasso.loggingEnabled;
        Request request = action.request;
        if (this.action == null) {
            this.action = action;
            if (z10) {
                List<Action> list = this.actions;
                if (list != null && !list.isEmpty()) {
                    Utils.log("Hunter", "joined", request.logId(), Utils.getLogIdsForHunter(this, "to "));
                    return;
                } else {
                    Utils.log("Hunter", "joined", request.logId(), "to empty hunter");
                    return;
                }
            }
            return;
        }
        if (this.actions == null) {
            this.actions = new ArrayList(3);
        }
        this.actions.add(action);
        if (z10) {
            Utils.log("Hunter", "joined", request.logId(), Utils.getLogIdsForHunter(this, "to "));
        }
        Picasso.Priority priority = action.getPriority();
        if (priority.ordinal() > this.priority.ordinal()) {
            this.priority = priority;
        }
    }

    public boolean cancel() {
        Future<?> future;
        if (this.action != null) {
            return false;
        }
        List<Action> list = this.actions;
        if ((list != null && !list.isEmpty()) || (future = this.future) == null || !future.cancel(false)) {
            return false;
        }
        return true;
    }

    public void detach(Action action) {
        boolean z10;
        if (this.action == action) {
            this.action = null;
            z10 = true;
        } else {
            List<Action> list = this.actions;
            if (list != null) {
                z10 = list.remove(action);
            } else {
                z10 = false;
            }
        }
        if (z10 && action.getPriority() == this.priority) {
            this.priority = computeNewPriority();
        }
        if (this.picasso.loggingEnabled) {
            Utils.log("Hunter", "removed", action.request.logId(), Utils.getLogIdsForHunter(this, "from "));
        }
    }

    public Action getAction() {
        return this.action;
    }

    public List<Action> getActions() {
        return this.actions;
    }

    public Request getData() {
        return this.data;
    }

    public Exception getException() {
        return this.exception;
    }

    public String getKey() {
        return this.key;
    }

    public Picasso.LoadedFrom getLoadedFrom() {
        return this.loadedFrom;
    }

    public int getMemoryPolicy() {
        return this.memoryPolicy;
    }

    public Picasso getPicasso() {
        return this.picasso;
    }

    public Picasso.Priority getPriority() {
        return this.priority;
    }

    public Bitmap getResult() {
        return this.result;
    }

    public Bitmap hunt() {
        Bitmap bitmap;
        int i10;
        if (MemoryPolicy.shouldReadFromMemoryCache(this.memoryPolicy)) {
            bitmap = this.cache.get(this.key);
            if (bitmap != null) {
                this.stats.dispatchCacheHit();
                this.loadedFrom = Picasso.LoadedFrom.MEMORY;
                if (this.picasso.loggingEnabled) {
                    Utils.log("Hunter", "decoded", this.data.logId(), "from cache");
                }
                return bitmap;
            }
        } else {
            bitmap = null;
        }
        if (this.retryCount == 0) {
            i10 = NetworkPolicy.OFFLINE.index;
        } else {
            i10 = this.networkPolicy;
        }
        this.networkPolicy = i10;
        RequestHandler.Result load = this.requestHandler.load(this.data, i10);
        if (load != null) {
            this.loadedFrom = load.getLoadedFrom();
            this.exifOrientation = load.getExifOrientation();
            bitmap = load.getBitmap();
            if (bitmap == null) {
                y source = load.getSource();
                try {
                    bitmap = decodeStream(source, this.data);
                } finally {
                    try {
                        source.close();
                    } catch (IOException unused) {
                    }
                }
            }
        }
        if (bitmap != null) {
            if (this.picasso.loggingEnabled) {
                Utils.log("Hunter", "decoded", this.data.logId());
            }
            this.stats.dispatchBitmapDecoded(bitmap);
            if (this.data.needsTransformation() || this.exifOrientation != 0) {
                synchronized (DECODE_LOCK) {
                    if (this.data.needsMatrixTransform() || this.exifOrientation != 0) {
                        bitmap = transformResult(this.data, bitmap, this.exifOrientation);
                        if (this.picasso.loggingEnabled) {
                            Utils.log("Hunter", "transformed", this.data.logId());
                        }
                    }
                    if (this.data.hasCustomTransformations()) {
                        bitmap = applyCustomTransformations(this.data.transformations, bitmap);
                        if (this.picasso.loggingEnabled) {
                            Utils.log("Hunter", "transformed", this.data.logId(), "from custom transformations");
                        }
                    }
                }
                if (bitmap != null) {
                    this.stats.dispatchBitmapTransformed(bitmap);
                }
            }
        }
        return bitmap;
    }

    public boolean isCancelled() {
        Future<?> future = this.future;
        if (future != null && future.isCancelled()) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                try {
                    updateThreadName(this.data);
                    if (this.picasso.loggingEnabled) {
                        Utils.log("Hunter", "executing", Utils.getLogIdsForHunter(this));
                    }
                    Bitmap hunt = hunt();
                    this.result = hunt;
                    if (hunt == null) {
                        this.dispatcher.dispatchFailed(this);
                    } else {
                        this.dispatcher.dispatchComplete(this);
                    }
                } catch (NetworkRequestHandler.ResponseException e10) {
                    if (!NetworkPolicy.isOfflineOnly(e10.networkPolicy) || e10.code != 504) {
                        this.exception = e10;
                    }
                    this.dispatcher.dispatchFailed(this);
                } catch (IOException e11) {
                    this.exception = e11;
                    this.dispatcher.dispatchRetry(this);
                }
            } catch (Exception e12) {
                this.exception = e12;
                this.dispatcher.dispatchFailed(this);
            } catch (OutOfMemoryError e13) {
                StringWriter stringWriter = new StringWriter();
                this.stats.createSnapshot().dump(new PrintWriter(stringWriter));
                this.exception = new RuntimeException(stringWriter.toString(), e13);
                this.dispatcher.dispatchFailed(this);
            }
        } finally {
            Thread.currentThread().setName("Picasso-Idle");
        }
    }

    public boolean shouldRetry(boolean z10, NetworkInfo networkInfo) {
        boolean z11;
        int i10 = this.retryCount;
        if (i10 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return false;
        }
        this.retryCount = i10 - 1;
        return this.requestHandler.shouldRetry(z10, networkInfo);
    }

    public boolean supportsReplay() {
        return this.requestHandler.supportsReplay();
    }
}
