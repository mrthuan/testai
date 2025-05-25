package com.bumptech.glide.request;

import l4.b;

/* loaded from: classes.dex */
public interface RequestCoordinator {

    /* loaded from: classes.dex */
    public enum RequestState {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);
        
        private final boolean isComplete;

        RequestState(boolean z10) {
            this.isComplete = z10;
        }

        public boolean isComplete() {
            return this.isComplete;
        }
    }

    boolean a();

    RequestCoordinator b();

    void d(b bVar);

    boolean e(b bVar);

    boolean f(b bVar);

    boolean i(b bVar);

    void k(b bVar);
}
