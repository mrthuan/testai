package pdf.pdfreader.viewer.editor.free.feature.app_widget.helper;

/* compiled from: TryPinAppWidgetUseCase.kt */
/* loaded from: classes3.dex */
public interface c {

    /* compiled from: TryPinAppWidgetUseCase.kt */
    /* loaded from: classes3.dex */
    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final String f24809a;

        /* renamed from: b  reason: collision with root package name */
        public final Throwable f24810b;

        public a(String str, Throwable th2) {
            kotlin.jvm.internal.g.e(str, ea.a.p("XmU4cxJnZQ==", "2sEJu0Na"));
            this.f24809a = str;
            this.f24810b = th2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (kotlin.jvm.internal.g.a(this.f24809a, aVar.f24809a) && kotlin.jvm.internal.g.a(this.f24810b, aVar.f24810b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = this.f24809a.hashCode() * 31;
            Throwable th2 = this.f24810b;
            if (th2 == null) {
                hashCode = 0;
            } else {
                hashCode = th2.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public final String toString() {
            return "Failed(message=" + this.f24809a + ", cause=" + this.f24810b + ")";
        }
    }

    /* compiled from: TryPinAppWidgetUseCase.kt */
    /* loaded from: classes3.dex */
    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public final int f24811a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f24812b;

        public b() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && this.f24811a == ((b) obj).f24811a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f24811a;
        }

        public final String toString() {
            return a6.h.g(new StringBuilder("Success(appWidgetId="), this.f24811a, ")");
        }

        public b(int i10) {
            this.f24811a = i10;
            this.f24812b = i10 != 0;
        }
    }
}
