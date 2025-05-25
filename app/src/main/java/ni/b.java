package ni;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import java.text.DateFormatSymbols;
import java.util.Locale;

/* compiled from: DateTimeFormatSymbols.java */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String[] f22492a = {"", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    /* renamed from: b  reason: collision with root package name */
    public final String[] f22493b = {"", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
    public final String[] c = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", ""};

    /* renamed from: d  reason: collision with root package name */
    public final String[] f22494d = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Dec", ""};

    /* renamed from: e  reason: collision with root package name */
    public final String[] f22495e = {OperatorName.SET_LINE_CAPSTYLE, "F", OperatorName.SET_LINE_MITERLIMIT, "A", OperatorName.SET_LINE_MITERLIMIT, OperatorName.SET_LINE_CAPSTYLE, OperatorName.SET_LINE_CAPSTYLE, "A", "S", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, "N", "D"};

    /* renamed from: f  reason: collision with root package name */
    public final DateFormatSymbols f22496f;

    public b(Locale locale) {
        this.f22496f = new DateFormatSymbols(locale);
    }
}
