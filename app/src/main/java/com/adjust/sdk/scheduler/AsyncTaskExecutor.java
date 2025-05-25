package com.adjust.sdk.scheduler;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public abstract class AsyncTaskExecutor<Params, Result> {

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object[] f5914a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Handler f5915b;

        /* renamed from: com.adjust.sdk.scheduler.AsyncTaskExecutor$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0045a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Object f5916a;

            public RunnableC0045a(Object obj) {
                this.f5916a = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                AsyncTaskExecutor.this.onPostExecute(this.f5916a);
            }
        }

        public a(Object[] objArr, Handler handler) {
            this.f5914a = objArr;
            this.f5915b = handler;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            this.f5915b.post(new RunnableC0045a(AsyncTaskExecutor.this.doInBackground(this.f5914a)));
        }
    }

    public abstract Result doInBackground(Params[] paramsArr);

    @SafeVarargs
    public final AsyncTaskExecutor<Params, Result> execute(Params... paramsArr) {
        onPreExecute();
        Executors.newSingleThreadExecutor().execute(new a(paramsArr, new Handler(Looper.getMainLooper())));
        return this;
    }

    public void onPreExecute() {
    }

    public void onPostExecute(Result result) {
    }
}
