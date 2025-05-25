package io.flutter.embedding.android;

import android.util.LongSparseArray;
import android.view.MotionEvent;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: MotionEventTracker.java */
/* loaded from: classes.dex */
public final class g {
    public static g c;

    /* renamed from: a  reason: collision with root package name */
    public final LongSparseArray<MotionEvent> f18632a = new LongSparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    public final PriorityQueue<Long> f18633b = new PriorityQueue<>();

    /* compiled from: MotionEventTracker.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: b  reason: collision with root package name */
        public static final AtomicLong f18634b = new AtomicLong(0);

        /* renamed from: a  reason: collision with root package name */
        public final long f18635a;

        public a(long j10) {
            this.f18635a = j10;
        }
    }
}
