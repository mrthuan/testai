package com.squareup.picasso;

/* loaded from: classes2.dex */
public interface Callback {
    void onError(Exception exc);

    void onSuccess();

    /* loaded from: classes2.dex */
    public static class EmptyCallback implements Callback {
        @Override // com.squareup.picasso.Callback
        public void onSuccess() {
        }

        @Override // com.squareup.picasso.Callback
        public void onError(Exception exc) {
        }
    }
}
