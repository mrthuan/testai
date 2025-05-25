package net.lingala.zip4j.progress;

/* loaded from: classes3.dex */
public final class ProgressMonitor {

    /* renamed from: b  reason: collision with root package name */
    public long f22454b;
    public long c;

    /* renamed from: d  reason: collision with root package name */
    public int f22455d;

    /* renamed from: f  reason: collision with root package name */
    public Result f22457f;

    /* renamed from: g  reason: collision with root package name */
    public Exception f22458g;

    /* renamed from: e  reason: collision with root package name */
    public Task f22456e = Task.NONE;

    /* renamed from: a  reason: collision with root package name */
    public State f22453a = State.READY;

    /* loaded from: classes3.dex */
    public enum Result {
        SUCCESS,
        WORK_IN_PROGRESS,
        ERROR,
        CANCELLED
    }

    /* loaded from: classes3.dex */
    public enum State {
        READY,
        BUSY
    }

    /* loaded from: classes3.dex */
    public enum Task {
        NONE,
        ADD_ENTRY,
        REMOVE_ENTRY,
        CALCULATE_CRC,
        EXTRACT_ENTRY,
        MERGE_ZIP_FILES,
        SET_COMMENT,
        RENAME_FILE
    }

    public final Task a() {
        return this.f22456e;
    }

    public final Exception b() {
        return this.f22458g;
    }

    public final int c() {
        return this.f22455d;
    }

    public final Result d() {
        return this.f22457f;
    }

    public final State e() {
        return this.f22453a;
    }

    public final void f(long j10) {
        long j11 = this.c + j10;
        this.c = j11;
        long j12 = this.f22454b;
        if (j12 > 0) {
            int i10 = (int) ((j11 * 100) / j12);
            this.f22455d = i10;
            if (i10 > 100) {
                this.f22455d = 100;
            }
        }
    }
}
