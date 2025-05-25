package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    public DuplicateTaskCompletionException(String str, Exception exc) {
        super(str, exc);
    }

    public static IllegalStateException of(Task<?> task) {
        String str;
        if (!task.n()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception j10 = task.j();
        if (j10 != null) {
            str = "failure";
        } else if (task.o()) {
            str = "result ".concat(String.valueOf(task.k()));
        } else if (task.m()) {
            str = "cancellation";
        } else {
            str = "unknown issue";
        }
        return new DuplicateTaskCompletionException("Complete with: ".concat(str), j10);
    }
}
