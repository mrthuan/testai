package pdf.pdfreader.viewer.editor.free.scan.group.enumerate;

import java.util.ArrayList;

/* compiled from: GroupAiFilterType.kt */
/* loaded from: classes3.dex */
public enum GroupAiFilterType {
    AUTO,
    RAW,
    CUSTOM1,
    CUSTOM2,
    CUSTOM_BW1,
    CUSTOM_BW2,
    CONTRAST,
    REVERSE_COLOR,
    GRAYSCALE,
    BLEND_ALPHA,
    SUPER_DOCS,
    SUPER_IMAGE;
    
    public static final a Companion = new a();

    /* compiled from: GroupAiFilterType.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static ArrayList a() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(GroupAiFilterType.AUTO);
            arrayList.add(GroupAiFilterType.RAW);
            arrayList.add(GroupAiFilterType.SUPER_DOCS);
            arrayList.add(GroupAiFilterType.CUSTOM2);
            arrayList.add(GroupAiFilterType.SUPER_IMAGE);
            arrayList.add(GroupAiFilterType.BLEND_ALPHA);
            arrayList.add(GroupAiFilterType.CONTRAST);
            arrayList.add(GroupAiFilterType.CUSTOM_BW1);
            arrayList.add(GroupAiFilterType.CUSTOM_BW2);
            arrayList.add(GroupAiFilterType.GRAYSCALE);
            arrayList.add(GroupAiFilterType.REVERSE_COLOR);
            return arrayList;
        }
    }
}
