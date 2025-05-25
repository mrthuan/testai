package ni;

import com.adjust.sdk.Constants;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: DateTimeFormat.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final GregorianCalendar f22488a;

    /* renamed from: b  reason: collision with root package name */
    public final NumberFormat f22489b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final b f22490d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f22491e;

    public a(String str) {
        boolean z10;
        boolean z11;
        Locale locale = Locale.US;
        this.f22491e = false;
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        this.f22489b = numberFormat;
        numberFormat.setParseIntegerOnly(true);
        numberFormat.setGroupingUsed(false);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(locale);
        this.f22488a = gregorianCalendar;
        gregorianCalendar.add(1, -80);
        if (str.contains("AM/PM") || str.contains("上午/下午")) {
            str = str.replace("AM/PM", "").replace("上午/下午", "");
            this.f22491e = true;
        }
        str.replace("AM", "");
        String replace = str.replace("PM", "");
        int i10 = 0;
        while (true) {
            if (i10 < 12) {
                if (replace.indexOf("GyMdEDFwWazZ".charAt(i10)) > -1) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                z10 = false;
                break;
            }
        }
        int i11 = 0;
        while (true) {
            if (i11 < 6) {
                if (str.indexOf("HhsSkK".charAt(i11)) > -1) {
                    z11 = true;
                    break;
                }
                i11++;
            } else {
                z11 = false;
                break;
            }
        }
        if (z11 && z10) {
            int indexOf = str.indexOf("mmm");
            while (indexOf > -1) {
                char[] charArray = str.toCharArray();
                int i12 = indexOf + 3;
                while (str.charAt(i12) == 'm') {
                    i12++;
                }
                while (indexOf < i12) {
                    charArray[indexOf] = 'M';
                    indexOf++;
                }
                str = String.valueOf(charArray);
                indexOf = str.indexOf("mmm");
            }
            str.toCharArray();
            new ArrayList();
            str.indexOf(109);
        } else if (z10) {
            str = str.replace('m', 'M');
        } else if (!this.f22491e) {
            str = str.replace('h', 'k');
        }
        int length = str.length();
        int i13 = 0;
        boolean z12 = false;
        char c = 65535;
        for (int i14 = 0; i14 < length; i14++) {
            char charAt = str.charAt(i14);
            if (charAt == '\'') {
                if (i13 > 0) {
                    d(c);
                    i13 = 0;
                }
                if (c == charAt) {
                    c = 65535;
                } else {
                    c = charAt;
                }
                z12 = !z12;
            } else if (!z12 && (c == charAt || ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')))) {
                if (c == charAt) {
                    i13++;
                } else {
                    if (i13 > 0) {
                        d(c);
                    }
                    i13 = 1;
                    c = charAt;
                }
            } else {
                if (i13 > 0) {
                    d(c);
                    i13 = 0;
                }
                c = 65535;
            }
        }
        if (i13 > 0) {
            d(c);
        }
        if (!z12) {
            this.c = str;
            this.f22490d = new b(locale);
            return;
        }
        throw new IllegalArgumentException("invalidate pattern");
    }

    public static void d(char c) {
        if ("GyMdkHmsSEDFwWahKzZ".indexOf(c) != -1) {
            return;
        }
        throw new IllegalArgumentException("invalidate char");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(StringBuffer stringBuffer, char c, int i10) {
        int i11;
        int i12;
        int i13;
        boolean z10;
        char c10;
        int indexOf = "GyMdkHmsSEDFwWahKzZ".indexOf(c);
        if (indexOf != -1) {
            GregorianCalendar gregorianCalendar = this.f22488a;
            int i14 = 1;
            int i15 = 3;
            b bVar = this.f22490d;
            switch (indexOf) {
                case 0:
                    stringBuffer.append(bVar.f22496f.getEras()[gregorianCalendar.get(0)]);
                    i11 = -1;
                    i15 = -1;
                    break;
                case 1:
                    int i16 = gregorianCalendar.get(1);
                    if (i10 == 2) {
                        b(stringBuffer, 2, i16 % 100);
                    } else {
                        b(stringBuffer, i10, i16);
                    }
                    i11 = -1;
                    i15 = -1;
                    break;
                case 2:
                    int i17 = gregorianCalendar.get(2);
                    if (i10 <= 2) {
                        b(stringBuffer, i10, i17 + 1);
                    } else if (i10 == 3) {
                        stringBuffer.append(bVar.f22496f.getShortMonths()[i17]);
                    } else {
                        stringBuffer.append(bVar.f22496f.getMonths()[i17]);
                    }
                    i11 = -1;
                    i15 = -1;
                    break;
                case 3:
                    int i18 = gregorianCalendar.get(7);
                    String[] strArr = bVar.f22493b;
                    if (i18 < strArr.length) {
                        if (i10 == 3) {
                            stringBuffer.append(strArr[i18]);
                        } else if (i10 > 3) {
                            stringBuffer.append(bVar.f22492a[i18]);
                        } else {
                            i15 = 5;
                            i11 = -1;
                            break;
                        }
                    }
                    i11 = -1;
                    i15 = -1;
                    break;
                case 4:
                    int i19 = gregorianCalendar.get(11);
                    if (i19 == 0) {
                        i19 = 24;
                    }
                    b(stringBuffer, i10, i19);
                    i11 = -1;
                    i15 = -1;
                    break;
                case 5:
                    if (this.f22491e) {
                        int i20 = gregorianCalendar.get(10);
                        if (i20 == 0) {
                            i12 = 12;
                        } else {
                            i12 = i20;
                        }
                        b(stringBuffer, i10, i12);
                    } else {
                        b(stringBuffer, i10, gregorianCalendar.get(11));
                    }
                    i11 = -1;
                    i15 = -1;
                    break;
                case 6:
                    if (i10 != 3 && i10 <= 5) {
                        if (i10 == 4) {
                            stringBuffer.append(bVar.c[gregorianCalendar.get(2)]);
                        } else if (i10 == 5) {
                            stringBuffer.append(bVar.f22495e[gregorianCalendar.get(2)]);
                        } else {
                            i11 = -1;
                            i15 = 12;
                            break;
                        }
                    } else {
                        stringBuffer.append(bVar.f22494d[gregorianCalendar.get(2)]);
                    }
                    i11 = -1;
                    i15 = -1;
                    break;
                case 7:
                    i15 = 13;
                    i11 = -1;
                    break;
                case 8:
                    b(stringBuffer, i10, gregorianCalendar.get(14));
                    i11 = -1;
                    i15 = -1;
                    break;
                case 9:
                default:
                    i11 = -1;
                    i15 = -1;
                    break;
                case 10:
                    i15 = 6;
                    i11 = -1;
                    break;
                case 11:
                    i15 = 8;
                    i11 = -1;
                    break;
                case 12:
                    i11 = -1;
                    break;
                case 13:
                    i15 = 4;
                    i11 = -1;
                    break;
                case 14:
                    int i21 = gregorianCalendar.get(7);
                    if (i10 == 3) {
                        stringBuffer.append(bVar.f22496f.getShortWeekdays()[i21]);
                    } else if (i10 > 3) {
                        stringBuffer.append(bVar.f22496f.getWeekdays()[i21]);
                    }
                    i11 = -1;
                    i15 = -1;
                    break;
                case 15:
                    if (this.f22491e) {
                        int i22 = gregorianCalendar.get(10);
                        if (i22 == 0) {
                            i13 = 12;
                        } else {
                            i13 = i22;
                        }
                        b(stringBuffer, i10, i13);
                    } else {
                        b(stringBuffer, i10, gregorianCalendar.get(11));
                    }
                    i11 = -1;
                    i15 = -1;
                    break;
                case 16:
                    i15 = 10;
                    i11 = -1;
                    break;
                case 17:
                    TimeZone timeZone = gregorianCalendar.getTimeZone();
                    if (gregorianCalendar.get(16) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i10 < 4) {
                        i14 = 0;
                    }
                    stringBuffer.append(timeZone.getDisplayName(z10, i14, Locale.US));
                    i11 = -1;
                    i15 = -1;
                    break;
                case 18:
                    int i23 = gregorianCalendar.get(16) + gregorianCalendar.get(15);
                    if (i23 < 0) {
                        i23 = -i23;
                        c10 = '-';
                    } else {
                        c10 = '+';
                    }
                    stringBuffer.append(c10);
                    b(stringBuffer, 2, i23 / Constants.ONE_HOUR);
                    b(stringBuffer, 2, (i23 % Constants.ONE_HOUR) / 60000);
                    i11 = -1;
                    i15 = -1;
                    break;
            }
            if (i15 != i11) {
                b(stringBuffer, i10, gregorianCalendar.get(i15));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalidate char");
    }

    public final void b(StringBuffer stringBuffer, int i10, int i11) {
        NumberFormat numberFormat = this.f22489b;
        int minimumIntegerDigits = numberFormat.getMinimumIntegerDigits();
        numberFormat.setMinimumIntegerDigits(i10);
        numberFormat.format(Integer.valueOf(i11), stringBuffer, new FieldPosition(0));
        numberFormat.setMinimumIntegerDigits(minimumIntegerDigits);
    }

    public final String c(Date date) {
        StringBuffer stringBuffer = new StringBuffer();
        GregorianCalendar gregorianCalendar = this.f22488a;
        gregorianCalendar.setTime(date);
        String str = this.c;
        int length = str.length();
        int i10 = 0;
        boolean z10 = false;
        char c = 65535;
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt == '\'') {
                if (i10 > 0) {
                    a(stringBuffer, c, i10);
                    i10 = 0;
                }
                if (c == charAt) {
                    stringBuffer.append('\'');
                    c = 65535;
                } else {
                    c = charAt;
                }
                z10 = !z10;
            } else if (!z10 && (c == charAt || ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')))) {
                if (c == charAt) {
                    i10++;
                } else {
                    if (i10 > 0) {
                        a(stringBuffer, c, i10);
                    }
                    i10 = 1;
                    c = charAt;
                }
            } else {
                if (i10 > 0) {
                    a(stringBuffer, c, i10);
                    i10 = 0;
                }
                stringBuffer.append(charAt);
                c = 65535;
            }
        }
        if (i10 > 0) {
            a(stringBuffer, c, i10);
        }
        if (this.f22491e) {
            stringBuffer.append(this.f22490d.f22496f.getAmPmStrings()[gregorianCalendar.get(9)]);
        }
        return stringBuffer.toString();
    }
}
