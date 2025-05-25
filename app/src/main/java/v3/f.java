package v3;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* compiled from: DiskCacheStrategy.java */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final b f30509a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f30510b;
    public static final e c;

    /* compiled from: DiskCacheStrategy.java */
    /* loaded from: classes.dex */
    public class a extends f {
        @Override // v3.f
        public final boolean a() {
            return true;
        }

        @Override // v3.f
        public final boolean b() {
            return true;
        }

        @Override // v3.f
        public final boolean c(DataSource dataSource) {
            if (dataSource == DataSource.REMOTE) {
                return true;
            }
            return false;
        }

        @Override // v3.f
        public final boolean d(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy) {
            if (dataSource != DataSource.RESOURCE_DISK_CACHE && dataSource != DataSource.MEMORY_CACHE) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* loaded from: classes.dex */
    public class b extends f {
        @Override // v3.f
        public final boolean a() {
            return false;
        }

        @Override // v3.f
        public final boolean b() {
            return false;
        }

        @Override // v3.f
        public final boolean c(DataSource dataSource) {
            return false;
        }

        @Override // v3.f
        public final boolean d(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* loaded from: classes.dex */
    public class c extends f {
        @Override // v3.f
        public final boolean a() {
            return true;
        }

        @Override // v3.f
        public final boolean b() {
            return false;
        }

        @Override // v3.f
        public final boolean c(DataSource dataSource) {
            if (dataSource != DataSource.DATA_DISK_CACHE && dataSource != DataSource.MEMORY_CACHE) {
                return true;
            }
            return false;
        }

        @Override // v3.f
        public final boolean d(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* loaded from: classes.dex */
    public class d extends f {
        @Override // v3.f
        public final boolean a() {
            return false;
        }

        @Override // v3.f
        public final boolean b() {
            return true;
        }

        @Override // v3.f
        public final boolean c(DataSource dataSource) {
            return false;
        }

        @Override // v3.f
        public final boolean d(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy) {
            if (dataSource != DataSource.RESOURCE_DISK_CACHE && dataSource != DataSource.MEMORY_CACHE) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* loaded from: classes.dex */
    public class e extends f {
        @Override // v3.f
        public final boolean a() {
            return true;
        }

        @Override // v3.f
        public final boolean b() {
            return true;
        }

        @Override // v3.f
        public final boolean c(DataSource dataSource) {
            if (dataSource == DataSource.REMOTE) {
                return true;
            }
            return false;
        }

        @Override // v3.f
        public final boolean d(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy) {
            if (((z10 && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategy == EncodeStrategy.TRANSFORMED) {
                return true;
            }
            return false;
        }
    }

    static {
        new a();
        f30509a = new b();
        f30510b = new c();
        new d();
        c = new e();
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(DataSource dataSource);

    public abstract boolean d(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy);
}
