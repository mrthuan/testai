package androidx.media;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.media.o;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public abstract class MediaBrowserServiceCompat extends Service {

    /* renamed from: a  reason: collision with root package name */
    public e f4099a;

    /* renamed from: b  reason: collision with root package name */
    public final y.b<IBinder, b> f4100b = new y.b<>();
    public final k c = new k(this);

    /* loaded from: classes.dex */
    public static final class a {
    }

    /* loaded from: classes.dex */
    public class b implements IBinder.DeathRecipient {

        /* renamed from: a  reason: collision with root package name */
        public final String f4101a;

        /* renamed from: b  reason: collision with root package name */
        public final i f4102b;
        public final HashMap<String, List<w0.c<IBinder, Bundle>>> c = new HashMap<>();

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                MediaBrowserServiceCompat.this.f4100b.remove(((j) bVar.f4102b).a());
            }
        }

        public b(String str, int i10, int i11, i iVar) {
            this.f4101a = str;
            if (Build.VERSION.SDK_INT >= 28) {
                p.c(str, i10, i11);
            }
            this.f4102b = iVar;
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            MediaBrowserServiceCompat.this.c.post(new a());
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void onCreate();
    }

    /* loaded from: classes.dex */
    public class d implements c, l {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f4105a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public androidx.media.j f4106b;
        public Messenger c;

        public d() {
        }

        @Override // androidx.media.l
        public final void b(String str, androidx.media.k<List<Parcel>> kVar) {
            MediaBrowserServiceCompat.this.b();
        }

        @Override // androidx.media.l
        public final void c(String str, int i10, Bundle bundle) {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            if (bundle != null && bundle.getInt("extra_client_version", 0) != 0) {
                bundle.remove("extra_client_version");
                this.c = new Messenger(mediaBrowserServiceCompat.c);
                Bundle bundle2 = new Bundle();
                bundle2.putInt("extra_service_version", 2);
                k0.i.b(bundle2, "extra_messenger", this.c.getBinder());
                this.f4105a.add(bundle2);
            }
            new HashMap();
            if (Build.VERSION.SDK_INT >= 28) {
                p.c(str, -1, i10);
            }
            mediaBrowserServiceCompat.getClass();
            mediaBrowserServiceCompat.a();
        }
    }

    /* loaded from: classes.dex */
    public class e extends d implements n {
        public e() {
            super();
        }

        @Override // androidx.media.n
        public final void d(androidx.media.k kVar) {
            MediaBrowserServiceCompat.this.getClass();
            kVar.a(null);
        }

        @Override // androidx.media.MediaBrowserServiceCompat.c
        public void onCreate() {
            m mVar = new m(MediaBrowserServiceCompat.this, this);
            this.f4106b = mVar;
            mVar.onCreate();
        }
    }

    /* loaded from: classes.dex */
    public class f extends e implements o.c {
        public f() {
            super();
        }

        @Override // androidx.media.o.c
        public final void a(String str, o.b bVar) {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.getClass();
            mediaBrowserServiceCompat.b();
        }

        @Override // androidx.media.MediaBrowserServiceCompat.e, androidx.media.MediaBrowserServiceCompat.c
        public final void onCreate() {
            int i10 = o.f4141a;
            o.a aVar = new o.a(MediaBrowserServiceCompat.this, this);
            this.f4106b = aVar;
            aVar.onCreate();
        }
    }

    /* loaded from: classes.dex */
    public class g extends f {
    }

    /* loaded from: classes.dex */
    public class h {
        public h() {
        }
    }

    /* loaded from: classes.dex */
    public interface i {
    }

    /* loaded from: classes.dex */
    public static class j implements i {

        /* renamed from: a  reason: collision with root package name */
        public final Messenger f4111a;

        public j(Messenger messenger) {
            this.f4111a = messenger;
        }

        public final IBinder a() {
            return this.f4111a.getBinder();
        }
    }

    /* loaded from: classes.dex */
    public final class k extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final h f4112a;

        public k(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            this.f4112a = new h();
        }

        public final void a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Bundle data = message.getData();
            int i10 = message.what;
            h hVar = this.f4112a;
            switch (i10) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.a(bundle);
                    String string = data.getString("data_package_name");
                    int i11 = data.getInt("data_calling_pid");
                    int i12 = data.getInt("data_calling_uid");
                    j jVar = new j(message.replyTo);
                    MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                    boolean z10 = false;
                    if (string == null) {
                        mediaBrowserServiceCompat.getClass();
                    } else {
                        String[] packagesForUid = mediaBrowserServiceCompat.getPackageManager().getPackagesForUid(i12);
                        int length = packagesForUid.length;
                        int i13 = 0;
                        while (true) {
                            if (i13 < length) {
                                if (packagesForUid[i13].equals(string)) {
                                    z10 = true;
                                } else {
                                    i13++;
                                }
                            }
                        }
                    }
                    if (z10) {
                        mediaBrowserServiceCompat.c.a(new androidx.media.a(hVar, jVar, string, i11, i12, bundle));
                        return;
                    }
                    throw new IllegalArgumentException("Package/uid mismatch: uid=" + i12 + " package=" + string);
                case 2:
                    MediaBrowserServiceCompat.this.c.a(new androidx.media.b(hVar, new j(message.replyTo)));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.a(bundle2);
                    MediaBrowserServiceCompat.this.c.a(new androidx.media.c(hVar, new j(message.replyTo), data.getString("data_media_item_id"), k0.i.a(data, "data_callback_token"), bundle2));
                    return;
                case 4:
                    MediaBrowserServiceCompat.this.c.a(new androidx.media.d(hVar, new j(message.replyTo), data.getString("data_media_item_id"), k0.i.a(data, "data_callback_token")));
                    return;
                case 5:
                    String string2 = data.getString("data_media_item_id");
                    h.b bVar = (h.b) data.getParcelable("data_result_receiver");
                    j jVar2 = new j(message.replyTo);
                    hVar.getClass();
                    if (!TextUtils.isEmpty(string2) && bVar != null) {
                        MediaBrowserServiceCompat.this.c.a(new androidx.media.e(hVar, jVar2, string2, bVar));
                        return;
                    }
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.a(bundle3);
                    MediaBrowserServiceCompat.this.c.a(new androidx.media.f(hVar, new j(message.replyTo), data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3));
                    return;
                case 7:
                    MediaBrowserServiceCompat.this.c.a(new androidx.media.g(hVar, new j(message.replyTo)));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.a(bundle4);
                    String string3 = data.getString("data_search_query");
                    h.b bVar2 = (h.b) data.getParcelable("data_result_receiver");
                    j jVar3 = new j(message.replyTo);
                    hVar.getClass();
                    if (!TextUtils.isEmpty(string3) && bVar2 != null) {
                        MediaBrowserServiceCompat.this.c.a(new androidx.media.h(hVar, jVar3, string3, bundle4, bVar2));
                        return;
                    }
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.a(bundle5);
                    String string4 = data.getString("data_custom_action");
                    h.b bVar3 = (h.b) data.getParcelable("data_result_receiver");
                    j jVar4 = new j(message.replyTo);
                    hVar.getClass();
                    if (!TextUtils.isEmpty(string4) && bVar3 != null) {
                        MediaBrowserServiceCompat.this.c.a(new androidx.media.i(hVar, jVar4, string4, bundle5, bVar3));
                        return;
                    }
                    return;
                default:
                    message.toString();
                    return;
            }
        }

        @Override // android.os.Handler
        public final boolean sendMessageAtTime(Message message, long j10) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            data.putInt("data_calling_pid", Binder.getCallingPid());
            return super.sendMessageAtTime(message, j10);
        }
    }

    static {
        Log.isLoggable("MBServiceCompat", 3);
    }

    public abstract a a();

    public abstract void b();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f4099a.f4106b.onBind(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            this.f4099a = new g();
        } else if (i10 >= 26) {
            this.f4099a = new f();
        } else {
            this.f4099a = new e();
        }
        this.f4099a.onCreate();
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
