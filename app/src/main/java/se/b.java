package se;

import android.content.Context;
import industries.deepthought.core.service.DownloadService;

/* compiled from: DownloadService.java */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f29795a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ DownloadService f29796b;

    public b(DownloadService downloadService, Context context) {
        this.f29796b = downloadService;
        this.f29795a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f29795a;
        DownloadService downloadService = this.f29796b;
        try {
            try {
                DownloadService.a(downloadService, context);
                DownloadService.b(downloadService, context);
                DownloadService.c(downloadService, context);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } finally {
            downloadService.f18570a.sendEmptyMessage(0);
        }
    }
}
