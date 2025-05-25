package sa;

import t5.f;

/* compiled from: DataTransportCrashlyticsReportSender.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final pa.a f29755b = new pa.a();
    public static final String c = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: d  reason: collision with root package name */
    public static final String f29756d = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: e  reason: collision with root package name */
    public static final f f29757e = new f(10);

    /* renamed from: a  reason: collision with root package name */
    public final c f29758a;

    public a(c cVar) {
        this.f29758a = cVar;
    }

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
            for (int i10 = 0; i10 < str.length(); i10++) {
                sb2.append(str.charAt(i10));
                if (str2.length() > i10) {
                    sb2.append(str2.charAt(i10));
                }
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }
}
